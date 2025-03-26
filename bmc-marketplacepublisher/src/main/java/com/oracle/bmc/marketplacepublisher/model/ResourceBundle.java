/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Resource Bundle associated with an Offer
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResourceBundle.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceBundle extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "quantity", "unitOfMeasurement", "resourceIds"})
    public ResourceBundle(
            Type type,
            Long quantity,
            UnitOfMeasurement unitOfMeasurement,
            java.util.List<String> resourceIds) {
        super();
        this.type = type;
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
        this.resourceIds = resourceIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of resources in the bundle
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of resources in the bundle
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The quantity of a resources associated with the bundle
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Long quantity;

        /**
         * The quantity of a resources associated with the bundle
         * @param quantity the value to set
         * @return this builder
         **/
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /**
         * The unit of measurement for the resource bundle
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasurement")
        private UnitOfMeasurement unitOfMeasurement;

        /**
         * The unit of measurement for the resource bundle
         * @param unitOfMeasurement the value to set
         * @return this builder
         **/
        public Builder unitOfMeasurement(UnitOfMeasurement unitOfMeasurement) {
            this.unitOfMeasurement = unitOfMeasurement;
            this.__explicitlySet__.add("unitOfMeasurement");
            return this;
        }
        /**
         * the ids of the resources in the Offer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceIds")
        private java.util.List<String> resourceIds;

        /**
         * the ids of the resources in the Offer
         * @param resourceIds the value to set
         * @return this builder
         **/
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            this.__explicitlySet__.add("resourceIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceBundle build() {
            ResourceBundle model =
                    new ResourceBundle(
                            this.type, this.quantity, this.unitOfMeasurement, this.resourceIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceBundle model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("unitOfMeasurement")) {
                this.unitOfMeasurement(model.getUnitOfMeasurement());
            }
            if (model.wasPropertyExplicitlySet("resourceIds")) {
                this.resourceIds(model.getResourceIds());
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
     * The type of resources in the bundle
     **/
    public enum Type {
        Listing("LISTING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of resources in the bundle
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of resources in the bundle
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The quantity of a resources associated with the bundle
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final Long quantity;

    /**
     * The quantity of a resources associated with the bundle
     * @return the value
     **/
    public Long getQuantity() {
        return quantity;
    }

    /**
     * The unit of measurement for the resource bundle
     **/
    public enum UnitOfMeasurement {
        OcpuPerHour("OCPU_PER_HOUR"),
        InstancePerHour("INSTANCE_PER_HOUR"),
        Credits("CREDITS"),
        Instances("INSTANCES"),
        Nodes("NODES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UnitOfMeasurement.class);

        private final String value;
        private static java.util.Map<String, UnitOfMeasurement> map;

        static {
            map = new java.util.HashMap<>();
            for (UnitOfMeasurement v : UnitOfMeasurement.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UnitOfMeasurement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UnitOfMeasurement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UnitOfMeasurement', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The unit of measurement for the resource bundle
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasurement")
    private final UnitOfMeasurement unitOfMeasurement;

    /**
     * The unit of measurement for the resource bundle
     * @return the value
     **/
    public UnitOfMeasurement getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * the ids of the resources in the Offer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceIds")
    private final java.util.List<String> resourceIds;

    /**
     * the ids of the resources in the Offer
     * @return the value
     **/
    public java.util.List<String> getResourceIds() {
        return resourceIds;
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
        sb.append("ResourceBundle(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", unitOfMeasurement=").append(String.valueOf(this.unitOfMeasurement));
        sb.append(", resourceIds=").append(String.valueOf(this.resourceIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceBundle)) {
            return false;
        }

        ResourceBundle other = (ResourceBundle) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.unitOfMeasurement, other.unitOfMeasurement)
                && java.util.Objects.equals(this.resourceIds, other.resourceIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result =
                (result * PRIME)
                        + (this.unitOfMeasurement == null ? 43 : this.unitOfMeasurement.hashCode());
        result = (result * PRIME) + (this.resourceIds == null ? 43 : this.resourceIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
