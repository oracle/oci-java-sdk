/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The response containing the metric collection for a specific Managed Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseHomeMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseHomeMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseHomeMetrics", "databaseInstanceHomeMetrics"})
    public DatabaseHomeMetrics(
            DatabaseHomeMetricDefinition databaseHomeMetrics,
            java.util.List<DatabaseInstanceHomeMetricsDefinition> databaseInstanceHomeMetrics) {
        super();
        this.databaseHomeMetrics = databaseHomeMetrics;
        this.databaseInstanceHomeMetrics = databaseInstanceHomeMetrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("databaseHomeMetrics")
        private DatabaseHomeMetricDefinition databaseHomeMetrics;

        public Builder databaseHomeMetrics(DatabaseHomeMetricDefinition databaseHomeMetrics) {
            this.databaseHomeMetrics = databaseHomeMetrics;
            this.__explicitlySet__.add("databaseHomeMetrics");
            return this;
        }
        /** The metrics for the RAC database instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseInstanceHomeMetrics")
        private java.util.List<DatabaseInstanceHomeMetricsDefinition> databaseInstanceHomeMetrics;

        /**
         * The metrics for the RAC database instances.
         *
         * @param databaseInstanceHomeMetrics the value to set
         * @return this builder
         */
        public Builder databaseInstanceHomeMetrics(
                java.util.List<DatabaseInstanceHomeMetricsDefinition> databaseInstanceHomeMetrics) {
            this.databaseInstanceHomeMetrics = databaseInstanceHomeMetrics;
            this.__explicitlySet__.add("databaseInstanceHomeMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseHomeMetrics build() {
            DatabaseHomeMetrics model =
                    new DatabaseHomeMetrics(
                            this.databaseHomeMetrics, this.databaseInstanceHomeMetrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseHomeMetrics model) {
            if (model.wasPropertyExplicitlySet("databaseHomeMetrics")) {
                this.databaseHomeMetrics(model.getDatabaseHomeMetrics());
            }
            if (model.wasPropertyExplicitlySet("databaseInstanceHomeMetrics")) {
                this.databaseInstanceHomeMetrics(model.getDatabaseInstanceHomeMetrics());
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

    @com.fasterxml.jackson.annotation.JsonProperty("databaseHomeMetrics")
    private final DatabaseHomeMetricDefinition databaseHomeMetrics;

    public DatabaseHomeMetricDefinition getDatabaseHomeMetrics() {
        return databaseHomeMetrics;
    }

    /** The metrics for the RAC database instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseInstanceHomeMetrics")
    private final java.util.List<DatabaseInstanceHomeMetricsDefinition> databaseInstanceHomeMetrics;

    /**
     * The metrics for the RAC database instances.
     *
     * @return the value
     */
    public java.util.List<DatabaseInstanceHomeMetricsDefinition> getDatabaseInstanceHomeMetrics() {
        return databaseInstanceHomeMetrics;
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
        sb.append("DatabaseHomeMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("databaseHomeMetrics=").append(String.valueOf(this.databaseHomeMetrics));
        sb.append(", databaseInstanceHomeMetrics=")
                .append(String.valueOf(this.databaseInstanceHomeMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseHomeMetrics)) {
            return false;
        }

        DatabaseHomeMetrics other = (DatabaseHomeMetrics) o;
        return java.util.Objects.equals(this.databaseHomeMetrics, other.databaseHomeMetrics)
                && java.util.Objects.equals(
                        this.databaseInstanceHomeMetrics, other.databaseInstanceHomeMetrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseHomeMetrics == null
                                ? 43
                                : this.databaseHomeMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseInstanceHomeMetrics == null
                                ? 43
                                : this.databaseInstanceHomeMetrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
