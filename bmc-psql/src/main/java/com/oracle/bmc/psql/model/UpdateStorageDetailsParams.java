/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Storage details of the database system. <br>
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
        builder = UpdateStorageDetailsParams.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateStorageDetailsParams
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"iops"})
    public UpdateStorageDetailsParams(Long iops) {
        super();
        this.iops = iops;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Guaranteed input/output storage requests per second (IOPS) available to the database
         * system. Only valid for {@code OCI_OPTIMIZED_STORAGE} database system type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("iops")
        private Long iops;

        /**
         * Guaranteed input/output storage requests per second (IOPS) available to the database
         * system. Only valid for {@code OCI_OPTIMIZED_STORAGE} database system type.
         *
         * @param iops the value to set
         * @return this builder
         */
        public Builder iops(Long iops) {
            this.iops = iops;
            this.__explicitlySet__.add("iops");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateStorageDetailsParams build() {
            UpdateStorageDetailsParams model = new UpdateStorageDetailsParams(this.iops);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateStorageDetailsParams model) {
            if (model.wasPropertyExplicitlySet("iops")) {
                this.iops(model.getIops());
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

    /**
     * Guaranteed input/output storage requests per second (IOPS) available to the database system.
     * Only valid for {@code OCI_OPTIMIZED_STORAGE} database system type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iops")
    private final Long iops;

    /**
     * Guaranteed input/output storage requests per second (IOPS) available to the database system.
     * Only valid for {@code OCI_OPTIMIZED_STORAGE} database system type.
     *
     * @return the value
     */
    public Long getIops() {
        return iops;
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
        sb.append("UpdateStorageDetailsParams(");
        sb.append("super=").append(super.toString());
        sb.append("iops=").append(String.valueOf(this.iops));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateStorageDetailsParams)) {
            return false;
        }

        UpdateStorageDetailsParams other = (UpdateStorageDetailsParams) o;
        return java.util.Objects.equals(this.iops, other.iops) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.iops == null ? 43 : this.iops.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
