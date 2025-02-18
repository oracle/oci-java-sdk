/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * High level view of plugin error aggregations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PluginErrorAggregationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PluginErrorAggregationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"healthyPluginCount", "pluginErrorAggregations"})
    public PluginErrorAggregationSummary(
            Integer healthyPluginCount,
            java.util.List<PluginErrorAggregation> pluginErrorAggregations) {
        super();
        this.healthyPluginCount = healthyPluginCount;
        this.pluginErrorAggregations = pluginErrorAggregations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Count of plugins with no problems. */
        @com.fasterxml.jackson.annotation.JsonProperty("healthyPluginCount")
        private Integer healthyPluginCount;

        /**
         * Count of plugins with no problems.
         *
         * @param healthyPluginCount the value to set
         * @return this builder
         */
        public Builder healthyPluginCount(Integer healthyPluginCount) {
            this.healthyPluginCount = healthyPluginCount;
            this.__explicitlySet__.add("healthyPluginCount");
            return this;
        }
        /** List of plugin aggregation errors. */
        @com.fasterxml.jackson.annotation.JsonProperty("pluginErrorAggregations")
        private java.util.List<PluginErrorAggregation> pluginErrorAggregations;

        /**
         * List of plugin aggregation errors.
         *
         * @param pluginErrorAggregations the value to set
         * @return this builder
         */
        public Builder pluginErrorAggregations(
                java.util.List<PluginErrorAggregation> pluginErrorAggregations) {
            this.pluginErrorAggregations = pluginErrorAggregations;
            this.__explicitlySet__.add("pluginErrorAggregations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PluginErrorAggregationSummary build() {
            PluginErrorAggregationSummary model =
                    new PluginErrorAggregationSummary(
                            this.healthyPluginCount, this.pluginErrorAggregations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PluginErrorAggregationSummary model) {
            if (model.wasPropertyExplicitlySet("healthyPluginCount")) {
                this.healthyPluginCount(model.getHealthyPluginCount());
            }
            if (model.wasPropertyExplicitlySet("pluginErrorAggregations")) {
                this.pluginErrorAggregations(model.getPluginErrorAggregations());
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

    /** Count of plugins with no problems. */
    @com.fasterxml.jackson.annotation.JsonProperty("healthyPluginCount")
    private final Integer healthyPluginCount;

    /**
     * Count of plugins with no problems.
     *
     * @return the value
     */
    public Integer getHealthyPluginCount() {
        return healthyPluginCount;
    }

    /** List of plugin aggregation errors. */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginErrorAggregations")
    private final java.util.List<PluginErrorAggregation> pluginErrorAggregations;

    /**
     * List of plugin aggregation errors.
     *
     * @return the value
     */
    public java.util.List<PluginErrorAggregation> getPluginErrorAggregations() {
        return pluginErrorAggregations;
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
        sb.append("PluginErrorAggregationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("healthyPluginCount=").append(String.valueOf(this.healthyPluginCount));
        sb.append(", pluginErrorAggregations=")
                .append(String.valueOf(this.pluginErrorAggregations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluginErrorAggregationSummary)) {
            return false;
        }

        PluginErrorAggregationSummary other = (PluginErrorAggregationSummary) o;
        return java.util.Objects.equals(this.healthyPluginCount, other.healthyPluginCount)
                && java.util.Objects.equals(
                        this.pluginErrorAggregations, other.pluginErrorAggregations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.healthyPluginCount == null
                                ? 43
                                : this.healthyPluginCount.hashCode());
        result =
                (result * PRIME)
                        + (this.pluginErrorAggregations == null
                                ? 43
                                : this.pluginErrorAggregations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
