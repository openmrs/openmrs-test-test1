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
package org.openmrs.module.test1.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.test1.api.Test1Service;
import org.openmrs.module.test1.api.db.Test1DAO;

/**
 * It is a default implementation of {@link Test1Service}.
 */
public class Test1ServiceImpl extends BaseOpenmrsService implements Test1Service {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private Test1DAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(Test1DAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public Test1DAO getDao() {
	    return dao;
    }
}