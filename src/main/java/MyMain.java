public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        int sum = x % 10;
        if(x == 0)
        {
            return 0;
        }
        else
        {
            return sum + (x / 10);
        }
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        int a = 0;
        int b = str.length()-1;

        while(a < b)
        {
            {
                if(str.charAt(a) != reverse(str).charAt(b))
                {
                    return false;
                }
                a++;

            }

        }
        return true;

    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        if(str.length() == 0)
        {
            return str;
        }
        else
        {
            return reverse(str.substring(1)) + str.charAt(0);
        }

    }

    public static void main(String[] args) {
        int sumofdigits = addDigits(x);
        System.out.println(sumofdigits); 

        String palindrome = isPalindrome(str);
        System.our.println(palindrome);
       
        String reversed = reverse(str);
        System.out.println(reversed);
    }
}
