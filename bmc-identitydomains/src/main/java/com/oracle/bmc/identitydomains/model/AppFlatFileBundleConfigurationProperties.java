/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Flat file connector bundle configuration properties
 * <p>
 **SCIM++ Properties:**
 *  - idcsCompositeKey: [name]
 *  - idcsSearchable: true
 *  - multiValued: true
 *  - mutability: readWrite
 *  - required: false
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
    builder = AppFlatFileBundleConfigurationProperties.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppFlatFileBundleConfigurationProperties
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "displayName",
        "icfType",
        "value",
        "order",
        "helpMessage",
        "required",
        "confidential"
    })
    public AppFlatFileBundleConfigurationProperties(
            String name,
            String displayName,
            IcfType icfType,
            java.util.List<String> value,
            Integer order,
            String helpMessage,
            Boolean required,
            Boolean confidential) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.icfType = icfType;
        this.value = value;
        this.order = order;
        this.helpMessage = helpMessage;
        this.required = required;
        this.confidential = confidential;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the flatfile bundle configuration property. This attribute maps to \\"name\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the flatfile bundle configuration property. This attribute maps to \\"name\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Display name of the flatfile bundle configuration property. This attribute maps to \\"displayName\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the flatfile bundle configuration property. This attribute maps to \\"displayName\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * ICF data type of flatfile the bundle configuration property. This attribute maps to \\"type\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("icfType")
        private IcfType icfType;

        /**
         * ICF data type of flatfile the bundle configuration property. This attribute maps to \\"type\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param icfType the value to set
         * @return this builder
         **/
        public Builder icfType(IcfType icfType) {
            this.icfType = icfType;
            this.__explicitlySet__.add("icfType");
            return this;
        }
        /**
         * Value of the flatfile bundle configuration property. This attribute maps to \\"value\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - idcsSensitive: encrypt
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private java.util.List<String> value;

        /**
         * Value of the flatfile bundle configuration property. This attribute maps to \\"value\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - idcsSensitive: encrypt
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(java.util.List<String> value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Display sequence of the bundle configuration property.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("order")
        private Integer order;

        /**
         * Display sequence of the bundle configuration property.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param order the value to set
         * @return this builder
         **/
        public Builder order(Integer order) {
            this.order = order;
            this.__explicitlySet__.add("order");
            return this;
        }
        /**
         * Help message of the flatfile bundle configuration property. This attribute maps to \\"helpMessage\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helpMessage")
        private String helpMessage;

        /**
         * Help message of the flatfile bundle configuration property. This attribute maps to \\"helpMessage\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param helpMessage the value to set
         * @return this builder
         **/
        public Builder helpMessage(String helpMessage) {
            this.helpMessage = helpMessage;
            this.__explicitlySet__.add("helpMessage");
            return this;
        }
        /**
         * If true, this flatfile bundle configuration property is required to connect to the target connected managed app. This attribute maps to \\"isRequired\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("required")
        private Boolean required;

        /**
         * If true, this flatfile bundle configuration property is required to connect to the target connected managed app. This attribute maps to \\"isRequired\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param required the value to set
         * @return this builder
         **/
        public Builder required(Boolean required) {
            this.required = required;
            this.__explicitlySet__.add("required");
            return this;
        }
        /**
         * If true, this flatfile bundle configuration property value is confidential and will be encrypted in Oracle Identity Cloud Service. This attribute maps to \\"isConfidential\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confidential")
        private Boolean confidential;

        /**
         * If true, this flatfile bundle configuration property value is confidential and will be encrypted in Oracle Identity Cloud Service. This attribute maps to \\"isConfidential\\" attribute in \\"ConfigurationProperty\\" in ICF.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param confidential the value to set
         * @return this builder
         **/
        public Builder confidential(Boolean confidential) {
            this.confidential = confidential;
            this.__explicitlySet__.add("confidential");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppFlatFileBundleConfigurationProperties build() {
            AppFlatFileBundleConfigurationProperties model =
                    new AppFlatFileBundleConfigurationProperties(
                            this.name,
                            this.displayName,
                            this.icfType,
                            this.value,
                            this.order,
                            this.helpMessage,
                            this.required,
                            this.confidential);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppFlatFileBundleConfigurationProperties model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("icfType")) {
                this.icfType(model.getIcfType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("order")) {
                this.order(model.getOrder());
            }
            if (model.wasPropertyExplicitlySet("helpMessage")) {
                this.helpMessage(model.getHelpMessage());
            }
            if (model.wasPropertyExplicitlySet("required")) {
                this.required(model.getRequired());
            }
            if (model.wasPropertyExplicitlySet("confidential")) {
                this.confidential(model.getConfidential());
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
     * Name of the flatfile bundle configuration property. This attribute maps to \\"name\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the flatfile bundle configuration property. This attribute maps to \\"name\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Display name of the flatfile bundle configuration property. This attribute maps to \\"displayName\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the flatfile bundle configuration property. This attribute maps to \\"displayName\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * ICF data type of flatfile the bundle configuration property. This attribute maps to \\"type\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum IcfType {
        Long("Long"),
        String("String"),
        Character("Character"),
        Double("Double"),
        Float("Float"),
        Integer("Integer"),
        Boolean("Boolean"),
        Uri("URI"),
        File("File"),
        GuardedByteArray("GuardedByteArray"),
        GuardedString("GuardedString"),
        ArrayOfLong("ArrayOfLong"),
        ArrayOfString("ArrayOfString"),
        ArrayOfCharacter("ArrayOfCharacter"),
        ArrayOfDouble("ArrayOfDouble"),
        ArrayOfFloat("ArrayOfFloat"),
        ArrayOfInteger("ArrayOfInteger"),
        ArrayOfBoolean("ArrayOfBoolean"),
        ArrayOfUri("ArrayOfURI"),
        ArrayOfFile("ArrayOfFile"),
        ArrayOfGuardedByteArray("ArrayOfGuardedByteArray"),
        ArrayOfGuardedString("ArrayOfGuardedString"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IcfType.class);

        private final String value;
        private static java.util.Map<String, IcfType> map;

        static {
            map = new java.util.HashMap<>();
            for (IcfType v : IcfType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IcfType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IcfType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IcfType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * ICF data type of flatfile the bundle configuration property. This attribute maps to \\"type\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("icfType")
    private final IcfType icfType;

    /**
     * ICF data type of flatfile the bundle configuration property. This attribute maps to \\"type\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public IcfType getIcfType() {
        return icfType;
    }

    /**
     * Value of the flatfile bundle configuration property. This attribute maps to \\"value\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - idcsSensitive: encrypt
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final java.util.List<String> value;

    /**
     * Value of the flatfile bundle configuration property. This attribute maps to \\"value\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - idcsSensitive: encrypt
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getValue() {
        return value;
    }

    /**
     * Display sequence of the bundle configuration property.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    private final Integer order;

    /**
     * Display sequence of the bundle configuration property.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getOrder() {
        return order;
    }

    /**
     * Help message of the flatfile bundle configuration property. This attribute maps to \\"helpMessage\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helpMessage")
    private final String helpMessage;

    /**
     * Help message of the flatfile bundle configuration property. This attribute maps to \\"helpMessage\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getHelpMessage() {
        return helpMessage;
    }

    /**
     * If true, this flatfile bundle configuration property is required to connect to the target connected managed app. This attribute maps to \\"isRequired\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    private final Boolean required;

    /**
     * If true, this flatfile bundle configuration property is required to connect to the target connected managed app. This attribute maps to \\"isRequired\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getRequired() {
        return required;
    }

    /**
     * If true, this flatfile bundle configuration property value is confidential and will be encrypted in Oracle Identity Cloud Service. This attribute maps to \\"isConfidential\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidential")
    private final Boolean confidential;

    /**
     * If true, this flatfile bundle configuration property value is confidential and will be encrypted in Oracle Identity Cloud Service. This attribute maps to \\"isConfidential\\" attribute in \\"ConfigurationProperty\\" in ICF.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getConfidential() {
        return confidential;
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
        sb.append("AppFlatFileBundleConfigurationProperties(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", icfType=").append(String.valueOf(this.icfType));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", order=").append(String.valueOf(this.order));
        sb.append(", helpMessage=").append(String.valueOf(this.helpMessage));
        sb.append(", required=").append(String.valueOf(this.required));
        sb.append(", confidential=").append(String.valueOf(this.confidential));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppFlatFileBundleConfigurationProperties)) {
            return false;
        }

        AppFlatFileBundleConfigurationProperties other =
                (AppFlatFileBundleConfigurationProperties) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.icfType, other.icfType)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.order, other.order)
                && java.util.Objects.equals(this.helpMessage, other.helpMessage)
                && java.util.Objects.equals(this.required, other.required)
                && java.util.Objects.equals(this.confidential, other.confidential)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.icfType == null ? 43 : this.icfType.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.order == null ? 43 : this.order.hashCode());
        result = (result * PRIME) + (this.helpMessage == null ? 43 : this.helpMessage.hashCode());
        result = (result * PRIME) + (this.required == null ? 43 : this.required.hashCode());
        result = (result * PRIME) + (this.confidential == null ? 43 : this.confidential.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
