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
		this.fala2 = fala2;
		
	}
	
	public JSONObject(String fala) {
		super();
		this.fala = fala;
	}

	public String getFala() {
		return fala;
	}

	public void setFala(String fala) {
		this.fala = fala;
	}

	public String getFala2() {
		return fala2;
	}

	public void setFala2(String fala2) {
		this.fala2 = fala2;
	}

	public void put(String string3, String string4) {
		// TODO Auto-generated method stu
		JSONObject json = new JSONObject(string3, string4);
		json.setFala2(string3 + " >> " + string4);

	}

	public void putt(String string3, String string4) {
		// TODO Auto-generated method stu
		JSONObject json = new JSONObject(string3);

		json.setFala(string3 + " >> " + string4+"\n");

	}

	@Override
	public String toString() {
		return "JSONObject [getFala()=" + getFala() + ", getFala2()=" + getFala2() + "]";
	}
	
	

}
