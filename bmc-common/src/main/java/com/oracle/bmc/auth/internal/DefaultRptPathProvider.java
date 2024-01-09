/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import org.slf4j.Logger;

import java.util.Map;

/**
 * This path provider makes sure the behavior happens with the correct fallback.
 *
 * <p>For the path, Use the contents of the OCI_RESOURCE_PRINCIPAL_RPT_PATH environment variable, if
 * set. Otherwise, use the current path: "/20180711/resourcePrincipalToken/{id}"
 *
 * <p>For the resource id, Use the contents of the OCI_RESOURCE_PRINCIPAL_RPT_ID environment
 * variable, if set. Otherwise, use IMDS to get the instance id
 *
 * <p>This path provider is used when the caller doesn't provide a specific path provider to the
 * resource principals signer
 */
public class DefaultRptPathProvider extends AbstractTemplateRptPathProvider {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DefaultRptPathProvider.class);
    private final Map<String, String> replacements;

    public DefaultRptPathProvider() {
        super(getPathTemplate());
        LOG.debug("A path provider was not specified, using DefaultRptPathProvider");
        replacements = buildReplacements();
    }

    @Override
    protected Map<String, String> getReplacements() {
        return replacements;
    }

    private static String getPathTemplate() {
        String pathTemplate = EnvironmentRptPathProvider.getPathTemplate();
        if (pathTemplate == null) {
            LOG.debug(
                    "Unable to get path template from {} env variable, using IMDS template",
                    EnvironmentRptPathProvider.OCI_RESOURCE_PRINCIPAL_RPT_PATH);
            pathTemplate = ImdsRptPathProvider.getPathTemplate();
        }
        LOG.debug("The path template is {}", pathTemplate);
        return pathTemplate;
    }

    private Map<String, String> buildReplacements() {
        Map<String, String> replacementMap = EnvironmentRptPathProvider.buildReplacements();
        if (replacementMap == null) {
            LOG.debug(
                    "Unable to get replacements from {} env variable, getting replacements from IMDS",
                    EnvironmentRptPathProvider.OCI_RESOURCE_PRINCIPAL_RPT_ID);
            replacementMap = ImdsRptPathProvider.buildReplacements();
        }
        LOG.debug("The replacement map is {}", replacementMap);
        return replacementMap;
    }
}
