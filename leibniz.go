package main

import (
	"fmt"
	"time"
)

func main() {
	var (
		pi       float32 = 4.0
		sign     float32 = -1.0
		start_at         = time.Now().UnixMilli()
	)
	for i := 3; i < 2147483647; i += 2 {
		pi = pi + (sign * 4.0 / float32(i))
		sign *= -1
	}
	fmt.Println(pi, " consume ", (time.Now().UnixMilli() - start_at), " msec")
}
