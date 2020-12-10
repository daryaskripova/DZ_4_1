package vtb.skripova;

public class Main {

    public static void main(String[] args) {
        //вывод массива на экран
        System.out.println("Первоначальный массив");
        int[][] Arr = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //сдвиг массива
        System.out.println("Cдвиг массива");
        {
            for (int i = 0; i < Arr.length; i++) {
                for (int j = 1; j <= Arr[i].length-1; j++) {
                    Arr[i][j-1] = Arr[i][j];        //второй элемент равен первому
                    System.out.print(Arr[i][j] + " ");

                }
                System.out.println(" ");
            }
        }
    }
}
