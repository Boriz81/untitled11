package classAnonim;

public class Main {

    public static void main (String[] args) {

        AnonThreeMethod instance = new AnonThreeMethod() {
            @Override
            public void do1() {
                System.out.println("Implement do1");
            }

            @Override
            public void do2() {
                System.out.println("Implement do2");
            }

            @Override
            public void do3() {
                System.out.println("Implement do3");
            }
        };
        instance.do1();
        instance.do2();
        instance.do3();
    }
}
