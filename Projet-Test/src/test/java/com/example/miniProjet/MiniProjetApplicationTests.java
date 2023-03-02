package com.example.miniProjet;

import com.example.miniProjet.dto.ClientGetDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.miniProjet.Entity.ClientEntity;


@SpringBootTest
class MiniProjetApplicationTests {

	@Test
	void contextLoads() {
		ClientGetDto clientEntity = new ClientGetDto();
		clientEntity.getAge();

	}

}
