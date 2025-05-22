// const input = require('fs').readFileSync(0).toString().split('\n');
const input = require('fs').readFileSync('./input.txt').toString().split('\n');

input.forEach((ab) => {
  if (!ab.trim()) return; 

  let [a, b] = ab.split(' ');
  if (Number(a) + Number(b) != 0) {
    console.log(Number(a) + Number(b));
  }
});
