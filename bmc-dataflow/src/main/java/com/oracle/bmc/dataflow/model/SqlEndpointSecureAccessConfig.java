/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * Access control rules for secure access selection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlEndpointSecureAccessConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "networkType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlEndpointSecureAccessConfig extends SqlEndpointNetworkConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of SecureAccessControlRule's to which access is limited to
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessControlRules")
        private java.util.List<SecureAccessControlRule> accessControlRules;

        /**
         * A list of SecureAccessControlRule's to which access is limited to
         * @param accessControlRules the value to set
         * @return this builder
         **/
        public Builder accessControlRules(
                java.util.List<SecureAccessControlRule> accessControlRules) {
            this.accessControlRules = accessControlRules;
            this.__explicitlySet__.add("accessControlRules");
            return this;
        }
        /**
         * Ip Address of public endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicEndpointIp")
        private String publicEndpointIp;

        /**
         * Ip Address of public endpoint
         * @param publicEndpointIp the value to set
         * @return this builder
         **/
        public Builder publicEndpointIp(String publicEndpointIp) {
            this.publicEndpointIp = publicEndpointIp;
            this.__explicitlySet__.add("publicEndpointIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlEndpointSecureAccessConfig build() {
            SqlEndpointSecureAccessConfig model =
                    new SqlEndpointSecureAccessConfig(
                            this.accessControlRules, this.publicEndpointIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlEndpointSecureAccessConfig model) {
            if (model.wasPropertyExplicitlySet("accessControlRules")) {
                this.accessControlRules(model.getAccessControlRules());
            }
            if (model.wasPropertyExplicitlySet("publicEndpointIp")) {
                this.publicEndpointIp(model.getPublicEndpointIp());
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
    public SqlEndpointSecureAccessConfig(
            java.util.List<SecureAccessControlRule> accessControlRules, String publicEndpointIp) {
        super();
        this.accessControlRules = accessControlRules;
        this.publicEndpointIp = publicEndpointIp;
    }

    /**
     * A list of SecureAccessControlRule's to which access is limited to
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessControlRules")
    private final java.util.List<SecureAccessControlRule> accessControlRules;

    /**
     * A list of SecureAccessControlRule's to which access is limited to
     * @return the value
     **/
    public java.util.List<SecureAccessControlRule> getAccessControlRules() {
        return accessControlRules;
    }

    /**
     * Ip Address of public endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicEndpointIp")
    private final String publicEndpointIp;

    /**
     * Ip Address of public endpoint
     * @return the value
     **/
    public String getPublicEndpointIp() {
        return publicEndpointIp;
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
        sb.append("SqlEndpointSecureAccessConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accessControlRules=").append(String.valueOf(this.accessControlRules));
        sb.append(", publicEndpointIp=").append(String.valueOf(this.publicEndpointIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlEndpointSecureAccessConfig)) {
            return false;
        }

        SqlEndpointSecureAccessConfig other = (SqlEndpointSecureAccessConfig) o;
        return java.util.Objects.equals(this.accessControlRules, other.accessControlRules)
                && java.util.Objects.equals(this.publicEndpointIp, other.publicEndpointIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.accessControlRules == null
                                ? 43
                                : this.accessControlRules.hashCode());
        result =
                (result * PRIME)
                        + (this.publicEndpointIp == null ? 43 : this.publicEndpointIp.hashCode());
        return result;
    }
}
