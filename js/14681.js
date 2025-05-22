const input = require('fs').readFileSync(0).toString().split('\n');
// const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const x = Number(input[0]);
const y = Number(input[1]);

console.log(x > 0 && y > 0 ? 1 : x < 0 && y > 0 ? 2 : x < 0 && y < 0 ? 3 : 4);