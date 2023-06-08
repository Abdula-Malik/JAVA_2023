public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second:{
            third:{

                System.out.println("Перед оператором break.");

                if (t){break second; } //выйти из блока second
                System.out.println("Этот  оператор не выполнится");
               }
                System.out.println("Этот оператор не выполнится");
            }
            System.out.println("После блока second");
        }
        System.out.println();

        other: for (int i =0; i < 3; i++){
            System.out.println("Проход " + i + ": ");
               for (int j = 0; j < 100; j++){
                   if (j == 10) break other;
            System.out.println(j + " ");
               }
            System.out.println("Это не выполнится ");
        }
        System.out.println("Цикл завершен");
    }
}
