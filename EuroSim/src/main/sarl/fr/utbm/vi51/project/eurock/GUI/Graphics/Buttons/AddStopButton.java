package fr.utbm.vi51.project.eurock.GUI.Graphics.Buttons;

import java.awt.event.ActionEvent;

import fr.utbm.vi51.project.eurock.GUI.Graphics.CardinalSystem;


/**
 * 
 */
public class AddStopButton extends ButtonComponent {

	private static final long serialVersionUID = 7910909377293355346L;

	public AddStopButton(String text, int x, int y, int h, int w, CardinalSystem p) {
		super(text, x, y, h, w, p);
	}

	/**
     * 
     */
	public void action(ActionEvent evt) {
		System.out.println("add test");
	}
}