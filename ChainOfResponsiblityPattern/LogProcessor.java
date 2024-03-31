public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLogProcesser;

    LogProcessor(LogProcessor logProcessor) {

        this.nextLogProcesser = logProcessor;
    }

    public void log(int logLevel , String message) {
        if(nextLogProcesser!=null){
              nextLogProcesser.log(logLevel, message);
        }
    }

}