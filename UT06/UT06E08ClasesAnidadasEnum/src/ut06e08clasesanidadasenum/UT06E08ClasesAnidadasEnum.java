package ut06e08clasesanidadasenum;

public class UT06E08ClasesAnidadasEnum {

    public static void main(String[] args) {
        
        System.out.println("-----Haciendo uso de una clase anidada-----");
        Coche c = new Coche("Seat");
        c.arrancarChoche();
        
        System.out.println("-----Usando el enumerado de piedra papel tijera-----");
        Piepaptij r1 = Piepaptij.PAPEL;
        Piepaptij r2 = Piepaptij.TIJERA;
        Piepaptij r3 = Piepaptij.PIEDRA;
        
        if(r1 == Piepaptij.PAPEL){
            System.out.println("Es papel!");
        }
        
        for(Piepaptij e : Piepaptij.values()){
            System.out.println(e);
        }
        
        System.out.println("----- Usando atributos de un enum -----");
        System.out.println("El valor de " + DiasSemana.JUEVES +
            " es " + + DiasSemana.JUEVES.valorDia        
            );
        
    }
    
}
