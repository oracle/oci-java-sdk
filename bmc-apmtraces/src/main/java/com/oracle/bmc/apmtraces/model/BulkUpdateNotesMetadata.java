/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Metadata about the bulk update notes operation. The bulk update notes operation is atomic and
 * binary. If the processing of any of the attributes in the bulk update notes request results in a
 * processing or validation error, then none of the notes in the update notes request are updated.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BulkUpdateNotesMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkUpdateNotesMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationStatus",
        "operationType",
        "attributesNotesUpdated",
        "syntheticAttributesPinned"
    })
    public BulkUpdateNotesMetadata(
            OperationStatus operationStatus,
            OperationType operationType,
            Integer attributesNotesUpdated,
            Integer syntheticAttributesPinned) {
        super();
        this.operationStatus = operationStatus;
        this.operationType = operationType;
        this.attributesNotesUpdated = attributesNotesUpdated;
        this.syntheticAttributesPinned = syntheticAttributesPinned;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Operation status of the bulk update notes operation. SUCCESS - The bulk updates notes
         * request has succeeded and all the attributes in the bulk update notes request have been
         * updated with the provided notes. The following are error statuses for the bulk update
         * notes operation. EMPTY_ATTRIBUTE_LIST - The bulk update notes request object was empty
         * and did not contain any attributes for which notes had to be updated.
         * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s)
         * that resulted in a validation error, or an attribute that resulted in a processing error.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        /**
         * Operation status of the bulk update notes operation. SUCCESS - The bulk updates notes
         * request has succeeded and all the attributes in the bulk update notes request have been
         * updated with the provided notes. The following are error statuses for the bulk update
         * notes operation. EMPTY_ATTRIBUTE_LIST - The bulk update notes request object was empty
         * and did not contain any attributes for which notes had to be updated.
         * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s)
         * that resulted in a validation error, or an attribute that resulted in a processing error.
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
         * Total number attributes (both string and numeric) in TRACES namespace for which notes
         * were updated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributesNotesUpdated")
        private Integer attributesNotesUpdated;

        /**
         * Total number attributes (both string and numeric) in TRACES namespace for which notes
         * were updated.
         *
         * @param attributesNotesUpdated the value to set
         * @return this builder
         */
        public Builder attributesNotesUpdated(Integer attributesNotesUpdated) {
            this.attributesNotesUpdated = attributesNotesUpdated;
            this.__explicitlySet__.add("attributesNotesUpdated");
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

        public BulkUpdateNotesMetadata build() {
            BulkUpdateNotesMetadata model =
                    new BulkUpdateNotesMetadata(
                            this.operationStatus,
                            this.operationType,
                            this.attributesNotesUpdated,
                            this.syntheticAttributesPinned);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUpdateNotesMetadata model) {
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("attributesNotesUpdated")) {
                this.attributesNotesUpdated(model.getAttributesNotesUpdated());
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
     * Operation status of the bulk update notes operation. SUCCESS - The bulk updates notes request
     * has succeeded and all the attributes in the bulk update notes request have been updated with
     * the provided notes. The following are error statuses for the bulk update notes operation.
     * EMPTY_ATTRIBUTE_LIST - The bulk update notes request object was empty and did not contain any
     * attributes for which notes had to be updated. INVALID_BULK_REQUEST - The bulk request
     * contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an
     * attribute that resulted in a processing error.
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
     * Operation status of the bulk update notes operation. SUCCESS - The bulk updates notes request
     * has succeeded and all the attributes in the bulk update notes request have been updated with
     * the provided notes. The following are error statuses for the bulk update notes operation.
     * EMPTY_ATTRIBUTE_LIST - The bulk update notes request object was empty and did not contain any
     * attributes for which notes had to be updated. INVALID_BULK_REQUEST - The bulk request
     * contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an
     * attribute that resulted in a processing error.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final OperationStatus operationStatus;

    /**
     * Operation status of the bulk update notes operation. SUCCESS - The bulk updates notes request
     * has succeeded and all the attributes in the bulk update notes request have been updated with
     * the provided notes. The following are error statuses for the bulk update notes operation.
     * EMPTY_ATTRIBUTE_LIST - The bulk update notes request object was empty and did not contain any
     * attributes for which notes had to be updated. INVALID_BULK_REQUEST - The bulk request
     * contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an
     * attribute that resulted in a processing error.
     *
     * @return the value
     */
    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    /** Type of operation. */
    public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
        UpdateNotes("UPDATE_NOTES"),

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

    /**
     * Total number attributes (both string and numeric) in TRACES namespace for which notes were
     * updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributesNotesUpdated")
    private final Integer attributesNotesUpdated;

    /**
     * Total number attributes (both string and numeric) in TRACES namespace for which notes were
     * updated.
     *
     * @return the value
     */
    public Integer getAttributesNotesUpdated() {
        return attributesNotesUpdated;
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
        sb.append("BulkUpdateNotesMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", attributesNotesUpdated=").append(String.valueOf(this.attributesNotesUpdated));
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
        if (!(o instanceof BulkUpdateNotesMetadata)) {
            return false;
        }

        BulkUpdateNotesMetadata other = (BulkUpdateNotesMetadata) o;
        return java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(
                        this.attributesNotesUpdated, other.attributesNotesUpdated)
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
                        + (this.attributesNotesUpdated == null
                                ? 43
                                : this.attributesNotesUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.syntheticAttributesPinned == null
                                ? 43
                                : this.syntheticAttributesPinned.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
