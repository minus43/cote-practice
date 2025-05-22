class Heap {
  constructor(compare) {
    this.compare = compare;
    this.data = [];
  }

  size() {
    return this.data.length;
  }

  peek() {
    return this.data[0];
  }

  push(value) {
    const h = this.data;
    h.push(value);
    let i = h.length - 1;
    while (i > 0) {
      let parent = Math.floor((i - 1) / 2);
      if (this.compare(h[i], h[parent])) {
        [h[i], h[parent]] = [h[parent], h[i]];
        i = parent;
      } else break;
    }
  }

  pop() {
    const h = this.data;
    if (h.length === 1) return h.pop();
    const top = h[0];
    h[0] = h.pop();
    let i = 0;
    while (true) {
      let left = 2 * i + 1;
      let right = 2 * i + 2;
      let target = i;

      if (left < h.length && this.compare(h[left], h[target])) {
        target = left;
      }
      if (right < h.length && this.compare(h[right], h[target])) {
        target = right;
      }

      if (target === i) break;

      [h[i], h[target]] = [h[target], h[i]];
      i = target;
    }
    return top;
  }
}

//   const input = require('fs').readFileSync('./input.txt').toString().trim().split('\n');
const input = require('fs').readFileSync(0).toString().trim().split('\n');
const n = Number(input[0]);

// 최대 힙: 중앙값 이하
const left = new Heap((a, b) => a > b);

// 최소 힙: 중앙값 초과
const right = new Heap((a, b) => a < b);

const output = [];

for (let i = 1; i <= n; i++) {
  const num = Number(input[i]);

  // 1. 적절한 힙에 삽입
  if (left.size() === 0 || num <= left.peek()) {
    left.push(num);
  } else {
    right.push(num);
  }

  // 2. 힙 균형 조정
  if (left.size() > right.size() + 1) {
    right.push(left.pop());
  } else if (right.size() > left.size()) {
    left.push(right.pop());
  }

  // 3. 현재 중앙값 출력 (left 루트)
  output.push(left.peek());
}

// 결과를 한 번에 출력 (console.log는 느리기 때문에 join 사용)
console.log(output.join('\n'));
