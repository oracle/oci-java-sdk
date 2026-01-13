/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * A policy of a DB system to schedule cross-region DB system backup copy. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CopyPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CopyPolicy extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"copyToRegion", "backupCopyRetentionInDays"})
    public CopyPolicy(String copyToRegion, Integer backupCopyRetentionInDays) {
        super();
        this.copyToRegion = copyToRegion;
        this.backupCopyRetentionInDays = backupCopyRetentionInDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The destination region name to which the DB system backup will be copied. */
        @com.fasterxml.jackson.annotation.JsonProperty("copyToRegion")
        private String copyToRegion;

        /**
         * The destination region name to which the DB system backup will be copied.
         *
         * @param copyToRegion the value to set
         * @return this builder
         */
        public Builder copyToRegion(String copyToRegion) {
            this.copyToRegion = copyToRegion;
            this.__explicitlySet__.add("copyToRegion");
            return this;
        }
        /** Number of days to retain the copied DB system backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupCopyRetentionInDays")
        private Integer backupCopyRetentionInDays;

        /**
         * Number of days to retain the copied DB system backup.
         *
         * @param backupCopyRetentionInDays the value to set
         * @return this builder
         */
        public Builder backupCopyRetentionInDays(Integer backupCopyRetentionInDays) {
            this.backupCopyRetentionInDays = backupCopyRetentionInDays;
            this.__explicitlySet__.add("backupCopyRetentionInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CopyPolicy build() {
            CopyPolicy model = new CopyPolicy(this.copyToRegion, this.backupCopyRetentionInDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CopyPolicy model) {
            if (model.wasPropertyExplicitlySet("copyToRegion")) {
                this.copyToRegion(model.getCopyToRegion());
            }
            if (model.wasPropertyExplicitlySet("backupCopyRetentionInDays")) {
                this.backupCopyRetentionInDays(model.getBackupCopyRetentionInDays());
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

    /** The destination region name to which the DB system backup will be copied. */
    @com.fasterxml.jackson.annotation.JsonProperty("copyToRegion")
    private final String copyToRegion;

    /**
     * The destination region name to which the DB system backup will be copied.
     *
     * @return the value
     */
    public String getCopyToRegion() {
        return copyToRegion;
    }

    /** Number of days to retain the copied DB system backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupCopyRetentionInDays")
    private final Integer backupCopyRetentionInDays;

    /**
     * Number of days to retain the copied DB system backup.
     *
     * @return the value
     */
    public Integer getBackupCopyRetentionInDays() {
        return backupCopyRetentionInDays;
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
        sb.append("CopyPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("copyToRegion=").append(String.valueOf(this.copyToRegion));
        sb.append(", backupCopyRetentionInDays=")
                .append(String.valueOf(this.backupCopyRetentionInDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyPolicy)) {
            return false;
        }

        CopyPolicy other = (CopyPolicy) o;
        return java.util.Objects.equals(this.copyToRegion, other.copyToRegion)
                && java.util.Objects.equals(
                        this.backupCopyRetentionInDays, other.backupCopyRetentionInDays)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.copyToRegion == null ? 43 : this.copyToRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.backupCopyRetentionInDays == null
                                ? 43
                                : this.backupCopyRetentionInDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
