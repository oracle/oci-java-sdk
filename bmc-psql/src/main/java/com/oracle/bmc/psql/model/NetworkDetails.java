/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Network details for the database system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subnetId",
        "primaryDbEndpointPrivateIp",
        "nsgIds",
        "isReaderEndpointEnabled"
    })
    public NetworkDetails(
            String subnetId,
            String primaryDbEndpointPrivateIp,
            java.util.List<String> nsgIds,
            Boolean isReaderEndpointEnabled) {
        super();
        this.subnetId = subnetId;
        this.primaryDbEndpointPrivateIp = primaryDbEndpointPrivateIp;
        this.nsgIds = nsgIds;
        this.isReaderEndpointEnabled = isReaderEndpointEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * customer subnet associated with the database system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * customer subnet associated with the database system.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * Private IP in customer subnet. The value is optional. If the IP is not provided, the IP
         * will be chosen from the available IP addresses from the specified subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryDbEndpointPrivateIp")
        private String primaryDbEndpointPrivateIp;

        /**
         * Private IP in customer subnet. The value is optional. If the IP is not provided, the IP
         * will be chosen from the available IP addresses from the specified subnet.
         *
         * @param primaryDbEndpointPrivateIp the value to set
         * @return this builder
         */
        public Builder primaryDbEndpointPrivateIp(String primaryDbEndpointPrivateIp) {
            this.primaryDbEndpointPrivateIp = primaryDbEndpointPrivateIp;
            this.__explicitlySet__.add("primaryDbEndpointPrivateIp");
            return this;
        }
        /**
         * List of customer Network Security Group
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * associated with the database system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * List of customer Network Security Group
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * associated with the database system.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /** Specifies if the reader endpoint is enabled on the dbSystem. */
        @com.fasterxml.jackson.annotation.JsonProperty("isReaderEndpointEnabled")
        private Boolean isReaderEndpointEnabled;

        /**
         * Specifies if the reader endpoint is enabled on the dbSystem.
         *
         * @param isReaderEndpointEnabled the value to set
         * @return this builder
         */
        public Builder isReaderEndpointEnabled(Boolean isReaderEndpointEnabled) {
            this.isReaderEndpointEnabled = isReaderEndpointEnabled;
            this.__explicitlySet__.add("isReaderEndpointEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkDetails build() {
            NetworkDetails model =
                    new NetworkDetails(
                            this.subnetId,
                            this.primaryDbEndpointPrivateIp,
                            this.nsgIds,
                            this.isReaderEndpointEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkDetails model) {
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("primaryDbEndpointPrivateIp")) {
                this.primaryDbEndpointPrivateIp(model.getPrimaryDbEndpointPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("isReaderEndpointEnabled")) {
                this.isReaderEndpointEnabled(model.getIsReaderEndpointEnabled());
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
     * customer subnet associated with the database system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * customer subnet associated with the database system.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * Private IP in customer subnet. The value is optional. If the IP is not provided, the IP will
     * be chosen from the available IP addresses from the specified subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryDbEndpointPrivateIp")
    private final String primaryDbEndpointPrivateIp;

    /**
     * Private IP in customer subnet. The value is optional. If the IP is not provided, the IP will
     * be chosen from the available IP addresses from the specified subnet.
     *
     * @return the value
     */
    public String getPrimaryDbEndpointPrivateIp() {
        return primaryDbEndpointPrivateIp;
    }

    /**
     * List of customer Network Security Group
     * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated
     * with the database system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * List of customer Network Security Group
     * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated
     * with the database system.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /** Specifies if the reader endpoint is enabled on the dbSystem. */
    @com.fasterxml.jackson.annotation.JsonProperty("isReaderEndpointEnabled")
    private final Boolean isReaderEndpointEnabled;

    /**
     * Specifies if the reader endpoint is enabled on the dbSystem.
     *
     * @return the value
     */
    public Boolean getIsReaderEndpointEnabled() {
        return isReaderEndpointEnabled;
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
        sb.append("NetworkDetails(");
        sb.append("super=").append(super.toString());
        sb.append("subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", primaryDbEndpointPrivateIp=")
                .append(String.valueOf(this.primaryDbEndpointPrivateIp));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", isReaderEndpointEnabled=")
                .append(String.valueOf(this.isReaderEndpointEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkDetails)) {
            return false;
        }

        NetworkDetails other = (NetworkDetails) o;
        return java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.primaryDbEndpointPrivateIp, other.primaryDbEndpointPrivateIp)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(
                        this.isReaderEndpointEnabled, other.isReaderEndpointEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryDbEndpointPrivateIp == null
                                ? 43
                                : this.primaryDbEndpointPrivateIp.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.isReaderEndpointEnabled == null
                                ? 43
                                : this.isReaderEndpointEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
