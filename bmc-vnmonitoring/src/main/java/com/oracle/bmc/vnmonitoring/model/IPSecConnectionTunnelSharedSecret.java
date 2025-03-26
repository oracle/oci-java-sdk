/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * The tunnel's shared secret (pre-shared key).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IPSecConnectionTunnelSharedSecret.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IPSecConnectionTunnelSharedSecret
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sharedSecret"})
    public IPSecConnectionTunnelSharedSecret(String sharedSecret) {
        super();
        this.sharedSecret = sharedSecret;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The tunnel's shared secret (pre-shared key).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sharedSecret")
        private String sharedSecret;

        /**
         * The tunnel's shared secret (pre-shared key).
         *
         * @param sharedSecret the value to set
         * @return this builder
         **/
        public Builder sharedSecret(String sharedSecret) {
            this.sharedSecret = sharedSecret;
            this.__explicitlySet__.add("sharedSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IPSecConnectionTunnelSharedSecret build() {
            IPSecConnectionTunnelSharedSecret model =
                    new IPSecConnectionTunnelSharedSecret(this.sharedSecret);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IPSecConnectionTunnelSharedSecret model) {
            if (model.wasPropertyExplicitlySet("sharedSecret")) {
                this.sharedSecret(model.getSharedSecret());
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

    /**
     * The tunnel's shared secret (pre-shared key).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharedSecret")
    private final String sharedSecret;

    /**
     * The tunnel's shared secret (pre-shared key).
     *
     * @return the value
     **/
    public String getSharedSecret() {
        return sharedSecret;
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
        sb.append("IPSecConnectionTunnelSharedSecret(");
        sb.append("super=").append(super.toString());
        sb.append("sharedSecret=").append(String.valueOf(this.sharedSecret));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IPSecConnectionTunnelSharedSecret)) {
            return false;
        }

        IPSecConnectionTunnelSharedSecret other = (IPSecConnectionTunnelSharedSecret) o;
        return java.util.Objects.equals(this.sharedSecret, other.sharedSecret)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sharedSecret == null ? 43 : this.sharedSecret.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
