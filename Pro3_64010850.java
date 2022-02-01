
import java.util.Arrays;
import java.util.Random;
public class Pro3_64010850 {

    public static boolean palindrom(int n) {
        int remain, sum = 0, temp;
        temp = n;
        while (n > 0) {
            remain = n % 10;
            sum = (sum * 10) + remain;
            n /= 10;
        }

        if (temp == sum)
            return true;
        else
            return false;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= (Math.sqrt(n)); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void GenPalinPrime(){
        int n = 1;
        int j = 0;
        
        while (true) {
            
            if (isPrime(n)&&palindrom(n)) { 
                    j++;
                      System.out.print(n + " ");
                    if (j == 780){
                        break;
                    }
                    else if (j % 10 == 0)
                        System.out.println();
                
            }
            n++;
        }
    }

    public static void main(String[] args) {
        StopWatch w1 = new StopWatch();
        double[] rand = new double[1000];
        Random r = new Random();

        int i = 0;

        System.out.print("Creating a list containing 1000 elements,");

        while(true){
            if(i==1000)
                break;

            if(i%5==0)
                System.out.println();
                rand[i] =  r.nextDouble() * 1000.0;
                System.out.printf("\t%.2f",rand[i]);
            i++;
        }
        System.out.println("\nList created.");
        System.out.print("Sorting stopwatch starts...");

        w1.start();

        Arrays.sort(rand);

        for(i=0;i<1000;i++){
            
            if(i%5==0)
                System.out.println();

            System.out.printf("\t%.2f",rand[i]);

           
        }
        w1.stop();

        System.out.println("\nSorting stopwatch stoped.\nThe sort time is "+(w1.getElapsedTime())+" milliseconds.");
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...\nCreating 1000 PalindromPrime...");

        w1.start();
        
        GenPalinPrime();
        
        w1.stop();
        System.out.println("\nPalindromePrime created.\nThe palindromPrime stopwatch stoped.");
        System.out.println("The Palindrome time is "+(w1.getElapsedTime())+" milliseconds.");
    }
}
