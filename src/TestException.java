public class TestException extends Exception{
    TestException() { }

    void func() {
        try {
            int a = 0; // заменить на 1
            int b= 42 / a;
            int c[] = { 1 };
            c[42] = 99;
        }
        catch(ArithmeticException e) {
            System.out.println(("DELENIE NA NULL:  ") + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(("INDEX ELEMENTA C:  ") + e);
        }
        System.out.println(("POSLE BLOKA try/catch."));
}

    void func1() {
        try {
            throw new NullPointerException("ISKLUCHENIE");
        } catch (NullPointerException е) {
            System.out.println("ISKLUCHENIE PEREHVACHENO V TELE METODA func()");
            throw е; // повторно сгенерировать исключение
        }
    }

    void func2() {
        try {
            func();
        } catch (NullPointerException е){
            System.out.println("POVTORNIY PEREHVAT : " + е);
        }
    }
}