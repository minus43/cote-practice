const input = require('fs')
  .readFileSync('./input.txt')
  .toString()
  .trim()
  .split('\n')
  .map((number) => Number(number));
// const input = require('fs').readFileSync(0).toString().trim().split('\n').map((number) => Number(number));

let mod = new Set();
input.map((number) => {
  mod.add(number % 42);
});
console.log(mod.size);
