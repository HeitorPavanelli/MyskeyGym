package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import br.com.alura.forum.modelo.Treino;
import controller.dto.TreinoDto;
import controller.form.AtualizacaoTopicoForm;
import repository.TreinoRepository;

@RestController
public class TreinoController {

	@Autowired
	private TreinoRepository treinoRepository;
	
	//Filtrar os treinos que estao no banco de dados
	@RequestMapping(value="/treino", method = RequestMethod.GET)
	public List<TreinoDto> lista(String nomeTreino){
		if(nomeTreino == null) {
			List<Treino> treinos = treinoRepository.findAll();
			return TreinoDto.converter(treinos);
		}else {
			List<Treino> treinos = treinoRepository.findByTreino(nomeTreino);
			return TreinoDto.converter(treinos);
		}	
	}
	
	//Atualiza algum treino no banco de dados
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<TreinoDto> atualizar(@PathVariable Long id, AtualizacaoTopicoForm form) {
			Treino treino = form.atualizar(id, treinoRepository);
			return ResponseEntity.ok(new TreinoDto(treino));
	    }
}
