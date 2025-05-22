// const input = require('fs').readFileSync(0).toString().split('\n');
const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const n = Number(input[0].trim());

let result = [];
for (let i = 0; i < n; i++) {
  let element = '';
  for (let o = 0; o < n - (i + 1); o++) {
    element += ' ';
  }
  for (let p = n - (i + 1); p < n; p++) {
    element += '*';
  }
  result.push(element);
}
console.log(result.join('\n'));
