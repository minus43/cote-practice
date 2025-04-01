const input = require('fs').readFileSync(0).toString().split('\n');
// const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const t = Number(input[0].trim());
let result = [];
for (let i = 0; i < t; i++) {
  let [a, b] = [...input[i + 1].split(' ')];
  result.push(Number(a) + Number(b));
}
console.log(result.join('\n'));
