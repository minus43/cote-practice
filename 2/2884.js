const input = require('fs').readFileSync('./input.txt').toString().split('\n');
// const input = require('fs').readFileSync(0).toString().split('\n');

let [h, m] = input[0].split(' ').map((number) => Number(number));
if (m < 45) {
  m += 60;
  h += -1;
}
m -= 45;
if (h < 0) {
  h += 24;
}
console.log(h, m);
