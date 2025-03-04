/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Datastore info for creating an Sddc. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DatastoreInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatastoreInfo extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"blockVolumeIds", "datastoreType"})
    public DatastoreInfo(java.util.List<String> blockVolumeIds, DatastoreTypes datastoreType) {
        super();
        this.blockVolumeIds = blockVolumeIds;
        this.datastoreType = datastoreType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s
         * of Block Storage Volumes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeIds")
        private java.util.List<String> blockVolumeIds;

        /**
         * A list of [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatastoreInfo build() {
            DatastoreInfo model = new DatastoreInfo(this.blockVolumeIds, this.datastoreType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatastoreInfo model) {
            if (model.wasPropertyExplicitlySet("blockVolumeIds")) {
                this.blockVolumeIds(model.getBlockVolumeIds());
            }
            if (model.wasPropertyExplicitlySet("datastoreType")) {
                this.datastoreType(model.getDatastoreType());
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
     * A list of [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of
     * Block Storage Volumes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeIds")
    private final java.util.List<String> blockVolumeIds;

    /**
     * A list of [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of
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
        sb.append("DatastoreInfo(");
        sb.append("super=").append(super.toString());
        sb.append("blockVolumeIds=").append(String.valueOf(this.blockVolumeIds));
        sb.append(", datastoreType=").append(String.valueOf(this.datastoreType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatastoreInfo)) {
            return false;
        }

        DatastoreInfo other = (DatastoreInfo) o;
        return java.util.Objects.equals(this.blockVolumeIds, other.blockVolumeIds)
                && java.util.Objects.equals(this.datastoreType, other.datastoreType)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
