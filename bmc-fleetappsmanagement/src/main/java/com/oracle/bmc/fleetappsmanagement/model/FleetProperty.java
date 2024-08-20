/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Property associated with a Fleet. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FleetProperty.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FleetProperty extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "value",
        "propertyId",
        "selectionType",
        "valueType",
        "allowedValues",
        "lifecycleState",
        "systemTags"
    })
    public FleetProperty(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String value,
            String propertyId,
            Selection selectionType,
            ValueType valueType,
            java.util.List<String> allowedValues,
            LifecycleState lifecycleState,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.value = value;
        this.propertyId = propertyId;
        this.selectionType = selectionType;
        this.valueType = valueType;
        this.allowedValues = allowedValues;
        this.lifecycleState = lifecycleState;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique id of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique id of the resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Tenancy OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Tenancy OCID
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The time this resource was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time this resource was last updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time this resource was last updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Value of the Property */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value of the Property
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Property Id Ocid. */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyId")
        private String propertyId;

        /**
         * Property Id Ocid.
         *
         * @param propertyId the value to set
         * @return this builder
         */
        public Builder propertyId(String propertyId) {
            this.propertyId = propertyId;
            this.__explicitlySet__.add("propertyId");
            return this;
        }
        /** Text selection of the category */
        @com.fasterxml.jackson.annotation.JsonProperty("selectionType")
        private Selection selectionType;

        /**
         * Text selection of the category
         *
         * @param selectionType the value to set
         * @return this builder
         */
        public Builder selectionType(Selection selectionType) {
            this.selectionType = selectionType;
            this.__explicitlySet__.add("selectionType");
            return this;
        }
        /** Format of the value */
        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ValueType valueType;

        /**
         * Format of the value
         *
         * @param valueType the value to set
         * @return this builder
         */
        public Builder valueType(ValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }
        /** Values of the category (must be a single value if selection = 'single choice') */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<String> allowedValues;

        /**
         * Values of the category (must be a single value if selection = 'single choice')
         *
         * @param allowedValues the value to set
         * @return this builder
         */
        public Builder allowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }
        /** The current state of the FleetProperty. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the FleetProperty.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetProperty build() {
            FleetProperty model =
                    new FleetProperty(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.value,
                            this.propertyId,
                            this.selectionType,
                            this.valueType,
                            this.allowedValues,
                            this.lifecycleState,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetProperty model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("propertyId")) {
                this.propertyId(model.getPropertyId());
            }
            if (model.wasPropertyExplicitlySet("selectionType")) {
                this.selectionType(model.getSelectionType());
            }
            if (model.wasPropertyExplicitlySet("valueType")) {
                this.valueType(model.getValueType());
            }
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** The unique id of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique id of the resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Tenancy OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Tenancy OCID
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The time this resource was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time this resource was last updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time this resource was last updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Value of the Property */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value of the Property
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Property Id Ocid. */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyId")
    private final String propertyId;

    /**
     * Property Id Ocid.
     *
     * @return the value
     */
    public String getPropertyId() {
        return propertyId;
    }

    /** Text selection of the category */
    @com.fasterxml.jackson.annotation.JsonProperty("selectionType")
    private final Selection selectionType;

    /**
     * Text selection of the category
     *
     * @return the value
     */
    public Selection getSelectionType() {
        return selectionType;
    }

    /** Format of the value */
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    private final ValueType valueType;

    /**
     * Format of the value
     *
     * @return the value
     */
    public ValueType getValueType() {
        return valueType;
    }

    /** Values of the category (must be a single value if selection = 'single choice') */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<String> allowedValues;

    /**
     * Values of the category (must be a single value if selection = 'single choice')
     *
     * @return the value
     */
    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /** The current state of the FleetProperty. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the FleetProperty. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the FleetProperty.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("FleetProperty(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", propertyId=").append(String.valueOf(this.propertyId));
        sb.append(", selectionType=").append(String.valueOf(this.selectionType));
        sb.append(", valueType=").append(String.valueOf(this.valueType));
        sb.append(", allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetProperty)) {
            return false;
        }

        FleetProperty other = (FleetProperty) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.propertyId, other.propertyId)
                && java.util.Objects.equals(this.selectionType, other.selectionType)
                && java.util.Objects.equals(this.valueType, other.valueType)
                && java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.propertyId == null ? 43 : this.propertyId.hashCode());
        result =
                (result * PRIME)
                        + (this.selectionType == null ? 43 : this.selectionType.hashCode());
        result = (result * PRIME) + (this.valueType == null ? 43 : this.valueType.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
