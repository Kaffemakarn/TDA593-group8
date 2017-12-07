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
	 * @param point 
	 */
	public void updatePosition(String robot, Point point);

	/**
	 * 
	 * @param robot 
	 * @param mission 
	 */
	public void updateMission(String robot, String mission);
};
