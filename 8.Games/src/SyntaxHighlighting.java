
import java.util.Arrays;
public class SyntaxHighlighting {

        public static void main(String[] args)
        {
            MyInterface   myInterface   = new ConcreteClass();
            ConcreteClass concreteClass = new ConcreteClass();
            AbstractClass abstractClass = new ConcreteClass();

            myInterface.abstractMethod();
            myInterface.defaultMethod();

            var strings = Arrays.asList(
                    Constants.STATIC_FINAL,
                    Constants.STATIC,
                    Constants.staticMethod(),
                    concreteClass.instanceFinal,
                    concreteClass.instance,
                    concreteClass.abstractMethod());

            int effectivelyFinal = 1;
            int reassigned       = 2;
            reassigned = 3;

            var string = "string";
            var number = 123.456;

//            String error       = 1;
            String warning     = "" + concreteClass.toString();
            int    weakWarning = 1000000;
        }

        public interface MyInterface
        {
            String abstractMethod();

            default String defaultMethod()
            {
                return this.toString();
            }
        }

        public abstract static class AbstractClass
                implements MyInterface
        {
        }

        public static class ConcreteClass
                extends AbstractClass
        {
            public final String instanceFinal = "instance";
            public       String instance      = "instance";

            public void setInstance(String instance)
            {
                this.instance = instance;
            }

            @Override
            public String abstractMethod()
            {
                return this.defaultMethod();
            }
        }

        public static class Constants
        {
            public static final String STATIC_FINAL = "constant";
            public static       String STATIC       = "non-constant";

            public static String staticMethod()
            {
                return "";
            }
        }
}
