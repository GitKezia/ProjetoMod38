/**
 * 
 */
package br.com.kezia.service;

import java.util.List;

import br.com.kezia.domain.Produto;
import br.com.kezia.services.generic.IGenericService;


public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
