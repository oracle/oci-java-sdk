/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Kubernetes destination object. <br>
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
        builder = UnifiedAgentMonitoringDestination.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentMonitoringDestination
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "metricsNamespace"})
    public UnifiedAgentMonitoringDestination(String compartmentId, String metricsNamespace) {
        super();
        this.compartmentId = compartmentId;
        this.metricsNamespace = metricsNamespace;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that the resource belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Namespace to which metrics will be emitted. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricsNamespace")
        private String metricsNamespace;

        /**
         * Namespace to which metrics will be emitted.
         *
         * @param metricsNamespace the value to set
         * @return this builder
         */
        public Builder metricsNamespace(String metricsNamespace) {
            this.metricsNamespace = metricsNamespace;
            this.__explicitlySet__.add("metricsNamespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentMonitoringDestination build() {
            UnifiedAgentMonitoringDestination model =
                    new UnifiedAgentMonitoringDestination(
                            this.compartmentId, this.metricsNamespace);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentMonitoringDestination model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("metricsNamespace")) {
                this.metricsNamespace(model.getMetricsNamespace());
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

    /** The OCID of the compartment that the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that the resource belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Namespace to which metrics will be emitted. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricsNamespace")
    private final String metricsNamespace;

    /**
     * Namespace to which metrics will be emitted.
     *
     * @return the value
     */
    public String getMetricsNamespace() {
        return metricsNamespace;
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
        sb.append("UnifiedAgentMonitoringDestination(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", metricsNamespace=").append(String.valueOf(this.metricsNamespace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentMonitoringDestination)) {
            return false;
        }

        UnifiedAgentMonitoringDestination other = (UnifiedAgentMonitoringDestination) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.metricsNamespace, other.metricsNamespace)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.metricsNamespace == null ? 43 : this.metricsNamespace.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
