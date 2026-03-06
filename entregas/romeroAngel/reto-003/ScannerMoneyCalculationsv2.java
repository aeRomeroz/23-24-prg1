import java.util.Scanner;

class ScannerMoneyCalculationsv2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
		
        System.out.println("Ingrese el costo del producto:");
        int sellPrice = scanner.nextInt();
        System.out.println("Monto a dar:");
        int paid = scanner.nextInt();
        int change = paid - sellPrice;	
        int billDenomination;
        int bilQnt;
        String mensaje;
            
        String bil100 = "billete de " + 100 + " euros"; 
        String bil50 = "billete de " + 50 + " euros"; 
        String bil20 = "billete de " + 20 + " euros"; 
        String bil10 = "billete de " + 10 + " euros"; 
        String bil5 = "billete de " + 5 + " euros"; 
        String mon2 = "moneda de " + 2 + " euros";
        String mon1 = "moneda de " + 1 + " euro";
            
        System.out.println("||===================||");
        System.out.println("||  RECIBO DE COMPRA ||");			
        System.out.println("||===================||");	
        System.out.println();

        System.out.println("El precio total es: " + sellPrice + " euros");
        System.out.println("Usted ha dado: " + paid + " euros");
        System.out.println();
        
        System.out.println("Su cambio es de: " + change + " euros,");
        System.out.println("dado con un total de: ");
        System.out.println();

        billDenomination = 100;
        bilQnt = change/billDenomination;
        change = change%billDenomination;
        mensaje = ((bilQnt > 0) ? bilQnt + " " + bil100 + "\n" : ""); 
        System.out.print(mensaje);
        
        billDenomination = 50;
        bilQnt = change/billDenomination;
        change = change%billDenomination;
        mensaje = ((bilQnt > 0) ? bilQnt + " " + bil50 + "\n" : ""); 
        System.out.print(mensaje);
        
        billDenomination = 20;
        bilQnt = change/billDenomination;
        change = change%billDenomination;
        mensaje = ((bilQnt > 0) ? bilQnt + " " + bil20 + "\n" : ""); 
        System.out.print(mensaje);
        
        billDenomination = 10;
        bilQnt = change/billDenomination;
        change = change%billDenomination;
        mensaje = ((bilQnt > 0) ? bilQnt + " " + bil10 + "\n" : "");  
        System.out.print(mensaje);
       
        billDenomination = 5;
        bilQnt = change/billDenomination;
        change = change%billDenomination;
        mensaje = ((bilQnt > 0) ? bilQnt + " " + bil5 + "\n" : "");  
        System.out.print(mensaje);

        billDenomination = 2;
        bilQnt = change/billDenomination;
        change = change%billDenomination;
        mensaje = ((bilQnt > 0) ? bilQnt + " " + mon2 + "\n"  : "");  
        System.out.print(mensaje);
       
        billDenomination = 1;
        bilQnt = change/billDenomination;
        mensaje = ((bilQnt > 0) ? bilQnt + " " + mon1 + "\n"  : ""); 
        System.out.print(mensaje);
 
        System.out.println();
        System.out.println("-------------");
        System.out.println("Gracias por su compra!  ");
        
        
        
    }	
}
