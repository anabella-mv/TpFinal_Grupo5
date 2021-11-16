package ar.edu.unju.edm.poo.principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unju.edm.poo.dominio.ClienteP;

public class Principal {

 public static EntityManagerFactory emf;
 public static EntityManager manager;
 public static void main(String[] args) {
	    
	 //realizar la conexion con la definicion de la unidad de persitencia
	 emf = Persistence.createEntityManagerFactory("TestPersistence");
	 manager = emf.createEntityManager();
	 ClienteP clienteP1 = new ClienteP("Juan","Juarez","jjuan@gmail.com",12345,123456);
     manager.getTransaction().begin();
     manager.persist(clienteP1);
     manager.getTransaction().commit();
     
 }
}
