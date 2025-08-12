package main.try_1.functionalProgramming.lesson2;

import main.try_1.functionalProgramming.lesson2.other.Paper;

public class MyNonGenericPaperHandler implements GarbageHandler<Paper, MyPaperHandlerMethod>{
    @Override
    public void handle(Paper what, MyPaperHandlerMethod how) {
//        Тут всякая логика
    }
}
