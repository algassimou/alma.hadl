
package alma.hadl.interfaces;

public interface Data<Type extends java.io.Serializable> extends Interface {
  /**
   * @return le nom de l'interface
   */
  String getNom() ;
  
  /**
   * Ecrit une donnée dans la data
   * @param t la donnée a ecrire
   */
  public void ecrire (Type t) ;
  
  /**
   * lit une donnée apartir de la data
   * @return la donnée lut
   */
  public Type lire () ;

}
