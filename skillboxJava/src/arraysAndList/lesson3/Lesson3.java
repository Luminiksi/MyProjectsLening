package arraysAndList.lesson3;

import myFeatures.Printer;

public class Lesson3 {
    public static void run() {
        Printer.printLessonNumber(4, 10);
        Printer.printLessonName("Многомерные массивы");
        Printer.printTaskNumber(1);
        task1();
        System.out.println();
        Printer.printTaskNumber(2);
        task2();
        System.out.println();
        Printer.printTaskNumber(3);
        task3();

        System.out.println();
        System.out.println();
    }

    public static void task1() {
        int[][] numbers = new int[10][];
        numbers[0] = new int[]{5, 10, 15, 20};
    }

    public static void task2() {
        int[][] numbers = {
                {204, 17, 2, -67, 0},
                {34, 29, -5},
                {78, 12, 136, 11, 92, 89},
                {56, 4, 399, 808},
                {0, 321}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task3() {
        Figure[][] board = new Figure[8][8];
        board[0] = new Figure[]{
                new Figure(FigureColor.WHITE, FigureType.ROOK),
                new Figure(FigureColor.WHITE, FigureType.HORSE),
                new Figure(FigureColor.WHITE, FigureType.ELEPHANT),
                new Figure(FigureColor.WHITE, FigureType.KING),
                new Figure(FigureColor.WHITE, FigureType.QUEEN),
                new Figure(FigureColor.WHITE, FigureType.ELEPHANT),
                new Figure(FigureColor.WHITE, FigureType.HORSE),
                new Figure(FigureColor.WHITE, FigureType.ROOK)
        };
        board[1] = new Figure[8];
        board[6] = new Figure[8];
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Figure(FigureColor.WHITE, FigureType.PAWN);
            board[6][i] = new Figure(FigureColor.BLACK, FigureType.PAWN);
        }
        board[7] = new Figure[]{
                new Figure(FigureColor.BLACK, FigureType.ROOK),
                new Figure(FigureColor.BLACK, FigureType.HORSE),
                new Figure(FigureColor.BLACK, FigureType.ELEPHANT),
                new Figure(FigureColor.BLACK, FigureType.KING),
                new Figure(FigureColor.BLACK, FigureType.QUEEN),
                new Figure(FigureColor.BLACK, FigureType.ELEPHANT),
                new Figure(FigureColor.BLACK, FigureType.HORSE),
                new Figure(FigureColor.BLACK, FigureType.ROOK)
        };

        for (int i = 2; i < 6; i++) {
            board[i] = new Figure[8];
        }

        for (int row = 0; row < 8; row++) {
            for (int cell = 0; cell < 8; cell++) {
                Figure figure = board[row][cell];
                System.out.print(figure == null ? "--" : figure);
                System.out.print(cell < 7 ? " " : "\n");
            }
        }
    }
}
