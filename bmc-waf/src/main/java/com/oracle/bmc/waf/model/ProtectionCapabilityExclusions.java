/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Identifies specific HTTP message parameters to exclude from inspection by a protection
 * capability. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProtectionCapabilityExclusions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProtectionCapabilityExclusions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"requestCookies", "args"})
    public ProtectionCapabilityExclusions(
            java.util.List<String> requestCookies, java.util.List<String> args) {
        super();
        this.requestCookies = requestCookies;
        this.args = args;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of HTTP request cookie values (by cookie name) to exclude from inspecting. Example:
         * If we have cookie 'cookieName=cookieValue' and requestCookies=['cookieName'], both
         * 'cookieName' and 'cookieValue' will not be inspected.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestCookies")
        private java.util.List<String> requestCookies;

        /**
         * List of HTTP request cookie values (by cookie name) to exclude from inspecting. Example:
         * If we have cookie 'cookieName=cookieValue' and requestCookies=['cookieName'], both
         * 'cookieName' and 'cookieValue' will not be inspected.
         *
         * @param requestCookies the value to set
         * @return this builder
         */
        public Builder requestCookies(java.util.List<String> requestCookies) {
            this.requestCookies = requestCookies;
            this.__explicitlySet__.add("requestCookies");
            return this;
        }
        /**
         * List of URL query parameter values from form-urlencoded XML, JSON, AMP, or POST payloads
         * to exclude from inspecting. Example: If we have query parameter
         * 'argumentName=argumentValue' and args=['argumentName'], both 'argumentName' and
         * 'argumentValue' will not be inspected.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("args")
        private java.util.List<String> args;

        /**
         * List of URL query parameter values from form-urlencoded XML, JSON, AMP, or POST payloads
         * to exclude from inspecting. Example: If we have query parameter
         * 'argumentName=argumentValue' and args=['argumentName'], both 'argumentName' and
         * 'argumentValue' will not be inspected.
         *
         * @param args the value to set
         * @return this builder
         */
        public Builder args(java.util.List<String> args) {
            this.args = args;
            this.__explicitlySet__.add("args");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionCapabilityExclusions build() {
            ProtectionCapabilityExclusions model =
                    new ProtectionCapabilityExclusions(this.requestCookies, this.args);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionCapabilityExclusions model) {
            if (model.wasPropertyExplicitlySet("requestCookies")) {
                this.requestCookies(model.getRequestCookies());
            }
            if (model.wasPropertyExplicitlySet("args")) {
                this.args(model.getArgs());
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
     * List of HTTP request cookie values (by cookie name) to exclude from inspecting. Example: If
     * we have cookie 'cookieName=cookieValue' and requestCookies=['cookieName'], both 'cookieName'
     * and 'cookieValue' will not be inspected.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestCookies")
    private final java.util.List<String> requestCookies;

    /**
     * List of HTTP request cookie values (by cookie name) to exclude from inspecting. Example: If
     * we have cookie 'cookieName=cookieValue' and requestCookies=['cookieName'], both 'cookieName'
     * and 'cookieValue' will not be inspected.
     *
     * @return the value
     */
    public java.util.List<String> getRequestCookies() {
        return requestCookies;
    }

    /**
     * List of URL query parameter values from form-urlencoded XML, JSON, AMP, or POST payloads to
     * exclude from inspecting. Example: If we have query parameter 'argumentName=argumentValue' and
     * args=['argumentName'], both 'argumentName' and 'argumentValue' will not be inspected.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("args")
    private final java.util.List<String> args;

    /**
     * List of URL query parameter values from form-urlencoded XML, JSON, AMP, or POST payloads to
     * exclude from inspecting. Example: If we have query parameter 'argumentName=argumentValue' and
     * args=['argumentName'], both 'argumentName' and 'argumentValue' will not be inspected.
     *
     * @return the value
     */
    public java.util.List<String> getArgs() {
        return args;
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
        sb.append("ProtectionCapabilityExclusions(");
        sb.append("super=").append(super.toString());
        sb.append("requestCookies=").append(String.valueOf(this.requestCookies));
        sb.append(", args=").append(String.valueOf(this.args));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProtectionCapabilityExclusions)) {
            return false;
        }

        ProtectionCapabilityExclusions other = (ProtectionCapabilityExclusions) o;
        return java.util.Objects.equals(this.requestCookies, other.requestCookies)
                && java.util.Objects.equals(this.args, other.args)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.requestCookies == null ? 43 : this.requestCookies.hashCode());
        result = (result * PRIME) + (this.args == null ? 43 : this.args.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
