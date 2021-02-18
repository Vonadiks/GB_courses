package ru.geekbrains.java2.lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        System.out.println(arraySum(arr));
    }

    public static int arraySum(String array[][]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += Integer.parseInt(array[i][j]);
            }
        }
        return sum;
    }

}
