/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Bulk request object containing the details of the attributes to be unpinned. <br>
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
        builder = BulkUnpinAttributeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkUnpinAttributeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attributeDetails"})
    public BulkUnpinAttributeDetails(java.util.List<BulkUnpinAttributeDetail> attributeDetails) {
        super();
        this.attributeDetails = attributeDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Collection of objects containing the details about individual attribute to be unpinned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeDetails")
        private java.util.List<BulkUnpinAttributeDetail> attributeDetails;

        /**
         * Collection of objects containing the details about individual attribute to be unpinned.
         *
         * @param attributeDetails the value to set
         * @return this builder
         */
        public Builder attributeDetails(java.util.List<BulkUnpinAttributeDetail> attributeDetails) {
            this.attributeDetails = attributeDetails;
            this.__explicitlySet__.add("attributeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUnpinAttributeDetails build() {
            BulkUnpinAttributeDetails model = new BulkUnpinAttributeDetails(this.attributeDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUnpinAttributeDetails model) {
            if (model.wasPropertyExplicitlySet("attributeDetails")) {
                this.attributeDetails(model.getAttributeDetails());
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

    /** Collection of objects containing the details about individual attribute to be unpinned. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeDetails")
    private final java.util.List<BulkUnpinAttributeDetail> attributeDetails;

    /**
     * Collection of objects containing the details about individual attribute to be unpinned.
     *
     * @return the value
     */
    public java.util.List<BulkUnpinAttributeDetail> getAttributeDetails() {
        return attributeDetails;
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
        sb.append("BulkUnpinAttributeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("attributeDetails=").append(String.valueOf(this.attributeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUnpinAttributeDetails)) {
            return false;
        }

        BulkUnpinAttributeDetails other = (BulkUnpinAttributeDetails) o;
        return java.util.Objects.equals(this.attributeDetails, other.attributeDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attributeDetails == null ? 43 : this.attributeDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
