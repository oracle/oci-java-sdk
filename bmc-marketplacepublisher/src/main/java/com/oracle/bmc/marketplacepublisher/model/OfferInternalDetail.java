/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * the internal details of an offer that are only visible to the seller <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OfferInternalDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OfferInternalDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"customFields", "internalNotes"})
    public OfferInternalDetail(java.util.List<CustomField> customFields, String internalNotes) {
        super();
        this.customFields = customFields;
        this.internalNotes = internalNotes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A list of key value pairs specified by the seller */
        @com.fasterxml.jackson.annotation.JsonProperty("customFields")
        private java.util.List<CustomField> customFields;

        /**
         * A list of key value pairs specified by the seller
         *
         * @param customFields the value to set
         * @return this builder
         */
        public Builder customFields(java.util.List<CustomField> customFields) {
            this.customFields = customFields;
            this.__explicitlySet__.add("customFields");
            return this;
        }
        /** Internal notes only intended for the Publisher of the Offer */
        @com.fasterxml.jackson.annotation.JsonProperty("internalNotes")
        private String internalNotes;

        /**
         * Internal notes only intended for the Publisher of the Offer
         *
         * @param internalNotes the value to set
         * @return this builder
         */
        public Builder internalNotes(String internalNotes) {
            this.internalNotes = internalNotes;
            this.__explicitlySet__.add("internalNotes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OfferInternalDetail build() {
            OfferInternalDetail model =
                    new OfferInternalDetail(this.customFields, this.internalNotes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OfferInternalDetail model) {
            if (model.wasPropertyExplicitlySet("customFields")) {
                this.customFields(model.getCustomFields());
            }
            if (model.wasPropertyExplicitlySet("internalNotes")) {
                this.internalNotes(model.getInternalNotes());
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

    /** A list of key value pairs specified by the seller */
    @com.fasterxml.jackson.annotation.JsonProperty("customFields")
    private final java.util.List<CustomField> customFields;

    /**
     * A list of key value pairs specified by the seller
     *
     * @return the value
     */
    public java.util.List<CustomField> getCustomFields() {
        return customFields;
    }

    /** Internal notes only intended for the Publisher of the Offer */
    @com.fasterxml.jackson.annotation.JsonProperty("internalNotes")
    private final String internalNotes;

    /**
     * Internal notes only intended for the Publisher of the Offer
     *
     * @return the value
     */
    public String getInternalNotes() {
        return internalNotes;
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
        sb.append("OfferInternalDetail(");
        sb.append("super=").append(super.toString());
        sb.append("customFields=").append(String.valueOf(this.customFields));
        sb.append(", internalNotes=").append(String.valueOf(this.internalNotes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OfferInternalDetail)) {
            return false;
        }

        OfferInternalDetail other = (OfferInternalDetail) o;
        return java.util.Objects.equals(this.customFields, other.customFields)
                && java.util.Objects.equals(this.internalNotes, other.internalNotes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.customFields == null ? 43 : this.customFields.hashCode());
        result =
                (result * PRIME)
                        + (this.internalNotes == null ? 43 : this.internalNotes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
