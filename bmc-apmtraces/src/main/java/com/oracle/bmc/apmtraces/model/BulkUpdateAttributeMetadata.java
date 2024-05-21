/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Metadata about the bulk attribute update operation.  The bulk attribute update operation is atomic and binary.  If the processing of any of the attributes
 * in the bulk attribute update request results in a processing or validation error, then none of the attributes updated.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkUpdateAttributeMetadata.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkUpdateAttributeMetadata
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationStatus",
        "operationType",
        "attributesUpdated",
        "syntheticAttributesUpdated"
    })
    public BulkUpdateAttributeMetadata(
            OperationStatus operationStatus,
            OperationType operationType,
            Integer attributesUpdated,
            Integer syntheticAttributesUpdated) {
        super();
        this.operationStatus = operationStatus;
        this.operationType = operationType;
        this.attributesUpdated = attributesUpdated;
        this.syntheticAttributesUpdated = syntheticAttributesUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Operation status of the bulk update attribute operation.
         * SUCCESS - The bulk attribute update request has succeeded and all the attributes in the request have been updated.
         * The following are error statuses for the bulk update attributes operation.
         * EMPTY_ATTRIBUTE_LIST - The bulk update attributes request object was empty and did not contain any attributes for which properties had to be updated.
         * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an attribute that resulted
         * in a processing error.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        /**
         * Operation status of the bulk update attribute operation.
         * SUCCESS - The bulk attribute update request has succeeded and all the attributes in the request have been updated.
         * The following are error statuses for the bulk update attributes operation.
         * EMPTY_ATTRIBUTE_LIST - The bulk update attributes request object was empty and did not contain any attributes for which properties had to be updated.
         * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an attribute that resulted
         * in a processing error.
         *
         * @param operationStatus the value to set
         * @return this builder
         **/
        public Builder operationStatus(OperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }
        /**
         * Type of operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * Type of operation.
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
         * Total number attributes (both string and numeric) in TRACES namespace for which properties were updated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributesUpdated")
        private Integer attributesUpdated;

        /**
         * Total number attributes (both string and numeric) in TRACES namespace for which properties were updated.
         *
         * @param attributesUpdated the value to set
         * @return this builder
         **/
        public Builder attributesUpdated(Integer attributesUpdated) {
            this.attributesUpdated = attributesUpdated;
            this.__explicitlySet__.add("attributesUpdated");
            return this;
        }
        /**
         * Total number attributes (both string and numeric) in SYNTHETIC namespace for which properties were updated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("syntheticAttributesUpdated")
        private Integer syntheticAttributesUpdated;

        /**
         * Total number attributes (both string and numeric) in SYNTHETIC namespace for which properties were updated.
         *
         * @param syntheticAttributesUpdated the value to set
         * @return this builder
         **/
        public Builder syntheticAttributesUpdated(Integer syntheticAttributesUpdated) {
            this.syntheticAttributesUpdated = syntheticAttributesUpdated;
            this.__explicitlySet__.add("syntheticAttributesUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUpdateAttributeMetadata build() {
            BulkUpdateAttributeMetadata model =
                    new BulkUpdateAttributeMetadata(
                            this.operationStatus,
                            this.operationType,
                            this.attributesUpdated,
                            this.syntheticAttributesUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUpdateAttributeMetadata model) {
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("attributesUpdated")) {
                this.attributesUpdated(model.getAttributesUpdated());
            }
            if (model.wasPropertyExplicitlySet("syntheticAttributesUpdated")) {
                this.syntheticAttributesUpdated(model.getSyntheticAttributesUpdated());
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
     * Operation status of the bulk update attribute operation.
     * SUCCESS - The bulk attribute update request has succeeded and all the attributes in the request have been updated.
     * The following are error statuses for the bulk update attributes operation.
     * EMPTY_ATTRIBUTE_LIST - The bulk update attributes request object was empty and did not contain any attributes for which properties had to be updated.
     * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an attribute that resulted
     * in a processing error.
     *
     **/
    public enum OperationStatus {
        Success("SUCCESS"),
        EmptyAttributeList("EMPTY_ATTRIBUTE_LIST"),
        InvalidBulkRequest("INVALID_BULK_REQUEST"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationStatus.class);

        private final String value;
        private static java.util.Map<String, OperationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationStatus v : OperationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Operation status of the bulk update attribute operation.
     * SUCCESS - The bulk attribute update request has succeeded and all the attributes in the request have been updated.
     * The following are error statuses for the bulk update attributes operation.
     * EMPTY_ATTRIBUTE_LIST - The bulk update attributes request object was empty and did not contain any attributes for which properties had to be updated.
     * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an attribute that resulted
     * in a processing error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final OperationStatus operationStatus;

    /**
     * Operation status of the bulk update attribute operation.
     * SUCCESS - The bulk attribute update request has succeeded and all the attributes in the request have been updated.
     * The following are error statuses for the bulk update attributes operation.
     * EMPTY_ATTRIBUTE_LIST - The bulk update attributes request object was empty and did not contain any attributes for which properties had to be updated.
     * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an attribute that resulted
     * in a processing error.
     *
     * @return the value
     **/
    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    /**
     * Type of operation.
     *
     **/
    public enum OperationType {
        UpdateAttributeProperties("UPDATE_ATTRIBUTE_PROPERTIES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationType.class);

        private final String value;
        private static java.util.Map<String, OperationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationType v : OperationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * Type of operation.
     *
     * @return the value
     **/
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Total number attributes (both string and numeric) in TRACES namespace for which properties were updated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributesUpdated")
    private final Integer attributesUpdated;

    /**
     * Total number attributes (both string and numeric) in TRACES namespace for which properties were updated.
     *
     * @return the value
     **/
    public Integer getAttributesUpdated() {
        return attributesUpdated;
    }

    /**
     * Total number attributes (both string and numeric) in SYNTHETIC namespace for which properties were updated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("syntheticAttributesUpdated")
    private final Integer syntheticAttributesUpdated;

    /**
     * Total number attributes (both string and numeric) in SYNTHETIC namespace for which properties were updated.
     *
     * @return the value
     **/
    public Integer getSyntheticAttributesUpdated() {
        return syntheticAttributesUpdated;
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
        sb.append("BulkUpdateAttributeMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", attributesUpdated=").append(String.valueOf(this.attributesUpdated));
        sb.append(", syntheticAttributesUpdated=")
                .append(String.valueOf(this.syntheticAttributesUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUpdateAttributeMetadata)) {
            return false;
        }

        BulkUpdateAttributeMetadata other = (BulkUpdateAttributeMetadata) o;
        return java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.attributesUpdated, other.attributesUpdated)
                && java.util.Objects.equals(
                        this.syntheticAttributesUpdated, other.syntheticAttributesUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationStatus == null ? 43 : this.operationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result =
                (result * PRIME)
                        + (this.attributesUpdated == null ? 43 : this.attributesUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.syntheticAttributesUpdated == null
                                ? 43
                                : this.syntheticAttributesUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
