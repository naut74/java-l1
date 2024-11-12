import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("\n\nMenu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for(int i = 0; i < 3; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle bottom-left");
                    for (int i = 1; i <= 5; i++){
                        System.out.println(" ");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                    }
                    System.out.println("\n\nDraw the square triagle top-right");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j >= i) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("\n\nDraw the square triangle top-left");
                    for (int i = 1; i <= 5; i++){
                        System.out.println(" ");
                        for (int j = 5; j >= i; j--) {
                            System.out.print("* ");
                        }
                    }
                    System.out.println("\n\nDraw the square triangle bottom-right");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= 0; j--) {
                            if (j > i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j >= i) {
                                System.out.print("* ");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
