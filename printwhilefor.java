public class MyProgram
{
    public static void main(String[] args)
    {
        
        PrintFor(9);
        PrintWhile(9);
       
    }
    private static void PrintFor(int count){
        // üst yarı
        for(int m = 1; count >= m; m++){
            // boşluk
            for(int b = count - m; b > 0; b--){
                System.out.print(" ");
            }
        
            //satır sol
            for(int n = 1; n<=m; n++){
                System.out.print(n);
            }
            
            // satır sağ
            for(int a = m-1; a >= 1; a--){
               System.out.print(a);
            }
            
            // yeni satır
            System.out.println();
        }
        
        //alt yarı
        for(int m = count-1; 1 <= m; m--){
            // boşluk
            for(int b = count - m; b > 0; b--){
                System.out.print(" ");
            }
        
            //satır sol
            for(int n = 1; n<=m; n++){
                System.out.print(n);
            }
            
            // satır sağ
            for(int a = m-1; a >= 1; a--){
               System.out.print(a);
            }
            
            // yeni satır
            System.out.println();
            
            
        }
    }
    private static void PrintWhile(int count) {
        //üst yarı
        int m = 1;
        while(count >= m){
            // boşluk
            int b = count - m;
            while(b > 0){
                System.out.print(" ");
                b--;
            }
        
            //satır sol
            int n = 1;
            while(n<=m){
                System.out.print(n);
                n++;
            }
            
            // satır sağ
            int a = m-1;
            while(a >= 1){
               System.out.print(a);
               a--;
            }
            
            // yeni satır
            System.out.println();
            
            m++;
        }
        
        //alt yarı
        m = count-1;
        while(1 <= m){
            // boşluk
            int b = count - m;
            while(b > 0){
                System.out.print(" ");
                b--;
            }
        
            //satır sol
            int n = 1;
            while(n<=m){
                System.out.print(n);
                n++;
            }
            
            // satır sağ
            int a = m-1;
            while(a >= 1){
               System.out.print(a);
               a--;
            }
            
            // yeni satır
            System.out.println();
            
            m--;
        }
        
    }
}
