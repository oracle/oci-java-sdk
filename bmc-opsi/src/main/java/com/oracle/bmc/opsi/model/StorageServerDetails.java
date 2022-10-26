/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Partial information about a storage server which includes name and displayName. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StorageServerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class StorageServerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"storageServerName", "storageServerDisplayName"})
    public StorageServerDetails(String storageServerName, String storageServerDisplayName) {
        super();
        this.storageServerName = storageServerName;
        this.storageServerDisplayName = storageServerDisplayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The storage server name. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageServerName")
        private String storageServerName;

        /**
         * The storage server name.
         *
         * @param storageServerName the value to set
         * @return this builder
         */
        public Builder storageServerName(String storageServerName) {
            this.storageServerName = storageServerName;
            this.__explicitlySet__.add("storageServerName");
            return this;
        }
        /** The user-friendly name for the storage server. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageServerDisplayName")
        private String storageServerDisplayName;

        /**
         * The user-friendly name for the storage server. The name does not have to be unique.
         *
         * @param storageServerDisplayName the value to set
         * @return this builder
         */
        public Builder storageServerDisplayName(String storageServerDisplayName) {
            this.storageServerDisplayName = storageServerDisplayName;
            this.__explicitlySet__.add("storageServerDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StorageServerDetails build() {
            StorageServerDetails model =
                    new StorageServerDetails(this.storageServerName, this.storageServerDisplayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StorageServerDetails model) {
            if (model.wasPropertyExplicitlySet("storageServerName")) {
                this.storageServerName(model.getStorageServerName());
            }
            if (model.wasPropertyExplicitlySet("storageServerDisplayName")) {
                this.storageServerDisplayName(model.getStorageServerDisplayName());
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

    /** The storage server name. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageServerName")
    private final String storageServerName;

    /**
     * The storage server name.
     *
     * @return the value
     */
    public String getStorageServerName() {
        return storageServerName;
    }

    /** The user-friendly name for the storage server. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageServerDisplayName")
    private final String storageServerDisplayName;

    /**
     * The user-friendly name for the storage server. The name does not have to be unique.
     *
     * @return the value
     */
    public String getStorageServerDisplayName() {
        return storageServerDisplayName;
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
        sb.append("StorageServerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("storageServerName=").append(String.valueOf(this.storageServerName));
        sb.append(", storageServerDisplayName=")
                .append(String.valueOf(this.storageServerDisplayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StorageServerDetails)) {
            return false;
        }

        StorageServerDetails other = (StorageServerDetails) o;
        return java.util.Objects.equals(this.storageServerName, other.storageServerName)
                && java.util.Objects.equals(
                        this.storageServerDisplayName, other.storageServerDisplayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.storageServerName == null ? 43 : this.storageServerName.hashCode());
        result =
                (result * PRIME)
                        + (this.storageServerDisplayName == null
                                ? 43
                                : this.storageServerDisplayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
