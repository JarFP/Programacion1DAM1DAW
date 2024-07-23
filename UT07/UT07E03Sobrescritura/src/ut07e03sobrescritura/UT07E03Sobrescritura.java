
package ut07e03sobrescritura;


public class UT07E03Sobrescritura {


    public static void main(String[] args) {
        System.out.println("----- Saluda la clase padre -----");
        ClasePadre cp = new ClasePadre();
        cp.saludar();
        
        System.out.println("----- Saluda la clase hija -----");
        ClaseHija ch = new ClaseHija();
        ch.saludar();
        
        System.out.println("----- Saluda la clase hija sobrescritura parcial -----");
        ClaseHijaSP chsp = new ClaseHijaSP();
        chsp.saludar();
        
        System.out.println("----- Clase tortilla sin toString sobrescrito -----");
        String[] ingredientes = {"huevos", "patatas", "cebolla"};
        Tortilla t = new Tortilla(ingredientes);
        System.out.println(t.toString());
        
        System.out.println("----- Clase tortilla con toString sobrescrito -----");
        TortillaStS tsts = new TortillaStS(ingredientes);
        System.out.println(tsts.toString());  // <-- prueba a borrar el toString, ¿qué pasa?
        
    }
    
}
