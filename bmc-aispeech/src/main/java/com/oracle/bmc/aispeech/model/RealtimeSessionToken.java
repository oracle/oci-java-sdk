/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * The response from the realtime session token endpoint that creates the auth token to be used with
 * the realtime speech service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RealtimeSessionToken.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RealtimeSessionToken
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "token",
        "sessionId",
        "compartmentId",
        "freeformTags",
        "definedTags"
    })
    public RealtimeSessionToken(
            String token,
            String sessionId,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.token = token;
        this.sessionId = sessionId;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The session token (JWT) to be consumed by the websocket server. The token contains the
         * session/tenant ID, as well as the expiry time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("token")
        private String token;

        /**
         * The session token (JWT) to be consumed by the websocket server. The token contains the
         * session/tenant ID, as well as the expiry time.
         *
         * @param token the value to set
         * @return this builder
         */
        public Builder token(String token) {
            this.token = token;
            this.__explicitlySet__.add("token");
            return this;
        }
        /**
         * The session ID this token corresponds to. Provided for convenience, the session ID is
         * already present in the JWT token.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sessionId")
        private String sessionId;

        /**
         * The session ID this token corresponds to. Provided for convenience, the session ID is
         * already present in the JWT token.
         *
         * @param sessionId the value to set
         * @return this builder
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            this.__explicitlySet__.add("sessionId");
            return this;
        }
        /** Compartment ID that was used to create the token. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment ID that was used to create the token.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}.
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"},
         * "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"},
         * "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RealtimeSessionToken build() {
            RealtimeSessionToken model =
                    new RealtimeSessionToken(
                            this.token,
                            this.sessionId,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RealtimeSessionToken model) {
            if (model.wasPropertyExplicitlySet("token")) {
                this.token(model.getToken());
            }
            if (model.wasPropertyExplicitlySet("sessionId")) {
                this.sessionId(model.getSessionId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The session token (JWT) to be consumed by the websocket server. The token contains the
     * session/tenant ID, as well as the expiry time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("token")
    private final String token;

    /**
     * The session token (JWT) to be consumed by the websocket server. The token contains the
     * session/tenant ID, as well as the expiry time.
     *
     * @return the value
     */
    public String getToken() {
        return token;
    }

    /**
     * The session ID this token corresponds to. Provided for convenience, the session ID is already
     * present in the JWT token.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sessionId")
    private final String sessionId;

    /**
     * The session ID this token corresponds to. Provided for convenience, the session ID is already
     * present in the JWT token.
     *
     * @return the value
     */
    public String getSessionId() {
        return sessionId;
    }

    /** Compartment ID that was used to create the token. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment ID that was used to create the token.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"},
     * "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"},
     * "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("RealtimeSessionToken(");
        sb.append("super=").append(super.toString());
        sb.append("token=").append(String.valueOf(this.token));
        sb.append(", sessionId=").append(String.valueOf(this.sessionId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RealtimeSessionToken)) {
            return false;
        }

        RealtimeSessionToken other = (RealtimeSessionToken) o;
        return java.util.Objects.equals(this.token, other.token)
                && java.util.Objects.equals(this.sessionId, other.sessionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.token == null ? 43 : this.token.hashCode());
        result = (result * PRIME) + (this.sessionId == null ? 43 : this.sessionId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
