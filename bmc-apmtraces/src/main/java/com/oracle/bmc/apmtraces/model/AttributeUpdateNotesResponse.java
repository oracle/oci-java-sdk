/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Response of an individual attribute item in the bulk update notes operation. <br>
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
        builder = AttributeUpdateNotesResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttributeUpdateNotesResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "attributeName",
        "notes",
        "operationType",
        "attributeNameSpace",
        "attributeStatus",
        "timeUpdated"
    })
    public AttributeUpdateNotesResponse(
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
        /** Attribute for which notes were added to or edited in this bulk operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeName")
        private String attributeName;

        /**
         * Attribute for which notes were added to or edited in this bulk operation.
         *
         * @param attributeName the value to set
         * @return this builder
         */
        public Builder attributeName(String attributeName) {
            this.attributeName = attributeName;
            this.__explicitlySet__.add("attributeName");
            return this;
        }
        /** Notes added to or edited for this attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("notes")
        private String notes;

        /**
         * Notes added to or edited for this attribute.
         *
         * @param notes the value to set
         * @return this builder
         */
        public Builder notes(String notes) {
            this.notes = notes;
            this.__explicitlySet__.add("notes");
            return this;
        }
        /** Type of operation - UPDATE_NOTES. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * Type of operation - UPDATE_NOTES.
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
         * Namespace of the attribute whose notes were updated. The attributeNameSpace will default
         * to TRACES if it is not passed in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeNameSpace")
        private AttributeNameSpace attributeNameSpace;

        /**
         * Namespace of the attribute whose notes were updated. The attributeNameSpace will default
         * to TRACES if it is not passed in.
         *
         * @param attributeNameSpace the value to set
         * @return this builder
         */
        public Builder attributeNameSpace(AttributeNameSpace attributeNameSpace) {
            this.attributeNameSpace = attributeNameSpace;
            this.__explicitlySet__.add("attributeNameSpace");
            return this;
        }
        /**
         * Status of the attribute after this operation. The attribute can have one of the following
         * statuses after the update notes operation. The attribute can have either a success status
         * or an error status. The status of the attribute must be correlated with the operation
         * status property in the bulk operation metadata object. The bulk operation will be
         * successful only when all attributes in the bulk request are processed successfully and
         * they get a success status back. The following are successful status values of individual
         * attribute items in a bulk update notes operation. ATTRIBUTE_NOTES_UPDATED - The
         * attribute's notes have been updated with the given notes. DUPLICATE_ATTRIBUTE - The
         * attribute is a duplicate of an attribute that was present in this bulk request. Note that
         * we deduplicate the attribute collection, process only unique attributes, and call out
         * duplicates. A duplicate attribute in a bulk request will not prevent the processing of
         * further attributes in the bulk operation. The following values are error statuses and the
         * bulk processing is stopped when the first error is encountered. INVALID_ATTRIBUTE - The
         * attribute is invalid. The length of the notes is more than a 1000 characters.
         * ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as there was another attribute
         * in this bulk request collection that resulted in a processing error.
         * ATTRIBUTE_DOES_NOT_EXIST - Attribute was neither active nor pinned inactive.
         * NOTES_TOO_LONG - Attribute notes were too long (more than 1000 chars).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeStatus")
        private AttributeStatus attributeStatus;

        /**
         * Status of the attribute after this operation. The attribute can have one of the following
         * statuses after the update notes operation. The attribute can have either a success status
         * or an error status. The status of the attribute must be correlated with the operation
         * status property in the bulk operation metadata object. The bulk operation will be
         * successful only when all attributes in the bulk request are processed successfully and
         * they get a success status back. The following are successful status values of individual
         * attribute items in a bulk update notes operation. ATTRIBUTE_NOTES_UPDATED - The
         * attribute's notes have been updated with the given notes. DUPLICATE_ATTRIBUTE - The
         * attribute is a duplicate of an attribute that was present in this bulk request. Note that
         * we deduplicate the attribute collection, process only unique attributes, and call out
         * duplicates. A duplicate attribute in a bulk request will not prevent the processing of
         * further attributes in the bulk operation. The following values are error statuses and the
         * bulk processing is stopped when the first error is encountered. INVALID_ATTRIBUTE - The
         * attribute is invalid. The length of the notes is more than a 1000 characters.
         * ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as there was another attribute
         * in this bulk request collection that resulted in a processing error.
         * ATTRIBUTE_DOES_NOT_EXIST - Attribute was neither active nor pinned inactive.
         * NOTES_TOO_LONG - Attribute notes were too long (more than 1000 chars).
         *
         * @param attributeStatus the value to set
         * @return this builder
         */
        public Builder attributeStatus(AttributeStatus attributeStatus) {
            this.attributeStatus = attributeStatus;
            this.__explicitlySet__.add("attributeStatus");
            return this;
        }
        /** Time when the attribute's notes were updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the attribute's notes were updated.
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

        public AttributeUpdateNotesResponse build() {
            AttributeUpdateNotesResponse model =
                    new AttributeUpdateNotesResponse(
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
        public Builder copy(AttributeUpdateNotesResponse model) {
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Attribute for which notes were added to or edited in this bulk operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeName")
    private final String attributeName;

    /**
     * Attribute for which notes were added to or edited in this bulk operation.
     *
     * @return the value
     */
    public String getAttributeName() {
        return attributeName;
    }

    /** Notes added to or edited for this attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("notes")
    private final String notes;

    /**
     * Notes added to or edited for this attribute.
     *
     * @return the value
     */
    public String getNotes() {
        return notes;
    }

    /** Type of operation - UPDATE_NOTES. */
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
    /** Type of operation - UPDATE_NOTES. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * Type of operation - UPDATE_NOTES.
     *
     * @return the value
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Namespace of the attribute whose notes were updated. The attributeNameSpace will default to
     * TRACES if it is not passed in.
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
     * Namespace of the attribute whose notes were updated. The attributeNameSpace will default to
     * TRACES if it is not passed in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeNameSpace")
    private final AttributeNameSpace attributeNameSpace;

    /**
     * Namespace of the attribute whose notes were updated. The attributeNameSpace will default to
     * TRACES if it is not passed in.
     *
     * @return the value
     */
    public AttributeNameSpace getAttributeNameSpace() {
        return attributeNameSpace;
    }

    /**
     * Status of the attribute after this operation. The attribute can have one of the following
     * statuses after the update notes operation. The attribute can have either a success status or
     * an error status. The status of the attribute must be correlated with the operation status
     * property in the bulk operation metadata object. The bulk operation will be successful only
     * when all attributes in the bulk request are processed successfully and they get a success
     * status back. The following are successful status values of individual attribute items in a
     * bulk update notes operation. ATTRIBUTE_NOTES_UPDATED - The attribute's notes have been
     * updated with the given notes. DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an
     * attribute that was present in this bulk request. Note that we deduplicate the attribute
     * collection, process only unique attributes, and call out duplicates. A duplicate attribute in
     * a bulk request will not prevent the processing of further attributes in the bulk operation.
     * The following values are error statuses and the bulk processing is stopped when the first
     * error is encountered. INVALID_ATTRIBUTE - The attribute is invalid. The length of the notes
     * is more than a 1000 characters. ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as
     * there was another attribute in this bulk request collection that resulted in a processing
     * error. ATTRIBUTE_DOES_NOT_EXIST - Attribute was neither active nor pinned inactive.
     * NOTES_TOO_LONG - Attribute notes were too long (more than 1000 chars).
     */
    public enum AttributeStatus implements com.oracle.bmc.http.internal.BmcEnum {
        AttributeNotesUpdated("ATTRIBUTE_NOTES_UPDATED"),
        DuplicateAttribute("DUPLICATE_ATTRIBUTE"),
        InvalidAttribute("INVALID_ATTRIBUTE"),
        AttributeNotProcessed("ATTRIBUTE_NOT_PROCESSED"),
        AttributeDoesNotExist("ATTRIBUTE_DOES_NOT_EXIST"),
        NotesTooLong("NOTES_TOO_LONG"),

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
     * statuses after the update notes operation. The attribute can have either a success status or
     * an error status. The status of the attribute must be correlated with the operation status
     * property in the bulk operation metadata object. The bulk operation will be successful only
     * when all attributes in the bulk request are processed successfully and they get a success
     * status back. The following are successful status values of individual attribute items in a
     * bulk update notes operation. ATTRIBUTE_NOTES_UPDATED - The attribute's notes have been
     * updated with the given notes. DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an
     * attribute that was present in this bulk request. Note that we deduplicate the attribute
     * collection, process only unique attributes, and call out duplicates. A duplicate attribute in
     * a bulk request will not prevent the processing of further attributes in the bulk operation.
     * The following values are error statuses and the bulk processing is stopped when the first
     * error is encountered. INVALID_ATTRIBUTE - The attribute is invalid. The length of the notes
     * is more than a 1000 characters. ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as
     * there was another attribute in this bulk request collection that resulted in a processing
     * error. ATTRIBUTE_DOES_NOT_EXIST - Attribute was neither active nor pinned inactive.
     * NOTES_TOO_LONG - Attribute notes were too long (more than 1000 chars).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeStatus")
    private final AttributeStatus attributeStatus;

    /**
     * Status of the attribute after this operation. The attribute can have one of the following
     * statuses after the update notes operation. The attribute can have either a success status or
     * an error status. The status of the attribute must be correlated with the operation status
     * property in the bulk operation metadata object. The bulk operation will be successful only
     * when all attributes in the bulk request are processed successfully and they get a success
     * status back. The following are successful status values of individual attribute items in a
     * bulk update notes operation. ATTRIBUTE_NOTES_UPDATED - The attribute's notes have been
     * updated with the given notes. DUPLICATE_ATTRIBUTE - The attribute is a duplicate of an
     * attribute that was present in this bulk request. Note that we deduplicate the attribute
     * collection, process only unique attributes, and call out duplicates. A duplicate attribute in
     * a bulk request will not prevent the processing of further attributes in the bulk operation.
     * The following values are error statuses and the bulk processing is stopped when the first
     * error is encountered. INVALID_ATTRIBUTE - The attribute is invalid. The length of the notes
     * is more than a 1000 characters. ATTRIBUTE_NOT_PROCESSED - The attribute was not processed, as
     * there was another attribute in this bulk request collection that resulted in a processing
     * error. ATTRIBUTE_DOES_NOT_EXIST - Attribute was neither active nor pinned inactive.
     * NOTES_TOO_LONG - Attribute notes were too long (more than 1000 chars).
     *
     * @return the value
     */
    public AttributeStatus getAttributeStatus() {
        return attributeStatus;
    }

    /** Time when the attribute's notes were updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the attribute's notes were updated.
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
        sb.append("AttributeUpdateNotesResponse(");
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
        if (!(o instanceof AttributeUpdateNotesResponse)) {
            return false;
        }

        AttributeUpdateNotesResponse other = (AttributeUpdateNotesResponse) o;
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
