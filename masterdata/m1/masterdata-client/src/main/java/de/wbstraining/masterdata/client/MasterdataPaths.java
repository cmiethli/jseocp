package de.wbstraining.masterdata.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import de.wbstraining.common.client.CommonPaths;
import de.wbstraining.common.web.IUriMapper;
import de.wbstraining.masterdata.persistence.model.Privilege;
import de.wbstraining.masterdata.persistence.model.Probe;
import de.wbstraining.masterdata.persistence.model.Role;
import de.wbstraining.masterdata.persistence.model.User;

@Component
@Profile("client")
public final class MasterdataPaths {

	@Value("${http.sec.path}")
	private String secPath;

	@Autowired
	private CommonPaths commonPaths;

	@Autowired
	private IUriMapper uriMapper;

	// API

	public final String getContext() {
		return commonPaths.getServerRoot() + secPath;
	}

	public final String getRootUri() {
		return getContext() + "/api/";
	}

	public final String getUserUri() {
		return getRootUri() + uriMapper.getUriBase(User.class);
	}

	public final String getRoleUri() {
		return getRootUri() + uriMapper.getUriBase(Role.class);
	}

	public final String getPrivilegeUri() {
		return getRootUri() + uriMapper.getUriBase(Privilege.class);
	}

	public final String getProbeUri() {
		return getRootUri() + uriMapper.getUriBase(Probe.class);
	}

	public final String getAuthenticationUri() {
		return getRootUri() + "authentication";
	}

	public final String getLoginUri() {
		return getContext() + "/j_spring_security_check";
	}

}
