package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Treino;

public interface TreinoRepository extends JpaRepository<Treino, String>{

	List<Treino> findByTreino(String nomeTreino);

	Treino getOne(long id);

}
