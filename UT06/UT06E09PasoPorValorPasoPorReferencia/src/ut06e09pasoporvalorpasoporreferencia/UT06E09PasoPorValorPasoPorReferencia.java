package ut06e09pasoporvalorpasoporreferencia;

public class UT06E09PasoPorValorPasoPorReferencia {

    public static void main(String[] args) {
        
        
        System.out.println("----- Probando el paso por valor de primitivos -----");
        int cosaInt = 1;
        System.out.println("¿Cuanto vale cosaInt en el main? " + cosaInt);
        modificoCosaInt(cosaInt);
        System.out.println("Volvemos al main y cosaInt vale " + cosaInt);
        
        System.out.println("----- Probando el paso por referencia de clases -----");
        CosaClaseInt c = new CosaClaseInt();
        c.valor = 1;
        System.out.println("¿Cuanto vale cosaClaseInt en el main? " + c.valor);
        modificoCosaClaseInt(c);
        System.out.println("Volvemos al main y cosaClaseInt vale " + c.valor);
        
        
        System.out.println("----- Haciendo copias de objetos -----");
        CosaClaseInt c1 = new CosaClaseInt();
        CosaClaseInt c2 = c1;
        CosaClaseInt c3 = c2;
        CosaClaseInt c4 = new CosaClaseInt();
        c4.valor = 400;
        c4 = c1;
        
        c1.valor = 1;
        c2.valor = 2;
        c3.valor = 3;
        c4.valor = 4;
        System.out.println("c1 vale " + c1.valor);
        System.out.println("c2 vale " + c2.valor);
        System.out.println("c3 vale " + c3.valor);
        System.out.println("c4 vale " + c4.valor);
        
        
        System.out.println("----- Probando la inmutabilidad de String -----");
        String s1 = "Hola";
        String s2 = s1;
        s2 = "Adiós";
        System.out.println(s1 + s2);        
        
        
        System.out.println("----- Haciendo una clase inmutable -----");
        ClaseInmutable1 ci1a = new ClaseInmutable1(5);
        ClaseInmutable2 ci2 = new ClaseInmutable2(10, ci1a);
        ClaseInmutable1 ci1b = new ClaseInmutable1(7);
        ci1b.miInfo();
        System.out.println("Posición memoria ci1b: " + ci1b);
        ci1b = ci2.retornarMiCI();
        
        ci1a.miInfo();
        System.out.println("Posición memoria ci1a: " + ci1a);
        ci1b.miInfo();
        System.out.println("Posición memoria ci1b: " + ci1b);
        ci2.miInfo();
        System.out.println("Posición memoria ci2: " + ci2);
        ci1a.miInfo();
        System.out.println("Posición memoria ci1a: " + ci1a);
        
        
        
    }
    
    public static void modificoCosaInt(int cosaInt){
        System.out.println("   Soy la función modificoCosaInt");
        System.out.println("   El valor de cosaInt que me han pasado es " + cosaInt);
        System.out.println("   Voy a modificar el valor sumandole 1...");
        cosaInt++;
        System.out.println("   Ahora vale: " + cosaInt);
    
    }
    
    public static void modificoCosaClaseInt(CosaClaseInt c){
        System.out.println("   Soy la función modificoCosaInt");
        System.out.println("   El valor de cosaInt que me han pasado es " + c.valor);
        System.out.println("   Voy a modificar el valor sumandole 1...");
        c.valor++;
        System.out.println("   Ahora vale: " + c.valor);
    
    }
    
}
