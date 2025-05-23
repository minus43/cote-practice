const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
rl.on('line', (line) => {
  input.push(line.trim());
}).on('close', () => {
  const [N, M] = input[0].split(' ').map(Number);
  const board = Array.from({ length: 101 }, (_, i) => i);

  for (let i = 1; i <= N; i++) {
    const [x, y] = input[i].split(' ').map(Number);
    board[x] = y; // 사다리
  }

  for (let i = N + 1; i <= N + M; i++) {
    const [u, v] = input[i].split(' ').map(Number);
    board[u] = v; // 뱀
  }

  const visited = Array(101).fill(false);
  const queue = [];
  queue.push({ pos: 1, count: 0 });
  visited[1] = true;

  while (queue.length > 0) {
    const { pos, count } = queue.shift();

    if (pos === 100) {
      console.log(count);
      return;
    }

    for (let dice = 1; dice <= 6; dice++) {
      let next = pos + dice;
      if (next > 100) continue;

      next = board[next]; // 사다리나 뱀 적용
      if (!visited[next]) {
        visited[next] = true;
        queue.push({ pos: next, count: count + 1 });
      }
    }
  }
});
