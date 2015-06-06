package fr.utbm.vi51.project.eurock.GUI.Graphics;

import javax.swing.JComponent;


/**
 * 
 */
public abstract class AbstractComponent extends JComponent implements IComponent {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6626611481668980674L;
	/**
     * 
     */
	protected int posX, posY;
    public AbstractComponent() {
    }

    public abstract JComponent getSwingComponent();
}