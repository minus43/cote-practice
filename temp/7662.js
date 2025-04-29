const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

class MaxHeap {
  constructor() {
    this.heap = [null];
  }
  push(value) {
    this.heap.push(value);
    let cur = this.heap.length - 1;
    let par = Math.floor(cur / 2);
    while (cur > 1 && this.heap[cur] > this.heap[par]) {
      this.swap(cur, par);
      cur = par;
      par = Math.floor(cur / 2);
    }
  }
  pop() {
    if (this.size() === 0) return;
    if (this.size() === 1) return this.heap.pop();
    const max = this.heap[1];
    this.heap[1] = this.heap.pop();
    let cur = 1;
    while (true) {
      let biggest = cur;
      let left = cur * 2;
      let right = cur * 2 + 1;
      if (left < this.heap.length && this.heap[left] > this.heap[biggest])
        biggest = left;
      if (right < this.heap.length && this.heap[right] > this.heap[biggest])
        biggest = right;
      if (biggest === cur) break;
      this.swap(biggest, cur);
      cur = biggest;
    }
    return max;
  }
  top() {
    return this.heap[1];
  }
  swap(a, b) {
    [this.heap[a], this.heap[b]] = [this.heap[b], this.heap[a]];
  }
  size() {
    return this.heap.length - 1;
  }
}

class MinHeap {
  constructor() {
    this.heap = [null];
  }
  push(value) {
    this.heap.push(value);
    let cur = this.heap.length - 1;
    let par = Math.floor(cur / 2);
    while (cur > 1 && this.heap[cur] < this.heap[par]) {
      this.swap(cur, par);
      cur = par;
      par = Math.floor(cur / 2);
    }
  }
  pop() {
    if (this.size() === 0) return;
    if (this.size() === 1) return this.heap.pop();
    const min = this.heap[1];
    this.heap[1] = this.heap.pop();
    let cur = 1;
    while (true) {
      let smallest = cur;
      let left = cur * 2;
      let right = cur * 2 + 1;
      if (left < this.heap.length && this.heap[left] < this.heap[smallest])
        smallest = left;
      if (right < this.heap.length && this.heap[right] < this.heap[smallest])
        smallest = right;
      if (smallest === cur) break;
      this.swap(smallest, cur);
      cur = smallest;
    }
    return min;
  }
  top() {
    return this.heap[1];
  }
  swap(a, b) {
    [this.heap[a], this.heap[b]] = [this.heap[b], this.heap[a]];
  }
  size() {
    return this.heap.length - 1;
  }
}

let t = null;
let currentTestCase = null;
let commandCount = 0;
let commands = [];
let maxHeap, minHeap, check;
let result = [];

rl.on('line', (line) => {
  if (t === null) {
    t = Number(line);
  } else if (currentTestCase === null) {
    currentTestCase = Number(line);
    commandCount = 0;
    commands = [];
    maxHeap = new MaxHeap();
    minHeap = new MinHeap();
    check = new Map();
  } else {
    commands.push(line);
    commandCount++;

    let [cmd, n] = line.split(' ');
    n = Number(n);

    if (cmd === 'I') {
      maxHeap.push(n);
      minHeap.push(n);
      check.set(n, (check.get(n) || 0) + 1);
    } else if (cmd === 'D') {
      if (n === 1) {
        while (maxHeap.size() > 0) {
          const num = maxHeap.top();
          if (!check.has(num)) {
            maxHeap.pop();
            continue;
          }
          check.set(num, check.get(num) - 1);
          if (check.get(num) === 0) check.delete(num);
          maxHeap.pop();
          break;
        }
      } else if (n === -1) {
        while (minHeap.size() > 0) {
          const num = minHeap.top();
          if (!check.has(num)) {
            minHeap.pop();
            continue;
          }
          check.set(num, check.get(num) - 1);
          if (check.get(num) === 0) check.delete(num);
          minHeap.pop();
          break;
        }
      }
    }

    if (commandCount === currentTestCase) {
      // 명령어 다 처리했으면 결과 출력
      let maxVal = null;
      while (maxHeap.size() > 0) {
        const num = maxHeap.top();
        if (!check.has(num)) {
          maxHeap.pop();
          continue;
        }
        maxVal = num;
        break;
      }

      let minVal = null;
      while (minHeap.size() > 0) {
        const num = minHeap.top();
        if (!check.has(num)) {
          minHeap.pop();
          continue;
        }
        minVal = num;
        break;
      }

      if (maxVal === null || minVal === null) {
        result.push(['EMPTY']);
      } else {
        result.push([`${maxVal} ${minVal}`]);
      }

      t--;
      if (t === 0) {
        rl.close();
      }
      currentTestCase = null;
    }
  }
});
rl.on('close', () => {
  console.log(result.join('\n'));
});
