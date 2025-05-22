const input = require('fs').readFileSync('./input.txt').toString().split('\n');
// const input = require('fs').readFileSync(0).toString().split('\n');

const numbers = input.map((number) => Number(number));
const max = Math.max(...numbers);
console.log(max);
console.log(numbers.indexOf(max) + 1);
