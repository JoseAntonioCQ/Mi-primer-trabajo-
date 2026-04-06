
package Demo;

import ejercicio1poo.Alumno;

public class DemoAlum {
    public static void main(String[] args){
         Alumno A4=new Alumno();
         Alumno A1=new Alumno("jdk","jose","condor",3,15,16,17);
         System.out.println(A1);
         
         
                 
         System.out.println("JDK12 "+A1.getcodigo());
         System.out.println("Jose Antonio"+A1.getNombre());
         System.out.println("Condor Quicano"+A1.getApellido());
         System.out.println("5"+A1.getaEstudio());
         System.out.println("15"+A1.getexaParcial());
         System.out.println("16"+A1.getexaFinal());
         System.out.println("17"+A1.getpromPracticas());
         
        
        
    }
    
}
