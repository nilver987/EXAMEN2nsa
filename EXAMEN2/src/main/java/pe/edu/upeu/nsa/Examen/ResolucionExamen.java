package pe.edu.upeu.nsa.Examen;
import pe.edu.upeu.nsa.util.LeerTeclado;

public class ResolucionExamen {
    public LeerTeclado lc= new LeerTeclado();
    public void ejercicio2 (){
        //datos de entrada
        double impuestoporauto, cat1=0, cat2=0, cat3=0;
        double preciodeautocat;
        int totaldeautos, cat;
        double porcat1=0.12, porcat2=0.08, porcat3=0.05;
        totaldeautos=lc.leer(0,"ingrese el numero de autos");
        for(int n=1; n<=totaldeautos; n++){
            System.out.println("auto numero "+n+" ");
            cat=lc.leer(0,"Número de categoria (1,2,3): ");
            preciodeautocat=lc.leer(0.0, "precio del auto: ");
            switch(cat){
                case 1:
                    impuestoporauto=preciodeautocat*porcat1;
                    cat1=cat1+impuestoporauto;
                    System.out.println("su empuesto es :"+impuestoporauto);
                break;
                case 2:
                    impuestoporauto=preciodeautocat*porcat2;
                    cat2=cat2+impuestoporauto;
                    System.out.println("su empuesto es :"+impuestoporauto);
                break;
                case 3:
                    impuestoporauto=preciodeautocat*porcat3;
                    cat3+=impuestoporauto;
                    System.out.println("su empuesto es :"+impuestoporauto);
                break;
            }
        }
        
        System.out.println("");
        System.out.println("inpueto por categoria");
        System.out.println("categoria 1: "+cat1);
        System.out.println("categoria 2: "+cat2);
        System.out.println("categoria 3: "+cat3);
        System.out.println("impuesto total");
        System.out.println("Total: "+(cat1+cat2+cat3));

    }public void ejercicio3(){
        //datos de entrada
        int num=20,i,j;
 
        System.out.print("tabla de multiplicar de 1 al 20: ");
        for(i = 1; i<=num; i++){
            System.out.println("TABLA DE "+i+"");
            System.out.println();
            //prseso
            for(j = 1; j <=10; j++)
            { System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
    public void ejercicio4(){
        int n=1, m=1,num;
        int acum=0;
        num=lc.leer(0, "Ingrese un número: ");
        //proceso
        while(m<=num){
            while (n<=m/2){
                if(m%n == 0){
                    acum = acum+n;}
                n++;
            }
            //datos de salida
            if (m==acum){
                System.out.println("numero perfecto");
            } m++;}
    }
    public int ejercicio5(int n, int m){
        if (m == 0) {
            return 1;
        }
        else {
           return n * ejercicio5(n, m - 1);
        }
    }
}