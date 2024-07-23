
package ut06e08clasesanidadasenum;

public enum DiasSemana {
    LUNES(1),
    MARTES(2),
    MIERCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7);
    
    final int valorDia;

    private DiasSemana(int valorDia) {
        this.valorDia = valorDia;
    }   
    
}
