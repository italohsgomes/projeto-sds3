package br.ihsg.springboot.dto;

import java.io.Serializable;

import br.ihsg.springboot.entities.Seller;

public class SaleSumDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1034388002605721334L;
	
	
	private String sellerName;
	private Double sum;
	
	
	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public Double getSum() {
		return sum;
	}


	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	

}
