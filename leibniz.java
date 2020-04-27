public class leibniz {
    public static void main(String[] args) {
        double pi = 4;
        int sign = -1;
        long start_at = System.currentTimeMillis();
        for (int i = 3; i < 2147483647; i += 2) {
            pi = pi + (double) sign * 4 / i;
            sign *= -1;
        }
        System.out.println(pi + " consume " + (System.currentTimeMillis() - start_at) + " msec");
    }
}
