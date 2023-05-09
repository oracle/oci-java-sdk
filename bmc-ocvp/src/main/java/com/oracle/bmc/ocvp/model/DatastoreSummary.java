/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Datastore summary for a getting an Sddc. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DatastoreSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DatastoreSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"blockVolumeIds", "datastoreType", "capacity"})
    public DatastoreSummary(
            java.util.List<String> blockVolumeIds,
            DatastoreTypes datastoreType,
            java.math.BigDecimal capacity) {
        super();
        this.blockVolumeIds = blockVolumeIds;
        this.datastoreType = datastoreType;
        this.capacity = capacity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)s
         * of Block Storage Volumes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeIds")
        private java.util.List<String> blockVolumeIds;

        /**
         * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)s
         * of Block Storage Volumes.
         *
         * @param blockVolumeIds the value to set
         * @return this builder
         */
        public Builder blockVolumeIds(java.util.List<String> blockVolumeIds) {
            this.blockVolumeIds = blockVolumeIds;
            this.__explicitlySet__.add("blockVolumeIds");
            return this;
        }
        /** Type of the datastore. */
        @com.fasterxml.jackson.annotation.JsonProperty("datastoreType")
        private DatastoreTypes datastoreType;

        /**
         * Type of the datastore.
         *
         * @param datastoreType the value to set
         * @return this builder
         */
        public Builder datastoreType(DatastoreTypes datastoreType) {
            this.datastoreType = datastoreType;
            this.__explicitlySet__.add("datastoreType");
            return this;
        }
        /** Size of the Block Storage Volume in GB. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private java.math.BigDecimal capacity;

        /**
         * Size of the Block Storage Volume in GB.
         *
         * @param capacity the value to set
         * @return this builder
         */
        public Builder capacity(java.math.BigDecimal capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatastoreSummary build() {
            DatastoreSummary model =
                    new DatastoreSummary(this.blockVolumeIds, this.datastoreType, this.capacity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatastoreSummary model) {
            if (model.wasPropertyExplicitlySet("blockVolumeIds")) {
                this.blockVolumeIds(model.getBlockVolumeIds());
            }
            if (model.wasPropertyExplicitlySet("datastoreType")) {
                this.datastoreType(model.getDatastoreType());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
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
     * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)s of
     * Block Storage Volumes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeIds")
    private final java.util.List<String> blockVolumeIds;

    /**
     * A list of [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)s of
     * Block Storage Volumes.
     *
     * @return the value
     */
    public java.util.List<String> getBlockVolumeIds() {
        return blockVolumeIds;
    }

    /** Type of the datastore. */
    @com.fasterxml.jackson.annotation.JsonProperty("datastoreType")
    private final DatastoreTypes datastoreType;

    /**
     * Type of the datastore.
     *
     * @return the value
     */
    public DatastoreTypes getDatastoreType() {
        return datastoreType;
    }

    /** Size of the Block Storage Volume in GB. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final java.math.BigDecimal capacity;

    /**
     * Size of the Block Storage Volume in GB.
     *
     * @return the value
     */
    public java.math.BigDecimal getCapacity() {
        return capacity;
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
        sb.append("DatastoreSummary(");
        sb.append("super=").append(super.toString());
        sb.append("blockVolumeIds=").append(String.valueOf(this.blockVolumeIds));
        sb.append(", datastoreType=").append(String.valueOf(this.datastoreType));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatastoreSummary)) {
            return false;
        }

        DatastoreSummary other = (DatastoreSummary) o;
        return java.util.Objects.equals(this.blockVolumeIds, other.blockVolumeIds)
                && java.util.Objects.equals(this.datastoreType, other.datastoreType)
                && java.util.Objects.equals(this.capacity, other.capacity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.blockVolumeIds == null ? 43 : this.blockVolumeIds.hashCode());
        result =
                (result * PRIME)
                        + (this.datastoreType == null ? 43 : this.datastoreType.hashCode());
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
