/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * External identity provider for AZURE_AD
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd
        extends PropertySetOracleDatabaseExternalAuthenticationIdentityProvider {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * External identity provider configuration parameters. Simple key-value pair
         * Example: { "tenant_id": "...", "application_id_uri": "...", ... }
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configs")
        private java.util.Map<String, String> configs;

        /**
         * External identity provider configuration parameters. Simple key-value pair
         * Example: { "tenant_id": "...", "application_id_uri": "...", ... }
         *
         * @param configs the value to set
         * @return this builder
         **/
        public Builder configs(java.util.Map<String, String> configs) {
            this.configs = configs;
            this.__explicitlySet__.add("configs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd build() {
            PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd model =
                    new PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd(
                            this.configs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd model) {
            if (model.wasPropertyExplicitlySet("configs")) {
                this.configs(model.getConfigs());
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
    public PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd(
            java.util.Map<String, String> configs) {
        super();
        this.configs = configs;
    }

    /**
     * External identity provider configuration parameters. Simple key-value pair
     * Example: { "tenant_id": "...", "application_id_uri": "...", ... }
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configs")
    private final java.util.Map<String, String> configs;

    /**
     * External identity provider configuration parameters. Simple key-value pair
     * Example: { "tenant_id": "...", "application_id_uri": "...", ... }
     *
     * @return the value
     **/
    public java.util.Map<String, String> getConfigs() {
        return configs;
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
        sb.append("PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", configs=").append(String.valueOf(this.configs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o
                instanceof
                PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd)) {
            return false;
        }

        PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd other =
                (PropertySetOracleDatabaseExternalAuthenticationIdentityProviderAzureAd) o;
        return java.util.Objects.equals(this.configs, other.configs) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.configs == null ? 43 : this.configs.hashCode());
        return result;
    }
}
