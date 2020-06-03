package de.wbstraining.masterdata.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriComponentsBuilder;

import de.wbstraining.common.util.QueryConstants;
import de.wbstraining.common.web.controller.AbstractController;
import de.wbstraining.masterdata.persistence.model.Lottoscheinziehung6aus49;
import de.wbstraining.masterdata.service.ILottoscheinziehung6aus49Service;
import de.wbstraining.masterdata.util.MasterdataMappings;

@Controller
@RequestMapping(value = MasterdataMappings.Plural.LOTTOSCHEINZIEHUNG6AUS49S)
public class Lottoscheinziehung6aus49Controller extends
	AbstractController<Lottoscheinziehung6aus49, Lottoscheinziehung6aus49> {

	@Autowired
	private ILottoscheinziehung6aus49Service service;

	public Lottoscheinziehung6aus49Controller() {
		super(Lottoscheinziehung6aus49.class);
	}

	// API

	@RequestMapping(value = "/sorted", params = {
		QueryConstants.SORT_BY }, method = RequestMethod.GET)
	@ResponseBody
	public List<Lottoscheinziehung6aus49> findAllSorted(
		@RequestParam(value = QueryConstants.SORT_BY) final String sortBy,
		@RequestParam(value = QueryConstants.SORT_ORDER) final String sortOrder) {
		return findAllSortedInternal(sortBy, sortOrder);
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Lottoscheinziehung6aus49> findAll(
		final HttpServletRequest request, final UriComponentsBuilder uriBuilder,
		final HttpServletResponse response) {
		return findAllInternal(request, uriBuilder, response);
	}

	// find - one

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Lottoscheinziehung6aus49 findOne(@PathVariable("id") final Long id,
		final UriComponentsBuilder uriBuilder, final HttpServletResponse response) {
		return findOneInternal(id, uriBuilder, response);
	}

	// create

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(
		@RequestBody @Valid final Lottoscheinziehung6aus49 resource,
		final UriComponentsBuilder uriBuilder, final HttpServletResponse response) {
		createInternal(resource, uriBuilder, response);
	}

	// update

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") final Long id,
		@RequestBody @Valid final Lottoscheinziehung6aus49 resource) {
		updateInternal(id, resource);
	}

	// delete

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") final Long id) {
		deleteByIdInternal(id);
	}

	// Spring

	@Override
	protected final ILottoscheinziehung6aus49Service getService() {
		return service;
	}

}
