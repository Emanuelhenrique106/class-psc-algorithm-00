import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    String salaDesejada = "A219";
	    String salaInformada = "";
	    Scanner Scanner = new Scanner(System.in);
	    
	    System.out.println("Digite o numero da sala: ");
	    
	    salaInformada = scanner.next();
	    
	    if (salaDesejada == salaInformada) {
	        
	        System.out.println("voce encontrou sua sala");
	        
	        
	    } else {
	        System.out.println("voce esta perdido!\n encontre! ");
	        
	        Scanner.close();
	    }
	   
	
	}
}