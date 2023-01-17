/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Summary of services that are integrated with public logging. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ServiceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ServiceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tenantId",
        "namespace",
        "servicePrincipalName",
        "endpoint",
        "name",
        "id",
        "resourceTypes"
    })
    public ServiceSummary(
            String tenantId,
            String namespace,
            String servicePrincipalName,
            String endpoint,
            String name,
            String id,
            java.util.List<ResourceType> resourceTypes) {
        super();
        this.tenantId = tenantId;
        this.namespace = namespace;
        this.servicePrincipalName = servicePrincipalName;
        this.endpoint = endpoint;
        this.name = name;
        this.id = id;
        this.resourceTypes = resourceTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Tenant OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * Tenant OCID.
         *
         * @param tenantId the value to set
         * @return this builder
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /** Apollo project namespace, if any. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Apollo project namespace, if any.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** Service ID as set in Service Principal. */
        @com.fasterxml.jackson.annotation.JsonProperty("servicePrincipalName")
        private String servicePrincipalName;

        /**
         * Service ID as set in Service Principal.
         *
         * @param servicePrincipalName the value to set
         * @return this builder
         */
        public Builder servicePrincipalName(String servicePrincipalName) {
            this.servicePrincipalName = servicePrincipalName;
            this.__explicitlySet__.add("servicePrincipalName");
            return this;
        }
        /** Service endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

        /**
         * Service endpoint.
         *
         * @param endpoint the value to set
         * @return this builder
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }
        /** User-friendly service name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * User-friendly service name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Service ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Service ID.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Type of resource that a service provides. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypes")
        private java.util.List<ResourceType> resourceTypes;

        /**
         * Type of resource that a service provides.
         *
         * @param resourceTypes the value to set
         * @return this builder
         */
        public Builder resourceTypes(java.util.List<ResourceType> resourceTypes) {
            this.resourceTypes = resourceTypes;
            this.__explicitlySet__.add("resourceTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceSummary build() {
            ServiceSummary model =
                    new ServiceSummary(
                            this.tenantId,
                            this.namespace,
                            this.servicePrincipalName,
                            this.endpoint,
                            this.name,
                            this.id,
                            this.resourceTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceSummary model) {
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("servicePrincipalName")) {
                this.servicePrincipalName(model.getServicePrincipalName());
            }
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("resourceTypes")) {
                this.resourceTypes(model.getResourceTypes());
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

    /** Tenant OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * Tenant OCID.
     *
     * @return the value
     */
    public String getTenantId() {
        return tenantId;
    }

    /** Apollo project namespace, if any. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Apollo project namespace, if any.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** Service ID as set in Service Principal. */
    @com.fasterxml.jackson.annotation.JsonProperty("servicePrincipalName")
    private final String servicePrincipalName;

    /**
     * Service ID as set in Service Principal.
     *
     * @return the value
     */
    public String getServicePrincipalName() {
        return servicePrincipalName;
    }

    /** Service endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

    /**
     * Service endpoint.
     *
     * @return the value
     */
    public String getEndpoint() {
        return endpoint;
    }

    /** User-friendly service name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * User-friendly service name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Service ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Service ID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Type of resource that a service provides. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypes")
    private final java.util.List<ResourceType> resourceTypes;

    /**
     * Type of resource that a service provides.
     *
     * @return the value
     */
    public java.util.List<ResourceType> getResourceTypes() {
        return resourceTypes;
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
        sb.append("ServiceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", servicePrincipalName=").append(String.valueOf(this.servicePrincipalName));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", resourceTypes=").append(String.valueOf(this.resourceTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceSummary)) {
            return false;
        }

        ServiceSummary other = (ServiceSummary) o;
        return java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.servicePrincipalName, other.servicePrincipalName)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceTypes, other.resourceTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.servicePrincipalName == null
                                ? 43
                                : this.servicePrincipalName.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypes == null ? 43 : this.resourceTypes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
