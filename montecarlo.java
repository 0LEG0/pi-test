public class montecarlo {
    public static void main(String[] args) {
        float side = 1.0f;
        float r2 = side * side / 4;
        float x = 0f, y = 0f;
        int p_circle = 0;
        int p_square = 2147483647;
        long start_at = System.currentTimeMillis();
        for (int i = 0; i < p_square; i++) {
            x = (float) Math.random() - 0.5f;
            y = (float) Math.random() - 0.5f;
            if ((x*x + y*y) < r2) p_circle++;
        }
        System.out.println(4 * ((float) p_circle / p_square) + " consume " + (System.currentTimeMillis() - start_at) + " msec");
    } 
}