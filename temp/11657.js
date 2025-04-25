const input = require('fs')
  .readFileSync('./input.txt')
  .toString()
  .trim()
  .split('\n');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const [n, m] = input[0]
  .trim()
  .split(' ')
  .map((number) => Number(number));

// 간선 정보 저장
let edges = [];

for (let i = 0; i < m; i++) {
  let [a, b, c] = input[i + 1].trim().split(' ').map(Number);
  edges.push({ from: a - 1, to: b - 1, cost: c }); // 0-based index
}

// 거리 배열 초기화
let dist = new Array(n).fill(Infinity);
const start = 0; // 시작 정점 (0번이라 가정)
dist[start] = 0;

// 벨만-포드 본체
let hasNegativeCycle = false;
for (let i = 0; i < n; i++) {
  for (const { from, to, cost } of edges) {
    if (dist[from] !== Infinity && dist[to] > dist[from] + cost) {
      dist[to] = dist[from] + cost;
      if (i === n - 1) {
        hasNegativeCycle = true;
      }
    }
  }
}



// 출력
if (hasNegativeCycle) {
  console.log(-1);
} else {
  dist
    .map((d, i) => (d === Infinity ? -1 : d))
    .filter((_, i) => i !== start)
    .forEach((d) => console.log(d));
}
