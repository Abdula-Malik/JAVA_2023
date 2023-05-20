public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int num; //объявление переменной
        num = 100;// присваивание значения переменной num
        System.out.println("Значение num: " + num);
        num = num * 2;
        System.out.print("Значение num * 2: ");
        System.out.println(num);

        int x, y;
        x = 10;
        y = 20;
        System.out.println("");

        if (x < y) System.out.println("Значение x меньше y");
        x = x * 2;
        if(x == y) System.out.println("Теперь x равен y");

        x = x * 2;
        if (x > y) System.out.println("Теперь x больше y");

        //здесь ничего не отаброзится
        if (x == y) System.out.println("Здесь ничего не появится");

    }
}