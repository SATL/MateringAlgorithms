package khan.recursion;

public class Palindrome {

    static boolean isPalindrome(String str){
        if(str.length() <=1 ) return true;

        if(str.charAt(0) != str.charAt(str.length()-1))
            return false;
        return isPalindrome(str.substring(1, str.length()-1));
    }

    public static void main(String[] args) {
        System.out.println("a "+ isPalindrome("a"));
        System.out.println("ab "+ isPalindrome("ab"));

        System.out.println("motor "+ isPalindrome("motor"));
        System.out.println("rotor "+ isPalindrome("rotor"));
    }
}
