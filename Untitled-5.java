import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long max=0;
        while(n!=0){
            long d=n%10;
            if(d>max)
            max=d;
            n/=10;
        }
        System.out.println(max);
    }
}