package tatvsoftPatern;

public class n2 {
    public static void main(String[] args) {
        int r=6;
        for (int i = 1; i <=r; i++) {
            for (int j = r; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
