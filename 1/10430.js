process.stdin.on("data", (data) => {
  const [a, b, c] = data.toString().split(" ").map(Number);
  console.log((a + b) % c);
  console.log((a % c + b % c) % c);
  console.log((a * b) % c);
  console.log((a % c * b % c) % c);
});