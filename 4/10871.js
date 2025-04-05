// const input = require('fs').readFileSync(0).toString().split('\n');
const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const [n, x] = input[0]
  .trim()
  .split(' ')
  .map((number) => {
    return Number(number);
  });

const a = input[1]
  .trim()
  .split(' ')
  .filter((number) => {
    return Number(number) < x;
  });

console.log(a.join(' '));
