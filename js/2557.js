console.log("Hello World!");

// 1. process.stdout.write 사용 - 더 낮은 수준의 API를 사용하여 메모리 효율적
// process.stdout.write("Hello World!\n");

// 2. Buffer 사용 - 바이너리 데이터로 직접 출력하여 더욱 효율적
// process.stdout.write(Buffer.from("Hello World!\n"));

// 3. 템플릿 리터럴 사용 - 가독성이 좋고 문자열 연결이 편리
// console.log(`Hello World!`);

// 각 방법의 특징:
// 1. process.stdout.write: console.log보다 저수준이며 메모리 사용이 적음
// 2. Buffer 사용: 바이너리 데이터를 직접 다루어 가장 효율적
// 3. 템플릿 리터럴: 현대적인 JavaScript 문법으로 가독성과 유지보수성이 좋음

