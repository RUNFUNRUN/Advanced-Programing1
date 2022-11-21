public class PrintErrorLog {
    int number;
    PrintErrorLog(int number){
        this.number = number;
    }

    public String print(){
        return "Error! number: " + number + "\n";
    }
}

