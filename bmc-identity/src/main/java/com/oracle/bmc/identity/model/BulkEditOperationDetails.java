/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BulkEditOperationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkEditOperationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"operationType", "definedTags"})
    public BulkEditOperationDetails(
            OperationType operationType,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.operationType = operationType;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An enum-like description of the type of operation.
         *
         * <p>{@code ADD_WHERE_ABSENT} adds a defined tag only if the tag does not already exist on
         * the resource. * {@code SET_WHERE_PRESENT} updates the value for a defined tag only if the
         * tag is present on the resource. * {@code ADD_OR_SET} combines the first two operations to
         * add a defined tag if it does not already exist on the resource or update the value for a
         * defined tag only if the tag is present on the resource. * {@code REMOVE} removes the
         * defined tag from the resource. The tag is removed from the resource regardless of the tag
         * value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * An enum-like description of the type of operation.
         *
         * <p>{@code ADD_WHERE_ABSENT} adds a defined tag only if the tag does not already exist on
         * the resource. * {@code SET_WHERE_PRESENT} updates the value for a defined tag only if the
         * tag is present on the resource. * {@code ADD_OR_SET} combines the first two operations to
         * add a defined tag if it does not already exist on the resource or update the value for a
         * defined tag only if the tag is present on the resource. * {@code REMOVE} removes the
         * defined tag from the resource. The tag is removed from the resource regardless of the tag
         * value.
         *
         * @param operationType the value to set
         * @return this builder
         */
        public Builder operationType(OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkEditOperationDetails build() {
            BulkEditOperationDetails model =
                    new BulkEditOperationDetails(this.operationType, this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkEditOperationDetails model) {
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /**
     * An enum-like description of the type of operation.
     *
     * <p>{@code ADD_WHERE_ABSENT} adds a defined tag only if the tag does not already exist on the
     * resource. * {@code SET_WHERE_PRESENT} updates the value for a defined tag only if the tag is
     * present on the resource. * {@code ADD_OR_SET} combines the first two operations to add a
     * defined tag if it does not already exist on the resource or update the value for a defined
     * tag only if the tag is present on the resource. * {@code REMOVE} removes the defined tag from
     * the resource. The tag is removed from the resource regardless of the tag value.
     */
    public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
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
     *
     * <p>{@code ADD_WHERE_ABSENT} adds a defined tag only if the tag does not already exist on the
     * resource. * {@code SET_WHERE_PRESENT} updates the value for a defined tag only if the tag is
     * present on the resource. * {@code ADD_OR_SET} combines the first two operations to add a
     * defined tag if it does not already exist on the resource or update the value for a defined
     * tag only if the tag is present on the resource. * {@code REMOVE} removes the defined tag from
     * the resource. The tag is removed from the resource regardless of the tag value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * An enum-like description of the type of operation.
     *
     * <p>{@code ADD_WHERE_ABSENT} adds a defined tag only if the tag does not already exist on the
     * resource. * {@code SET_WHERE_PRESENT} updates the value for a defined tag only if the tag is
     * present on the resource. * {@code ADD_OR_SET} combines the first two operations to add a
     * defined tag if it does not already exist on the resource or update the value for a defined
     * tag only if the tag is present on the resource. * {@code REMOVE} removes the defined tag from
     * the resource. The tag is removed from the resource regardless of the tag value.
     *
     * @return the value
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("BulkEditOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("operationType=").append(String.valueOf(this.operationType));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkEditOperationDetails)) {
            return false;
        }

        BulkEditOperationDetails other = (BulkEditOperationDetails) o;
        return java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
