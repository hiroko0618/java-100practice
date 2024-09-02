public class Version {
  public static void main (String[] args) {
    String version = System.getProperty("java.version");
    System.out.println("Current Java version: " + version);

    String osName = System.getProperty("os.name");
    System.out.println("Your OS name is: " + osName);
    
    osName.getClass();
    System.out.println(osName.getClass());
  }
}
