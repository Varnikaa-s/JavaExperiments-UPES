public class PrimeNumbers{
    public static void main(String[] args) {
        int count=0;
        System.out.println("Prime Numbers from 1 to 1000");
        
    for (int i=2; i<=1000; i++){
    boolean isPrime=true;
    
    for (int j=2; j<=i/2; j++){
        if (i%j==0){
        isPrime=false;
        break;
    }
}
if (isPrime){
    System.out.print(i+ "");
    count++;
   }
}
System.out.println("\n\nTotal number of Prime Numbers between 1 to 1000: " + count);
    }
}