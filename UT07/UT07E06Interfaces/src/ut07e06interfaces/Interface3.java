package ut07e06interfaces;

public interface Interface3 {
   
    static void soyUnMetodoEstatico(){
        System.out.println("Saludos desde un método estático");
    }
    
    default void soyUnMetodoDefault(){
        System.out.println("Saludos desde un método default");
    }
}
