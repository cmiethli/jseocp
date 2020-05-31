/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wbstraining.masterdata.persistence.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import de.wbstraining.common.interfaces.INameableDto;
import de.wbstraining.common.persistence.model.INameableEntity;

/**
 *
 * @author Günter
 */
@Entity
@Table(name = "groups")
@NamedQueries({
	@NamedQuery(name = "Groups.findAll", query = "SELECT g FROM Groups g"),
	@NamedQuery(name = "Groups.findByGroupId", query = "SELECT g FROM Groups g WHERE g.groupId = :groupId"),
	@NamedQuery(name = "Groups.findByGroupName", query = "SELECT g FROM Groups g WHERE g.groupName = :groupName"),
	@NamedQuery(name = "Groups.findByGroupDesc", query = "SELECT g FROM Groups g WHERE g.groupDesc = :groupDesc") })
@XmlRootElement()
public class Groups implements INameableEntity, INameableDto, Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "group_id")
	private Long groupId;

	@Column(nullable = false, unique = true)
	private String name;

	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 20)
	@Column(name = "group_name")
	private String groupName;
	@Size(max = 200)
	@Column(name = "group_desc")
	private String groupDesc;
	@JoinTable(name = "user_groups", joinColumns = {
		@JoinColumn(name = "group_id", referencedColumnName = "group_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_id", referencedColumnName = "user_id") })
	@ManyToMany
	private List<Users> usersList;

	{// vor jeden KonstruktorAufruf
		this.name = org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(10);
	}

	public Groups() {
	}

	public Groups(Long groupId) {
		this.groupId = groupId;
	}

	public Groups(Long groupId, String groupName) {
		this.groupId = groupId;
		this.groupName = groupName;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDesc() {
		return groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	public List<Users> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<Users> usersList) {
		this.usersList = usersList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (groupId != null ? groupId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Groups)) {
			return false;
		}
		Groups other = (Groups) object;
		if ((this.groupId == null && other.groupId != null)
			|| (this.groupId != null && !this.groupId.equals(other.groupId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "wbs.corejpa.persistence.Groups[ groupId=" + groupId + " ]";
	}

//################################# Spring ########################
	@Override
	public Long getId() {
		return groupId;
	}

	@Override
	public void setId(Long id) {
		this.groupId = id;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
