/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * An HTTP_HEADER rule that binds one exact HTTPS host on port 443 to exactly one injected HTTP
 * request header and one OCI Vault secret. Redirects to another host do not carry the credential.
 * Only properties defined for this rule type are supported. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SandboxHttpHeaderCredentialInjectionRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "ruleType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxHttpHeaderCredentialInjectionRule extends SandboxCredentialInjectionRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The normalized ASCII DNS hostname that selects the rule. This value must be the exact
         * regional Generative AI Responses endpoint hostname for the Project's region and realm. Do
         * not include a scheme, path, port, wildcard, trailing dot, or IP literal. Brokerage uses
         * HTTPS on port 443.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The normalized ASCII DNS hostname that selects the rule. This value must be the exact
         * regional Generative AI Responses endpoint hostname for the Project's region and realm. Do
         * not include a scheme, path, port, wildcard, trailing dot, or IP literal. Brokerage uses
         * HTTPS on port 443.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** The single HTTP request header that the service replaces with the credential value. */
        @com.fasterxml.jackson.annotation.JsonProperty("injectHeaders")
        private java.util.List<SandboxCredentialInjectionHeader> injectHeaders;

        /**
         * The single HTTP request header that the service replaces with the credential value.
         *
         * @param injectHeaders the value to set
         * @return this builder
         */
        public Builder injectHeaders(
                java.util.List<SandboxCredentialInjectionHeader> injectHeaders) {
            this.injectHeaders = injectHeaders;
            this.__explicitlySet__.add("injectHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxHttpHeaderCredentialInjectionRule build() {
            SandboxHttpHeaderCredentialInjectionRule model =
                    new SandboxHttpHeaderCredentialInjectionRule(this.host, this.injectHeaders);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxHttpHeaderCredentialInjectionRule model) {
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("injectHeaders")) {
                this.injectHeaders(model.getInjectHeaders());
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
    public SandboxHttpHeaderCredentialInjectionRule(
            String host, java.util.List<SandboxCredentialInjectionHeader> injectHeaders) {
        super();
        this.host = host;
        this.injectHeaders = injectHeaders;
    }

    /**
     * The normalized ASCII DNS hostname that selects the rule. This value must be the exact
     * regional Generative AI Responses endpoint hostname for the Project's region and realm. Do not
     * include a scheme, path, port, wildcard, trailing dot, or IP literal. Brokerage uses HTTPS on
     * port 443.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The normalized ASCII DNS hostname that selects the rule. This value must be the exact
     * regional Generative AI Responses endpoint hostname for the Project's region and realm. Do not
     * include a scheme, path, port, wildcard, trailing dot, or IP literal. Brokerage uses HTTPS on
     * port 443.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** The single HTTP request header that the service replaces with the credential value. */
    @com.fasterxml.jackson.annotation.JsonProperty("injectHeaders")
    private final java.util.List<SandboxCredentialInjectionHeader> injectHeaders;

    /**
     * The single HTTP request header that the service replaces with the credential value.
     *
     * @return the value
     */
    public java.util.List<SandboxCredentialInjectionHeader> getInjectHeaders() {
        return injectHeaders;
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
        sb.append("SandboxHttpHeaderCredentialInjectionRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", injectHeaders=").append(String.valueOf(this.injectHeaders));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxHttpHeaderCredentialInjectionRule)) {
            return false;
        }

        SandboxHttpHeaderCredentialInjectionRule other =
                (SandboxHttpHeaderCredentialInjectionRule) o;
        return java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.injectHeaders, other.injectHeaders)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result =
                (result * PRIME)
                        + (this.injectHeaders == null ? 43 : this.injectHeaders.hashCode());
        return result;
    }
}
