package modelo;

import java.util.Scanner;

public class Romano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros= {1,5,10,50,100,500,1000};
		String[] numRomanos= {"I","V","X","L","C","D","M"};
		String romano="";
		int aux=0;
		try {
			System.out.println("digita numero entero entre el 1 y el 1000");
			String entrada="";
			Scanner entrada1=new Scanner(System.in);
			entrada=entrada1.nextLine();
			int numero=0,i=0;
			numero=Integer.parseInt(entrada);
			aux=numero;
			if (numero<=1000) {//verificamos que este dentro del rango
				if (numero==1000) {
					romano+=numRomanos[6];
				} else {
					while (numero>0) {
						i=0;
						while (i<6) {//recorremos todo el vector de numeros romanos
							//System.out.println(i);
							while (numero>=numeros[i] && numero<numeros[i+1]) {//verificamos el numero mayor y el menor del numero
								int par=0;
								par=i%2;
								//System.out.println("par->"+par);
								if (numero>=numeros[i+1]-numeros[i-par]) {//verificamos si se necesita hacer algun proceso para
									//determinar el numero ademas significa que con la resta del mayor menos el menor de los
									//numeros con respecto del numero dado es igual
									//System.out.println("i dentro del if"+i);
									romano+=numRomanos[i-par]+numRomanos[i+1];
									//System.out.println("romano->"+romano);
									numero=numero-(numeros[i+1]-numeros[i-par]);
									//System.out.println("numero->"+numero);
								} else {
									romano+=numRomanos[i];//solo es una concatenacion simple y aque no se necesita de mas proceso para conocer el numero
									numero=numero-numeros[i];
								}
							}
							i++;
						}
					}
				}
			} else {
				romano="el numero "+numero+" es demasiado grande";
			}
			
		} catch (Exception e) {
			romano+="error";
		}
		
		
		System.out.println("numero="+aux+"\n"+"romano="+romano);
	}

}
