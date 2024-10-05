import os from 'os';

// available CPUs works form Node 18.14.0 onwards
console.log(`Available parallelism: ${os.availableParallelism()}`);
// machine type - arm, arm64, i386, x86_64
console.log(`Machine: ${os.machine()}`)
// platform
console.log(`Platform: ${os.platform()}`)
// version
console.log(`Version: ${os.version()}`)