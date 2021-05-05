package br.ihsg.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ihsg.springboot.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
