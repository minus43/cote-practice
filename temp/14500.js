// const input = require('fs').readFileSync(0).toString().trim().split('\n');

const input = require('fs')
  .readFileSync('./input.txt')
  .toString()
  .trim()
  .split('\n');

const [n, m] = input[0]
  .trim()
  .split(' ')
  .map((number) => Number(number));

let paper = [];
for (let i = 0; i < n; i++) {
  paper.push(
    input[i + 1]
      .trim()
      .split(' ')
      .map((number) => Number(number))
  );
}

let maxSum = 0;
const visited = Array.from({ length: n }, () => Array(m).fill(false));

const point = [
  [1, 0],
  [-1, 0],
  [0, 1],
  [0, -1],
];

// DFS로 4칸 이동
function dfs(x, y, depth, sum) {
  if (depth === 4) {
    maxSum = Math.max(maxSum, sum);
    return;
  }
  
  for (const [dx, dy] of point) {
    const nx = x + dx;
    const ny = y + dy;
    
    if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
      visited[nx][ny] = true;
      dfs(nx, ny, depth + 1, sum + paper[nx][ny]);
      visited[nx][ny] = false;
    }
  }
}

// 'ㅗ' 모양 별도 처리
function checkSpecial(x, y) {
  let wing = [];
  for (const [dx, dy] of point) {
    const nx = x + dx;
    const ny = y + dy;
    
    if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
      wing.push(paper[nx][ny]);
    }
  }
  
  if (wing.length >= 3) {
    // 중심 + 주변 3칸
    const sum = paper[x][y] + wing.sort((a, b) => b - a).slice(0, 3).reduce((a, b) => a + b, 0);
    maxSum = Math.max(maxSum, sum);
  }
}

// 전체 반복
for (let i = 0; i < n; i++) {
  for (let j = 0; j < m; j++) {
    visited[i][j] = true;
    dfs(i, j, 1, paper[i][j]);
    visited[i][j] = false;
    checkSpecial(i, j);
  }
}

console.log(maxSum);

