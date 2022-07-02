import java.util.Scanner;

public class notasEstudiantes {

   
    public static void main(String[] args) {
      Scanner ent=new Scanner(System.in);
      double promedio1=0, promedio2=0, promedio3=0, sumNota1=0, sumNota2=0, sumNota3=0;
      int numEstu;
      String materia="";
            
      System.out.println("Cual es el numero de estudiantes a ingresar: ");
      numEstu=ent.nextInt();
      int ne=0;   // contador para while y do while
      
      double []nota=new double[numEstu];
      
            
      for(int i=0;i<numEstu;i++){
          System.out.println("Ingrese la nota de matamaticas del estudiante numero "+(i+1)+".: ");
          nota[i]=ent.nextDouble();
          sumNota1+=nota[i];
          
      }
      
      while(ne<numEstu){
          System.out.println("Ingrese la nota de castellano del estudiante numero "+(ne+1)+".: ");
          nota[ne]=ent.nextDouble();
          sumNota2+=nota[ne];
          ne++;
      }
      ne=0;
      
      do
      {
          System.out.println("Ingrese la nota de ingles del estudiante numero "+(ne+1)+".: ");
          nota[ne]=ent.nextDouble();
          sumNota3+=nota[ne];
          ne++;
      
      }while(ne<numEstu);
      
      System.out.println("Cual es el promedio de nota de la materia que desea ver: ");
      materia=ent.next();
      
      switch(materia){
      
          case "matematicas":
             promedio1=sumNota1/numEstu;  
             System.out.println("El promedio de matamatica del grupo de estudiantes ingresado es: "+promedio1);
             break;
             
          case "castellano":
            promedio2=sumNota2/numEstu;  
            System.out.println("El promedio de castellano del grupo de estudiantes ingresado es: "+promedio2);
            break;
            
          case "ingles":
            promedio3=sumNota3/numEstu;
            System.out.println("El promedio de ingles del grupo de estudiantes ingresado es: "+promedio3);
            break;
            
          default:
              System.out.println("La materia ingresada no se encuentra, vuelva a intentarlo");
      
      }
      
      
    }
    
}
