/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util;

import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;
import com.oracle.bmc.internal.EndpointBuilder;
import com.oracle.bmc.util.internal.StringUtils;
import org.slf4j.Logger;

import java.util.Locale;

public class RealmSpecificEndpointTemplateUtils {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RealmSpecificEndpointTemplateUtils.class);
    private static final String OCI_REALM_SPECIFIC_SERVICE_ENDPOINT_TEMPLATE_ENABLED_ENV_VAR =
            "OCI_REALM_SPECIFIC_SERVICE_ENDPOINT_TEMPLATE_ENABLED";

    /**
     * Returns the boolean indicating if the SDK should use realm-specific endpoint templates or
     * not.
     *
     * @return true if the client should use realm-specific endpoint template
     */
    public static boolean getUseOfRealmSpecificEndpointTemplateByDefault() {
        final String useOfRealmSpecificEndpointTemplateEnabledEnvVar =
                System.getenv(OCI_REALM_SPECIFIC_SERVICE_ENDPOINT_TEMPLATE_ENABLED_ENV_VAR);
        return useOfRealmSpecificEndpointTemplateEnabledEnvVar != null
                && useOfRealmSpecificEndpointTemplateEnabledEnvVar.equalsIgnoreCase("true");
    }

    /**
     * This method is called when use of realm-specific endpoint template is enabled.
     *
     * @param regionId
     * @return
     */
    public static String getRealmSpecificEndpointTemplate(
            boolean useOfRealmSpecificEndpointTemplateEnabled, String regionId, Service service) {
        if (StringUtils.isBlank(regionId)) {
            throw new java.lang.NullPointerException(
                    "Cannot determine the realm since regionId is null or blank. useRealmSpecificEndpointTemplate() can only be used if regionId is set.");
        }
        try {
            Realm realm = Region.fromRegionId(regionId).getRealm();

            if (useOfRealmSpecificEndpointTemplateEnabled
                    && (service.getServiceEndpointTemplateForRealmMap() == null)) {
                useOfRealmSpecificEndpointTemplateEnabled = false;
                LOG.debug(
                        "Realm-specific endpoint template not defined for realm {}, using non-realm-specific endpoint template instead.",
                        realm.getRealmId().toLowerCase(Locale.ROOT));
            }

            String endpointTemplateToUse;
            if (useOfRealmSpecificEndpointTemplateEnabled) {
                endpointTemplateToUse =
                        EndpointBuilder.getRealmSpecificEndpointTemplate(regionId, service, realm);
            } else {
                endpointTemplateToUse =
                        EndpointBuilder.getServiceEndpointTemplateToUse(regionId, service, realm);
            }
            LOG.debug("Setting endpoint template to: {}", endpointTemplateToUse);
            return endpointTemplateToUse;
        } catch (IllegalArgumentException e) {
            String defaultEndpointTemplate = Region.formatDefaultRegionEndpoint(service, regionId);
            LOG.info(
                    "Cannot determine the realm for unknown regionId '{}', falling back to default endpoint format `{}`",
                    regionId,
                    defaultEndpointTemplate);
            return defaultEndpointTemplate;
        }
    }
}
