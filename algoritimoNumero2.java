import java.util.Scanner;

public class algoritimoNumero2 {

	public static void main(String[] args) {
	
	// double macho = 5;
	// double femea = 3;
	// double bebe = 1;

	// boolean trava = false;
	// boolean trava2 = false;
	// boolean trava3 = false;
	
	// int quant_animal_macho = 0;
	// int quant_animal_femea = 0;
    // int quant_animal_bebe = 0;
    
    boolean achei = false;

	int quant_total = 0;
	int quero_100 = 100;
	int volta = 0;
	double quant_dinhero = 100;   
	
	int[] valor = {5,3,1};
    int[] unidade = {1,1,3};
    int[] quantidade = new int[3];
    int[] quantidade_animal = {0,0,0};

    System.out.println("while");
    
    Scanner scanner = new Scanner(System.in);

    while(quant_dinhero > 0 && quant_total != quero_100){
        for(int i = 1; i<= 100; i++ ){
            quantidade[0] = i;
            quantidade[1] = 0;

                for(int j = 1; j<= 100; j++ ){
                    quantidade[1] = j;
                    quantidade[2] = 0;

                    System.out.println("j");

                        for(int k = 1; k<= 100;k++) {
                            
                            System.out.println("k: "+k);

                            volta++;

                            quantidade[2] = k;
                            
                            // quant_total = quantidade[0] + quantidade[1] + quantidade[2];


                            if(quantidade_animal[2] < quero_100 && (quantidade[2] + unidade[2] < quero_100)){

                                quantidade_animal[2] += quantidade[2] + unidade[2];
                                quant_dinhero-= valor[2];

                                System.out.println("BEBES quantidate total: " + quantidade_animal[2] + " = " + quantidade[2] + "+" + unidade[2]);
                                System.out.println("FEM quantidate total: " + quantidade_animal[1] + " = " + quantidade[1] + "+" + unidade[1]);
                                System.out.println("MACHO quantidate total: " + quantidade_animal[0] + " = " + quantidade[0] + "+" + unidade[0]);

                                quant_total = quantidade_animal[0] + quantidade_animal[1] + quantidade_animal[2] ;

                                System.out.println("R$: "+quant_dinhero);

                                scanner.nextLine();

                            }
                            else if(quant_total >= quero_100){
                                
                                System.out.println(">= 100 quantidade de bixo"+quant_total);
                                
                                scanner.nextLine();
                                
                                System.out.println("voltas: "+volta);
                                System.out.println("\n---------------------");
                                System.out.println("BEBES quantidate total: " + quantidade_animal[2]);
                                System.out.println("FEM quantidate total: " + quantidade_animal[1]);
                                System.out.println("MACHO quantidate total: " + quantidade_animal[0]);

                                System.out.println("R$: "+quant_dinhero);

                                
                            }else if (quant_dinhero == 0.0){
                                System.out.println("acabo o dinheru");
                                System.out.println("quant_total: "+quant_total);
                                System.out.println("quant_dinhero: "+quant_dinhero);
                            }

                            if(quant_total == 100 && quant_dinhero == 0){
                                achei = true;
                            }

                            
                        }
                }
            
        }

    }
    scanner.close();
    System.out.println("voltas: "+volta);

    if(achei == true){
        System.out.println("achei");
    }
    
    }
}
