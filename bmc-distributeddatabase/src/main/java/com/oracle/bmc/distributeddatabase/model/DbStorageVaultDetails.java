/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Details of the request to create exascale db vault storage for shard or catalog of the distributed database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DbStorageVaultDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbStorageVaultDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "highCapacityDatabaseStorage",
        "additionalFlashCacheInPercent"
    })
    public DbStorageVaultDetails(
            Integer highCapacityDatabaseStorage, Integer additionalFlashCacheInPercent) {
        super();
        this.highCapacityDatabaseStorage = highCapacityDatabaseStorage;
        this.additionalFlashCacheInPercent = additionalFlashCacheInPercent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Total storage capacity in GB for vault storage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("highCapacityDatabaseStorage")
        private Integer highCapacityDatabaseStorage;

        /**
         * Total storage capacity in GB for vault storage.
         * @param highCapacityDatabaseStorage the value to set
         * @return this builder
         **/
        public Builder highCapacityDatabaseStorage(Integer highCapacityDatabaseStorage) {
            this.highCapacityDatabaseStorage = highCapacityDatabaseStorage;
            this.__explicitlySet__.add("highCapacityDatabaseStorage");
            return this;
        }
        /**
         * The size of additional Flash Cache in percentage of High Capacity database storage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalFlashCacheInPercent")
        private Integer additionalFlashCacheInPercent;

        /**
         * The size of additional Flash Cache in percentage of High Capacity database storage.
         * @param additionalFlashCacheInPercent the value to set
         * @return this builder
         **/
        public Builder additionalFlashCacheInPercent(Integer additionalFlashCacheInPercent) {
            this.additionalFlashCacheInPercent = additionalFlashCacheInPercent;
            this.__explicitlySet__.add("additionalFlashCacheInPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbStorageVaultDetails build() {
            DbStorageVaultDetails model =
                    new DbStorageVaultDetails(
                            this.highCapacityDatabaseStorage, this.additionalFlashCacheInPercent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbStorageVaultDetails model) {
            if (model.wasPropertyExplicitlySet("highCapacityDatabaseStorage")) {
                this.highCapacityDatabaseStorage(model.getHighCapacityDatabaseStorage());
            }
            if (model.wasPropertyExplicitlySet("additionalFlashCacheInPercent")) {
                this.additionalFlashCacheInPercent(model.getAdditionalFlashCacheInPercent());
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
     * Total storage capacity in GB for vault storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("highCapacityDatabaseStorage")
    private final Integer highCapacityDatabaseStorage;

    /**
     * Total storage capacity in GB for vault storage.
     * @return the value
     **/
    public Integer getHighCapacityDatabaseStorage() {
        return highCapacityDatabaseStorage;
    }

    /**
     * The size of additional Flash Cache in percentage of High Capacity database storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalFlashCacheInPercent")
    private final Integer additionalFlashCacheInPercent;

    /**
     * The size of additional Flash Cache in percentage of High Capacity database storage.
     * @return the value
     **/
    public Integer getAdditionalFlashCacheInPercent() {
        return additionalFlashCacheInPercent;
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
        sb.append("DbStorageVaultDetails(");
        sb.append("super=").append(super.toString());
        sb.append("highCapacityDatabaseStorage=")
                .append(String.valueOf(this.highCapacityDatabaseStorage));
        sb.append(", additionalFlashCacheInPercent=")
                .append(String.valueOf(this.additionalFlashCacheInPercent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbStorageVaultDetails)) {
            return false;
        }

        DbStorageVaultDetails other = (DbStorageVaultDetails) o;
        return java.util.Objects.equals(
                        this.highCapacityDatabaseStorage, other.highCapacityDatabaseStorage)
                && java.util.Objects.equals(
                        this.additionalFlashCacheInPercent, other.additionalFlashCacheInPercent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.highCapacityDatabaseStorage == null
                                ? 43
                                : this.highCapacityDatabaseStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalFlashCacheInPercent == null
                                ? 43
                                : this.additionalFlashCacheInPercent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
