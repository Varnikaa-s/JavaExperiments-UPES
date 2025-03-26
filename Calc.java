package experiment8;

public class Calc {
     public int divide(int  n1 , int n2) {
    	 try {
    		 return n1/n2;
    	 }
    	 catch(Exception e) {
    		 System.out.println("That it is an arithmetic exception error ");
    		 return 0;
    	 }
     }
     	public static void main ( String [] args) {
     		   Calc rf = new Calc();
     		  Calc rf1 = new Calc();
     		 Calc rf2 = new Calc();
     		Calc rf3 = new Calc();
     		
		   int one = rf.divide(15, 5);
		   int two = rf1.divide(15, 3);
		   int three= rf2.divide(15, 1);
		   int four = rf3.divide(15, 0);
		   System.out.println(one);
		   System.out.println(two);
     	   System.out.println(three);
     	  System.out.println(four);

     	   }
}

