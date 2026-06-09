/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managedkafka.model;

/**
 * The data to update a KafkaClusterAddon. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdatePublicConnectivityAddonDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "addonType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatePublicConnectivityAddonDetails extends UpdateAddonDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** A list of CIDR ranges for ingress/egress traffic. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkCidrs")
        private java.util.List<String> networkCidrs;

        /**
         * A list of CIDR ranges for ingress/egress traffic.
         *
         * @param networkCidrs the value to set
         * @return this builder
         */
        public Builder networkCidrs(java.util.List<String> networkCidrs) {
            this.networkCidrs = networkCidrs;
            this.__explicitlySet__.add("networkCidrs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePublicConnectivityAddonDetails build() {
            UpdatePublicConnectivityAddonDetails model =
                    new UpdatePublicConnectivityAddonDetails(this.description, this.networkCidrs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePublicConnectivityAddonDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("networkCidrs")) {
                this.networkCidrs(model.getNetworkCidrs());
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

    @Deprecated
    public UpdatePublicConnectivityAddonDetails(
            String description, java.util.List<String> networkCidrs) {
        super(description);
        this.networkCidrs = networkCidrs;
    }

    /** A list of CIDR ranges for ingress/egress traffic. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkCidrs")
    private final java.util.List<String> networkCidrs;

    /**
     * A list of CIDR ranges for ingress/egress traffic.
     *
     * @return the value
     */
    public java.util.List<String> getNetworkCidrs() {
        return networkCidrs;
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
        sb.append("UpdatePublicConnectivityAddonDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", networkCidrs=").append(String.valueOf(this.networkCidrs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePublicConnectivityAddonDetails)) {
            return false;
        }

        UpdatePublicConnectivityAddonDetails other = (UpdatePublicConnectivityAddonDetails) o;
        return java.util.Objects.equals(this.networkCidrs, other.networkCidrs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.networkCidrs == null ? 43 : this.networkCidrs.hashCode());
        return result;
    }
}
