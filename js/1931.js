const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on('line', (line) => {
  input.push(line.trim());
}).on('close', () => {
  const n = Number(input[0]);
  const meetings = [];

  for (let i = 1; i <= n; i++) {
    const [start, end] = input[i].split(' ').map(Number);
    meetings.push({ start, end });
  }

  // 종료 시간 기준, 같으면 시작 시간 기준 정렬
  meetings.sort((a, b) => {
    if (a.end === b.end) return a.start - b.start;
    return a.end - b.end;
  });

  let count = 0;
  let endTime = 0;

  for (let m of meetings) {
    if (m.start >= endTime) {
      endTime = m.end;
      count++;
    }
  }

  console.log(count);
});
