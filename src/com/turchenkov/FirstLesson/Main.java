package com.turchenkov.FirstLesson;

import com.turchenkov.SecondLesson.Singleton;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    public static void main(String[] args){

//        Singleton a4 = Singleton.getObject(4);
//
//        Singleton a5 = Singleton.getObject(5);

        A a = new A();

        //strictfp

        //Application.launch(args);

//        Singleton a4 = new Singleton(true);
//        Singleton a5 = new Singleton(false);
//
//        Singleton.test(12);
//        a4.test("qwe");
//        a5.test(15);

//        Point q = new Point(1,1);
//        Point p = new Point(2,2);
//
//        q.x = 3;
//        q.y = 3;
//
//        System.out.println(q.x + " " + q.y);
//
//        Point.origin.y = 5;
//
//        System.out.println(Point.origin.y);

        //region Sout
//        System.out.println("Hello, User!");
//
//        helloUser("Вася");
//
//        helloUserFromConsole();


//        Integer a = null;
//        Integer b = 8;
//
//        System.out.println("Result: " + (a+b));
//
//        System.out.println(a.equals(b)); //NullPointException

        //CalculateNumbers(1111111111);

        //A a = new A();
//        A b = new A();
//        A c = new A();

        //C c = new C();

//        D d = new D() {
//            @Override
//            void test() {
//                System.out.println("qwert");
//            }
//        };
//
//        d.test();

//        ArrayList<Testing> a = new ArrayList<>();
//        a.add(new A());
//        a.add(new C(){
//            public void test(int x){
//                System.out.println(x+x);
//            }
//        });
//
//        System.out.println("!!!!!!!!!!!");
//
//        for (Testing i: a) {
//            i.test(5);
//        }


//        ArrayList<String> operations = new ArrayList<String>();
//        operations.add("+");
//        operations.add("-");
//        operations.add("*");
//        operations.add("/");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите опепацию между 2 числами: ");
//        String text = scanner.nextLine();
//
//        System.out.println(text);
//
        //endregion
    }


    private static void CalculateNumbers(int a) {
        int sum = 0;

        while(a != 0){
            sum += a % 10;
            a /= 10;
        }
        System.out.println(sum);
    }

    public static void helloUser(String name){
        System.out.println("Hello, " + name);
    }

    public static void helloUserFromConsole(){
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello, " + name);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // установка надписи
        Text text = new Text("Hello from JavaFX!");
        text.setLayoutY(80);    // установка положения надписи по оси Y
        text.setLayoutX(100);   // установка положения надписи по оси X

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("First Application");
        stage.setWidth(300);
        stage.setHeight(250);

        System.out.println(stage.getX());
        System.out.println(stage.getY());
        System.out.println(stage.getHeight());
        System.out.println(stage.getWidth());
        stage.show();
    }
}
