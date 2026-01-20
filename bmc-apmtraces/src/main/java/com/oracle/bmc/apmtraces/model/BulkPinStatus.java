/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Response of a bulk attribute pin operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BulkPinStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkPinStatus extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attributeStatuses", "bulkPinMetadata"})
    public BulkPinStatus(
            java.util.List<AttributePinResponse> attributeStatuses,
            BulkPinMetadata bulkPinMetadata) {
        super();
        this.attributeStatuses = attributeStatuses;
        this.bulkPinMetadata = bulkPinMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * We preserve the order of the attribute items from the bulk pin request in this
         * collection. The ith object in this collection represents the bulk pin operation status of
         * the ith object in the BulkPinAttributeDetails object in the Bulk pin request. If the bulk
         * pin operation results in a processing error or a validation error, the operationStatus
         * property in the BulkPinMetadata object will contain the appropriate bulk error status for
         * the bulk operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeStatuses")
        private java.util.List<AttributePinResponse> attributeStatuses;

        /**
         * We preserve the order of the attribute items from the bulk pin request in this
         * collection. The ith object in this collection represents the bulk pin operation status of
         * the ith object in the BulkPinAttributeDetails object in the Bulk pin request. If the bulk
         * pin operation results in a processing error or a validation error, the operationStatus
         * property in the BulkPinMetadata object will contain the appropriate bulk error status for
         * the bulk operation.
         *
         * @param attributeStatuses the value to set
         * @return this builder
         */
        public Builder attributeStatuses(java.util.List<AttributePinResponse> attributeStatuses) {
            this.attributeStatuses = attributeStatuses;
            this.__explicitlySet__.add("attributeStatuses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bulkPinMetadata")
        private BulkPinMetadata bulkPinMetadata;

        public Builder bulkPinMetadata(BulkPinMetadata bulkPinMetadata) {
            this.bulkPinMetadata = bulkPinMetadata;
            this.__explicitlySet__.add("bulkPinMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkPinStatus build() {
            BulkPinStatus model = new BulkPinStatus(this.attributeStatuses, this.bulkPinMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkPinStatus model) {
            if (model.wasPropertyExplicitlySet("attributeStatuses")) {
                this.attributeStatuses(model.getAttributeStatuses());
            }
            if (model.wasPropertyExplicitlySet("bulkPinMetadata")) {
                this.bulkPinMetadata(model.getBulkPinMetadata());
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
     * We preserve the order of the attribute items from the bulk pin request in this collection.
     * The ith object in this collection represents the bulk pin operation status of the ith object
     * in the BulkPinAttributeDetails object in the Bulk pin request. If the bulk pin operation
     * results in a processing error or a validation error, the operationStatus property in the
     * BulkPinMetadata object will contain the appropriate bulk error status for the bulk operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeStatuses")
    private final java.util.List<AttributePinResponse> attributeStatuses;

    /**
     * We preserve the order of the attribute items from the bulk pin request in this collection.
     * The ith object in this collection represents the bulk pin operation status of the ith object
     * in the BulkPinAttributeDetails object in the Bulk pin request. If the bulk pin operation
     * results in a processing error or a validation error, the operationStatus property in the
     * BulkPinMetadata object will contain the appropriate bulk error status for the bulk operation.
     *
     * @return the value
     */
    public java.util.List<AttributePinResponse> getAttributeStatuses() {
        return attributeStatuses;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bulkPinMetadata")
    private final BulkPinMetadata bulkPinMetadata;

    public BulkPinMetadata getBulkPinMetadata() {
        return bulkPinMetadata;
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
        sb.append("BulkPinStatus(");
        sb.append("super=").append(super.toString());
        sb.append("attributeStatuses=").append(String.valueOf(this.attributeStatuses));
        sb.append(", bulkPinMetadata=").append(String.valueOf(this.bulkPinMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkPinStatus)) {
            return false;
        }

        BulkPinStatus other = (BulkPinStatus) o;
        return java.util.Objects.equals(this.attributeStatuses, other.attributeStatuses)
                && java.util.Objects.equals(this.bulkPinMetadata, other.bulkPinMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attributeStatuses == null ? 43 : this.attributeStatuses.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkPinMetadata == null ? 43 : this.bulkPinMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
