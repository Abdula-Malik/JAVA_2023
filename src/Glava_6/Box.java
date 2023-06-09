package Glava_6;

public class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d){
        System.out.println("Конструрирование Box: ");
        width = w;
        height = h;
        depth = d;
    }

    //Вычеслить о возвратить объем коробки
    double volume(){
        return width * height * depth;
    }

}
