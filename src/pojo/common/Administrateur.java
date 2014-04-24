package pojo.common;

// Generated 14-avr.-2014 13:45:30 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import pojo.resto.Restaurant;

/**
 * Administrateur generated by hbm2java
 */
@Entity
@Table(name = "administrateur", catalog = "gestion_resto2")
public class Administrateur implements java.io.Serializable {

	private int idPersonne;
	private Personne personne;
	private Set<Restaurant> RRestaurants = new HashSet<Restaurant>(0);

	public Administrateur() {
	}

	public Administrateur(Personne personne) {
		this.personne = personne;
	}

	public Administrateur(Personne personne, Set<Restaurant> RRestaurants) {
		this.personne = personne;
		this.RRestaurants = RRestaurants;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "personne"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "idPersonne", unique = true, nullable = false)
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "administrateur")
	public Set<Restaurant> getRRestaurants() {
		return this.RRestaurants;
	}

	public void setRRestaurants(Set<Restaurant> RRestaurants) {
		this.RRestaurants = RRestaurants;
	}

}
