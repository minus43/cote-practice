// const input = require('fs').readFileSync(0).toString().split('\n');
const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const [n, k] = input[0]
  .trim()
  .split(' ')
  .map((number) => Number(number));

let items = [];

for (let i = 1; i < n + 1; i++) {
  let [w, v] = input[i]
    .trim()
    .split(' ')
    .map((number) => Number(number));
  items.push([w, v]);
}

let dp = new Array(k + 1).fill(0);
for (const [weight, value] of items) {
  for (let i = k; i >= weight; i--) {
    dp[i] = Math.max(dp[i], dp[i - weight] + value);
  }
}

console.log(dp[k]);
