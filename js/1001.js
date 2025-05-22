process.stdin.on("data", (data) => {
  const [a, b] = data.toString().split(" ").map(Number);
  console.log(a - b);
});

//1000.js 코드 참고