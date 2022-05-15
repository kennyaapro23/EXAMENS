package examenparcial1;

import java.util.Scanner;

class pregunta5KAA{
    static Scanner st=new Scanner(System.in);

    public static void pregunta1KAA() {
        String Nl;
    double Nec, NE, Ntp; 
    System.out.println("Ingrese las notas: ");
    System.out.println("Ingrese la nota del Examen de Conocimiento");
    Nec=st.nextDouble();
    System.out.println("Ingrese la nota de la Entrevista Personal");
    NE=st.nextDouble();
    System.out.println("Ingrese la nota del Test Psicologico");
    Ntp=st.nextDouble();

    //Proceso

    double PEC = (Nec * 0.40);
    double PEP = (NE * 0.35);
    double PTP = (Ntp * 0.25);
    double promedio = (PEC + PEP + PTP);

    if (promedio>=17 && promedio<=20) {
        Nl="Su nivel es 4";
    } else if(promedio<17 && promedio>=14){
        Nl="Su nivel es 3";
    } else if(promedio<14 && promedio>=11){
        Nl="Su nivel es 2";
    } else if(promedio<11){
        Nl="usted No puede obtener vacante";
    } else {
        Nl="Notas no validas ";
    }
    // Datos de Sal
    System.out.println(Nl);

        
    }
    public static void pregunta2KAA() {
        double igv, precio, descuento, importetotal;

        Scanner st = new Scanner(System.in);
        System.out.println("ingrese el monto base: ");
        precio = st.nextDouble();
        igv = precio+0.18 ;
        
        if (precio<2000){
            igv = precio*0.18;
            descuento = precio*0.10;
            importetotal = precio - descuento + igv ;
            
        }else  if (precio>1000){
                igv = precio*0.18;
                descuento = precio*0.05;
                importetotal = precio - descuento + igv ;
            }else if (precio>500){
                igv = precio*0.18;
                descuento = precio*0.02;
                importetotal = precio - descuento + igv ;
            }else{ 
                    descuento = 0;
                    importetotal =0;
                
            }
            
            System.out.println("el descuento aplicado es: "+ descuento);
            System.out.println("el igv es: "+ igv);
            System.out.println("el importe total es de : "+ importetotal);
        
        
    }
    public static void pregunta3KAA() {
        int v1, v2;
        double R;
        System.out.print("ingrese el primer valor: ");
        v1 = st.nextInt();
        System.out.print("ingrese el segundo valor: ");
        v2 = st.nextInt();
        char operador=st.next().charAt(0);
        R = Math.sqrt(v1);
    
        switch (operador){
            
            case '+': System.out.println(v1+v2); break;
            case '-': System.out.println(v1-v2); break;
            case '/': System.out.println(v1/v2); break;
            case 'x': System.out.println(v1*v2); break;
            case '%': System.out.println(v1%2); break;
            case '^': System.out.println(v1^v2); break;
            case 'R': System.out.println(+R); break;
            
            default: break;
        }
    }
   public static void pregunta4KAA() {
    double edad;
    char sexo;
    System.out.println("Ingrese la edad del paciente:");
    edad=st.nextDouble();

    if (edad>=70) {
        System.out.println("Vacuna que le corresponde es C");
    } 
    if (edad<16) {
        System.out.println("Vacuna que le corresponde es A");
    } 
    else if (edad>=16 && edad<=69)
    System.out.println("Ingrese el sexo M=Masculino o F=Femenino:");
    sexo=st.next().charAt(0);
    
     if (sexo=='m'){
        System.out.println("Vacuna que le corresponde es A");}
    
        if (sexo=='f'){
    System.out.println("Vacuna que le corresponde es B");
    }
    
}

   
    public static void main(String[] args) {
    
        System.out.println("Ingrese la pregunta");
        int pregunta = st.nextInt();
        switch (pregunta) {
          case 1:
            pregunta1KAA(); break;
          case 2:
            pregunta2KAA(); break;
          case 3:
            pregunta3KAA(); break;
          case 4:
            pregunta4KAA(); break;
            
            default: break;
        }
    }
}
