/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information about the origin asn.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ByoipRangeOriginAsn.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ByoipRangeOriginAsn extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"byoasnId", "asn", "asPathPrependLength"})
    public ByoipRangeOriginAsn(String byoasnId, Long asn, Integer asPathPrependLength) {
        super();
        this.byoasnId = byoasnId;
        this.asn = asn;
        this.asPathPrependLength = asPathPrependLength;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Byoasn} resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("byoasnId")
        private String byoasnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Byoasn} resource.
         * @param byoasnId the value to set
         * @return this builder
         **/
        public Builder byoasnId(String byoasnId) {
            this.byoasnId = byoasnId;
            this.__explicitlySet__.add("byoasnId");
            return this;
        }
        /**
         * The Autonomous System Number (ASN) you are importing to the Oracle cloud.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("asn")
        private Long asn;

        /**
         * The Autonomous System Number (ASN) you are importing to the Oracle cloud.
         * @param asn the value to set
         * @return this builder
         **/
        public Builder asn(Long asn) {
            this.asn = asn;
            this.__explicitlySet__.add("asn");
            return this;
        }
        /**
         * The as path prepend length.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("asPathPrependLength")
        private Integer asPathPrependLength;

        /**
         * The as path prepend length.
         * @param asPathPrependLength the value to set
         * @return this builder
         **/
        public Builder asPathPrependLength(Integer asPathPrependLength) {
            this.asPathPrependLength = asPathPrependLength;
            this.__explicitlySet__.add("asPathPrependLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ByoipRangeOriginAsn build() {
            ByoipRangeOriginAsn model =
                    new ByoipRangeOriginAsn(this.byoasnId, this.asn, this.asPathPrependLength);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ByoipRangeOriginAsn model) {
            if (model.wasPropertyExplicitlySet("byoasnId")) {
                this.byoasnId(model.getByoasnId());
            }
            if (model.wasPropertyExplicitlySet("asn")) {
                this.asn(model.getAsn());
            }
            if (model.wasPropertyExplicitlySet("asPathPrependLength")) {
                this.asPathPrependLength(model.getAsPathPrependLength());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Byoasn} resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("byoasnId")
    private final String byoasnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code Byoasn} resource.
     * @return the value
     **/
    public String getByoasnId() {
        return byoasnId;
    }

    /**
     * The Autonomous System Number (ASN) you are importing to the Oracle cloud.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asn")
    private final Long asn;

    /**
     * The Autonomous System Number (ASN) you are importing to the Oracle cloud.
     * @return the value
     **/
    public Long getAsn() {
        return asn;
    }

    /**
     * The as path prepend length.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asPathPrependLength")
    private final Integer asPathPrependLength;

    /**
     * The as path prepend length.
     * @return the value
     **/
    public Integer getAsPathPrependLength() {
        return asPathPrependLength;
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
        sb.append("ByoipRangeOriginAsn(");
        sb.append("super=").append(super.toString());
        sb.append("byoasnId=").append(String.valueOf(this.byoasnId));
        sb.append(", asn=").append(String.valueOf(this.asn));
        sb.append(", asPathPrependLength=").append(String.valueOf(this.asPathPrependLength));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ByoipRangeOriginAsn)) {
            return false;
        }

        ByoipRangeOriginAsn other = (ByoipRangeOriginAsn) o;
        return java.util.Objects.equals(this.byoasnId, other.byoasnId)
                && java.util.Objects.equals(this.asn, other.asn)
                && java.util.Objects.equals(this.asPathPrependLength, other.asPathPrependLength)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.byoasnId == null ? 43 : this.byoasnId.hashCode());
        result = (result * PRIME) + (this.asn == null ? 43 : this.asn.hashCode());
        result =
                (result * PRIME)
                        + (this.asPathPrependLength == null
                                ? 43
                                : this.asPathPrependLength.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
