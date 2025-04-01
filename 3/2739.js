const input = require('fs').readFileSync(0).toString().split('\n');
// const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const n = Number(input[0].trim());
for (let i = 1; i < 10; i++) {
  console.log(`${n} * ${i} = ${n * i}`);
}
