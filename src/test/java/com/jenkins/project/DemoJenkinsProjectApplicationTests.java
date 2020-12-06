package com.jenkins.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkinsProjectApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(DemoJenkinsProjectApplication.class);
	
	@Test
	void contextLoads() {
			logger.info("Tests case executing...");
			assertEquals(true, true);
	}

}
