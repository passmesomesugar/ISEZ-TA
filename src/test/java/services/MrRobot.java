package services;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MrRobot {
    private static final int ROBOT_DELAY = 1000;

    private MrRobot() {
    }


    public static void pressDownAndEnter() {
        try {
            Robot robot = new Robot();
            robot.delay(ROBOT_DELAY);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e) {
        }
    }
}
