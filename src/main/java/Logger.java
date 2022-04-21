import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Logger {
    protected int num = 1;
    protected List<String> logList = new ArrayList<>();

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        logList.add("[" + timeStamp + " " + num++ + "] " + msg);
    }

    public void showLog() {
        logList.forEach(System.out::println);
    }
}