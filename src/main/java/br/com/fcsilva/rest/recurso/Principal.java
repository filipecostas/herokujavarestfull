package br.com.fcsilva.rest.recurso;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;


@Path("/principal")
public class Principal {

	@SuppressWarnings("rawtypes")
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public String sayPlainTextHello() {
		//String json = "{\"id\":123,\"firstName\":\"Wektabyte\"}";
		Gson gson = new Gson();
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "1");
		map.put("nome", "Filipe Costa");
		Map<String, Map> map2 = new HashMap<String, Map>();
		map2.put("pessoa", map);
		String o = gson.toJson(map2);
		return o;
		
	}
}
