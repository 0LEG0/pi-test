# Pi-test

## It is benchmark based on Pi calculation.

The code is typical and it does not contain any language features. The test does not pretend to be any objectivity and is written just for fun.

## Code

Java
```java
public class leibniz {
    public static void main(String[] args) {
        double pi = 4;
        int sign = -1;
        long start_at = System.currentTimeMillis();
        for (int i = 3; i < 2147483647; i += 2) {
            pi = pi + (double) sign * 4 / i;
            sign *= -1;
        }
        System.out.println(pi + " consume " + (System.currentTimeMillis() - start_at) + " msec");
    }
}
```
VS JavaScript
```javascript
let pi = 4;
let sign = -1;
let start_at = Date.now();
for (let i = 3; i < 2147483647; i += 2) {
    pi = pi + sign * 4 / i;
    sign *= -1;
}
console.log(pi + " consume " + (Date.now() - start_at) + " msec");
```

## Results

MacBook Pro Mid 2014, 2.2 GHz Intel Core i7, Mojave

| code       | leibniz   | montecarlo |
|:-----------|:----------|:-----------|
| JavaScript | 4545 msec | 50641 msec |
| Java       | 8468 msec | 95864 msec |
| C++        | 9308 msec |            |

_(less is better)_
