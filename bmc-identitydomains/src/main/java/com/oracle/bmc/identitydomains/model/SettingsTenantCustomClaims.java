/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Custom claims associated with the specific tenant <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SettingsTenantCustomClaims.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SettingsTenantCustomClaims
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "value",
        "mode",
        "expression",
        "allScopes",
        "tokenType",
        "scopes"
    })
    public SettingsTenantCustomClaims(
            String name,
            String value,
            Mode mode,
            Boolean expression,
            Boolean allScopes,
            TokenType tokenType,
            java.util.List<String> scopes) {
        super();
        this.name = name;
        this.value = value;
        this.mode = mode;
        this.expression = expression;
        this.allScopes = allScopes;
        this.tokenType = tokenType;
        this.scopes = scopes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Custom claim name
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string - uniqueness: server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Custom claim name
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string - uniqueness: server
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Custom claim value
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Custom claim value
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string - uniqueness: none
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Indicates under what scenario the custom claim will be return
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        /**
         * Indicates under what scenario the custom claim will be return
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string - uniqueness: none
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /**
         * Indicates if the custom claim is an expression
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private Boolean expression;

        /**
         * Indicates if the custom claim is an expression
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: boolean - uniqueness: none
         *
         * @param expression the value to set
         * @return this builder
         */
        public Builder expression(Boolean expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }
        /**
         * Indicates if the custom claim is associated with all scopes
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allScopes")
        private Boolean allScopes;

        /**
         * Indicates if the custom claim is associated with all scopes
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: boolean - uniqueness: none
         *
         * @param allScopes the value to set
         * @return this builder
         */
        public Builder allScopes(Boolean allScopes) {
            this.allScopes = allScopes;
            this.__explicitlySet__.add("allScopes");
            return this;
        }
        /**
         * Indicates what type of token the custom claim will be embedded
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenType")
        private TokenType tokenType;

        /**
         * Indicates what type of token the custom claim will be embedded
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string - uniqueness: none
         *
         * @param tokenType the value to set
         * @return this builder
         */
        public Builder tokenType(TokenType tokenType) {
            this.tokenType = tokenType;
            this.__explicitlySet__.add("tokenType");
            return this;
        }
        /**
         * Scopes associated with a specific custom claim
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scopes")
        private java.util.List<String> scopes;

        /**
         * Scopes associated with a specific custom claim
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         *
         * @param scopes the value to set
         * @return this builder
         */
        public Builder scopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            this.__explicitlySet__.add("scopes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SettingsTenantCustomClaims build() {
            SettingsTenantCustomClaims model =
                    new SettingsTenantCustomClaims(
                            this.name,
                            this.value,
                            this.mode,
                            this.expression,
                            this.allScopes,
                            this.tokenType,
                            this.scopes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SettingsTenantCustomClaims model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
            }
            if (model.wasPropertyExplicitlySet("allScopes")) {
                this.allScopes(model.getAllScopes());
            }
            if (model.wasPropertyExplicitlySet("tokenType")) {
                this.tokenType(model.getTokenType());
            }
            if (model.wasPropertyExplicitlySet("scopes")) {
                this.scopes(model.getScopes());
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
     * Custom claim name
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Custom claim name
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: server
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Custom claim value
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Custom claim value
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Indicates under what scenario the custom claim will be return
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: none
     */
    public enum Mode implements com.oracle.bmc.http.internal.BmcEnum {
        Always("always"),
        Request("request"),
        Never("never"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Mode.class);

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Mode', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates under what scenario the custom claim will be return
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    /**
     * Indicates under what scenario the custom claim will be return
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Mode getMode() {
        return mode;
    }

    /**
     * Indicates if the custom claim is an expression
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final Boolean expression;

    /**
     * Indicates if the custom claim is an expression
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getExpression() {
        return expression;
    }

    /**
     * Indicates if the custom claim is associated with all scopes
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allScopes")
    private final Boolean allScopes;

    /**
     * Indicates if the custom claim is associated with all scopes
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAllScopes() {
        return allScopes;
    }

    /**
     * Indicates what type of token the custom claim will be embedded
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: none
     */
    public enum TokenType implements com.oracle.bmc.http.internal.BmcEnum {
        At("AT"),
        It("IT"),
        Both("BOTH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TokenType.class);

        private final String value;
        private static java.util.Map<String, TokenType> map;

        static {
            map = new java.util.HashMap<>();
            for (TokenType v : TokenType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TokenType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TokenType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TokenType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates what type of token the custom claim will be embedded
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenType")
    private final TokenType tokenType;

    /**
     * Indicates what type of token the custom claim will be embedded
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public TokenType getTokenType() {
        return tokenType;
    }

    /**
     * Scopes associated with a specific custom claim
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    private final java.util.List<String> scopes;

    /**
     * Scopes associated with a specific custom claim
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getScopes() {
        return scopes;
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
        sb.append("SettingsTenantCustomClaims(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(", allScopes=").append(String.valueOf(this.allScopes));
        sb.append(", tokenType=").append(String.valueOf(this.tokenType));
        sb.append(", scopes=").append(String.valueOf(this.scopes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SettingsTenantCustomClaims)) {
            return false;
        }

        SettingsTenantCustomClaims other = (SettingsTenantCustomClaims) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.expression, other.expression)
                && java.util.Objects.equals(this.allScopes, other.allScopes)
                && java.util.Objects.equals(this.tokenType, other.tokenType)
                && java.util.Objects.equals(this.scopes, other.scopes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        result = (result * PRIME) + (this.allScopes == null ? 43 : this.allScopes.hashCode());
        result = (result * PRIME) + (this.tokenType == null ? 43 : this.tokenType.hashCode());
        result = (result * PRIME) + (this.scopes == null ? 43 : this.scopes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
