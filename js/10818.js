const input = require('fs').readFileSync('./input.txt').toString().split('\n');
// const input = require('fs').readFileSync(0).toString().split('\n');

const n = Number(input[0].trim());
let numbers = input[1]
  .trim()
  .split(' ')
  .map((number) => Number(number));

console.log(numbers.sort());

console.log(numbers[0], numbers[n - 1]);
