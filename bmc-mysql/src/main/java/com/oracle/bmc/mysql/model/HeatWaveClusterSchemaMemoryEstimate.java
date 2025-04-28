/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Schema with estimated memory footprints for each MySQL user table of the schema when loaded to
 * HeatWave cluster memory. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HeatWaveClusterSchemaMemoryEstimate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HeatWaveClusterSchemaMemoryEstimate
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"schemaName", "perTableEstimates"})
    public HeatWaveClusterSchemaMemoryEstimate(
            String schemaName,
            java.util.List<HeatWaveClusterTableMemoryEstimate> perTableEstimates) {
        super();
        this.schemaName = schemaName;
        this.perTableEstimates = perTableEstimates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the schema. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The name of the schema.
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /**
         * Estimated memory footprints for MySQL user tables of the schema when loaded to HeatWave
         * cluster memory.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("perTableEstimates")
        private java.util.List<HeatWaveClusterTableMemoryEstimate> perTableEstimates;

        /**
         * Estimated memory footprints for MySQL user tables of the schema when loaded to HeatWave
         * cluster memory.
         *
         * @param perTableEstimates the value to set
         * @return this builder
         */
        public Builder perTableEstimates(
                java.util.List<HeatWaveClusterTableMemoryEstimate> perTableEstimates) {
            this.perTableEstimates = perTableEstimates;
            this.__explicitlySet__.add("perTableEstimates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HeatWaveClusterSchemaMemoryEstimate build() {
            HeatWaveClusterSchemaMemoryEstimate model =
                    new HeatWaveClusterSchemaMemoryEstimate(
                            this.schemaName, this.perTableEstimates);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HeatWaveClusterSchemaMemoryEstimate model) {
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("perTableEstimates")) {
                this.perTableEstimates(model.getPerTableEstimates());
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

    /** The name of the schema. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The name of the schema.
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Estimated memory footprints for MySQL user tables of the schema when loaded to HeatWave
     * cluster memory.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("perTableEstimates")
    private final java.util.List<HeatWaveClusterTableMemoryEstimate> perTableEstimates;

    /**
     * Estimated memory footprints for MySQL user tables of the schema when loaded to HeatWave
     * cluster memory.
     *
     * @return the value
     */
    public java.util.List<HeatWaveClusterTableMemoryEstimate> getPerTableEstimates() {
        return perTableEstimates;
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
        sb.append("HeatWaveClusterSchemaMemoryEstimate(");
        sb.append("super=").append(super.toString());
        sb.append("schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", perTableEstimates=").append(String.valueOf(this.perTableEstimates));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeatWaveClusterSchemaMemoryEstimate)) {
            return false;
        }

        HeatWaveClusterSchemaMemoryEstimate other = (HeatWaveClusterSchemaMemoryEstimate) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.perTableEstimates, other.perTableEstimates)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.perTableEstimates == null ? 43 : this.perTableEstimates.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
