package br.ihsg.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ihsg.springboot.dto.SaleDTO;
import br.ihsg.springboot.dto.SaleSuccessDTO;
import br.ihsg.springboot.dto.SaleSumDTO;
import br.ihsg.springboot.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		return ResponseEntity.ok( saleService.findAll(pageable) );
	}
	

	@GetMapping("/amountBySeller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
		return ResponseEntity.ok( saleService.amountGroupedBySeller() );
	}
	
	@GetMapping("/successBySeller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller(){
		return ResponseEntity.ok( saleService.successGroupBySeller() );
	}
	
}
