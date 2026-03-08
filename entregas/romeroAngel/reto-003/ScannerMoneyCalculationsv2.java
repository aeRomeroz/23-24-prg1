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
        int billQuantity;
        String changeMessage;
            
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

        change = printDenominationChange(change, 100, "billete de 100 euros");
        change = printDenominationChange(change, 50,  "billete de 50 euros");
        change = printDenominationChange(change, 20,  "billete de 20 euros");
        change = printDenominationChange(change, 10,  "billete de 10 euros");
        change = printDenominationChange(change, 5,   "billete de 5 euros");
        change = printDenominationChange(change, 2,   "moneda de 2 euros");
        change = printDenominationChange(change, 1,   "moneda de 1 euro");
 
        System.out.println();
        System.out.println("-------------");
        System.out.println("Gracias por su compra!  ");
    }	

    static int printDenominationChange(int change, int denominationValue, String denominationLabel) {
        int billQuantity = change / denominationValue;
        if (billQuantity > 0) {
            System.out.println(billQuantity + " " + denominationLabel);
        }
        return change % denominationValue;
    }
}
