/*
 * https://github.com/join * To change this license header, choose License
 * Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wbstraining.masterdata.persistence.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import de.wbstraining.common.interfaces.INameableDto;
import de.wbstraining.common.persistence.model.INameableEntity;
import de.wbstraining.masterdata.util.MasterdataMappings;

/**
 *
 * @author Alem, Martin
 */
@Entity
@Table(name = "users2")
@NamedQueries({
	@NamedQuery(name = "Users2.findAll", query = "SELECT u FROM Users2 u"),
	@NamedQuery(name = "Users2.findByUserId", query = "SELECT u FROM Users2 u WHERE u.userId = :userId"),
	@NamedQuery(name = "Users2.findByUsername", query = "SELECT u FROM Users2 u WHERE u.username = :username"),
	@NamedQuery(name = "Users2.findByPassword", query = "SELECT u FROM Users2 u WHERE u.password = :password") })
@XmlRootElement()
public class Users2 implements INameableEntity, INameableDto, Serializable {

	private static final long serialVersionUID = 1L;
	private static final String GENERATOR_NAME = "seqGen_"
		+ MasterdataMappings.Singular.USERS2;

	@Id
	@GeneratedValue(generator = GENERATOR_NAME)
	@GenericGenerator(name = GENERATOR_NAME, strategy = "de.wbstraining.masterdata.persistence.generator.IdAndNameGenerator", //
		parameters = {
			@Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
	@Basic(optional = false)
	@Column(name = "user_id")
	private Long userId;

	@Column(nullable = false, unique = true)
	private String name;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 10)
	@Column(name = "username")
	private String username;
	@NotNull
	@Size(min = 1, max = 64)
	@Column(name = "password")
	private String password;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "users2")
	private List<UserRoles> userRolesList;

	@JoinColumn(name = "kundeid", referencedColumnName = "kundeid")
	@OneToOne
	private Kunde kunde;

	public Users2() {
	}

	public Users2(Long userId) {
		this.userId = userId;
	}

	public Users2(Long userId, String username, String password) {
		this.userId = userId;
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kundeid) {
		this.kunde = kundeid;
	}

//    public List<UserRoles> getUserRolesList() {
//        return userRolesList;
//    }
//
//    public void setUserRolesList(List<UserRoles> userRolesList) {
//        this.userRolesList = userRolesList;
//    }    

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (userId != null ? userId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Users)) {
			return false;
		}
		Users2 other = (Users2) object;
		if ((this.userId == null && other.userId != null)
			|| (this.userId != null && !this.userId.equals(other.userId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "wbs.corejpa.persistence.Users[ userId=" + userId + " ]";
	}

//################################# Spring ########################
	@Override
	public Long getId() {
		return userId;
	}

	@Override
	public void setId(Long id) {
		this.userId = id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
