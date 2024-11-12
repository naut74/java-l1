import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        if(number >= 0 && number <= 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        }
        else if(number <= 20) {
            switch (number) {
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eightteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;

            }
        } else if (number < 100) {
            int tens = (number % 100) / 10;
            int ones = number % 10;
            String readTens = "";
            String readOnes = "";
            switch (ones) {
                case 0:
                    readOnes = "";
                    break;
                case 1:
                    readOnes = "one";
                    break;
                case 2:
                    readOnes = "two";
                    break;
                case 3:
                    readOnes = "three";
                    break;
                case 4:
                    readOnes = "four";
                    break;
                case 5:
                    readOnes = "five";
                    break;
                case 6:
                    readOnes = "six";
                    break;
                case 7:
                    readOnes = "seven";
                    break;
                case 8:
                    readOnes = "eight";
                    break;
                case 9:
                    readOnes = "nine";
                    break;
            }
            switch (tens) {
                case 2:
                    readTens = "twenty";
                    break;
                case 3:
                    readTens = "thirty";
                    break;
                case 4:
                    readTens = "fourty";
                    break;
                case 5:
                    readTens = "fifty";
                    break;
                case 6:
                    readTens = "sixty";
                    break;
                case 7:
                    readTens = "seventy";
                    break;
                case 8:
                    readTens = "eighty";
                    break;
                case 9:
                    readTens = "ninety";
                    break;
            }

            System.out.printf("%s %s",readTens, readOnes);
        } else if (number < 1000) {
            int ones = number % 10;
            int tens = (number % 100) / 10;
            int hundreds = (number - ones - tens*10) / 100;
            String readOnes = "";
            String readTens = "";
            String readHundreds = "";
            switch (ones) {
                case 1:
                    readOnes = "one";
                    break;
                case 2:
                    readOnes = "two";
                    break;
                case 3:
                    readOnes = "three";
                    break;
                case 4:
                    readOnes = "four";
                    break;
                case 5:
                    readOnes = "five";
                    break;
                case 6:
                    readOnes = "six";
                    break;
                case 7:
                    readOnes = "seven";
                    break;
                case 8:
                    readOnes = "eight";
                    break;
                case 9:
                    readOnes = "nine";
                    break;
            }
            switch (tens) {
                case 2:
                    readTens = "twenty";
                    break;
                case 3:
                    readTens = "thirty";
                    break;
                case 4:
                    readTens = "fourty";
                    break;
                case 5:
                    readTens = "fifty";
                    break;
                case 6:
                    readTens = "sixty";
                    break;
                case 7:
                    readTens = "seventy";
                    break;
                case 8:
                    readTens = "eighty";
                    break;
                case 9:
                    readTens = "ninety";
                    break;
            }
            switch (hundreds) {
                case 1:
                    readHundreds = "one hundred";
                    break;
                case 2:
                    readHundreds = "two hundred";
                    break;
                case 3:
                    readHundreds = "three hundred";
                    break;
                case 4:
                    readHundreds = "four hundred";
                    break;
                case 5:
                    readHundreds = "five hundred";
                    break;
                case 6:
                    readHundreds = "six hundred";
                    break;
                case 7:
                    readHundreds = "seven hundred";
                    break;
                case 8:
                    readHundreds = "eight hundred";
                    break;
                case 9:
                    readHundreds = "nine hundred";
                    break;
            }
            System.out.printf("%s and %s %s", readHundreds, readTens, readOnes);
        }
        else {
            System.out.println("Unvalid Number!");
        }
    }
}
