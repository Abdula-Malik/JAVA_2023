package Glava_6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,15,20);
        Box myBox2 = new Box(3,6,9);
        double vol;

        //вычеслить объем коробки 1
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        //вычеслить объем коробки 1
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);

    }
}
