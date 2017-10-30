package basicsyntax;
import java.util.Random;

import static basicsyntax.Color.*;
public class JavaAccess {
    private Random random;
    public static void main(String[] args) {
        Person person = new Person("Bill","Cypher", 42);
        System.out.println(person.getSignature());

        System.out.println("Reg.rgb() = " + RED.rgb());
        System.out.println("mix(RED, YELLOW) = " + RED.mix(RED, YELLOW));
        System.out.println("optimizedMix(BLUE, YELLOW) = " + BLUE.optimizedMix(BLUE, YELLOW));
        System.out.println("mix(BLUE, BLUE) = " + BLUE.mix(BLUE, BLUE));
    }


}
