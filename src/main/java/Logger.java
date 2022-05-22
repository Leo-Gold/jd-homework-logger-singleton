import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger;

    private Logger() {
    }

    private final SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");


    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        StringBuilder result = new StringBuilder();
        result.append('[').append(formater.format(new Date())).append(' ').append(num++).append("] ").append(msg);
        System.out.println(result.toString());
    }
}