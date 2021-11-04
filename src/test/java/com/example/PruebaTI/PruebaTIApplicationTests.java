package com.example.PruebaTI;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.PruebaTI.dao.UsuarioDAO;
import com.example.PruebaTI.entitys.Usuario;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaTIApplicationTests {
    
/*	@Autowired
	private UsuarioDAO repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
		
    @Test
	private void CrearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(1);
		us.setNombre(encoder.encode("Usu1"));
		us.setClave("213");
		
		Usuario retorno = repo.save(us);  
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
		
	}
*/
    
}
