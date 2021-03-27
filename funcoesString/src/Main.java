public class Main {
	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG    ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); 
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace(" ", "");
		String s07 = original.replace("FGHIJ", "fghij");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original - " + original);
		System.out.println("Modificada - " + s01);
		System.out.println("Modificada - " + s02);
		System.out.println("Modificada - " + s03);
		System.out.println("Modificada - " + s04);
		System.out.println("Modificada - " + s05);
		System.out.println("Modificada - " + s06);
		System.out.println("Modificada - " + s07);
		System.out.println("Posição - " + i);
		System.out.println("Ultima posição - " + j);
	}
}
