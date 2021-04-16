# spring jpa relazioni


## application properties

```java
#Connessione al db
spring.datasource.url=jdbc:mysql://localhost:3306/Its2020?createDatabaseIfNotExist=true
spring.datasource.username=Its2020
spring.datasource.password=Its2020

# Drop e Create delle tabelle del db (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto=create

# Hibernate SQL dialect

# mostra sql
spring.jpa.show-sql=true


```
## DocRepo

```java
package relazioni.repos;

import org.springframework.data.repository.CrudRepository;

import relazioni.entities.Documento;

public interface DocRepo extends CrudRepository<Documento, Integer> {

}
```
## ViaggioRepo

```java
package relazioni.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import relazioni.entities.Viaggio;


public interface ViaggioRepo extends CrudRepository<Viaggio, Integer> {

	//derived query
	List<Viaggio> findByDestinazioneAndGenere(String destinazione, String genere);
}

```
## 

```java

```
## 

```java

```
## 

```java

```
## Viaggio OneToOne

```java
package relazioni.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "viaggi")
public class Viaggio implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String destinazione;

	@OneToOne(mappedBy = "viaggio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Documento documento;
	
	public Documento getDocumento() {
		return documento;
	}
	
	
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	
	public Viaggio() {}
	
	public Viaggio(String destinazione) {
		this.destinazione = destinazione;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	@Override
	public String toString() {
		return "Viaggio [id=" + id + ", destinazione=" + destinazione + "]";
	}
	
	
	
}

```
## Documento OneToOne

```java
package relazioni.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documenti")
public class Documento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String path;

	public Documento() {}
	
	public Documento(String path) {
		this.path = path;
	}

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="viaggi_id", nullable = false)
	private Viaggio viaggio;

	public Viaggio getViaggio() {
		return viaggio;
	}
	public void setViaggio(Viaggio viaggio) {
		this.viaggio = viaggio;
	}
	
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}

```
## 

```java
package relazioni;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import relazioni.entities.Documento;
import relazioni.entities.Viaggio;
import relazioni.repos.DocRepo;
import relazioni.repos.ViaggioRepo;

@SpringBootApplication
public class Prj44SpringRelazioniDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj44SpringRelazioniDbApplication.class, args);
	}

	@Bean
	public CommandLineRunner esempio1(ViaggioRepo viaggioRepo, DocRepo docRepo) {
		
		
		return a -> {
			
			Viaggio v = new Viaggio("Roma");
			Documento d = new Documento("locandina_roma.pdf");
			
			v.setDocumento(d);
			d.setViaggio(v);
			
			viaggioRepo.save(v);
			
			
			
		};
		
	}

	
	
	
}

```
## 

```java

```
## 

```java

```
## Viaggio OneToMany

```java
package relazioni.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "viaggi")
public class Viaggio implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String destinazione;

	@OneToMany(mappedBy = "viaggio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Documento> documento;
	
	
	public Set<Documento> getDocumento() {
		return documento;
	}

	public void setDocumento(Set<Documento> documento) {
		this.documento = documento;
	}

	public Viaggio() {}
	
	public Viaggio(String destinazione) {
		this.destinazione = destinazione;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	@Override
	public String toString() {
		return "Viaggio [id=" + id + ", destinazione=" + destinazione + "]";
	}
	
	
	
}

```
## Documento ManyToOne

```java
package relazioni.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documenti")
public class Documento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String path;

	public Documento() {}
	
	public Documento(String path) {
		this.path = path;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="viaggi_id", nullable = false)
	private Viaggio viaggio;

	public Viaggio getViaggio() {
		return viaggio;
	}
	public void setViaggio(Viaggio viaggio) {
		this.viaggio = viaggio;
	}
	
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}

```
## 

```java
package relazioni;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import relazioni.entities.Documento;
import relazioni.entities.Viaggio;
import relazioni.repos.DocRepo;
import relazioni.repos.ViaggioRepo;

@SpringBootApplication
public class Prj44SpringRelazioniDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj44SpringRelazioniDbApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner esempio1(ViaggioRepo viaggioRepo, DocRepo docRepo) {
//		
//		
//		return a -> {
//			
//			Viaggio v = new Viaggio("Roma");
//			Documento d = new Documento("locandina_roma.pdf");
//			
//			v.setDocumento(d);
//			d.setViaggio(v);
//			
//			viaggioRepo.save(v);
//			
//			
//			
//		};
//		
//	}

	@Bean
	public CommandLineRunner esempio2(ViaggioRepo viaggioRepo, DocRepo docRepo) {
		
		
		return a -> {
			
			Viaggio v = new Viaggio("Roma");
			Documento d = new Documento("locandina_roma.pdf");
			Documento d2 = new Documento("foto_colosseo.jpg");
			d.setViaggio(v);
			d2.setViaggio(v);
			
			Set<Documento> docs = new HashSet<>();
			
			docs.add(d);
			docs.add(d2);
			
			v.setDocumento(docs);
			viaggioRepo.save(v);
			
			
			
		};
		
	}
		
	
	
}
                                                                                                                                                                    
```
## 

```java

```
## 

```java

```
## Viaggio ManyToMany

```java
package relazioni.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "viaggi")
public class Viaggio implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String destinazione;
	private String genere;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name= "rel_viaggi_docs", joinColumns = {
			@JoinColumn(name="viaggi_id",referencedColumnName = "id",nullable = false, updatable = false)
	}, inverseJoinColumns = { @JoinColumn( name="doc_id",referencedColumnName = "id",nullable = false, updatable = false   )    })
	private Set<Documento> documenti = new HashSet<>();
	
	
	

	public Set<Documento> getDocumenti() {
		return documenti;
	}

	public void setDocumenti(Set<Documento> documenti) {
		this.documenti = documenti;
	}

	public Viaggio() {}
	
	public Viaggio(String destinazione) {
		this.destinazione = destinazione;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	@Override
	public String toString() {
		return "Viaggio [id=" + id + ", destinazione=" + destinazione + "]";
	}
	
	
	
}

```
## Documento ManyToMany

```java
package relazioni.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documenti")
public class Documento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String path;

	public Documento() {}
	
	public Documento(String path) {
		this.path = path;
	}

	@ManyToMany(mappedBy = "documenti" , fetch =  FetchType.LAZY)
	private Set<Viaggio> viaggi = new HashSet<>();
	
	public Set<Viaggio> getViaggi() {
		return viaggi;
	}

	public void setViaggi(Set<Viaggio> viaggi) {
		this.viaggi = viaggi;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
```
## SpringBootApplication

```java
package relazioni;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import relazioni.entities.Documento;
import relazioni.entities.Viaggio;
import relazioni.repos.DocRepo;
import relazioni.repos.ViaggioRepo;

@SpringBootApplication
public class Prj44SpringRelazioniDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj44SpringRelazioniDbApplication.class, args);
	}

	@Bean
	public CommandLineRunner esempio2(ViaggioRepo viaggioRepo, DocRepo docRepo) {
		
		
		return a -> {
			
			Viaggio v = new Viaggio("Roma");
			Viaggio v2 = new Viaggio("Napoli");

			viaggioRepo.save(v);
			viaggioRepo.save(v2);			

			Documento d = new Documento("locandina_roma.pdf");

			Documento d2 = new Documento("foto_vesuvio.jpg");

			Documento d3 = new Documento("vademecum_viaggi.pdf");

			Documento d4 = new Documento("elenco_alberghi.xls");
			
			
			docRepo.saveAll(Arrays.asList(d, d2, d3, d4));
			
			v.getDocumenti().addAll(Arrays.asList(d, d3, d4));
			v2.getDocumenti().addAll(Arrays.asList(d2, d3, d4));
			
			
			viaggioRepo.save(v);
			viaggioRepo.save(v2);

			
			
		};
		
	}
		
	
	
}

```



