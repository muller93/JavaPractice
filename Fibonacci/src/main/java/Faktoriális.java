public class Faktoriális {
/*    public int fakt(int n){
        while (int i < n){

        }
    }*/
    public long factorial(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
            return result;
    }

    //public long fact2(int n){

    //}

}
