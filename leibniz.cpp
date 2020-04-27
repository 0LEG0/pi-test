#include <iostream>
#include <time.h>
#include <string>

int main() {
    double pi = 4.0;
    int sign = -1;
    clock_t start_at = clock();
    for (int i = 3; i < 2147483647; i += 2) {
        pi = pi + (double) sign * 4 / i;
        sign *= -1;
    }
    std::cout << std::to_string(pi) << " consume " << (int) (clock() - start_at) / 1000 << " msec" << std::endl;
    return 0;
}
