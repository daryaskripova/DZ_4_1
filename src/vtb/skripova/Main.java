package vtb.skripova;

public class Main {

    //вывод массива на экран
    public static void main(String[] args) {
        System.out.println("Первоначальный массив");
        int[][] Arr = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Cдвиг массива");

        //сдвиг массива
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