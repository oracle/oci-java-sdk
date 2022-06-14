/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RestoreDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RestoreDatabaseDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseSCN", "timestamp", "latest"})
    public RestoreDatabaseDetails(String databaseSCN, java.util.Date timestamp, Boolean latest) {
        super();
        this.databaseSCN = databaseSCN;
        this.timestamp = timestamp;
        this.latest = latest;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Restores using the backup with the System Change Number (SCN) specified.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSCN")
        private String databaseSCN;

        /**
         * Restores using the backup with the System Change Number (SCN) specified.
         *
         * @param databaseSCN the value to set
         * @return this builder
         **/
        public Builder databaseSCN(String databaseSCN) {
            this.databaseSCN = databaseSCN;
            this.__explicitlySet__.add("databaseSCN");
            return this;
        }
        /**
         * Restores to the timestamp specified.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * Restores to the timestamp specified.
         *
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * Restores to the last known good state with the least possible data loss.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("latest")
        private Boolean latest;

        /**
         * Restores to the last known good state with the least possible data loss.
         *
         * @param latest the value to set
         * @return this builder
         **/
        public Builder latest(Boolean latest) {
            this.latest = latest;
            this.__explicitlySet__.add("latest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestoreDatabaseDetails build() {
            RestoreDatabaseDetails __instance__ =
                    new RestoreDatabaseDetails(databaseSCN, timestamp, latest);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestoreDatabaseDetails o) {
            Builder copiedBuilder =
                    databaseSCN(o.getDatabaseSCN())
                            .timestamp(o.getTimestamp())
                            .latest(o.getLatest());

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
     * Restores using the backup with the System Change Number (SCN) specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSCN")
    private final String databaseSCN;

    /**
     * Restores using the backup with the System Change Number (SCN) specified.
     *
     * @return the value
     **/
    public String getDatabaseSCN() {
        return databaseSCN;
    }

    /**
     * Restores to the timestamp specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * Restores to the timestamp specified.
     *
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * Restores to the last known good state with the least possible data loss.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latest")
    private final Boolean latest;

    /**
     * Restores to the last known good state with the least possible data loss.
     *
     * @return the value
     **/
    public Boolean getLatest() {
        return latest;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RestoreDatabaseDetails(");
        sb.append("databaseSCN=").append(String.valueOf(this.databaseSCN));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", latest=").append(String.valueOf(this.latest));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestoreDatabaseDetails)) {
            return false;
        }

        RestoreDatabaseDetails other = (RestoreDatabaseDetails) o;
        return java.util.Objects.equals(this.databaseSCN, other.databaseSCN)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.latest, other.latest)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.databaseSCN == null ? 43 : this.databaseSCN.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.latest == null ? 43 : this.latest.hashCode());
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
