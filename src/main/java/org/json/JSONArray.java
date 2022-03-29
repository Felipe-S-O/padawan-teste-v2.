package org.json;

import java.util.List;

public class JSONArray {

	private  static String nome;
	private  static List<String> habilidades;


	public JSONArray() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JSONArray(String string, List<String> skills) {
		super();
		this.nome = string;
		this.habilidades = skills;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	public void put(String string, List<String> string2) {
		// TODO Auto-generated method stub
		JSONArray json = new JSONArray(string, string2);

	}

	@Override
	public String toString() {
		return "JSONArray [getNome()=" + getNome() + ", getHabilidades()=" + getHabilidades() + "]";
	}

	
	

}
