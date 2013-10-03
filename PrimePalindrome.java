package primepalindrome;

/**
 *
 * @author Paul Salmon
 */
public class PrimePalindrome {
    
    private static int findPrimePal(int tries){
        for (int i = tries; i > 1; i--){
            boolean foundPrime = true;
            for (int j = 3; j <= Math.sqrt(i);j+=2){
                if (i%j == 0){
                    foundPrime = false;
                    break;
                }
            }
            if (i%2 != 0 && foundPrime == true && checkPalindrome(i) == true){ //found prime (just check 2), check palindrome.
                return(i);
            }   
        }
    return(1);
    }
    
    private static boolean checkPalindrome(int num){
        int orig = num;
        int reversed = 0;
        while( num != 0){
            reversed = reversed*10 + num%10;
            num = num/10;
        }
        if (orig == reversed){
            return (true);
        }else{
            return (false);
        }
    }


    public static void main(String[] args) {
        System.out.println(findPrimePal(1000));
        System.exit(0);
    }
}
