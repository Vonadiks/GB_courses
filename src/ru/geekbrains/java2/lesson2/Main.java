package ru.geekbrains.java2.lesson2;

public class Main {
    public static void main(String[] args) {
        //String[][] arr = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        //String[][] arr = {{"1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] arr = {{"1", "1", "1", "1s"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            System.out.println(arraySum(arr));
        } catch (MySizeArrayException e)
        {
            e.printStackTrace();
            System.out.println("Размер массива не соответствует заданию");
        }
        catch (MyArrayDataException e)
        {
            e.printStackTrace();
            System.out.println("Элемент массива " + arr[e.getRow()][e.getCol()] + " не соответствует формату: строка "
                    + e.getRow() + " столбец " + e.getCol());
        }

    }

    public static int arraySum(String array[][]) throws MySizeArrayException, MyArrayDataException{
        int sum = 0;
        if (array.length != 4)
        {
            throw new MySizeArrayException();
        }

        for (int i = 0; i < array.length; i++) {
             if (array[i].length != 4)
             {
                 throw new MySizeArrayException();
             }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e)
                {
                    throw new MyArrayDataException("format " + i + " " + j, i, j);
                }
            }
        }
        return sum;
    }

}
