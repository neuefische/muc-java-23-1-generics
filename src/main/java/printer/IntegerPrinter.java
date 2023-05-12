package printer;

public class IntegerPrinter {

    private Integer stuffToPrint;

    public IntegerPrinter(Integer stuffToPrint) {
        this.stuffToPrint = stuffToPrint;
    }

    public void print() {
        System.out.println("*** Hier kommt die Zahl " + stuffToPrint + " ***");
    }
}
