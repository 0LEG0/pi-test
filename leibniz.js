let pi = 4;
let sign = -1;
let start_at = Date.now();
for (let i = 3; i < 2147483647; i += 2) {
    pi = pi + sign * 4 / i;
    sign *= -1;
}
console.log(pi + " consume " + (Date.now() - start_at) + " msec");
