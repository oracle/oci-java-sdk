/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Response of an individual attribute item in the bulk pin operation.
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
    builder = AttributePinResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttributePinResponse extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "attributeName",
        "notes",
        "operationType",
        "attributeNameSpace",
        "attributeStatus",
        "timeUpdated"
    })
    public AttributePinResponse(
            String attributeName,
            String notes,
            OperationType operationType,
            AttributeNameSpace attributeNameSpace,
            AttributeStatus attributeStatus,
            java.util.Date timeUpdated) {
        super();
        this.attributeName = attributeName;
        this.notes = notes;
        this.operationType = operationType;
        this.attributeNameSpace = attributeNameSpace;
        this.attributeStatus = attributeStatus;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Attribute that was pinned by this bulk operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributeName")
        private String attributeName;

        /**
         * Attribute that was pinned by this bulk operation.
         *
         * @param attributeName the value to set
         * @return this builder
         **/
        public Builder attributeName(String attributeName) {
            this.attributeName = attributeName;
            this.__explicitlySet__.add("attributeName");
            return this;
        }
        /**
         * Notes added to this attribute.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notes")
        private String notes;

        /**
         * Notes added to this attribute.
         *
         * @param notes the value to set
         * @return this builder
         **/
        public Builder notes(String notes) {
            this.notes = notes;
            this.__explicitlySet__.add("notes");
            return this;
        }
        /**
         * Type of operation - pin.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * Type of operation - pin.
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
         * Namespace of the attribute whose properties were updated.  The attributeNameSpace will default to TRACES if it is
         * not passed in.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributeNameSpace")
        private AttributeNameSpace attributeNameSpace;

        /**
         * Namespace of the attribute whose properties were updated.  The attributeNameSpace will default to TRACES if it is
         * not passed in.
         *
         * @param attributeNameSpace the value to set
         * @return this builder
         **/
        public Builder attributeNameSpace(AttributeNameSpace attributeNameSpace) {
            this.attributeNameSpace = attributeNameSpace;
            this.__explicitlySet__.add("attributeNameSpace");
            return this;
        }
        /**
         * Status of the attribute after this operation.  The attribute can have one of the following statuses after the pin operation.  The attribute
         * can have either a success status or an error status.  The status of the attribute must be correlated with the operation status property in the bulk operation metadata
         * object.  The bulk operation will be successful only when all attributes in the bulk request are processed successfully and they get a success status back.
         * The following are successful status values of individual attribute items in a bulk attribute pin operation.
         * ATTRIBUTE_PINNED - The attribute is marked pinned and associated notes have been added.
         * ATTRIBUTE_ALREADY_PINNED - The caller is trying to pin an attribute that has already been pinned.
         * DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an attribute that was present in this bulk request.  Note that we deduplicate the attribute collection, process only unique attributes,
         * and call out duplicates.  A duplicate attribute in a bulk request will not prevent the processing of further attributes in the bulk operation.
         * The following values are error statuses and the bulk processing is stopped when the first error is encountered.
         * PIN_NOT_ALLOWED - The caller has asked to pin an active attribute which is not allowed.
         * INVALID_ATTRIBUTE - The attribute is invalid.
         * ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as there was another attribute in this bulk request collection that resulted in a processing error.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributeStatus")
        private AttributeStatus attributeStatus;

        /**
         * Status of the attribute after this operation.  The attribute can have one of the following statuses after the pin operation.  The attribute
         * can have either a success status or an error status.  The status of the attribute must be correlated with the operation status property in the bulk operation metadata
         * object.  The bulk operation will be successful only when all attributes in the bulk request are processed successfully and they get a success status back.
         * The following are successful status values of individual attribute items in a bulk attribute pin operation.
         * ATTRIBUTE_PINNED - The attribute is marked pinned and associated notes have been added.
         * ATTRIBUTE_ALREADY_PINNED - The caller is trying to pin an attribute that has already been pinned.
         * DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an attribute that was present in this bulk request.  Note that we deduplicate the attribute collection, process only unique attributes,
         * and call out duplicates.  A duplicate attribute in a bulk request will not prevent the processing of further attributes in the bulk operation.
         * The following values are error statuses and the bulk processing is stopped when the first error is encountered.
         * PIN_NOT_ALLOWED - The caller has asked to pin an active attribute which is not allowed.
         * INVALID_ATTRIBUTE - The attribute is invalid.
         * ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as there was another attribute in this bulk request collection that resulted in a processing error.
         *
         * @param attributeStatus the value to set
         * @return this builder
         **/
        public Builder attributeStatus(AttributeStatus attributeStatus) {
            this.attributeStatus = attributeStatus;
            this.__explicitlySet__.add("attributeStatus");
            return this;
        }
        /**
         * Time when the attribute was activated or deactivated.  Note that ingest might not have picked up the changes even if this time has elapsed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the attribute was activated or deactivated.  Note that ingest might not have picked up the changes even if this time has elapsed.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttributePinResponse build() {
            AttributePinResponse model =
                    new AttributePinResponse(
                            this.attributeName,
                            this.notes,
                            this.operationType,
                            this.attributeNameSpace,
                            this.attributeStatus,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttributePinResponse model) {
            if (model.wasPropertyExplicitlySet("attributeName")) {
                this.attributeName(model.getAttributeName());
            }
            if (model.wasPropertyExplicitlySet("notes")) {
                this.notes(model.getNotes());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("attributeNameSpace")) {
                this.attributeNameSpace(model.getAttributeNameSpace());
            }
            if (model.wasPropertyExplicitlySet("attributeStatus")) {
                this.attributeStatus(model.getAttributeStatus());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * Attribute that was pinned by this bulk operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeName")
    private final String attributeName;

    /**
     * Attribute that was pinned by this bulk operation.
     *
     * @return the value
     **/
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Notes added to this attribute.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notes")
    private final String notes;

    /**
     * Notes added to this attribute.
     *
     * @return the value
     **/
    public String getNotes() {
        return notes;
    }

    /**
     * Type of operation - pin.
     *
     **/
    public enum OperationType {
        Pin("PIN"),

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
     * Type of operation - pin.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * Type of operation - pin.
     *
     * @return the value
     **/
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Namespace of the attribute whose properties were updated.  The attributeNameSpace will default to TRACES if it is
     * not passed in.
     *
     **/
    public enum AttributeNameSpace {
        Traces("TRACES"),
        Synthetic("SYNTHETIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Namespace of the attribute whose properties were updated.  The attributeNameSpace will default to TRACES if it is
     * not passed in.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeNameSpace")
    private final AttributeNameSpace attributeNameSpace;

    /**
     * Namespace of the attribute whose properties were updated.  The attributeNameSpace will default to TRACES if it is
     * not passed in.
     *
     * @return the value
     **/
    public AttributeNameSpace getAttributeNameSpace() {
        return attributeNameSpace;
    }

    /**
     * Status of the attribute after this operation.  The attribute can have one of the following statuses after the pin operation.  The attribute
     * can have either a success status or an error status.  The status of the attribute must be correlated with the operation status property in the bulk operation metadata
     * object.  The bulk operation will be successful only when all attributes in the bulk request are processed successfully and they get a success status back.
     * The following are successful status values of individual attribute items in a bulk attribute pin operation.
     * ATTRIBUTE_PINNED - The attribute is marked pinned and associated notes have been added.
     * ATTRIBUTE_ALREADY_PINNED - The caller is trying to pin an attribute that has already been pinned.
     * DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an attribute that was present in this bulk request.  Note that we deduplicate the attribute collection, process only unique attributes,
     * and call out duplicates.  A duplicate attribute in a bulk request will not prevent the processing of further attributes in the bulk operation.
     * The following values are error statuses and the bulk processing is stopped when the first error is encountered.
     * PIN_NOT_ALLOWED - The caller has asked to pin an active attribute which is not allowed.
     * INVALID_ATTRIBUTE - The attribute is invalid.
     * ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as there was another attribute in this bulk request collection that resulted in a processing error.
     *
     **/
    public enum AttributeStatus {
        AttributeAlreadyPinned("ATTRIBUTE_ALREADY_PINNED"),
        AttributePinned("ATTRIBUTE_PINNED"),
        PinNotAllowed("PIN_NOT_ALLOWED"),
        DuplicateAttribute("DUPLICATE_ATTRIBUTE"),
        InvalidAttribute("INVALID_ATTRIBUTE"),
        AttributeNotProcessed("ATTRIBUTE_NOT_PROCESSED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Status of the attribute after this operation.  The attribute can have one of the following statuses after the pin operation.  The attribute
     * can have either a success status or an error status.  The status of the attribute must be correlated with the operation status property in the bulk operation metadata
     * object.  The bulk operation will be successful only when all attributes in the bulk request are processed successfully and they get a success status back.
     * The following are successful status values of individual attribute items in a bulk attribute pin operation.
     * ATTRIBUTE_PINNED - The attribute is marked pinned and associated notes have been added.
     * ATTRIBUTE_ALREADY_PINNED - The caller is trying to pin an attribute that has already been pinned.
     * DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an attribute that was present in this bulk request.  Note that we deduplicate the attribute collection, process only unique attributes,
     * and call out duplicates.  A duplicate attribute in a bulk request will not prevent the processing of further attributes in the bulk operation.
     * The following values are error statuses and the bulk processing is stopped when the first error is encountered.
     * PIN_NOT_ALLOWED - The caller has asked to pin an active attribute which is not allowed.
     * INVALID_ATTRIBUTE - The attribute is invalid.
     * ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as there was another attribute in this bulk request collection that resulted in a processing error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeStatus")
    private final AttributeStatus attributeStatus;

    /**
     * Status of the attribute after this operation.  The attribute can have one of the following statuses after the pin operation.  The attribute
     * can have either a success status or an error status.  The status of the attribute must be correlated with the operation status property in the bulk operation metadata
     * object.  The bulk operation will be successful only when all attributes in the bulk request are processed successfully and they get a success status back.
     * The following are successful status values of individual attribute items in a bulk attribute pin operation.
     * ATTRIBUTE_PINNED - The attribute is marked pinned and associated notes have been added.
     * ATTRIBUTE_ALREADY_PINNED - The caller is trying to pin an attribute that has already been pinned.
     * DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an attribute that was present in this bulk request.  Note that we deduplicate the attribute collection, process only unique attributes,
     * and call out duplicates.  A duplicate attribute in a bulk request will not prevent the processing of further attributes in the bulk operation.
     * The following values are error statuses and the bulk processing is stopped when the first error is encountered.
     * PIN_NOT_ALLOWED - The caller has asked to pin an active attribute which is not allowed.
     * INVALID_ATTRIBUTE - The attribute is invalid.
     * ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as there was another attribute in this bulk request collection that resulted in a processing error.
     *
     * @return the value
     **/
    public AttributeStatus getAttributeStatus() {
        return attributeStatus;
    }

    /**
     * Time when the attribute was activated or deactivated.  Note that ingest might not have picked up the changes even if this time has elapsed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the attribute was activated or deactivated.  Note that ingest might not have picked up the changes even if this time has elapsed.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("AttributePinResponse(");
        sb.append("super=").append(super.toString());
        sb.append("attributeName=").append(String.valueOf(this.attributeName));
        sb.append(", notes=").append(String.valueOf(this.notes));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", attributeNameSpace=").append(String.valueOf(this.attributeNameSpace));
        sb.append(", attributeStatus=").append(String.valueOf(this.attributeStatus));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttributePinResponse)) {
            return false;
        }

        AttributePinResponse other = (AttributePinResponse) o;
        return java.util.Objects.equals(this.attributeName, other.attributeName)
                && java.util.Objects.equals(this.notes, other.notes)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.attributeNameSpace, other.attributeNameSpace)
                && java.util.Objects.equals(this.attributeStatus, other.attributeStatus)
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
        result = (result * PRIME) + (this.notes == null ? 43 : this.notes.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeNameSpace == null
                                ? 43
                                : this.attributeNameSpace.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeStatus == null ? 43 : this.attributeStatus.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
