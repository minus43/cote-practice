const input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
// const input = require('fs').readFileSync('./input.txt').toString().split('\n');

const score = Number(input[0]);

if (score >= 90) {
    console.log('A');
} else if (score >= 80) {
    console.log('B');
} else if (score >= 70) {
    console.log('C');
} else if (score >= 60) {
    console.log('D');
} else {
    console.log('F');
}
