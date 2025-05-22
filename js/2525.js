const input = require('fs').readFileSync('./input.txt').toString().split('\n');
// const input = require('fs').readFileSync(0).toString().split('\n');

let [a, b] = input[0].split(' ').map((number) => Number(number));
let c = Number(input[1]);

let h = Math.floor((a * 60 + b + c) / 60);
let m = (a * 60 + b + c) % 60;
if (m > 59) {
  m -= 60;
  h += 1;
}
if (h > 23) {
  h -= 24;
}
console.log(h, m);
