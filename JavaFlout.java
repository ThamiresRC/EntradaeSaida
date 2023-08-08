package PacoteJava;

import java.util.Scanner;

public class JavaFlout {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4,media;
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		
	        
	        System.out.println("leia as 4 notas do participante:");
	      
	        
	        
	        float nota1 = ler.nextFloat();
	      
	        float nota2 = ler.nextFloat();
	        
	        float nota3 = ler.nextFloat();
	        
	        float nota4 = ler.nextFloat();
	        
	        
	        float mediaArredondada = (nota1 + nota2 + nota3 + nota4) / 4;
	        
	        
	        
	        System.out.println("A média final do participante é: "  + mediaArredondada);
	        
	        		
	        
	        ler.close();  
                
         

	}

}
