package services;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class MrRobot {
    private static final int ROBOT_DELAY = 1500;

    private MrRobot() {
    }

    public static void callRobotAndPaste(String pathToKeys) {
        try {
            Robot robot = new Robot();
            StringSelection path = new StringSelection(pathToKeys);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
            robot.delay(ROBOT_DELAY);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(ROBOT_DELAY);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            //add damn logger
        }
    }
}
