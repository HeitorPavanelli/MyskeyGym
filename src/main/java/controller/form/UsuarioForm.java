package controller.form;

import java.util.Date;

import br.com.alura.forum.modelo.Usuario;
import repository.UsuarioRepository;


public class UsuarioForm {

	private String nome;
	private String email;
	private String senha;
	private double peso;
	private Date dt_nascimento;
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Usuario converter(UsuarioRepository usuarioRepository) {
		
		return new Usuario(nome, email, senha, peso, dt_nascimento, cpf);
	}
	
}
