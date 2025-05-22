const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
function solution(n) {
  if (n === 0) {
    return 0;
  } else {
    return n + solution(n - 1);
  }
}

rl.on('line', (line) => {
  if (Number(line.trim()) !== 0) console.log(solution(Number(line.trim())));
});

rl.on('close', () => {});
