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

    while (cur > 1 && this.heap[par] > this.heap[cur]) {
      this.swap(par, cur);
      cur = par;
      par = Math.floor(cur / 2);
    }
  }

  pop() {
    if (this.heap.length <= 2) return this.heap.pop();
    const min = this.heap[1];
    this.heap[1] = this.heap.pop();

    let cur = 1;
    while (true) {
      let left = cur * 2;
      let right = cur * 2 + 1;
      let smallest = cur;

      if (left < this.heap.length && this.heap[left] < this.heap[smallest]) {
        smallest = left;
      }

      if (right < this.heap.length && this.heap[right] < this.heap[smallest]) {
        smallest = right;
      }

      if (smallest === cur) break;

      this.swap(cur, smallest);
      cur = smallest;
    }
    return min;
  }
  size() {
    return this.heap.length - 1;
  }
  peek() {
    return this.heap[1];
  }
  swap(a, b) {
    [this.heap[a], this.heap[b]] = [this.heap[b], this.heap[a]];
  }
}

const heap = new Heap();
let result = [];
const n = Number(input[0].trim());
for (let i = 1; i < 1 + n; i++) {
  let x = Number(input[i].trim());
  if (x === 0) {
    if (heap.size() === 0) {
      result.push(0);
    } else {
      result.push(heap.pop());
    }
  } else {
    heap.push(x);
  }
}
console.log(result.join('\n'));
