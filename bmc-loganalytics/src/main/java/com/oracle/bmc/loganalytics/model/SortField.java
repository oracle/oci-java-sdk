/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Field outlining queryString sort command fields and their corresponding sort order. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SortField.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "name")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SortField extends AbstractField {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDeclared")
        private Boolean isDeclared;

        public Builder isDeclared(Boolean isDeclared) {
            this.isDeclared = isDeclared;
            this.__explicitlySet__.add("isDeclared");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originalDisplayNames")
        private java.util.List<String> originalDisplayNames;

        public Builder originalDisplayNames(java.util.List<String> originalDisplayNames) {
            this.originalDisplayNames = originalDisplayNames;
            this.__explicitlySet__.add("originalDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalName")
        private String internalName;

        public Builder internalName(String internalName) {
            this.internalName = internalName;
            this.__explicitlySet__.add("internalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ValueType valueType;

        public Builder valueType(ValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isGroupable")
        private Boolean isGroupable;

        public Builder isGroupable(Boolean isGroupable) {
            this.isGroupable = isGroupable;
            this.__explicitlySet__.add("isGroupable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDuration")
        private Boolean isDuration;

        public Builder isDuration(Boolean isDuration) {
            this.isDuration = isDuration;
            this.__explicitlySet__.add("isDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filterQueryString")
        private String filterQueryString;

        public Builder filterQueryString(String filterQueryString) {
            this.filterQueryString = filterQueryString;
            this.__explicitlySet__.add("filterQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitType")
        private String unitType;

        public Builder unitType(String unitType) {
            this.unitType = unitType;
            this.__explicitlySet__.add("unitType");
            return this;
        }
        /** Sort order for the field specified in the queryString. */
        @com.fasterxml.jackson.annotation.JsonProperty("direction")
        private Direction direction;

        /**
         * Sort order for the field specified in the queryString.
         *
         * @param direction the value to set
         * @return this builder
         */
        public Builder direction(Direction direction) {
            this.direction = direction;
            this.__explicitlySet__.add("direction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SortField build() {
            SortField model =
                    new SortField(
                            this.displayName,
                            this.isDeclared,
                            this.originalDisplayNames,
                            this.internalName,
                            this.valueType,
                            this.isGroupable,
                            this.isDuration,
                            this.alias,
                            this.filterQueryString,
                            this.unitType,
                            this.direction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SortField model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isDeclared")) {
                this.isDeclared(model.getIsDeclared());
            }
            if (model.wasPropertyExplicitlySet("originalDisplayNames")) {
                this.originalDisplayNames(model.getOriginalDisplayNames());
            }
            if (model.wasPropertyExplicitlySet("internalName")) {
                this.internalName(model.getInternalName());
            }
            if (model.wasPropertyExplicitlySet("valueType")) {
                this.valueType(model.getValueType());
            }
            if (model.wasPropertyExplicitlySet("isGroupable")) {
                this.isGroupable(model.getIsGroupable());
            }
            if (model.wasPropertyExplicitlySet("isDuration")) {
                this.isDuration(model.getIsDuration());
            }
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
            }
            if (model.wasPropertyExplicitlySet("filterQueryString")) {
                this.filterQueryString(model.getFilterQueryString());
            }
            if (model.wasPropertyExplicitlySet("unitType")) {
                this.unitType(model.getUnitType());
            }
            if (model.wasPropertyExplicitlySet("direction")) {
                this.direction(model.getDirection());
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

    @Deprecated
    public SortField(
            String displayName,
            Boolean isDeclared,
            java.util.List<String> originalDisplayNames,
            String internalName,
            ValueType valueType,
            Boolean isGroupable,
            Boolean isDuration,
            String alias,
            String filterQueryString,
            String unitType,
            Direction direction) {
        super(
                displayName,
                isDeclared,
                originalDisplayNames,
                internalName,
                valueType,
                isGroupable,
                isDuration,
                alias,
                filterQueryString,
                unitType);
        this.direction = direction;
    }

    /** Sort order for the field specified in the queryString. */
    public enum Direction implements com.oracle.bmc.http.internal.BmcEnum {
        Ascending("ASCENDING"),
        Descending("DESCENDING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Direction.class);

        private final String value;
        private static java.util.Map<String, Direction> map;

        static {
            map = new java.util.HashMap<>();
            for (Direction v : Direction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Direction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Direction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Direction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Sort order for the field specified in the queryString. */
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final Direction direction;

    /**
     * Sort order for the field specified in the queryString.
     *
     * @return the value
     */
    public Direction getDirection() {
        return direction;
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
        sb.append("SortField(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SortField)) {
            return false;
        }

        SortField other = (SortField) o;
        return java.util.Objects.equals(this.direction, other.direction) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        return result;
    }
}
