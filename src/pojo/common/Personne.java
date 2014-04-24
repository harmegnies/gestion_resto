package pojo.common;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import pojo.livre.CommentaireLivre;

/**
 * Personne generated by hbm2java
 */
@Entity
@Table(name = "personne", catalog = "gestion_resto2", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Personne implements java.io.Serializable {

	private Integer idPersonne;
	private String nom;
	private String prenom;
	private String email;
	private byte status;
	private Date dateEncodage;
	private Set<CommentaireLivre> LCommentaires = new HashSet<CommentaireLivre>(0);
	private Moderateur moderateur;
	private Administrateur administrateur;
	private ResponsableEditeur responsableediteur;

	public Personne() {
	}

	public Personne(String nom, String prenom, String email, byte status,
			Date dateEncodage) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.status = status;
		this.dateEncodage = dateEncodage;
	}

	public Personne(String nom, String prenom, String email, byte status,
			Date dateEncodage, Set<CommentaireLivre> LCommentaires,
			Moderateur moderateur, Administrateur administrateur,
			ResponsableEditeur responsableediteur) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.status = status;
		this.dateEncodage = dateEncodage;
		this.LCommentaires = LCommentaires;
		this.moderateur = moderateur;
		this.administrateur = administrateur;
		this.responsableediteur = responsableediteur;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idPersonne", unique = true, nullable = false)
	public Integer getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(Integer idPersonne) {
		this.idPersonne = idPersonne;
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

	@Column(name = "email", unique = true, nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "status", nullable = false)
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateEncodage", nullable = false, length = 19)
	public Date getDateEncodage() {
		return this.dateEncodage;
	}

	public void setDateEncodage(Date dateEncodage) {
		this.dateEncodage = dateEncodage;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<CommentaireLivre> getLCommentaires() {
		return this.LCommentaires;
	}

	public void setLCommentaires(Set<CommentaireLivre> LCommentaires) {
		this.LCommentaires = LCommentaires;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personne")
	public Moderateur getModerateur() {
		return this.moderateur;
	}

	public void setModerateur(Moderateur moderateur) {
		this.moderateur = moderateur;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personne")
	public Administrateur getAdministrateur() {
		return this.administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personne")
	public ResponsableEditeur getResponsableediteur() {
		return this.responsableediteur;
	}

	public void setResponsableediteur(ResponsableEditeur responsableediteur) {
		this.responsableediteur = responsableediteur;
	}

}
