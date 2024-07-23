package ut02e04conversionesdetipos;

/**
 * En este ejemplo vamos a aprender a convertir tipos de
 * datos compatibles.
 * En ocasiones tendremos un un dato en un tipo de variable,
 * que es compatible con otro tipo de datos y necesitaremos
 * cambiar su tipo.
 * 
 * Por ejemplo, en una caja de zapatos podremos guardar zapatos,
 * pero podemos guardar unas unas gafas. Teniendo dentro unas gafas, 
 * podemos intentar guardarlas en una funda para gafas y funcionará,
 * pero al intentar guardas unos zapatos en la funda para gafas
 * no podremos.
 * 
 * Tenemos dos formas de convertir de tipos:
 * - De forma implícita: En esta forma, algunos tipos de datos 
 * pueden convertirse a otros de mayor tamaño.
 *   byte -> short -> char -> int -> long -> float -> double
 * - De forma explícita: cuando queremos convertir tipos de
 * mayor tamaño a otros de menor tamaño.
 *   double -> float -> long -> int -> char -> short -> byte
 * 
 * En este ejemplo, adicionalmente, veremos un tipo de conversión
 * especial que nos será útil en el trabajo de las primeras
 * unidades del curso, la conversión de texto a un tipo numérico.
 */
public class UT02E04ConversionesDeTipos {

    public static void main(String[] args) {
        // Conversión implícita
        System.out.println("-----Conversión implícita-----");
        int vbleTipoInt = 5;
        double vbleTipoDouble;
        vbleTipoDouble = vbleTipoInt;
        System.out.println("Implícita: Valor de int: " + vbleTipoInt);
        System.out.println("Implícita: Valor de double: " + vbleTipoDouble);
        
        byte vbleTipoByte = 10;
        short vbleTipoShort;
        vbleTipoShort = vbleTipoByte;
        System.out.println("Implícita: Valor de byte: " + vbleTipoByte);
        System.out.println("Implícita: Valor de short: " + vbleTipoShort);
        
        // Conversión explícita
        System.out.println("-----Conversión explícita-----");
        double vbleTipoDouble2 = 3.2;
        int vbleTipoInt2;
        vbleTipoInt2 = (int)vbleTipoDouble2;
        System.out.println("Explícita: Valor de double: " + vbleTipoDouble2);
        System.out.println("Explícita: Valor de int: " + vbleTipoInt2);
        
        // Convirtiendo texto a número
        System.out.println("-----Conversión texto a número-----");
        String cadena1 = "7";
        String cadena2 = "hola";
        int numero;
        numero = Integer.parseInt(cadena1);
        //numero = Integer.parseInt(cadena2); // Error :(
        System.out.println("El valor de la variable número es: " + numero);

    }
    
}

/**
 * Ejercicio 1.
 * Intenta hacer más conversiones de datos implícitas. ¿Funcionan todas?
 * ¿Alguna da error?
 * Si no conoces bien todos los tipos de datos búsca en internet sobre ellos
 * así sabras el formato que usan.
 */

/**
 * Ejercicio 2.
 * Realiza diferentes conversiones de datos. Algunas darán error, lo 
 * importante de este ejercicio es que te familiarices con esos errores
 * y el texto que los describe.
 */

/**
 * Ejercicio 3.
 * Realiza conversiones de texto a variables de tipo double y float.
 * (Busca en internet si no encuentras la forma de hacerlo!)
 */

/**
 * Ejercicio 4.
 * Hemos usado esta sentencia para convertir texto a número:
 * numero = Integer.parseInt(cadena1);
 * Investiga qué es "Integer".
 * Haz un programa que use variables de tipo "Integer" y de tipo "int".
 * ¿En qué se diferencian?
 */
