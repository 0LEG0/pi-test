package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	var (
		side     float32 = 1.0
		r2       float32 = (side * side / 4.0)
		p_circle int     = 0
		p_square         = 2147483647
		x        float32 = 0.0
		y        float32 = 0.0
		start_at         = time.Now().UnixMilli()
	)
	for i := 0; i < p_square; i++ {
		x = rand.Float32() - 0.5
		y = rand.Float32() - 0.5
		if (x*x + y*y) < r2 {
			p_circle++
		}
	}
	fmt.Println((4.0 * float32(p_circle) / float32(p_square)), " consume ", (time.Now().UnixMilli() - start_at))
}
