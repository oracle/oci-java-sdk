/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import org.slf4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.oracle.bmc.util.internal.Validate;

/**
 * Factory class to create new {@link Service} instances.
 *
 * <p>This serves to ensure conflicting definitions of services don't get created.
 */
public class Services {
    private static final Map<String, Service> SERVICE_CACHE = new HashMap<>();
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Services.class);
    private static final Map<String, String> REALM_SPECIFIC_ENDPOINT_TEMPLATE_MAP = new HashMap<>();

    /**
     * Create a new service definition. If the service has already been registered with different
     * values, an IllegalArgumentException will be raised. If the service has already been
     * registered, the existing definition will be returned.
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

    private static synchronized Service create(
            final String serviceName,
            final String serviceEndpointPrefix,
            final String serviceEndpointTemplate,
            final String endpointServiceName) {
        Validate.notBlank(serviceName, "serviceName must be set to a non-empty string");

        final Service newInstance =
                new BasicService(
                        serviceName,
                        serviceEndpointPrefix,
                        serviceEndpointTemplate,
                        endpointServiceName);
        if (SERVICE_CACHE.containsKey(serviceName)) {
            Service existing = SERVICE_CACHE.get(serviceName);
            if (existing.equals(newInstance)) {
                return existing;
            }
            throw new IllegalArgumentException(
                    String.format(
                            "Cannot redefine service '%s'. Existing: '%s', New: '%s'",
                            serviceName, existing, newInstance));
        }
        LOG.info("Registering new service: {}", newInstance);
        SERVICE_CACHE.put(serviceName, newInstance);
        return newInstance;
    }

    public static ServiceBuilder serviceBuilder() {
        return new ServiceBuilder();
    }

    private static final class BasicService implements Service {
        private final String serviceName;
        private final String serviceEndpointPrefix;
        private final String serviceEndpointTemplate;
        private final String endpointServiceName;

        @java.beans.ConstructorProperties({
            "serviceName",
            "serviceEndpointPrefix",
            "serviceEndpointTemplate",
            "endpointServiceName"
        })
        public BasicService(
                String serviceName,
                String serviceEndpointPrefix,
                String serviceEndpointTemplate,
                String endpointServiceName) {
            this.serviceName = serviceName;
            this.serviceEndpointPrefix = serviceEndpointPrefix;
            this.serviceEndpointTemplate = serviceEndpointTemplate;
            this.endpointServiceName = endpointServiceName;
        }

        public String getServiceName() {
            return this.serviceName;
        }

        public String getServiceEndpointPrefix() {
            return this.serviceEndpointPrefix;
        }

        public String getServiceEndpointTemplate() {
            return this.serviceEndpointTemplate;
        }

        public void addServiceEndpointTemplateForRealm(String realmId, String endpoint) {
            REALM_SPECIFIC_ENDPOINT_TEMPLATE_MAP.put(realmId, endpoint);
        }

        public Map<String, String> getServiceEndpointTemplateForRealmMap() {
            return Collections.unmodifiableMap(REALM_SPECIFIC_ENDPOINT_TEMPLATE_MAP);
        }

        public String getEndpointServiceName() {
            return this.endpointServiceName;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof BasicService)) return false;
            final BasicService other = (BasicService) o;
            final Object this$serviceName = this.getServiceName();
            final Object other$serviceName = other.getServiceName();
            if (this$serviceName == null
                    ? other$serviceName != null
                    : !this$serviceName.equals(other$serviceName)) return false;
            final Object this$serviceEndpointPrefix = this.getServiceEndpointPrefix();
            final Object other$serviceEndpointPrefix = other.getServiceEndpointPrefix();
            if (this$serviceEndpointPrefix == null
                    ? other$serviceEndpointPrefix != null
                    : !this$serviceEndpointPrefix.equals(other$serviceEndpointPrefix)) return false;
            final Object this$serviceEndpointTemplate = this.getServiceEndpointTemplate();
            final Object other$serviceEndpointTemplate = other.getServiceEndpointTemplate();
            if (this$serviceEndpointTemplate == null
                    ? other$serviceEndpointTemplate != null
                    : !this$serviceEndpointTemplate.equals(other$serviceEndpointTemplate))
                return false;
            final Object this$endpointServiceName = this.getEndpointServiceName();
            final Object other$endpointServiceName = other.getEndpointServiceName();
            if (this$endpointServiceName == null
                    ? other$endpointServiceName != null
                    : !this$endpointServiceName.equals(other$endpointServiceName)) return false;
            return true;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $serviceName = this.getServiceName();
            result = result * PRIME + ($serviceName == null ? 43 : $serviceName.hashCode());
            final Object $serviceEndpointPrefix = this.getServiceEndpointPrefix();
            result =
                    result * PRIME
                            + ($serviceEndpointPrefix == null
                                    ? 43
                                    : $serviceEndpointPrefix.hashCode());
            final Object $serviceEndpointTemplate = this.getServiceEndpointTemplate();
            result =
                    result * PRIME
                            + ($serviceEndpointTemplate == null
                                    ? 43
                                    : $serviceEndpointTemplate.hashCode());
            final Object $endpointServiceName = this.getEndpointServiceName();
            result =
                    result * PRIME
                            + ($endpointServiceName == null ? 43 : $endpointServiceName.hashCode());
            return result;
        }

        public String toString() {
            return "Services.BasicService(serviceName="
                    + this.getServiceName()
                    + ", serviceEndpointPrefix="
                    + this.getServiceEndpointPrefix()
                    + ", serviceEndpointTemplate="
                    + this.getServiceEndpointTemplate()
                    + ", endpointServiceName="
                    + this.getEndpointServiceName()
                    + ")";
        }
    }

    public static class ServiceBuilder {
        private String serviceName;
        private String serviceEndpointPrefix;
        private String serviceEndpointTemplate;
        private String endpointServiceName;

        ServiceBuilder() {}

        public ServiceBuilder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public ServiceBuilder serviceEndpointPrefix(String serviceEndpointPrefix) {
            this.serviceEndpointPrefix = serviceEndpointPrefix;
            return this;
        }

        public ServiceBuilder serviceEndpointTemplate(String serviceEndpointTemplate) {
            this.serviceEndpointTemplate = serviceEndpointTemplate;
            return this;
        }

        public ServiceBuilder addServiceEndpointTemplateForRealm(String realmId, String endpoint) {
            REALM_SPECIFIC_ENDPOINT_TEMPLATE_MAP.put(realmId, endpoint);
            return this;
        }

        public ServiceBuilder endpointServiceName(String endpointServiceName) {
            this.endpointServiceName = endpointServiceName;
            return this;
        }

        public Service build() {
            return Services.create(
                    serviceName,
                    serviceEndpointPrefix,
                    serviceEndpointTemplate,
                    endpointServiceName);
        }

        public String toString() {
            return "Services.ServiceBuilder(serviceName="
                    + this.serviceName
                    + ", serviceEndpointPrefix="
                    + this.serviceEndpointPrefix
                    + ", serviceEndpointTemplate="
                    + this.serviceEndpointTemplate
                    + ", endpointServiceName="
                    + this.endpointServiceName
                    + ")";
        }
    }
}
