// const input = require('fs').readFileSync('./input.txt').toString().split('\n');
const input = require('fs').readFileSync(0).toString().split('\n');

const arr = new Map();

input[0].split(' ').map((number) => {
  if (arr.has(Number(number))) {
    arr.set(Number(number), arr.get(Number(number)) + 1);
  } else {
    arr.set(Number(number), 1);
  }
});
if (arr.size === 3) {
  console.log(Math.max(...arr.keys()) * 100);
}

arr.forEach((value, key) => {
  if (value === 3) {
    console.log(key * 1000 + 10000);
  } else if (value == 2) {
    console.log(key * 100 + 1000);
  }
});
