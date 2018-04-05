package demo_git1;

import java.util.Scanner;

public class Materias {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el nombre de la materia que cursa: ");
        String mataria = leer.nextLine();
        
        //Adicione esta línea de codigo desde el repositorio remoto
        System.out.println("El nombre de la materia que cursa es: " + materia);
        
    }
}
