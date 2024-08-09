package logic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogicController {

    private final LogicTask logicTask;

    public LogicController() {
        logicTask = new LogicTask();
    }

    public void bootLogic() {
        log.info("Booting up logic...");
    }

}
