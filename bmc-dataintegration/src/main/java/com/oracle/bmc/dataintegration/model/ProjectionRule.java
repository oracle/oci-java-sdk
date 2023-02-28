/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Base type for how fields are projected. There are many different mechanisms for doing this such
 * as by a name pattern, datatype and so on. See the {@code modelType} property for the types. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = ProjectionRule.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RenameRule.class,
            name = "RENAME_RULE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TypeListRule.class,
            name = "TYPE_LIST_RULE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TypedNamePatternRule.class,
            name = "TYPED_NAME_PATTERN_RULE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NamePatternRule.class,
            name = "NAME_PATTERN_RULE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GroupedNamePatternRule.class,
            name = "GROUPED_NAME_PATTERN_RULE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NameListRule.class,
            name = "NAME_LIST_RULE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class ProjectionRule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "parentRef",
        "isJavaRegexSyntax",
        "configValues",
        "objectStatus",
        "description"
    })
    protected ProjectionRule(
            String key,
            String modelVersion,
            ParentReference parentRef,
            Boolean isJavaRegexSyntax,
            ConfigValues configValues,
            Integer objectStatus,
            String description) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.isJavaRegexSyntax = isJavaRegexSyntax;
        this.configValues = configValues;
        this.objectStatus = objectStatus;
        this.description = description;
    }

    /** The key of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key of the object.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The model version of an object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /** Specifies whether the rule uses a java regex syntax. */
    @com.fasterxml.jackson.annotation.JsonProperty("isJavaRegexSyntax")
    private final Boolean isJavaRegexSyntax;

    /**
     * Specifies whether the rule uses a java regex syntax.
     *
     * @return the value
     */
    public Boolean getIsJavaRegexSyntax() {
        return isJavaRegexSyntax;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    private final ConfigValues configValues;

    public ConfigValues getConfigValues() {
        return configValues;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     *
     * @return the value
     */
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /** A user defined description for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user defined description for the object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("ProjectionRule(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", isJavaRegexSyntax=").append(String.valueOf(this.isJavaRegexSyntax));
        sb.append(", configValues=").append(String.valueOf(this.configValues));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProjectionRule)) {
            return false;
        }

        ProjectionRule other = (ProjectionRule) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.isJavaRegexSyntax, other.isJavaRegexSyntax)
                && java.util.Objects.equals(this.configValues, other.configValues)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result =
                (result * PRIME)
                        + (this.isJavaRegexSyntax == null ? 43 : this.isJavaRegexSyntax.hashCode());
        result = (result * PRIME) + (this.configValues == null ? 43 : this.configValues.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of the project rule. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        NamePatternRule("NAME_PATTERN_RULE"),
        TypeListRule("TYPE_LIST_RULE"),
        NameListRule("NAME_LIST_RULE"),
        TypedNamePatternRule("TYPED_NAME_PATTERN_RULE"),
        RenameRule("RENAME_RULE"),
        GroupedNamePatternRule("GROUPED_NAME_PATTERN_RULE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
