/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the backup metrics for the fleet of databases. <br>
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
        builder = DatabaseFleetBackupMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseFleetBackupMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"backupMetrics"})
    public DatabaseFleetBackupMetrics(java.util.List<DatabaseBackupMetrics> backupMetrics) {
        super();
        this.backupMetrics = backupMetrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A list of backup metrics for the databases present in the fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupMetrics")
        private java.util.List<DatabaseBackupMetrics> backupMetrics;

        /**
         * A list of backup metrics for the databases present in the fleet.
         *
         * @param backupMetrics the value to set
         * @return this builder
         */
        public Builder backupMetrics(java.util.List<DatabaseBackupMetrics> backupMetrics) {
            this.backupMetrics = backupMetrics;
            this.__explicitlySet__.add("backupMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseFleetBackupMetrics build() {
            DatabaseFleetBackupMetrics model = new DatabaseFleetBackupMetrics(this.backupMetrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseFleetBackupMetrics model) {
            if (model.wasPropertyExplicitlySet("backupMetrics")) {
                this.backupMetrics(model.getBackupMetrics());
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

    /** A list of backup metrics for the databases present in the fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupMetrics")
    private final java.util.List<DatabaseBackupMetrics> backupMetrics;

    /**
     * A list of backup metrics for the databases present in the fleet.
     *
     * @return the value
     */
    public java.util.List<DatabaseBackupMetrics> getBackupMetrics() {
        return backupMetrics;
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
        sb.append("DatabaseFleetBackupMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("backupMetrics=").append(String.valueOf(this.backupMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseFleetBackupMetrics)) {
            return false;
        }

        DatabaseFleetBackupMetrics other = (DatabaseFleetBackupMetrics) o;
        return java.util.Objects.equals(this.backupMetrics, other.backupMetrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.backupMetrics == null ? 43 : this.backupMetrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
