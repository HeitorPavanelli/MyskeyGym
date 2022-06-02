package controller.dto;

import java.util.Date;

import br.com.alura.forum.modelo.Usuario;

public class UsuarioDto {

	private String nome;
	private String email;
	private String senha;
	private double peso;
	private Date dt_nascimento;
	private String cpf;
	
	public UsuarioDto(Usuario usuario) {
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
		this.peso = usuario.getPeso();
		this.dt_nascimento = usuario.getDt_nascimento();
		this.cpf = usuario.getCpf();
	}
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public double getPeso() {
		return peso;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	
	
}
