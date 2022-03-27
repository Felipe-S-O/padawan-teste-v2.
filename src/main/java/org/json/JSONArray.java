package org.json;

import java.util.List;

public class JSONArray {

	static String nome;
	static List<String> habilidades;


	public JSONArray() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JSONArray(String string, List<String> skills) {
		super();
		JSONArray.nome = string;
		JSONArray.habilidades = skills;
	}
	

	public List<String> getHabilidades() {
		return habilidades;
	}

	public String getNome() {
		return nome;
	}
	
	
	public void put(String string, List<String> string2) {
		// TODO Auto-generated method stub
		JSONArray json = new JSONArray(string, string2);

	}
	

}
