package com.rollingstone.dao.jpa;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.rollingstone.domain.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
	List<Person> findPersonByLastName(String lastName);

    List<Person> findPersonByFirstName(String firstName);

	Page<Person> findAll(Pageable pageable);
}
