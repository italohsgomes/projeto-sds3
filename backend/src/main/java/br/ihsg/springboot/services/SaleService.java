package br.ihsg.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ihsg.springboot.dto.SaleDTO;
import br.ihsg.springboot.dto.SaleSuccessDTO;
import br.ihsg.springboot.dto.SaleSumDTO;
import br.ihsg.springboot.entities.Sale;
import br.ihsg.springboot.repositories.SaleRepository;
import br.ihsg.springboot.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	@Transactional(readOnly = true) //NAO FAZ LOCK NO BD
	public Page<SaleDTO> findAll(Pageable pageable){
		
		//SOLUCAO SO DEVE SER USADA APENAS QUANDO SE TEM UMA QUANTIDADE PEQUENA DE RETORNO
		//SO BUSCARA A LISTA DE VENDEDORES UMA VEZ, REALIZANDO UM CACHE
		sellerRepository.findAll();
		
		Page<Sale> listaSale = saleRepository.findAll(pageable);
		
		return listaSale.map( x -> new SaleDTO(x) );
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	}

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupBySeller(){
		return saleRepository.successGroupBySeller();
	}

}
