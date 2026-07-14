/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * Capacity details of different storage types. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SystemStorageCapacityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SystemStorageCapacityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"diskGroups", "acfs"})
    public SystemStorageCapacityDetails(
            java.util.List<DiskGroupCapacityDetails> diskGroups, AcfsCapacityDetails acfs) {
        super();
        this.diskGroups = diskGroups;
        this.acfs = acfs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of storage disk group capacity details. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskGroups")
        private java.util.List<DiskGroupCapacityDetails> diskGroups;

        /**
         * List of storage disk group capacity details.
         *
         * @param diskGroups the value to set
         * @return this builder
         */
        public Builder diskGroups(java.util.List<DiskGroupCapacityDetails> diskGroups) {
            this.diskGroups = diskGroups;
            this.__explicitlySet__.add("diskGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("acfs")
        private AcfsCapacityDetails acfs;

        public Builder acfs(AcfsCapacityDetails acfs) {
            this.acfs = acfs;
            this.__explicitlySet__.add("acfs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SystemStorageCapacityDetails build() {
            SystemStorageCapacityDetails model =
                    new SystemStorageCapacityDetails(this.diskGroups, this.acfs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SystemStorageCapacityDetails model) {
            if (model.wasPropertyExplicitlySet("diskGroups")) {
                this.diskGroups(model.getDiskGroups());
            }
            if (model.wasPropertyExplicitlySet("acfs")) {
                this.acfs(model.getAcfs());
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

    /** List of storage disk group capacity details. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskGroups")
    private final java.util.List<DiskGroupCapacityDetails> diskGroups;

    /**
     * List of storage disk group capacity details.
     *
     * @return the value
     */
    public java.util.List<DiskGroupCapacityDetails> getDiskGroups() {
        return diskGroups;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("acfs")
    private final AcfsCapacityDetails acfs;

    public AcfsCapacityDetails getAcfs() {
        return acfs;
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
        sb.append("SystemStorageCapacityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("diskGroups=").append(String.valueOf(this.diskGroups));
        sb.append(", acfs=").append(String.valueOf(this.acfs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SystemStorageCapacityDetails)) {
            return false;
        }

        SystemStorageCapacityDetails other = (SystemStorageCapacityDetails) o;
        return java.util.Objects.equals(this.diskGroups, other.diskGroups)
                && java.util.Objects.equals(this.acfs, other.acfs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.diskGroups == null ? 43 : this.diskGroups.hashCode());
        result = (result * PRIME) + (this.acfs == null ? 43 : this.acfs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
