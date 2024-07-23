package ut06e01elementosclase;

/**
 * Clase que contiene el main de este programa
 */
public class UT04E01ElementosClase {

    public static void main(String[] args) {
        
        
        System.out.println("-----Usando los atributos de una clase-----");
        // Declaro dos variables de tipo Perro
        // Perro es una clase que yo he creado        
        Perro primerPerro = new Perro();
        Perro segundoPerro = new Perro();
        
        // Asigno valores a los atributos del primer perro
        primerPerro.nombre = "Rufus";
        primerPerro.raza = "Caniche";
        primerPerro.edad = 4;
        primerPerro.vacunado = true;
        
        // Asigno valores a los atributos del segundo perro
        segundoPerro.nombre = "Max";
        segundoPerro.raza = "Mastín";
        segundoPerro.edad = 1;
        segundoPerro.vacunado = false;
        
        // Uso mis variables de tipo perro
        System.out.println("El primer perro tiene " + primerPerro.edad + " años.");
        System.out.println("El segundo perro se llama " + segundoPerro.nombre + ".");
        
        
        System.out.println("-----Usando los métodos de una clase-----");
        // Declaro una variable de tipo HerramientaCadenasTexto        
        HerramientaCadenasTexto h = new HerramientaCadenasTexto();
        String cad = "Esta es mi frase.";
        System.out.println("Palabras en mi frase: " + h.contarPalabras(cad));
        System.out.println("Mayúsculas: " + h.convertirMayusculas(cad));
        System.out.println("Minúsculas: " + h.convertirMinusculas(cad));
        
        System.out.println("-----Usando una clase con atributos y métodos (sinérgia!)-----"); 
        Factura f = new Factura();
        f.concepto = "Destornillador";
        f.iva = 21;
        f.precio = 10;
        System.out.println("Los impuestos de " + f.concepto + 
            " son " + f.calcularImpuestos());
        
        System.out.println("-----Usando una clase con constructor-----");
        Circulo c1 = new Circulo(5);
        Circulo c2 = new Circulo(7.34);
        System.out.println("El perímetro de c1 es: " + c1.perimetro());
        System.out.println("El área de c2 es: " + c2.area());
        
        System.out.println("-----Usando una clase con constructor y this-----");
        Cuadrado cuadrado = new Cuadrado(3);
        System.out.println("El perímetro del cuadrado es: " + cuadrado.perimetro());
        System.out.println("El área del cuadrado es: " + cuadrado.area());
       
        
        
    }
    
}
