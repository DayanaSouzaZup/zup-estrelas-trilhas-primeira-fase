package br.com.zup.estrelas.desafioTrilhas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.estrelas.desafioTrilhas.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {

	// TODO
	// Por que precisa usar uma interface?
	// E por que usar um Long?

}
