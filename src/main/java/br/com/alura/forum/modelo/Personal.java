package br.com.alura.forum.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Personal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private String senha;
	private Date dt_nascimento;
	@Enumerated(EnumType.STRING)
	private PersonalDisponibilidade disponibilidade = PersonalDisponibilidade.TARDE;
	private long cep; 
	private String estado;
	private String cidade;
	private String logradouro;
	private String bairro;
	private int numero;
	@OneToMany
	private Usuario usuario;
	
	public Personal() {}
	
	
	
	public Personal(String nome, String cpf, String senha, Date dt_nascimento, long cep, String estado, String cidade,
			String logradouro, String bairro, int numero) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.dt_nascimento = dt_nascimento;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
	public PersonalDisponibilidade getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(PersonalDisponibilidade disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
