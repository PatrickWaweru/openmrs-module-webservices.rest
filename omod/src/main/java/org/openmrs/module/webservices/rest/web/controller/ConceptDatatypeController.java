/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.webservices.rest.web.controller;

import org.openmrs.api.context.Context;
import org.openmrs.module.webservices.rest.web.api.RestService;
import org.openmrs.module.webservices.rest.web.resource.ConceptDatatypeResource;
import org.openmrs.module.webservices.rest.web.resource.api.CrudResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for REST web service access to the ConceptDatatype resource. Supports CRUD on the
 * resource itself.
 */
@Controller
@RequestMapping(value = "/rest/conceptdatatype")
public class ConceptDatatypeController extends BaseCrudController<CrudResource> {
	
	/**
	 * @see org.openmrs.module.webservices.rest.web.controller.BaseCrudController#getResource()
	 */
	@Override
	public CrudResource getResource() {
		return Context.getService(RestService.class).getResource(ConceptDatatypeResource.class);
	}
}