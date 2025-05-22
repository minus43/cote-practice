// const input = require('fs').readFileSync(0).toString().split('\n');
const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const n = Number(input[0].trim());
const v = Number(input[2].trim());

let count = 0;
let numbers = [];
input[1]
  .trim()
  .split(' ')
  .map((number) => {
    numbers.push(Number(number));
  });

for (let i = 0; i < n; i++) {
  if (numbers[i] === v) {
    count++;
  }
}
console.log(count);
