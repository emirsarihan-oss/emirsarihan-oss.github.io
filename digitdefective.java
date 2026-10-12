public class MyProgram
{
    public static void main(String[] args)
    {
       // odd sum
       // even sum
       // 3 sayı
       // min 4 hane max 8 hane
       // sayılardaki even miktarı ve odd miktarı ve toplamları 
       // odd toplamı 10dan fazla ise jackpot
       // adım 2
       //en büyük rakam
       //even mı çok odd mu çok veya balance
       //adım 3 
       //toplama
       //soldan sağa artıyosa increase
       //çift çıkarıp yazma
       //
       int num = 12321;
       int num1 = num;
       int oddsum = 0;
       int evensum = 0;
       int even = 0;
       int odd = 0;
       
         while(num1 > 0){
             int rem = num1 % 10;
             if(rem %2 ==0){
                 evensum += rem;
                 even ++;
             }else{
                 oddsum += rem;
                 odd ++;
             }
             num1 -= rem;
             num1 /= 10;
             
                
         }
       
       System.out.println("Odd sum: " + oddsum);
       System.out.println("Even sum: " + evensum);
       System.out.println("Odd count: " + odd);
       System.out.println("Even Count: " + even);
       System.out.println("Number Reversed: " + reverse(num));
       System.out.println("Is it a Palindrome: " + ispalindrome(num));
       
       if(oddsum>10){
           System.out.println("Jackpot");
       }
       if(even>odd){
           System.out.println("Even heavy");
       }else if(odd>even){
           System.out.println("Odd Heavy");
       }else{
           System.out.println("Odd and even amounts are balanced");
       
           
       }
}
       public static boolean ispalindrome(int num)
       {
        boolean palindrome;
       if(num==reverse(num)){
             palindrome = true;
                }else{
                 palindrome = false;
             }
                 return palindrome;
       }
    
       
    public static int reverse(int num)
       { 
           int reverse = 0;
           
           while(num != 0){
               int digit = num % 10;
               reverse = reverse * 10 + digit;
               num = num/10;
           }
           
            return reverse;
        }
     
}
