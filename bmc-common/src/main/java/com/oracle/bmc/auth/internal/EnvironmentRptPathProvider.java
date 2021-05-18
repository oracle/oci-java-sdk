/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * This path provider reads the path and resource id from environment variables
 *
 * Use the contents of the OCI_RESOURCE_PRINCIPAL_RPT_PATH environment variable for the path and
 * OCI_RESOURCE_PRINCIPAL_RPT_ID environment variable for the resource id,.
 *
 * This path provider is used when the caller provides EnvironmentRptPathProvider as a path provider to the resource principals signer
 */
public class EnvironmentRptPathProvider extends AbstractTemplateRptPathProvider {

    static final String OCI_RESOURCE_PRINCIPAL_RPT_PATH = "OCI_RESOURCE_PRINCIPAL_RPT_PATH";
    static final String OCI_RESOURCE_PRINCIPAL_RPT_ID = "OCI_RESOURCE_PRINCIPAL_RPT_ID";

    private final Map<String, String> replacements;

    public EnvironmentRptPathProvider() {
        super(getPathTemplate());
        this.replacements = buildReplacements();
        Preconditions.checkNotNull(
                replacements, "Environment variable 'OCI_RESOURCE_PRINCIPAL_RPT_ID' was not set");
    }

    @Override
    protected Map<String, String> getReplacements() {
        return replacements;
    }

    protected static String getPathTemplate() {
        return System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_PATH);
    }

    protected static Map<String, String> buildReplacements() {
        String rpt_id = System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_ID);
        if (rpt_id != null) {
            return ImmutableMap.of("id", rpt_id);
        } else {
            return null;
        }
    }
}
