/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Response of a bulk attribute activation operation. <br>
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
        builder = BulkActivationStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkActivationStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attributeStatuses", "bulkActivationMetadata"})
    public BulkActivationStatus(
            java.util.List<AttributeResponse> attributeStatuses,
            BulkActivationMetadata bulkActivationMetadata) {
        super();
        this.attributeStatuses = attributeStatuses;
        this.bulkActivationMetadata = bulkActivationMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * We preserve the order of the attribute items from the bulk activation request in this
         * collection. The ith object in this collection represents the bulk activation operation
         * status of the ith object in the BulkActivateAttributeDetails object from the Bulk
         * Activation request. If the bulk activation operation results in a processing error or a
         * validation error, the operationStatus property in the BulkActivationMetadata object will
         * contain the appropriate bulk error status for the bulk operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeStatuses")
        private java.util.List<AttributeResponse> attributeStatuses;

        /**
         * We preserve the order of the attribute items from the bulk activation request in this
         * collection. The ith object in this collection represents the bulk activation operation
         * status of the ith object in the BulkActivateAttributeDetails object from the Bulk
         * Activation request. If the bulk activation operation results in a processing error or a
         * validation error, the operationStatus property in the BulkActivationMetadata object will
         * contain the appropriate bulk error status for the bulk operation.
         *
         * @param attributeStatuses the value to set
         * @return this builder
         */
        public Builder attributeStatuses(java.util.List<AttributeResponse> attributeStatuses) {
            this.attributeStatuses = attributeStatuses;
            this.__explicitlySet__.add("attributeStatuses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bulkActivationMetadata")
        private BulkActivationMetadata bulkActivationMetadata;

        public Builder bulkActivationMetadata(BulkActivationMetadata bulkActivationMetadata) {
            this.bulkActivationMetadata = bulkActivationMetadata;
            this.__explicitlySet__.add("bulkActivationMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkActivationStatus build() {
            BulkActivationStatus model =
                    new BulkActivationStatus(this.attributeStatuses, this.bulkActivationMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkActivationStatus model) {
            if (model.wasPropertyExplicitlySet("attributeStatuses")) {
                this.attributeStatuses(model.getAttributeStatuses());
            }
            if (model.wasPropertyExplicitlySet("bulkActivationMetadata")) {
                this.bulkActivationMetadata(model.getBulkActivationMetadata());
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
     * We preserve the order of the attribute items from the bulk activation request in this
     * collection. The ith object in this collection represents the bulk activation operation status
     * of the ith object in the BulkActivateAttributeDetails object from the Bulk Activation
     * request. If the bulk activation operation results in a processing error or a validation
     * error, the operationStatus property in the BulkActivationMetadata object will contain the
     * appropriate bulk error status for the bulk operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeStatuses")
    private final java.util.List<AttributeResponse> attributeStatuses;

    /**
     * We preserve the order of the attribute items from the bulk activation request in this
     * collection. The ith object in this collection represents the bulk activation operation status
     * of the ith object in the BulkActivateAttributeDetails object from the Bulk Activation
     * request. If the bulk activation operation results in a processing error or a validation
     * error, the operationStatus property in the BulkActivationMetadata object will contain the
     * appropriate bulk error status for the bulk operation.
     *
     * @return the value
     */
    public java.util.List<AttributeResponse> getAttributeStatuses() {
        return attributeStatuses;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bulkActivationMetadata")
    private final BulkActivationMetadata bulkActivationMetadata;

    public BulkActivationMetadata getBulkActivationMetadata() {
        return bulkActivationMetadata;
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
        sb.append("BulkActivationStatus(");
        sb.append("super=").append(super.toString());
        sb.append("attributeStatuses=").append(String.valueOf(this.attributeStatuses));
        sb.append(", bulkActivationMetadata=").append(String.valueOf(this.bulkActivationMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkActivationStatus)) {
            return false;
        }

        BulkActivationStatus other = (BulkActivationStatus) o;
        return java.util.Objects.equals(this.attributeStatuses, other.attributeStatuses)
                && java.util.Objects.equals(
                        this.bulkActivationMetadata, other.bulkActivationMetadata)
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
                        + (this.bulkActivationMetadata == null
                                ? 43
                                : this.bulkActivationMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
