package com.buscaescolas.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Classe de Teste.
 * http://localhost:8080/rest-easy-start/rest/teste/3
 * @author edison
 *
 */
@Path("/teste")
public class Teste {
	@GET
	@Path("/{parametro}")
	public Response responseMsg(@PathParam("parametro") String parametro) {
		String response = "Teste OK!!! Parametro: " + parametro;
		return Response.status(200).entity(response).build();

	}

}
