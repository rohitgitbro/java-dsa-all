public class palindrome {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length() / 2; i++){
            
           int  n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                // not a palindrome
                return false;
            }
            
        }
        return true;

    }
    public static void main(String args[]){
        String str = "racecar";
        String str1 = "noon";
        String str2= "123321";
        
        System.out.println(isPalindrome(str));
                System.out.println(isPalindrome(str1));
        System.out.print(isPalindrome(str2));


    }
    
}
