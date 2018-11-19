package com.turchenkov.TenthLesson.com.ec;

public class Root {

    int one = 1;
    private int two = 2;
    public int three = 3;
    protected int four = 4;

    private void privateMethod(){
        System.out.println("Private");
    }

    public void publicMethod(){
        System.out.println("Public");
    }

    protected void protectedMethod(){
        System.out.println("Protected");
    }

    void defaultMethod(){
        System.out.println("Default");
    }

    public Root(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public Root(int one, int two, int three, int four) {

        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
    }

    public Root() {
    }

    public Root(int k) {
        System.out.println(k);
    }

    public String show(String str, int i){
        return str + i;
    }
}
