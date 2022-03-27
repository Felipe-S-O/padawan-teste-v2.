package org.json;

public class JSONObject {

     static String fala;
	 static String fala2;
	
	
	public JSONObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public JSONObject(String fala, String fala2) {
		super();
		this.fala = fala;
		this.fala2 = fala2;
	}

	public static String getFala() {
		return fala;
	}
	public  void setFala(String fala) {
		this.fala = fala;
	}

	public static String getFala2() {
		return fala2;
	}

	public void setFala2(String fala2) {
		this.fala2 = fala2;
	}

	public void put(String string3, String string4) {
		// TODO Auto-generated method stu
       JSONObject json = new JSONObject(string3, string4);
		if (!json.getFala().equals("")) {
			
			json.setFala(string3 +" >> "+ string4);
			
		} else {

			json.setFala2(string3 +" >> "+ string4);
		}
	}

}
