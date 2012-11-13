
package alma.hadl.attachement;

import alma.hadl.connection.IAttachement;

/**
 * Attachement detenu par une Configuration
 * @see Configuration
 */
public interface RealAttachement extends IAttachement {
	/**
	 * This method is called whenever the observed object is changed. An
	 * application calls an <tt>Observable</tt> object's
	 * <code>notifyObservers</code> method to have all the object's
	 * observers notified of the change.
	 * 
	 * @param   o     the observable object.
	 * @param   arg   an argument passed to the <code>notifyObservers</code>
	 *                 method. 
	 */
	void update(java.util.Observable o, Object arg) ;

}
