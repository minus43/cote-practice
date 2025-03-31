process.stdin.on("data", (data) => {
  const [a, b] = data.toString().split(" ").map(Number);
  console.log(a + b);
});

// 1. readline 인터페이스를 사용한 방법
// const readline = require('readline');
// const rl = readline.createInterface({
//   input: process.stdin,
//   output: process.stdout
// });
// rl.on('line', (line) => {
//   const [a, b] = line.split(' ').map(Number);
//   console.log(a + b);
//   rl.close();
// });

// 2. Buffer를 사용한 방법 (메모리 효율적)
// process.stdin.on('data', (data) => {
//   const [a, b] = Buffer.from(data).toString().split(' ').map(Number);
//   process.stdout.write((a + b).toString() + '\n');
// });

// 3. 동기식 입력 처리 방법
// const fs = require('fs');
// const input = fs.readFileSync('/dev/stdin').toString().split(' ');
// const a = parseInt(input[0]);
// const b = parseInt(input[1]);
// console.log(a + b);

// 각 방법의 특징:
// 1. readline: 사용자 친화적이고 가독성이 좋음, 한 줄씩 처리하기 좋음
// 2. Buffer: 메모리 효율적, 대용량 데이터 처리에 적합
// 3. 동기식: 코드가 간단하고 직관적, 작은 입력에 적합
