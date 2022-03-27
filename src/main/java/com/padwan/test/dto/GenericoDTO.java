package com.padwan.test.dto;

public class GenericoDTO {

    private String planet;
    private Integer ranking;    
    private String classe;
    
    


	public GenericoDTO(String planet, Integer ranking, String classe) {
		super();
		this.planet = planet;
		this.ranking = ranking;
		this.classe = classe;
	}

	public GenericoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
