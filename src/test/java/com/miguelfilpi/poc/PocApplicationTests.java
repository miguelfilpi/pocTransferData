package com.miguelfilpi.poc;

import com.miguelfilpi.poc.service.TransferService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootTest
class PocApplicationTests {

	@Test
	public static void testeToken() throws URISyntaxException, IOException, InterruptedException {
		TransferService transferService = new TransferService();
		transferService.retrieveBearerToken();
	}


}
