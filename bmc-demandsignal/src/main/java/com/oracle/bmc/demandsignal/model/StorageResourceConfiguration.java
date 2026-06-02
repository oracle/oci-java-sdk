/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal.model;

/**
 * Configuration for STORAGE
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StorageResourceConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "resource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StorageResourceConfiguration extends BaseResourceConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of storage resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageType")
        private String storageType;

        /**
         * The type of storage resource.
         * @param storageType the value to set
         * @return this builder
         **/
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            this.__explicitlySet__.add("storageType");
            return this;
        }
        /**
         * The type of usage for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageType")
        private String usageType;

        /**
         * The type of usage for the resource.
         * @param usageType the value to set
         * @return this builder
         **/
        public Builder usageType(String usageType) {
            this.usageType = usageType;
            this.__explicitlySet__.add("usageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StorageResourceConfiguration build() {
            StorageResourceConfiguration model =
                    new StorageResourceConfiguration(this.storageType, this.usageType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StorageResourceConfiguration model) {
            if (model.wasPropertyExplicitlySet("storageType")) {
                this.storageType(model.getStorageType());
            }
            if (model.wasPropertyExplicitlySet("usageType")) {
                this.usageType(model.getUsageType());
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

    @Deprecated
    public StorageResourceConfiguration(String storageType, String usageType) {
        super();
        this.storageType = storageType;
        this.usageType = usageType;
    }

    /**
     * The type of storage resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageType")
    private final String storageType;

    /**
     * The type of storage resource.
     * @return the value
     **/
    public String getStorageType() {
        return storageType;
    }

    /**
     * The type of usage for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageType")
    private final String usageType;

    /**
     * The type of usage for the resource.
     * @return the value
     **/
    public String getUsageType() {
        return usageType;
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
        sb.append("StorageResourceConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", storageType=").append(String.valueOf(this.storageType));
        sb.append(", usageType=").append(String.valueOf(this.usageType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StorageResourceConfiguration)) {
            return false;
        }

        StorageResourceConfiguration other = (StorageResourceConfiguration) o;
        return java.util.Objects.equals(this.storageType, other.storageType)
                && java.util.Objects.equals(this.usageType, other.usageType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.storageType == null ? 43 : this.storageType.hashCode());
        result = (result * PRIME) + (this.usageType == null ? 43 : this.usageType.hashCode());
        return result;
    }
}
