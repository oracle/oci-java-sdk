/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of Pluggable Databases (PDBs) and their resource usage metrics, within a specific Container Database (CDB).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PdbMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PdbMetrics extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseUsageMetrics"})
    public PdbMetrics(java.util.List<DatabaseUsageMetrics> databaseUsageMetrics) {
        super();
        this.databaseUsageMetrics = databaseUsageMetrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A summary of PDBs and their resource usage metrics such as CPU, User I/O, and Storage, within a specific CDB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseUsageMetrics")
        private java.util.List<DatabaseUsageMetrics> databaseUsageMetrics;

        /**
         * A summary of PDBs and their resource usage metrics such as CPU, User I/O, and Storage, within a specific CDB.
         * @param databaseUsageMetrics the value to set
         * @return this builder
         **/
        public Builder databaseUsageMetrics(
                java.util.List<DatabaseUsageMetrics> databaseUsageMetrics) {
            this.databaseUsageMetrics = databaseUsageMetrics;
            this.__explicitlySet__.add("databaseUsageMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PdbMetrics build() {
            PdbMetrics model = new PdbMetrics(this.databaseUsageMetrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PdbMetrics model) {
            if (model.wasPropertyExplicitlySet("databaseUsageMetrics")) {
                this.databaseUsageMetrics(model.getDatabaseUsageMetrics());
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
     * A summary of PDBs and their resource usage metrics such as CPU, User I/O, and Storage, within a specific CDB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseUsageMetrics")
    private final java.util.List<DatabaseUsageMetrics> databaseUsageMetrics;

    /**
     * A summary of PDBs and their resource usage metrics such as CPU, User I/O, and Storage, within a specific CDB.
     * @return the value
     **/
    public java.util.List<DatabaseUsageMetrics> getDatabaseUsageMetrics() {
        return databaseUsageMetrics;
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
        sb.append("PdbMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("databaseUsageMetrics=").append(String.valueOf(this.databaseUsageMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PdbMetrics)) {
            return false;
        }

        PdbMetrics other = (PdbMetrics) o;
        return java.util.Objects.equals(this.databaseUsageMetrics, other.databaseUsageMetrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseUsageMetrics == null
                                ? 43
                                : this.databaseUsageMetrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
