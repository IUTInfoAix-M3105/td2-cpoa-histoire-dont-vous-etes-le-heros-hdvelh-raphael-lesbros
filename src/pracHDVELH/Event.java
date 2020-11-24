/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import java.util.Scanner;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class Event extends NodeMultiple {
	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";

	private GUIManager gui;
	private String data;

	public Event(GUIManager g, String s){
		gui = g;
		data = s;
	}

	public String run() {
		if (!this.hasDaughters())
			return this.data;
		else {
			this.gui.output(this.data);
			getDaughter(Integer.parseInt(getPlayerAnswer())).run();
		}
	}

	/**
	 * @return the playerAnswer
	 */
	public String getPlayerAnswer() {
		return "0";
	}

	/**
	 * @param playerAnswer the playerAnswer to set
	 */
	public void setPlayerAnswer(String playerAnswer) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the reader
	 */
	public Scanner getReader() {
		/* TO BE COMPLETED */
		return null;
	}

	/**
	 * @param reader the reader to set
	 */
	public void setReader(Scanner reader) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the chosenPath
	 */
	public int getChosenPath() {
		/* TO BE COMPLETED */
		return 0;
	}

	/**
	 * @param chosenPath the chosenPath to set
	 */
	public void setChosenPath(int chosenPath) {
		/* TO BE COMPLETED */
	}

	/* Methods */
	/**
	 * @see pracHDVELH.NodeMultiple#getData()
	 */
	public String getData() {
		return data;
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setData(Object)
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @see pracHDVELH.NodeMultiple#getDaughter(int)
	 */
	@Override
	public Event getDaughter(int i) {
		/* TO BE COMPLETED */
		return null;
	}

	/**
	 * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
	 * @param daughter
	 * @param i
	 */
	public void setDaughter(Event daughter, int i) {
		/* TO BE COMPLETED */
	}

	/**
	 * @return the gui
	 */
	public GUIManager getGui() {
		/* TO BE COMPLETED */
		return gui;
	}

	/**
	 * @param gui the gui to set
	 */
	public void setGui(GUIManager gui) {
		this.gui = gui;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		/* TO BE COMPLETED */
		return 0;
	}

	/* Methods */
	/* TO BE COMPLETED */

}

// eof