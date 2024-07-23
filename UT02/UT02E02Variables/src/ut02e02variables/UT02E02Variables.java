package ut02e02variables;

/**
 * En este ejemplo vamos a aprender a usar variables.
 * Las variables son contenedores de datos de algún tipo.
 * Existen diferentes tipos de datos, en este ejemplo veremos 
 * cómo se declaran, cómo se le asignan datos, cómo se reeemplazan
 * los datos con otros nuevos y cómo podemos emplear las variables 
 * en el resto del programa.
 * 
 * Java es un lenguaje de tipado fuerte, esto quiere decir que
 * todas las variables que usemos en nuestro programa tienen que 
 * estar definidas y deben ser del mismo tipo de dato que el valor
 * que estamos asignado.
 * 
 * El formato recomendado para poner nombre a las variables se comoce
 * como "lowerCamelCase" donde la primera palabra comienza por minúscula
 * y las demás se escriben juntas pero con la primera letra mayuscula.
 * Se evita poner la primera letra en mayúscula para no confundirla con
 * el nombre de una clase, en la que sí usamos mayúscula en la primera
 * palabra. Esto es solo un consejo de estilo, los programas no fallan
 * si no se cumple, pero es lo más adecuado para que tanto nosotros, como
 * los demás desarrolladores que lean nuestro código lo entiendan de forma
 * sencilla.
 * 
 * Los nombres de las variables no pueden tener símbolos ($%#@-+). Pueden
 * tener números, pero nunca al inicio.
 */
public class UT02E02Variables {

    public static void main(String[] args) {
        
        // Ejemplo de variable de tipo entero
        // números son decimales con 4 bytes
        System.out.println("-----Variable de tipo entero-----");
        int x;
        x = 1;
        System.out.println("x vale: " + x);
        x = 2;
        System.out.println("x ahora vale: " + x);
        
        // Más variables numéricas
        // en este caso declaramos y damos valor en la misma línea
        System.out.println("-----Más variables numéricas-----");
        byte vbleByte = 100;
        short vbleShort = 5000;
        long vbleLong = 1000000000;
        System.out.println(vbleByte);
        System.out.println(vbleShort);
        System.out.println(vbleLong);
        
        // Podemos declarar varias variables del mismo tipo en una sentencia
        System.out.println("-----Declarando variables en una sentencia-----");
        int a, b, c;
        a = 1;
        b = a;
        c=b; // los espacios no son necesarios pero aportan claridad
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: "+c); // los espacios no son necesarios
        
        // Variables numéricas con decimales
        System.out.println("-----Variables con decimales-----");
        float vbleFloat = 1.34f;
        double vbleDouble = 3.78d;
        System.out.println(vbleFloat);
        System.out.println(vbleDouble);
        
        // Variables booleanas (almacenan verdadero o falso)
        System.out.println("-----Variables booleanes true/false-----");
        boolean vbleBoolean = true;
        System.out.println("Esto es " + vbleBoolean);
        vbleBoolean = false;
        System.out.println("Esto es " + vbleBoolean);
        
        // Variables que almacenan caracteres
        System.out.println("-----Variables de caracteres-----");
        char vbleChar = 'a'; // se usan comillas simples
        System.out.println("La letra es: " + vbleChar);
        vbleChar = 100; // acepta el valor numérico ASCII
        System.out.println("La letra es: " + vbleChar);
        
        // El tipo de datos String no es un tipo primitivo
        // es un tipo muy útil que nos permite almacenar una
        // cadena de texto.
        System.out.println("-----Variables de cadena de texto-----");
        String saludo = "¡Hola a todos!";
        System.out.println(saludo);
        
        // Los tipos primitivos empiezan por letra minúscula, mientras
        // que los tipos no primitivos empiezan por mayúscula.
        
        // Si no queremos que una variable pueda cambiar su valor,
        // podemos hacerlo usando la palabra reservada final
        System.out.println("-----Variables que no pueden cambiar-----");
        final int descuento = 10;
        // descuento = 20; produciría un error!
        System.out.println("El descuento es " + descuento);
    }
    
}


/**
 * Ejercicio 1.
 * Echa un vistazo a los tipos de datos primitivos:
 * https://www.w3schools.com/java/java_data_types.asp
 * Observa el rango numérico de cada tipo de dato.
 */

/**
 * Ejercicio 2.
 * Crea un programa con dos variables de distinto tipo,
 * intenta asignar la primera variable a la segunda.
 * Prueba con diferentes tipos y familiarizate con los 
 * errores que genera.
 */

/**
 * Ejercicio 3.
 * Crea tres variables de tipo char y emplearlas en una sola sentencia
 * System.out.println para generar una palabre de tres letras como Sol.
 */

/**
 * Ejercicio 4.
 * Imprime por pantalla una dirección postal tal y como aparecería en
 * una carta. Todos los campos deben ser variables.
 */
