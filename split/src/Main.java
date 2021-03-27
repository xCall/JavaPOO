
public class Main {
	public static void main(String[] args) {
		String s = "potato,apple,lemon";
		
		String[] vect = s.split(",");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println("Texto 1 " + word1);
		System.out.println("Texto 2 " + word2);
		System.out.println("Texto 3 " + word3);
	}
}
