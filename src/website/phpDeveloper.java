package website;

import abstractFactory.Developer;

public class phpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer writes some website code...");
    }
}
