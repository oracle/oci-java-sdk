/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Relay Param variable for Social IDP
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SocialIdentityProviderRelayIdpParamMappings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SocialIdentityProviderRelayIdpParamMappings
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"relayParamKey", "relayParamValue"})
    public SocialIdentityProviderRelayIdpParamMappings(
            String relayParamKey, String relayParamValue) {
        super();
        this.relayParamKey = relayParamKey;
        this.relayParamValue = relayParamValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Key or name of the relayParam.
         * <p>
         **Added In:** 2305190132
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relayParamKey")
        private String relayParamKey;

        /**
         * Key or name of the relayParam.
         * <p>
         **Added In:** 2305190132
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param relayParamKey the value to set
         * @return this builder
         **/
        public Builder relayParamKey(String relayParamKey) {
            this.relayParamKey = relayParamKey;
            this.__explicitlySet__.add("relayParamKey");
            return this;
        }
        /**
         * Value of the relayParam (if defined)
         * <p>
         **Added In:** 2305190132
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relayParamValue")
        private String relayParamValue;

        /**
         * Value of the relayParam (if defined)
         * <p>
         **Added In:** 2305190132
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param relayParamValue the value to set
         * @return this builder
         **/
        public Builder relayParamValue(String relayParamValue) {
            this.relayParamValue = relayParamValue;
            this.__explicitlySet__.add("relayParamValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SocialIdentityProviderRelayIdpParamMappings build() {
            SocialIdentityProviderRelayIdpParamMappings model =
                    new SocialIdentityProviderRelayIdpParamMappings(
                            this.relayParamKey, this.relayParamValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SocialIdentityProviderRelayIdpParamMappings model) {
            if (model.wasPropertyExplicitlySet("relayParamKey")) {
                this.relayParamKey(model.getRelayParamKey());
            }
            if (model.wasPropertyExplicitlySet("relayParamValue")) {
                this.relayParamValue(model.getRelayParamValue());
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
     * Key or name of the relayParam.
     * <p>
     **Added In:** 2305190132
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relayParamKey")
    private final String relayParamKey;

    /**
     * Key or name of the relayParam.
     * <p>
     **Added In:** 2305190132
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getRelayParamKey() {
        return relayParamKey;
    }

    /**
     * Value of the relayParam (if defined)
     * <p>
     **Added In:** 2305190132
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relayParamValue")
    private final String relayParamValue;

    /**
     * Value of the relayParam (if defined)
     * <p>
     **Added In:** 2305190132
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getRelayParamValue() {
        return relayParamValue;
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
        sb.append("SocialIdentityProviderRelayIdpParamMappings(");
        sb.append("super=").append(super.toString());
        sb.append("relayParamKey=").append(String.valueOf(this.relayParamKey));
        sb.append(", relayParamValue=").append(String.valueOf(this.relayParamValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SocialIdentityProviderRelayIdpParamMappings)) {
            return false;
        }

        SocialIdentityProviderRelayIdpParamMappings other =
                (SocialIdentityProviderRelayIdpParamMappings) o;
        return java.util.Objects.equals(this.relayParamKey, other.relayParamKey)
                && java.util.Objects.equals(this.relayParamValue, other.relayParamValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.relayParamKey == null ? 43 : this.relayParamKey.hashCode());
        result =
                (result * PRIME)
                        + (this.relayParamValue == null ? 43 : this.relayParamValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
