public class isPalindrome {
    public static void main(String[] args) {
        String str="ABCDCBA";
      if (isPalindrome(str)){
          System.out.println("the given string is palindrome");
      }else {
          System.out.println("the given string is not palindrome");
      }

    }

    public static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while (start<end){
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
