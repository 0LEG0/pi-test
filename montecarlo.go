package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	var (
		side     = 1.0
		r2       = (side * side / 4.0)
		p_circle = 0.0
		p_square = 2147483647
		x        = 0.0
		y        = 0.0
		start_at = time.Now().UnixMilli()
	)
	for i := 0; i < p_square; i++ {
		x = rand.Float64() - 0.5
		y = rand.Float64() - 0.5
		if (x*x + y*y) < r2 {
			p_circle++
		}
	}
	fmt.Println((4.0 * p_circle / float64(p_square)), " consume ", (time.Now().UnixMilli() - start_at))
}
