package pe.edu.upeu.kaa;

import java.util.Scanner;

import pe.edu.upeu.kaa.examen.ResolucionExamen;
import pe.edu.upeu.kaa.utils.LeerTeclado;
public class MenuDeOpciones{
    ResolucionExamen i = new ResolucionExamen();
    LeerTeclado leerT = new LeerTeclado();
   static Scanner sc= new Scanner(System.in);

public void menuPrincipal() {
    System.out.println("------------------------------------Elija una Opción------------------------------");

    String menu = "";
    menu += "1. Pago impuestos\n";
    menu += "2. Letra X con asteristos\n";
    menu += "3. Numeros perfectos\n";
    menu += "4. Convertir decimal a binario\n";
    System.out.println(menu);
        System.out.println("ingrese una opcion");
    int opciones = sc.nextInt();
    do {
        switch (opciones) {
            case 1:
            i.impuestoAutos();
               break;
            case 2:
            i.letraX();
               break;
            case 3: 
            i.NumerosPerfectos();
               break;
            case 4: 
            i.Binario(72, 2);
               break;
            

            default: System.out.println("Opcion Invalida!"); break;
        }
        String continuar=leerT.leer("", "Desea Continuar? S=Si/N=No").charAt(0)=='S'?"S":"N";
        if (continuar.charAt(0)=='S') {
            opciones=leerT.leer(0, "Eliga una opcion:\n"+menu);
        }else{opciones=0;}
    } while (opciones != 0);
}


}