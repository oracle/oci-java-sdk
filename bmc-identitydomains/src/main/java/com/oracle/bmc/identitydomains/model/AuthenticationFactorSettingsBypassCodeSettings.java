/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Settings related to the bypass code, such as bypass code length, bypass code expiry, max active bypass codes, and so on
 * <p>
 **SCIM++ Properties:**
 *  - idcsSearchable: false
 *  - multiValued: false
 *  - mutability: readWrite
 *  - required: true
 *  - returned: default
 *  - type: complex
 *  - uniqueness: none
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
    builder = AuthenticationFactorSettingsBypassCodeSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuthenticationFactorSettingsBypassCodeSettings
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "selfServiceGenerationEnabled",
        "helpDeskGenerationEnabled",
        "length",
        "maxActive",
        "helpDeskCodeExpiryInMins",
        "helpDeskMaxUsage"
    })
    public AuthenticationFactorSettingsBypassCodeSettings(
            Boolean selfServiceGenerationEnabled,
            Boolean helpDeskGenerationEnabled,
            Integer length,
            Integer maxActive,
            Integer helpDeskCodeExpiryInMins,
            Integer helpDeskMaxUsage) {
        super();
        this.selfServiceGenerationEnabled = selfServiceGenerationEnabled;
        this.helpDeskGenerationEnabled = helpDeskGenerationEnabled;
        this.length = length;
        this.maxActive = maxActive;
        this.helpDeskCodeExpiryInMins = helpDeskCodeExpiryInMins;
        this.helpDeskMaxUsage = helpDeskMaxUsage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If true, indicates that self-service bypass code generation is enabled
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("selfServiceGenerationEnabled")
        private Boolean selfServiceGenerationEnabled;

        /**
         * If true, indicates that self-service bypass code generation is enabled
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param selfServiceGenerationEnabled the value to set
         * @return this builder
         **/
        public Builder selfServiceGenerationEnabled(Boolean selfServiceGenerationEnabled) {
            this.selfServiceGenerationEnabled = selfServiceGenerationEnabled;
            this.__explicitlySet__.add("selfServiceGenerationEnabled");
            return this;
        }
        /**
         * If true, indicates that help desk bypass code generation is enabled
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helpDeskGenerationEnabled")
        private Boolean helpDeskGenerationEnabled;

        /**
         * If true, indicates that help desk bypass code generation is enabled
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param helpDeskGenerationEnabled the value to set
         * @return this builder
         **/
        public Builder helpDeskGenerationEnabled(Boolean helpDeskGenerationEnabled) {
            this.helpDeskGenerationEnabled = helpDeskGenerationEnabled;
            this.__explicitlySet__.add("helpDeskGenerationEnabled");
            return this;
        }
        /**
         * Exact length of the bypass code to be generated
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 20
         *  - idcsMinValue: 8
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        /**
         * Exact length of the bypass code to be generated
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 20
         *  - idcsMinValue: 8
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param length the value to set
         * @return this builder
         **/
        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }
        /**
         * The maximum number of bypass codes that can be issued to any user
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 6
         *  - idcsMinValue: 1
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxActive")
        private Integer maxActive;

        /**
         * The maximum number of bypass codes that can be issued to any user
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 6
         *  - idcsMinValue: 1
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param maxActive the value to set
         * @return this builder
         **/
        public Builder maxActive(Integer maxActive) {
            this.maxActive = maxActive;
            this.__explicitlySet__.add("maxActive");
            return this;
        }
        /**
         * Expiry (in minutes) of any bypass code that is generated by the help desk
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 9999999
         *  - idcsMinValue: 1
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helpDeskCodeExpiryInMins")
        private Integer helpDeskCodeExpiryInMins;

        /**
         * Expiry (in minutes) of any bypass code that is generated by the help desk
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 9999999
         *  - idcsMinValue: 1
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param helpDeskCodeExpiryInMins the value to set
         * @return this builder
         **/
        public Builder helpDeskCodeExpiryInMins(Integer helpDeskCodeExpiryInMins) {
            this.helpDeskCodeExpiryInMins = helpDeskCodeExpiryInMins;
            this.__explicitlySet__.add("helpDeskCodeExpiryInMins");
            return this;
        }
        /**
         * The maximum number of times that any bypass code that is generated by the help desk can be used
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 999
         *  - idcsMinValue: 1
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helpDeskMaxUsage")
        private Integer helpDeskMaxUsage;

        /**
         * The maximum number of times that any bypass code that is generated by the help desk can be used
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 999
         *  - idcsMinValue: 1
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param helpDeskMaxUsage the value to set
         * @return this builder
         **/
        public Builder helpDeskMaxUsage(Integer helpDeskMaxUsage) {
            this.helpDeskMaxUsage = helpDeskMaxUsage;
            this.__explicitlySet__.add("helpDeskMaxUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationFactorSettingsBypassCodeSettings build() {
            AuthenticationFactorSettingsBypassCodeSettings model =
                    new AuthenticationFactorSettingsBypassCodeSettings(
                            this.selfServiceGenerationEnabled,
                            this.helpDeskGenerationEnabled,
                            this.length,
                            this.maxActive,
                            this.helpDeskCodeExpiryInMins,
                            this.helpDeskMaxUsage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationFactorSettingsBypassCodeSettings model) {
            if (model.wasPropertyExplicitlySet("selfServiceGenerationEnabled")) {
                this.selfServiceGenerationEnabled(model.getSelfServiceGenerationEnabled());
            }
            if (model.wasPropertyExplicitlySet("helpDeskGenerationEnabled")) {
                this.helpDeskGenerationEnabled(model.getHelpDeskGenerationEnabled());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
            }
            if (model.wasPropertyExplicitlySet("maxActive")) {
                this.maxActive(model.getMaxActive());
            }
            if (model.wasPropertyExplicitlySet("helpDeskCodeExpiryInMins")) {
                this.helpDeskCodeExpiryInMins(model.getHelpDeskCodeExpiryInMins());
            }
            if (model.wasPropertyExplicitlySet("helpDeskMaxUsage")) {
                this.helpDeskMaxUsage(model.getHelpDeskMaxUsage());
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
     * If true, indicates that self-service bypass code generation is enabled
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selfServiceGenerationEnabled")
    private final Boolean selfServiceGenerationEnabled;

    /**
     * If true, indicates that self-service bypass code generation is enabled
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getSelfServiceGenerationEnabled() {
        return selfServiceGenerationEnabled;
    }

    /**
     * If true, indicates that help desk bypass code generation is enabled
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helpDeskGenerationEnabled")
    private final Boolean helpDeskGenerationEnabled;

    /**
     * If true, indicates that help desk bypass code generation is enabled
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getHelpDeskGenerationEnabled() {
        return helpDeskGenerationEnabled;
    }

    /**
     * Exact length of the bypass code to be generated
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 20
     *  - idcsMinValue: 8
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Integer length;

    /**
     * Exact length of the bypass code to be generated
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 20
     *  - idcsMinValue: 8
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getLength() {
        return length;
    }

    /**
     * The maximum number of bypass codes that can be issued to any user
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 6
     *  - idcsMinValue: 1
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxActive")
    private final Integer maxActive;

    /**
     * The maximum number of bypass codes that can be issued to any user
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 6
     *  - idcsMinValue: 1
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getMaxActive() {
        return maxActive;
    }

    /**
     * Expiry (in minutes) of any bypass code that is generated by the help desk
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 9999999
     *  - idcsMinValue: 1
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helpDeskCodeExpiryInMins")
    private final Integer helpDeskCodeExpiryInMins;

    /**
     * Expiry (in minutes) of any bypass code that is generated by the help desk
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 9999999
     *  - idcsMinValue: 1
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getHelpDeskCodeExpiryInMins() {
        return helpDeskCodeExpiryInMins;
    }

    /**
     * The maximum number of times that any bypass code that is generated by the help desk can be used
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 999
     *  - idcsMinValue: 1
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helpDeskMaxUsage")
    private final Integer helpDeskMaxUsage;

    /**
     * The maximum number of times that any bypass code that is generated by the help desk can be used
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 999
     *  - idcsMinValue: 1
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getHelpDeskMaxUsage() {
        return helpDeskMaxUsage;
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
        sb.append("AuthenticationFactorSettingsBypassCodeSettings(");
        sb.append("super=").append(super.toString());
        sb.append("selfServiceGenerationEnabled=")
                .append(String.valueOf(this.selfServiceGenerationEnabled));
        sb.append(", helpDeskGenerationEnabled=")
                .append(String.valueOf(this.helpDeskGenerationEnabled));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", maxActive=").append(String.valueOf(this.maxActive));
        sb.append(", helpDeskCodeExpiryInMins=")
                .append(String.valueOf(this.helpDeskCodeExpiryInMins));
        sb.append(", helpDeskMaxUsage=").append(String.valueOf(this.helpDeskMaxUsage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationFactorSettingsBypassCodeSettings)) {
            return false;
        }

        AuthenticationFactorSettingsBypassCodeSettings other =
                (AuthenticationFactorSettingsBypassCodeSettings) o;
        return java.util.Objects.equals(
                        this.selfServiceGenerationEnabled, other.selfServiceGenerationEnabled)
                && java.util.Objects.equals(
                        this.helpDeskGenerationEnabled, other.helpDeskGenerationEnabled)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.maxActive, other.maxActive)
                && java.util.Objects.equals(
                        this.helpDeskCodeExpiryInMins, other.helpDeskCodeExpiryInMins)
                && java.util.Objects.equals(this.helpDeskMaxUsage, other.helpDeskMaxUsage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.selfServiceGenerationEnabled == null
                                ? 43
                                : this.selfServiceGenerationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.helpDeskGenerationEnabled == null
                                ? 43
                                : this.helpDeskGenerationEnabled.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.maxActive == null ? 43 : this.maxActive.hashCode());
        result =
                (result * PRIME)
                        + (this.helpDeskCodeExpiryInMins == null
                                ? 43
                                : this.helpDeskCodeExpiryInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.helpDeskMaxUsage == null ? 43 : this.helpDeskMaxUsage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
