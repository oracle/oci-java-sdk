/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Response of an individual attribute item in the bulk update attribute operation. <br>
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
        builder = AttributeUpdateResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttributeUpdateResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "attributeName",
        "attributeType",
        "unit",
        "notes",
        "operationType",
        "attributeStatus",
        "attributeNameSpace",
        "timeUpdated"
    })
    public AttributeUpdateResponse(
            String attributeName,
            AttributeType attributeType,
            Unit unit,
            String notes,
            OperationType operationType,
            AttributeStatus attributeStatus,
            AttributeNameSpace attributeNameSpace,
            java.util.Date timeUpdated) {
        super();
        this.attributeName = attributeName;
        this.attributeType = attributeType;
        this.unit = unit;
        this.notes = notes;
        this.operationType = operationType;
        this.attributeStatus = attributeStatus;
        this.attributeNameSpace = attributeNameSpace;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Attribute for which properties were updated in this bulk operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeName")
        private String attributeName;

        /**
         * Attribute for which properties were updated in this bulk operation.
         *
         * @param attributeName the value to set
         * @return this builder
         */
        public Builder attributeName(String attributeName) {
            this.attributeName = attributeName;
            this.__explicitlySet__.add("attributeName");
            return this;
        }
        /** Type of the attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
        private AttributeType attributeType;

        /**
         * Type of the attribute.
         *
         * @param attributeType the value to set
         * @return this builder
         */
        public Builder attributeType(AttributeType attributeType) {
            this.attributeType = attributeType;
            this.__explicitlySet__.add("attributeType");
            return this;
        }
        /** Unit updated for this attribute. If unit is not specified, it defaults to NONE. */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        /**
         * Unit updated for this attribute. If unit is not specified, it defaults to NONE.
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /** Notes for the attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("notes")
        private String notes;

        /**
         * Notes for the attribute.
         *
         * @param notes the value to set
         * @return this builder
         */
        public Builder notes(String notes) {
            this.notes = notes;
            this.__explicitlySet__.add("notes");
            return this;
        }
        /** Type of operation - UPDATE_ATTRIBUTE_PROPERTIES. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * Type of operation - UPDATE_ATTRIBUTE_PROPERTIES.
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
         * Status of the attribute after this operation. The attribute can have one of the following
         * statuses after the update operation. The attribute can have either a success status or an
         * error status. The status of the attribute must be correlated with the operation status
         * property in the bulk operation metadata object. The bulk operation will be successful
         * only when all attributes in the bulk request are processed successfully and they get a
         * success status back. The following are successful status values of individual attribute
         * items in a bulk update attribute operation. ATTRIBUTE_UPDATED - The attribute's
         * properites have been updated with the given properties. DUPLICATE_ATTRIBUTE - The
         * attribute is a duplicate of an attribute that was present in this bulk request. Note that
         * we deduplicate the attribute collection, process only unique attributes, and call out
         * duplicates. A duplicate attribute in a bulk request will not prevent the processing of
         * further attributes in the bulk operation. The following values are error statuses and the
         * bulk processing is stopped when the first error is encountered. INVALID_ATTRIBUTE - The
         * attribute is invalid. ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as there
         * was another attribute in this bulk request collection that resulted in a processing
         * error. ATTRIBUTE_DOES_NOT_EXIST - Attribute was neither active nor pinned inactive.
         * ATTRIBUTE_UPDATE_NOT_ALLOWED - Attribute update is not allowed as it is an in-built
         * system attribute.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeStatus")
        private AttributeStatus attributeStatus;

        /**
         * Status of the attribute after this operation. The attribute can have one of the following
         * statuses after the update operation. The attribute can have either a success status or an
         * error status. The status of the attribute must be correlated with the operation status
         * property in the bulk operation metadata object. The bulk operation will be successful
         * only when all attributes in the bulk request are processed successfully and they get a
         * success status back. The following are successful status values of individual attribute
         * items in a bulk update attribute operation. ATTRIBUTE_UPDATED - The attribute's
         * properites have been updated with the given properties. DUPLICATE_ATTRIBUTE - The
         * attribute is a duplicate of an attribute that was present in this bulk request. Note that
         * we deduplicate the attribute collection, process only unique attributes, and call out
         * duplicates. A duplicate attribute in a bulk request will not prevent the processing of
         * further attributes in the bulk operation. The following values are error statuses and the
         * bulk processing is stopped when the first error is encountered. INVALID_ATTRIBUTE - The
         * attribute is invalid. ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as there
         * was another attribute in this bulk request collection that resulted in a processing
         * error. ATTRIBUTE_DOES_NOT_EXIST - Attribute was neither active nor pinned inactive.
         * ATTRIBUTE_UPDATE_NOT_ALLOWED - Attribute update is not allowed as it is an in-built
         * system attribute.
         *
         * @param attributeStatus the value to set
         * @return this builder
         */
        public Builder attributeStatus(AttributeStatus attributeStatus) {
            this.attributeStatus = attributeStatus;
            this.__explicitlySet__.add("attributeStatus");
            return this;
        }
        /**
         * Namespace of the attribute whose properties were updated. The attributeNameSpace will
         * default to TRACES if it is not passed in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeNameSpace")
        private AttributeNameSpace attributeNameSpace;

        /**
         * Namespace of the attribute whose properties were updated. The attributeNameSpace will
         * default to TRACES if it is not passed in.
         *
         * @param attributeNameSpace the value to set
         * @return this builder
         */
        public Builder attributeNameSpace(AttributeNameSpace attributeNameSpace) {
            this.attributeNameSpace = attributeNameSpace;
            this.__explicitlySet__.add("attributeNameSpace");
            return this;
        }
        /** Time when the attribute's properties were updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the attribute's properties were updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttributeUpdateResponse build() {
            AttributeUpdateResponse model =
                    new AttributeUpdateResponse(
                            this.attributeName,
                            this.attributeType,
                            this.unit,
                            this.notes,
                            this.operationType,
                            this.attributeStatus,
                            this.attributeNameSpace,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttributeUpdateResponse model) {
            if (model.wasPropertyExplicitlySet("attributeName")) {
                this.attributeName(model.getAttributeName());
            }
            if (model.wasPropertyExplicitlySet("attributeType")) {
                this.attributeType(model.getAttributeType());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("notes")) {
                this.notes(model.getNotes());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("attributeStatus")) {
                this.attributeStatus(model.getAttributeStatus());
            }
            if (model.wasPropertyExplicitlySet("attributeNameSpace")) {
                this.attributeNameSpace(model.getAttributeNameSpace());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** Attribute for which properties were updated in this bulk operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeName")
    private final String attributeName;

    /**
     * Attribute for which properties were updated in this bulk operation.
     *
     * @return the value
     */
    public String getAttributeName() {
        return attributeName;
    }

    /** Type of the attribute. */
    public enum AttributeType implements com.oracle.bmc.http.internal.BmcEnum {
        Numeric("NUMERIC"),
        String("STRING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AttributeType.class);

        private final String value;
        private static java.util.Map<String, AttributeType> map;

        static {
            map = new java.util.HashMap<>();
            for (AttributeType v : AttributeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AttributeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttributeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AttributeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of the attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
    private final AttributeType attributeType;

    /**
     * Type of the attribute.
     *
     * @return the value
     */
    public AttributeType getAttributeType() {
        return attributeType;
    }

    /** Unit updated for this attribute. If unit is not specified, it defaults to NONE. */
    public enum Unit implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        EpochTimeMs("EPOCH_TIME_MS"),
        Bytes("BYTES"),
        Count("COUNT"),
        DurationMs("DURATION_MS"),
        TraceStatus("TRACE_STATUS"),
        Percentage("PERCENTAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Unit.class);

        private final String value;
        private static java.util.Map<String, Unit> map;

        static {
            map = new java.util.HashMap<>();
            for (Unit v : Unit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Unit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Unit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Unit', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** Unit updated for this attribute. If unit is not specified, it defaults to NONE. */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final Unit unit;

    /**
     * Unit updated for this attribute. If unit is not specified, it defaults to NONE.
     *
     * @return the value
     */
    public Unit getUnit() {
        return unit;
    }

    /** Notes for the attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("notes")
    private final String notes;

    /**
     * Notes for the attribute.
     *
     * @return the value
     */
    public String getNotes() {
        return notes;
    }

    /** Type of operation - UPDATE_ATTRIBUTE_PROPERTIES. */
    public enum OperationType implements com.oracle.bmc.http.internal.BmcEnum {
        UpdateAttributeProperties("UPDATE_ATTRIBUTE_PROPERTIES"),

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
    /** Type of operation - UPDATE_ATTRIBUTE_PROPERTIES. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * Type of operation - UPDATE_ATTRIBUTE_PROPERTIES.
     *
     * @return the value
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Status of the attribute after this operation. The attribute can have one of the following
     * statuses after the update operation. The attribute can have either a success status or an
     * error status. The status of the attribute must be correlated with the operation status
     * property in the bulk operation metadata object. The bulk operation will be successful only
     * when all attributes in the bulk request are processed successfully and they get a success
     * status back. The following are successful status values of individual attribute items in a
     * bulk update attribute operation. ATTRIBUTE_UPDATED - The attribute's properites have been
     * updated with the given properties. DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an
     * attribute that was present in this bulk request. Note that we deduplicate the attribute
     * collection, process only unique attributes, and call out duplicates. A duplicate attribute in
     * a bulk request will not prevent the processing of further attributes in the bulk operation.
     * The following values are error statuses and the bulk processing is stopped when the first
     * error is encountered. INVALID_ATTRIBUTE - The attribute is invalid. ATTRIBUTE_NOT_PROCESSED -
     * The attribute was not processed, as there was another attribute in this bulk request
     * collection that resulted in a processing error. ATTRIBUTE_DOES_NOT_EXIST - Attribute was
     * neither active nor pinned inactive. ATTRIBUTE_UPDATE_NOT_ALLOWED - Attribute update is not
     * allowed as it is an in-built system attribute.
     */
    public enum AttributeStatus implements com.oracle.bmc.http.internal.BmcEnum {
        AttributeUpdated("ATTRIBUTE_UPDATED"),
        DuplicateAttribute("DUPLICATE_ATTRIBUTE"),
        InvalidAttribute("INVALID_ATTRIBUTE"),
        AttributeNotProcessed("ATTRIBUTE_NOT_PROCESSED"),
        AttributeDoesNotExist("ATTRIBUTE_DOES_NOT_EXIST"),
        AttributeUpdateNotAllowed("ATTRIBUTE_UPDATE_NOT_ALLOWED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AttributeStatus.class);

        private final String value;
        private static java.util.Map<String, AttributeStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (AttributeStatus v : AttributeStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AttributeStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttributeStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AttributeStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the attribute after this operation. The attribute can have one of the following
     * statuses after the update operation. The attribute can have either a success status or an
     * error status. The status of the attribute must be correlated with the operation status
     * property in the bulk operation metadata object. The bulk operation will be successful only
     * when all attributes in the bulk request are processed successfully and they get a success
     * status back. The following are successful status values of individual attribute items in a
     * bulk update attribute operation. ATTRIBUTE_UPDATED - The attribute's properites have been
     * updated with the given properties. DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an
     * attribute that was present in this bulk request. Note that we deduplicate the attribute
     * collection, process only unique attributes, and call out duplicates. A duplicate attribute in
     * a bulk request will not prevent the processing of further attributes in the bulk operation.
     * The following values are error statuses and the bulk processing is stopped when the first
     * error is encountered. INVALID_ATTRIBUTE - The attribute is invalid. ATTRIBUTE_NOT_PROCESSED -
     * The attribute was not processed, as there was another attribute in this bulk request
     * collection that resulted in a processing error. ATTRIBUTE_DOES_NOT_EXIST - Attribute was
     * neither active nor pinned inactive. ATTRIBUTE_UPDATE_NOT_ALLOWED - Attribute update is not
     * allowed as it is an in-built system attribute.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeStatus")
    private final AttributeStatus attributeStatus;

    /**
     * Status of the attribute after this operation. The attribute can have one of the following
     * statuses after the update operation. The attribute can have either a success status or an
     * error status. The status of the attribute must be correlated with the operation status
     * property in the bulk operation metadata object. The bulk operation will be successful only
     * when all attributes in the bulk request are processed successfully and they get a success
     * status back. The following are successful status values of individual attribute items in a
     * bulk update attribute operation. ATTRIBUTE_UPDATED - The attribute's properites have been
     * updated with the given properties. DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an
     * attribute that was present in this bulk request. Note that we deduplicate the attribute
     * collection, process only unique attributes, and call out duplicates. A duplicate attribute in
     * a bulk request will not prevent the processing of further attributes in the bulk operation.
     * The following values are error statuses and the bulk processing is stopped when the first
     * error is encountered. INVALID_ATTRIBUTE - The attribute is invalid. ATTRIBUTE_NOT_PROCESSED -
     * The attribute was not processed, as there was another attribute in this bulk request
     * collection that resulted in a processing error. ATTRIBUTE_DOES_NOT_EXIST - Attribute was
     * neither active nor pinned inactive. ATTRIBUTE_UPDATE_NOT_ALLOWED - Attribute update is not
     * allowed as it is an in-built system attribute.
     *
     * @return the value
     */
    public AttributeStatus getAttributeStatus() {
        return attributeStatus;
    }

    /**
     * Namespace of the attribute whose properties were updated. The attributeNameSpace will default
     * to TRACES if it is not passed in.
     */
    public enum AttributeNameSpace implements com.oracle.bmc.http.internal.BmcEnum {
        Traces("TRACES"),
        Synthetic("SYNTHETIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AttributeNameSpace.class);

        private final String value;
        private static java.util.Map<String, AttributeNameSpace> map;

        static {
            map = new java.util.HashMap<>();
            for (AttributeNameSpace v : AttributeNameSpace.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AttributeNameSpace(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttributeNameSpace create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AttributeNameSpace', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Namespace of the attribute whose properties were updated. The attributeNameSpace will default
     * to TRACES if it is not passed in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeNameSpace")
    private final AttributeNameSpace attributeNameSpace;

    /**
     * Namespace of the attribute whose properties were updated. The attributeNameSpace will default
     * to TRACES if it is not passed in.
     *
     * @return the value
     */
    public AttributeNameSpace getAttributeNameSpace() {
        return attributeNameSpace;
    }

    /** Time when the attribute's properties were updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the attribute's properties were updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("AttributeUpdateResponse(");
        sb.append("super=").append(super.toString());
        sb.append("attributeName=").append(String.valueOf(this.attributeName));
        sb.append(", attributeType=").append(String.valueOf(this.attributeType));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", notes=").append(String.valueOf(this.notes));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", attributeStatus=").append(String.valueOf(this.attributeStatus));
        sb.append(", attributeNameSpace=").append(String.valueOf(this.attributeNameSpace));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttributeUpdateResponse)) {
            return false;
        }

        AttributeUpdateResponse other = (AttributeUpdateResponse) o;
        return java.util.Objects.equals(this.attributeName, other.attributeName)
                && java.util.Objects.equals(this.attributeType, other.attributeType)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.notes, other.notes)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.attributeStatus, other.attributeStatus)
                && java.util.Objects.equals(this.attributeNameSpace, other.attributeNameSpace)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attributeName == null ? 43 : this.attributeName.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeType == null ? 43 : this.attributeType.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + (this.notes == null ? 43 : this.notes.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeStatus == null ? 43 : this.attributeStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeNameSpace == null
                                ? 43
                                : this.attributeNameSpace.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
