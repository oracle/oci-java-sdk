/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemanagerproxy.model;

/**
 * Detailed information about a service environment.
 * <p>
 **Note:** Service URL formats may vary from the provided example.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210914")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceEnvironment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceEnvironment {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "subscriptionId",
        "status",
        "compartmentId",
        "serviceDefinition",
        "consoleUrl",
        "serviceEnvironmentEndpoints"
    })
    public ServiceEnvironment(
            String id,
            String subscriptionId,
            ServiceEntitlementRegistrationStatus status,
            String compartmentId,
            ServiceDefinition serviceDefinition,
            String consoleUrl,
            java.util.List<ServiceEnvironmentEndPointOverview> serviceEnvironmentEndpoints) {
        super();
        this.id = id;
        this.subscriptionId = subscriptionId;
        this.status = status;
        this.compartmentId = compartmentId;
        this.serviceDefinition = serviceDefinition;
        this.consoleUrl = consoleUrl;
        this.serviceEnvironmentEndpoints = serviceEnvironmentEndpoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ServiceEntitlementRegistrationStatus status;

        public Builder status(ServiceEntitlementRegistrationStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceDefinition")
        private ServiceDefinition serviceDefinition;

        public Builder serviceDefinition(ServiceDefinition serviceDefinition) {
            this.serviceDefinition = serviceDefinition;
            this.__explicitlySet__.add("serviceDefinition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("consoleUrl")
        private String consoleUrl;

        public Builder consoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            this.__explicitlySet__.add("consoleUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceEnvironmentEndpoints")
        private java.util.List<ServiceEnvironmentEndPointOverview> serviceEnvironmentEndpoints;

        public Builder serviceEnvironmentEndpoints(
                java.util.List<ServiceEnvironmentEndPointOverview> serviceEnvironmentEndpoints) {
            this.serviceEnvironmentEndpoints = serviceEnvironmentEndpoints;
            this.__explicitlySet__.add("serviceEnvironmentEndpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceEnvironment build() {
            ServiceEnvironment __instance__ =
                    new ServiceEnvironment(
                            id,
                            subscriptionId,
                            status,
                            compartmentId,
                            serviceDefinition,
                            consoleUrl,
                            serviceEnvironmentEndpoints);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceEnvironment o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .subscriptionId(o.getSubscriptionId())
                            .status(o.getStatus())
                            .compartmentId(o.getCompartmentId())
                            .serviceDefinition(o.getServiceDefinition())
                            .consoleUrl(o.getConsoleUrl())
                            .serviceEnvironmentEndpoints(o.getServiceEnvironmentEndpoints());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unqiue identifier for the entitlement related to the environment.
     * <p>
     **Note:** Not an [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The unique subscription ID associated with the service environment ID.
     * <p>
     **Note:** Not an [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Status of the entitlement registration for the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ServiceEntitlementRegistrationStatus status;

    public ServiceEntitlementRegistrationStatus getStatus() {
        return status;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceDefinition")
    private final ServiceDefinition serviceDefinition;

    public ServiceDefinition getServiceDefinition() {
        return serviceDefinition;
    }

    /**
     * The URL for the console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consoleUrl")
    private final String consoleUrl;

    public String getConsoleUrl() {
        return consoleUrl;
    }

    /**
     * Array of service environment end points.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceEnvironmentEndpoints")
    private final java.util.List<ServiceEnvironmentEndPointOverview> serviceEnvironmentEndpoints;

    public java.util.List<ServiceEnvironmentEndPointOverview> getServiceEnvironmentEndpoints() {
        return serviceEnvironmentEndpoints;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ServiceEnvironment(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", serviceDefinition=").append(String.valueOf(this.serviceDefinition));
        sb.append(", consoleUrl=").append(String.valueOf(this.consoleUrl));
        sb.append(", serviceEnvironmentEndpoints=")
                .append(String.valueOf(this.serviceEnvironmentEndpoints));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceEnvironment)) {
            return false;
        }

        ServiceEnvironment other = (ServiceEnvironment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.serviceDefinition, other.serviceDefinition)
                && java.util.Objects.equals(this.consoleUrl, other.consoleUrl)
                && java.util.Objects.equals(
                        this.serviceEnvironmentEndpoints, other.serviceEnvironmentEndpoints)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceDefinition == null ? 43 : this.serviceDefinition.hashCode());
        result = (result * PRIME) + (this.consoleUrl == null ? 43 : this.consoleUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceEnvironmentEndpoints == null
                                ? 43
                                : this.serviceEnvironmentEndpoints.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
