package br.ihsg.springboot.dto;

import java.io.Serializable;

import br.ihsg.springboot.entities.Seller;

public class SellerDTO implements Serializable{
	
	private static final long serialVersionUID = 1170434744760254111L;
	
	private Long id;
	private String name;
	
	/** CONSTRUTORES **/
	
	public SellerDTO() {
	}
	
	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SellerDTO(Seller sellerEnt) {
		id = sellerEnt.getId();
		name = sellerEnt.getName();		
	}

	
	/** GETS/SETS **/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
