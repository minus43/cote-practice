const input = require('fs')
  .readFileSync('./input.txt')
  .toString()
  .split('\n')
  .map((number) => Number(number));
// const input = require('fs').readFileSync(0).toString().split('\n').map((number) => Number(number));

let numbers = new Array(30).fill(0).map((_, i) => i + 1);
numbers.filter((number) => {
  if (!input.includes(number)) {
    console.log(number);
  }
});
