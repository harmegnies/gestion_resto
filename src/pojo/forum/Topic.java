package pojo.forum;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pojo.common.Moderateur;

/**
 * FTopic generated by hbm2java
 */
@Entity
@Table(name = "f_topic", catalog = "gestion_resto2")
public class Topic implements java.io.Serializable {

	private Integer idTopic;
	private Moderateur moderateur;
	private ThemeForum FTheme;
	private Utilisateur FUtilisateur;
	private String sujet;
	private String sousSujet;
	private Date dateInsertion;
	private byte statut;
	private byte resolu;
	private Set<Message> FMessages = new HashSet<Message>(0);

	public Topic() {
	}

	public Topic(Moderateur moderateur, ThemeForum FTheme,
			Utilisateur FUtilisateur, String sujet, String sousSujet,
			Date dateInsertion, byte statut) {
		this.moderateur = moderateur;
		this.FTheme = FTheme;
		this.FUtilisateur = FUtilisateur;
		this.sujet = sujet;
		this.sousSujet = sousSujet;
		this.dateInsertion = dateInsertion;
		this.statut = statut;
	}

	public Topic(Moderateur moderateur, ThemeForum FTheme,
			Utilisateur FUtilisateur, String sujet, String sousSujet,
			Date dateInsertion, byte statut, Set<Message> FMessages) {
		this.moderateur = moderateur;
		this.FTheme = FTheme;
		this.FUtilisateur = FUtilisateur;
		this.sujet = sujet;
		this.sousSujet = sousSujet;
		this.dateInsertion = dateInsertion;
		this.statut = statut;
		this.FMessages = FMessages;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idTopic", unique = true, nullable = false)
	public Integer getIdTopic() {
		return this.idTopic;
	}

	public void setIdTopic(Integer idTopic) {
		this.idTopic = idTopic;
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
	@JoinColumn(name = "idTheme", nullable = false)
	public ThemeForum getFTheme() {
		return this.FTheme;
	}

	public void setFTheme(ThemeForum FTheme) {
		this.FTheme = FTheme;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUtilisateur", nullable = false)
	public Utilisateur getFUtilisateur() {
		return this.FUtilisateur;
	}

	public void setFUtilisateur(Utilisateur FUtilisateur) {
		this.FUtilisateur = FUtilisateur;
	}

	@Column(name = "sujet", nullable = false, length = 100)
	public String getSujet() {
		return this.sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	@Column(name = "sousSujet", nullable = false, length = 256)
	public String getSousSujet() {
		return this.sousSujet;
	}

	public void setSousSujet(String sousSujet) {
		this.sousSujet = sousSujet;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "FTopic")
	public Set<Message> getFMessages() {
		return this.FMessages;
	}

	public void setFMessages(Set<Message> FMessages) {
		this.FMessages = FMessages;
	}

}
