import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Informe a hora de inicio e de fim do jogo: ");
		double inicio, fim, duracao;
		inicio = sc.nextDouble();
		fim = sc.nextDouble();
		
		if(inicio < fim) {
			duracao = fim - inicio;
		} else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}
}
