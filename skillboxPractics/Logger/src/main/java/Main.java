import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        int x = 10;
        logger.info("x = {}", x);

        logger.debug("Debug message is written in console");
        logger.info("Info message is written to stdout.log");
        logger.error("Error message is written to stderr.log");
    }
}
