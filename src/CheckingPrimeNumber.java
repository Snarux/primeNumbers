public class CheckingPrimeNumber {


    boolean checking( int n ){

        if(n < 2){

            //System.out.println(n + ": 0 and 1 are NOT a Prime Number");
            return false;
        }

        for (int i = 2; i < n+1/2; i++) {

            if(n % i == 0){

                //System.out.println(n + ": Its NOT a Prime Number");
                return false;
            }


        }

        System.out.println(n + ": Its a Prime Number");
        return true;
    }

}
