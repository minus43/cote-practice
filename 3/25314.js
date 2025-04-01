const input = require('fs').readFileSync(0).toString().split('\n');
// const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const n = Number(input[0].trim());

let answer = '';
for (let i = 0; i < n / 4; i++) {
  answer += 'long ';
}
console.log(answer + 'int');
