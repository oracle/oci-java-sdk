/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Metadata about the bulk activation operation. The bulk activation operation is atomic and binary.
 * If the processing of any of the attributes in the bulk activation request results in a processing
 * or validation error, then none of the attributes in the request are activated. The bulk
 * activation request succeeds only when all the attributes in the bulk activation request are
 * processed and they get a successful attributeStatus back. <br>
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
        builder = BulkActivationMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkActivationMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationStatus",
        "operationType",
        "stringAttributesActivated",
        "numericAttributesActivated",
        "syntheticStringAttributesActivated",
        "syntheticNumericAttributesActivated",
        "availableStringAttributes",
        "availableNumericAttributes",
        "availableSyntheticStringAttributes",
        "availableSyntheticNumericAttributes"
    })
    public BulkActivationMetadata(
            OperationStatus operationStatus,
            OperationType operationType,
            Integer stringAttributesActivated,
            Integer numericAttributesActivated,
            Integer syntheticStringAttributesActivated,
            Integer syntheticNumericAttributesActivated,
            Integer availableStringAttributes,
            Integer availableNumericAttributes,
            Integer availableSyntheticStringAttributes,
            Integer availableSyntheticNumericAttributes) {
        super();
        this.operationStatus = operationStatus;
        this.operationType = operationType;
        this.stringAttributesActivated = stringAttributesActivated;
        this.numericAttributesActivated = numericAttributesActivated;
        this.syntheticStringAttributesActivated = syntheticStringAttributesActivated;
        this.syntheticNumericAttributesActivated = syntheticNumericAttributesActivated;
        this.availableStringAttributes = availableStringAttributes;
        this.availableNumericAttributes = availableNumericAttributes;
        this.availableSyntheticStringAttributes = availableSyntheticStringAttributes;
        this.availableSyntheticNumericAttributes = availableSyntheticNumericAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Operation status of the bulk activation operation. The bulk activation operation could
         * have either a success or an error status as defined below. The following is a success
         * status for the bulk activation operation. SUCCESS - The bulk activation operation has
         * succeeded and all the attributes in the bulk activation request have been activated by
         * this operation or activated earlier. The following are error statuses for the bulk
         * activation operation. Note that none of the attributes (string or numeric) in the bulk
         * request have been activated by this bulk activation operation if any of the below
         * statuses. EMPTY_ATTRIBUTE_LIST - The bulk activation request object was empty and did not
         * contain any attributes to be activated. NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED - The number of
         * numeric attributes in the bulk request exceeded the maximum limit (100) of numeric
         * attributes that could be activated in the APM Domain. STRING_ATTRIBUTE_LIMIT_EXCEEDED -
         * The number of string attributes in the bulk request exceeded the maximum limit (700) of
         * string attributes that could be activated in the APM Domain. INSUFFICIENT_STRING_SPACE -
         * There are not enough free slots available in the APM Domain to activate the string
         * attributes present in the bulk request. INSUFFICIENT_NUMERIC_SPACE - There are not enough
         * free slots available in the APM Domain to activate the numeric attributes present in the
         * bulk request. INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or
         * attribute(s) that resulted in a validation error, or an attribute that resulted in a
         * processing error.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        /**
         * Operation status of the bulk activation operation. The bulk activation operation could
         * have either a success or an error status as defined below. The following is a success
         * status for the bulk activation operation. SUCCESS - The bulk activation operation has
         * succeeded and all the attributes in the bulk activation request have been activated by
         * this operation or activated earlier. The following are error statuses for the bulk
         * activation operation. Note that none of the attributes (string or numeric) in the bulk
         * request have been activated by this bulk activation operation if any of the below
         * statuses. EMPTY_ATTRIBUTE_LIST - The bulk activation request object was empty and did not
         * contain any attributes to be activated. NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED - The number of
         * numeric attributes in the bulk request exceeded the maximum limit (100) of numeric
         * attributes that could be activated in the APM Domain. STRING_ATTRIBUTE_LIMIT_EXCEEDED -
         * The number of string attributes in the bulk request exceeded the maximum limit (700) of
         * string attributes that could be activated in the APM Domain. INSUFFICIENT_STRING_SPACE -
         * There are not enough free slots available in the APM Domain to activate the string
         * attributes present in the bulk request. INSUFFICIENT_NUMERIC_SPACE - There are not enough
         * free slots available in the APM Domain to activate the numeric attributes present in the
         * bulk request. INVALID_BULK_REQUEST - The bulk request contains invalid attribute(s), or
         * attribute(s) that resulted in a validation error, or an attribute that resulted in a
         * processing error.
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
        /** Total number of string attributes in TRACES namespace that were activated. */
        @com.fasterxml.jackson.annotation.JsonProperty("stringAttributesActivated")
        private Integer stringAttributesActivated;

        /**
         * Total number of string attributes in TRACES namespace that were activated.
         *
         * @param stringAttributesActivated the value to set
         * @return this builder
         */
        public Builder stringAttributesActivated(Integer stringAttributesActivated) {
            this.stringAttributesActivated = stringAttributesActivated;
            this.__explicitlySet__.add("stringAttributesActivated");
            return this;
        }
        /** Total number of numeric attributes in TRACES namespace that were activated. */
        @com.fasterxml.jackson.annotation.JsonProperty("numericAttributesActivated")
        private Integer numericAttributesActivated;

        /**
         * Total number of numeric attributes in TRACES namespace that were activated.
         *
         * @param numericAttributesActivated the value to set
         * @return this builder
         */
        public Builder numericAttributesActivated(Integer numericAttributesActivated) {
            this.numericAttributesActivated = numericAttributesActivated;
            this.__explicitlySet__.add("numericAttributesActivated");
            return this;
        }
        /** Total number of string attributes in SYNTHETIC namespace that were activated. */
        @com.fasterxml.jackson.annotation.JsonProperty("syntheticStringAttributesActivated")
        private Integer syntheticStringAttributesActivated;

        /**
         * Total number of string attributes in SYNTHETIC namespace that were activated.
         *
         * @param syntheticStringAttributesActivated the value to set
         * @return this builder
         */
        public Builder syntheticStringAttributesActivated(
                Integer syntheticStringAttributesActivated) {
            this.syntheticStringAttributesActivated = syntheticStringAttributesActivated;
            this.__explicitlySet__.add("syntheticStringAttributesActivated");
            return this;
        }
        /** Total number of numeric attributes in SYNTHETIC namespace that were activated. */
        @com.fasterxml.jackson.annotation.JsonProperty("syntheticNumericAttributesActivated")
        private Integer syntheticNumericAttributesActivated;

        /**
         * Total number of numeric attributes in SYNTHETIC namespace that were activated.
         *
         * @param syntheticNumericAttributesActivated the value to set
         * @return this builder
         */
        public Builder syntheticNumericAttributesActivated(
                Integer syntheticNumericAttributesActivated) {
            this.syntheticNumericAttributesActivated = syntheticNumericAttributesActivated;
            this.__explicitlySet__.add("syntheticNumericAttributesActivated");
            return this;
        }
        /**
         * Total number of free slots available to activate string attributes in the TRACES
         * namespace in the APM Domain. Note that if a bulk request has succeeded, this number
         * reflects the total number of free slots available for activation of additional string
         * attributes in the TRACES namespace in the APM Domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableStringAttributes")
        private Integer availableStringAttributes;

        /**
         * Total number of free slots available to activate string attributes in the TRACES
         * namespace in the APM Domain. Note that if a bulk request has succeeded, this number
         * reflects the total number of free slots available for activation of additional string
         * attributes in the TRACES namespace in the APM Domain.
         *
         * @param availableStringAttributes the value to set
         * @return this builder
         */
        public Builder availableStringAttributes(Integer availableStringAttributes) {
            this.availableStringAttributes = availableStringAttributes;
            this.__explicitlySet__.add("availableStringAttributes");
            return this;
        }
        /**
         * Total number of free slots available to activate numeric attributes in the TRACES
         * namespace in the APM Domain. Note that if a bulk request has succeeded, this number
         * reflects the total number of free slots available for activation of additional numeric
         * attributes in the TRACES namespace in the APM Domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableNumericAttributes")
        private Integer availableNumericAttributes;

        /**
         * Total number of free slots available to activate numeric attributes in the TRACES
         * namespace in the APM Domain. Note that if a bulk request has succeeded, this number
         * reflects the total number of free slots available for activation of additional numeric
         * attributes in the TRACES namespace in the APM Domain.
         *
         * @param availableNumericAttributes the value to set
         * @return this builder
         */
        public Builder availableNumericAttributes(Integer availableNumericAttributes) {
            this.availableNumericAttributes = availableNumericAttributes;
            this.__explicitlySet__.add("availableNumericAttributes");
            return this;
        }
        /**
         * Total number of free slots available to activate string attributes in the SYNTHETIC
         * namespace in the APM Domain. Note that if a bulk request has succeeded, this number
         * reflects the total number of free synthetic slots available for activation of additional
         * string attributes in the SYNTHETIC namespace in the APM Domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableSyntheticStringAttributes")
        private Integer availableSyntheticStringAttributes;

        /**
         * Total number of free slots available to activate string attributes in the SYNTHETIC
         * namespace in the APM Domain. Note that if a bulk request has succeeded, this number
         * reflects the total number of free synthetic slots available for activation of additional
         * string attributes in the SYNTHETIC namespace in the APM Domain.
         *
         * @param availableSyntheticStringAttributes the value to set
         * @return this builder
         */
        public Builder availableSyntheticStringAttributes(
                Integer availableSyntheticStringAttributes) {
            this.availableSyntheticStringAttributes = availableSyntheticStringAttributes;
            this.__explicitlySet__.add("availableSyntheticStringAttributes");
            return this;
        }
        /**
         * Total number of free slots available to activate numeric attributes in the SYNTHETIC
         * namespace in the APM Domain. Note that if a bulk request has succeeded, this number
         * reflects the total number of free synthetic slots available for activation of additional
         * numeric attributes in the SYNTHETIC namespace in the APM Domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableSyntheticNumericAttributes")
        private Integer availableSyntheticNumericAttributes;

        /**
         * Total number of free slots available to activate numeric attributes in the SYNTHETIC
         * namespace in the APM Domain. Note that if a bulk request has succeeded, this number
         * reflects the total number of free synthetic slots available for activation of additional
         * numeric attributes in the SYNTHETIC namespace in the APM Domain.
         *
         * @param availableSyntheticNumericAttributes the value to set
         * @return this builder
         */
        public Builder availableSyntheticNumericAttributes(
                Integer availableSyntheticNumericAttributes) {
            this.availableSyntheticNumericAttributes = availableSyntheticNumericAttributes;
            this.__explicitlySet__.add("availableSyntheticNumericAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkActivationMetadata build() {
            BulkActivationMetadata model =
                    new BulkActivationMetadata(
                            this.operationStatus,
                            this.operationType,
                            this.stringAttributesActivated,
                            this.numericAttributesActivated,
                            this.syntheticStringAttributesActivated,
                            this.syntheticNumericAttributesActivated,
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
        public Builder copy(BulkActivationMetadata model) {
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("stringAttributesActivated")) {
                this.stringAttributesActivated(model.getStringAttributesActivated());
            }
            if (model.wasPropertyExplicitlySet("numericAttributesActivated")) {
                this.numericAttributesActivated(model.getNumericAttributesActivated());
            }
            if (model.wasPropertyExplicitlySet("syntheticStringAttributesActivated")) {
                this.syntheticStringAttributesActivated(
                        model.getSyntheticStringAttributesActivated());
            }
            if (model.wasPropertyExplicitlySet("syntheticNumericAttributesActivated")) {
                this.syntheticNumericAttributesActivated(
                        model.getSyntheticNumericAttributesActivated());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Operation status of the bulk activation operation. The bulk activation operation could have
     * either a success or an error status as defined below. The following is a success status for
     * the bulk activation operation. SUCCESS - The bulk activation operation has succeeded and all
     * the attributes in the bulk activation request have been activated by this operation or
     * activated earlier. The following are error statuses for the bulk activation operation. Note
     * that none of the attributes (string or numeric) in the bulk request have been activated by
     * this bulk activation operation if any of the below statuses. EMPTY_ATTRIBUTE_LIST - The bulk
     * activation request object was empty and did not contain any attributes to be activated.
     * NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED - The number of numeric attributes in the bulk request
     * exceeded the maximum limit (100) of numeric attributes that could be activated in the APM
     * Domain. STRING_ATTRIBUTE_LIMIT_EXCEEDED - The number of string attributes in the bulk request
     * exceeded the maximum limit (700) of string attributes that could be activated in the APM
     * Domain. INSUFFICIENT_STRING_SPACE - There are not enough free slots available in the APM
     * Domain to activate the string attributes present in the bulk request.
     * INSUFFICIENT_NUMERIC_SPACE - There are not enough free slots available in the APM Domain to
     * activate the numeric attributes present in the bulk request. INVALID_BULK_REQUEST - The bulk
     * request contains invalid attribute(s), or attribute(s) that resulted in a validation error,
     * or an attribute that resulted in a processing error.
     */
    public enum OperationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Success("SUCCESS"),
        EmptyAttributeList("EMPTY_ATTRIBUTE_LIST"),
        NumericAttributeLimitExceeded("NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED"),
        StringAttributeLimitExceeded("STRING_ATTRIBUTE_LIMIT_EXCEEDED"),
        InsufficientStringSpace("INSUFFICIENT_STRING_SPACE"),
        InsufficientNumericSpace("INSUFFICIENT_NUMERIC_SPACE"),
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
     * Operation status of the bulk activation operation. The bulk activation operation could have
     * either a success or an error status as defined below. The following is a success status for
     * the bulk activation operation. SUCCESS - The bulk activation operation has succeeded and all
     * the attributes in the bulk activation request have been activated by this operation or
     * activated earlier. The following are error statuses for the bulk activation operation. Note
     * that none of the attributes (string or numeric) in the bulk request have been activated by
     * this bulk activation operation if any of the below statuses. EMPTY_ATTRIBUTE_LIST - The bulk
     * activation request object was empty and did not contain any attributes to be activated.
     * NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED - The number of numeric attributes in the bulk request
     * exceeded the maximum limit (100) of numeric attributes that could be activated in the APM
     * Domain. STRING_ATTRIBUTE_LIMIT_EXCEEDED - The number of string attributes in the bulk request
     * exceeded the maximum limit (700) of string attributes that could be activated in the APM
     * Domain. INSUFFICIENT_STRING_SPACE - There are not enough free slots available in the APM
     * Domain to activate the string attributes present in the bulk request.
     * INSUFFICIENT_NUMERIC_SPACE - There are not enough free slots available in the APM Domain to
     * activate the numeric attributes present in the bulk request. INVALID_BULK_REQUEST - The bulk
     * request contains invalid attribute(s), or attribute(s) that resulted in a validation error,
     * or an attribute that resulted in a processing error.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    private final OperationStatus operationStatus;

    /**
     * Operation status of the bulk activation operation. The bulk activation operation could have
     * either a success or an error status as defined below. The following is a success status for
     * the bulk activation operation. SUCCESS - The bulk activation operation has succeeded and all
     * the attributes in the bulk activation request have been activated by this operation or
     * activated earlier. The following are error statuses for the bulk activation operation. Note
     * that none of the attributes (string or numeric) in the bulk request have been activated by
     * this bulk activation operation if any of the below statuses. EMPTY_ATTRIBUTE_LIST - The bulk
     * activation request object was empty and did not contain any attributes to be activated.
     * NUMERIC_ATTRIBUTE_LIMIT_EXCEEDED - The number of numeric attributes in the bulk request
     * exceeded the maximum limit (100) of numeric attributes that could be activated in the APM
     * Domain. STRING_ATTRIBUTE_LIMIT_EXCEEDED - The number of string attributes in the bulk request
     * exceeded the maximum limit (700) of string attributes that could be activated in the APM
     * Domain. INSUFFICIENT_STRING_SPACE - There are not enough free slots available in the APM
     * Domain to activate the string attributes present in the bulk request.
     * INSUFFICIENT_NUMERIC_SPACE - There are not enough free slots available in the APM Domain to
     * activate the numeric attributes present in the bulk request. INVALID_BULK_REQUEST - The bulk
     * request contains invalid attribute(s), or attribute(s) that resulted in a validation error,
     * or an attribute that resulted in a processing error.
     *
     * @return the value
     */
    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    /** Type of operation. */
    public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
        Activate("ACTIVATE"),

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

    /** Total number of string attributes in TRACES namespace that were activated. */
    @com.fasterxml.jackson.annotation.JsonProperty("stringAttributesActivated")
    private final Integer stringAttributesActivated;

    /**
     * Total number of string attributes in TRACES namespace that were activated.
     *
     * @return the value
     */
    public Integer getStringAttributesActivated() {
        return stringAttributesActivated;
    }

    /** Total number of numeric attributes in TRACES namespace that were activated. */
    @com.fasterxml.jackson.annotation.JsonProperty("numericAttributesActivated")
    private final Integer numericAttributesActivated;

    /**
     * Total number of numeric attributes in TRACES namespace that were activated.
     *
     * @return the value
     */
    public Integer getNumericAttributesActivated() {
        return numericAttributesActivated;
    }

    /** Total number of string attributes in SYNTHETIC namespace that were activated. */
    @com.fasterxml.jackson.annotation.JsonProperty("syntheticStringAttributesActivated")
    private final Integer syntheticStringAttributesActivated;

    /**
     * Total number of string attributes in SYNTHETIC namespace that were activated.
     *
     * @return the value
     */
    public Integer getSyntheticStringAttributesActivated() {
        return syntheticStringAttributesActivated;
    }

    /** Total number of numeric attributes in SYNTHETIC namespace that were activated. */
    @com.fasterxml.jackson.annotation.JsonProperty("syntheticNumericAttributesActivated")
    private final Integer syntheticNumericAttributesActivated;

    /**
     * Total number of numeric attributes in SYNTHETIC namespace that were activated.
     *
     * @return the value
     */
    public Integer getSyntheticNumericAttributesActivated() {
        return syntheticNumericAttributesActivated;
    }

    /**
     * Total number of free slots available to activate string attributes in the TRACES namespace in
     * the APM Domain. Note that if a bulk request has succeeded, this number reflects the total
     * number of free slots available for activation of additional string attributes in the TRACES
     * namespace in the APM Domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableStringAttributes")
    private final Integer availableStringAttributes;

    /**
     * Total number of free slots available to activate string attributes in the TRACES namespace in
     * the APM Domain. Note that if a bulk request has succeeded, this number reflects the total
     * number of free slots available for activation of additional string attributes in the TRACES
     * namespace in the APM Domain.
     *
     * @return the value
     */
    public Integer getAvailableStringAttributes() {
        return availableStringAttributes;
    }

    /**
     * Total number of free slots available to activate numeric attributes in the TRACES namespace
     * in the APM Domain. Note that if a bulk request has succeeded, this number reflects the total
     * number of free slots available for activation of additional numeric attributes in the TRACES
     * namespace in the APM Domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableNumericAttributes")
    private final Integer availableNumericAttributes;

    /**
     * Total number of free slots available to activate numeric attributes in the TRACES namespace
     * in the APM Domain. Note that if a bulk request has succeeded, this number reflects the total
     * number of free slots available for activation of additional numeric attributes in the TRACES
     * namespace in the APM Domain.
     *
     * @return the value
     */
    public Integer getAvailableNumericAttributes() {
        return availableNumericAttributes;
    }

    /**
     * Total number of free slots available to activate string attributes in the SYNTHETIC namespace
     * in the APM Domain. Note that if a bulk request has succeeded, this number reflects the total
     * number of free synthetic slots available for activation of additional string attributes in
     * the SYNTHETIC namespace in the APM Domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableSyntheticStringAttributes")
    private final Integer availableSyntheticStringAttributes;

    /**
     * Total number of free slots available to activate string attributes in the SYNTHETIC namespace
     * in the APM Domain. Note that if a bulk request has succeeded, this number reflects the total
     * number of free synthetic slots available for activation of additional string attributes in
     * the SYNTHETIC namespace in the APM Domain.
     *
     * @return the value
     */
    public Integer getAvailableSyntheticStringAttributes() {
        return availableSyntheticStringAttributes;
    }

    /**
     * Total number of free slots available to activate numeric attributes in the SYNTHETIC
     * namespace in the APM Domain. Note that if a bulk request has succeeded, this number reflects
     * the total number of free synthetic slots available for activation of additional numeric
     * attributes in the SYNTHETIC namespace in the APM Domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableSyntheticNumericAttributes")
    private final Integer availableSyntheticNumericAttributes;

    /**
     * Total number of free slots available to activate numeric attributes in the SYNTHETIC
     * namespace in the APM Domain. Note that if a bulk request has succeeded, this number reflects
     * the total number of free synthetic slots available for activation of additional numeric
     * attributes in the SYNTHETIC namespace in the APM Domain.
     *
     * @return the value
     */
    public Integer getAvailableSyntheticNumericAttributes() {
        return availableSyntheticNumericAttributes;
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
        sb.append("BulkActivationMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("operationStatus=").append(String.valueOf(this.operationStatus));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", stringAttributesActivated=")
                .append(String.valueOf(this.stringAttributesActivated));
        sb.append(", numericAttributesActivated=")
                .append(String.valueOf(this.numericAttributesActivated));
        sb.append(", syntheticStringAttributesActivated=")
                .append(String.valueOf(this.syntheticStringAttributesActivated));
        sb.append(", syntheticNumericAttributesActivated=")
                .append(String.valueOf(this.syntheticNumericAttributesActivated));
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
        if (!(o instanceof BulkActivationMetadata)) {
            return false;
        }

        BulkActivationMetadata other = (BulkActivationMetadata) o;
        return java.util.Objects.equals(this.operationStatus, other.operationStatus)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(
                        this.stringAttributesActivated, other.stringAttributesActivated)
                && java.util.Objects.equals(
                        this.numericAttributesActivated, other.numericAttributesActivated)
                && java.util.Objects.equals(
                        this.syntheticStringAttributesActivated,
                        other.syntheticStringAttributesActivated)
                && java.util.Objects.equals(
                        this.syntheticNumericAttributesActivated,
                        other.syntheticNumericAttributesActivated)
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
                        + (this.stringAttributesActivated == null
                                ? 43
                                : this.stringAttributesActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.numericAttributesActivated == null
                                ? 43
                                : this.numericAttributesActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.syntheticStringAttributesActivated == null
                                ? 43
                                : this.syntheticStringAttributesActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.syntheticNumericAttributesActivated == null
                                ? 43
                                : this.syntheticNumericAttributesActivated.hashCode());
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
