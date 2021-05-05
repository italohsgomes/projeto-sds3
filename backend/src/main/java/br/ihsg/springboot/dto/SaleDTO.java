package br.ihsg.springboot.dto;

import java.io.Serializable;
import java.time.LocalDate;

import br.ihsg.springboot.entities.Sale;

public class SaleDTO implements Serializable{
	
	private static final long serialVersionUID = 1170434744760254111L;
	
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO sellerDTO;


	
	/** CONSTRUTORES **/
	
	public SaleDTO() {
	}



	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO sellerDTO) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.sellerDTO = sellerDTO;
	}
	
	public SaleDTO(Sale saleEnt) {
		id = saleEnt.getId();
		visited = saleEnt.getVisited();
		deals = saleEnt.getDeals();
		amount = saleEnt.getAmount();
		date = saleEnt.getDate();

		sellerDTO = new SellerDTO(saleEnt.getSeller());
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}
	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}
	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public SellerDTO getSellerDTO() {
		return sellerDTO;
	}
	public void setSellerDTO(SellerDTO sellerDTO) {
		this.sellerDTO = sellerDTO;
	}

}
