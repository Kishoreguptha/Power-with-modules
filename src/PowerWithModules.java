public class PowerWithModules {
    public static void main(String[] args) {
        int A = 2;
        int B = 3;
        int C = 3;

        int result = powerWithModules(A, B, C);
        System.out.println("(A^B) % C = " + result);

        A = 5;
        B = 2;
        C = 4;
        result = powerWithModules(A, B, C);
        System.out.println("(A^B) % C = " + result);
    }

    public static int powerWithModules(int A, int B, int C) {
        int result = 1;
        while (B > 0) {
            if (B % 2 == 1) {
                result = (result * A) % C;
            }
            A = (A * A) % C;
            B /= 2;
        }
        return result;
}
}