/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemanagerproxy.model;

/**
 * Detailed information about a service environment.
 *
 * <p>*Note:** Service URL formats may vary from the provided example. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210914")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ServiceEnvironment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ServiceEnvironment
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /**
         * Unqiue identifier for the entitlement related to the environment.
         *
         * <p>*Note:** Not an
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unqiue identifier for the entitlement related to the environment.
         *
         * <p>*Note:** Not an
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The unique subscription ID associated with the service environment ID.
         *
         * <p>*Note:** Not an
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The unique subscription ID associated with the service environment ID.
         *
         * <p>*Note:** Not an
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** Status of the entitlement registration for the service. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ServiceEntitlementRegistrationStatus status;

        /**
         * Status of the entitlement registration for the service.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(ServiceEntitlementRegistrationStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for
         * the compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for
         * the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
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
        /** The URL for the console. */
        @com.fasterxml.jackson.annotation.JsonProperty("consoleUrl")
        private String consoleUrl;

        /**
         * The URL for the console.
         *
         * @param consoleUrl the value to set
         * @return this builder
         */
        public Builder consoleUrl(String consoleUrl) {
            this.consoleUrl = consoleUrl;
            this.__explicitlySet__.add("consoleUrl");
            return this;
        }
        /** Array of service environment end points. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceEnvironmentEndpoints")
        private java.util.List<ServiceEnvironmentEndPointOverview> serviceEnvironmentEndpoints;

        /**
         * Array of service environment end points.
         *
         * @param serviceEnvironmentEndpoints the value to set
         * @return this builder
         */
        public Builder serviceEnvironmentEndpoints(
                java.util.List<ServiceEnvironmentEndPointOverview> serviceEnvironmentEndpoints) {
            this.serviceEnvironmentEndpoints = serviceEnvironmentEndpoints;
            this.__explicitlySet__.add("serviceEnvironmentEndpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceEnvironment build() {
            ServiceEnvironment model =
                    new ServiceEnvironment(
                            this.id,
                            this.subscriptionId,
                            this.status,
                            this.compartmentId,
                            this.serviceDefinition,
                            this.consoleUrl,
                            this.serviceEnvironmentEndpoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceEnvironment model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("serviceDefinition")) {
                this.serviceDefinition(model.getServiceDefinition());
            }
            if (model.wasPropertyExplicitlySet("consoleUrl")) {
                this.consoleUrl(model.getConsoleUrl());
            }
            if (model.wasPropertyExplicitlySet("serviceEnvironmentEndpoints")) {
                this.serviceEnvironmentEndpoints(model.getServiceEnvironmentEndpoints());
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

    /**
     * Unqiue identifier for the entitlement related to the environment.
     *
     * <p>*Note:** Not an
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unqiue identifier for the entitlement related to the environment.
     *
     * <p>*Note:** Not an
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The unique subscription ID associated with the service environment ID.
     *
     * <p>*Note:** Not an
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The unique subscription ID associated with the service environment ID.
     *
     * <p>*Note:** Not an
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** Status of the entitlement registration for the service. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ServiceEntitlementRegistrationStatus status;

    /**
     * Status of the entitlement registration for the service.
     *
     * @return the value
     */
    public ServiceEntitlementRegistrationStatus getStatus() {
        return status;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceDefinition")
    private final ServiceDefinition serviceDefinition;

    public ServiceDefinition getServiceDefinition() {
        return serviceDefinition;
    }

    /** The URL for the console. */
    @com.fasterxml.jackson.annotation.JsonProperty("consoleUrl")
    private final String consoleUrl;

    /**
     * The URL for the console.
     *
     * @return the value
     */
    public String getConsoleUrl() {
        return consoleUrl;
    }

    /** Array of service environment end points. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceEnvironmentEndpoints")
    private final java.util.List<ServiceEnvironmentEndPointOverview> serviceEnvironmentEndpoints;

    /**
     * Array of service environment end points.
     *
     * @return the value
     */
    public java.util.List<ServiceEnvironmentEndPointOverview> getServiceEnvironmentEndpoints() {
        return serviceEnvironmentEndpoints;
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
        sb.append("ServiceEnvironment(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", serviceDefinition=").append(String.valueOf(this.serviceDefinition));
        sb.append(", consoleUrl=").append(String.valueOf(this.consoleUrl));
        sb.append(", serviceEnvironmentEndpoints=")
                .append(String.valueOf(this.serviceEnvironmentEndpoints));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
