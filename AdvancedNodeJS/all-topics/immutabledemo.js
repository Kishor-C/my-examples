import {Map, List} from "immutable";

const list1 = List([10, 20, 30]);
const list2 = list1.push(40);
const mutableList3 = [1, 2, 3, 4];
const list4 = mutableList3.push(88);
const map1 = Map({a:1, b:2, c:3});
const map2 = map1.set('b', 50);

console.log('Map1: '+map1);
console.log('Map2: '+map2);
console.log('List1: '+list1);
console.log('List2: '+list2);
console.log('MutableList3: '+mutableList3)
console.log('list4: '+list4)
