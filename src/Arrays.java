public class Arrays {
    public static void main(String[] args) {
        int[] month_days1 = new int[12];
        month_days1 = new int[12];
        month_days1[0] = 31;
        month_days1[1] = 28;
        month_days1[2] = 31;
        month_days1[3] = 30;
        month_days1[4] = 31;
        month_days1[5] = 30;
        month_days1[6] = 31;
        month_days1[7] = 31;
        month_days1[8] = 30;
        month_days1[9] = 31;
        month_days1[10] = 30;
        month_days1[11] = 31;
        System.out.println("В Апреле " + month_days1[3] + " дней");

        //Улучшенная версия
        int[] month_days2 = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        System.out.println("В Феврале " + month_days2[1] + " дней");

        //вычесление среднего для массива значений
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++) {
            result = result + nums[i];
        }
        System.out.println("Среднее значение: " + result / 5);


        //многомерные массивы
        int[][] toDown = new int[4][5];
        int c, j, k = 0;
        for (c = 0; c < 4; c++)
            for (j = 0; j < 5; j++) {
                toDown[c][j] = k;
                k++;
            }
        for (c = 0; c < 4; c++) {
            for (j = 0; j < 5; j++)
                System.out.print(toDown[c][j] + " ");
            System.out.println();
        }

        String[][] array = {new String[]{"Deni", "Fatima", "Ayshat"},{"Aliza", "Larisa"},{"Abdul-Malik"}};
        System.out.println("Значение: " + array[2][0]);
    }
}
