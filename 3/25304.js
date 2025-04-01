const input = require('fs').readFileSync(0).toString().split('\n');
// const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const x = Number(input[0].trim());
const n = Number(input[1].trim());
let total = 0;
for (let i = 0; i < n; i++) {
  let [a, b] = [...input[i + 2].split(' ')];
  total += Number(a) * Number(b);
}
if (x === total) {
  console.log('Yes');
} else {
  console.log('No');
}
