package pojo.recette;

// Generated 14-avr.-2014 13:45:30 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * CSaison generated by hbm2java
 */
@Entity
@Table(name = "c_saison", catalog = "gestion_resto2")
public class Saison implements java.io.Serializable {

	private Integer idSaison;
	private String nomSaison;
	private Set<Ingredient> CIngredients = new HashSet<Ingredient>(0);

	public Saison() {
	}

	public Saison(String nomSaison) {
		this.nomSaison = nomSaison;
	}

	public Saison(String nomSaison, Set<Ingredient> CIngredients) {
		this.nomSaison = nomSaison;
		this.CIngredients = CIngredients;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idSaison", unique = true, nullable = false)
	public Integer getIdSaison() {
		return this.idSaison;
	}

	public void setIdSaison(Integer idSaison) {
		this.idSaison = idSaison;
	}

	@Column(name = "nomSaison", nullable = false, length = 10)
	public String getNomSaison() {
		return this.nomSaison;
	}

	public void setNomSaison(String nomSaison) {
		this.nomSaison = nomSaison;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "CSaisons")
	public Set<Ingredient> getCIngredients() {
		return this.CIngredients;
	}

	public void setCIngredients(Set<Ingredient> CIngredients) {
		this.CIngredients = CIngredients;
	}

}
