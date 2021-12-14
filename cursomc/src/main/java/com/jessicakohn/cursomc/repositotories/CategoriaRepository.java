package com.jessicakohn.cursomc.repositotories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jessicakohn.cursomc.domain.Categoria;

//realiza operações de acesso a dados
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	
}
