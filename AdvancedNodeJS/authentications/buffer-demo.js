let buff = Buffer.from("hello world");
console.log(buff);

/*
 A code snippet that reads encoded data in the request header having
 basic authentication
 
  let auth = request.headers.authorization;
  let authString = auth.split(" ");
  let base64 = Buffer.from(authString[1], "base64");
  let decode = base64.toString();
  let decodeArray = decode.split(":");
  let username = decodeArray[0];
  let password = decodeArray[1];

*/
