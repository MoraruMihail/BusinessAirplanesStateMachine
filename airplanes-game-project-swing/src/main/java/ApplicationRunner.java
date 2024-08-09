import config.BeansConfiguration;
import logic.LogicController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class ApplicationRunner {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
        log.info("Context started");
        final LogicController logicController = context.getBean(LogicController.class);
        logicController.bootLogic();
    }

}
