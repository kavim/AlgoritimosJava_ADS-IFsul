import java.util.Scanner;

public class helloWord {

	public static void main(String[] args) {
	
	double macho = 5;
	double femea = 3;
	double bebe = 1;

	boolean trava = false;
	boolean trava2 = false;
	
	int quant_animal_macho = 0;
	int quant_animal_femea = 0;
	int quant_animal_bebe = 0;
	int quant_total = 0;
	int quero_100 = 100;
	double quant_dinhero = 100;   

	//difinindo mais numero possivel de machos sem importar o valor

	while(quant_dinhero > 0){
		
		if(quant_dinhero >= macho && quant_animal_femea != 0 && quant_animal_macho < 2){
			quant_dinhero -= macho;
			quant_animal_macho += 1;
		}
		else if(quant_dinhero >= femea && quant_animal_bebe != 0){
			quant_dinhero -= femea;
			quant_animal_femea += 1;
		}
		else if(quant_dinhero >= bebe){
			quant_dinhero -= bebe;
			quant_animal_bebe += 2;
		}

		System.out.println("\n Unidades: ");
		System.out.println("\n macho : " + quant_animal_macho);
		System.out.println("\n femea : " + quant_animal_femea);
		System.out.println("\n bebe : " + quant_animal_bebe);
		System.out.println("\n total : " + (quant_animal_macho+quant_animal_femea+quant_animal_bebe));

		System.out.println("\n R$: " + quant_dinhero);
		System.out.println("\n -------------------------------------------------- \n");
	}



	// while(quant_total < quero_100){
	// 	if(quant_dinhero >= macho && quant_animal_femea != 0 && trava == false){
	// 		quant_dinhero -= macho;
	// 		quant_animal_macho += 1;
	// 		quant_total +=1; 
	// 	}
	// 	if(quant_dinhero >= femea && quant_animal_bebe != 0 && trava2 == false){
	// 		quant_dinhero -= femea;
	// 		quant_animal_femea += 1;
	// 		quant_total +=1; 
	// 	}
	// 	if(quant_dinhero >= bebe){
	// 		quant_dinhero -= bebe;
	// 		quant_animal_bebe += 1;
	// 		quant_total +=1; 
	// 	}

	// 	if(quant_dinhero <= 0){

	// 	}

	// 	System.out.println("\n total : " + quant_total);
	// }
		

    }
    
}
