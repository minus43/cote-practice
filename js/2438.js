// const input = require('fs').readFileSync(0).toString().split('\n');
const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const n = Number(input[0].trim());

let result = [];
for (let i = 0; i < n; i++) {
  if (i === 0) {
    result.push('*');
  } else {
    result.push(result[i - 1] + '*');
  }
}
console.log(result.join('\n'));
