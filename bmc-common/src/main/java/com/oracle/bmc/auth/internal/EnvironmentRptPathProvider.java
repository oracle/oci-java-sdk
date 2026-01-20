/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.util.internal.Validate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * This path provider reads the path and resource id from environment variables
 *
 * <p>Use the contents of the OCI_RESOURCE_PRINCIPAL_RPT_PATH environment variable for the path and
 * OCI_RESOURCE_PRINCIPAL_RPT_ID environment variable for the resource id,.
 *
 * <p>This path provider is used when the caller provides EnvironmentRptPathProvider as a path
 * provider to the resource principals signer
 */
public class EnvironmentRptPathProvider extends AbstractTemplateRptPathProvider {

    static final String OCI_RESOURCE_PRINCIPAL_RPT_PATH = "OCI_RESOURCE_PRINCIPAL_RPT_PATH";
    static final String OCI_RESOURCE_PRINCIPAL_RPT_ID = "OCI_RESOURCE_PRINCIPAL_RPT_ID";

    private final Map<String, String> replacements;

    protected EnvironmentRptPathProvider(final String pathTemplate) {
        super(pathTemplate);
        this.replacements =
                Validate.notNull(
                        buildReplacements(),
                        "Environment variable 'OCI_RESOURCE_PRINCIPAL_RPT_ID' was not set");
    }

    public EnvironmentRptPathProvider() {
        this(getPathTemplate());
    }

    @Override
    protected Map<String, String> getReplacements() {
        return replacements;
    }

    protected static String getPathTemplate() {
        return System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_PATH);
    }

    protected static String getRptId() {
        return System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_ID);
    }

    protected static Map<String, String> buildReplacements() {
        return getRptIdAndReplace(getRptId());
    }

    private static Map<String, String> getRptIdAndReplace(String rptId) {
        String rpt_id = rptId;
        if (rpt_id != null) {
            Map<String, String> replacements = new HashMap<>();
            replacements.put("id", rpt_id);
            return Collections.unmodifiableMap(replacements);
        } else {
            return null;
        }
    }

    /**
     * This path provider reads the path and resource id for leaf resource from environment
     * variables
     *
     * <p>Use the contents of the OCI_RESOURCE_PRINCIPAL_RPT_PATH_FOR_LEAF_RESOURCE environment
     * variable for the path and OCI_RESOURCE_PRINCIPAL_RPT_ID_FOR_LEAF_RESOURCE environment
     * variable for the resource id,.
     *
     * <p>This path provider is used when the caller provides LeafResourceRptPathProvider as a path
     * provider to the resource principals signer
     */
    public static class LeafResourceRptPathProvider extends EnvironmentRptPathProvider {

        static final String OCI_RESOURCE_PRINCIPAL_RPT_PATH_FOR_LEAF_RESOURCE =
                "OCI_RESOURCE_PRINCIPAL_RPT_PATH_FOR_LEAF_RESOURCE";
        static final String OCI_RESOURCE_PRINCIPAL_RPT_ID_FOR_LEAF_RESOURCE =
                "OCI_RESOURCE_PRINCIPAL_RPT_ID_FOR_LEAF_RESOURCE";

        private final Map<String, String> replacements;

        public LeafResourceRptPathProvider() {
            super(getPathTemplate());
            this.replacements =
                    Validate.notNull(
                            buildReplacements(),
                            "Environment variable 'OCI_RESOURCE_PRINCIPAL_RPT_ID_FOR_LEAF_RESOURCE' was not set");
        }

        protected static String getRptId() {
            return System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_ID_FOR_LEAF_RESOURCE);
        }

        protected static String getPathTemplate() {
            return System.getenv(OCI_RESOURCE_PRINCIPAL_RPT_PATH_FOR_LEAF_RESOURCE);
        }

        protected static Map<String, String> buildReplacements() {
            return getRptIdAndReplace(getRptId());
        }
    }
}
