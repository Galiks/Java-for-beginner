package com.turchenkov.TenthLesson.com.ec;

public class Child extends Root {

    int oneC = 1;
    private int twoC = 2;
    public int threeC = 3;
    protected int fourC = 4;
    public Root root;

    @Override
    public void publicMethod() {
        super.publicMethod();
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }

    @Override
    void defaultMethod() {
        super.defaultMethod();
    }

    public Child(int one, int two, int three, int oneC, int twoC, int threeC, int fourC) {
        super(one, two, three);
        this.oneC = oneC;
        this.twoC = twoC;
        this.threeC = threeC;
        this.fourC = fourC;
    }

    public Child(int one, int two, int three, int four, int oneC, int twoC, int threeC, int fourC) {
        super(one, two, three, four);
        this.oneC = oneC;
        this.twoC = twoC;
        this.threeC = threeC;
        this.fourC = fourC;
    }

    public Child(int oneC, int twoC, int threeC, int fourC) {
        this.oneC = oneC;
        this.twoC = twoC;
        this.threeC = threeC;
        this.fourC = fourC;
    }

    public Child() {
        super();
    }

    public Child(Root root){
        this.root = root;
    }

    public int getOneC() {
        return oneC;
    }

    public void setOneC(int oneC) {
        this.oneC = oneC;
    }

    public int getTwoC() {
        return twoC;
    }

    public void setTwoC(int twoC) {
        this.twoC = twoC;
    }

    public int getThreeC() {
        return threeC;
    }

    public void setThreeC(int threeC) {
        this.threeC = threeC;
    }

    public int getFourC() {
        return fourC;
    }

    public void setFourC(int fourC) {
        this.fourC = fourC;
    }


}
