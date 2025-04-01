// const input = require('fs').readFileSync(0).toString().split('\n');
const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const n = Number(input[0].trim());

function sum(n) {
  if (n === 0) {
    return 0;
  }
  return n + sum(n - 1);
}

console.log(sum(n));
