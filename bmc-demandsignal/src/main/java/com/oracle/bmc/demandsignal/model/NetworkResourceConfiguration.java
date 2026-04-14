/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal.model;

/**
 * Configuration for NETWORK <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NetworkResourceConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "resource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkResourceConfiguration extends BaseResourceConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of usage for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageType")
        private String usageType;

        /**
         * The type of usage for the resource.
         *
         * @param usageType the value to set
         * @return this builder
         */
        public Builder usageType(String usageType) {
            this.usageType = usageType;
            this.__explicitlySet__.add("usageType");
            return this;
        }
        /** The provider of the network service. */
        @com.fasterxml.jackson.annotation.JsonProperty("provider")
        private String provider;

        /**
         * The provider of the network service.
         *
         * @param provider the value to set
         * @return this builder
         */
        public Builder provider(String provider) {
            this.provider = provider;
            this.__explicitlySet__.add("provider");
            return this;
        }
        /** The role of the link in the network. */
        @com.fasterxml.jackson.annotation.JsonProperty("linkRole")
        private String linkRole;

        /**
         * The role of the link in the network.
         *
         * @param linkRole the value to set
         * @return this builder
         */
        public Builder linkRole(String linkRole) {
            this.linkRole = linkRole;
            this.__explicitlySet__.add("linkRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkResourceConfiguration build() {
            NetworkResourceConfiguration model =
                    new NetworkResourceConfiguration(this.usageType, this.provider, this.linkRole);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkResourceConfiguration model) {
            if (model.wasPropertyExplicitlySet("usageType")) {
                this.usageType(model.getUsageType());
            }
            if (model.wasPropertyExplicitlySet("provider")) {
                this.provider(model.getProvider());
            }
            if (model.wasPropertyExplicitlySet("linkRole")) {
                this.linkRole(model.getLinkRole());
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
    public NetworkResourceConfiguration(String usageType, String provider, String linkRole) {
        super();
        this.usageType = usageType;
        this.provider = provider;
        this.linkRole = linkRole;
    }

    /** The type of usage for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageType")
    private final String usageType;

    /**
     * The type of usage for the resource.
     *
     * @return the value
     */
    public String getUsageType() {
        return usageType;
    }

    /** The provider of the network service. */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    private final String provider;

    /**
     * The provider of the network service.
     *
     * @return the value
     */
    public String getProvider() {
        return provider;
    }

    /** The role of the link in the network. */
    @com.fasterxml.jackson.annotation.JsonProperty("linkRole")
    private final String linkRole;

    /**
     * The role of the link in the network.
     *
     * @return the value
     */
    public String getLinkRole() {
        return linkRole;
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
        sb.append("NetworkResourceConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", usageType=").append(String.valueOf(this.usageType));
        sb.append(", provider=").append(String.valueOf(this.provider));
        sb.append(", linkRole=").append(String.valueOf(this.linkRole));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkResourceConfiguration)) {
            return false;
        }

        NetworkResourceConfiguration other = (NetworkResourceConfiguration) o;
        return java.util.Objects.equals(this.usageType, other.usageType)
                && java.util.Objects.equals(this.provider, other.provider)
                && java.util.Objects.equals(this.linkRole, other.linkRole)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.usageType == null ? 43 : this.usageType.hashCode());
        result = (result * PRIME) + (this.provider == null ? 43 : this.provider.hashCode());
        result = (result * PRIME) + (this.linkRole == null ? 43 : this.linkRole.hashCode());
        return result;
    }
}
