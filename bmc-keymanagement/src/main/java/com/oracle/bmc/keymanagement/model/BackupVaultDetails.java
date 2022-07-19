/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BackupVaultDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BackupVaultDetails {
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
            BackupVaultDetails __instance__ = new BackupVaultDetails(backupLocation, isIncludeKeys);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupVaultDetails o) {
            Builder copiedBuilder =
                    backupLocation(o.getBackupLocation()).isIncludeKeys(o.getIsIncludeKeys());

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
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BackupVaultDetails(");
        sb.append("backupLocation=").append(String.valueOf(this.backupLocation));
        sb.append(", isIncludeKeys=").append(String.valueOf(this.isIncludeKeys));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
