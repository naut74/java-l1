public class PrintPrimeSmaller100 {
    public static void main(String[] args) {
        int number = 100;
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
