/**
 * 
 */
package br.com.kezia.service;

import java.util.List;

import br.com.kezia.domain.Cliente;
import br.com.kezia.exceptions.DAOException;
import br.com.kezia.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
