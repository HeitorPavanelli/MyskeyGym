package controller.form;

import br.com.alura.forum.modelo.Treino;
import repository.TreinoRepository;

public class AtualizacaoTopicoForm {

	private String nome_treino;

	public String getNome_treino() {
		return nome_treino;
	}

	public void setNome_treino(String nome_treino) {
		this.nome_treino = nome_treino;
	}

	public Treino atualizar(long id, TreinoRepository treinoRepository) {
		Treino treino = treinoRepository.getOne(id);
		treino.setNome_Treino(this.nome_treino);
		return treino;
	}
	
	
}
