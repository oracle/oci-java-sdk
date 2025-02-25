/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.internal;

import javax.annotation.Nonnull;

/**
 * DefaultEndpointConfiguration provides a way to construct the host endpoint for a service
 * given a template and some variables based on the default Oracle Cloud Infrastructure naming
 * convention.
 * <p>
 * The available variables are:
 * - {serviceEndpointPrefix} : The service prefix in the URL.
 * - {region} : The public region id, ex, "us-phoenix-1".
 * - {secondLevelDomain} : The second level domain associated with the Realm.
 */
public class DefaultEndpointConfiguration {
    private static final String SERVICE_ENDPOINT_PREFIX_TEMPLATE = "{serviceEndpointPrefix}";
    private static final String REGION_ID_TEMPLATE =
            "{region}"; // not regionId for backwards compatibility
    private static final String SECOND_LEVEL_DOMAIN_TEMPLATE = "{secondLevelDomain}";
    private static final String ENDPOINT_SERVICE_NAME_TEMPLATE = "{endpointServiceName}";

    // the endpoint template that will be used.
    private final String endpointTemplate;

    private String serviceEndpointPrefix;
    private String regionId;
    private String secondLevelDomain;
    private String endpointServiceName;

    /**
     * Creates a new builder starting with the given template.
     * @param endpointTemplate The template
     * @return A new builder.
     */
    public static DefaultEndpointConfiguration builder(@Nonnull String endpointTemplate) {
        if (endpointTemplate == null) {
            throw new java.lang.NullPointerException(
                    "endpointTemplate is marked non-null but is null");
        }
        return new DefaultEndpointConfiguration(endpointTemplate);
    }

    /**
     * Sets the service endpoint prefix, if one.
     *
     * @param serviceEndpointPrefix The service endpoint prefix.
     * @return This builder
     */
    public DefaultEndpointConfiguration serviceEndpointPrefix(String serviceEndpointPrefix) {
        this.serviceEndpointPrefix = serviceEndpointPrefix;
        return this;
    }

    /**
     * Sets the regionId, if one.
     *
     * @param regionId The region id.
     * @return This builder
     */
    public DefaultEndpointConfiguration regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Sets the second level domain, if one.
     *
     * @param secondLevelDomain The second level domain of the Realm.
     * @return This builder
     */
    public DefaultEndpointConfiguration secondLevelDomain(String secondLevelDomain) {
        this.secondLevelDomain = secondLevelDomain;
        return this;
    }

    /**
     * Sets the endpoint service name, if one.
     *
     * @param endpointServiceName The endpoint service name.
     * @return This builder
     */
    public DefaultEndpointConfiguration endpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
        return this;
    }

    /**
     * Builds the final endpoint based on the variables provided.
     * @return The endpoint.
     */
    public String build() {
        String endpoint = endpointTemplate;
        if (serviceEndpointPrefix != null) {
            endpoint = endpoint.replace(SERVICE_ENDPOINT_PREFIX_TEMPLATE, serviceEndpointPrefix);
        }
        if (regionId != null) {
            endpoint = endpoint.replace(REGION_ID_TEMPLATE, regionId);
        }
        if (secondLevelDomain != null) {
            endpoint = endpoint.replace(SECOND_LEVEL_DOMAIN_TEMPLATE, secondLevelDomain);
        }
        if (endpointServiceName != null) {
            endpoint = endpoint.replace(ENDPOINT_SERVICE_NAME_TEMPLATE, endpointServiceName);
        }
        return endpoint;
    }

    @java.beans.ConstructorProperties({"endpointTemplate"})
    private DefaultEndpointConfiguration(final String endpointTemplate) {
        this.endpointTemplate = endpointTemplate;
    }
}
