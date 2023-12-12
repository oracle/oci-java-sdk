/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Daily backup policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DailyBackupPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DailyBackupPolicy extends BackupPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("retentionDays")
        private Integer retentionDays;

        public Builder retentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            this.__explicitlySet__.add("retentionDays");
            return this;
        }
        /** Hour of the day when the backup starts. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupStart")
        private String backupStart;

        /**
         * Hour of the day when the backup starts.
         *
         * @param backupStart the value to set
         * @return this builder
         */
        public Builder backupStart(String backupStart) {
            this.backupStart = backupStart;
            this.__explicitlySet__.add("backupStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DailyBackupPolicy build() {
            DailyBackupPolicy model = new DailyBackupPolicy(this.retentionDays, this.backupStart);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DailyBackupPolicy model) {
            if (model.wasPropertyExplicitlySet("retentionDays")) {
                this.retentionDays(model.getRetentionDays());
            }
            if (model.wasPropertyExplicitlySet("backupStart")) {
                this.backupStart(model.getBackupStart());
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

    @Deprecated
    public DailyBackupPolicy(Integer retentionDays, String backupStart) {
        super(retentionDays);
        this.backupStart = backupStart;
    }

    /** Hour of the day when the backup starts. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupStart")
    private final String backupStart;

    /**
     * Hour of the day when the backup starts.
     *
     * @return the value
     */
    public String getBackupStart() {
        return backupStart;
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
        sb.append("DailyBackupPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", backupStart=").append(String.valueOf(this.backupStart));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DailyBackupPolicy)) {
            return false;
        }

        DailyBackupPolicy other = (DailyBackupPolicy) o;
        return java.util.Objects.equals(this.backupStart, other.backupStart) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.backupStart == null ? 43 : this.backupStart.hashCode());
        return result;
    }
}
