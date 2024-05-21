/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Backend which when called triggers OAuth2 logout.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OAuth2LogoutBackend.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OAuth2LogoutBackend extends ApiSpecificationRouteBackend {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("allowedPostLogoutUris")
        private java.util.List<String> allowedPostLogoutUris;

        public Builder allowedPostLogoutUris(java.util.List<String> allowedPostLogoutUris) {
            this.allowedPostLogoutUris = allowedPostLogoutUris;
            this.__explicitlySet__.add("allowedPostLogoutUris");
            return this;
        }
        /**
         * Defines a state that should be shared on redirecting to postLogout URL.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("postLogoutState")
        private String postLogoutState;

        /**
         * Defines a state that should be shared on redirecting to postLogout URL.
         *
         * @param postLogoutState the value to set
         * @return this builder
         **/
        public Builder postLogoutState(String postLogoutState) {
            this.postLogoutState = postLogoutState;
            this.__explicitlySet__.add("postLogoutState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OAuth2LogoutBackend build() {
            OAuth2LogoutBackend model =
                    new OAuth2LogoutBackend(this.allowedPostLogoutUris, this.postLogoutState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OAuth2LogoutBackend model) {
            if (model.wasPropertyExplicitlySet("allowedPostLogoutUris")) {
                this.allowedPostLogoutUris(model.getAllowedPostLogoutUris());
            }
            if (model.wasPropertyExplicitlySet("postLogoutState")) {
                this.postLogoutState(model.getPostLogoutState());
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

    @Deprecated
    public OAuth2LogoutBackend(
            java.util.List<String> allowedPostLogoutUris, String postLogoutState) {
        super();
        this.allowedPostLogoutUris = allowedPostLogoutUris;
        this.postLogoutState = postLogoutState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("allowedPostLogoutUris")
    private final java.util.List<String> allowedPostLogoutUris;

    public java.util.List<String> getAllowedPostLogoutUris() {
        return allowedPostLogoutUris;
    }

    /**
     * Defines a state that should be shared on redirecting to postLogout URL.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("postLogoutState")
    private final String postLogoutState;

    /**
     * Defines a state that should be shared on redirecting to postLogout URL.
     *
     * @return the value
     **/
    public String getPostLogoutState() {
        return postLogoutState;
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
        sb.append("OAuth2LogoutBackend(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", allowedPostLogoutUris=").append(String.valueOf(this.allowedPostLogoutUris));
        sb.append(", postLogoutState=").append(String.valueOf(this.postLogoutState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OAuth2LogoutBackend)) {
            return false;
        }

        OAuth2LogoutBackend other = (OAuth2LogoutBackend) o;
        return java.util.Objects.equals(this.allowedPostLogoutUris, other.allowedPostLogoutUris)
                && java.util.Objects.equals(this.postLogoutState, other.postLogoutState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.allowedPostLogoutUris == null
                                ? 43
                                : this.allowedPostLogoutUris.hashCode());
        result =
                (result * PRIME)
                        + (this.postLogoutState == null ? 43 : this.postLogoutState.hashCode());
        return result;
    }
}
