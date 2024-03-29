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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CCatingredient generated by hbm2java
 */
@Entity
@Table(name = "c_catingredient", catalog = "gestion_resto2")
public class CatIngredient implements java.io.Serializable {

	private Integer idCatIngredient;
	private String nomCategorie;
	private Set<Ingredient> CIngredients = new HashSet<Ingredient>(0);

	public CatIngredient() {
	}

	public CatIngredient(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public CatIngredient(String nomCategorie, Set<Ingredient> CIngredients) {
		this.nomCategorie = nomCategorie;
		this.CIngredients = CIngredients;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idCatIngredient", unique = true, nullable = false)
	public Integer getIdCatIngredient() {
		return this.idCatIngredient;
	}

	public void setIdCatIngredient(Integer idCatIngredient) {
		this.idCatIngredient = idCatIngredient;
	}

	@Column(name = "nomCategorie", nullable = false, length = 50)
	public String getNomCategorie() {
		return this.nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CCatingredient")
	public Set<Ingredient> getCIngredients() {
		return this.CIngredients;
	}

	public void setCIngredients(Set<Ingredient> CIngredients) {
		this.CIngredients = CIngredients;
	}

}
