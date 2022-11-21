 public class PrintNormalLog extends PrintLog {
    private int number;
    public PrintNormalLog(int number) {
        this.number = number;
    }

    public String print() {
        return "Successful! number:" + number + "\n";
    }
}

