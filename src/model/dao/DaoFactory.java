package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	/* Dessa forma a classe ~DaoFactory expõe um método que retorna o tipo da interface, mas internamente ela instancia uma implementação,
	   não precisando, assim, expor a implementação.
	   Faz injeção de dependência sem explicitar a implementação.
	*/
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
