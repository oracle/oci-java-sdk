/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The property that define the status of the OIDC Discovery feature for a cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OpenIdConnectDiscovery.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpenIdConnectDiscovery
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isOpenIdConnectDiscoveryEnabled"})
    public OpenIdConnectDiscovery(Boolean isOpenIdConnectDiscoveryEnabled) {
        super();
        this.isOpenIdConnectDiscoveryEnabled = isOpenIdConnectDiscoveryEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether the cluster has OIDC Discovery enabled. Defaults to false. If set to true, the
         * cluster will be assigned a public OIDC Discovery endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOpenIdConnectDiscoveryEnabled")
        private Boolean isOpenIdConnectDiscoveryEnabled;

        /**
         * Whether the cluster has OIDC Discovery enabled. Defaults to false. If set to true, the
         * cluster will be assigned a public OIDC Discovery endpoint.
         *
         * @param isOpenIdConnectDiscoveryEnabled the value to set
         * @return this builder
         */
        public Builder isOpenIdConnectDiscoveryEnabled(Boolean isOpenIdConnectDiscoveryEnabled) {
            this.isOpenIdConnectDiscoveryEnabled = isOpenIdConnectDiscoveryEnabled;
            this.__explicitlySet__.add("isOpenIdConnectDiscoveryEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpenIdConnectDiscovery build() {
            OpenIdConnectDiscovery model =
                    new OpenIdConnectDiscovery(this.isOpenIdConnectDiscoveryEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpenIdConnectDiscovery model) {
            if (model.wasPropertyExplicitlySet("isOpenIdConnectDiscoveryEnabled")) {
                this.isOpenIdConnectDiscoveryEnabled(model.getIsOpenIdConnectDiscoveryEnabled());
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
     * Whether the cluster has OIDC Discovery enabled. Defaults to false. If set to true, the
     * cluster will be assigned a public OIDC Discovery endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOpenIdConnectDiscoveryEnabled")
    private final Boolean isOpenIdConnectDiscoveryEnabled;

    /**
     * Whether the cluster has OIDC Discovery enabled. Defaults to false. If set to true, the
     * cluster will be assigned a public OIDC Discovery endpoint.
     *
     * @return the value
     */
    public Boolean getIsOpenIdConnectDiscoveryEnabled() {
        return isOpenIdConnectDiscoveryEnabled;
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
        sb.append("OpenIdConnectDiscovery(");
        sb.append("super=").append(super.toString());
        sb.append("isOpenIdConnectDiscoveryEnabled=")
                .append(String.valueOf(this.isOpenIdConnectDiscoveryEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpenIdConnectDiscovery)) {
            return false;
        }

        OpenIdConnectDiscovery other = (OpenIdConnectDiscovery) o;
        return java.util.Objects.equals(
                        this.isOpenIdConnectDiscoveryEnabled, other.isOpenIdConnectDiscoveryEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isOpenIdConnectDiscoveryEnabled == null
                                ? 43
                                : this.isOpenIdConnectDiscoveryEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
