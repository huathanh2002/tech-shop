package edu.poly.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.poly.hello.domain.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
