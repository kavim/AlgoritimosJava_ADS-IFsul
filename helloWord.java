import java.util.Scanner;

public class helloWord {

	public static void main(String[] args) {
	
	double macho = 5;
	double femea = 3;
	double bebe = 1;

	boolean trava = false;
	boolean trava2 = false;
	boolean trava3 = false;
	
	int quant_animal_macho = 0;
	int quant_animal_femea = 0;
	int quant_animal_bebe = 0;
	int quant_total = 0;
	int quero_100 = 100;
	int volta = 0;
	double quant_dinhero = 100;   
	
	

	//difinindo mais numero possivel de machos sem importar o valor

	while(quant_dinhero > 0){
		
		if(quant_dinhero >= macho && quant_animal_femea != 0){
			quant_dinhero -= macho;
			quant_animal_macho += 1;
		}
		else if(quant_dinhero >= femea && quant_animal_bebe != 0){
			quant_dinhero -= femea;
			quant_animal_femea += 1;
		}
		else if(quant_dinhero >= bebe){
			quant_dinhero -= bebe;
			quant_animal_bebe += 3;
		}

		System.out.println("\n Unidades: ");
		System.out.println("\n macho : " + quant_animal_macho);
		System.out.println("\n femea : " + quant_animal_femea);
		System.out.println("\n bebe : " + quant_animal_bebe);
		System.out.println("\n total : " + (quant_animal_macho+quant_animal_femea+quant_animal_bebe));

		System.out.println("\n R$: " + quant_dinhero);
		System.out.println("\n -------------------------------------------------- \n");
	}

	quant_total = (quant_animal_macho+quant_animal_femea+quant_animal_bebe);

	System.out.println("\n ------------------------Parte 2: distribuir até 100 ------------------------ \n");
	Scanner scanner = new Scanner(System.in);//aqui estou declarando um scanner que lerá da entrada padrão do sistema(console)
	scanner.nextLine();

	while(quant_total < quero_100){

		volta++;
		System.out.println("\n ------- Volta: "+volta+" R$: "+quant_dinhero+"-------");

		//BALANÇO
		if(quant_dinhero == 0.0){

			if(quant_animal_femea > 1){
				trava2 = true;
				trava = false;
				trava3 = false;
				System.out.println("\n Descontando FEMEA");
				quant_animal_femea -= 1;
				quant_dinhero += femea;
				System.out.println("  + R$: "+quant_dinhero);
			}
			else if (quant_animal_macho > 1) {
				trava = true;
				trava2 = false;
				trava3 = false;
				System.out.println("\n Descontando MACHO");
				quant_animal_macho -= 1;
				quant_dinhero += macho;
				System.out.println("  + R$: "+quant_dinhero);
			}

		}

		//COMPRAR
		
		if(quant_dinhero >= macho && quant_animal_femea != 0 && trava == false && quant_total + 1 <= quero_100){
			System.out.println("\n Comprando macho.");
			quant_dinhero -= macho;
			System.out.println("  -R$: "+macho);
			quant_animal_macho += 1;
		}
		if(quant_dinhero >= femea && quant_animal_bebe != 0 && trava2 == false && quant_total + 1 <= quero_100){
			System.out.println("\n Comprando femea.");
			quant_dinhero -= femea;
			System.out.println("  -R$: "+femea);
			quant_animal_femea += 1;
		}
		if(quant_dinhero >= bebe && trava3 == false){
			System.out.println("\n Comprando BB.");
			quant_dinhero -= bebe;
			System.out.println("  -R$: "+bebe);
			quant_animal_bebe += 3;
		}else if(quant_total + 3 <= quero_100){
				trava = false;
				trava2 = false;
				trava3 = true;
				System.out.println("\n Descontando BB");
				quant_animal_bebe -= 3;
				quant_dinhero += bebe;
				System.out.println("  + R$: "+quant_dinhero);
		}else{
			trava3 = false;
		}

		System.out.println("\n Unidades: ");
		System.out.println(" macho : " + quant_animal_macho);
		System.out.println(" femea : " + quant_animal_femea);
		System.out.println(" bebe : " + quant_animal_bebe);
		System.out.println(" total R$ : " + quant_dinhero);

		quant_total = quant_animal_bebe + quant_animal_femea + quant_animal_macho;
		System.out.println("\n Total BIXO: " + quant_total);
		System.out.println("\n -----------------------------------------------------------\n");

		scanner.nextLine();
	}
	
	scanner.close();

    }
    
}
