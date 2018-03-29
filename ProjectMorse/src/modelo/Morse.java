package modelo;

import java.util.Scanner;

public class Morse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vector=new String[100];
		char[] texto={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
		
		//String[] texto={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0"};
		String[] codMorse={".-","-...","-.-.","-..",".","..-.","--.","....",".."
				,".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
				".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
		String op="";
		while(op!="3"){
			
		
		String menu="Elige una opcion\n"
				   +"1.- Convertir Texto a Codigo Morse\n"
				   +"2.- Covertir codigo Morse a Texto\n"
				   +"3.- salir";
		
		System.out.println(menu);
		
		Scanner opc=new Scanner(System.in);
		op=opc.nextLine();
		switch (op) {
		case "1":
			System.out.println("digita una palabra puedes incluir numeros");
			String cadena="";
			Scanner entrada=new Scanner(System.in);
			cadena=entrada.nextLine();
			String cadenaMorse="";
			cadena=cadena.toUpperCase();
			for (int i = 0; i <=cadena.length()-1; i++) {
				//System.out.println("entro"+cadena.charAt(i));
				//String string=Character.toString(cadena.charAt(i));
				if (cadena.charAt(i)==' ') {
					//System.out.println("en blanco");
					cadenaMorse+=" ";
				}
				for (int j = 0; j < codMorse.length; j++) {
					if (cadena.charAt(i)==(texto[j])) {
						cadenaMorse+=codMorse[j] +" ";
					}
					
				}
				
			}
			
			System.out.println("Codigo Morse: "+" "+cadenaMorse);
			break;
		case "2":
			System.out.println("digita el codigo morse con un espacio entre cada letra y dos espacios entre cada palabra");
			String morse="";
			Scanner entry=new Scanner(System.in);
			cadena=entry.nextLine();
			String cadenaTexto="";
			cadena=cadena.toUpperCase();
			String [] cadenaR=cadena.split("  ");
			for (int i = 0; i < cadenaR.length; i++) {
				//System.out.println(cadenaR[i]+"\n");
				String[] cadenaS=cadenaR[i].split(" ");//obtengo las letras de la palabra
				for (int j = 0; j < cadenaS.length; j++) {
					//System.out.println(cadenaS[j]+"\n");
					for (int j2 = 0; j2 < codMorse.length; j2++) {
						if (cadenaS[j].equals(codMorse[j2])) {
							cadenaTexto+=texto[j2];
						}
					}
				}
				cadenaTexto+=" ";
			}
			
			
			System.out.println("texto: "+" "+cadenaTexto);
			break;
		case "3":
			System.exit(0);
			break;
		default:
			break;
		}
		}
		
	}

}
