import java.util.concurrent.ThreadLocalRandom;

public class Yahtzee {                         
   public static void main(String[] args) { 
	   int A;
	   int B;
	   int C;
	   int D;
	   int E;
	   
	   A = ThreadLocalRandom.current().nextInt(1, 6 + 1);
	   B = ThreadLocalRandom.current().nextInt(1, 6 + 1);
	   C = ThreadLocalRandom.current().nextInt(1, 6 + 1);
	   D = ThreadLocalRandom.current().nextInt(1, 6 + 1);
	   E = ThreadLocalRandom.current().nextInt(1, 6 + 1);
	   
	   System.out.println(A);
	   System.out.println(B);
	   System.out.println(C);
	   System.out.println(D);
	   System.out.println(E);
	   
	   System.out.println(A + B + C + D + E);
      
   } 
}