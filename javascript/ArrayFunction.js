let numb = [1,2,3,4,5,6];
//map: double each value(transform)
let doubled = numb.map(n => n*2);
//filter: select even numbers
let even = numb.filter(n => n%2 === 0);
//reduce: sum of elements(reduce)
let sum = numb.reduce((total,n) => total +n, 0);

console.log("Original: ", numb);
console.log("Doubled: ", doubled);
console.log("EVEN numbers: ", even);
console.log("SUM: ", sum);