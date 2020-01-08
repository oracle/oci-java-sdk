/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import java.util.HashMap;
import java.util.Map;

import lombok.Builder;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.Validate;

/**
 * Factory class to create new {@link Service} instances.
 * <p>
 * This serves to ensure conflicting definitions of services
 * don't get created.
 */
@Slf4j
public class Services {
    private static final Map<String, Service> SERVICE_CACHE = new HashMap<>();

    /**
     * Create a new service definition.  If the service has already been registered
     * with different values, an IllegalArgumentException will be raised.  If the
     * service has already been registered, the existing definition will be returned.
     *
     * @param serviceName The unique service name.
     * @param serviceEndpointPrefix The endpoint prefix.
     * @return A Service instance.
     * @deprecated Use {@link #serviceBuilder()} instead
     */
    @Deprecated
    public static Service create(final String serviceName, final String serviceEndpointPrefix) {
        return serviceBuilder()
                .serviceName(serviceName)
                .serviceEndpointPrefix(serviceEndpointPrefix)
                .build();
    }

    /**
     * Get Service instance based on service name.
     *
     * @param serviceName service name should be UPPER CASE.
     * @return service instance
     */
    public static Service getServiceByName(final String serviceName) {
        return SERVICE_CACHE.get(serviceName);
    }

    @Builder(builderClassName = "ServiceBuilder", builderMethodName = "serviceBuilder")
    private static synchronized Service create(
            final String serviceName,
            final String serviceEndpointPrefix,
            final String serviceEndpointTemplate) {
        Validate.notBlank(serviceName);

        final Service newInstance =
                new BasicService(serviceName, serviceEndpointPrefix, serviceEndpointTemplate);
        if (SERVICE_CACHE.containsKey(serviceName)) {
            Service existing = SERVICE_CACHE.get(serviceName);
            if (existing.equals(newInstance)) {
                return existing;
            }
            throw new IllegalArgumentException(
                    String.format(
                            "Cannot redefine service '%s'. Existing: '%s', New: '%s'",
                            serviceName,
                            existing,
                            newInstance));
        }
        LOG.info("Registering new service: {}", newInstance);
        SERVICE_CACHE.put(serviceName, newInstance);
        return newInstance;
    }

    @Value
    private static final class BasicService implements Service {
        private final String serviceName;
        private final String serviceEndpointPrefix;
        private final String serviceEndpointTemplate;
    }
}
