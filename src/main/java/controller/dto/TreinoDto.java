package controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Treino;

public class TreinoDto {

	private String nome_treino;
	
	public TreinoDto(Treino treino) {
		this.nome_treino = treino.getNome_Treino();
	}
	
	public String getNome_treino() {
		return nome_treino;
	}

	public static List<TreinoDto> converter(List<Treino> treino) {
		
		return treino.stream().map(TreinoDto::new).collect(Collectors.toList());
	}
	
	
}
