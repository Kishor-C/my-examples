async function test() {
	return await Promise.resolve(20);
}
test().then(x => console.log(x));

