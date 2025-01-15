package exampleCodes;


class PrimeNumbers{
    public static void main(String[] args){
        int count = 0;

        for(int i = 2; true; i++){
            boolean isPrime = true;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.printf(i + "   ");
                count++;
            }
            if(count >= 50){
                break;
            }
        }


    }
}
