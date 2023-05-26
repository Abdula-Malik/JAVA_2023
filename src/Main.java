public class Main {
    public static void main(String[] args) {

// Рассчитать расстояние,  проходимое светом,
//с применением переменных типа  long.

        int lightspeed;
        long days;
        long seconds;
        long distance;
// Приблизительная скорость  света в милях  за  секунду.
        lightspeed = 186000;
        days = 1000;                        //указать количество дней
        seconds = days * 24 * 60 * 60;      // преобразовать в секунды
        distance = lightspeed * seconds;    // расчитать расстояние

        //вывести примерное расстояние в милях, проходимое светом
        //за указанное количество дней
        System.out.print("За дней " + days);
        System.out.print(" свет пройдет около ");
        System.out.print(distance + " миль");
    }
}