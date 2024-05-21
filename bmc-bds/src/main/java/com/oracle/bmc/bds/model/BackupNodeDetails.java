/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the nodes to backup. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BackupNodeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackupNodeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"levelTypeDetails", "backupType"})
    public BackupNodeDetails(LevelTypeDetails levelTypeDetails, NodeBackup.BackupType backupType) {
        super();
        this.levelTypeDetails = levelTypeDetails;
        this.backupType = backupType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("levelTypeDetails")
        private LevelTypeDetails levelTypeDetails;

        public Builder levelTypeDetails(LevelTypeDetails levelTypeDetails) {
            this.levelTypeDetails = levelTypeDetails;
            this.__explicitlySet__.add("levelTypeDetails");
            return this;
        }
        /**
         * Incremental backup type includes only the changes since the last backup. Full backup type
         * includes all changes since the volume was created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private NodeBackup.BackupType backupType;

        /**
         * Incremental backup type includes only the changes since the last backup. Full backup type
         * includes all changes since the volume was created.
         *
         * @param backupType the value to set
         * @return this builder
         */
        public Builder backupType(NodeBackup.BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupNodeDetails build() {
            BackupNodeDetails model = new BackupNodeDetails(this.levelTypeDetails, this.backupType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupNodeDetails model) {
            if (model.wasPropertyExplicitlySet("levelTypeDetails")) {
                this.levelTypeDetails(model.getLevelTypeDetails());
            }
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
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

    @com.fasterxml.jackson.annotation.JsonProperty("levelTypeDetails")
    private final LevelTypeDetails levelTypeDetails;

    public LevelTypeDetails getLevelTypeDetails() {
        return levelTypeDetails;
    }

    /**
     * Incremental backup type includes only the changes since the last backup. Full backup type
     * includes all changes since the volume was created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final NodeBackup.BackupType backupType;

    /**
     * Incremental backup type includes only the changes since the last backup. Full backup type
     * includes all changes since the volume was created.
     *
     * @return the value
     */
    public NodeBackup.BackupType getBackupType() {
        return backupType;
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
        sb.append("BackupNodeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("levelTypeDetails=").append(String.valueOf(this.levelTypeDetails));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupNodeDetails)) {
            return false;
        }

        BackupNodeDetails other = (BackupNodeDetails) o;
        return java.util.Objects.equals(this.levelTypeDetails, other.levelTypeDetails)
                && java.util.Objects.equals(this.backupType, other.backupType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.levelTypeDetails == null ? 43 : this.levelTypeDetails.hashCode());
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
