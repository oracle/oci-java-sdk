/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.util.internal.StringUtils;
import org.slf4j.Logger;

import java.util.Map;

/**
 * This abstract path provider has a string template with placeholders like {id}, and provides a way
 * to get a mapping of substitutions to fill in.
 */
public abstract class AbstractTemplateRptPathProvider implements RptPathProvider {

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AbstractTemplateRptPathProvider.class);
    private final String pathTemplate;

    /**
     * Constructor of AbstractTemplateRptPathProvider.
     *
     * @param pathTemplate string template with placeholders like "{id}"
     */
    public AbstractTemplateRptPathProvider(String pathTemplate) {
        this.pathTemplate = pathTemplate;
    }

    @Override
    public String getPath() {
        Map<String, String> replacements = getReplacements();
        String path = StringUtils.replace(pathTemplate, replacements, "{", "}");
        LOG.debug("Using path {}", path);
        return path;
    }

    protected abstract Map<String, String> getReplacements();
}
