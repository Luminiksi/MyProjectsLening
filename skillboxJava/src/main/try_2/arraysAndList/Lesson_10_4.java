package main.try_2.arraysAndList;

import main.try_2.myFeatures.Printer;

public class Lesson_10_4 {

    public static void run() {
        Printer.printLessonNumber(4, 10);
        Printer.printLessonName("Многомерные массивы");

        Printer.printTaskNumber(1);
        Printer.printTaskName("Шахмантная доска");
        task1();
    }

    public static void task1() {
        Figure[][] board = new Figure[8][8];
        //расставим первую линию фигур
        board[0] = new Figure[]{
                new Figure(FigureType.ROOK, FigureColor.WHITE),
                new Figure(FigureType.HORSE, FigureColor.WHITE),
                new Figure(FigureType.ELEPHANT, FigureColor.WHITE),
                new Figure(FigureType.KING, FigureColor.WHITE),
                new Figure(FigureType.QUEEN, FigureColor.WHITE),
                new Figure(FigureType.ELEPHANT, FigureColor.WHITE),
                new Figure(FigureType.HORSE, FigureColor.WHITE),
                new Figure(FigureType.ROOK, FigureColor.WHITE)
        };
        //вторая линия - с пешками
        board[1] = new Figure[8];
        //пердпоследняя линия - с пешками
        board[6] = new Figure[8];
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Figure(FigureType.PAWN, FigureColor.WHITE);
            board[6][i] = new Figure(FigureType.PAWN, FigureColor.BLACK);
        }
        //последняя линия фигур
        board[7] = new Figure[]{
                new Figure(FigureType.ROOK, FigureColor.BLACK),
                new Figure(FigureType.HORSE, FigureColor.BLACK),
                new Figure(FigureType.ELEPHANT, FigureColor.BLACK),
                new Figure(FigureType.KING, FigureColor.BLACK),
                new Figure(FigureType.QUEEN, FigureColor.BLACK),
                new Figure(FigureType.ELEPHANT, FigureColor.BLACK),
                new Figure(FigureType.HORSE, FigureColor.BLACK),
                new Figure(FigureType.ROOK, FigureColor.BLACK)
        };

        //заполним пустую доску
        for (int i = 2; i < 6; i++) {
            board[i] = new Figure[8];
        }

        //отображение шахматной доски
        for (int row = 0; row < 8; row++) {
            for (int cell = 0; cell < 8; cell++) {
                Figure figure = board[row][cell];
                System.out.print(figure == null ? "--" : figure);
                System.out.print(cell < 7 ? " " : "\n");
            }
        }
    }
}
