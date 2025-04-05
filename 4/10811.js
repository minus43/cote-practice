const input = require('fs').readFileSync('./input.txt').toString().split('\n');
// const input = require('fs').readFileSync(0).toString().split('\n');

const [n, m] = input[0]
  .trim()
  .split(' ')
  .map((number) => Number(number));

let box = new Array(n).fill(0).map((_, i) => i + 1);

for (let o = 1; o < m + 1; o++) {
  let [i, j] = input[o]
    .trim()
    .split(' ')
    .map((number) => Number(number));
  let sortPart = [];
  for (let p = j - 1; p > i - 2; p--) {
    sortPart.push(box[p]);
  }
  box = [...box.slice(0, i - 1), ...sortPart, ...box.slice(j)];
}
console.log(box.join(' '));
