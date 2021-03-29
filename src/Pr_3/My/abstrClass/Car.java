package Pr_3.My.abstrClass;

abstract class Car{
    String name = "Unnamed Car";

    public String getInfo(){
        return name;
    }

    public abstract int getPrice();
}
