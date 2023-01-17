/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * A record represents an entry in a dataset that needs labeling. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Record.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Record extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "timeCreated",
        "timeUpdated",
        "datasetId",
        "compartmentId",
        "sourceDetails",
        "isLabeled",
        "lifecycleState",
        "lifetimeLogicalClock",
        "recordMetadata",
        "freeformTags",
        "definedTags"
    })
    public Record(
            String id,
            String name,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String datasetId,
            String compartmentId,
            SourceDetails sourceDetails,
            Boolean isLabeled,
            LifecycleState lifecycleState,
            Integer lifetimeLogicalClock,
            RecordMetadata recordMetadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.name = name;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.datasetId = datasetId;
        this.compartmentId = compartmentId;
        this.sourceDetails = sourceDetails;
        this.isLabeled = isLabeled;
        this.lifecycleState = lifecycleState;
        this.lifetimeLogicalClock = lifetimeLogicalClock;
        this.recordMetadata = recordMetadata;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the record. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the record.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name is created by the user. It is unique and immutable. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name is created by the user. It is unique and immutable.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The date and time the resource was created, in the timestamp format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created, in the timestamp format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the resource was updated, in the timestamp format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource was updated, in the timestamp format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The OCID of the dataset to associate the record with. */
        @com.fasterxml.jackson.annotation.JsonProperty("datasetId")
        private String datasetId;

        /**
         * The OCID of the dataset to associate the record with.
         *
         * @param datasetId the value to set
         * @return this builder
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            this.__explicitlySet__.add("datasetId");
            return this;
        }
        /** The OCID of the compartment for the task. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment for the task.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private SourceDetails sourceDetails;

        public Builder sourceDetails(SourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }
        /** Whether or not the record has been labeled and has associated annotations. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLabeled")
        private Boolean isLabeled;

        /**
         * Whether or not the record has been labeled and has associated annotations.
         *
         * @param isLabeled the value to set
         * @return this builder
         */
        public Builder isLabeled(Boolean isLabeled) {
            this.isLabeled = isLabeled;
            this.__explicitlySet__.add("isLabeled");
            return this;
        }
        /**
         * The lifecycle state of the record. ACTIVE - The record is active and ready for labeling.
         * INACTIVE - The record has been marked as inactive and should not be used for labeling.
         * DELETED - The record has been deleted and is no longer available for labeling.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The lifecycle state of the record. ACTIVE - The record is active and ready for labeling.
         * INACTIVE - The record has been marked as inactive and should not be used for labeling.
         * DELETED - The record has been deleted and is no longer available for labeling.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * An integer value used in achieving concurrency control, this field will be used to
         * generate eTags.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifetimeLogicalClock")
        private Integer lifetimeLogicalClock;

        /**
         * An integer value used in achieving concurrency control, this field will be used to
         * generate eTags.
         *
         * @param lifetimeLogicalClock the value to set
         * @return this builder
         */
        public Builder lifetimeLogicalClock(Integer lifetimeLogicalClock) {
            this.lifetimeLogicalClock = lifetimeLogicalClock;
            this.__explicitlySet__.add("lifetimeLogicalClock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recordMetadata")
        private RecordMetadata recordMetadata;

        public Builder recordMetadata(RecordMetadata recordMetadata) {
            this.recordMetadata = recordMetadata;
            this.__explicitlySet__.add("recordMetadata");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It
         * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It
         * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * The defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public Record build() {
            Record model =
                    new Record(
                            this.id,
                            this.name,
                            this.timeCreated,
                            this.timeUpdated,
                            this.datasetId,
                            this.compartmentId,
                            this.sourceDetails,
                            this.isLabeled,
                            this.lifecycleState,
                            this.lifetimeLogicalClock,
                            this.recordMetadata,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Record model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("datasetId")) {
                this.datasetId(model.getDatasetId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sourceDetails")) {
                this.sourceDetails(model.getSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("isLabeled")) {
                this.isLabeled(model.getIsLabeled());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifetimeLogicalClock")) {
                this.lifetimeLogicalClock(model.getLifetimeLogicalClock());
            }
            if (model.wasPropertyExplicitlySet("recordMetadata")) {
                this.recordMetadata(model.getRecordMetadata());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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

    /** The OCID of the record. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the record.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name is created by the user. It is unique and immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name is created by the user. It is unique and immutable.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The date and time the resource was created, in the timestamp format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created, in the timestamp format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the resource was updated, in the timestamp format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was updated, in the timestamp format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The OCID of the dataset to associate the record with. */
    @com.fasterxml.jackson.annotation.JsonProperty("datasetId")
    private final String datasetId;

    /**
     * The OCID of the dataset to associate the record with.
     *
     * @return the value
     */
    public String getDatasetId() {
        return datasetId;
    }

    /** The OCID of the compartment for the task. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment for the task.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final SourceDetails sourceDetails;

    public SourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /** Whether or not the record has been labeled and has associated annotations. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLabeled")
    private final Boolean isLabeled;

    /**
     * Whether or not the record has been labeled and has associated annotations.
     *
     * @return the value
     */
    public Boolean getIsLabeled() {
        return isLabeled;
    }

    /**
     * The lifecycle state of the record. ACTIVE - The record is active and ready for labeling.
     * INACTIVE - The record has been marked as inactive and should not be used for labeling.
     * DELETED - The record has been deleted and is no longer available for labeling.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The lifecycle state of the record. ACTIVE - The record is active and ready for labeling.
     * INACTIVE - The record has been marked as inactive and should not be used for labeling.
     * DELETED - The record has been deleted and is no longer available for labeling.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The lifecycle state of the record. ACTIVE - The record is active and ready for labeling.
     * INACTIVE - The record has been marked as inactive and should not be used for labeling.
     * DELETED - The record has been deleted and is no longer available for labeling.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * An integer value used in achieving concurrency control, this field will be used to generate
     * eTags.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifetimeLogicalClock")
    private final Integer lifetimeLogicalClock;

    /**
     * An integer value used in achieving concurrency control, this field will be used to generate
     * eTags.
     *
     * @return the value
     */
    public Integer getLifetimeLogicalClock() {
        return lifetimeLogicalClock;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("recordMetadata")
    private final RecordMetadata recordMetadata;

    public RecordMetadata getRecordMetadata() {
        return recordMetadata;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It
     * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It
     * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The defined tags for this resource. Each key is predefined and scoped to a namespace. For
     * example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags for this resource. Each key is predefined and scoped to a namespace. For
     * example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("Record(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", datasetId=").append(String.valueOf(this.datasetId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", isLabeled=").append(String.valueOf(this.isLabeled));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifetimeLogicalClock=").append(String.valueOf(this.lifetimeLogicalClock));
        sb.append(", recordMetadata=").append(String.valueOf(this.recordMetadata));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Record)) {
            return false;
        }

        Record other = (Record) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.datasetId, other.datasetId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(this.isLabeled, other.isLabeled)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifetimeLogicalClock, other.lifetimeLogicalClock)
                && java.util.Objects.equals(this.recordMetadata, other.recordMetadata)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.datasetId == null ? 43 : this.datasetId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result = (result * PRIME) + (this.isLabeled == null ? 43 : this.isLabeled.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifetimeLogicalClock == null
                                ? 43
                                : this.lifetimeLogicalClock.hashCode());
        result =
                (result * PRIME)
                        + (this.recordMetadata == null ? 43 : this.recordMetadata.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
