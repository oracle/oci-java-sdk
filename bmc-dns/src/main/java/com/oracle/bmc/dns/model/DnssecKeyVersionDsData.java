/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * Data for a parent zone DS record corresponding to this key-signing key (KSK). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DnssecKeyVersionDsData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DnssecKeyVersionDsData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"rdata", "digestType"})
    public DnssecKeyVersionDsData(String rdata, DnssecDigestType digestType) {
        super();
        this.rdata = rdata;
        this.digestType = digestType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Presentation-format DS record data that must be added to the parent zone. For more
         * information about RDATA, see [Supported DNS Resource Record
         * Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rdata")
        private String rdata;

        /**
         * Presentation-format DS record data that must be added to the parent zone. For more
         * information about RDATA, see [Supported DNS Resource Record
         * Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
         *
         * @param rdata the value to set
         * @return this builder
         */
        public Builder rdata(String rdata) {
            this.rdata = rdata;
            this.__explicitlySet__.add("rdata");
            return this;
        }
        /** The type of the digest associated with the rdata. */
        @com.fasterxml.jackson.annotation.JsonProperty("digestType")
        private DnssecDigestType digestType;

        /**
         * The type of the digest associated with the rdata.
         *
         * @param digestType the value to set
         * @return this builder
         */
        public Builder digestType(DnssecDigestType digestType) {
            this.digestType = digestType;
            this.__explicitlySet__.add("digestType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DnssecKeyVersionDsData build() {
            DnssecKeyVersionDsData model = new DnssecKeyVersionDsData(this.rdata, this.digestType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DnssecKeyVersionDsData model) {
            if (model.wasPropertyExplicitlySet("rdata")) {
                this.rdata(model.getRdata());
            }
            if (model.wasPropertyExplicitlySet("digestType")) {
                this.digestType(model.getDigestType());
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
     * Presentation-format DS record data that must be added to the parent zone. For more
     * information about RDATA, see [Supported DNS Resource Record
     * Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rdata")
    private final String rdata;

    /**
     * Presentation-format DS record data that must be added to the parent zone. For more
     * information about RDATA, see [Supported DNS Resource Record
     * Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
     *
     * @return the value
     */
    public String getRdata() {
        return rdata;
    }

    /** The type of the digest associated with the rdata. */
    @com.fasterxml.jackson.annotation.JsonProperty("digestType")
    private final DnssecDigestType digestType;

    /**
     * The type of the digest associated with the rdata.
     *
     * @return the value
     */
    public DnssecDigestType getDigestType() {
        return digestType;
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
        sb.append("DnssecKeyVersionDsData(");
        sb.append("super=").append(super.toString());
        sb.append("rdata=").append(String.valueOf(this.rdata));
        sb.append(", digestType=").append(String.valueOf(this.digestType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DnssecKeyVersionDsData)) {
            return false;
        }

        DnssecKeyVersionDsData other = (DnssecKeyVersionDsData) o;
        return java.util.Objects.equals(this.rdata, other.rdata)
                && java.util.Objects.equals(this.digestType, other.digestType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rdata == null ? 43 : this.rdata.hashCode());
        result = (result * PRIME) + (this.digestType == null ? 43 : this.digestType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
