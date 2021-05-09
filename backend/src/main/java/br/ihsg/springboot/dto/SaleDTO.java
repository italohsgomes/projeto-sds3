package br.ihsg.springboot.dto;

import java.io.Serializable;
import java.time.LocalDate;

import br.ihsg.springboot.entities.Sale;

public class SaleDTO implements Serializable{
	
	private static final long serialVersionUID = -8520652185437980295L;
	
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate data;
	
	private SellerDTO sellerDTO;


	
	/** CONSTRUTORES **/
	
	public SaleDTO() {
	}



	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate data, SellerDTO sellerDTO) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.data = data;
		this.sellerDTO = sellerDTO;
	}
	
	public SaleDTO(Sale saleEnt) {
		id = saleEnt.getId();
		visited = saleEnt.getVisited();
		deals = saleEnt.getDeals();
		amount = saleEnt.getAmount();
		data = saleEnt.getData();

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
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}


	public SellerDTO getSellerDTO() {
		return sellerDTO;
	}
	public void setSellerDTO(SellerDTO sellerDTO) {
		this.sellerDTO = sellerDTO;
	}

}
