package br.ihsg.springboot.dto;

import java.io.Serializable;

import br.ihsg.springboot.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	
	private static final long serialVersionUID = 5022267446388477986L;
	
	private String sellerName;
	private Long visited;
	private Long deals;
	
	
	
	/** CONSTRUTORES **/
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}


	/** GETS/SETS **/
	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public Long getVisited() {
		return visited;
	}


	public void setVisited(Long visited) {
		this.visited = visited;
	}


	public Long getDeals() {
		return deals;
	}


	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
	
	
	
	


}
