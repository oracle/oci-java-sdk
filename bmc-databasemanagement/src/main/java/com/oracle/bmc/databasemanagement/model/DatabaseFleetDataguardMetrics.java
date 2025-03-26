/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The list of Oracle Data Guard-enabled databases in the fleet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseFleetDataguardMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseFleetDataguardMetrics
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dataguardMetrics"})
    public DatabaseFleetDataguardMetrics(java.util.List<DataguardMetrics> dataguardMetrics) {
        super();
        this.dataguardMetrics = dataguardMetrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Data Guard usage metrics for the Oracle Data Guard-enabled databases.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataguardMetrics")
        private java.util.List<DataguardMetrics> dataguardMetrics;

        /**
         * The Data Guard usage metrics for the Oracle Data Guard-enabled databases.
         * @param dataguardMetrics the value to set
         * @return this builder
         **/
        public Builder dataguardMetrics(java.util.List<DataguardMetrics> dataguardMetrics) {
            this.dataguardMetrics = dataguardMetrics;
            this.__explicitlySet__.add("dataguardMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseFleetDataguardMetrics build() {
            DatabaseFleetDataguardMetrics model =
                    new DatabaseFleetDataguardMetrics(this.dataguardMetrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseFleetDataguardMetrics model) {
            if (model.wasPropertyExplicitlySet("dataguardMetrics")) {
                this.dataguardMetrics(model.getDataguardMetrics());
            }
            return this;
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
     * The Data Guard usage metrics for the Oracle Data Guard-enabled databases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataguardMetrics")
    private final java.util.List<DataguardMetrics> dataguardMetrics;

    /**
     * The Data Guard usage metrics for the Oracle Data Guard-enabled databases.
     * @return the value
     **/
    public java.util.List<DataguardMetrics> getDataguardMetrics() {
        return dataguardMetrics;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatabaseFleetDataguardMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("dataguardMetrics=").append(String.valueOf(this.dataguardMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseFleetDataguardMetrics)) {
            return false;
        }

        DatabaseFleetDataguardMetrics other = (DatabaseFleetDataguardMetrics) o;
        return java.util.Objects.equals(this.dataguardMetrics, other.dataguardMetrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dataguardMetrics == null ? 43 : this.dataguardMetrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
