/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.internal;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * EndpointBuilder provides a wrapper to construct the appropriate
 * endpoint for a service.  The service may override the endpoint template, but
 * if not, a default template will be used.
 */
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class EndpointBuilder {
    public static final String DEFAULT_ENDPOINT_TEMPLATE =
            "https://{serviceEndpointPrefix}.{region}.{secondLevelDomain}";

    @RequiredArgsConstructor
    private enum SecondLevelDomainNames {
        ORACLECLOUD_COM("oraclecloud.com");

        /**
         * The default second level domain for all regions in this realm.
         * Does not start with '.'.
         */
        private final String secondLevelDomain;
    }

    @Getter(value = AccessLevel.PACKAGE)
    private final static ImmutableMap<Realm, String> realmToSecondLevelDomainName =
            ImmutableMap.of(Realm.OC1, SecondLevelDomainNames.ORACLECLOUD_COM.secondLevelDomain);

    /**
     * Creates the service endpoint using the {@link DefaultEndpointConfiguration}
     * method.
     *
     * @param service The service
     * @param regionId The regionId
     * @param realm The realm this region belongs to.
     * @return The endpoint (protocol + FQDN) for this service.
     */
    public static String createEndpoint(Service service, String regionId, Realm realm) {
        final String endpointTemplateToUse;
        if (StringUtils.isNotBlank(service.getServiceEndpointTemplate())) {
            endpointTemplateToUse = service.getServiceEndpointTemplate();
        } else {
            endpointTemplateToUse = DEFAULT_ENDPOINT_TEMPLATE;
        }

        return DefaultEndpointConfiguration.builder(endpointTemplateToUse)
                .regionId(regionId)
                .serviceEndpointPrefix(service.getServiceEndpointPrefix())
                .secondLevelDomain(realmToSecondLevelDomainName.get(realm))
                .build();
    }

    /**
     * Creates the service endpoint using the {@link DefaultEndpointConfiguration}
     * method.
     *
     * @param service The service
     * @param region The region
     * @return The endpoint (protocol + FQDN) for this service.
     */
    public static String createEndpoint(Service service, Region region) {
        return createEndpoint(service, region.getRegionId(), region.getRealm());
    }
}
