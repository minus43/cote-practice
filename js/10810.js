const input = require('fs').readFileSync('./input.txt').toString().split('\n');
// const input = require('fs').readFileSync(0).toString().split('\n');

const [n, m] = input[0]
  .trim()
  .split(' ')
  .map((number) => Number(number));

let box = new Array(n).fill(0);
for (let o = 1; o < m + 1; o++) {
  let [i, j, k] = input[o]
    .trim()
    .split(' ')
    .map((number) => Number(number));
  for (let p = i - 1; p <= j - 1; p++) {
    box[p] = k;
  }
}
console.log(box.join(' '));
