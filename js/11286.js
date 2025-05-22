// const input = require('fs').readFileSync(0).toString().trim().split('\n');

const input = require('fs')
  .readFileSync('./input.txt')
  .toString()
  .trim()
  .split('\n');

class Heap {
  constructor() {
    this.heap = [null];
  }

  push(value) {
    this.heap.push(value);
    let cur = this.heap.length - 1;
    let par = Math.floor(cur / 2);

    while (cur > 1 && this.compare(this.heap[cur], this.heap[par]) < 0) {
      this.swap(cur, par);
      cur = par;
      par = Math.floor(cur / 2);
    }
  }

  pop() {
    if (this.heap.length === 1) return 0;
    if (this.heap.length <= 2) return this.heap.pop();
    let min = this.heap[1];
    this.heap[1] = this.heap.pop();

    let cur = 1;

    while (true) {
      let smallest = cur;
      let left = cur * 2;
      let right = cur * 2 + 1;
      if (
        left < this.heap.length &&
        this.compare(this.heap[left], this.heap[smallest]) < 0
      ) {
        smallest = left;
      }

      if (
        right < this.heap.length &&
        this.compare(this.heap[right], this.heap[smallest]) < 0
      ) {
        smallest = right;
      }

      if (smallest === cur) break;

      this.swap(smallest, cur);
      cur = smallest;
    }
    return min;
  }

  swap(a, b) {
    [this.heap[a], this.heap[b]] = [this.heap[b], this.heap[a]];
  }

  peek() {
    return this.heap[1];
  }

  compare(a, b) {
    const absA = Math.abs(a);
    const absB = Math.abs(b);
    if (absA === absB) return a - b;
    return absA - absB;
  }
}

const heap = new Heap();
const n = Number(input[0].trim());
let result = [];

for (let i = 1; i < 1 + n; i++) {
  let x = Number(input[i].trim());
  if (x === 0) {
    result.push(heap.pop());
  } else {
    heap.push(x);
  }
}

console.log(result.join('\n'));
