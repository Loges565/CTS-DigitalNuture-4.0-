import java.lang.reflect.*;

public class Reflection {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("SampleClass");

        Object obj = cls.getDeclaredConstructor().newInstance();

        for (Method method : cls.getDeclaredMethods()) {
            System.out.println("Method: " + method.getName());
            if (method.getParameterCount() == 0)
                method.invoke(obj);
        }
    }
}

class SampleClass {
    public void sayHello() {
        System.out.println("Hello via Reflection!");
    }

    public void greet() {
        System.out.println("Greetings via Reflection!");
    }
}
