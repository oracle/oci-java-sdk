/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * Oracle Cloud Infrastructure VCN basic information object. It is optional and planned to used for
 * future for network anchor <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OciVcn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciVcn extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vcnId", "cidrBlocks", "backupCidrBlocks", "dnsLabel"})
    public OciVcn(
            String vcnId,
            java.util.List<String> cidrBlocks,
            java.util.List<String> backupCidrBlocks,
            String dnsLabel) {
        super();
        this.vcnId = vcnId;
        this.cidrBlocks = cidrBlocks;
        this.backupCidrBlocks = backupCidrBlocks;
        this.dnsLabel = dnsLabel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Oracle Cloud Infrastructure VCN OCID. CSP can not set this property. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * Oracle Cloud Infrastructure VCN OCID. CSP can not set this property.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * Oracle Cloud Infrastructure primary cidr block. CSP can set this property It's optional
         * only if disconnect anchor is allowed IPv4 CIDR blocks for the VCN that meet the following
         * criteria Type: [string (length: 1\u201332), ...] The CIDR blocks must be valid. They must
         * not overlap with each other or with the on-premises network CIDR block.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
        private java.util.List<String> cidrBlocks;

        /**
         * Oracle Cloud Infrastructure primary cidr block. CSP can set this property It's optional
         * only if disconnect anchor is allowed IPv4 CIDR blocks for the VCN that meet the following
         * criteria Type: [string (length: 1\u201332), ...] The CIDR blocks must be valid. They must
         * not overlap with each other or with the on-premises network CIDR block.
         *
         * @param cidrBlocks the value to set
         * @return this builder
         */
        public Builder cidrBlocks(java.util.List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            this.__explicitlySet__.add("cidrBlocks");
            return this;
        }
        /**
         * Oracle Cloud Infrastructure backup cidr block. CSP can set this property It's optional
         * only if disconnect anchor is allowed. IPv4 CIDR blocks for the VCN that meet the
         * following criteria Type: [string (length: 1\u201332), ...] The CIDR blocks must be valid.
         * They must not overlap with each other or with the on-premises network CIDR block.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupCidrBlocks")
        private java.util.List<String> backupCidrBlocks;

        /**
         * Oracle Cloud Infrastructure backup cidr block. CSP can set this property It's optional
         * only if disconnect anchor is allowed. IPv4 CIDR blocks for the VCN that meet the
         * following criteria Type: [string (length: 1\u201332), ...] The CIDR blocks must be valid.
         * They must not overlap with each other or with the on-premises network CIDR block.
         *
         * @param backupCidrBlocks the value to set
         * @return this builder
         */
        public Builder backupCidrBlocks(java.util.List<String> backupCidrBlocks) {
            this.backupCidrBlocks = backupCidrBlocks;
            this.__explicitlySet__.add("backupCidrBlocks");
            return this;
        }
        /** Oracle Cloud Infrastructure DNS label. This is optional if DNS config is provided. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
        private String dnsLabel;

        /**
         * Oracle Cloud Infrastructure DNS label. This is optional if DNS config is provided.
         *
         * @param dnsLabel the value to set
         * @return this builder
         */
        public Builder dnsLabel(String dnsLabel) {
            this.dnsLabel = dnsLabel;
            this.__explicitlySet__.add("dnsLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciVcn build() {
            OciVcn model =
                    new OciVcn(this.vcnId, this.cidrBlocks, this.backupCidrBlocks, this.dnsLabel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciVcn model) {
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("cidrBlocks")) {
                this.cidrBlocks(model.getCidrBlocks());
            }
            if (model.wasPropertyExplicitlySet("backupCidrBlocks")) {
                this.backupCidrBlocks(model.getBackupCidrBlocks());
            }
            if (model.wasPropertyExplicitlySet("dnsLabel")) {
                this.dnsLabel(model.getDnsLabel());
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

    /** Oracle Cloud Infrastructure VCN OCID. CSP can not set this property. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * Oracle Cloud Infrastructure VCN OCID. CSP can not set this property.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /**
     * Oracle Cloud Infrastructure primary cidr block. CSP can set this property It's optional only
     * if disconnect anchor is allowed IPv4 CIDR blocks for the VCN that meet the following criteria
     * Type: [string (length: 1\u201332), ...] The CIDR blocks must be valid. They must not overlap
     * with each other or with the on-premises network CIDR block.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
    private final java.util.List<String> cidrBlocks;

    /**
     * Oracle Cloud Infrastructure primary cidr block. CSP can set this property It's optional only
     * if disconnect anchor is allowed IPv4 CIDR blocks for the VCN that meet the following criteria
     * Type: [string (length: 1\u201332), ...] The CIDR blocks must be valid. They must not overlap
     * with each other or with the on-premises network CIDR block.
     *
     * @return the value
     */
    public java.util.List<String> getCidrBlocks() {
        return cidrBlocks;
    }

    /**
     * Oracle Cloud Infrastructure backup cidr block. CSP can set this property It's optional only
     * if disconnect anchor is allowed. IPv4 CIDR blocks for the VCN that meet the following
     * criteria Type: [string (length: 1\u201332), ...] The CIDR blocks must be valid. They must not
     * overlap with each other or with the on-premises network CIDR block.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupCidrBlocks")
    private final java.util.List<String> backupCidrBlocks;

    /**
     * Oracle Cloud Infrastructure backup cidr block. CSP can set this property It's optional only
     * if disconnect anchor is allowed. IPv4 CIDR blocks for the VCN that meet the following
     * criteria Type: [string (length: 1\u201332), ...] The CIDR blocks must be valid. They must not
     * overlap with each other or with the on-premises network CIDR block.
     *
     * @return the value
     */
    public java.util.List<String> getBackupCidrBlocks() {
        return backupCidrBlocks;
    }

    /** Oracle Cloud Infrastructure DNS label. This is optional if DNS config is provided. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
    private final String dnsLabel;

    /**
     * Oracle Cloud Infrastructure DNS label. This is optional if DNS config is provided.
     *
     * @return the value
     */
    public String getDnsLabel() {
        return dnsLabel;
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
        sb.append("OciVcn(");
        sb.append("super=").append(super.toString());
        sb.append("vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", cidrBlocks=").append(String.valueOf(this.cidrBlocks));
        sb.append(", backupCidrBlocks=").append(String.valueOf(this.backupCidrBlocks));
        sb.append(", dnsLabel=").append(String.valueOf(this.dnsLabel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciVcn)) {
            return false;
        }

        OciVcn other = (OciVcn) o;
        return java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.cidrBlocks, other.cidrBlocks)
                && java.util.Objects.equals(this.backupCidrBlocks, other.backupCidrBlocks)
                && java.util.Objects.equals(this.dnsLabel, other.dnsLabel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.cidrBlocks == null ? 43 : this.cidrBlocks.hashCode());
        result =
                (result * PRIME)
                        + (this.backupCidrBlocks == null ? 43 : this.backupCidrBlocks.hashCode());
        result = (result * PRIME) + (this.dnsLabel == null ? 43 : this.dnsLabel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
