/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Unified Agent logging service configuration object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UnifiedAgentLoggingConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configurationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UnifiedAgentLoggingConfiguration
        extends UnifiedAgentServiceConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<UnifiedAgentLoggingSource> sources;

        public Builder sources(java.util.List<UnifiedAgentLoggingSource> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private UnifiedAgentLoggingDestination destination;

        public Builder destination(UnifiedAgentLoggingDestination destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentLoggingConfiguration build() {
            UnifiedAgentLoggingConfiguration __instance__ =
                    new UnifiedAgentLoggingConfiguration(sources, destination);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentLoggingConfiguration o) {
            Builder copiedBuilder = sources(o.getSources()).destination(o.getDestination());

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

    @Deprecated
    public UnifiedAgentLoggingConfiguration(
            java.util.List<UnifiedAgentLoggingSource> sources,
            UnifiedAgentLoggingDestination destination) {
        super();
        this.sources = sources;
        this.destination = destination;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<UnifiedAgentLoggingSource> sources;

    public java.util.List<UnifiedAgentLoggingSource> getSources() {
        return sources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final UnifiedAgentLoggingDestination destination;

    public UnifiedAgentLoggingDestination getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UnifiedAgentLoggingConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(", destination=").append(String.valueOf(this.destination));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentLoggingConfiguration)) {
            return false;
        }

        UnifiedAgentLoggingConfiguration other = (UnifiedAgentLoggingConfiguration) o;
        return java.util.Objects.equals(this.sources, other.sources)
                && java.util.Objects.equals(this.destination, other.destination)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
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
