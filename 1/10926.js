process.stdin.on("data", (data) => {
  const id = data.toString().trim();
  console.log(`${id}??!`);
});
