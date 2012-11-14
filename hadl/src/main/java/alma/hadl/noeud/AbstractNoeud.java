package alma.hadl.noeud;

import java.util.List;

import alma.hadl.interfaces.Data;

public abstract class AbstractNoeud implements Noeud {
	/**
	 * l'identifiant d'un noeud
	 */
	protected int id ;

	/**
	 * @return l'identifiant d'un noeud
	 */
	public int getId() {
		// TODO Auto-generated method stub
		return this.id ;
	}

	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id ;
	}

	/**
	 * La liste des interfaces datas
	 * On utilise une liste mais faudrait changer de structure de données pour rendre la recherche efficace
	 * cela doit être fait dans un second temps
	 */
	protected List<Data<?>> interfaceDatas ;
	/**
	 * Pour un noeud renvoie l'une des ces interfaces dont le nom est passé en paramètre
	 * @param nom : le nom de l'interface data
	 * @return l'interface data
	 */
	public Data<?> getData (String nom) {
		for (Data<?> d : this.interfaceDatas) {
			if (d.getNom().equals(nom))
				return d ;
		}
		
		return null ;
	}



}
