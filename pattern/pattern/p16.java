package pattern;

public class p16 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);  // Correctly cast to char
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                
            }
            System.out.println();
        }
    }
}
