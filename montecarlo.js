let side = 1;
let r2 = side * side / 4;
let x, y;
let p_circle = 0;
let p_square = 2147483647;
let start_at = Date.now();
for (let i = 0; i < p_square; i++) {
    x = Math.random() - 0.5;
    y = Math.random() - 0.5;
    if ((x*x + y*y) < r2) p_circle++;
}
console.log(4 * p_circle / p_square + " consume " + (Date.now() - start_at) + " msec");

// Result: 3.1416336331244716 consume 50641 msec