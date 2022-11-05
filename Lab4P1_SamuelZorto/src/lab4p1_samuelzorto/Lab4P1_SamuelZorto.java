package lab4p1_samuelzorto;

import java.util.Scanner;
import java.util.Random;

public class Lab4P1_SamuelZorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        boolean rep_sz = true;
        
        while(rep_sz == true){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Elija un ejercicio: ");
            System.out.println("[1] Fallout words");
            System.out.println("[2] Rodatcripne");
            System.out.println("[3] Alpha");
            System.out.println("[4] Salir");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            int menu_sz = entrada.nextInt();
            
            switch(menu_sz){
                case 1:
                    fallouttttt();
                    
                    break;
                case 2:
                    encriptame();
                    
                    break;
                case 3:
                    System.out.print("Ingrese la cadena que desea evaluar: ");
                    String contr_sz = entrada.nextLine();
                    contr_sz = entrada.nextLine();
                    alphaMale(contr_sz);
                    
                    break;
                default:
                    
                    
                    rep_sz = false;
                    break;
            }
        }
    }
    public static void fallouttttt(){
        Scanner entrad = new Scanner(System.in);
        
        
        boolean nose_sz = false;
        String palabr_sz = "";
        int ranran_sz = new Random().nextInt((10 - 1) + 1) + 1;
        switch(ranran_sz){
            case 1:
                palabr_sz = "comer";
                break;
            case 2:
                palabr_sz = "jugar";
                break;
            case 3:
                palabr_sz = "salta";
                break;
            case 4:
                palabr_sz = "llora";
                break;
            case 5:
                palabr_sz = "muere";
                break;
            case 6:
                palabr_sz = "unida";
                break;
            case 7:
                palabr_sz = "venti";
                break;
            case 8:
                palabr_sz = "llama";
                break;
            case 9:
                palabr_sz = "eevee";
                break;
            default:
                palabr_sz = "local";
                break;
        }
        int vv_sz = 5;
        do{
            int letC_sz = 0;
            int posC_sz = 0;
            
            System.out.println("Tienes " + vv_sz + " vidas");
            
            System.out.println("Lista de palabras:");
            System.out.println("Comer   Unida");
            System.out.println("Jugar   Venti");
            System.out.println("Salta   Llama");
            System.out.println("Llora   Eevee");
            System.out.println("Muere   Local");
            System.out.print("Ingrese la palabra que selecciono: ");
            String palab_sz = entrad.nextLine();
            
            palab_sz = palab_sz.toLowerCase();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if(palabr_sz.charAt(i) == palab_sz.charAt(j)){
                        letC_sz++;
                        if(i == j){
                            posC_sz++;
                        }
                    }
                }
            }
            if(letC_sz >= 5 && posC_sz >= 5){
                System.out.println("");
                vv_sz-= 5;
                nose_sz = true;
            }else{
            
                System.out.println(letC_sz + " letra correcta");
                System.out.println(posC_sz + " posición correcta");
                vv_sz--;
            }   
         
        
        } 
        while(vv_sz > 0);
        if(nose_sz == true){
            System.out.println("¡Acceso concedido!");
        }else{
            System.out.println("Perdio todas sus vidas :O");
        }
    }
    
    public static void encriptame(){
        Scanner entra = new Scanner(System.in);
        
        String contra_sz = "";
        String artnoc_sz = "";
        System.out.print("Ingrese su contraseña: ");
        String pal_sz = entra.nextLine();
        for (int i = pal_sz.length()-1; i >= 0 ; i--) {
            artnoc_sz += pal_sz.charAt(i);
        }
        for (int i = 0; i < artnoc_sz.length(); i++) {
            int ran_sz = new Random().nextInt((9 - 0) + 1) + 1;
            int mod_sz = i % 2;
            if(mod_sz == 0){
                contra_sz += artnoc_sz.charAt(i);
            }else{
                contra_sz += ran_sz;
            }
        }
        System.out.println(contra_sz);
        
        
    }
    public static void alphaMale(String contr_sz){
        boolean nose2 = true;
        for (int i = 0; i <= contr_sz.length()-1; i++) {
            int aaa_sz = (int)contr_sz.charAt(i);
            
            if(aaa_sz <= 64 || aaa_sz >=91 && aaa_sz <= 96 || aaa_sz >=123){
                nose2 = false;
            }
        }
        if(nose2 == true){
            System.out.println("La cadena sólo contiene letras.");
        }else{
            System.out.println("La cadena contiene caracteres que no son letras.");
        }
    }
}
