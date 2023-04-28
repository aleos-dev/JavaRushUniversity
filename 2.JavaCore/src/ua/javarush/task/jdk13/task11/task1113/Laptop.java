package ua.javarush.task.jdk13.task11.task1113;

public class Laptop {
    private final String name;
    private final OperatingSystem os;

    public Laptop(String laptopName, String osName, String osVersion) {
        //напишіть тут ваш код
        name = laptopName;
        os = new OperatingSystem(osName, osVersion);
    }

    public void updateOS(String version) {
        os.setVersion(version);
    }

    public void printInfo() {
        System.out.println(name + " " + os.getName() + " " + os.getVersion());
    }
    public String getName() {
        return name;
    }
}
