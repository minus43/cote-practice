// const input = require('fs').readFileSync(0).toString().trim().split('\n');

const input = require('fs')
  .readFileSync('./input.txt')
  .toString()
  .trim()
  .split('\n');

class Stack {
  constructor() {
    this.stack = [];
  }
  push(value) {
    this.stack.push(value);
  }
  pop() {
    return this.stack.pop();
  }
  peek() {
    return this.stack[this.stack.length - 1];
  }
  size() {
    return this.stack.length;
  }
}

const t = Number(input[0].trim());
for (let i = 0; i < t; i++) {
  const stack = new Stack();
  input[i + 1]
    .trim()
    .split('')
    .map((element) => {
      if (stack.peek() + element === '()') {
        stack.pop();
      } else {
        stack.push(element);
      }
    });
  stack.size() > 0 ? console.log('NO') : console.log('YES');
}
