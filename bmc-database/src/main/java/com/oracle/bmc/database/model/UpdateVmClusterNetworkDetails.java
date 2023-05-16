/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for an Exadata VM cluster network. Applies to Exadata Cloud@Customer instances only. <br>
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
        builder = UpdateVmClusterNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateVmClusterNetworkDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "scans",
        "dns",
        "ntp",
        "vmNetworks",
        "freeformTags",
        "definedTags"
    })
    public UpdateVmClusterNetworkDetails(
            java.util.List<ScanDetails> scans,
            java.util.List<String> dns,
            java.util.List<String> ntp,
            java.util.List<VmNetworkDetails> vmNetworks,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.scans = scans;
        this.dns = dns;
        this.ntp = ntp;
        this.vmNetworks = vmNetworks;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The SCAN details. */
        @com.fasterxml.jackson.annotation.JsonProperty("scans")
        private java.util.List<ScanDetails> scans;

        /**
         * The SCAN details.
         *
         * @param scans the value to set
         * @return this builder
         */
        public Builder scans(java.util.List<ScanDetails> scans) {
            this.scans = scans;
            this.__explicitlySet__.add("scans");
            return this;
        }
        /** The list of DNS server IP addresses. Maximum of 3 allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("dns")
        private java.util.List<String> dns;

        /**
         * The list of DNS server IP addresses. Maximum of 3 allowed.
         *
         * @param dns the value to set
         * @return this builder
         */
        public Builder dns(java.util.List<String> dns) {
            this.dns = dns;
            this.__explicitlySet__.add("dns");
            return this;
        }
        /** The list of NTP server IP addresses. Maximum of 3 allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("ntp")
        private java.util.List<String> ntp;

        /**
         * The list of NTP server IP addresses. Maximum of 3 allowed.
         *
         * @param ntp the value to set
         * @return this builder
         */
        public Builder ntp(java.util.List<String> ntp) {
            this.ntp = ntp;
            this.__explicitlySet__.add("ntp");
            return this;
        }
        /** Details of the client and backup networks. */
        @com.fasterxml.jackson.annotation.JsonProperty("vmNetworks")
        private java.util.List<VmNetworkDetails> vmNetworks;

        /**
         * Details of the client and backup networks.
         *
         * @param vmNetworks the value to set
         * @return this builder
         */
        public Builder vmNetworks(java.util.List<VmNetworkDetails> vmNetworks) {
            this.vmNetworks = vmNetworks;
            this.__explicitlySet__.add("vmNetworks");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVmClusterNetworkDetails build() {
            UpdateVmClusterNetworkDetails model =
                    new UpdateVmClusterNetworkDetails(
                            this.scans,
                            this.dns,
                            this.ntp,
                            this.vmNetworks,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVmClusterNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("scans")) {
                this.scans(model.getScans());
            }
            if (model.wasPropertyExplicitlySet("dns")) {
                this.dns(model.getDns());
            }
            if (model.wasPropertyExplicitlySet("ntp")) {
                this.ntp(model.getNtp());
            }
            if (model.wasPropertyExplicitlySet("vmNetworks")) {
                this.vmNetworks(model.getVmNetworks());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The SCAN details. */
    @com.fasterxml.jackson.annotation.JsonProperty("scans")
    private final java.util.List<ScanDetails> scans;

    /**
     * The SCAN details.
     *
     * @return the value
     */
    public java.util.List<ScanDetails> getScans() {
        return scans;
    }

    /** The list of DNS server IP addresses. Maximum of 3 allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("dns")
    private final java.util.List<String> dns;

    /**
     * The list of DNS server IP addresses. Maximum of 3 allowed.
     *
     * @return the value
     */
    public java.util.List<String> getDns() {
        return dns;
    }

    /** The list of NTP server IP addresses. Maximum of 3 allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("ntp")
    private final java.util.List<String> ntp;

    /**
     * The list of NTP server IP addresses. Maximum of 3 allowed.
     *
     * @return the value
     */
    public java.util.List<String> getNtp() {
        return ntp;
    }

    /** Details of the client and backup networks. */
    @com.fasterxml.jackson.annotation.JsonProperty("vmNetworks")
    private final java.util.List<VmNetworkDetails> vmNetworks;

    /**
     * Details of the client and backup networks.
     *
     * @return the value
     */
    public java.util.List<VmNetworkDetails> getVmNetworks() {
        return vmNetworks;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateVmClusterNetworkDetails(");
        sb.append("super=").append(super.toString());
        sb.append("scans=").append(String.valueOf(this.scans));
        sb.append(", dns=").append(String.valueOf(this.dns));
        sb.append(", ntp=").append(String.valueOf(this.ntp));
        sb.append(", vmNetworks=").append(String.valueOf(this.vmNetworks));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVmClusterNetworkDetails)) {
            return false;
        }

        UpdateVmClusterNetworkDetails other = (UpdateVmClusterNetworkDetails) o;
        return java.util.Objects.equals(this.scans, other.scans)
                && java.util.Objects.equals(this.dns, other.dns)
                && java.util.Objects.equals(this.ntp, other.ntp)
                && java.util.Objects.equals(this.vmNetworks, other.vmNetworks)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.scans == null ? 43 : this.scans.hashCode());
        result = (result * PRIME) + (this.dns == null ? 43 : this.dns.hashCode());
        result = (result * PRIME) + (this.ntp == null ? 43 : this.ntp.hashCode());
        result = (result * PRIME) + (this.vmNetworks == null ? 43 : this.vmNetworks.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
