package de.hzjade.spring5webapp.repositories;

import de.hzjade.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
