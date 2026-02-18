function add(a,b,callback){
    setTimeout(() => {
        const sum = a+b;
        callback(sum);
    }, 1000);
}

function Square(sum, callback){
    setTimeout(() => {
        const sq = sum * sum;
        callback(sq);
    }, 1000);
}

function cubic(c, callback){
    setTimeout(() => {
        const cub = c * c * c;
        callback(cub);
    }, 1000);
}

add(5,6,function(sum){
    console.log(sum);
});
Square(10, function(squareValue){
    console.log(squareValue);
});
cubic(10, function(cubic){
    console.log(c);
});