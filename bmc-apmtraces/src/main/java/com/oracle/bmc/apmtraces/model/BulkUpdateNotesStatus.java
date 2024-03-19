/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Response of a bulk update notes operation. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BulkUpdateNotesStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkUpdateNotesStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attributeStatuses", "bulkUpdateNotesMetadata"})
    public BulkUpdateNotesStatus(
            java.util.List<AttributeUpdateNotesResponse> attributeStatuses,
            BulkUpdateNotesMetadata bulkUpdateNotesMetadata) {
        super();
        this.attributeStatuses = attributeStatuses;
        this.bulkUpdateNotesMetadata = bulkUpdateNotesMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * We preserve the order of the attribute items from the bulk update notes request in this
         * collection. The ith object in this collection represents the bulk update notes operation
         * status of the ith object in the BulkUpdateAttributeNotesDetails object in the Bulk update
         * notes request. If the bulk update notes operation results in a processing error or a
         * validation error, the operationStatus property in the BulkUpdateNotesMetadata object will
         * contain the appropriate bulk error status for the bulk operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeStatuses")
        private java.util.List<AttributeUpdateNotesResponse> attributeStatuses;

        /**
         * We preserve the order of the attribute items from the bulk update notes request in this
         * collection. The ith object in this collection represents the bulk update notes operation
         * status of the ith object in the BulkUpdateAttributeNotesDetails object in the Bulk update
         * notes request. If the bulk update notes operation results in a processing error or a
         * validation error, the operationStatus property in the BulkUpdateNotesMetadata object will
         * contain the appropriate bulk error status for the bulk operation.
         *
         * @param attributeStatuses the value to set
         * @return this builder
         */
        public Builder attributeStatuses(
                java.util.List<AttributeUpdateNotesResponse> attributeStatuses) {
            this.attributeStatuses = attributeStatuses;
            this.__explicitlySet__.add("attributeStatuses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bulkUpdateNotesMetadata")
        private BulkUpdateNotesMetadata bulkUpdateNotesMetadata;

        public Builder bulkUpdateNotesMetadata(BulkUpdateNotesMetadata bulkUpdateNotesMetadata) {
            this.bulkUpdateNotesMetadata = bulkUpdateNotesMetadata;
            this.__explicitlySet__.add("bulkUpdateNotesMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUpdateNotesStatus build() {
            BulkUpdateNotesStatus model =
                    new BulkUpdateNotesStatus(this.attributeStatuses, this.bulkUpdateNotesMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUpdateNotesStatus model) {
            if (model.wasPropertyExplicitlySet("attributeStatuses")) {
                this.attributeStatuses(model.getAttributeStatuses());
            }
            if (model.wasPropertyExplicitlySet("bulkUpdateNotesMetadata")) {
                this.bulkUpdateNotesMetadata(model.getBulkUpdateNotesMetadata());
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
     * We preserve the order of the attribute items from the bulk update notes request in this
     * collection. The ith object in this collection represents the bulk update notes operation
     * status of the ith object in the BulkUpdateAttributeNotesDetails object in the Bulk update
     * notes request. If the bulk update notes operation results in a processing error or a
     * validation error, the operationStatus property in the BulkUpdateNotesMetadata object will
     * contain the appropriate bulk error status for the bulk operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeStatuses")
    private final java.util.List<AttributeUpdateNotesResponse> attributeStatuses;

    /**
     * We preserve the order of the attribute items from the bulk update notes request in this
     * collection. The ith object in this collection represents the bulk update notes operation
     * status of the ith object in the BulkUpdateAttributeNotesDetails object in the Bulk update
     * notes request. If the bulk update notes operation results in a processing error or a
     * validation error, the operationStatus property in the BulkUpdateNotesMetadata object will
     * contain the appropriate bulk error status for the bulk operation.
     *
     * @return the value
     */
    public java.util.List<AttributeUpdateNotesResponse> getAttributeStatuses() {
        return attributeStatuses;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bulkUpdateNotesMetadata")
    private final BulkUpdateNotesMetadata bulkUpdateNotesMetadata;

    public BulkUpdateNotesMetadata getBulkUpdateNotesMetadata() {
        return bulkUpdateNotesMetadata;
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
        sb.append("BulkUpdateNotesStatus(");
        sb.append("super=").append(super.toString());
        sb.append("attributeStatuses=").append(String.valueOf(this.attributeStatuses));
        sb.append(", bulkUpdateNotesMetadata=")
                .append(String.valueOf(this.bulkUpdateNotesMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUpdateNotesStatus)) {
            return false;
        }

        BulkUpdateNotesStatus other = (BulkUpdateNotesStatus) o;
        return java.util.Objects.equals(this.attributeStatuses, other.attributeStatuses)
                && java.util.Objects.equals(
                        this.bulkUpdateNotesMetadata, other.bulkUpdateNotesMetadata)
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
                        + (this.bulkUpdateNotesMetadata == null
                                ? 43
                                : this.bulkUpdateNotesMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
