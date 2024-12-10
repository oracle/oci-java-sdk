/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkEditSecurityAttributeOperationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkEditSecurityAttributeOperationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"operationType", "securityAttributes"})
    public BulkEditSecurityAttributeOperationDetails(
            OperationType operationType,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
        super();
        this.operationType = operationType;
        this.securityAttributes = securityAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An enum-like description of the type of operation.
         * <p>
         * {@code ADD_WHERE_ABSENT} adds a security attribute only if it does not already exist on the resource.
         * * {@code SET_WHERE_PRESENT} updates the value for a security attribute only if it is present on the resource.
         * * {@code ADD_OR_SET} combines the first two operations to add a security attribute if it does not already exist on the resource
         * or update the value if it is present on the resource.
         * * {@code REMOVE} removes the security attribute from the resource. It's removed from the resource regardless of the value.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * An enum-like description of the type of operation.
         * <p>
         * {@code ADD_WHERE_ABSENT} adds a security attribute only if it does not already exist on the resource.
         * * {@code SET_WHERE_PRESENT} updates the value for a security attribute only if it is present on the resource.
         * * {@code ADD_OR_SET} combines the first two operations to add a security attribute if it does not already exist on the resource
         * or update the value if it is present on the resource.
         * * {@code REMOVE} removes the security attribute from the resource. It's removed from the resource regardless of the value.
         *
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * Security attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         **/
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkEditSecurityAttributeOperationDetails build() {
            BulkEditSecurityAttributeOperationDetails model =
                    new BulkEditSecurityAttributeOperationDetails(
                            this.operationType, this.securityAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkEditSecurityAttributeOperationDetails model) {
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
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
     * An enum-like description of the type of operation.
     * <p>
     * {@code ADD_WHERE_ABSENT} adds a security attribute only if it does not already exist on the resource.
     * * {@code SET_WHERE_PRESENT} updates the value for a security attribute only if it is present on the resource.
     * * {@code ADD_OR_SET} combines the first two operations to add a security attribute if it does not already exist on the resource
     * or update the value if it is present on the resource.
     * * {@code REMOVE} removes the security attribute from the resource. It's removed from the resource regardless of the value.
     *
     **/
    public enum OperationType {
        AddWhereAbsent("ADD_WHERE_ABSENT"),
        SetWherePresent("SET_WHERE_PRESENT"),
        AddOrSet("ADD_OR_SET"),
        Remove("REMOVE"),
        ;

        private final String value;
        private static java.util.Map<String, OperationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationType v : OperationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        OperationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OperationType: " + key);
        }
    };
    /**
     * An enum-like description of the type of operation.
     * <p>
     * {@code ADD_WHERE_ABSENT} adds a security attribute only if it does not already exist on the resource.
     * * {@code SET_WHERE_PRESENT} updates the value for a security attribute only if it is present on the resource.
     * * {@code ADD_OR_SET} combines the first two operations to add a security attribute if it does not already exist on the resource
     * or update the value if it is present on the resource.
     * * {@code REMOVE} removes the security attribute from the resource. It's removed from the resource regardless of the value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * An enum-like description of the type of operation.
     * <p>
     * {@code ADD_WHERE_ABSENT} adds a security attribute only if it does not already exist on the resource.
     * * {@code SET_WHERE_PRESENT} updates the value for a security attribute only if it is present on the resource.
     * * {@code ADD_OR_SET} combines the first two operations to add a security attribute if it does not already exist on the resource
     * or update the value if it is present on the resource.
     * * {@code REMOVE} removes the security attribute from the resource. It's removed from the resource regardless of the value.
     *
     * @return the value
     **/
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Security attributes for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security attributes for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
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
        sb.append("BulkEditSecurityAttributeOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("operationType=").append(String.valueOf(this.operationType));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkEditSecurityAttributeOperationDetails)) {
            return false;
        }

        BulkEditSecurityAttributeOperationDetails other =
                (BulkEditSecurityAttributeOperationDetails) o;
        return java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
