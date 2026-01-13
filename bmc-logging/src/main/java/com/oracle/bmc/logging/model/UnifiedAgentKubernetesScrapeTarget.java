/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Monitoring scrape object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UnifiedAgentKubernetesScrapeTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentKubernetesScrapeTarget
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceType",
        "k8sNamespace",
        "serviceName",
        "resourceGroup"
    })
    public UnifiedAgentKubernetesScrapeTarget(
            ResourceType resourceType,
            String k8sNamespace,
            String serviceName,
            String resourceGroup) {
        super();
        this.resourceType = resourceType;
        this.k8sNamespace = k8sNamespace;
        this.serviceName = serviceName;
        this.resourceGroup = resourceGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of resource to scrape metrics. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

        /**
         * Type of resource to scrape metrics.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** K8s namespace of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("k8sNamespace")
        private String k8sNamespace;

        /**
         * K8s namespace of the resource.
         *
         * @param k8sNamespace the value to set
         * @return this builder
         */
        public Builder k8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            this.__explicitlySet__.add("k8sNamespace");
            return this;
        }
        /** Name of the service prepended to the endpoints. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Name of the service prepended to the endpoints.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** Resource group in OCI monitoring. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * Resource group in OCI monitoring.
         *
         * @param resourceGroup the value to set
         * @return this builder
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentKubernetesScrapeTarget build() {
            UnifiedAgentKubernetesScrapeTarget model =
                    new UnifiedAgentKubernetesScrapeTarget(
                            this.resourceType,
                            this.k8sNamespace,
                            this.serviceName,
                            this.resourceGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentKubernetesScrapeTarget model) {
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("k8sNamespace")) {
                this.k8sNamespace(model.getK8sNamespace());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Type of resource to scrape metrics. */
    public enum ResourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Pods("PODS"),
        Endpoints("ENDPOINTS"),
        Nodes("NODES"),
        Services("SERVICES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceType.class);

        private final String value;
        private static java.util.Map<String, ResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceType v : ResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of resource to scrape metrics. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceType resourceType;

    /**
     * Type of resource to scrape metrics.
     *
     * @return the value
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    /** K8s namespace of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("k8sNamespace")
    private final String k8sNamespace;

    /**
     * K8s namespace of the resource.
     *
     * @return the value
     */
    public String getK8sNamespace() {
        return k8sNamespace;
    }

    /** Name of the service prepended to the endpoints. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Name of the service prepended to the endpoints.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** Resource group in OCI monitoring. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * Resource group in OCI monitoring.
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UnifiedAgentKubernetesScrapeTarget(");
        sb.append("super=").append(super.toString());
        sb.append("resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", k8sNamespace=").append(String.valueOf(this.k8sNamespace));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentKubernetesScrapeTarget)) {
            return false;
        }

        UnifiedAgentKubernetesScrapeTarget other = (UnifiedAgentKubernetesScrapeTarget) o;
        return java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.k8sNamespace, other.k8sNamespace)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.k8sNamespace == null ? 43 : this.k8sNamespace.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
