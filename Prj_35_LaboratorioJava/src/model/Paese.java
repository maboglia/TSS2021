package model;


public class Paese {

	private int id; 
	private String name;
	private String capital;	
	private String region;
	private String subregion;
	private long population;

	public Paese() {}
	
	public Paese(int id, String name, String capital, String region, String subregion, long population) {
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.region = region;
		this.subregion = subregion;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "{id:" + id + ", name:" + name + ", capital:" + capital + ", region:" + region + ", subregion:"
				+ subregion + ", population:" + population + "}";
	}

	
	
}
