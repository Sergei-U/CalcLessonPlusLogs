import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author Sergei Usov
 * @version 1.0.0
 */
public class TestLogs {
    private static final Logger log = (Logger) LogManager.getLogger(TestLogs.class);
    public static void main(String[] args){
        log.info("Это информационное сообщение!");
        log.error("Это сообщение ошибки");
    }
}

