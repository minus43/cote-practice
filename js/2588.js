const fs = require('fs');

// 입력 받기 (백준에서는 '/dev/stdin' 경로 사용)
// const input = fs.readFileSync('/dev/stdin').toString().split('\n');

const input = require('fs').readFileSync('./input.txt').toString().split('\n');
const a = Number(input[0]);
const b = Number(input[1]);
const [b1, b2, b3] = input[1].split('').map(Number);

console.log(a * b3);
console.log(a * b2);
console.log(a * b1);
console.log(a * b);
