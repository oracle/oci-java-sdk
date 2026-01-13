/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Update Origin ASN of a BYOIP Range <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SetOriginAsnDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SetOriginAsnDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"byoasnId", "asPathPrependLength"})
    public SetOriginAsnDetails(String byoasnId, Integer asPathPrependLength) {
        super();
        this.byoasnId = byoasnId;
        this.asPathPrependLength = asPathPrependLength;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@code Byoasn} Resource to be associated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("byoasnId")
        private String byoasnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@code Byoasn} Resource to be associated.
         *
         * @param byoasnId the value to set
         * @return this builder
         */
        public Builder byoasnId(String byoasnId) {
            this.byoasnId = byoasnId;
            this.__explicitlySet__.add("byoasnId");
            return this;
        }
        /** The as path prepend length. */
        @com.fasterxml.jackson.annotation.JsonProperty("asPathPrependLength")
        private Integer asPathPrependLength;

        /**
         * The as path prepend length.
         *
         * @param asPathPrependLength the value to set
         * @return this builder
         */
        public Builder asPathPrependLength(Integer asPathPrependLength) {
            this.asPathPrependLength = asPathPrependLength;
            this.__explicitlySet__.add("asPathPrependLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SetOriginAsnDetails build() {
            SetOriginAsnDetails model =
                    new SetOriginAsnDetails(this.byoasnId, this.asPathPrependLength);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SetOriginAsnDetails model) {
            if (model.wasPropertyExplicitlySet("byoasnId")) {
                this.byoasnId(model.getByoasnId());
            }
            if (model.wasPropertyExplicitlySet("asPathPrependLength")) {
                this.asPathPrependLength(model.getAsPathPrependLength());
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
     * {@code Byoasn} Resource to be associated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("byoasnId")
    private final String byoasnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code Byoasn} Resource to be associated.
     *
     * @return the value
     */
    public String getByoasnId() {
        return byoasnId;
    }

    /** The as path prepend length. */
    @com.fasterxml.jackson.annotation.JsonProperty("asPathPrependLength")
    private final Integer asPathPrependLength;

    /**
     * The as path prepend length.
     *
     * @return the value
     */
    public Integer getAsPathPrependLength() {
        return asPathPrependLength;
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
        sb.append("SetOriginAsnDetails(");
        sb.append("super=").append(super.toString());
        sb.append("byoasnId=").append(String.valueOf(this.byoasnId));
        sb.append(", asPathPrependLength=").append(String.valueOf(this.asPathPrependLength));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SetOriginAsnDetails)) {
            return false;
        }

        SetOriginAsnDetails other = (SetOriginAsnDetails) o;
        return java.util.Objects.equals(this.byoasnId, other.byoasnId)
                && java.util.Objects.equals(this.asPathPrependLength, other.asPathPrependLength)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.byoasnId == null ? 43 : this.byoasnId.hashCode());
        result =
                (result * PRIME)
                        + (this.asPathPrependLength == null
                                ? 43
                                : this.asPathPrependLength.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
