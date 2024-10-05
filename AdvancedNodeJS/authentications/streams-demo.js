import fs from "fs";

// highWaterMark: sets to stream 20 bytes
let readStream = fs.createReadStream("./big.file", { highWaterMark: 20 });
let count = 0;
readStream.on("data", (chunk) => {
  console.log(chunk.toString());
  count++;
  // pause the streaming when count reaches to 2
  if (count == 2) {
    readStream.pause();
  }
  // resume the streaming after 5s
  setTimeout(() => readStream.resume(), 5000);
});
