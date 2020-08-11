/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emisora;
import java.util.Scanner;


public class Emisora {
    
   
  
   public static void main(String[] args) {
       double f = 80.0;
       int size=0;
      
        Menu(f,size);

        
       
	    
     }
   
     public static void Menu(double f,int size ){
            int op =0 ;
         do{         
        Scanner sc = new Scanner(System.in);

     System.out.println("-----FM---");

     System.out.println("1: Subir frecuencia ");
     System.out.println("2: Bajar frecuencia ");
     System.out.println("3. Salir");
        
        try{
        System.out.println("Ingresar valor: ");
        op = sc.nextInt();
        }catch(Exception e){
             System.out.println("Error, ingrese un valor valido");
         }
     switch(op){
         case 1: SubirFrecuencia(f,size);
                 
    break;
         case 2: BajarFrecuencia(f,size);
                System.out.println(f);

   break;
    case 3:
        System.out.println("Salio del programa"); 
        break;
    default:
                System.out.println("No Existe la opcion");
      }
    }while(op!=3);   
        
       }
     
      public static void SubirFrecuencia( double f,int size){
            if(f==108.0){
                f=80.0;
                System.out.println(f);
            }else{
                f  =f +0.5f;
                System.out.println(f);
            }
          
                
           
            Menu(f,size);
          }
          
    
   
   public static void BajarFrecuencia(double f,int size){
       if(f==80.0){
                f=108.0;
                System.out.println(f);
            }else{
                f  =f -0.5f;
                System.out.println(f);
            }
          
                
           
            Menu(f,size);
   }
    




        
    


    
}
