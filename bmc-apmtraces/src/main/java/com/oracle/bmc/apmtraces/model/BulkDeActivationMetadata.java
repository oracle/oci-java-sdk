/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Metadata about the bulk deactivation operation.  The bulk deactivation operation is atomic and binary.  If the processing of any of the attributes
 * in the bulk deactivation request results in a processing or validation error, then none of the attributes in the request are deactivated.
 * The bulk deactivation request succeeds only when all the attributes in the bulk deactivation request are processed and they get a successful
 * attributeStatus back.
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
    builder = BulkDeActivationMetadata.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkDeActivationMetadata
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationStatus",
        "operationType",
        "attributesDeActivated",
        "syntheticAttributesDeActivated",
        "availableStringAttributes",
        "availableNumericAttributes",
        "availableSyntheticStringAttributes",
        "availableSyntheticNumericAttributes"
    })
    public BulkDeActivationMetadata(
            OperationStatus operationStatus,
            OperationType operationType,
            Integer attributesDeActivated,
            Integer syntheticAttributesDeActivated,
            Integer availableStringAttributes,
            Integer availableNumericAttributes,
            Integer availableSyntheticStringAttributes,
            Integer availableSyntheticNumericAttributes) {
        super();
        this.operationStatus = operationStatus;
        this.operationType = operationType;
        this.attributesDeActivated = attributesDeActivated;
        this.syntheticAttributesDeActivated = syntheticAttributesDeActivated;
        this.availableStringAttributes = availableStringAttributes;
        this.availableNumericAttributes = availableNumericAttributes;
        this.availableSyntheticStringAttributes = availableSyntheticStringAttributes;
        this.availableSyntheticNumericAttributes = availableSyntheticNumericAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Operation status of the bulk deactivation operation.  The bulk deactivation operation could have either a success or an error status as defined below.  Note that
         * if a bulk operation has not succeeded, we do not deactivate any tags in the request set.
         * SUCCESS - The bulk deactivation operation has succeeded and all the attributes in the bulk deactivation request have been deactivated by this operation or deactivated earlier.
         * The following are error statuses for the bulk deactivation operation.  Note that none of the attributes (string or numeric) in the bulk request have been deactivated by this bulk
         * deactivation operation if any of the below statuses are returned.
         * EMPTY_ATTRIBUTE_LIST - The bulk deactivation request object was empty and did not contain any attributes to be deactivated.
         * NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED - The number of numeric attributes in the bulk request exceeded the maximum limit (100) of numeric attributes that could be present in the APM Domain.
         * STRING_ATTRIBUTE_LIMIT_EXCEEDED - The number of string attributes in the bulk request exceeded the maximum limit (700) of string attributes that could be present in the APM Domain.
         * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an attribute that resulted
         * in a processing error.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        /**
         * Operation status of the bulk deactivation operation.  The bulk deactivation operation could have either a success or an error status as defined below.  Note that
         * if a bulk operation has not succeeded, we do not deactivate any tags in the request set.
         * SUCCESS - The bulk deactivation operation has succeeded and all the attributes in the bulk deactivation request have been deactivated by this operation or deactivated earlier.
         * The following are error statuses for the bulk deactivation operation.  Note that none of the attributes (string or numeric) in the bulk request have been deactivated by this bulk
         * deactivation operation if any of the below statuses are returned.
         * EMPTY_ATTRIBUTE_LIST - The bulk deactivation request object was empty and did not contain any attributes to be deactivated.
         * NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED - The number of numeric attributes in the bulk request exceeded the maximum limit (100) of numeric attributes that could be present in the APM Domain.
         * STRING_ATTRIBUTE_LIMIT_EXCEEDED - The number of string attributes in the bulk request exceeded the maximum limit (700) of string attributes that could be present in the APM Domain.
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
         * Total number attributes (both string and numeric) in TRACES namespace that were deactivated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributesDeActivated")
        private Integer attributesDeActivated;

        /**
         * Total number attributes (both string and numeric) in TRACES namespace that were deactivated.
         *
         * @param attributesDeActivated the value to set
         * @return this builder
         **/
        public Builder attributesDeActivated(Integer attributesDeActivated) {
            this.attributesDeActivated = attributesDeActivated;
            this.__explicitlySet__.add("attributesDeActivated");
            return this;
        }
        /**
         * Total number attributes (both string and numeric) in SYNTHETIC namespace that were deactivated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("syntheticAttributesDeActivated")
        private Integer syntheticAttributesDeActivated;

        /**
         * Total number attributes (both string and numeric) in SYNTHETIC namespace that were deactivated.
         *
         * @param syntheticAttributesDeActivated the value to set
         * @return this builder
         **/
        public Builder syntheticAttributesDeActivated(Integer syntheticAttributesDeActivated) {
            this.syntheticAttributesDeActivated = syntheticAttributesDeActivated;
            this.__explicitlySet__.add("syntheticAttributesDeActivated");
            return this;
        }
        /**
         * Total number of free slots available for activation of additional string attributes in TRACES namespace in the APM Domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableStringAttributes")
        private Integer availableStringAttributes;

        /**
         * Total number of free slots available for activation of additional string attributes in TRACES namespace in the APM Domain.
         *
         * @param availableStringAttributes the value to set
         * @return this builder
         **/
        public Builder availableStringAttributes(Integer availableStringAttributes) {
            this.availableStringAttributes = availableStringAttributes;
            this.__explicitlySet__.add("availableStringAttributes");
            return this;
        }
        /**
         * Total number of free slots available for activation of additional numeric attributes in TRACES namespace in the APM Domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableNumericAttributes")
        private Integer availableNumericAttributes;

        /**
         * Total number of free slots available for activation of additional numeric attributes in TRACES namespace in the APM Domain.
         *
         * @param availableNumericAttributes the value to set
         * @return this builder
         **/
        public Builder availableNumericAttributes(Integer availableNumericAttributes) {
            this.availableNumericAttributes = availableNumericAttributes;
            this.__explicitlySet__.add("availableNumericAttributes");
            return this;
        }
        /**
         * Total number of free slots available for activation of additional string attributes in SYNTHETIC namespace in the APM Domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableSyntheticStringAttributes")
        private Integer availableSyntheticStringAttributes;

        /**
         * Total number of free slots available for activation of additional string attributes in SYNTHETIC namespace in the APM Domain.
         *
         * @param availableSyntheticStringAttributes the value to set
         * @return this builder
         **/
        public Builder availableSyntheticStringAttributes(
                Integer availableSyntheticStringAttributes) {
            this.availableSyntheticStringAttributes = availableSyntheticStringAttributes;
            this.__explicitlySet__.add("availableSyntheticStringAttributes");
            return this;
        }
        /**
         * Total number of free slots available for activation of additional numeric attributes in SYNTHETIC namespace in the APM Domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableSyntheticNumericAttributes")
        private Integer availableSyntheticNumericAttributes;

        /**
         * Total number of free slots available for activation of additional numeric attributes in SYNTHETIC namespace in the APM Domain.
         *
         * @param availableSyntheticNumericAttributes the value to set
         * @return this builder
         **/
        public Builder availableSyntheticNumericAttributes(
                Integer availableSyntheticNumericAttributes) {
            this.availableSyntheticNumericAttributes = availableSyntheticNumericAttributes;
            this.__explicitlySet__.add("availableSyntheticNumericAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkDeActivationMetadata build() {
            BulkDeActivationMetadata model =
                    new BulkDeActivationMetadata(
                            this.operationStatus,
                            this.operationType,
                            this.attributesDeActivated,
                            this.syntheticAttributesDeActivated,
                            this.availableStringAttributes,
                            this.availableNumericAttributes,
                            this.availableSyntheticStringAttributes,
                            this.availableSyntheticNumericAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkDeActivationMetadata model) {
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("attributesDeActivated")) {
                this.attributesDeActivated(model.getAttributesDeActivated());
            }
            if (model.wasPropertyExplicitlySet("syntheticAttributesDeActivated")) {
                this.syntheticAttributesDeActivated(model.getSyntheticAttributesDeActivated());
            }
            if (model.wasPropertyExplicitlySet("availableStringAttributes")) {
                this.availableStringAttributes(model.getAvailableStringAttributes());
            }
            if (model.wasPropertyExplicitlySet("availableNumericAttributes")) {
                this.availableNumericAttributes(model.getAvailableNumericAttributes());
            }
            if (model.wasPropertyExplicitlySet("availableSyntheticStringAttributes")) {
                this.availableSyntheticStringAttributes(
                        model.getAvailableSyntheticStringAttributes());
            }
            if (model.wasPropertyExplicitlySet("availableSyntheticNumericAttributes")) {
                this.availableSyntheticNumericAttributes(
                        model.getAvailableSyntheticNumericAttributes());
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
     * Operation status of the bulk deactivation operation.  The bulk deactivation operation could have either a success or an error status as defined below.  Note that
     * if a bulk operation has not succeeded, we do not deactivate any tags in the request set.
     * SUCCESS - The bulk deactivation operation has succeeded and all the attributes in the bulk deactivation request have been deactivated by this operation or deactivated earlier.
     * The following are error statuses for the bulk deactivation operation.  Note that none of the attributes (string or numeric) in the bulk request have been deactivated by this bulk
     * deactivation operation if any of the below statuses are returned.
     * EMPTY_ATTRIBUTE_LIST - The bulk deactivation request object was empty and did not contain any attributes to be deactivated.
     * NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED - The number of numeric attributes in the bulk request exceeded the maximum limit (100) of numeric attributes that could be present in the APM Domain.
     * STRING_ATTRIBUTE_LIMIT_EXCEEDED - The number of string attributes in the bulk request exceeded the maximum limit (700) of string attributes that could be present in the APM Domain.
     * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an attribute that resulted
     * in a processing error.
     *
     **/
    public enum OperationStatus {
        Success("SUCCESS"),
        EmptyAttributeList("EMPTY_ATTRIBUTE_LIST"),
        NumericAttributeLimitExceeded("NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED"),
        StringAttributeLimitExceeded("STRING_ATTRIBUTE_LIMIT_EXCEEDED"),
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
     * Operation status of the bulk deactivation operation.  The bulk deactivation operation could have either a success or an error status as defined below.  Note that
     * if a bulk operation has not succeeded, we do not deactivate any tags in the request set.
     * SUCCESS - The bulk deactivation operation has succeeded and all the attributes in the bulk deactivation request have been deactivated by this operation or deactivated earlier.
     * The following are error statuses for the bulk deactivation operation.  Note that none of the attributes (string or numeric) in the bulk request have been deactivated by this bulk
     * deactivation operation if any of the below statuses are returned.
     * EMPTY_ATTRIBUTE_LIST - The bulk deactivation request object was empty and did not contain any attributes to be deactivated.
     * NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED - The number of numeric attributes in the bulk request exceeded the maximum limit (100) of numeric attributes that could be present in the APM Domain.
     * STRING_ATTRIBUTE_LIMIT_EXCEEDED - The number of string attributes in the bulk request exceeded the maximum limit (700) of string attributes that could be present in the APM Domain.
     * INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or attribute(s) that resulted in a validation error, or an attribute that resulted
     * in a processing error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final OperationStatus operationStatus;

    /**
     * Operation status of the bulk deactivation operation.  The bulk deactivation operation could have either a success or an error status as defined below.  Note that
     * if a bulk operation has not succeeded, we do not deactivate any tags in the request set.
     * SUCCESS - The bulk deactivation operation has succeeded and all the attributes in the bulk deactivation request have been deactivated by this operation or deactivated earlier.
     * The following are error statuses for the bulk deactivation operation.  Note that none of the attributes (string or numeric) in the bulk request have been deactivated by this bulk
     * deactivation operation if any of the below statuses are returned.
     * EMPTY_ATTRIBUTE_LIST - The bulk deactivation request object was empty and did not contain any attributes to be deactivated.
     * NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED - The number of numeric attributes in the bulk request exceeded the maximum limit (100) of numeric attributes that could be present in the APM Domain.
     * STRING_ATTRIBUTE_LIMIT_EXCEEDED - The number of string attributes in the bulk request exceeded the maximum limit (700) of string attributes that could be present in the APM Domain.
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
        Deactivate("DEACTIVATE"),

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
     * Total number attributes (both string and numeric) in TRACES namespace that were deactivated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributesDeActivated")
    private final Integer attributesDeActivated;

    /**
     * Total number attributes (both string and numeric) in TRACES namespace that were deactivated.
     *
     * @return the value
     **/
    public Integer getAttributesDeActivated() {
        return attributesDeActivated;
    }

    /**
     * Total number attributes (both string and numeric) in SYNTHETIC namespace that were deactivated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("syntheticAttributesDeActivated")
    private final Integer syntheticAttributesDeActivated;

    /**
     * Total number attributes (both string and numeric) in SYNTHETIC namespace that were deactivated.
     *
     * @return the value
     **/
    public Integer getSyntheticAttributesDeActivated() {
        return syntheticAttributesDeActivated;
    }

    /**
     * Total number of free slots available for activation of additional string attributes in TRACES namespace in the APM Domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableStringAttributes")
    private final Integer availableStringAttributes;

    /**
     * Total number of free slots available for activation of additional string attributes in TRACES namespace in the APM Domain.
     *
     * @return the value
     **/
    public Integer getAvailableStringAttributes() {
        return availableStringAttributes;
    }

    /**
     * Total number of free slots available for activation of additional numeric attributes in TRACES namespace in the APM Domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableNumericAttributes")
    private final Integer availableNumericAttributes;

    /**
     * Total number of free slots available for activation of additional numeric attributes in TRACES namespace in the APM Domain.
     *
     * @return the value
     **/
    public Integer getAvailableNumericAttributes() {
        return availableNumericAttributes;
    }

    /**
     * Total number of free slots available for activation of additional string attributes in SYNTHETIC namespace in the APM Domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableSyntheticStringAttributes")
    private final Integer availableSyntheticStringAttributes;

    /**
     * Total number of free slots available for activation of additional string attributes in SYNTHETIC namespace in the APM Domain.
     *
     * @return the value
     **/
    public Integer getAvailableSyntheticStringAttributes() {
        return availableSyntheticStringAttributes;
    }

    /**
     * Total number of free slots available for activation of additional numeric attributes in SYNTHETIC namespace in the APM Domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableSyntheticNumericAttributes")
    private final Integer availableSyntheticNumericAttributes;

    /**
     * Total number of free slots available for activation of additional numeric attributes in SYNTHETIC namespace in the APM Domain.
     *
     * @return the value
     **/
    public Integer getAvailableSyntheticNumericAttributes() {
        return availableSyntheticNumericAttributes;
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
        sb.append("BulkDeActivationMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", attributesDeActivated=").append(String.valueOf(this.attributesDeActivated));
        sb.append(", syntheticAttributesDeActivated=")
                .append(String.valueOf(this.syntheticAttributesDeActivated));
        sb.append(", availableStringAttributes=")
                .append(String.valueOf(this.availableStringAttributes));
        sb.append(", availableNumericAttributes=")
                .append(String.valueOf(this.availableNumericAttributes));
        sb.append(", availableSyntheticStringAttributes=")
                .append(String.valueOf(this.availableSyntheticStringAttributes));
        sb.append(", availableSyntheticNumericAttributes=")
                .append(String.valueOf(this.availableSyntheticNumericAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkDeActivationMetadata)) {
            return false;
        }

        BulkDeActivationMetadata other = (BulkDeActivationMetadata) o;
        return java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.attributesDeActivated, other.attributesDeActivated)
                && java.util.Objects.equals(
                        this.syntheticAttributesDeActivated, other.syntheticAttributesDeActivated)
                && java.util.Objects.equals(
                        this.availableStringAttributes, other.availableStringAttributes)
                && java.util.Objects.equals(
                        this.availableNumericAttributes, other.availableNumericAttributes)
                && java.util.Objects.equals(
                        this.availableSyntheticStringAttributes,
                        other.availableSyntheticStringAttributes)
                && java.util.Objects.equals(
                        this.availableSyntheticNumericAttributes,
                        other.availableSyntheticNumericAttributes)
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
                        + (this.attributesDeActivated == null
                                ? 43
                                : this.attributesDeActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.syntheticAttributesDeActivated == null
                                ? 43
                                : this.syntheticAttributesDeActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.availableStringAttributes == null
                                ? 43
                                : this.availableStringAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.availableNumericAttributes == null
                                ? 43
                                : this.availableNumericAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.availableSyntheticStringAttributes == null
                                ? 43
                                : this.availableSyntheticStringAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.availableSyntheticNumericAttributes == null
                                ? 43
                                : this.availableSyntheticNumericAttributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
