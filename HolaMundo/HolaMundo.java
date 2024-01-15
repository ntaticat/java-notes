/*
 * Desarrollado por Sun Microsystems 1995
 * James Gosling lideró el proyecto
 * Basado en C++
 * Llamado Oak después renombrado Java
 * Lanzado en 1996
 * Navegador HotJava y Applets (obsoletos)
 * Java EE (Enterprise Edition, J2EE) 1998
 * Lenguaje multiplataforma
 * Java Virtual Machine compila Java a Bytecode
 * Cuando se compila el archivo .java, se transforma en un archivo .class
 * Compilador JIT
 */

/*
 * Atajos
 * class
 * psvm
 * main
 */

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        imprimirNombre();
    }

    public static void imprimirNombre() {
        String nombre = "Rafael Estrada Piñon";
        System.out.println(nombre);
    }
}