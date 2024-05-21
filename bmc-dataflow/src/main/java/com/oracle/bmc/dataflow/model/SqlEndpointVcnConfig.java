/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * The VCN configuration for VCN network type selection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlEndpointVcnConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "networkType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlEndpointVcnConfig extends SqlEndpointNetworkConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The VCN OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The VCN OCID.
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The VCN Subnet OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The VCN Subnet OCID.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The host name prefix.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostNamePrefix")
        private String hostNamePrefix;

        /**
         * The host name prefix.
         * @param hostNamePrefix the value to set
         * @return this builder
         **/
        public Builder hostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            this.__explicitlySet__.add("hostNamePrefix");
            return this;
        }
        /**
         * The OCIDs of Network Security Groups (NSGs).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The OCIDs of Network Security Groups (NSGs).
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * Ip Address of private endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
        private String privateEndpointIp;

        /**
         * Ip Address of private endpoint
         * @param privateEndpointIp the value to set
         * @return this builder
         **/
        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = privateEndpointIp;
            this.__explicitlySet__.add("privateEndpointIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlEndpointVcnConfig build() {
            SqlEndpointVcnConfig model =
                    new SqlEndpointVcnConfig(
                            this.vcnId,
                            this.subnetId,
                            this.hostNamePrefix,
                            this.nsgIds,
                            this.privateEndpointIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlEndpointVcnConfig model) {
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("hostNamePrefix")) {
                this.hostNamePrefix(model.getHostNamePrefix());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIp")) {
                this.privateEndpointIp(model.getPrivateEndpointIp());
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

    @Deprecated
    public SqlEndpointVcnConfig(
            String vcnId,
            String subnetId,
            String hostNamePrefix,
            java.util.List<String> nsgIds,
            String privateEndpointIp) {
        super();
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.hostNamePrefix = hostNamePrefix;
        this.nsgIds = nsgIds;
        this.privateEndpointIp = privateEndpointIp;
    }

    /**
     * The VCN OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The VCN OCID.
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The VCN Subnet OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The VCN Subnet OCID.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The host name prefix.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostNamePrefix")
    private final String hostNamePrefix;

    /**
     * The host name prefix.
     * @return the value
     **/
    public String getHostNamePrefix() {
        return hostNamePrefix;
    }

    /**
     * The OCIDs of Network Security Groups (NSGs).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The OCIDs of Network Security Groups (NSGs).
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * Ip Address of private endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
    private final String privateEndpointIp;

    /**
     * Ip Address of private endpoint
     * @return the value
     **/
    public String getPrivateEndpointIp() {
        return privateEndpointIp;
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
        sb.append("SqlEndpointVcnConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", hostNamePrefix=").append(String.valueOf(this.hostNamePrefix));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlEndpointVcnConfig)) {
            return false;
        }

        SqlEndpointVcnConfig other = (SqlEndpointVcnConfig) o;
        return java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.hostNamePrefix, other.hostNamePrefix)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.hostNamePrefix == null ? 43 : this.hostNamePrefix.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        return result;
    }
}
