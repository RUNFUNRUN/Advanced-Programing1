 public class PrintErrorLog extends PrintLog {
    private int number;
    public PrintErrorLog(int number) {
        this.number = number;
    }

    public String print() {
        return "Error! number: " + number + "\n";
    }
}

