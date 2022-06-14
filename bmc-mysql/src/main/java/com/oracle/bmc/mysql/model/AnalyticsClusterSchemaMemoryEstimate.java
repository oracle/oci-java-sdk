/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * DEPRECATED -- please use HeatWave API instead.
 * Schema with estimated memory footprints for each MySQL user table
 * of the schema when loaded to Analytics Cluster memory.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyticsClusterSchemaMemoryEstimate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AnalyticsClusterSchemaMemoryEstimate {
    @Deprecated
    @java.beans.ConstructorProperties({"schemaName", "perTableEstimates"})
    public AnalyticsClusterSchemaMemoryEstimate(
            String schemaName,
            java.util.List<AnalyticsClusterTableMemoryEstimate> perTableEstimates) {
        super();
        this.schemaName = schemaName;
        this.perTableEstimates = perTableEstimates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the schema.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The name of the schema.
         * @param schemaName the value to set
         * @return this builder
         **/
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /**
         * Estimated memory footprints for MySQL user tables of the schema
         * when loaded to Analytics Cluster memory.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("perTableEstimates")
        private java.util.List<AnalyticsClusterTableMemoryEstimate> perTableEstimates;

        /**
         * Estimated memory footprints for MySQL user tables of the schema
         * when loaded to Analytics Cluster memory.
         *
         * @param perTableEstimates the value to set
         * @return this builder
         **/
        public Builder perTableEstimates(
                java.util.List<AnalyticsClusterTableMemoryEstimate> perTableEstimates) {
            this.perTableEstimates = perTableEstimates;
            this.__explicitlySet__.add("perTableEstimates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyticsClusterSchemaMemoryEstimate build() {
            AnalyticsClusterSchemaMemoryEstimate __instance__ =
                    new AnalyticsClusterSchemaMemoryEstimate(schemaName, perTableEstimates);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyticsClusterSchemaMemoryEstimate o) {
            Builder copiedBuilder =
                    schemaName(o.getSchemaName()).perTableEstimates(o.getPerTableEstimates());

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
     * The name of the schema.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The name of the schema.
     * @return the value
     **/
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Estimated memory footprints for MySQL user tables of the schema
     * when loaded to Analytics Cluster memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("perTableEstimates")
    private final java.util.List<AnalyticsClusterTableMemoryEstimate> perTableEstimates;

    /**
     * Estimated memory footprints for MySQL user tables of the schema
     * when loaded to Analytics Cluster memory.
     *
     * @return the value
     **/
    public java.util.List<AnalyticsClusterTableMemoryEstimate> getPerTableEstimates() {
        return perTableEstimates;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyticsClusterSchemaMemoryEstimate(");
        sb.append("schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", perTableEstimates=").append(String.valueOf(this.perTableEstimates));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyticsClusterSchemaMemoryEstimate)) {
            return false;
        }

        AnalyticsClusterSchemaMemoryEstimate other = (AnalyticsClusterSchemaMemoryEstimate) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.perTableEstimates, other.perTableEstimates)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.perTableEstimates == null ? 43 : this.perTableEstimates.hashCode());
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
