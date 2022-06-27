package pe.edu.upeu.kaa.examen;

import pe.edu.upeu.kaa.utils.LeerTeclado;

public class ResolucionExamen {
        static LeerTeclado objTec = new LeerTeclado();
    
        public void impuestoAutos() {
    
            int n, clave;
            float precio, impuesto, categoria1, categoria2, categoria3, total;
            total = 0;
            categoria1 = 0;
            categoria2 = 0;
            categoria3 = 0;
    
            n = objTec.leer(0, "ingresar la cantidad de autos");
            while (n > 0) {
    
                precio = objTec.leer(0, "ingresa el precio del auto: " + n);
    
                clave = objTec.leer(0, "ingresa la clave del auto: ");
                if (clave > 0 && clave < 4) {
                    if (clave == 1) {
                        impuesto = precio * 0.12f;
                        categoria1 = categoria1 + impuesto;
                        total = total + impuesto;
                        System.out.println("el impuesto a pagar por el auto: " + n + " es s/: " + impuesto);
                    }
                    if (clave == 2) {
                        impuesto = precio * 0.08f;
                        categoria2 = categoria2 + impuesto;
                        total = total + impuesto;
                        System.out.println("el impuesto a pagar por el auto: " + n + " es s/: " + impuesto);
                    }
                    if (clave == 3) {
                        impuesto = precio * 0.05f;
                        categoria3 = categoria3 + impuesto;
                        total = total + impuesto;
                        System.out.println("el impuesto a pagar por el auto: " + n + " es s/: " + impuesto);
                    }
                 
                } else
                    System.out.println("ingrese la clave correcta");
    
            }
            System.out.println("el impuesto por la categoria 1 es s/: " + categoria1);
            System.out.println("el impuesto por la categoria 2 es s/: " + categoria2);
            System.out.println("el impuesto por la categoria 3 es s/: " + categoria3);
            System.out.println("el impuesto total por todos los autos es s/: " + total);
        }
    
        public void letraX() {
    
            int h;
        
            h = objTec.leer(0, "ingresar un numero impar mayor a 3");
              
            if (h > 3 && h %2!=0){
              for (int fil = 1; fil <= h; fil++){
                for (int col = 1; col <= h; col++){
                  if ((fil == col) || (col == (h-fil)+1)){
                    System.out.print("*");
                  } else {
                    System.out.print(" ");
                  }
                }
                System.out.println();
              }
        
            }else{
              System.out.println("No el número no es valido");
            }
          }   
        
          public  void NumerosPerfectos() {
            long i, j, suma;
            i= objTec.leer(0, "Ingresa n numeros perfectos");
            while (i <= 10000) {
                i++;
    
                suma = 0;
                
                for(j = 1;j < i;j++){                          
                     if(i % j==0){
                        suma = suma + j; 
                     }
                }
              if(i == suma){                          
                 System.out.println(i);
                
              }
            } 
        }
    
        public void Binario(int numero, int bit){
       
        
            if (numero==72)
                System.out.print(0);
            for (bit=1; bit<=numero; bit*=2);
            for (bit/=2; bit>0; bit/=2)
                if (numero >= bit)
                {
                    System.out.print(1);
                    numero -= bit;
                } else {
                    System.out.print(0);
                }
            System.out.println("  binario\n");
    

        }
}

