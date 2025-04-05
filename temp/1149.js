// const input = require('fs').readFileSync(0).toString().split('\n');
const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const n = Number(input[0].trim());
let cost = [];
for (let i = 0; i < n; i++) {
  cost.push(
    input[i + 1].split(' ').map((number) => {
      return Number(number);
    })
  );
}

let dp = [cost[0]];

for (let o = 1; o < n; o++) {
  dp[o] = [];
  dp[o][0] = Math.min(dp[o - 1][1], dp[o - 1][2]) + cost[o][0];
  dp[o][1] = Math.min(dp[o - 1][0], dp[o - 1][2]) + cost[o][1];
  dp[o][2] = Math.min(dp[o - 1][1], dp[o - 1][0]) + cost[o][2];
}
console.log(Math.min(...dp[n - 1]));
