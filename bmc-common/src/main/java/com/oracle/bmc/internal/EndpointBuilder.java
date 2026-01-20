/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.internal;

import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;
import com.oracle.bmc.http.client.HttpProviderCapability;
import com.oracle.bmc.http.client.Options;
import com.oracle.bmc.http.client.StandardHttpProviderCapability;
import com.oracle.bmc.util.internal.StringUtils;
import jakarta.annotation.Nonnull;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * EndpointBuilder provides a wrapper to construct the appropriate endpoint for a service. The
 * service may override the endpoint template, but if not, a default template will be used.
 */
public class EndpointBuilder {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EndpointBuilder.class);
    public static final String DEFAULT_ENDPOINT_TEMPLATE =
            "https://{serviceEndpointPrefix}.{region}.{secondLevelDomain}";

    private static final String ENDPOINT_TEMPLATE_FOR_REGION_WITH_DOT =
            "https://{endpointServiceName}.{region}";

    private static final Map<String, String> OVERRIDE_REGION_IDS = new HashMap<>();

    /**
     * Creates the service endpoint using the {@link DefaultEndpointConfiguration} method.
     *
     * @param service The service
     * @param regionId The regionId
     * @param realm The realm this region belongs to.
     * @param httpProviderCapabilityPredicate a predicate that checks whether the HTTP provider has
     *     a certain capability
     * @return The endpoint (protocol + FQDN) for this service.
     */
    public static String createEndpoint(
            @Nonnull Service service,
            @Nonnull String regionId,
            @Nonnull Realm realm,
            @Nonnull Predicate<HttpProviderCapability> httpProviderCapabilityPredicate) {
        if (service == null) {
            throw new java.lang.NullPointerException("service is marked non-null but is null");
        }
        if (regionId == null) {
            throw new java.lang.NullPointerException("regionId is marked non-null but is null");
        }
        if (realm == null) {
            throw new java.lang.NullPointerException("realm is marked non-null but is null");
        }
        final String regionIdToUse;
        synchronized (OVERRIDE_REGION_IDS) {
            regionIdToUse = OVERRIDE_REGION_IDS.getOrDefault(regionId, regionId);
        }

        // Do not append any other endpoint suffix like '.service.oci.oraclecloud.com` at the end
        // Ex: If regionId is 'broom6.us.oracle.com', then endpoint should be
        // 'https://{service}.broom6.us.oracle.com'
        if (StringUtils.isNotBlank(regionId) && regionId.contains(".")) {
            final String endpoint;
            if (StringUtils.isNotBlank(service.getEndpointServiceName())) {
                endpoint =
                        DefaultEndpointConfiguration.builder(ENDPOINT_TEMPLATE_FOR_REGION_WITH_DOT)
                                .endpointServiceName(service.getEndpointServiceName())
                                .regionId(regionIdToUse)
                                .build();
                LOG.debug(
                        "Endpoint created from dotted region {} using endpoint service name {}. Endpoint: {}",
                        regionIdToUse,
                        service.getEndpointServiceName(),
                        endpoint);
            } else if (StringUtils.isNotBlank(service.getServiceEndpointTemplate())) {
                String serviceEndpointTemplate = service.getServiceEndpointTemplate();
                String endpointServiceNameFromTemplate =
                        getEndpointServiceNameFromTemplate(serviceEndpointTemplate);
                endpoint =
                        DefaultEndpointConfiguration.builder(ENDPOINT_TEMPLATE_FOR_REGION_WITH_DOT)
                                .endpointServiceName(endpointServiceNameFromTemplate)
                                .regionId(regionIdToUse)
                                .build();
                LOG.debug(
                        "Endpoint created from dotted region {} using endpoint template {}. Endpoint: {}",
                        regionIdToUse,
                        ENDPOINT_TEMPLATE_FOR_REGION_WITH_DOT,
                        endpoint);
            } else if (StringUtils.isNotBlank(service.getServiceEndpointPrefix())) {
                endpoint =
                        DefaultEndpointConfiguration.builder(ENDPOINT_TEMPLATE_FOR_REGION_WITH_DOT)
                                .endpointServiceName(service.getServiceEndpointPrefix())
                                .regionId(regionIdToUse)
                                .build();
                LOG.debug(
                        "Endpoint created from dotted region {} using service endpoint prefix {}. Endpoint: {}",
                        regionIdToUse,
                        service.getServiceEndpointPrefix(),
                        endpoint);
            } else {
                throw new IllegalArgumentException("Unknown service: " + service.getServiceName());
            }
            return endpoint;
        }

        if (httpProviderCapabilityPredicate.test(
                StandardHttpProviderCapability.PARAMETERIZED_ENDPOINTS)) {
            boolean useOfRealmSpecificEndpointTemplateEnabled =
                    Options.getUseOfRealmSpecificEndpointTemplateByDefault();
            boolean realmSpecificEndpointTemplateDefined =
                    service.getServiceEndpointTemplateForRealmMap() != null
                            && service.getServiceEndpointTemplateForRealmMap()
                                    .containsKey(realm.getRealmId().toLowerCase(Locale.ROOT));

            if (useOfRealmSpecificEndpointTemplateEnabled) {
                if (realmSpecificEndpointTemplateDefined) {
                    return getRealmSpecificEndpointTemplate(regionIdToUse, service, realm);
                } else {
                    LOG.debug(
                            "Realm-specific endpoint template not defined for realm {}, using non-realm-specific endpoint template instead.",
                            realm.getRealmId());
                }
            }
        } else {
            LOG.debug(
                    "Realm-specific endpoint template not defined for realm {}, using non-realm-specific endpoint template instead.",
                    realm.getRealmId());
        }
        return getServiceEndpointTemplateToUse(regionIdToUse, service, realm);
    }

    /**
     * Creates the service endpoint using the {@link DefaultEndpointConfiguration} method.
     *
     * @param service The service
     * @param regionId The regionId
     * @param realm The realm this region belongs to.
     * @return The endpoint (protocol + FQDN) for this service.
     */
    public static String createEndpoint(
            @Nonnull Service service, @Nonnull String regionId, @Nonnull Realm realm) {
        return createEndpoint(service, regionId, realm, c -> false);
    }

    public static String getRealmSpecificEndpointTemplate(
            String regionId, Service service, Realm realm) {
        Map<String, String> serviceEndpointTemplateForRealmMap =
                service.getServiceEndpointTemplateForRealmMap();
        String endpointTemplateToUse;
        if (serviceEndpointTemplateForRealmMap.containsKey(
                realm.getRealmId().toLowerCase(Locale.ROOT))) {
            endpointTemplateToUse =
                    serviceEndpointTemplateForRealmMap.get(
                            realm.getRealmId().toLowerCase(Locale.ROOT));
        } else {
            LOG.debug(
                    "Endpoint template not defined for {} realm, using non-realm-specific endpoint template instead",
                    realm.getRealmId());
            endpointTemplateToUse = getServiceEndpointTemplateToUse(regionId, service, realm);
        }
        LOG.debug("Setting endpoint template to: {}", endpointTemplateToUse);
        return DefaultEndpointConfiguration.builder(endpointTemplateToUse)
                .regionId(regionId)
                .serviceEndpointPrefix(service.getServiceEndpointPrefix())
                .secondLevelDomain(realm.getSecondLevelDomain())
                .build();
    }

    public static String getServiceEndpointTemplateToUse(
            String regionId, Service service, Realm realm) {
        String endpointTemplateToUse;
        if (StringUtils.isNotBlank(service.getServiceEndpointTemplate())) {
            endpointTemplateToUse = service.getServiceEndpointTemplate();
        } else {
            endpointTemplateToUse = DEFAULT_ENDPOINT_TEMPLATE;
        }
        LOG.debug("Setting endpoint template to: {}", endpointTemplateToUse);
        return DefaultEndpointConfiguration.builder(endpointTemplateToUse)
                .regionId(regionId)
                .serviceEndpointPrefix(service.getServiceEndpointPrefix())
                .secondLevelDomain(realm.getSecondLevelDomain())
                .build();
    }

    private static String getEndpointServiceNameFromTemplate(String serviceEndpointTemplate) {
        int doubleSlashPos = serviceEndpointTemplate.indexOf("//");
        int dotPos = serviceEndpointTemplate.indexOf(".", doubleSlashPos);
        if (doubleSlashPos == -1 || dotPos == -1) {
            throw new IllegalArgumentException(
                    "The service endpoint template "
                            + serviceEndpointTemplate
                            + " is not in the expected format. The expected format is "
                            + DEFAULT_ENDPOINT_TEMPLATE);
        }
        return serviceEndpointTemplate.substring(doubleSlashPos + 2, dotPos);
    }

    /**
     * Creates the service endpoint using the {@link DefaultEndpointConfiguration} method.
     *
     * @param service The service
     * @param region The region
     * @return The endpoint (protocol + FQDN) for this service.
     * @deprecated Please use {@link #createEndpoint(Service, Region, Predicate)}
     */
    @Deprecated
    public static String createEndpoint(@Nonnull Service service, @Nonnull Region region) {
        return createEndpoint(service, region, c -> false);
    }

    /**
     * Creates the service endpoint using the {@link DefaultEndpointConfiguration} method.
     *
     * @param service The service
     * @param region The region
     * @param httpProviderCapabilityPredicate a predicate that checks whether the HTTP provider has
     *     a certain capability
     * @return The endpoint (protocol + FQDN) for this service.
     */
    public static String createEndpoint(
            @Nonnull Service service,
            @Nonnull Region region,
            @Nonnull Predicate<HttpProviderCapability> httpProviderCapabilityPredicate) {
        Objects.requireNonNull(service, "service");
        Objects.requireNonNull(region, "region");
        Objects.requireNonNull(httpProviderCapabilityPredicate, "httpProviderCapabilityPredicate");
        return createEndpoint(
                service, region.getRegionId(), region.getRealm(), httpProviderCapabilityPredicate);
    }

    /**
     * Temporary ability to override the region for a given regionId.
     *
     * <p>This will most likely be removed at a later point in time. It is not intended for use
     * outside of the SDK.
     *
     * @param regionId The value obtained from {@link Region#getRegionId()}.
     * @param overrideRegionId The alternative regionId to use.
     */
    public static void overrideRegionId(
            @Nonnull String regionId, @Nonnull String overrideRegionId) {
        if (regionId == null) {
            throw new java.lang.NullPointerException("regionId is marked non-null but is null");
        }
        if (overrideRegionId == null) {
            throw new java.lang.NullPointerException(
                    "overrideRegionId is marked non-null but is null");
        }
        synchronized (OVERRIDE_REGION_IDS) {
            LOG.warn(
                    "Overriding regionId for regionId \'{}\' to \'{}\'",
                    regionId,
                    overrideRegionId);
            OVERRIDE_REGION_IDS.put(regionId, overrideRegionId);
        }
    }

    private EndpointBuilder() {}
}
