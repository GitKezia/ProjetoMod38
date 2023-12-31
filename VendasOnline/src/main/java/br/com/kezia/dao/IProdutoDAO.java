/**
 * 
 */
package br.com.kezia.dao;

import java.util.List;

import br.com.kezia.dao.generic.IGenericDAO;
import br.com.kezia.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
