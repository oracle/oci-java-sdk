/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Policy for the details regarding each authentication server under dynamic authentication. We
 * specify the value of selectors for which this authentication server must be selected for a
 * request under keys. We specify the configuration details of authentication server under
 * authenticationServerDetail. <br>
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
        builder = AuthenticationServerPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuthenticationServerPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "authenticationServerDetail"})
    public AuthenticationServerPolicy(
            DynamicSelectionKey key, AuthenticationPolicy authenticationServerDetail) {
        super();
        this.key = key;
        this.authenticationServerDetail = authenticationServerDetail;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private DynamicSelectionKey key;

        public Builder key(DynamicSelectionKey key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authenticationServerDetail")
        private AuthenticationPolicy authenticationServerDetail;

        public Builder authenticationServerDetail(AuthenticationPolicy authenticationServerDetail) {
            this.authenticationServerDetail = authenticationServerDetail;
            this.__explicitlySet__.add("authenticationServerDetail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationServerPolicy build() {
            AuthenticationServerPolicy model =
                    new AuthenticationServerPolicy(this.key, this.authenticationServerDetail);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationServerPolicy model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("authenticationServerDetail")) {
                this.authenticationServerDetail(model.getAuthenticationServerDetail());
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

    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final DynamicSelectionKey key;

    public DynamicSelectionKey getKey() {
        return key;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("authenticationServerDetail")
    private final AuthenticationPolicy authenticationServerDetail;

    public AuthenticationPolicy getAuthenticationServerDetail() {
        return authenticationServerDetail;
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
        sb.append("AuthenticationServerPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", authenticationServerDetail=")
                .append(String.valueOf(this.authenticationServerDetail));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationServerPolicy)) {
            return false;
        }

        AuthenticationServerPolicy other = (AuthenticationServerPolicy) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(
                        this.authenticationServerDetail, other.authenticationServerDetail)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationServerDetail == null
                                ? 43
                                : this.authenticationServerDetail.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
