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

input.map((string) => {
  const stack = new Stack();
  if (string[0] !== '.') {
    string
      .trim()
      .split('')
      .map((element) => {
        if (!element.match(/^[a-zA-Z]*$/)) {
          if (
            (stack.peek() + element === '()') |
            (stack.peek() + element === '[]')
          ) {
            stack.pop();
          } else if (element !== '.' && element !== ' ') {
            stack.push(element);
          }
        }
      });
    stack.size() > 0 ? console.log('no') : console.log('yes');
  }
});
