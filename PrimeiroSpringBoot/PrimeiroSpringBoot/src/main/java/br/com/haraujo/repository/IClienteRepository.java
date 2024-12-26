package br.com.haraujo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.haraujo.domain.Cliente;



@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
