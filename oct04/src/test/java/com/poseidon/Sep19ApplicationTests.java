package com.poseidon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sep19ApplicationTests {
	@Autowired
	private BoardService boardService;

	@Test
	void contextLoads() {
		Map<String, Object> map = new HashMap<>();
		map.put("title", "title");
		map.put("content", "content");
		map.put("bip", "172.30.1.1");
		map.put("m_id", "poseidon");
		
		int result = boardService.write(map);
		assertEquals(1, result);
		
	}

}
