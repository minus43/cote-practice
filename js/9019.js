// const input = require('fs').readFileSync(0).toString().trim().split('\n');

const input = require('fs')
  .readFileSync('./input.txt')
  .toString()
  .trim()
  .split('\n');

function D(n) {
  return (n * 2) % 10000;
}

function S(n) {
  return n === 0 ? 9999 : n - 1;
}

function L(n) {
  return (n % 1000) * 10 + Math.floor(n / 1000);
}

function R(n) {
  return (n % 10) * 1000 + Math.floor(n / 10);
}

const t = Number(input[0].trim());

function solution(origin, target) {
  const visited = Array(10000).fill(false);
  const prev = Array(10000).fill(-1);
  const how = Array(10000).fill('');
  const queue = [origin];
  let head = 0;
  visited[origin] = true;

  while (head < queue.length) {
    const current = queue[head++];

    if (current === target) break;

    for (const [next, operation] of [
      [D(current), 'D'],
      [S(current), 'S'],
      [L(current), 'L'],
      [R(current), 'R'],
    ]) {
      if (!visited[next]) {
        visited[next] = true;
        prev[next] = current;
        how[next] = operation;
        queue.push(next);
      }
    }
  }

  // 경로 복원
  let path = '';
  let now = target;
  while (now !== origin) {
    path = how[now] + path;
    now = prev[now];
  }
  return path;
}

for (let i = 0; i < t; i++) {
  const [A, B] = input[i + 1]
    .trim()
    .split(' ')
    .map(Number);

  console.log(solution(A, B));
}
