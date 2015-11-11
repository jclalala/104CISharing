package com.medium.SampleMavenProject.integration.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;

public class SampleMavenProjectTest {

	@Test
	public void testGetService() {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:20080/SampleMavenIntegrationProject/test/testGet");
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		Response resp = invocationBuilder.get();

		Assert.assertEquals("Test service works!", resp.readEntity(String.class));
	}

}
