package com.csi.JenkinsFirst;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class JenkinsFirstApplicationTests {

	@Test
	void contextLoads() {

		log.info("Test Case Executing");
		log.info("Check");

		assertEquals(true,true);

	}

}
