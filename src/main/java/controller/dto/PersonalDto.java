package controller.dto;

import java.util.Date;

import br.com.alura.forum.modelo.Personal;


public class PersonalDto {

	private String nome;
	private String cpf;
	private String senha;
	private Date dt_nascimento;
	private long cep; 
	private String estado;
	private String cidade;
	private String logradouro;
	private String bairro;
	private int numero;
	
	public PersonalDto(Personal personal) {
		this.nome = personal.getNome();
		this.cpf = personal.getCpf();
		this.senha = personal.getSenha();
		this.dt_nascimento = personal.getDt_nascimento();
		this.cep = personal.getCep();
		this.estado = personal.getEstado();
		this.cidade = personal.getCidade();
		this.logradouro = personal.getLogradouro();
		this.bairro = personal.getNome();
		this.numero = personal.getNumero();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSenha() {
		return senha;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public long getCep() {
		return cep;
	}
	public String getEstado() {
		return estado;
	}
	public String getCidade() {
		return cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public int getNumero() {
		return numero;
	}
	
	
}
