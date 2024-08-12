/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Related resource Ids to include in the discovery.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GiResourceIdFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GiResourceIdFilter extends GiFleetDiscoveryFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /**
         * Type of resource to match in the discovery.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private EntityType entityType;

        /**
         * Type of resource to match in the discovery.
         *
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(EntityType entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * Related resource Ids to include in the discovery.
         * All must match the specified entityType.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifiers")
        private java.util.List<String> identifiers;

        /**
         * Related resource Ids to include in the discovery.
         * All must match the specified entityType.
         *
         * @param identifiers the value to set
         * @return this builder
         **/
        public Builder identifiers(java.util.List<String> identifiers) {
            this.identifiers = identifiers;
            this.__explicitlySet__.add("identifiers");
            return this;
        }
        /**
         * Type of join for each element in this filter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private FleetDiscoveryOperators operator;

        /**
         * Type of join for each element in this filter.
         *
         * @param operator the value to set
         * @return this builder
         **/
        public Builder operator(FleetDiscoveryOperators operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GiResourceIdFilter build() {
            GiResourceIdFilter model =
                    new GiResourceIdFilter(
                            this.mode, this.entityType, this.identifiers, this.operator);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GiResourceIdFilter model) {
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("identifiers")) {
                this.identifiers(model.getIdentifiers());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
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
    public GiResourceIdFilter(
            Mode mode,
            EntityType entityType,
            java.util.List<String> identifiers,
            FleetDiscoveryOperators operator) {
        super(mode);
        this.entityType = entityType;
        this.identifiers = identifiers;
        this.operator = operator;
    }

    /**
     * Type of resource to match in the discovery.
     *
     **/
    public enum EntityType {
        Databasesoftwareimage("DATABASESOFTWAREIMAGE"),
        Exadatainfrastructure("EXADATAINFRASTRUCTURE"),
        Cloudexadatainfrastructure("CLOUDEXADATAINFRASTRUCTURE"),
        Vmcluster("VMCLUSTER"),
        Cloudvmcluster("CLOUDVMCLUSTER"),
        Fsucollection("FSUCOLLECTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EntityType.class);

        private final String value;
        private static java.util.Map<String, EntityType> map;

        static {
            map = new java.util.HashMap<>();
            for (EntityType v : EntityType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EntityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EntityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EntityType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of resource to match in the discovery.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final EntityType entityType;

    /**
     * Type of resource to match in the discovery.
     *
     * @return the value
     **/
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * Related resource Ids to include in the discovery.
     * All must match the specified entityType.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifiers")
    private final java.util.List<String> identifiers;

    /**
     * Related resource Ids to include in the discovery.
     * All must match the specified entityType.
     *
     * @return the value
     **/
    public java.util.List<String> getIdentifiers() {
        return identifiers;
    }

    /**
     * Type of join for each element in this filter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final FleetDiscoveryOperators operator;

    /**
     * Type of join for each element in this filter.
     *
     * @return the value
     **/
    public FleetDiscoveryOperators getOperator() {
        return operator;
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
        sb.append("GiResourceIdFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", identifiers=").append(String.valueOf(this.identifiers));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GiResourceIdFilter)) {
            return false;
        }

        GiResourceIdFilter other = (GiResourceIdFilter) o;
        return java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.identifiers, other.identifiers)
                && java.util.Objects.equals(this.operator, other.operator)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.identifiers == null ? 43 : this.identifiers.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        return result;
    }
}
