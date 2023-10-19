/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Logging destination object. <br>
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
        builder = UnifiedAgentLoggingDestination.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentLoggingDestination
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"logObjectId", "operationalMetricsConfiguration"})
    public UnifiedAgentLoggingDestination(
            String logObjectId, OperationalMetricsConfiguration operationalMetricsConfiguration) {
        super();
        this.logObjectId = logObjectId;
        this.operationalMetricsConfiguration = operationalMetricsConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("logObjectId")
        private String logObjectId;

        /**
         * The OCID of the resource.
         *
         * @param logObjectId the value to set
         * @return this builder
         */
        public Builder logObjectId(String logObjectId) {
            this.logObjectId = logObjectId;
            this.__explicitlySet__.add("logObjectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationalMetricsConfiguration")
        private OperationalMetricsConfiguration operationalMetricsConfiguration;

        public Builder operationalMetricsConfiguration(
                OperationalMetricsConfiguration operationalMetricsConfiguration) {
            this.operationalMetricsConfiguration = operationalMetricsConfiguration;
            this.__explicitlySet__.add("operationalMetricsConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentLoggingDestination build() {
            UnifiedAgentLoggingDestination model =
                    new UnifiedAgentLoggingDestination(
                            this.logObjectId, this.operationalMetricsConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentLoggingDestination model) {
            if (model.wasPropertyExplicitlySet("logObjectId")) {
                this.logObjectId(model.getLogObjectId());
            }
            if (model.wasPropertyExplicitlySet("operationalMetricsConfiguration")) {
                this.operationalMetricsConfiguration(model.getOperationalMetricsConfiguration());
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

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("logObjectId")
    private final String logObjectId;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getLogObjectId() {
        return logObjectId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operationalMetricsConfiguration")
    private final OperationalMetricsConfiguration operationalMetricsConfiguration;

    public OperationalMetricsConfiguration getOperationalMetricsConfiguration() {
        return operationalMetricsConfiguration;
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
        sb.append("UnifiedAgentLoggingDestination(");
        sb.append("super=").append(super.toString());
        sb.append("logObjectId=").append(String.valueOf(this.logObjectId));
        sb.append(", operationalMetricsConfiguration=")
                .append(String.valueOf(this.operationalMetricsConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentLoggingDestination)) {
            return false;
        }

        UnifiedAgentLoggingDestination other = (UnifiedAgentLoggingDestination) o;
        return java.util.Objects.equals(this.logObjectId, other.logObjectId)
                && java.util.Objects.equals(
                        this.operationalMetricsConfiguration, other.operationalMetricsConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logObjectId == null ? 43 : this.logObjectId.hashCode());
        result =
                (result * PRIME)
                        + (this.operationalMetricsConfiguration == null
                                ? 43
                                : this.operationalMetricsConfiguration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
