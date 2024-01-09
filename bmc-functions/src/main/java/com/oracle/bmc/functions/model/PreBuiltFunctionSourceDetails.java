/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * The source of the Function which is based on a Pre-Built Function Listing (PbfListing). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PreBuiltFunctionSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PreBuiltFunctionSourceDetails extends FunctionSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the PbfListing this function is sourced from.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pbfListingId")
        private String pbfListingId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the PbfListing this function is sourced from.
         *
         * @param pbfListingId the value to set
         * @return this builder
         */
        public Builder pbfListingId(String pbfListingId) {
            this.pbfListingId = pbfListingId;
            this.__explicitlySet__.add("pbfListingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PreBuiltFunctionSourceDetails build() {
            PreBuiltFunctionSourceDetails model =
                    new PreBuiltFunctionSourceDetails(this.pbfListingId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PreBuiltFunctionSourceDetails model) {
            if (model.wasPropertyExplicitlySet("pbfListingId")) {
                this.pbfListingId(model.getPbfListingId());
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

    @Deprecated
    public PreBuiltFunctionSourceDetails(String pbfListingId) {
        super();
        this.pbfListingId = pbfListingId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the PbfListing this function is sourced from.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pbfListingId")
    private final String pbfListingId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the PbfListing this function is sourced from.
     *
     * @return the value
     */
    public String getPbfListingId() {
        return pbfListingId;
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
        sb.append("PreBuiltFunctionSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", pbfListingId=").append(String.valueOf(this.pbfListingId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreBuiltFunctionSourceDetails)) {
            return false;
        }

        PreBuiltFunctionSourceDetails other = (PreBuiltFunctionSourceDetails) o;
        return java.util.Objects.equals(this.pbfListingId, other.pbfListingId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pbfListingId == null ? 43 : this.pbfListingId.hashCode());
        return result;
    }
}
