package printer;

public class DoublePrinter {

    private Double stuffToPrint;

    public DoublePrinter(Double stuffToPrint) {
        this.stuffToPrint = stuffToPrint;
    }

    public void print() {
        System.out.println("*** Hier kommt die Zahl " + stuffToPrint + " ***");
    }
}
