/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Metadata about the bulk unpin operation.  The bulk unpin operation is atomic and binary.  If the processing of any of the attributes
 * in the bulk unpin request results in a processing or validation error, then none of the attributes in the request are unpinned.
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
    builder = BulkUnpinMetadata.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkUnpinMetadata extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationStatus",
        "operationType",
        "attributesUnpinned",
        "syntheticAttributesUnpinned"
    })
    public BulkUnpinMetadata(
            OperationStatus operationStatus,
            OperationType operationType,
            Integer attributesUnpinned,
            Integer syntheticAttributesUnpinned) {
        super();
        this.operationStatus = operationStatus;
        this.operationType = operationType;
        this.attributesUnpinned = attributesUnpinned;
        this.syntheticAttributesUnpinned = syntheticAttributesUnpinned;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Operation status of the bulk unpin operation.
         * SUCCESS - The bulk unpin operation has succeeded and all the attributes in the bulk unpin request have been unpinned by this operation.
         * The following are error statuses for the bulk unpin operation.
         * EMPTY_ATTRIBUTE_LIST - The bulk unpin request object was empty and did not contain any attributes to be unpinned.
         * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an attribute that resulted
         * in a processing error.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        /**
         * Operation status of the bulk unpin operation.
         * SUCCESS - The bulk unpin operation has succeeded and all the attributes in the bulk unpin request have been unpinned by this operation.
         * The following are error statuses for the bulk unpin operation.
         * EMPTY_ATTRIBUTE_LIST - The bulk unpin request object was empty and did not contain any attributes to be unpinned.
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
         * Total number attributes (both string and numeric) in TRACES namespace that were unpinned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributesUnpinned")
        private Integer attributesUnpinned;

        /**
         * Total number attributes (both string and numeric) in TRACES namespace that were unpinned.
         *
         * @param attributesUnpinned the value to set
         * @return this builder
         **/
        public Builder attributesUnpinned(Integer attributesUnpinned) {
            this.attributesUnpinned = attributesUnpinned;
            this.__explicitlySet__.add("attributesUnpinned");
            return this;
        }
        /**
         * Total number attributes (both string and numeric) in SYNTHETIC namespace that were unpinned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("syntheticAttributesUnpinned")
        private Integer syntheticAttributesUnpinned;

        /**
         * Total number attributes (both string and numeric) in SYNTHETIC namespace that were unpinned.
         *
         * @param syntheticAttributesUnpinned the value to set
         * @return this builder
         **/
        public Builder syntheticAttributesUnpinned(Integer syntheticAttributesUnpinned) {
            this.syntheticAttributesUnpinned = syntheticAttributesUnpinned;
            this.__explicitlySet__.add("syntheticAttributesUnpinned");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUnpinMetadata build() {
            BulkUnpinMetadata model =
                    new BulkUnpinMetadata(
                            this.operationStatus,
                            this.operationType,
                            this.attributesUnpinned,
                            this.syntheticAttributesUnpinned);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUnpinMetadata model) {
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("attributesUnpinned")) {
                this.attributesUnpinned(model.getAttributesUnpinned());
            }
            if (model.wasPropertyExplicitlySet("syntheticAttributesUnpinned")) {
                this.syntheticAttributesUnpinned(model.getSyntheticAttributesUnpinned());
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
     * Operation status of the bulk unpin operation.
     * SUCCESS - The bulk unpin operation has succeeded and all the attributes in the bulk unpin request have been unpinned by this operation.
     * The following are error statuses for the bulk unpin operation.
     * EMPTY_ATTRIBUTE_LIST - The bulk unpin request object was empty and did not contain any attributes to be unpinned.
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
     * Operation status of the bulk unpin operation.
     * SUCCESS - The bulk unpin operation has succeeded and all the attributes in the bulk unpin request have been unpinned by this operation.
     * The following are error statuses for the bulk unpin operation.
     * EMPTY_ATTRIBUTE_LIST - The bulk unpin request object was empty and did not contain any attributes to be unpinned.
     * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an attribute that resulted
     * in a processing error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final OperationStatus operationStatus;

    /**
     * Operation status of the bulk unpin operation.
     * SUCCESS - The bulk unpin operation has succeeded and all the attributes in the bulk unpin request have been unpinned by this operation.
     * The following are error statuses for the bulk unpin operation.
     * EMPTY_ATTRIBUTE_LIST - The bulk unpin request object was empty and did not contain any attributes to be unpinned.
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
        Unpin("UNPIN"),

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
     * Total number attributes (both string and numeric) in TRACES namespace that were unpinned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributesUnpinned")
    private final Integer attributesUnpinned;

    /**
     * Total number attributes (both string and numeric) in TRACES namespace that were unpinned.
     *
     * @return the value
     **/
    public Integer getAttributesUnpinned() {
        return attributesUnpinned;
    }

    /**
     * Total number attributes (both string and numeric) in SYNTHETIC namespace that were unpinned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("syntheticAttributesUnpinned")
    private final Integer syntheticAttributesUnpinned;

    /**
     * Total number attributes (both string and numeric) in SYNTHETIC namespace that were unpinned.
     *
     * @return the value
     **/
    public Integer getSyntheticAttributesUnpinned() {
        return syntheticAttributesUnpinned;
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
        sb.append("BulkUnpinMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", attributesUnpinned=").append(String.valueOf(this.attributesUnpinned));
        sb.append(", syntheticAttributesUnpinned=")
                .append(String.valueOf(this.syntheticAttributesUnpinned));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUnpinMetadata)) {
            return false;
        }

        BulkUnpinMetadata other = (BulkUnpinMetadata) o;
        return java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.attributesUnpinned, other.attributesUnpinned)
                && java.util.Objects.equals(
                        this.syntheticAttributesUnpinned, other.syntheticAttributesUnpinned)
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
                        + (this.attributesUnpinned == null
                                ? 43
                                : this.attributesUnpinned.hashCode());
        result =
                (result * PRIME)
                        + (this.syntheticAttributesUnpinned == null
                                ? 43
                                : this.syntheticAttributesUnpinned.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
