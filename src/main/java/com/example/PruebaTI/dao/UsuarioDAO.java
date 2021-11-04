package com.example.PruebaTI.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PruebaTI.entitys.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Long>{
 Usuario findByNombre(String nombre); 
	
}
