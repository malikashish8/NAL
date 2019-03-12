import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.AWTException;

public class NAL {
	public static void main(String args[]) throws AWTException, InterruptedException {
		final int INTERVAL = 2*60*1000; // Default INTERVAL=2 min
		Point current;
		Robot robot = new Robot();
		while(true) {
			current = MouseInfo.getPointerInfo().getLocation();
			double x = current.getX();
			double y = current.getY();
			double newX = (x > 0) ? x-1 : x + 100;
			robot.mouseMove((int)newX, (int) y);
			System.out.printf("Moved to %d, %d\n", (int)newX, (int)y);
			Thread.sleep(INTERVAL);
		}
	}
}
