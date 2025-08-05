package try_1.interfaces;

public class SimplePrinter2 implements Printer{
    @Override
    public void printBlackAndWhite() {
        System.out.println("Print black and white");
    }

    @Override
    public void printColor() {
        System.out.println("Print more color");
    }
}
