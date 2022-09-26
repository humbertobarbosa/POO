package lista01.ex06;

public class Validator {
    public static void runValidation(IEntityValidation e) {
        System.out.println(e.toString());
        if (e.isValid()) {
            System.out.println("Os dados são válidos!");
        } else {
            System.out.println("Os dados são inválidos!");
        }
    }
}
