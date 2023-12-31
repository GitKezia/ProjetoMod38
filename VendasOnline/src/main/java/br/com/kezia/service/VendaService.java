/**
 * 
 */
package br.com.kezia.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.kezia.dao.IVendaDAO;
import br.com.kezia.domain.Venda;
import br.com.kezia.domain.Venda.Status;
import br.com.kezia.exceptions.DAOException;
import br.com.kezia.exceptions.TipoChaveNaoEncontradaException;
import br.com.kezia.services.generic.GenericService;


@Stateless
public class VendaService extends GenericService<Venda, Long> implements IVendaService {

	IVendaDAO dao;
	
	@Inject
	public VendaService(IVendaDAO dao) {
		super(dao);
		this.dao = dao;
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		venda.setStatus(Status.CONCLUIDA);
		dao.finalizarVenda(venda);
	}

	@Override
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		venda.setStatus(Status.CANCELADA);
		dao.cancelarVenda(venda);
	}

	@Override
	public Venda consultarComCollection(Long id) {
		return dao.consultarComCollection(id);
	}

	@Override
	public Venda cadastrar(Venda entity) throws TipoChaveNaoEncontradaException, DAOException {
		entity.setStatus(Status.INICIADA);
		return super.cadastrar(entity);
	}
	
	

}
