/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A map of rule patterns.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RuleBasedEntityMap.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RuleBasedEntityMap extends FieldMap {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The object key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The object key.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The object's model version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The object's model version.
         * @param modelVersion the value to set
         * @return this builder
         **/
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }
        /**
         * mapType
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mapType")
        private MapType mapType;

        /**
         * mapType
         * @param mapType the value to set
         * @return this builder
         **/
        public Builder mapType(MapType mapType) {
            this.mapType = mapType;
            this.__explicitlySet__.add("mapType");
            return this;
        }
        /**
         * The pattern to map from.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fromPattern")
        private String fromPattern;

        /**
         * The pattern to map from.
         * @param fromPattern the value to set
         * @return this builder
         **/
        public Builder fromPattern(String fromPattern) {
            this.fromPattern = fromPattern;
            this.__explicitlySet__.add("fromPattern");
            return this;
        }
        /**
         * The pattern to map to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("toPattern")
        private String toPattern;

        /**
         * The pattern to map to.
         * @param toPattern the value to set
         * @return this builder
         **/
        public Builder toPattern(String toPattern) {
            this.toPattern = toPattern;
            this.__explicitlySet__.add("toPattern");
            return this;
        }
        /**
         * Specifies whether the rule uses a java regex syntax.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isJavaRegexSyntax")
        private Boolean isJavaRegexSyntax;

        /**
         * Specifies whether the rule uses a java regex syntax.
         * @param isJavaRegexSyntax the value to set
         * @return this builder
         **/
        public Builder isJavaRegexSyntax(Boolean isJavaRegexSyntax) {
            this.isJavaRegexSyntax = isJavaRegexSyntax;
            this.__explicitlySet__.add("isJavaRegexSyntax");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * @param objectStatus the value to set
         * @return this builder
         **/
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuleBasedEntityMap build() {
            RuleBasedEntityMap model =
                    new RuleBasedEntityMap(
                            this.description,
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.configValues,
                            this.mapType,
                            this.fromPattern,
                            this.toPattern,
                            this.isJavaRegexSyntax,
                            this.objectStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuleBasedEntityMap model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("configValues")) {
                this.configValues(model.getConfigValues());
            }
            if (model.wasPropertyExplicitlySet("mapType")) {
                this.mapType(model.getMapType());
            }
            if (model.wasPropertyExplicitlySet("fromPattern")) {
                this.fromPattern(model.getFromPattern());
            }
            if (model.wasPropertyExplicitlySet("toPattern")) {
                this.toPattern(model.getToPattern());
            }
            if (model.wasPropertyExplicitlySet("isJavaRegexSyntax")) {
                this.isJavaRegexSyntax(model.getIsJavaRegexSyntax());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
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
    public RuleBasedEntityMap(
            String description,
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            MapType mapType,
            String fromPattern,
            String toPattern,
            Boolean isJavaRegexSyntax,
            Integer objectStatus) {
        super(description);
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.configValues = configValues;
        this.mapType = mapType;
        this.fromPattern = fromPattern;
        this.toPattern = toPattern;
        this.isJavaRegexSyntax = isJavaRegexSyntax;
        this.objectStatus = objectStatus;
    }

    /**
     * The object key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The object key.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The object's model version.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    private final ConfigValues configValues;

    public ConfigValues getConfigValues() {
        return configValues;
    }

    /**
     * mapType
     **/
    public enum MapType {
        Mapbyname("MAPBYNAME"),
        Mapbypattern("MAPBYPATTERN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MapType.class);

        private final String value;
        private static java.util.Map<String, MapType> map;

        static {
            map = new java.util.HashMap<>();
            for (MapType v : MapType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MapType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MapType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MapType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * mapType
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mapType")
    private final MapType mapType;

    /**
     * mapType
     * @return the value
     **/
    public MapType getMapType() {
        return mapType;
    }

    /**
     * The pattern to map from.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fromPattern")
    private final String fromPattern;

    /**
     * The pattern to map from.
     * @return the value
     **/
    public String getFromPattern() {
        return fromPattern;
    }

    /**
     * The pattern to map to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toPattern")
    private final String toPattern;

    /**
     * The pattern to map to.
     * @return the value
     **/
    public String getToPattern() {
        return toPattern;
    }

    /**
     * Specifies whether the rule uses a java regex syntax.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isJavaRegexSyntax")
    private final Boolean isJavaRegexSyntax;

    /**
     * Specifies whether the rule uses a java regex syntax.
     * @return the value
     **/
    public Boolean getIsJavaRegexSyntax() {
        return isJavaRegexSyntax;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * @return the value
     **/
    public Integer getObjectStatus() {
        return objectStatus;
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
        sb.append("RuleBasedEntityMap(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", configValues=").append(String.valueOf(this.configValues));
        sb.append(", mapType=").append(String.valueOf(this.mapType));
        sb.append(", fromPattern=").append(String.valueOf(this.fromPattern));
        sb.append(", toPattern=").append(String.valueOf(this.toPattern));
        sb.append(", isJavaRegexSyntax=").append(String.valueOf(this.isJavaRegexSyntax));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuleBasedEntityMap)) {
            return false;
        }

        RuleBasedEntityMap other = (RuleBasedEntityMap) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.configValues, other.configValues)
                && java.util.Objects.equals(this.mapType, other.mapType)
                && java.util.Objects.equals(this.fromPattern, other.fromPattern)
                && java.util.Objects.equals(this.toPattern, other.toPattern)
                && java.util.Objects.equals(this.isJavaRegexSyntax, other.isJavaRegexSyntax)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.configValues == null ? 43 : this.configValues.hashCode());
        result = (result * PRIME) + (this.mapType == null ? 43 : this.mapType.hashCode());
        result = (result * PRIME) + (this.fromPattern == null ? 43 : this.fromPattern.hashCode());
        result = (result * PRIME) + (this.toPattern == null ? 43 : this.toPattern.hashCode());
        result =
                (result * PRIME)
                        + (this.isJavaRegexSyntax == null ? 43 : this.isJavaRegexSyntax.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        return result;
    }
}
