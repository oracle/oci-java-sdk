/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Unified Agent Openmetrics tail configuration object. <br>
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
        builder = UnifiedAgentOpenmetricsTailConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentOpenmetricsTailConfigurationDetails
        extends UnifiedAgentMonitoringApplicationConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Tail log source objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<UnifiedAgentTailLogSource> sources;

        /**
         * Tail log source objects.
         *
         * @param sources the value to set
         * @return this builder
         */
        public Builder sources(java.util.List<UnifiedAgentTailLogSource> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private UnifiedAgentMonitoringDestination destination;

        public Builder destination(UnifiedAgentMonitoringDestination destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentOpenmetricsTailConfigurationDetails build() {
            UnifiedAgentOpenmetricsTailConfigurationDetails model =
                    new UnifiedAgentOpenmetricsTailConfigurationDetails(
                            this.sources, this.destination);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentOpenmetricsTailConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("sources")) {
                this.sources(model.getSources());
            }
            if (model.wasPropertyExplicitlySet("destination")) {
                this.destination(model.getDestination());
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

    @Deprecated
    public UnifiedAgentOpenmetricsTailConfigurationDetails(
            java.util.List<UnifiedAgentTailLogSource> sources,
            UnifiedAgentMonitoringDestination destination) {
        super();
        this.sources = sources;
        this.destination = destination;
    }

    /** Tail log source objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<UnifiedAgentTailLogSource> sources;

    /**
     * Tail log source objects.
     *
     * @return the value
     */
    public java.util.List<UnifiedAgentTailLogSource> getSources() {
        return sources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final UnifiedAgentMonitoringDestination destination;

    public UnifiedAgentMonitoringDestination getDestination() {
        return destination;
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
        sb.append("UnifiedAgentOpenmetricsTailConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(", destination=").append(String.valueOf(this.destination));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentOpenmetricsTailConfigurationDetails)) {
            return false;
        }

        UnifiedAgentOpenmetricsTailConfigurationDetails other =
                (UnifiedAgentOpenmetricsTailConfigurationDetails) o;
        return java.util.Objects.equals(this.sources, other.sources)
                && java.util.Objects.equals(this.destination, other.destination)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        return result;
    }
}
