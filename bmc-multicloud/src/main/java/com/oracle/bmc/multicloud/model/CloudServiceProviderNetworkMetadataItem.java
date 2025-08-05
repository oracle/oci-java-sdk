/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * Cloud Service Provider metadata item. Warning - In future this object can change to generic
 * object with future Cloud Service Provider based on CloudServiceProvider field. This can be one of
 * CSP provider type Azure, GCP and AWS <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CloudServiceProviderNetworkMetadataItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CloudServiceProviderNetworkMetadataItem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "region",
        "odbNetworkId",
        "cidrBlocks",
        "networkAnchorUri",
        "dnsForwardingConfig"
    })
    public CloudServiceProviderNetworkMetadataItem(
            String region,
            String odbNetworkId,
            java.util.List<String> cidrBlocks,
            String networkAnchorUri,
            java.util.List<java.util.Map<String, String>> dnsForwardingConfig) {
        super();
        this.region = region;
        this.odbNetworkId = odbNetworkId;
        this.cidrBlocks = cidrBlocks;
        this.networkAnchorUri = networkAnchorUri;
        this.dnsForwardingConfig = dnsForwardingConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Azure/GCP/AWS region */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Azure/GCP/AWS region
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** CSP oracle database network anchor unique ID/name */
        @com.fasterxml.jackson.annotation.JsonProperty("odbNetworkId")
        private String odbNetworkId;

        /**
         * CSP oracle database network anchor unique ID/name
         *
         * @param odbNetworkId the value to set
         * @return this builder
         */
        public Builder odbNetworkId(String odbNetworkId) {
            this.odbNetworkId = odbNetworkId;
            this.__explicitlySet__.add("odbNetworkId");
            return this;
        }
        /** An Azure/GCP/AWS cidrBlocks */
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
        private java.util.List<String> cidrBlocks;

        /**
         * An Azure/GCP/AWS cidrBlocks
         *
         * @param cidrBlocks the value to set
         * @return this builder
         */
        public Builder cidrBlocks(java.util.List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            this.__explicitlySet__.add("cidrBlocks");
            return this;
        }
        /** CSP network anchor Uri */
        @com.fasterxml.jackson.annotation.JsonProperty("networkAnchorUri")
        private String networkAnchorUri;

        /**
         * CSP network anchor Uri
         *
         * @param networkAnchorUri the value to set
         * @return this builder
         */
        public Builder networkAnchorUri(String networkAnchorUri) {
            this.networkAnchorUri = networkAnchorUri;
            this.__explicitlySet__.add("networkAnchorUri");
            return this;
        }
        /** DNS domain ip mapping forwarding configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsForwardingConfig")
        private java.util.List<java.util.Map<String, String>> dnsForwardingConfig;

        /**
         * DNS domain ip mapping forwarding configuration
         *
         * @param dnsForwardingConfig the value to set
         * @return this builder
         */
        public Builder dnsForwardingConfig(
                java.util.List<java.util.Map<String, String>> dnsForwardingConfig) {
            this.dnsForwardingConfig = dnsForwardingConfig;
            this.__explicitlySet__.add("dnsForwardingConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudServiceProviderNetworkMetadataItem build() {
            CloudServiceProviderNetworkMetadataItem model =
                    new CloudServiceProviderNetworkMetadataItem(
                            this.region,
                            this.odbNetworkId,
                            this.cidrBlocks,
                            this.networkAnchorUri,
                            this.dnsForwardingConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudServiceProviderNetworkMetadataItem model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("odbNetworkId")) {
                this.odbNetworkId(model.getOdbNetworkId());
            }
            if (model.wasPropertyExplicitlySet("cidrBlocks")) {
                this.cidrBlocks(model.getCidrBlocks());
            }
            if (model.wasPropertyExplicitlySet("networkAnchorUri")) {
                this.networkAnchorUri(model.getNetworkAnchorUri());
            }
            if (model.wasPropertyExplicitlySet("dnsForwardingConfig")) {
                this.dnsForwardingConfig(model.getDnsForwardingConfig());
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

    /** Azure/GCP/AWS region */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Azure/GCP/AWS region
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** CSP oracle database network anchor unique ID/name */
    @com.fasterxml.jackson.annotation.JsonProperty("odbNetworkId")
    private final String odbNetworkId;

    /**
     * CSP oracle database network anchor unique ID/name
     *
     * @return the value
     */
    public String getOdbNetworkId() {
        return odbNetworkId;
    }

    /** An Azure/GCP/AWS cidrBlocks */
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
    private final java.util.List<String> cidrBlocks;

    /**
     * An Azure/GCP/AWS cidrBlocks
     *
     * @return the value
     */
    public java.util.List<String> getCidrBlocks() {
        return cidrBlocks;
    }

    /** CSP network anchor Uri */
    @com.fasterxml.jackson.annotation.JsonProperty("networkAnchorUri")
    private final String networkAnchorUri;

    /**
     * CSP network anchor Uri
     *
     * @return the value
     */
    public String getNetworkAnchorUri() {
        return networkAnchorUri;
    }

    /** DNS domain ip mapping forwarding configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsForwardingConfig")
    private final java.util.List<java.util.Map<String, String>> dnsForwardingConfig;

    /**
     * DNS domain ip mapping forwarding configuration
     *
     * @return the value
     */
    public java.util.List<java.util.Map<String, String>> getDnsForwardingConfig() {
        return dnsForwardingConfig;
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
        sb.append("CloudServiceProviderNetworkMetadataItem(");
        sb.append("super=").append(super.toString());
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", odbNetworkId=").append(String.valueOf(this.odbNetworkId));
        sb.append(", cidrBlocks=").append(String.valueOf(this.cidrBlocks));
        sb.append(", networkAnchorUri=").append(String.valueOf(this.networkAnchorUri));
        sb.append(", dnsForwardingConfig=").append(String.valueOf(this.dnsForwardingConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudServiceProviderNetworkMetadataItem)) {
            return false;
        }

        CloudServiceProviderNetworkMetadataItem other = (CloudServiceProviderNetworkMetadataItem) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.odbNetworkId, other.odbNetworkId)
                && java.util.Objects.equals(this.cidrBlocks, other.cidrBlocks)
                && java.util.Objects.equals(this.networkAnchorUri, other.networkAnchorUri)
                && java.util.Objects.equals(this.dnsForwardingConfig, other.dnsForwardingConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.odbNetworkId == null ? 43 : this.odbNetworkId.hashCode());
        result = (result * PRIME) + (this.cidrBlocks == null ? 43 : this.cidrBlocks.hashCode());
        result =
                (result * PRIME)
                        + (this.networkAnchorUri == null ? 43 : this.networkAnchorUri.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsForwardingConfig == null
                                ? 43
                                : this.dnsForwardingConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
