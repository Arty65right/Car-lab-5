package ua.edu.op.asmerteniuk;

import java.util.Scanner;

public class Car2 {
    String Brand;
    int Maxspeed;
    int stepofmileage = 10000;
    double Mileage;
public Car2(){}
    public Car2(String b, int m, double mil){
    Brand = b;
    Maxspeed = m;
    Mileage = mil;


    }
    public Car2(int Maxspeed){this.Maxspeed = Maxspeed; }
    public String getInfo() {
        return "Our car is: " + Brand + "; Maxspeed:" + Maxspeed + "; Mileage: " + Mileage;}


        public static void main(String[] args){
            Car2 ourCar1 = new Car2( "Toyota", 160,5000);
            Car2 ourCar2 = new Car2( "Audi", 170,80000);
            Car2 ourCar3 = new Car2("Porshe", 280,150000);
            Car2 ourCar4 = new Car2( "Ferrari", 300,120000);
            Car2 ourCar5 = new Car2( "BMW", 220,20000);
        System.out.println(ourCar1.getInfo());
        System.out.println(ourCar2.getInfo());
        System.out.println(ourCar3.getInfo());
        System.out.println(ourCar4.getInfo());
        System.out.println(ourCar5.getInfo());
        int MaxMileage = 200000;
            Scanner scan = new Scanner(System.in);
            System.out.println("Update car mileage data, select car : ");
            int carup = scan.nextInt();
            if (carup == 1){
                int newmileage = 0;
                System.out.println("Write new mileage : ");
                newmileage = scan.nextInt();
                ourCar1 = new Car2( "Toyota", 160,newmileage);
                System.out.println(ourCar1.getInfo());
            }
    }

}
