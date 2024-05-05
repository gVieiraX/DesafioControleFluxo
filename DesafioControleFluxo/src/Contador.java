import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro parâmetro.");
			scanner.close();
		}
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) 
			throw new ParametrosInvalidosException();
	
		int contagem = parametroDois - parametroUm;
			for (; contagem <= parametroDois;){
				System.out.println("Imprimindo o número: " + contagem++);
			}

	}
}