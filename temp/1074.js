const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function z(n, r, c) {
  if (n === 0) return 0;

  const half = Math.pow(2, n - 1);
  const area = half * half;

  if (r < half && c < half) {
    return 0 * area + z(n - 1, r, c); // 왼쪽 위
  } else if (r < half && c >= half) {
    return 1 * area + z(n - 1, r, c - half); // 오른쪽 위
  } else if (r >= half && c < half) {
    return 2 * area + z(n - 1, r - half, c); // 왼쪽 아래
  } else {
    return 3 * area + z(n - 1, r - half, c - half); // 오른쪽 아래
  }
}

rl.on('line', (line) => {
  const [n, r, c] = line.trim().split(' ').map(Number);
  console.log(z(n, r, c));
  rl.close(); // 입력 한 줄만 받는 문제니까 여기서 종료
});

rl.on('close', () => {});
