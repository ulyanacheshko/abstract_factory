package banking;
import abstractFactory.Developer;
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes some banking code...");
    }
}
