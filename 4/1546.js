// const input = require('fs').readFileSync(0).toString().split('\n');
const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const n = Number(input[0].trim());
const score = input[1]
  .trim()
  .split(' ')
  .map((number) => Number(number));
const max = Math.max(...score);
let result = 0;
score.map((number) => {
  result += ((number / max) * 100) / n;
});

console.log(result.toFixed(2));
