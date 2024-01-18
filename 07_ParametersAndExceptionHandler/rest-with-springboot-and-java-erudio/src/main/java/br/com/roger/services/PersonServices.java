package br.com.roger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.roger.model.Person;

// springboot encara essa classe como objeto que será injetado em runtime na aplicação
// permite utilizar um @Autowired
@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	// método findAll() retorna todos os objetos em uma lista de person;
	// será gerado um loop para todas essas pessoas
	public List<Person> findAll() {
		logger.info("Finding all people!");
		// declara a listagem das pessoas
		// nesse instante seria acessado o banco de dados
		List<Person> persons = new ArrayList<>();
		// itera sobre o array alimentando a lista
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}

	// método findById retorna somente 1 objeto de person com o ID desejado;
	// no momento retorna somente o mock
	public Person findById(String id) {
		
		logger.info("Finding one person!");
		
		Person person = new Person();
		
		// nesse instante seria acessado o banco de dados
		// criação do mock
		// definição do id
		person.setId(counter.incrementAndGet());
		person.setFirstName("Rogerio");
		person.setLastName("Peres");
		person.setAddress("Maringá - Paraná - Brasil");
		person.setGender("Masculino");
		
		return person;
		
	}
	
	public Person create(Person person) {
		logger.info("Creating one person");
		// o banco de dados seria acessado aqui
		
		
		return person;
	}
	
	public Person update(Person person) {
		logger.info("Updating one person");
		// o banco de dados seria acessado aqui
		
		return person;
	}
	
	public void delete(String id) {
		logger.info("Deleting one person");
		// o banco de dados seria acessado aqui
		
	}
	
	private Person mockPerson(int i) {
		
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Last name " + i);
		person.setAddress("Some address in Brazil");
		person.setGender("Masculino");
		
		return person;
		
	}
}
