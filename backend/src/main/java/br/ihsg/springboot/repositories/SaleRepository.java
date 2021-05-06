package br.ihsg.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.ihsg.springboot.dto.SaleSuccessDTO;
import br.ihsg.springboot.dto.SaleSumDTO;
import br.ihsg.springboot.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new br.ihsg.springboot.dto.SaleSumDTO(retorno.seller, SUM(retorno.amount)) "
			+ "FROM Sale AS retorno "
			+ "GROUP BY retorno.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new br.ihsg.springboot.dto.SaleSuccessDTO(retorno.seller, SUM(retorno.visited), SUM(retorno.deals)) "
			+ "FROM Sale AS retorno "
			+ "GROUP BY retorno.seller")
	List<SaleSuccessDTO> successGroupBySeller();

}
