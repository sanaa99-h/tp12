import ma.annetation.CalculatriceMath;
import ma.annetation.Programmer;

public class TestReflectionAnnotation {
    public static void main(String[] args){

        Class c = CalculatriceMath.class;
        Programmer programmer = (Programmer)
                c.getAnnotation(Programmer.class);
        System.out.println(programmer.id()+":"+programmer.name());

    }
}

