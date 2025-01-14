/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * Summary information for a connector plugin that fetches data from a source service. For
 * configuration instructions, see [Creating a
 * Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/create-service-connector.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SourceConnectorPluginSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SourceConnectorPluginSummary extends ConnectorPluginSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedThroughput")
        private EstimatedThroughput estimatedThroughput;

        public Builder estimatedThroughput(EstimatedThroughput estimatedThroughput) {
            this.estimatedThroughput = estimatedThroughput;
            this.__explicitlySet__.add("estimatedThroughput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ConnectorPluginLifecycleState lifecycleState;

        public Builder lifecycleState(ConnectorPluginLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The estimated maximum period of time the data will be kept at the source. description: |
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxRetention")
        private String maxRetention;

        /**
         * The estimated maximum period of time the data will be kept at the source. description: |
         *
         * @param maxRetention the value to set
         * @return this builder
         */
        public Builder maxRetention(String maxRetention) {
            this.maxRetention = maxRetention;
            this.__explicitlySet__.add("maxRetention");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SourceConnectorPluginSummary build() {
            SourceConnectorPluginSummary model =
                    new SourceConnectorPluginSummary(
                            this.name,
                            this.timeCreated,
                            this.estimatedThroughput,
                            this.lifecycleState,
                            this.displayName,
                            this.maxRetention);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SourceConnectorPluginSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("estimatedThroughput")) {
                this.estimatedThroughput(model.getEstimatedThroughput());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("maxRetention")) {
                this.maxRetention(model.getMaxRetention());
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
    public SourceConnectorPluginSummary(
            String name,
            java.util.Date timeCreated,
            EstimatedThroughput estimatedThroughput,
            ConnectorPluginLifecycleState lifecycleState,
            String displayName,
            String maxRetention) {
        super(name, timeCreated, estimatedThroughput, lifecycleState, displayName);
        this.maxRetention = maxRetention;
    }

    /** The estimated maximum period of time the data will be kept at the source. description: | */
    @com.fasterxml.jackson.annotation.JsonProperty("maxRetention")
    private final String maxRetention;

    /**
     * The estimated maximum period of time the data will be kept at the source. description: |
     *
     * @return the value
     */
    public String getMaxRetention() {
        return maxRetention;
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
        sb.append("SourceConnectorPluginSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", maxRetention=").append(String.valueOf(this.maxRetention));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SourceConnectorPluginSummary)) {
            return false;
        }

        SourceConnectorPluginSummary other = (SourceConnectorPluginSummary) o;
        return java.util.Objects.equals(this.maxRetention, other.maxRetention)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.maxRetention == null ? 43 : this.maxRetention.hashCode());
        return result;
    }
}
