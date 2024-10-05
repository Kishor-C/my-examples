import cluster from 'cluster';
import http from 'http';
import process from 'process';
import os from 'os';
let numCPUs = os.availableParallelism();
if (cluster.isPrimary) {
  console.log(`Primary ${process.pid} is running`);
  // Fork workers.
  for (let i = 0; i < numCPUs; i++) {
    cluster.fork();
  }
} else {
  // Workers can share any TCP connection
  // In this case it is an HTTP server
  let server = http.createServer((request, response) => {
    if(request.url == '/') {
        response.end(`Main page handled by ${process.pid}`);
    } else if(request.url == '/slow-page') {
        for(let i = 1; i <= 5000000000; i++) {}
        response.end(`Slow page handled by ${process.pid}`);
    }
  });
  server.listen(8000);
  console.log(`Worker ${process.pid} started`);
}