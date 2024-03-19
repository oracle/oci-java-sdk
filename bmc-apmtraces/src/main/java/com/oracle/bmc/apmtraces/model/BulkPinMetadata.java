/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Metadata about the bulk pin operation. The bulk pin operation is atomic and binary. If the
 * processing of any of the attributes in the bulk pin request results in a processing or validation
 * error, then none of the attributes in the request are pinned. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BulkPinMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkPinMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationStatus",
        "operationType",
        "attributesPinned",
        "syntheticAttributesPinned"
    })
    public BulkPinMetadata(
            OperationStatus operationStatus,
            OperationType operationType,
            Integer attributesPinned,
            Integer syntheticAttributesPinned) {
        super();
        this.operationStatus = operationStatus;
        this.operationType = operationType;
        this.attributesPinned = attributesPinned;
        this.syntheticAttributesPinned = syntheticAttributesPinned;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Operation status of the bulk pin operation. SUCCESS - The bulk pin operation has
         * succeeded and all the attributes in the bulk pin request have been pinned by this
         * operation or pinned earlier. The following are error statuses for the bulk pin operation.
         * EMPTY_ATTRIBUTE_LIST - The bulk pin request object was empty and did not contain any
         * attributes to be pinned. INVALID_BULK_REQUEST - The bulk request contains invalid
         * attribute(s), or attribute(s) that resulted in a validation error, or an attribute that
         * resulted in a processing error.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        /**
         * Operation status of the bulk pin operation. SUCCESS - The bulk pin operation has
         * succeeded and all the attributes in the bulk pin request have been pinned by this
         * operation or pinned earlier. The following are error statuses for the bulk pin operation.
         * EMPTY_ATTRIBUTE_LIST - The bulk pin request object was empty and did not contain any
         * attributes to be pinned. INVALID_BULK_REQUEST - The bulk request contains invalid
         * attribute(s), or attribute(s) that resulted in a validation error, or an attribute that
         * resulted in a processing error.
         *
         * @param operationStatus the value to set
         * @return this builder
         */
        public Builder operationStatus(OperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }
        /** Type of operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * Type of operation.
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
         * Total number attributes (both string and numeric) in TRACES namespace that were pinned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributesPinned")
        private Integer attributesPinned;

        /**
         * Total number attributes (both string and numeric) in TRACES namespace that were pinned.
         *
         * @param attributesPinned the value to set
         * @return this builder
         */
        public Builder attributesPinned(Integer attributesPinned) {
            this.attributesPinned = attributesPinned;
            this.__explicitlySet__.add("attributesPinned");
            return this;
        }
        /**
         * Total number attributes (both string and numeric) in SYNTHETIC namespace that were
         * pinned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("syntheticAttributesPinned")
        private Integer syntheticAttributesPinned;

        /**
         * Total number attributes (both string and numeric) in SYNTHETIC namespace that were
         * pinned.
         *
         * @param syntheticAttributesPinned the value to set
         * @return this builder
         */
        public Builder syntheticAttributesPinned(Integer syntheticAttributesPinned) {
            this.syntheticAttributesPinned = syntheticAttributesPinned;
            this.__explicitlySet__.add("syntheticAttributesPinned");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkPinMetadata build() {
            BulkPinMetadata model =
                    new BulkPinMetadata(
                            this.operationStatus,
                            this.operationType,
                            this.attributesPinned,
                            this.syntheticAttributesPinned);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkPinMetadata model) {
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("attributesPinned")) {
                this.attributesPinned(model.getAttributesPinned());
            }
            if (model.wasPropertyExplicitlySet("syntheticAttributesPinned")) {
                this.syntheticAttributesPinned(model.getSyntheticAttributesPinned());
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
     * Operation status of the bulk pin operation. SUCCESS - The bulk pin operation has succeeded
     * and all the attributes in the bulk pin request have been pinned by this operation or pinned
     * earlier. The following are error statuses for the bulk pin operation. EMPTY_ATTRIBUTE_LIST -
     * The bulk pin request object was empty and did not contain any attributes to be pinned.
     * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that
     * resulted in a validation error, or an attribute that resulted in a processing error.
     */
    public enum OperationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Success("SUCCESS"),
        EmptyAttributeList("EMPTY_ATTRIBUTE_LIST"),
        InvalidBulkRequest("INVALID_BULK_REQUEST"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * Operation status of the bulk pin operation. SUCCESS - The bulk pin operation has succeeded
     * and all the attributes in the bulk pin request have been pinned by this operation or pinned
     * earlier. The following are error statuses for the bulk pin operation. EMPTY_ATTRIBUTE_LIST -
     * The bulk pin request object was empty and did not contain any attributes to be pinned.
     * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that
     * resulted in a validation error, or an attribute that resulted in a processing error.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final OperationStatus operationStatus;

    /**
     * Operation status of the bulk pin operation. SUCCESS - The bulk pin operation has succeeded
     * and all the attributes in the bulk pin request have been pinned by this operation or pinned
     * earlier. The following are error statuses for the bulk pin operation. EMPTY_ATTRIBUTE_LIST -
     * The bulk pin request object was empty and did not contain any attributes to be pinned.
     * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that
     * resulted in a validation error, or an attribute that resulted in a processing error.
     *
     * @return the value
     */
    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    /** Type of operation. */
    public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
        Pin("PIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Type of operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * Type of operation.
     *
     * @return the value
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /** Total number attributes (both string and numeric) in TRACES namespace that were pinned. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributesPinned")
    private final Integer attributesPinned;

    /**
     * Total number attributes (both string and numeric) in TRACES namespace that were pinned.
     *
     * @return the value
     */
    public Integer getAttributesPinned() {
        return attributesPinned;
    }

    /**
     * Total number attributes (both string and numeric) in SYNTHETIC namespace that were pinned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syntheticAttributesPinned")
    private final Integer syntheticAttributesPinned;

    /**
     * Total number attributes (both string and numeric) in SYNTHETIC namespace that were pinned.
     *
     * @return the value
     */
    public Integer getSyntheticAttributesPinned() {
        return syntheticAttributesPinned;
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
        sb.append("BulkPinMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", attributesPinned=").append(String.valueOf(this.attributesPinned));
        sb.append(", syntheticAttributesPinned=")
                .append(String.valueOf(this.syntheticAttributesPinned));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkPinMetadata)) {
            return false;
        }

        BulkPinMetadata other = (BulkPinMetadata) o;
        return java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.attributesPinned, other.attributesPinned)
                && java.util.Objects.equals(
                        this.syntheticAttributesPinned, other.syntheticAttributesPinned)
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
                        + (this.attributesPinned == null ? 43 : this.attributesPinned.hashCode());
        result =
                (result * PRIME)
                        + (this.syntheticAttributesPinned == null
                                ? 43
                                : this.syntheticAttributesPinned.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
