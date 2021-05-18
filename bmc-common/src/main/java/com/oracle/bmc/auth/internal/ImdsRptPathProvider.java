/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.auth.AbstractFederationClientAuthenticationDetailsProviderBuilder;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.util.Map;

/**
 * This path provider is used as a fallback when environment variables are not set.
 *
 * For the path, use the current path: "/20180711/resourcePrincipalToken/{id}"
 * For the resource id, use IMDS to get the instance id
 *
 */
@Slf4j
public class ImdsRptPathProvider extends AbstractTemplateRptPathProvider {

    /**
     * Default path template of metadata service.
     */
    private static final String IMDS_PATH_TEMPLATE = "/20180711/resourcePrincipalToken/{id}";

    /**
     * Default base url of metadata service.
     */
    protected static final String METADATA_SERVICE_BASE_URL = "http://169.254.169.254/opc/v2/";

    /**
     * The Authorization header value to be sent for requests to the metadata service.
     */
    private static final String AUTHORIZATION_HEADER_VALUE = "Bearer Oracle";

    private final Map<String, String> replacements;

    /**
     * Constructor of ImdsRptPathProvider.
     *
     * @param pathTemplate string template with placeholders like "{id}"
     */
    public ImdsRptPathProvider(String pathTemplate) {
        super(pathTemplate);
        replacements = buildReplacements();
    }

    @Override
    protected Map<String, String> getReplacements() {
        return replacements;
    }

    static String getPathTemplate() {
        return IMDS_PATH_TEMPLATE;
    }

    static Map<String, String> buildReplacements() {
        // Get instance Id from metadata service
        return ImmutableMap.of("id", getInstanceIdFromIMDS());
    }

    private static String getInstanceIdFromIMDS() {
        final String INSTANCE_ID = "id";
        String instanceId =
                AbstractFederationClientAuthenticationDetailsProviderBuilder.simpleRetry(
                        base -> {
                            String instanceIdentity =
                                    base.path(INSTANCE_ID)
                                            .request(MediaType.TEXT_PLAIN)
                                            .header(
                                                    HttpHeaders.AUTHORIZATION,
                                                    AUTHORIZATION_HEADER_VALUE)
                                            .get(String.class);
                            return instanceIdentity;
                        },
                        METADATA_SERVICE_BASE_URL,
                        INSTANCE_ID);
        return instanceId;
    }
}
