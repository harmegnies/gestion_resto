package pojo.recette;

// Generated 14-avr.-2014 13:45:30 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pojo.common.Moderateur;

/**
 * CRecette generated by hbm2java
 */
@Entity
@Table(name = "c_recette", catalog = "gestion_resto2")
public class Recette implements java.io.Serializable {

	private Integer idRecette;
	private CategorieRecette CCategorierecette;
	private Moderateur moderateur;
	private Membre CMembre;
	private String nomRecette;
	private String modeOperatoire;
	private String niveauDifficulte;
	private int tempsPreparation;
	private int tempsCuisson;
	private float cout;
	private Date dateInsertion;
	private byte statut;
	private int popularite;
	private byte cotation;
	private Set<Photo> CPhotos = new HashSet<Photo>(0);
	private Set<ThemeRecette> CThemes = new HashSet<ThemeRecette>(0);
	private Set<Commentaire> CCommentaires = new HashSet<Commentaire>(0);
	private Set<DetailRecette> CDetailrecettes = new HashSet<DetailRecette>(0);

	public Recette() {
	}

	public Recette(CategorieRecette CCategorierecette, Moderateur moderateur,
			Membre CMembre, String nomRecette, String modeOperatoire,
			String niveauDifficulte, int tempsPreparation, int tempsCuisson,
			float cout, Date dateInsertion, byte statut, int popularite,
			byte cotation) {
		this.CCategorierecette = CCategorierecette;
		this.moderateur = moderateur;
		this.CMembre = CMembre;
		this.nomRecette = nomRecette;
		this.modeOperatoire = modeOperatoire;
		this.niveauDifficulte = niveauDifficulte;
		this.tempsPreparation = tempsPreparation;
		this.tempsCuisson = tempsCuisson;
		this.cout = cout;
		this.dateInsertion = dateInsertion;
		this.statut = statut;
		this.popularite = popularite;
		this.cotation = cotation;
	}

	public Recette(CategorieRecette CCategorierecette, Moderateur moderateur,
			Membre CMembre, String nomRecette, String modeOperatoire,
			String niveauDifficulte, int tempsPreparation, int tempsCuisson,
			float cout, Date dateInsertion, byte statut, int popularite,
			byte cotation, Set<Photo> CPhotos, Set<ThemeRecette> CThemes,
			Set<Commentaire> CCommentaires, Set<DetailRecette> CDetailrecettes) {
		this.CCategorierecette = CCategorierecette;
		this.moderateur = moderateur;
		this.CMembre = CMembre;
		this.nomRecette = nomRecette;
		this.modeOperatoire = modeOperatoire;
		this.niveauDifficulte = niveauDifficulte;
		this.tempsPreparation = tempsPreparation;
		this.tempsCuisson = tempsCuisson;
		this.cout = cout;
		this.dateInsertion = dateInsertion;
		this.statut = statut;
		this.popularite = popularite;
		this.cotation = cotation;
		this.CPhotos = CPhotos;
		this.CThemes = CThemes;
		this.CCommentaires = CCommentaires;
		this.CDetailrecettes = CDetailrecettes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idRecette", unique = true, nullable = false)
	public Integer getIdRecette() {
		return this.idRecette;
	}

	public void setIdRecette(Integer idRecette) {
		this.idRecette = idRecette;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCategorie", nullable = false)
	public CategorieRecette getCCategorierecette() {
		return this.CCategorierecette;
	}

	public void setCCategorierecette(CategorieRecette CCategorierecette) {
		this.CCategorierecette = CCategorierecette;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPersonne", nullable = false)
	public Moderateur getModerateur() {
		return this.moderateur;
	}

	public void setModerateur(Moderateur moderateur) {
		this.moderateur = moderateur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMembre", nullable = false)
	public Membre getCMembre() {
		return this.CMembre;
	}

	public void setCMembre(Membre CMembre) {
		this.CMembre = CMembre;
	}

	@Column(name = "nomRecette", nullable = false, length = 100)
	public String getNomRecette() {
		return this.nomRecette;
	}

	public void setNomRecette(String nomRecette) {
		this.nomRecette = nomRecette;
	}

	@Column(name = "modeOperatoire", nullable = false)
	public String getModeOperatoire() {
		return this.modeOperatoire;
	}

	public void setModeOperatoire(String modeOperatoire) {
		this.modeOperatoire = modeOperatoire;
	}

	@Column(name = "niveauDifficulte", nullable = false, length = 10)
	public String getNiveauDifficulte() {
		return this.niveauDifficulte;
	}

	public void setNiveauDifficulte(String niveauDifficulte) {
		this.niveauDifficulte = niveauDifficulte;
	}

	@Column(name = "tempsPreparation", nullable = false)
	public int getTempsPreparation() {
		return this.tempsPreparation;
	}

	public void setTempsPreparation(int tempsPreparation) {
		this.tempsPreparation = tempsPreparation;
	}

	@Column(name = "tempsCuisson", nullable = false)
	public int getTempsCuisson() {
		return this.tempsCuisson;
	}

	public void setTempsCuisson(int tempsCuisson) {
		this.tempsCuisson = tempsCuisson;
	}

	@Column(name = "cout", nullable = false, precision = 12, scale = 0)
	public float getCout() {
		return this.cout;
	}

	public void setCout(float cout) {
		this.cout = cout;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateInsertion", nullable = false, length = 19)
	public Date getDateInsertion() {
		return this.dateInsertion;
	}

	public void setDateInsertion(Date dateInsertion) {
		this.dateInsertion = dateInsertion;
	}

	@Column(name = "statut", nullable = false)
	public byte getStatut() {
		return this.statut;
	}

	public void setStatut(byte statut) {
		this.statut = statut;
	}

	@Column(name = "popularite", nullable = false)
	public int getPopularite() {
		return this.popularite;
	}

	public void setPopularite(int popularite) {
		this.popularite = popularite;
	}

	@Column(name = "cotation", nullable = false)
	public byte getCotation() {
		return this.cotation;
	}

	public void setCotation(byte cotation) {
		this.cotation = cotation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CRecette")
	public Set<Photo> getCPhotos() {
		return this.CPhotos;
	}

	public void setCPhotos(Set<Photo> CPhotos) {
		this.CPhotos = CPhotos;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "c_theme_recette", catalog = "gestion_resto2", joinColumns = { @JoinColumn(name = "idRecette", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "idTheme", nullable = false, updatable = false) })
	public Set<ThemeRecette> getCThemes() {
		return this.CThemes;
	}

	public void setCThemes(Set<ThemeRecette> CThemes) {
		this.CThemes = CThemes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CRecette")
	public Set<Commentaire> getCCommentaires() {
		return this.CCommentaires;
	}

	public void setCCommentaires(Set<Commentaire> CCommentaires) {
		this.CCommentaires = CCommentaires;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CRecette")
	public Set<DetailRecette> getCDetailrecettes() {
		return this.CDetailrecettes;
	}

	public void setCDetailrecettes(Set<DetailRecette> CDetailrecettes) {
		this.CDetailrecettes = CDetailrecettes;
	}

}
