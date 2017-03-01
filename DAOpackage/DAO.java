package DAOpackage;

import java.sql.Connection;

public abstract class DAO<T> {

	protected Connection connect = null;
	
	public DAO(Connection c){
		this.connect = c;
	}
	
	// m�thode abstraite pour cr�er un �lement
	public abstract <O> void create(O o);
	
	// m�thode abstraite pour cr�er un �lement
	public abstract <O> void remove(O o);
	
	// m�thode abstraite pour mettre � jour un �lement
	public abstract <O> void update(O o);
	
	// m�thode abstraite pour trouver un �lement � partir d'un id
	public abstract <O> O find(int id);

}
