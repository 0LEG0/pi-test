import java.util.Random;
public class montecarlo2 {
    public static void main(String[] args) {
        int side = 20000;
        int r2 = side * side / 4;
        int x = 0, y = 0;
        int p_circle = 0;
        int p_square = 2147483647;
        Random random = new Random(System.currentTimeMillis());
        long start_at = System.currentTimeMillis();
        for (int i = 0; i < p_square; i++) {
            x = random.nextInt(side) - 10000;
            y = random.nextInt(side) - 10000;
            if ((x*x + y*y) < r2) p_circle++;
        }
        System.out.println(4 * ((double) p_circle / p_square) + " consume " + (System.currentTimeMillis() - start_at) + " msec");
    } 
}
// Result: 3.141628151359795 consume 54738 msec