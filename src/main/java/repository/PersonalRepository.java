package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Personal;

public interface PersonalRepository extends JpaRepository<Personal, String>{

}
