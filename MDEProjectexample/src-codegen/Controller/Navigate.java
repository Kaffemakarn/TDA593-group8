// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Controller;

import Controller.Observer;
import Model.Adapt;
import Model.Area;
import Model.IRobot;
import project.AbstractRobotSimulator;
import project.Point;

import java.util.LinkedList;
import java.util.List;

/************************************************************/
/**
 * 
 */
public class Navigate implements Observer {
	/**
	 * 
	 */
	private Adapt adapt;
	/**
	 * 
	 */
	private IRobot robot;
	/**
	 * 
	 */
	private List<Area> areas;

	/**
	 * 
	 */
	public void stop() {
	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	public void move() throws InterruptedException {
		List<Point> strategy = robot.getStrategy().getPoints(); //Wrong type of Point is returned
		
		List<Area> areaOrder = new LinkedList<Area>();
		for(Point point : strategy) {
			areaOrder.add(getArea(point));
		}
		
		acquireAreas(areaOrder);
		
		for(Point point : strategy) {
			robot.setPosition(point);
			while( ! (robot.getRobot().isAtPosition(point)) {
				
			}
			robot.getStrategy().isAtDestination();
		}
		
		for(Area area : areaOrder) {
			area.getLocationController().release(robot.getRobot());
		}
		
		
	}
	

	private synchronized void acquireAreas(List<Area> areaOrder) throws InterruptedException {
		for(Area area : areaOrder) {
			
			while( !area.getLocationController().tryAcquire(robot.getRobot())) { //Robot needs to extend AbstractRobotSimulator
			}
		}
	}
	
	private Area getArea(Point point) {
		for(Area area: areas) {
			//Perhaps the point that one want to visit is not necessarily the centre.
			//Then instead check for if the point is within the area.
			if(point.equals(area.getCenterPoint())) {
				return area;
			}
		}
		
		return null;
		
	}

	/**
	 * 
	 * @param robot 
	 */
	public void update(IRobot robot) {
	}

	/**
	 * 
	 */
	public void waitForArrival() {
	}
};