/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to restore an Oracle Autonomous Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RestoreAutonomousDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class RestoreAutonomousDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timestamp", "databaseSCN", "latest"})
    public RestoreAutonomousDatabaseDetails(
            java.util.Date timestamp, String databaseSCN, Boolean latest) {
        super();
        this.timestamp = timestamp;
        this.databaseSCN = databaseSCN;
        this.latest = latest;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The time to restore the database to. */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The time to restore the database to.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /** Restores using the backup with the System Change Number (SCN) specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSCN")
        private String databaseSCN;

        /**
         * Restores using the backup with the System Change Number (SCN) specified.
         *
         * @param databaseSCN the value to set
         * @return this builder
         */
        public Builder databaseSCN(String databaseSCN) {
            this.databaseSCN = databaseSCN;
            this.__explicitlySet__.add("databaseSCN");
            return this;
        }
        /** Restores to the last known good state with the least possible data loss. */
        @com.fasterxml.jackson.annotation.JsonProperty("latest")
        private Boolean latest;

        /**
         * Restores to the last known good state with the least possible data loss.
         *
         * @param latest the value to set
         * @return this builder
         */
        public Builder latest(Boolean latest) {
            this.latest = latest;
            this.__explicitlySet__.add("latest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestoreAutonomousDatabaseDetails build() {
            RestoreAutonomousDatabaseDetails model =
                    new RestoreAutonomousDatabaseDetails(
                            this.timestamp, this.databaseSCN, this.latest);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestoreAutonomousDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("databaseSCN")) {
                this.databaseSCN(model.getDatabaseSCN());
            }
            if (model.wasPropertyExplicitlySet("latest")) {
                this.latest(model.getLatest());
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

    /** The time to restore the database to. */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The time to restore the database to.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** Restores using the backup with the System Change Number (SCN) specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSCN")
    private final String databaseSCN;

    /**
     * Restores using the backup with the System Change Number (SCN) specified.
     *
     * @return the value
     */
    public String getDatabaseSCN() {
        return databaseSCN;
    }

    /** Restores to the last known good state with the least possible data loss. */
    @com.fasterxml.jackson.annotation.JsonProperty("latest")
    private final Boolean latest;

    /**
     * Restores to the last known good state with the least possible data loss.
     *
     * @return the value
     */
    public Boolean getLatest() {
        return latest;
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
        sb.append("RestoreAutonomousDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", databaseSCN=").append(String.valueOf(this.databaseSCN));
        sb.append(", latest=").append(String.valueOf(this.latest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestoreAutonomousDatabaseDetails)) {
            return false;
        }

        RestoreAutonomousDatabaseDetails other = (RestoreAutonomousDatabaseDetails) o;
        return java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.databaseSCN, other.databaseSCN)
                && java.util.Objects.equals(this.latest, other.latest)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.databaseSCN == null ? 43 : this.databaseSCN.hashCode());
        result = (result * PRIME) + (this.latest == null ? 43 : this.latest.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
