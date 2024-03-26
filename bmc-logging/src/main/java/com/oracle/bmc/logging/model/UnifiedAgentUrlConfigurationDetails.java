/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Unified Agent scrape URL configuration object. <br>
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
        builder = UnifiedAgentUrlConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentUrlConfigurationDetails
        extends UnifiedAgentMonitoringApplicationConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private UnifiedAgentMonitoringUrlSource source;

        public Builder source(UnifiedAgentMonitoringUrlSource source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private UnifiedAgentUrlFilter filter;

        public Builder filter(UnifiedAgentUrlFilter filter) {
            this.filter = filter;
            this.__explicitlySet__.add("filter");
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

        public UnifiedAgentUrlConfigurationDetails build() {
            UnifiedAgentUrlConfigurationDetails model =
                    new UnifiedAgentUrlConfigurationDetails(
                            this.source, this.filter, this.destination);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentUrlConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("filter")) {
                this.filter(model.getFilter());
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
    public UnifiedAgentUrlConfigurationDetails(
            UnifiedAgentMonitoringUrlSource source,
            UnifiedAgentUrlFilter filter,
            UnifiedAgentMonitoringDestination destination) {
        super();
        this.source = source;
        this.filter = filter;
        this.destination = destination;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final UnifiedAgentMonitoringUrlSource source;

    public UnifiedAgentMonitoringUrlSource getSource() {
        return source;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final UnifiedAgentUrlFilter filter;

    public UnifiedAgentUrlFilter getFilter() {
        return filter;
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
        sb.append("UnifiedAgentUrlConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(", destination=").append(String.valueOf(this.destination));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentUrlConfigurationDetails)) {
            return false;
        }

        UnifiedAgentUrlConfigurationDetails other = (UnifiedAgentUrlConfigurationDetails) o;
        return java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.destination, other.destination)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        return result;
    }
}
