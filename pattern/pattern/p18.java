package pattern;

public class p18 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print((char)('A'+ n-j));
            }
            System.out.println();
        }
    }
}
