/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * A network configuration defines the required network characteristics for an ADM remediation
 * recipe. A network configuration is required if the build service is one of: GitHub Actions,
 * GitLab Pipeline, or Jenkins Pipeline. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NetworkConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"subnetId", "nsgIds"})
    public NetworkConfiguration(String subnetId, java.util.List<String> nsgIds) {
        super();
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * subnet.
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
         * The list of Oracle Cloud Identifiers
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm))
         * corresponding to Network Security Groups.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The list of Oracle Cloud Identifiers
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm))
         * corresponding to Network Security Groups.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkConfiguration build() {
            NetworkConfiguration model = new NetworkConfiguration(this.subnetId, this.nsgIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkConfiguration model) {
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
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
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * subnet.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The list of Oracle Cloud Identifiers
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm))
     * corresponding to Network Security Groups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of Oracle Cloud Identifiers
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm))
     * corresponding to Network Security Groups.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
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
        sb.append("NetworkConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkConfiguration)) {
            return false;
        }

        NetworkConfiguration other = (NetworkConfiguration) o;
        return java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
