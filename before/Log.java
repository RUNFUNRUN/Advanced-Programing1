public class Log {

    String logtxt;

    public Log(){
        logtxt = "";
    }

    public void recordLog(int number) {
        if(number > 0){
            PrintNormalLog printNormalLog = new PrintNormalLog(number);
            logtxt += printNormalLog.print();
        } else {
            PrintErrorLog printErrorLog = new PrintErrorLog(number);
            logtxt += printErrorLog.print();
        }
    }

    public String viewLog(){
        return logtxt;
    }
}

