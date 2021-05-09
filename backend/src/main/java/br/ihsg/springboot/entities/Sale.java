package br.ihsg.springboot.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //TEST
//	@GeneratedValue(strategy = GenerationType.SEQUENCE) //DEV
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	
	/** CONSTRUTORES **/
	public Sale() {}

	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate data, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.data = data;
		this.seller = seller;
	}

	
	/** GETS/SETS **/
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

	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	
}
