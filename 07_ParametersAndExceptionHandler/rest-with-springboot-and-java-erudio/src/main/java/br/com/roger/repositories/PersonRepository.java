package br.com.roger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.roger.model.Person;

// Esse repositório gera um crud básico pronto para ser utilizado
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	// extende JpaRepository do tipo do objeto e o tipo do ID
	// nessa classe está toda a 'mágica' do springobject
}
