/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * PostgreSQL database system management policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ManagementPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementPolicy extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"maintenanceWindowStart", "backupPolicy"})
    public ManagementPolicy(String maintenanceWindowStart, BackupPolicy backupPolicy) {
        super();
        this.maintenanceWindowStart = maintenanceWindowStart;
        this.backupPolicy = backupPolicy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The start of the maintenance window.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowStart")
        private String maintenanceWindowStart;

        /**
         * The start of the maintenance window.
         *
         * @param maintenanceWindowStart the value to set
         * @return this builder
         **/
        public Builder maintenanceWindowStart(String maintenanceWindowStart) {
            this.maintenanceWindowStart = maintenanceWindowStart;
            this.__explicitlySet__.add("maintenanceWindowStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
        private BackupPolicy backupPolicy;

        public Builder backupPolicy(BackupPolicy backupPolicy) {
            this.backupPolicy = backupPolicy;
            this.__explicitlySet__.add("backupPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementPolicy build() {
            ManagementPolicy model =
                    new ManagementPolicy(this.maintenanceWindowStart, this.backupPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementPolicy model) {
            if (model.wasPropertyExplicitlySet("maintenanceWindowStart")) {
                this.maintenanceWindowStart(model.getMaintenanceWindowStart());
            }
            if (model.wasPropertyExplicitlySet("backupPolicy")) {
                this.backupPolicy(model.getBackupPolicy());
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
     * The start of the maintenance window.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowStart")
    private final String maintenanceWindowStart;

    /**
     * The start of the maintenance window.
     *
     * @return the value
     **/
    public String getMaintenanceWindowStart() {
        return maintenanceWindowStart;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
    private final BackupPolicy backupPolicy;

    public BackupPolicy getBackupPolicy() {
        return backupPolicy;
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
        sb.append("ManagementPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("maintenanceWindowStart=").append(String.valueOf(this.maintenanceWindowStart));
        sb.append(", backupPolicy=").append(String.valueOf(this.backupPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementPolicy)) {
            return false;
        }

        ManagementPolicy other = (ManagementPolicy) o;
        return java.util.Objects.equals(this.maintenanceWindowStart, other.maintenanceWindowStart)
                && java.util.Objects.equals(this.backupPolicy, other.backupPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maintenanceWindowStart == null
                                ? 43
                                : this.maintenanceWindowStart.hashCode());
        result = (result * PRIME) + (this.backupPolicy == null ? 43 : this.backupPolicy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
