// const input = require('fs').readFileSync(0).toString().trim().split('\n');

const input = require('fs')
  .readFileSync('./input.txt')
  .toString()
  .trim()
  .split('\n');

  class MinHeap {
    constructor() {
      this.heap = [];
    }
  
    push(node) {
      this.heap.push(node);
      this.bubbleUp();
    }
  
    pop() {
      if (this.heap.length === 0) return null;
      const min = this.heap[0];
      const end = this.heap.pop();
      if (this.heap.length > 0) {
        this.heap[0] = end;
        this.bubbleDown();
      }
      return min;
    }
  
    bubbleUp() {
      let idx = this.heap.length - 1;
      const element = this.heap[idx];
  
      while (idx > 0) {
        let parentIdx = Math.floor((idx - 1) / 2);
        let parent = this.heap[parentIdx];
  
        if (element.cost >= parent.cost) break;
        this.heap[idx] = parent;
        this.heap[parentIdx] = element;
        idx = parentIdx;
      }
    }
  
    bubbleDown() {
      let idx = 0;
      const length = this.heap.length;
      const element = this.heap[0];
  
      while (true) {
        let leftIdx = 2 * idx + 1;
        let rightIdx = 2 * idx + 2;
        let left, right;
        let swap = null;
  
        if (leftIdx < length) {
          left = this.heap[leftIdx];
          if (left.cost < element.cost) swap = leftIdx;
        }
  
        if (rightIdx < length) {
          right = this.heap[rightIdx];
          if (
            (swap === null && right.cost < element.cost) ||
            (swap !== null && right.cost < left.cost)
          ) {
            swap = rightIdx;
          }
        }
  
        if (swap === null) break;
        this.heap[idx] = this.heap[swap];
        this.heap[swap] = element;
        idx = swap;
      }
    }
  
    isEmpty() {
      return this.heap.length === 0;
    }
  }
  
  // ──────────────────────────────────────────────────────
  // 다익스트라 본체
  const [v, e] = input[0].split(' ').map(Number);
  const start = Number(input[1]);
  
  const graph = Array.from({ length: v + 1 }, () => []);
  for (let i = 2; i < 2 + e; i++) {
    const [u, to, cost] = input[i].split(' ').map(Number);
    graph[u].push({ to, cost });
  }
  
  const dist = Array(v + 1).fill(Infinity);
  dist[start] = 0;
  
  const heap = new MinHeap();
  heap.push({ node: start, cost: 0 });
  
  while (!heap.isEmpty()) {
    const { node: current, cost: currentCost } = heap.pop();
  
    if (dist[current] < currentCost) continue;
  
    for (let next of graph[current]) {
      const totalCost = currentCost + next.cost;
      if (totalCost < dist[next.to]) {
        dist[next.to] = totalCost;
        heap.push({ node: next.to, cost: totalCost });
      }
    }
  }
  
  for (let i = 1; i <= v; i++) {
    console.log(dist[i] === Infinity ? 'INF' : dist[i]);
  }
  