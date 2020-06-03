/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wbstraining.masterdata.persistence.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
 * @author Martin
 */
@Entity
@Table(name = "user_roles")
@NamedQueries({
	@NamedQuery(name = "UserRoles.findAll", query = "SELECT ur FROM UserRoles ur"),
	@NamedQuery(name = "UserRoles.findByUserRoleId", query = "SELECT ur FROM UserRoles ur WHERE ur.userRolesId = :userRolesId"),
	@NamedQuery(name = "UserRoles.findByRole", query = "SELECT ur FROM UserRoles ur WHERE ur.role = :role"),
	@NamedQuery(name = "UserRoles.findByUserName", query = "SELECT ur FROM UserRoles ur WHERE ur.userName = :userName") })
@XmlRootElement()
public class UserRoles implements INameableEntity, INameableDto, Serializable {

	private static final long serialVersionUID = 1L;
	private static final String GENERATOR_NAME = "seqGen_"
		+ MasterdataMappings.Singular.USERROLE;

	@Id
	@GeneratedValue(generator = GENERATOR_NAME)
	@GenericGenerator(name = GENERATOR_NAME, strategy = "de.wbstraining.masterdata.persistence.generator.IdAndNameGenerator", //
		parameters = {
			@Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
	@Basic(optional = false)
	@Column(name = "user_rolesid")
	private Long userRolesId;

	@Column(nullable = false, unique = true)
	private String name;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 20)
	@Column(name = "role")
	private String role;
	@Size(max = 200)
	@Column(name = "username")
	private String userName;
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	@ManyToOne(optional = false)
	private Users2 users2;

	public UserRoles() {
	}

	public UserRoles(Long userRolesId) {
		this.userRolesId = userRolesId;
	}

	public UserRoles(Long userRolesId, String role) {
		this.userRolesId = userRolesId;
		this.role = role;
	}

	public UserRoles(Long userRolesId, String role, String userName) {
		this.userRolesId = userRolesId;
		this.role = role;
		this.userName = userName;
	}

	public Long getUserRolesId() {
		return userRolesId;
	}

	public void setUserRolesId(Long userRolesId) {
		this.userRolesId = userRolesId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Users2 getUsers2() {
		return users2;
	}

	public void setUsers2(Users2 userId) {
		this.users2 = userId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (userRolesId != null ? userRolesId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof UserRoles)) {
			return false;
		}
		UserRoles other = (UserRoles) object;
		if ((this.userRolesId == null && other.userRolesId != null)
			|| (this.userRolesId != null
				&& !this.userRolesId.equals(other.userRolesId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "wbs.corejpa.persistence.UserRoles[ userRolesId=" + userRolesId
			+ " ]";
	}

//################################# Spring ########################
	@Override
	public Long getId() {
		return userRolesId;
	}

	@Override
	public void setId(Long id) {
		this.userRolesId = id;
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
