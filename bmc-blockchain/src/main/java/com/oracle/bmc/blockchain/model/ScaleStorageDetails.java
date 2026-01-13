/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * storage size to increase <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScaleStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScaleStorageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"storageSizeInTBs"})
    public ScaleStorageDetails(Integer storageSizeInTBs) {
        super();
        this.storageSizeInTBs = storageSizeInTBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Storage size in TBs */
        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
        private Integer storageSizeInTBs;

        /**
         * Storage size in TBs
         *
         * @param storageSizeInTBs the value to set
         * @return this builder
         */
        public Builder storageSizeInTBs(Integer storageSizeInTBs) {
            this.storageSizeInTBs = storageSizeInTBs;
            this.__explicitlySet__.add("storageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScaleStorageDetails build() {
            ScaleStorageDetails model = new ScaleStorageDetails(this.storageSizeInTBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScaleStorageDetails model) {
            if (model.wasPropertyExplicitlySet("storageSizeInTBs")) {
                this.storageSizeInTBs(model.getStorageSizeInTBs());
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

    /** Storage size in TBs */
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
    private final Integer storageSizeInTBs;

    /**
     * Storage size in TBs
     *
     * @return the value
     */
    public Integer getStorageSizeInTBs() {
        return storageSizeInTBs;
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
        sb.append("ScaleStorageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("storageSizeInTBs=").append(String.valueOf(this.storageSizeInTBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScaleStorageDetails)) {
            return false;
        }

        ScaleStorageDetails other = (ScaleStorageDetails) o;
        return java.util.Objects.equals(this.storageSizeInTBs, other.storageSizeInTBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.storageSizeInTBs == null ? 43 : this.storageSizeInTBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
