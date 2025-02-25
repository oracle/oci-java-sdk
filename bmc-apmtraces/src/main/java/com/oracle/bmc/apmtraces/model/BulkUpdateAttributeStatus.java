/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Response of a bulk update attribute operation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkUpdateAttributeStatus.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkUpdateAttributeStatus
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attributeStatuses", "bulkUpdateAttributeMetadata"})
    public BulkUpdateAttributeStatus(
            java.util.List<AttributeUpdateResponse> attributeStatuses,
            BulkUpdateAttributeMetadata bulkUpdateAttributeMetadata) {
        super();
        this.attributeStatuses = attributeStatuses;
        this.bulkUpdateAttributeMetadata = bulkUpdateAttributeMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * We preserve the order of the attribute items from the bulk update attribute request in this collection.  The ith object in this collection represents the
         * bulk update attribute operation status of the ith object in the BulkUpdateAttributeDetails object in the Bulk update attribute request.  If the
         * bulk update attribute operation results in a processing error or a validation error, the operationStatus property in the  BulkUpdateAttributeMetadata object will
         * contain the appropriate bulk error status for the bulk operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributeStatuses")
        private java.util.List<AttributeUpdateResponse> attributeStatuses;

        /**
         * We preserve the order of the attribute items from the bulk update attribute request in this collection.  The ith object in this collection represents the
         * bulk update attribute operation status of the ith object in the BulkUpdateAttributeDetails object in the Bulk update attribute request.  If the
         * bulk update attribute operation results in a processing error or a validation error, the operationStatus property in the  BulkUpdateAttributeMetadata object will
         * contain the appropriate bulk error status for the bulk operation.
         *
         * @param attributeStatuses the value to set
         * @return this builder
         **/
        public Builder attributeStatuses(
                java.util.List<AttributeUpdateResponse> attributeStatuses) {
            this.attributeStatuses = attributeStatuses;
            this.__explicitlySet__.add("attributeStatuses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bulkUpdateAttributeMetadata")
        private BulkUpdateAttributeMetadata bulkUpdateAttributeMetadata;

        public Builder bulkUpdateAttributeMetadata(
                BulkUpdateAttributeMetadata bulkUpdateAttributeMetadata) {
            this.bulkUpdateAttributeMetadata = bulkUpdateAttributeMetadata;
            this.__explicitlySet__.add("bulkUpdateAttributeMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUpdateAttributeStatus build() {
            BulkUpdateAttributeStatus model =
                    new BulkUpdateAttributeStatus(
                            this.attributeStatuses, this.bulkUpdateAttributeMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUpdateAttributeStatus model) {
            if (model.wasPropertyExplicitlySet("attributeStatuses")) {
                this.attributeStatuses(model.getAttributeStatuses());
            }
            if (model.wasPropertyExplicitlySet("bulkUpdateAttributeMetadata")) {
                this.bulkUpdateAttributeMetadata(model.getBulkUpdateAttributeMetadata());
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

    /**
     * We preserve the order of the attribute items from the bulk update attribute request in this collection.  The ith object in this collection represents the
     * bulk update attribute operation status of the ith object in the BulkUpdateAttributeDetails object in the Bulk update attribute request.  If the
     * bulk update attribute operation results in a processing error or a validation error, the operationStatus property in the  BulkUpdateAttributeMetadata object will
     * contain the appropriate bulk error status for the bulk operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeStatuses")
    private final java.util.List<AttributeUpdateResponse> attributeStatuses;

    /**
     * We preserve the order of the attribute items from the bulk update attribute request in this collection.  The ith object in this collection represents the
     * bulk update attribute operation status of the ith object in the BulkUpdateAttributeDetails object in the Bulk update attribute request.  If the
     * bulk update attribute operation results in a processing error or a validation error, the operationStatus property in the  BulkUpdateAttributeMetadata object will
     * contain the appropriate bulk error status for the bulk operation.
     *
     * @return the value
     **/
    public java.util.List<AttributeUpdateResponse> getAttributeStatuses() {
        return attributeStatuses;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bulkUpdateAttributeMetadata")
    private final BulkUpdateAttributeMetadata bulkUpdateAttributeMetadata;

    public BulkUpdateAttributeMetadata getBulkUpdateAttributeMetadata() {
        return bulkUpdateAttributeMetadata;
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
        sb.append("BulkUpdateAttributeStatus(");
        sb.append("super=").append(super.toString());
        sb.append("attributeStatuses=").append(String.valueOf(this.attributeStatuses));
        sb.append(", bulkUpdateAttributeMetadata=")
                .append(String.valueOf(this.bulkUpdateAttributeMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUpdateAttributeStatus)) {
            return false;
        }

        BulkUpdateAttributeStatus other = (BulkUpdateAttributeStatus) o;
        return java.util.Objects.equals(this.attributeStatuses, other.attributeStatuses)
                && java.util.Objects.equals(
                        this.bulkUpdateAttributeMetadata, other.bulkUpdateAttributeMetadata)
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
                        + (this.bulkUpdateAttributeMetadata == null
                                ? 43
                                : this.bulkUpdateAttributeMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
