package appparciali;

import java.util.Scanner;

/**
 *
 * @author David Jacob López Morataya
 * 5090-17-12655
 */
public class AppParcialI {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
          AppParcialI ap1 = new AppParcialI();
   
        int no1,no2,no3,no4,ca1,ca2,ca3,ca4,notamayor,notamenor, promedio;
        Scanner leernota = new Scanner(System.in);
         Scanner leercarnet = new Scanner(System.in);
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        Alumno a3 = new Alumno();
        Alumno a4 = new Alumno();
        
        /*
        MOSTRAMOS UN MENSAJE DE BIENVENIDA PARA DAR PASO AL INGRESO DE NOTAS
        */
        System.out.println("█ █ █ █ █ █ █ BIENVENIDO █ █ █ █ █ █ █\n");
        System.out.println("\n\n");
        System.out.println("\n\n");
        
        
        /*
        Indicamos al usuario que el programa es unicamente para 4 notas y que los datos a ingresar deben ser
        de tipo entero para que no exista ningún error. 
        */
        
        System.out.println("IMPORTANTE: Este programa es para 4 NOTAS\n");
        System.out.println("Ingrese solo números enteros.\n \n");
         System.out.println("\n");
         System.out.println("\n");
         System.out.println("►►►►► ALUMNO 1 ◄◄◄◄ \n");
         System.out.println("Número de Carnet: ");
         ca1 = leercarnet.nextInt();
          a1.setCarnet(ca1);
        System.out.println("Nota: ");
         no1 = leernota.nextInt();
         a1.setNota(no1);
         System.out.println("\n");
         System.out.println("\n");
           
           
         System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
         System.out.println("►►►►► ALUMNO 2 ◄◄◄◄ \n");
         System.out.println("Número de Carnet: ");
         ca2 = leercarnet.nextInt();
          a2.setCarnet(ca2);
        System.out.println("Nota: ");
         no2 = leernota.nextInt();
         a2.setNota(no2);
        System.out.println("\n");
        System.out.println("\n");
        
        
        
         System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
         System.out.println("►►►►► ALUMNO 3 ◄◄◄◄ \n");
         System.out.println("Número de Carnet: ");
         ca3 = leercarnet.nextInt();
          a3.setCarnet(ca3);
        System.out.println("Nota: ");
         no3 = leernota.nextInt();
         a3.setNota(no3);
         System.out.println("\n");
         System.out.println("\n");  
         
         
         System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
         System.out.println("►►►►► ALUMNO 4 ◄◄◄◄ \n");
         System.out.println("Número de Carnet: ");
         ca4 = leercarnet.nextInt();
          a4.setCarnet(ca4);
        System.out.println("Nota: ");
         no4 = leernota.nextInt();
         a4.setNota(no4);
         
         System.out.println("\n");
         System.out.println("\n");  
         
         
         
         System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n");
        
        
        
         /*
         IF PARA DEFINIR LA NOTA MAYOR Y NOTA MENOR
         */
         
         if(a1.getNota() > a2.getNota()     && a1.getNota() > a3.getNota() &&    a1.getNota() > a4.getNota()){
         
             notamayor = a1.getNota();}
         
             if(a2.getNota() > a1.getNota()     && a2.getNota() > a3.getNota() &&    a2.getNota() > a4.getNota()){
            notamayor = a2.getNota();}
                 
         
             
             if(a3.getNota() > a1.getNota()     && a3.getNota() > a2.getNota() &&    a3.getNota() > a4.getNota()){
            notamayor = a3.getNota();}
             
             
         if(a4.getNota() > a1.getNota()     && a4.getNota() > a2.getNota() &&    a4.getNota() > a3.getNota()){
            notamayor = a4.getNota();}
         
         
        /*
         ######################################################################
         PASAR A UN METODO LLAMADO "MOSTRAR DATOS" 
         */
        System.out.println("CARNET DEL ALUMNO\t\t           NOTA\n");
        System.out.println(a1.getCarnet()+ "\t\t\t\t" +  a1.getNota() );
        System.out.println(a2.getCarnet()+ "\t\t\t\t" +  a2.getNota() );
        System.out.println(a3.getCarnet()+ "\t\t\t\t" +  a3.getNota() );
        System.out.println(a4.getCarnet()+ "\t\t\t\t" +  a4.getNota() );
        
        System.out.println( "LA NOTA MAYOR ES" +  notamayor);
        
        promedio=((a1.getNota() +  a2.getNota ()+  a3.getNota()+  a4.getNota())/4);
        
        System.out.println( "EL PROMEDIO ES:" +  promedio);
        }
        
        
    }
}