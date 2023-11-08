# Pi-test

## It is benchmark based on Pi calculation.

The code is typical and it does not contain any language features. The test does not pretend to be any objectivity and is written just for fun.

## Code

```java
public class leibniz {
    public static void main(String[] args) {
        float pi = 4;
        int sign = -1;
        long start_at = System.currentTimeMillis();
        for (int i = 3; i < 2147483647; i += 2) {
            pi = pi + (float) sign * 4 / i;
            sign *= -1;
        }
        System.out.println(pi + " consume " + (System.currentTimeMillis() - start_at) + " msec");
    }
}
```

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

Run on MacBook Pro 2021, M1Pro (8-cores), Monterey

| code       | leibniz   | montecarlo |
|:-----------|:----------|:-----------|
| Go v1.21.4 | 1006 msec | 23072 msec |
| Node v21.1.0 | 1007 msec | 35234 msec |
| Bun v1.0.3 | 1649 msec | 13727 msec |
| Java v21.0.1 | 1000 msec | 33648 msec* |
| clang v14.0.0 | 1023 msec** | -          |

_(less is better)_

_(* montecarlo2.java version completes in 33648 msec, montecarlo.java - 68938 msec)_

_(** binary compiled with -O2 option completes in 1026 msec, without - 3055 msec)_