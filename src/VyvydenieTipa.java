public class VyvydenieTipa {
    public static void main(String[] args) {
        // использование выведения  типов локальных переменных в цикле for
        //применить выведение типов к переменной управления циклом
        System.out.println("Значение х: ");
        for (var x = 2.5; x < 100.0; x = x * 2)
            System.out.print(x + " ");
        System.out.println();

        //применить выведение типов к переменной итерации
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Значение в массиве nums: ");
        for (var v : nums)
            System.out.print(v + " ");
        System.out.println();

    }
}
