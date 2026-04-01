/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Oracle Identity Cloud Service (IDCS) configuration used
 * when inboundAuthConfigType is set to IDCS_AUTH_CONFIG.
 * This object must be specified when inboundAuthConfigType is IDCS_AUTH_CONFIG.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IdcsAuthConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IdcsAuthConfig extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"domainUrl", "scope", "audience"})
    public IdcsAuthConfig(String domainUrl, String scope, String audience) {
        super();
        this.domainUrl = domainUrl;
        this.scope = scope;
        this.audience = audience;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Domain URL for IDCS.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainUrl")
        private String domainUrl;

        /**
         * Domain URL for IDCS.
         * @param domainUrl the value to set
         * @return this builder
         **/
        public Builder domainUrl(String domainUrl) {
            this.domainUrl = domainUrl;
            this.__explicitlySet__.add("domainUrl");
            return this;
        }
        /**
         * Scope for IDCS.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        /**
         * Scope for IDCS.
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * Audience for IDCS.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("audience")
        private String audience;

        /**
         * Audience for IDCS.
         * @param audience the value to set
         * @return this builder
         **/
        public Builder audience(String audience) {
            this.audience = audience;
            this.__explicitlySet__.add("audience");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdcsAuthConfig build() {
            IdcsAuthConfig model = new IdcsAuthConfig(this.domainUrl, this.scope, this.audience);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdcsAuthConfig model) {
            if (model.wasPropertyExplicitlySet("domainUrl")) {
                this.domainUrl(model.getDomainUrl());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("audience")) {
                this.audience(model.getAudience());
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
     * Domain URL for IDCS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainUrl")
    private final String domainUrl;

    /**
     * Domain URL for IDCS.
     * @return the value
     **/
    public String getDomainUrl() {
        return domainUrl;
    }

    /**
     * Scope for IDCS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * Scope for IDCS.
     * @return the value
     **/
    public String getScope() {
        return scope;
    }

    /**
     * Audience for IDCS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("audience")
    private final String audience;

    /**
     * Audience for IDCS.
     * @return the value
     **/
    public String getAudience() {
        return audience;
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
        sb.append("IdcsAuthConfig(");
        sb.append("super=").append(super.toString());
        sb.append("domainUrl=").append(String.valueOf(this.domainUrl));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", audience=").append(String.valueOf(this.audience));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdcsAuthConfig)) {
            return false;
        }

        IdcsAuthConfig other = (IdcsAuthConfig) o;
        return java.util.Objects.equals(this.domainUrl, other.domainUrl)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.audience, other.audience)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.domainUrl == null ? 43 : this.domainUrl.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.audience == null ? 43 : this.audience.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
