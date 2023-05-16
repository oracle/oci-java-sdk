/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Policy on how to authenticate requests when multiple authentication options are configured for a
 * deployment. For an incoming request, the value of selector specified under selectionSource will
 * be matched against the keys specified for each authentication server. The authentication server
 * whose key matches the value of selector will be used for authentication. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DynamicAuthenticationPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DynamicAuthenticationPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"selectionSource", "authenticationServers"})
    public DynamicAuthenticationPolicy(
            SelectionSourcePolicy selectionSource,
            java.util.List<AuthenticationServerPolicy> authenticationServers) {
        super();
        this.selectionSource = selectionSource;
        this.authenticationServers = authenticationServers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("selectionSource")
        private SelectionSourcePolicy selectionSource;

        public Builder selectionSource(SelectionSourcePolicy selectionSource) {
            this.selectionSource = selectionSource;
            this.__explicitlySet__.add("selectionSource");
            return this;
        }
        /** List of authentication servers to choose from during dynamic authentication. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationServers")
        private java.util.List<AuthenticationServerPolicy> authenticationServers;

        /**
         * List of authentication servers to choose from during dynamic authentication.
         *
         * @param authenticationServers the value to set
         * @return this builder
         */
        public Builder authenticationServers(
                java.util.List<AuthenticationServerPolicy> authenticationServers) {
            this.authenticationServers = authenticationServers;
            this.__explicitlySet__.add("authenticationServers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DynamicAuthenticationPolicy build() {
            DynamicAuthenticationPolicy model =
                    new DynamicAuthenticationPolicy(
                            this.selectionSource, this.authenticationServers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DynamicAuthenticationPolicy model) {
            if (model.wasPropertyExplicitlySet("selectionSource")) {
                this.selectionSource(model.getSelectionSource());
            }
            if (model.wasPropertyExplicitlySet("authenticationServers")) {
                this.authenticationServers(model.getAuthenticationServers());
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

    @com.fasterxml.jackson.annotation.JsonProperty("selectionSource")
    private final SelectionSourcePolicy selectionSource;

    public SelectionSourcePolicy getSelectionSource() {
        return selectionSource;
    }

    /** List of authentication servers to choose from during dynamic authentication. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationServers")
    private final java.util.List<AuthenticationServerPolicy> authenticationServers;

    /**
     * List of authentication servers to choose from during dynamic authentication.
     *
     * @return the value
     */
    public java.util.List<AuthenticationServerPolicy> getAuthenticationServers() {
        return authenticationServers;
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
        sb.append("DynamicAuthenticationPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("selectionSource=").append(String.valueOf(this.selectionSource));
        sb.append(", authenticationServers=").append(String.valueOf(this.authenticationServers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DynamicAuthenticationPolicy)) {
            return false;
        }

        DynamicAuthenticationPolicy other = (DynamicAuthenticationPolicy) o;
        return java.util.Objects.equals(this.selectionSource, other.selectionSource)
                && java.util.Objects.equals(this.authenticationServers, other.authenticationServers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.selectionSource == null ? 43 : this.selectionSource.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationServers == null
                                ? 43
                                : this.authenticationServers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
