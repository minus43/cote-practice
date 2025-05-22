// const input = require('fs').readFileSync(0).toString().trim().split('\n');

const input = require('fs')
  .readFileSync('./input.txt')
  .toString()
  .trim()
  .split('\n');

const n = Number(input[0].trim());

let result = [];
const five = Math.floor(n / 5) + 1;
const three = Math.floor(n / 3) + 1;

for (let i = 0; i < five; i++) {
  for (let o = 0; o < three; o++) {
    if (n - 5 * i - 3 * o === 0) {
      result.push(i + o);
    }
  }
}
if (result.length === 0) {
  result.push(-1);
}
console.log(Math.min(...result));
