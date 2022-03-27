package com.padwan.test.controller;

import java.util.List;

public class JSONObject {

	 static List<String> texto;
	 static List<String> texto2;
	 
	 
	
	public JSONObject() {
		super();
		// TODO Auto-generated constructor stub
	}


	public JSONObject(List<String> texto, List<String> texto2) {
		super();
		this.texto = texto;
		this.texto2 = texto2;
	}


	public List<String> getTexto() {
		return texto;
	}

	public void setTexto(List<String> texto) {
		this.texto = texto;
	}

	public List<String> getTexto2() {
		return texto2;
	}

	public void setTexto2(List<String> texto2) {
		this.texto2 = texto2;
	}

	
	public void put(String string3, String string4) {
		// TODO Auto-generated method stub
		this.texto.add(string3);
		this.texto2.add(string4);
	}



}
