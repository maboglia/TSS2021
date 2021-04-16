package paesi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "paesi")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Paese implements Comparable<Paese>{
	
	@Id
	@GeneratedValue
	private int id; 
	
	private String name;
	private String capital;	
	private String region;
	private String subregion;
	private long population;

	@Override
	public int compareTo(Paese altro) {
		return (int) (altro.population - this.population);
	}
	
	
}
