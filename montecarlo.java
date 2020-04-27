public class montecarlo {
    public static void main(String[] args) {
        double side = 1.0;
        double r2 = side * side / 4;
        double x = 0, y = 0;
        int p_circle = 0;
        int p_square = 2147483647;
        long start_at = System.currentTimeMillis();
        for (int i = 0; i < p_square; i++) {
            x = Math.random() - 0.5;
            y = Math.random() - 0.5;
            if ((x*x + y*y) < r2) p_circle++;
        }
        System.out.println(4 * ((double) p_circle / p_square) + " consume " + (System.currentTimeMillis() - start_at) + " msec");
    } 
}
// Result: 3.141625990691421 consume 95864 msec