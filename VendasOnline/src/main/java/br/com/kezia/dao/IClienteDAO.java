/**
 * 
 */
package br.com.kezia.dao;

import java.util.List;

import br.com.kezia.dao.generic.IGenericDAO;
import br.com.kezia.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
