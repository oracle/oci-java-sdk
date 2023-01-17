/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Generates a recommended VM cluster network configuration for an Exadata Cloud@Customer system.
 * Applies to Exadata Cloud@Customer instances only. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenerateRecommendedNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GenerateRecommendedNetworkDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "dbServers",
        "scanListenerPortTcp",
        "scanListenerPortTcpSsl",
        "networks",
        "dns",
        "ntp",
        "freeformTags",
        "definedTags"
    })
    public GenerateRecommendedNetworkDetails(
            String compartmentId,
            String displayName,
            java.util.List<String> dbServers,
            Integer scanListenerPortTcp,
            Integer scanListenerPortTcpSsl,
            java.util.List<InfoForNetworkGenDetails> networks,
            java.util.List<String> dns,
            java.util.List<String> ntp,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.dbServers = dbServers;
        this.scanListenerPortTcp = scanListenerPortTcp;
        this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
        this.networks = networks;
        this.dns = dns;
        this.ntp = ntp;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The user-friendly name for the VM cluster network. The name does not need to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the VM cluster network. The name does not need to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The list of Db server Ids to configure network. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
        private java.util.List<String> dbServers;

        /**
         * The list of Db server Ids to configure network.
         *
         * @param dbServers the value to set
         * @return this builder
         */
        public Builder dbServers(java.util.List<String> dbServers) {
            this.dbServers = dbServers;
            this.__explicitlySet__.add("dbServers");
            return this;
        }
        /** The SCAN TCPIP port. Default is 1521. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
        private Integer scanListenerPortTcp;

        /**
         * The SCAN TCPIP port. Default is 1521.
         *
         * @param scanListenerPortTcp the value to set
         * @return this builder
         */
        public Builder scanListenerPortTcp(Integer scanListenerPortTcp) {
            this.scanListenerPortTcp = scanListenerPortTcp;
            this.__explicitlySet__.add("scanListenerPortTcp");
            return this;
        }
        /** The SCAN TCPIP SSL port. Default is 2484. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
        private Integer scanListenerPortTcpSsl;

        /**
         * The SCAN TCPIP SSL port. Default is 2484.
         *
         * @param scanListenerPortTcpSsl the value to set
         * @return this builder
         */
        public Builder scanListenerPortTcpSsl(Integer scanListenerPortTcpSsl) {
            this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
            this.__explicitlySet__.add("scanListenerPortTcpSsl");
            return this;
        }
        /** List of parameters for generation of the client and backup networks. */
        @com.fasterxml.jackson.annotation.JsonProperty("networks")
        private java.util.List<InfoForNetworkGenDetails> networks;

        /**
         * List of parameters for generation of the client and backup networks.
         *
         * @param networks the value to set
         * @return this builder
         */
        public Builder networks(java.util.List<InfoForNetworkGenDetails> networks) {
            this.networks = networks;
            this.__explicitlySet__.add("networks");
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

        public GenerateRecommendedNetworkDetails build() {
            GenerateRecommendedNetworkDetails model =
                    new GenerateRecommendedNetworkDetails(
                            this.compartmentId,
                            this.displayName,
                            this.dbServers,
                            this.scanListenerPortTcp,
                            this.scanListenerPortTcpSsl,
                            this.networks,
                            this.dns,
                            this.ntp,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateRecommendedNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dbServers")) {
                this.dbServers(model.getDbServers());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTcp")) {
                this.scanListenerPortTcp(model.getScanListenerPortTcp());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTcpSsl")) {
                this.scanListenerPortTcpSsl(model.getScanListenerPortTcpSsl());
            }
            if (model.wasPropertyExplicitlySet("networks")) {
                this.networks(model.getNetworks());
            }
            if (model.wasPropertyExplicitlySet("dns")) {
                this.dns(model.getDns());
            }
            if (model.wasPropertyExplicitlySet("ntp")) {
                this.ntp(model.getNtp());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The user-friendly name for the VM cluster network. The name does not need to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the VM cluster network. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The list of Db server Ids to configure network. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
    private final java.util.List<String> dbServers;

    /**
     * The list of Db server Ids to configure network.
     *
     * @return the value
     */
    public java.util.List<String> getDbServers() {
        return dbServers;
    }

    /** The SCAN TCPIP port. Default is 1521. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
    private final Integer scanListenerPortTcp;

    /**
     * The SCAN TCPIP port. Default is 1521.
     *
     * @return the value
     */
    public Integer getScanListenerPortTcp() {
        return scanListenerPortTcp;
    }

    /** The SCAN TCPIP SSL port. Default is 2484. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
    private final Integer scanListenerPortTcpSsl;

    /**
     * The SCAN TCPIP SSL port. Default is 2484.
     *
     * @return the value
     */
    public Integer getScanListenerPortTcpSsl() {
        return scanListenerPortTcpSsl;
    }

    /** List of parameters for generation of the client and backup networks. */
    @com.fasterxml.jackson.annotation.JsonProperty("networks")
    private final java.util.List<InfoForNetworkGenDetails> networks;

    /**
     * List of parameters for generation of the client and backup networks.
     *
     * @return the value
     */
    public java.util.List<InfoForNetworkGenDetails> getNetworks() {
        return networks;
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
        sb.append("GenerateRecommendedNetworkDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dbServers=").append(String.valueOf(this.dbServers));
        sb.append(", scanListenerPortTcp=").append(String.valueOf(this.scanListenerPortTcp));
        sb.append(", scanListenerPortTcpSsl=").append(String.valueOf(this.scanListenerPortTcpSsl));
        sb.append(", networks=").append(String.valueOf(this.networks));
        sb.append(", dns=").append(String.valueOf(this.dns));
        sb.append(", ntp=").append(String.valueOf(this.ntp));
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
        if (!(o instanceof GenerateRecommendedNetworkDetails)) {
            return false;
        }

        GenerateRecommendedNetworkDetails other = (GenerateRecommendedNetworkDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dbServers, other.dbServers)
                && java.util.Objects.equals(this.scanListenerPortTcp, other.scanListenerPortTcp)
                && java.util.Objects.equals(
                        this.scanListenerPortTcpSsl, other.scanListenerPortTcpSsl)
                && java.util.Objects.equals(this.networks, other.networks)
                && java.util.Objects.equals(this.dns, other.dns)
                && java.util.Objects.equals(this.ntp, other.ntp)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dbServers == null ? 43 : this.dbServers.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTcp == null
                                ? 43
                                : this.scanListenerPortTcp.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTcpSsl == null
                                ? 43
                                : this.scanListenerPortTcpSsl.hashCode());
        result = (result * PRIME) + (this.networks == null ? 43 : this.networks.hashCode());
        result = (result * PRIME) + (this.dns == null ? 43 : this.dns.hashCode());
        result = (result * PRIME) + (this.ntp == null ? 43 : this.ntp.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
