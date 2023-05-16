/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * Network policy, which consists of a list of network source IDs. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NetworkPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkPolicy extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"networkSourceIds"})
    public NetworkPolicy(java.util.List<String> networkSourceIds) {
        super();
        this.networkSourceIds = networkSourceIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Network Source ids */
        @com.fasterxml.jackson.annotation.JsonProperty("networkSourceIds")
        private java.util.List<String> networkSourceIds;

        /**
         * Network Source ids
         *
         * @param networkSourceIds the value to set
         * @return this builder
         */
        public Builder networkSourceIds(java.util.List<String> networkSourceIds) {
            this.networkSourceIds = networkSourceIds;
            this.__explicitlySet__.add("networkSourceIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkPolicy build() {
            NetworkPolicy model = new NetworkPolicy(this.networkSourceIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkPolicy model) {
            if (model.wasPropertyExplicitlySet("networkSourceIds")) {
                this.networkSourceIds(model.getNetworkSourceIds());
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

    /** Network Source ids */
    @com.fasterxml.jackson.annotation.JsonProperty("networkSourceIds")
    private final java.util.List<String> networkSourceIds;

    /**
     * Network Source ids
     *
     * @return the value
     */
    public java.util.List<String> getNetworkSourceIds() {
        return networkSourceIds;
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
        sb.append("NetworkPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("networkSourceIds=").append(String.valueOf(this.networkSourceIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkPolicy)) {
            return false;
        }

        NetworkPolicy other = (NetworkPolicy) o;
        return java.util.Objects.equals(this.networkSourceIds, other.networkSourceIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.networkSourceIds == null ? 43 : this.networkSourceIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
