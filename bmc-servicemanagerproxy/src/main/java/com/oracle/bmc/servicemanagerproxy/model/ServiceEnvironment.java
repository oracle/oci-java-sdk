/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceEnvironment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ServiceEnvironment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Unqiue identifier for the entitlement related to the environment.
     * <p>
     **Note:** Not an [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The unique subscription ID associated with the service environment ID.
     * <p>
     **Note:** Not an [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    String subscriptionId;

    /**
     * Status of the entitlement registration for the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    ServiceEntitlementRegistrationStatus status;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    @com.fasterxml.jackson.annotation.JsonProperty("serviceDefinition")
    ServiceDefinition serviceDefinition;

    /**
     * The URL for the console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consoleUrl")
    String consoleUrl;

    /**
     * Array of service environment end points.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceEnvironmentEndpoints")
    java.util.List<ServiceEnvironmentEndPointOverview> serviceEnvironmentEndpoints;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
