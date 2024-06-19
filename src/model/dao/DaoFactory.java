package model.dao;


import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	/* Dessa forma a classe ~DaoFactory expõe um método que retorna o tipo da interface, mas internamente ela instancia uma implementação,
	   não precisando, assim, expor a implementação.
	   Faz injeção de dependência sem explicitar a implementação.
	*/
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
