package lista01.ex06;

public abstract class Person implements IEntityValidation {
    @Override
    public boolean isValid() {
        return false;
    } 

    @Override
    public String toString() {
        return "Type: Person";
    }
}
