/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Trusted 2FA Factors
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
    builder = MyTrustedUserAgentTrustedFactors.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MyTrustedUserAgentTrustedFactors
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "category", "creationTime"})
    public MyTrustedUserAgentTrustedFactors(String type, Category category, String creationTime) {
        super();
        this.type = type;
        this.category = category;
        this.creationTime = creationTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Trusted Factor
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Trusted Factor
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Trusted Factor Type. Local, X509, SAML SOCIAL
         * <p>
         **Added In:** 2111190457
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        /**
         * Trusted Factor Type. Local, X509, SAML SOCIAL
         * <p>
         **Added In:** 2111190457
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * trust factor creation time
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: true
         *  - returned: default
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
        private String creationTime;

        /**
         * trust factor creation time
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: true
         *  - returned: default
         *  - type: dateTime
         *  - uniqueness: none
         * @param creationTime the value to set
         * @return this builder
         **/
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            this.__explicitlySet__.add("creationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyTrustedUserAgentTrustedFactors build() {
            MyTrustedUserAgentTrustedFactors model =
                    new MyTrustedUserAgentTrustedFactors(
                            this.type, this.category, this.creationTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyTrustedUserAgentTrustedFactors model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("creationTime")) {
                this.creationTime(model.getCreationTime());
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
     * Trusted Factor
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Trusted Factor
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Trusted Factor Type. Local, X509, SAML SOCIAL
     * <p>
     **Added In:** 2111190457
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum Category {
        Saml("SAML"),
        Local("LOCAL"),
        Social("SOCIAL"),
        X509("X509"),
        Thirdparty("THIRDPARTY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Category.class);

        private final String value;
        private static java.util.Map<String, Category> map;

        static {
            map = new java.util.HashMap<>();
            for (Category v : Category.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Category(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Category create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Category', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Trusted Factor Type. Local, X509, SAML SOCIAL
     * <p>
     **Added In:** 2111190457
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final Category category;

    /**
     * Trusted Factor Type. Local, X509, SAML SOCIAL
     * <p>
     **Added In:** 2111190457
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public Category getCategory() {
        return category;
    }

    /**
     * trust factor creation time
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: true
     *  - returned: default
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    private final String creationTime;

    /**
     * trust factor creation time
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: true
     *  - returned: default
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getCreationTime() {
        return creationTime;
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
        sb.append("MyTrustedUserAgentTrustedFactors(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", creationTime=").append(String.valueOf(this.creationTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyTrustedUserAgentTrustedFactors)) {
            return false;
        }

        MyTrustedUserAgentTrustedFactors other = (MyTrustedUserAgentTrustedFactors) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.creationTime, other.creationTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.creationTime == null ? 43 : this.creationTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
