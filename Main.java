public class Main {
    public static void main(String[] args) {

        for (int number = 2; number <= 500; number++) {

            boolean prime = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(number);
            }
        }
    }
}