
package alma.hadl.attachement;

public class ProxyRoleAttachement implements ProxyAttachment {
  /**
   * l'attachement distant 
   * @see RemoteAttachement
   */
  private IRemoteAttachement remoteAttachement;

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
  public void update(java.util.Observable o, Object arg) {
    // Bouml preserved body begin 00021907
    // Bouml preserved body end 00021907
  }

}
