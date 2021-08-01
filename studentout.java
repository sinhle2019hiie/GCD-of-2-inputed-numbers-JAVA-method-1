import java.util.Scanner;

public class studentout {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = scn.nextInt();//user input the number
        if (a < 0){
            System.out.println("Please choose a positive integer: ");
            scn.nextInt();
        }
        System.out.println("Input number b: ");
        int b = scn.nextInt();//user input the number
        if (a < 0) {
            System.out.println("Please choose a positive integer: ");
            scn.nextInt();
        }

        int x = GCD(a,b);
        System.out.println("LCM: " + x);
    }
//calculate the LCM of the 2 value by increasing each number
    public static int GCD(int a, int b) {
        int GCD = 1;//assign LCM is either equal to a or b
        while(1==1){//while True
            if (a % GCD == 0 && b % GCD == 0 ){//if the value is divisible by both a & b
                return GCD;//return that value
            }
            GCD++;//if not continue the loop
        }
    }

}
