/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managedkafka.model;

/**
 * The data to install a KafkaClusterAddon. <br>
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
        builder = InstallPublicConnectivityAddonDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "addonType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstallPublicConnectivityAddonDetails extends InstallAddonDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Authentication mechanism. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationMechanism")
        private AuthenticationMechanism authenticationMechanism;

        /**
         * Authentication mechanism.
         *
         * @param authenticationMechanism the value to set
         * @return this builder
         */
        public Builder authenticationMechanism(AuthenticationMechanism authenticationMechanism) {
            this.authenticationMechanism = authenticationMechanism;
            this.__explicitlySet__.add("authenticationMechanism");
            return this;
        }
        /** A list of CIDR's for ingress/egress traffic. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkCidrs")
        private java.util.List<String> networkCidrs;

        /**
         * A list of CIDR's for ingress/egress traffic.
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

        public InstallPublicConnectivityAddonDetails build() {
            InstallPublicConnectivityAddonDetails model =
                    new InstallPublicConnectivityAddonDetails(
                            this.name,
                            this.description,
                            this.authenticationMechanism,
                            this.networkCidrs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallPublicConnectivityAddonDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("authenticationMechanism")) {
                this.authenticationMechanism(model.getAuthenticationMechanism());
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
    public InstallPublicConnectivityAddonDetails(
            String name,
            String description,
            AuthenticationMechanism authenticationMechanism,
            java.util.List<String> networkCidrs) {
        super(name, description);
        this.authenticationMechanism = authenticationMechanism;
        this.networkCidrs = networkCidrs;
    }

    /** Authentication mechanism. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationMechanism")
    private final AuthenticationMechanism authenticationMechanism;

    /**
     * Authentication mechanism.
     *
     * @return the value
     */
    public AuthenticationMechanism getAuthenticationMechanism() {
        return authenticationMechanism;
    }

    /** A list of CIDR's for ingress/egress traffic. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkCidrs")
    private final java.util.List<String> networkCidrs;

    /**
     * A list of CIDR's for ingress/egress traffic.
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
        sb.append("InstallPublicConnectivityAddonDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", authenticationMechanism=")
                .append(String.valueOf(this.authenticationMechanism));
        sb.append(", networkCidrs=").append(String.valueOf(this.networkCidrs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstallPublicConnectivityAddonDetails)) {
            return false;
        }

        InstallPublicConnectivityAddonDetails other = (InstallPublicConnectivityAddonDetails) o;
        return java.util.Objects.equals(this.authenticationMechanism, other.authenticationMechanism)
                && java.util.Objects.equals(this.networkCidrs, other.networkCidrs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.authenticationMechanism == null
                                ? 43
                                : this.authenticationMechanism.hashCode());
        result = (result * PRIME) + (this.networkCidrs == null ? 43 : this.networkCidrs.hashCode());
        return result;
    }
}
