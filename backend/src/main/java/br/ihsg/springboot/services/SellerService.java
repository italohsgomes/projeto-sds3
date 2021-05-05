package br.ihsg.springboot.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ihsg.springboot.dto.SellerDTO;
import br.ihsg.springboot.entities.Seller;
import br.ihsg.springboot.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll(){
		List<Seller> listaSellerEnt = sellerRepository.findAll();
		
		return listaSellerEnt.stream().map(x -> new SellerDTO(x)).collect( Collectors.toList() );
	}
	
	public SellerDTO findById(Long idSeller) {
		return new SellerDTO( sellerRepository.getOne(idSeller) );
	}
	
}
