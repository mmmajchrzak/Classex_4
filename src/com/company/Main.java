package com.company;

class Punkt{
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x,y;

    Punkt(int wspX, int wspY){
        x = wspX;
        y = wspY;
    }

    public String toString() {
        return "Punkt: ("+x+", "+y+")";
    }
}
class Linia{
    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    private int x1,x2,y1,y2;

    Linia(Punkt poczatek, Punkt koniec){
        x1 = poczatek.getX();
        y1 = poczatek.getY();
        x2 = koniec.getX();
        y2 = koniec.getY();
    }

    Linia(int wspX1, int wspX2, int wspY1, int wspY2){
        x1 = wspX1;
        y1 = wspY1;
        x2 = wspX2;
        y2 = wspY2;
    }
}
public class Main {

    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(10,20);
        System.out.println(punkt1);
        Punkt punkt2 = new Punkt(4,20);
        Linia linia1 = new Linia(punkt1,punkt2);
        System.out.println(linia1);
        System.out.println(punkt2);
    }
}
