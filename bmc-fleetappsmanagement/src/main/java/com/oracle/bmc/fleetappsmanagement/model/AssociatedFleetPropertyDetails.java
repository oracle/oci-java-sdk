/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The information about associated FleetProperty.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AssociatedFleetPropertyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssociatedFleetPropertyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "fleetPropertyType",
        "value",
        "isRequired"
    })
    public AssociatedFleetPropertyDetails(
            String compartmentId,
            String displayName,
            FleetPropertyType fleetPropertyType,
            String value,
            Boolean isRequired) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.fleetPropertyType = fleetPropertyType;
        this.value = value;
        this.isRequired = isRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Tenancy OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Tenancy OCID
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Type of the FleetProperty.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fleetPropertyType")
        private FleetPropertyType fleetPropertyType;

        /**
         * Type of the FleetProperty.
         * @param fleetPropertyType the value to set
         * @return this builder
         **/
        public Builder fleetPropertyType(FleetPropertyType fleetPropertyType) {
            this.fleetPropertyType = fleetPropertyType;
            this.__explicitlySet__.add("fleetPropertyType");
            return this;
        }
        /**
         * Value of the Property.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value of the Property.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Property is required or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * Property is required or not.
         * @param isRequired the value to set
         * @return this builder
         **/
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociatedFleetPropertyDetails build() {
            AssociatedFleetPropertyDetails model =
                    new AssociatedFleetPropertyDetails(
                            this.compartmentId,
                            this.displayName,
                            this.fleetPropertyType,
                            this.value,
                            this.isRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociatedFleetPropertyDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("fleetPropertyType")) {
                this.fleetPropertyType(model.getFleetPropertyType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
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
     * Tenancy OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Tenancy OCID
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Type of the FleetProperty.
     **/
    public enum FleetPropertyType {
        String("STRING"),
        Number("NUMBER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FleetPropertyType.class);

        private final String value;
        private static java.util.Map<String, FleetPropertyType> map;

        static {
            map = new java.util.HashMap<>();
            for (FleetPropertyType v : FleetPropertyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FleetPropertyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FleetPropertyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FleetPropertyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of the FleetProperty.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fleetPropertyType")
    private final FleetPropertyType fleetPropertyType;

    /**
     * Type of the FleetProperty.
     * @return the value
     **/
    public FleetPropertyType getFleetPropertyType() {
        return fleetPropertyType;
    }

    /**
     * Value of the Property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value of the Property.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Property is required or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * Property is required or not.
     * @return the value
     **/
    public Boolean getIsRequired() {
        return isRequired;
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
        sb.append("AssociatedFleetPropertyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", fleetPropertyType=").append(String.valueOf(this.fleetPropertyType));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociatedFleetPropertyDetails)) {
            return false;
        }

        AssociatedFleetPropertyDetails other = (AssociatedFleetPropertyDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.fleetPropertyType, other.fleetPropertyType)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.fleetPropertyType == null ? 43 : this.fleetPropertyType.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
