package ut02e03operadores;

/**
 * En este ejemplo vamos a aprender a usar los operadores.
 * Los operadores nos permiten actuar con los datos y las variables
 * para realizar operaciones y cálculos que necesitemos en nuestros
 * programas.
 * En este ejemplo estudiaremos los operadores aritméticos, los de 
 * asignación, los de comparación y los lógicos.
 */
public class UT02E03Operadores {

    public static void main(String[] args) {
        
        // Operadores aritméticos
        System.out.println("-----Operadores aritméticos-----");
        int a = 5, b = 2, resultado;
        resultado = a + b;
        System.out.println("Suma: " + resultado);
        resultado = a - b;
        System.out.println("Resta: " + resultado);
        resultado = a * b;
        System.out.println("Multiplicación: " + resultado);
        resultado = a / b;
        System.out.println("División: " + resultado);
        resultado = a % b;
        System.out.println("Módulo: " + resultado);
        resultado = a++;
        System.out.println("Incremento++: " + resultado);
        System.out.println("Valor de a: " + a);
        resultado = b--;
        System.out.println("Decremento--: " + resultado);
        System.out.println("Valor de b: " + b);
        a = 5;
        b = 2;
        resultado = ++a;
        System.out.println("++Incremento: " + resultado);
        System.out.println("Valor de a: " + a);
        resultado = --b;
        System.out.println("--Decremento: " + resultado);
        System.out.println("Valor de b: " + b);
        a++; // Esta expresión suele usarse sola sin asignación.
        
        
        // Operadores de asignación
        System.out.println("-----Operadores de asignación-----");
        int x;
        x = 1;
        x += 1; // x = x + 1
        x -= 1;
        x *= 1;
        x /= 1;
        x %= 1;
        
        // Operadores de comparación (devuelven true o false)
        System.out.println("-----Operadores de comparación-----");
        a = 2;
        b = 1;
        boolean r;
        System.out.println("a=" + a + " b=" + b);
        r = (a == b);
        System.out.println("(a == b): " + r); // igual
        r = (a != b);
        System.out.println("(a != b): " + r); // no igual
        r = (a > b);
        System.out.println("(a > b): " + r); // mayor
        r = (a < b);
        System.out.println("(a < b): " + r); // menor
        r = (a >= b);
        System.out.println("(a >= b): " + r); // mayor o igual
        r = (a <= b);
        System.out.println("(a <= b): " + r); // menor o igual
        
        // Operadores lógicos (AND, OR y NOT)
        System.out.println("-----Operadores lógicos-----");
        a = 3;
        b = 7;
        System.out.println("a=" + a + " b=" + b);
        r = (a < 5 && b > 5); // AND - es cierto si las dos partes lo son
        System.out.println("(a < 5 && b > 5): " + r);
        r = (a < 5 || b > 10); // OR - es cierto si una de las dos lo es
        System.out.println("(a < 5 && b > 5): " + r);
        r = !r; // Invierte el resultado lógico false->true true->false
        System.out.println("Inverso del anterior: " + r);
    }
    
}


/**
 * Ejercicio 1.
 * Crea un programa en java que genera la tabla de multiplicar
 * de un número que se declara en una variable al inicio del mismo.
 * Solo puede usar una variable de tipo entero en todo el programa.
 */

/**
 * Ejercicio 2.
 * Crea un programa que a partir de la fecha de nacimiento diga la edad
 * en años, meses y días de la persona.
 * Y los bisiestos? Es muy tedioso! Investiga "java gregorian calendar",
 * e intenta resolver el ejercicio haciendo uso de ello.
 */

/**
 * Ejercicio 3.
 * Crea un programa que saque por pantalla las calificaciones obtenidas
 * en 4 asignaturas, y debe indicar de alguna forma cual de ellas tiene
 * la mayor calificación.
 */

/**
 * Ejercicio 4.
 * Crea un programa que calcule la hipotenusa de un triángulo retácnculo
 * a partir del tamaño de sus catetos, los valores deben expresarse 
 * con decimales.
 */
