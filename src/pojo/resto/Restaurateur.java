package pojo.resto;

// Generated 14-avr.-2014 13:45:30 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RRestaurateur generated by hbm2java
 */
@Entity
@Table(name = "r_restaurateur", catalog = "gestion_resto2")
public class Restaurateur implements java.io.Serializable {

	private Integer idRestaurateur;
	private String nom;
	private String prenom;
	private char sexe;
	private byte nbEtoiles;
	private Set<Restaurant> RRestaurants = new HashSet<Restaurant>(0);

	public Restaurateur() {
	}

	public Restaurateur(String nom, String prenom, char sexe, byte nbEtoiles) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.nbEtoiles = nbEtoiles;
	}

	public Restaurateur(String nom, String prenom, char sexe, byte nbEtoiles,
			Set<Restaurant> RRestaurants) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.nbEtoiles = nbEtoiles;
		this.RRestaurants = RRestaurants;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idRestaurateur", unique = true, nullable = false)
	public Integer getIdRestaurateur() {
		return this.idRestaurateur;
	}

	public void setIdRestaurateur(Integer idRestaurateur) {
		this.idRestaurateur = idRestaurateur;
	}

	@Column(name = "nom", nullable = false, length = 50)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", nullable = false, length = 50)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "sexe", nullable = false, length = 1)
	public char getSexe() {
		return this.sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	@Column(name = "nbEtoiles", nullable = false)
	public byte getNbEtoiles() {
		return this.nbEtoiles;
	}

	public void setNbEtoiles(byte nbEtoiles) {
		this.nbEtoiles = nbEtoiles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "RRestaurateur")
	public Set<Restaurant> getRRestaurants() {
		return this.RRestaurants;
	}

	public void setRRestaurants(Set<Restaurant> RRestaurants) {
		this.RRestaurants = RRestaurants;
	}

}
