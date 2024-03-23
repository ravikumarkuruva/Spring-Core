package com.app.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestPropertySource("classpath:application.properties")
class PatientMiniProject3ApplicationTests {
	@Autowired
	private MockMvc mockmvc;
	@Test
	@Order(1)
	@DisplayName("TESTING SAVE OPERATION :-")
	public void testSavePatient() throws Exception {
		
		// 1.CREATE MOCK REQUEST
		
		MockHttpServletRequestBuilder request=MockMvcRequestBuilders
				.post("http://localhost:9090/patient/create")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"id\" : 1,\"name\": \"Ravi kumar\",\"docterName\": \"Dr.Poul\",\"fees\" :20000 }");
		// 2.EXECUTE IT AND READ RESULT (REQUEST + RESPONCE + EXCEPTION)
		MvcResult result=mockmvc.perform(request).andReturn();
		
		//3. READ RESPONCE FROM RESULT
		
		MockHttpServletResponse responce=result.getResponse();
		
		// 4.ASSERT RESULT USING JUNIT
		assertEquals(HttpStatus.OK.value(), responce.getStatus());
//		assertNotNull(responce.getContentAsString());
//		if (!responce.getContentAsString().contains("OK")) {
//			fail("STUDENT NOT CREATED!!");
//		}
	}

}
