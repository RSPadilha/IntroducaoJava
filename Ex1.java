import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		boolean lampada = false;
		String opcao;
		Scanner ler = new Scanner(System.in);

		do{
			System.out.println("A lampada esta " +estado(lampada));
			System.out.println("Ligar/Desligar(L/D)");
			opcao = ler.nextLine().toLowerCase();
			if(opcao.equals("l"))
				lampada = true;
			else if(opcao.equals("d"))
				lampada = false;
			else
				System.out.println("Opcao invalida");
		}while(true);
	}

	private static String estado(boolean lampada){
		if(lampada == false)
			return "Desligada";
		else
			return "Ligada";
	}

}
