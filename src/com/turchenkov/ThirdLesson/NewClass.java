package com.turchenkov.ThirdLesson;

import static com.turchenkov.ThirdLesson.Temp.cold;

public class NewClass {
    static String a = "static A";
    private int num = 1;

    static {
        System.out.println(a);
    }

    public NewClass() {
        System.out.println("A constructor");
    }

    {
        System.out.println("init A");
    }

    class B{
        int num = 2;

        void test(){
            System.out.println(num);
        }

    }

}
enum Temp implements Interface {

    cold(-10),

    warm(5),

    hot(10);

    Temp(int value) {
        System.out.println("Enum create");
        this.value = value;
    }

    int value;

    @Override
    public int getTemp() {
        return value;
    }

}
    class NewSecondClass extends NewClass {
    static {
        System.out.println("static B");
    }

    NewSecondClass() {
        System.out.println("B constructor");
    }

    {
        System.out.println("init B");
    }

    public static void main(String[] args) {
        //NewSecondClass qq = new NewSecondClass();
        Interface i = Temp.valueOf("hot");
        System.out.println(i.getTemp());
        Temp t = Temp.valueOf("hot");
        switch (t){
            case cold:
                System.out.println("COLD");
                break;
            case hot:
                System.out.println("HOT");
                break;
            case warm:
                System.out.println("WARM");
                break;
        }


        /*java se - базовая часть джавы
        * java ee - jee - сервлеты, jsp, jpa, applits, REST, Spring
        * java me - */
    }
}

interface Interface {
    int getTemp();
}