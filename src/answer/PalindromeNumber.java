package answer;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String reservedStr = new StringBuffer().append(x).reverse().toString();
        return  String.valueOf(x).equals(reservedStr);
    }
}
