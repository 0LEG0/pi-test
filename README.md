# Pi-test

## It is benchmark based on Pi calculation.

The code is typical and it does not contain any language features. The test does not pretend to be any objectivity and is written just for fun.

## Results

MacBook Pro Mid 2014, 2.2 GHz Intel Core i7, Mojave

| code       | leibniz   | montecarlo |
|:-----------|:----------|:-----------|
| Node.js    | 4545 msec | 50641 msec |
| Java       | 8468 msec | 95864 msec |
| C++        | 9308 msec |            |

MacBook Pro 2021, M1Pro (8-cores), Monterey

| code       | leibniz   | montecarlo |
|:-----------|:----------|:-----------|
| Go         | 1008 msec | 57448 mces |
| Node.js    | 1010 msec | 37416 msec |
| Java       | 3671 msec | 68548 msec |
| C++        | 3676 msec |            |

_(less is better)_
