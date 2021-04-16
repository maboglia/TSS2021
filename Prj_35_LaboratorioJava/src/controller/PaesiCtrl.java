package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import dal.PaesiDAO;
import model.Paese;

public class PaesiCtrl {
	
	private PaesiDAO pd;
	private List<Paese> paesi;
	
	public PaesiCtrl() {
		this.pd = new PaesiDAO();
		this.setPaesi();
	}
	
	private void setPaesi() {
		try {
			this.paesi = pd.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Paese> getPaesi() {
		return paesi;
	}
	
	public List<String> getCapitali(String continente){
		return this.paesi
				.stream()
				.filter(p->p.getRegion().equalsIgnoreCase(continente))
				.map(p->p.getCapital())
				.collect(Collectors.toList());
									
	}
	
	
}