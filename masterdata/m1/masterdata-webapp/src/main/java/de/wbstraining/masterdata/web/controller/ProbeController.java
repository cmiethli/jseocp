package de.wbstraining.masterdata.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import de.wbstraining.common.web.controller.ISortingController;
import de.wbstraining.masterdata.persistence.model.Probe;
import de.wbstraining.masterdata.service.IProbeService;
import de.wbstraining.masterdata.util.MasterdataMappings;

@Controller
@RequestMapping(value = MasterdataMappings.Plural.PROBES)
public class ProbeController extends AbstractController<Probe, Probe>
		implements ISortingController<Probe> {

	@Autowired
	private IProbeService service;

	public ProbeController() {
		super(Probe.class);
	}

	// API

	// find - all/paginated

	@Override
	@RequestMapping(params = { QueryConstants.PAGE, QueryConstants.SIZE,
			QueryConstants.SORT_BY }, method = RequestMethod.GET)
	@ResponseBody
	public List<Probe> findAllPaginatedAndSorted(
			@RequestParam(value = QueryConstants.PAGE) final int page,
			@RequestParam(value = QueryConstants.SIZE) final int size,
			@RequestParam(value = QueryConstants.SORT_BY) final String sortBy,
			@RequestParam(value = QueryConstants.SORT_ORDER) final String sortOrder,
			final UriComponentsBuilder uriBuilder,
			final HttpServletResponse response) {
		return findPaginatedAndSortedInternal(page, size, sortBy, sortOrder,
				uriBuilder, response);
	}

	@Override
	@RequestMapping(params = { QueryConstants.PAGE,
			QueryConstants.SIZE }, method = RequestMethod.GET)
	@ResponseBody
	public List<Probe> findAllPaginated(
			@RequestParam(value = QueryConstants.PAGE) final int page,
			@RequestParam(value = QueryConstants.SIZE) final int size,
			final UriComponentsBuilder uriBuilder,
			final HttpServletResponse response) {
		return findPaginatedInternal(page, size, uriBuilder, response);
	}

	@Override
	@RequestMapping(params = {
			QueryConstants.SORT_BY }, method = RequestMethod.GET)
	@ResponseBody
	public List<Probe> findAllSorted(
			@RequestParam(value = QueryConstants.SORT_BY) final String sortBy,
			@RequestParam(value = QueryConstants.SORT_ORDER) final String sortOrder) {
		return findAllSortedInternal(sortBy, sortOrder);
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Probe> findAll(final HttpServletRequest request,
			final UriComponentsBuilder uriBuilder,
			final HttpServletResponse response) {
		return findAllInternal(request, uriBuilder, response);
	}

	// find - one

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Probe findOne(@PathVariable("id") final Long id,
			final UriComponentsBuilder uriBuilder,
			final HttpServletResponse response) {
		return findOneInternal(id, uriBuilder, response);
	}

	/*
	 * @RequestMapping(value = "/{macAddress}", method = RequestMethod.GET)
	 * 
	 * @ResponseBody
	 * public Probe findOne(@PathVariable("macAddress") final String
	 * macAddress, final UriComponentsBuilder uriBuilder, final
	 * HttpServletResponse response) {
	 * // return findOneInternal(id, uriBuilder, response);
	 * return service.findOne(macAddress);
	 * // return findOneInternal(1L, uriBuilder, response);
	 * }
	 */

	// create

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody @Valid final Probe resource,
			final UriComponentsBuilder uriBuilder,
			final HttpServletResponse response) {
		createInternal(resource, uriBuilder, response);
	}

	// update

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") final Long id,
			@RequestBody @Valid final Probe resource) {
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
	protected final IProbeService getService() {
		return service;
	}

}
