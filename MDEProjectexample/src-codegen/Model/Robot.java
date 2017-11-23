// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Model;

import Controller.Observer;
import Model.IMission;
import Model.IRobot;
import Model.State;
import Model.Strategy;
import java.awt.Point;
import java.lang.String;
import java.util.List;

/************************************************************/
/**
 * 
 */
public class Robot implements IRobot {
	
	public Robot(String name, Point position, Strategy strategy, State state, IMission mission) {
		this.name = name;
		this.position = position;
		this.strategy = strategy;
		this.state = state;
		this.mission = mission;
	}
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Point position;
	/**
	 * 
	 */
	private Strategy strategy;
	/**
	 * 
	 */
	private State state;
	/**
	 * 
	 */
	private IMission mission;
	/**
	 * 
	 */
	private List<Observer> observers;

	/**
	 * 
	 * @return 
	 */
	public Point getPosition() {
		return this.position;
	}

	/**
	 * 
	 * @return 
	 */
	public Strategy getStrategy() {
		return this.strategy;
	}

	/**
	 * 
	 */
	private void move() {
	}

	/**
	 * 
	 * @return 
	 */
	public String getState() {
		return this.state.toString();
	}

	/**
	 * 
	 * @return 
	 */
	public IMission getMission() {
		return this.mission;
	}

	/**
	 * 
	 * @return 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param mission 
	 */
	public void setMission(IMission mission) {
		this.mission = mission;
	}

	/**
	 * 
	 * @param strategy 
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 
	 * @param position 
	 */
	public void setPosition(Point position) {
		this.position = position;
	}

	/**
	 * 
	 */
	public void notifyAllObservers() {
	}

	/**
	 * 
	 * @param observer 
	 */
	public void attach(Observer observer) {
		
	}
};
