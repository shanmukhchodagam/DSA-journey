    class palindrome {

        
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
    if (x < 0) return false; // Negative numbers are not palindromes
    int temp = x;
    int d = 0;

    for (; x > 0; x = x / 10) {
        int r = x % 10;
        d = (d * 10) + r;
    }

    return temp == d;
}
}
