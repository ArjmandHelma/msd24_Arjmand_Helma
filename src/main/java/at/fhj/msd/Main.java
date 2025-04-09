package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
       
        logger.info("It is an Info Message from log4j");
        logger.error("It is an Error Message from log4j");
        
        
        Calculator calculator = new Calculator();
        logger.info("Addition: {}", calculator.add(10, 5));
        logger.info("Subtraction: {}", calculator.minus(10, 5));
        logger.info("Division: {}", calculator.divide(10, 5));
        logger.info("Multiplication: {}", calculator.multiply(10, 5));
    }
}


