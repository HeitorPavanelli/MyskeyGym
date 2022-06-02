package br.com.alura.forum.modelo;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome_cartao;
	private long numero_cartao;
	private Date dataValidade;
	private int cvv;
	
	public String getNome_cartao() {
		return nome_cartao;
	}
	public void setNome_cartao(String nome_cartao) {
		this.nome_cartao = nome_cartao;
	}
	public long getNumero_cartao() {
		return numero_cartao;
	}
	public void setNumero_cartao(long numero_cartao) {
		this.numero_cartao = numero_cartao;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
}
