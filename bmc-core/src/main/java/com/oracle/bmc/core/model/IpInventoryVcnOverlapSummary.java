/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Provides the VCN overlap details. <br>
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
        builder = IpInventoryVcnOverlapSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IpInventoryVcnOverlapSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "overlappingVcnId",
        "overlappingVcnName",
        "overlappingCidr",
        "cidr"
    })
    public IpInventoryVcnOverlapSummary(
            String overlappingVcnId,
            String overlappingVcnName,
            String overlappingCidr,
            String cidr) {
        super();
        this.overlappingVcnId = overlappingVcnId;
        this.overlappingVcnName = overlappingVcnName;
        this.overlappingCidr = overlappingCidr;
        this.cidr = cidr;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VCN .
         */
        @com.fasterxml.jackson.annotation.JsonProperty("overlappingVcnId")
        private String overlappingVcnId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VCN .
         *
         * @param overlappingVcnId the value to set
         * @return this builder
         */
        public Builder overlappingVcnId(String overlappingVcnId) {
            this.overlappingVcnId = overlappingVcnId;
            this.__explicitlySet__.add("overlappingVcnId");
            return this;
        }
        /** Name of the overlapping VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("overlappingVcnName")
        private String overlappingVcnName;

        /**
         * Name of the overlapping VCN.
         *
         * @param overlappingVcnName the value to set
         * @return this builder
         */
        public Builder overlappingVcnName(String overlappingVcnName) {
            this.overlappingVcnName = overlappingVcnName;
            this.__explicitlySet__.add("overlappingVcnName");
            return this;
        }
        /** The overlapping CIDR prefix. */
        @com.fasterxml.jackson.annotation.JsonProperty("overlappingCidr")
        private String overlappingCidr;

        /**
         * The overlapping CIDR prefix.
         *
         * @param overlappingCidr the value to set
         * @return this builder
         */
        public Builder overlappingCidr(String overlappingCidr) {
            this.overlappingCidr = overlappingCidr;
            this.__explicitlySet__.add("overlappingCidr");
            return this;
        }
        /** CIDR prefix of the VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("cidr")
        private String cidr;

        /**
         * CIDR prefix of the VCN.
         *
         * @param cidr the value to set
         * @return this builder
         */
        public Builder cidr(String cidr) {
            this.cidr = cidr;
            this.__explicitlySet__.add("cidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpInventoryVcnOverlapSummary build() {
            IpInventoryVcnOverlapSummary model =
                    new IpInventoryVcnOverlapSummary(
                            this.overlappingVcnId,
                            this.overlappingVcnName,
                            this.overlappingCidr,
                            this.cidr);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpInventoryVcnOverlapSummary model) {
            if (model.wasPropertyExplicitlySet("overlappingVcnId")) {
                this.overlappingVcnId(model.getOverlappingVcnId());
            }
            if (model.wasPropertyExplicitlySet("overlappingVcnName")) {
                this.overlappingVcnName(model.getOverlappingVcnName());
            }
            if (model.wasPropertyExplicitlySet("overlappingCidr")) {
                this.overlappingCidr(model.getOverlappingCidr());
            }
            if (model.wasPropertyExplicitlySet("cidr")) {
                this.cidr(model.getCidr());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VCN .
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overlappingVcnId")
    private final String overlappingVcnId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VCN .
     *
     * @return the value
     */
    public String getOverlappingVcnId() {
        return overlappingVcnId;
    }

    /** Name of the overlapping VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("overlappingVcnName")
    private final String overlappingVcnName;

    /**
     * Name of the overlapping VCN.
     *
     * @return the value
     */
    public String getOverlappingVcnName() {
        return overlappingVcnName;
    }

    /** The overlapping CIDR prefix. */
    @com.fasterxml.jackson.annotation.JsonProperty("overlappingCidr")
    private final String overlappingCidr;

    /**
     * The overlapping CIDR prefix.
     *
     * @return the value
     */
    public String getOverlappingCidr() {
        return overlappingCidr;
    }

    /** CIDR prefix of the VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("cidr")
    private final String cidr;

    /**
     * CIDR prefix of the VCN.
     *
     * @return the value
     */
    public String getCidr() {
        return cidr;
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
        sb.append("IpInventoryVcnOverlapSummary(");
        sb.append("super=").append(super.toString());
        sb.append("overlappingVcnId=").append(String.valueOf(this.overlappingVcnId));
        sb.append(", overlappingVcnName=").append(String.valueOf(this.overlappingVcnName));
        sb.append(", overlappingCidr=").append(String.valueOf(this.overlappingCidr));
        sb.append(", cidr=").append(String.valueOf(this.cidr));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpInventoryVcnOverlapSummary)) {
            return false;
        }

        IpInventoryVcnOverlapSummary other = (IpInventoryVcnOverlapSummary) o;
        return java.util.Objects.equals(this.overlappingVcnId, other.overlappingVcnId)
                && java.util.Objects.equals(this.overlappingVcnName, other.overlappingVcnName)
                && java.util.Objects.equals(this.overlappingCidr, other.overlappingCidr)
                && java.util.Objects.equals(this.cidr, other.cidr)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.overlappingVcnId == null ? 43 : this.overlappingVcnId.hashCode());
        result =
                (result * PRIME)
                        + (this.overlappingVcnName == null
                                ? 43
                                : this.overlappingVcnName.hashCode());
        result =
                (result * PRIME)
                        + (this.overlappingCidr == null ? 43 : this.overlappingCidr.hashCode());
        result = (result * PRIME) + (this.cidr == null ? 43 : this.cidr.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
