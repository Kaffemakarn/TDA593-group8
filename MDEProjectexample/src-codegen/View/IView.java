// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package View;

import java.lang.String;

import project.Point;

/************************************************************/
/**
 * 
 */
public interface IView {
	/**
	 * 
	 */
	public void updateView();

	/**
	 * 
	 * @param robot 
	 * @param state 
	 */
	public void updateState(String robot, String state);

	/**
	 * 
	 * @param robot 
	 * @param x 
	 * @param y 
	 */
	public void updatePosition(String robot, Point position);

	/**
	 * 
	 * @param robot 
	 * @param mission 
	 */
	public void updateMission(String robot, String mission);
};
