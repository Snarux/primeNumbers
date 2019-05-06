public class Main {

    public static void main(String[] args) {

        CheckingPrimeNumber checkPrimeNumber = new CheckingPrimeNumber();

        int start = 0;
        int end = 1000;

        for (int i = start; i < end+1; i++) {
            checkPrimeNumber.checking(i);
        }
    }

}

