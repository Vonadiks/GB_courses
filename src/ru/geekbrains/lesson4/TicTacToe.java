package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = '0';

    public static char[][] map;
    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap()
    {
       map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap()
    {
        for (int i = 0; i <= SIZE; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++)
        {
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symb)
    {


        // заполняем строку stringToWin выигрышной комбинацией,
        // с которой будем сравнивать (например, при DOTS_TO_WIN = 4 будут строки "XXXX" или "OOOO")

        String stringToWin = null;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            stringToWin += symb;
        }

        // ищем выигрышную комбинацию в строках и столбцах

        boolean checkRowsCols = false;
        for (int i = 0; i < SIZE; i++)
        {
            String tempRowsString = null;
            String tempColsString = null;
            for (int j = 0; j < SIZE; j++) {
                tempRowsString += map[i][j];
                tempColsString += map[j][i];
            }
            if (tempRowsString.contains(stringToWin) || tempColsString.contains(stringToWin))
            {
                checkRowsCols = true;
                break;
            }
        }

        // формируем строки из диагоналей для дальнейщего сравнения с выигрышной комбинацией

        String stringRightDiag = null;
        String stringLeftDiag = null;
        for (int i = 0; i < SIZE; i++)
        {
            stringRightDiag += map[i][i];
            stringLeftDiag += map[i][map[i].length - 1 - i];
        }

        return (checkRowsCols || stringRightDiag.contains(stringToWin) || stringLeftDiag.contains(stringToWin));
    }
}
