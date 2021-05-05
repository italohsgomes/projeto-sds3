package br.ihsg.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ihsg.springboot.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
