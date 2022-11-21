public class Main {
    public static void main(String[] args) {
        Log logtxt = Log.getLog();
        logtxt.recordLog(3);
        logtxt.recordLog(2);
        logtxt.recordLog(1);
        logtxt.recordLog(0);
        logtxt.recordLog(-1);
        logtxt.recordLog(-2);
        logtxt.recordLog(-3);
        System.out.println(logtxt.viewLog());
    }
}

