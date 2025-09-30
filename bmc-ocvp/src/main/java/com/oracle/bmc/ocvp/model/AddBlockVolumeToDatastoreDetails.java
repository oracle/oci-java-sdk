/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Details for the Block Volume addition to the datastore <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddBlockVolumeToDatastoreDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddBlockVolumeToDatastoreDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"blockVolumeId"})
    public AddBlockVolumeToDatastoreDetails(String blockVolumeId) {
        super();
        this.blockVolumeId = blockVolumeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Block Volume to be added to the Datastore.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeId")
        private String blockVolumeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Block Volume to be added to the Datastore.
         *
         * @param blockVolumeId the value to set
         * @return this builder
         */
        public Builder blockVolumeId(String blockVolumeId) {
            this.blockVolumeId = blockVolumeId;
            this.__explicitlySet__.add("blockVolumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddBlockVolumeToDatastoreDetails build() {
            AddBlockVolumeToDatastoreDetails model =
                    new AddBlockVolumeToDatastoreDetails(this.blockVolumeId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddBlockVolumeToDatastoreDetails model) {
            if (model.wasPropertyExplicitlySet("blockVolumeId")) {
                this.blockVolumeId(model.getBlockVolumeId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Block Volume to be added to the Datastore.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeId")
    private final String blockVolumeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Block Volume to be added to the Datastore.
     *
     * @return the value
     */
    public String getBlockVolumeId() {
        return blockVolumeId;
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
        sb.append("AddBlockVolumeToDatastoreDetails(");
        sb.append("super=").append(super.toString());
        sb.append("blockVolumeId=").append(String.valueOf(this.blockVolumeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddBlockVolumeToDatastoreDetails)) {
            return false;
        }

        AddBlockVolumeToDatastoreDetails other = (AddBlockVolumeToDatastoreDetails) o;
        return java.util.Objects.equals(this.blockVolumeId, other.blockVolumeId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.blockVolumeId == null ? 43 : this.blockVolumeId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
