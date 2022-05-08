package palindrome;

public class Palindrome {
    public static void main(String args[])
    {
       int x=12311;
       int y=x;
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            System.out.println("It's not a palindrome");
        }

        int revertedNumber = 0;
        while(y > revertedNumber) {
            revertedNumber = revertedNumber * 10 + y % 10;
            y /= 10;
        }
        if ( y == revertedNumber || y == revertedNumber/10)
            System.out.println(x+": is a palindrome");
        else
            System.out.println(x+": is not a palindrome");

    }
}
