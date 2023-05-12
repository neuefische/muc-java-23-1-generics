package printer;

public class Printer<Thing> {
    private Thing thingToPrint;

    public Printer(Thing thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}