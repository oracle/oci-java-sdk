/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the associated component.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AssociatedComponent.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssociatedComponent extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"componentId", "componentType", "associationType"})
    public AssociatedComponent(
            String componentId,
            ExternalDbSystemComponentType componentType,
            AssociationType associationType) {
        super();
        this.componentId = componentId;
        this.componentType = componentType;
        this.associationType = associationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier of the associated component.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("componentId")
        private String componentId;

        /**
         * The identifier of the associated component.
         * @param componentId the value to set
         * @return this builder
         **/
        public Builder componentId(String componentId) {
            this.componentId = componentId;
            this.__explicitlySet__.add("componentId");
            return this;
        }
        /**
         * The type of associated component.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("componentType")
        private ExternalDbSystemComponentType componentType;

        /**
         * The type of associated component.
         * @param componentType the value to set
         * @return this builder
         **/
        public Builder componentType(ExternalDbSystemComponentType componentType) {
            this.componentType = componentType;
            this.__explicitlySet__.add("componentType");
            return this;
        }
        /**
         * The association type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associationType")
        private AssociationType associationType;

        /**
         * The association type.
         * @param associationType the value to set
         * @return this builder
         **/
        public Builder associationType(AssociationType associationType) {
            this.associationType = associationType;
            this.__explicitlySet__.add("associationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociatedComponent build() {
            AssociatedComponent model =
                    new AssociatedComponent(
                            this.componentId, this.componentType, this.associationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociatedComponent model) {
            if (model.wasPropertyExplicitlySet("componentId")) {
                this.componentId(model.getComponentId());
            }
            if (model.wasPropertyExplicitlySet("componentType")) {
                this.componentType(model.getComponentType());
            }
            if (model.wasPropertyExplicitlySet("associationType")) {
                this.associationType(model.getAssociationType());
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
     * The identifier of the associated component.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("componentId")
    private final String componentId;

    /**
     * The identifier of the associated component.
     * @return the value
     **/
    public String getComponentId() {
        return componentId;
    }

    /**
     * The type of associated component.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("componentType")
    private final ExternalDbSystemComponentType componentType;

    /**
     * The type of associated component.
     * @return the value
     **/
    public ExternalDbSystemComponentType getComponentType() {
        return componentType;
    }

    /**
     * The association type.
     **/
    public enum AssociationType {
        Contains("CONTAINS"),
        Uses("USES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AssociationType.class);

        private final String value;
        private static java.util.Map<String, AssociationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AssociationType v : AssociationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AssociationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssociationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AssociationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The association type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationType")
    private final AssociationType associationType;

    /**
     * The association type.
     * @return the value
     **/
    public AssociationType getAssociationType() {
        return associationType;
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
        sb.append("AssociatedComponent(");
        sb.append("super=").append(super.toString());
        sb.append("componentId=").append(String.valueOf(this.componentId));
        sb.append(", componentType=").append(String.valueOf(this.componentType));
        sb.append(", associationType=").append(String.valueOf(this.associationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociatedComponent)) {
            return false;
        }

        AssociatedComponent other = (AssociatedComponent) o;
        return java.util.Objects.equals(this.componentId, other.componentId)
                && java.util.Objects.equals(this.componentType, other.componentType)
                && java.util.Objects.equals(this.associationType, other.associationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.componentId == null ? 43 : this.componentId.hashCode());
        result =
                (result * PRIME)
                        + (this.componentType == null ? 43 : this.componentType.hashCode());
        result =
                (result * PRIME)
                        + (this.associationType == null ? 43 : this.associationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
