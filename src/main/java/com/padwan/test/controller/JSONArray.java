package com.padwan.test.controller;

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
		this.nome = string;
		this.habilidades = skills;
	}

	public String getString() {
		return nome;
	}

	public void setString(String string) {
		this.nome = string;
	}


	public List<String> getSkills() {
		return habilidades;
	}

	public void setSkills(List<String> skills) {
		this.habilidades = skills;
	}

	public void put(String string, List<String> string2) {
		// TODO Auto-generated method stub
		JSONArray json = new JSONArray(string, string2);
		
	}


}
