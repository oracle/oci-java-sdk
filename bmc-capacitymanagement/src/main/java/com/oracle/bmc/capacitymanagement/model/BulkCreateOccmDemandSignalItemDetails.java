/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * Details about the model that is to be used for bulk creating demand signal items. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BulkCreateOccmDemandSignalItemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkCreateOccmDemandSignalItemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"demandSignalId", "createOccmDemandSignalItems"})
    public BulkCreateOccmDemandSignalItemDetails(
            String demandSignalId,
            java.util.List<BulkCreateOccmDemandSignalItem> createOccmDemandSignalItems) {
        super();
        this.demandSignalId = demandSignalId;
        this.createOccmDemandSignalItems = createOccmDemandSignalItems;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the demand signal in which we want to bulk create these demand signal item
         * resources.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("demandSignalId")
        private String demandSignalId;

        /**
         * The OCID of the demand signal in which we want to bulk create these demand signal item
         * resources.
         *
         * @param demandSignalId the value to set
         * @return this builder
         */
        public Builder demandSignalId(String demandSignalId) {
            this.demandSignalId = demandSignalId;
            this.__explicitlySet__.add("demandSignalId");
            return this;
        }
        /** A list of demand signal items that we want to bulk create. */
        @com.fasterxml.jackson.annotation.JsonProperty("createOccmDemandSignalItems")
        private java.util.List<BulkCreateOccmDemandSignalItem> createOccmDemandSignalItems;

        /**
         * A list of demand signal items that we want to bulk create.
         *
         * @param createOccmDemandSignalItems the value to set
         * @return this builder
         */
        public Builder createOccmDemandSignalItems(
                java.util.List<BulkCreateOccmDemandSignalItem> createOccmDemandSignalItems) {
            this.createOccmDemandSignalItems = createOccmDemandSignalItems;
            this.__explicitlySet__.add("createOccmDemandSignalItems");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkCreateOccmDemandSignalItemDetails build() {
            BulkCreateOccmDemandSignalItemDetails model =
                    new BulkCreateOccmDemandSignalItemDetails(
                            this.demandSignalId, this.createOccmDemandSignalItems);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkCreateOccmDemandSignalItemDetails model) {
            if (model.wasPropertyExplicitlySet("demandSignalId")) {
                this.demandSignalId(model.getDemandSignalId());
            }
            if (model.wasPropertyExplicitlySet("createOccmDemandSignalItems")) {
                this.createOccmDemandSignalItems(model.getCreateOccmDemandSignalItems());
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
     * The OCID of the demand signal in which we want to bulk create these demand signal item
     * resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("demandSignalId")
    private final String demandSignalId;

    /**
     * The OCID of the demand signal in which we want to bulk create these demand signal item
     * resources.
     *
     * @return the value
     */
    public String getDemandSignalId() {
        return demandSignalId;
    }

    /** A list of demand signal items that we want to bulk create. */
    @com.fasterxml.jackson.annotation.JsonProperty("createOccmDemandSignalItems")
    private final java.util.List<BulkCreateOccmDemandSignalItem> createOccmDemandSignalItems;

    /**
     * A list of demand signal items that we want to bulk create.
     *
     * @return the value
     */
    public java.util.List<BulkCreateOccmDemandSignalItem> getCreateOccmDemandSignalItems() {
        return createOccmDemandSignalItems;
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
        sb.append("BulkCreateOccmDemandSignalItemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("demandSignalId=").append(String.valueOf(this.demandSignalId));
        sb.append(", createOccmDemandSignalItems=")
                .append(String.valueOf(this.createOccmDemandSignalItems));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkCreateOccmDemandSignalItemDetails)) {
            return false;
        }

        BulkCreateOccmDemandSignalItemDetails other = (BulkCreateOccmDemandSignalItemDetails) o;
        return java.util.Objects.equals(this.demandSignalId, other.demandSignalId)
                && java.util.Objects.equals(
                        this.createOccmDemandSignalItems, other.createOccmDemandSignalItems)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.demandSignalId == null ? 43 : this.demandSignalId.hashCode());
        result =
                (result * PRIME)
                        + (this.createOccmDemandSignalItems == null
                                ? 43
                                : this.createOccmDemandSignalItems.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
