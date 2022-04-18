public class leibniz {
    public static void main(String[] args) {
        float pi = 4.0f;
        int sign = -1;
        long start_at = System.currentTimeMillis();
        for (int i = 3; i < 2147483647; i += 2) {
            pi = pi + (float) sign * 4 / i;
            sign *= -1;
        }
        System.out.println(pi + " consume " + (System.currentTimeMillis() - start_at) + " msec");
    }
}
