package ar.edu.unju.edm.dao.imp;

import javax.persistence.EntityManager;

import ar.edu.unju.edm.config.EmfSingleton;
import ar.edu.unju.edm.dao.IPersonaDao;

public class PersonaDaoImpl implements IPersonaDao{
	private static EntityManager manager = EmfSingleton.getInstance().getEmf().createEntityManager();
	
	

}
