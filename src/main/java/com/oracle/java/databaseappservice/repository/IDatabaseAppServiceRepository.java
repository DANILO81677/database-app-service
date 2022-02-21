package com.oracle.java.databaseappservice.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.oracle.java.databaseappservice.entity.Passagem;

public interface IDatabaseAppServiceRepository extends CrudRepository<Passagem, Integer>{
	
	List<Passagem> findAll ();

}
