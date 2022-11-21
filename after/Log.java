public class Log {

    private static Log log = new Log();
    
    private String logtxt;

    private Log(){
        logtxt = "";
    }

    public void recordLog(int number) {
        if (number > 0) {
            PrintNormalLog printNormalLog = new PrintNormalLog(number);
            logtxt += printNormalLog.print();
        } else {
            PrintErrorLog printErrorLog = new PrintErrorLog(number);
            logtxt += printErrorLog.print();
        }
    }

    public static Log getLog() {
        return log;
    }

    public String viewLog() {
        return logtxt;
    }
}

