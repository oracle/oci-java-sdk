/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * purge data size in bytes
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EstimatePurgeDataSizeResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EstimatePurgeDataSizeResult {
    @Deprecated
    @java.beans.ConstructorProperties({"purgeDataSizeInBytes"})
    public EstimatePurgeDataSizeResult(Long purgeDataSizeInBytes) {
        super();
        this.purgeDataSizeInBytes = purgeDataSizeInBytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This is the size of data to be purged in bytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("purgeDataSizeInBytes")
        private Long purgeDataSizeInBytes;

        /**
         * This is the size of data to be purged in bytes
         * @param purgeDataSizeInBytes the value to set
         * @return this builder
         **/
        public Builder purgeDataSizeInBytes(Long purgeDataSizeInBytes) {
            this.purgeDataSizeInBytes = purgeDataSizeInBytes;
            this.__explicitlySet__.add("purgeDataSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EstimatePurgeDataSizeResult build() {
            EstimatePurgeDataSizeResult __instance__ =
                    new EstimatePurgeDataSizeResult(purgeDataSizeInBytes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EstimatePurgeDataSizeResult o) {
            Builder copiedBuilder = purgeDataSizeInBytes(o.getPurgeDataSizeInBytes());

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
     * This is the size of data to be purged in bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeDataSizeInBytes")
    private final Long purgeDataSizeInBytes;

    /**
     * This is the size of data to be purged in bytes
     * @return the value
     **/
    public Long getPurgeDataSizeInBytes() {
        return purgeDataSizeInBytes;
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
        sb.append("EstimatePurgeDataSizeResult(");
        sb.append("purgeDataSizeInBytes=").append(String.valueOf(this.purgeDataSizeInBytes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EstimatePurgeDataSizeResult)) {
            return false;
        }

        EstimatePurgeDataSizeResult other = (EstimatePurgeDataSizeResult) o;
        return java.util.Objects.equals(this.purgeDataSizeInBytes, other.purgeDataSizeInBytes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.purgeDataSizeInBytes == null
                                ? 43
                                : this.purgeDataSizeInBytes.hashCode());
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
