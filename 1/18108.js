process.stdin.on("data", (data) => {
  const year = data.toString().trim();
  console.log(year - 543);
});
    