import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        if(number < 2) {
            System.out.print("have not prime < " + number);
        }
        else {
            for (int prime = 2; prime <= number; prime++) {
                int i = 2;
                int count = 0;
                boolean check = true;
                while(i < Math.sqrt(prime)) {
                    if(prime % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if(check) {
                    System.out.print(prime + " ");
                }
            }
        }
    }
}
