/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BackupVaultDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class BackupVaultDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"backupLocation", "isIncludeKeys"})
    public BackupVaultDetails(BackupLocation backupLocation, Boolean isIncludeKeys) {
        super();
        this.backupLocation = backupLocation;
        this.isIncludeKeys = isIncludeKeys;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("backupLocation")
        private BackupLocation backupLocation;

        public Builder backupLocation(BackupLocation backupLocation) {
            this.backupLocation = backupLocation;
            this.__explicitlySet__.add("backupLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeKeys")
        private Boolean isIncludeKeys;

        public Builder isIncludeKeys(Boolean isIncludeKeys) {
            this.isIncludeKeys = isIncludeKeys;
            this.__explicitlySet__.add("isIncludeKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupVaultDetails build() {
            BackupVaultDetails model =
                    new BackupVaultDetails(this.backupLocation, this.isIncludeKeys);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupVaultDetails model) {
            if (model.wasPropertyExplicitlySet("backupLocation")) {
                this.backupLocation(model.getBackupLocation());
            }
            if (model.wasPropertyExplicitlySet("isIncludeKeys")) {
                this.isIncludeKeys(model.getIsIncludeKeys());
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

    @com.fasterxml.jackson.annotation.JsonProperty("backupLocation")
    private final BackupLocation backupLocation;

    public BackupLocation getBackupLocation() {
        return backupLocation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeKeys")
    private final Boolean isIncludeKeys;

    public Boolean getIsIncludeKeys() {
        return isIncludeKeys;
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
        sb.append("BackupVaultDetails(");
        sb.append("super=").append(super.toString());
        sb.append("backupLocation=").append(String.valueOf(this.backupLocation));
        sb.append(", isIncludeKeys=").append(String.valueOf(this.isIncludeKeys));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupVaultDetails)) {
            return false;
        }

        BackupVaultDetails other = (BackupVaultDetails) o;
        return java.util.Objects.equals(this.backupLocation, other.backupLocation)
                && java.util.Objects.equals(this.isIncludeKeys, other.isIncludeKeys)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.backupLocation == null ? 43 : this.backupLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludeKeys == null ? 43 : this.isIncludeKeys.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
