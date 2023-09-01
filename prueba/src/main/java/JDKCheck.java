public class JDKCheck {
    public static void main(String[] args) {
        String javaHome = System.getProperty("java.home");
        
        if (javaHome != null && javaHome.toLowerCase().contains("jdk")) {
            System.out.println("El JDK está instalado.");
        } else {
            System.out.println("No se encontró el JDK instalado.");
        }
    }
}
