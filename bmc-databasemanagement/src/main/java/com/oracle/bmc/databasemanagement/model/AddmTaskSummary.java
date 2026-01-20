/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The object containing the ADDM task metadata. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AddmTaskSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddmTaskSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "taskName",
        "taskId",
        "description",
        "dbUser",
        "status",
        "timeCreated",
        "howCreated",
        "startSnapshotTime",
        "endSnapshotTime",
        "beginSnapshotId",
        "endSnapshotId",
        "findings"
    })
    public AddmTaskSummary(
            String taskName,
            Long taskId,
            String description,
            String dbUser,
            Status status,
            java.util.Date timeCreated,
            HowCreated howCreated,
            java.util.Date startSnapshotTime,
            java.util.Date endSnapshotTime,
            Long beginSnapshotId,
            Long endSnapshotId,
            Long findings) {
        super();
        this.taskName = taskName;
        this.taskId = taskId;
        this.description = description;
        this.dbUser = dbUser;
        this.status = status;
        this.timeCreated = timeCreated;
        this.howCreated = howCreated;
        this.startSnapshotTime = startSnapshotTime;
        this.endSnapshotTime = endSnapshotTime;
        this.beginSnapshotId = beginSnapshotId;
        this.endSnapshotId = endSnapshotId;
        this.findings = findings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the ADDM task. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskName")
        private String taskName;

        /**
         * The name of the ADDM task.
         *
         * @param taskName the value to set
         * @return this builder
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            this.__explicitlySet__.add("taskName");
            return this;
        }
        /** The ID number of the ADDM task. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskId")
        private Long taskId;

        /**
         * The ID number of the ADDM task.
         *
         * @param taskId the value to set
         * @return this builder
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            this.__explicitlySet__.add("taskId");
            return this;
        }
        /** The description of the ADDM task. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the ADDM task.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The database user who owns the ADDM task. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUser")
        private String dbUser;

        /**
         * The database user who owns the ADDM task.
         *
         * @param dbUser the value to set
         * @return this builder
         */
        public Builder dbUser(String dbUser) {
            this.dbUser = dbUser;
            this.__explicitlySet__.add("dbUser");
            return this;
        }
        /** The status of the ADDM task. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the ADDM task.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The creation date of the ADDM task. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The creation date of the ADDM task.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** A description of how the task was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("howCreated")
        private HowCreated howCreated;

        /**
         * A description of how the task was created.
         *
         * @param howCreated the value to set
         * @return this builder
         */
        public Builder howCreated(HowCreated howCreated) {
            this.howCreated = howCreated;
            this.__explicitlySet__.add("howCreated");
            return this;
        }
        /**
         * The timestamp of the beginning AWR snapshot used in the ADDM task as defined by date-time
         * RFC3339 format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("startSnapshotTime")
        private java.util.Date startSnapshotTime;

        /**
         * The timestamp of the beginning AWR snapshot used in the ADDM task as defined by date-time
         * RFC3339 format.
         *
         * @param startSnapshotTime the value to set
         * @return this builder
         */
        public Builder startSnapshotTime(java.util.Date startSnapshotTime) {
            this.startSnapshotTime = startSnapshotTime;
            this.__explicitlySet__.add("startSnapshotTime");
            return this;
        }
        /**
         * The timestamp of the ending AWR snapshot used in the ADDM task as defined by date-time
         * RFC3339 format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endSnapshotTime")
        private java.util.Date endSnapshotTime;

        /**
         * The timestamp of the ending AWR snapshot used in the ADDM task as defined by date-time
         * RFC3339 format.
         *
         * @param endSnapshotTime the value to set
         * @return this builder
         */
        public Builder endSnapshotTime(java.util.Date endSnapshotTime) {
            this.endSnapshotTime = endSnapshotTime;
            this.__explicitlySet__.add("endSnapshotTime");
            return this;
        }
        /** The ID number of the beginning AWR snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("beginSnapshotId")
        private Long beginSnapshotId;

        /**
         * The ID number of the beginning AWR snapshot.
         *
         * @param beginSnapshotId the value to set
         * @return this builder
         */
        public Builder beginSnapshotId(Long beginSnapshotId) {
            this.beginSnapshotId = beginSnapshotId;
            this.__explicitlySet__.add("beginSnapshotId");
            return this;
        }
        /** The ID number of the ending AWR snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("endSnapshotId")
        private Long endSnapshotId;

        /**
         * The ID number of the ending AWR snapshot.
         *
         * @param endSnapshotId the value to set
         * @return this builder
         */
        public Builder endSnapshotId(Long endSnapshotId) {
            this.endSnapshotId = endSnapshotId;
            this.__explicitlySet__.add("endSnapshotId");
            return this;
        }
        /** The number of ADDM findings. */
        @com.fasterxml.jackson.annotation.JsonProperty("findings")
        private Long findings;

        /**
         * The number of ADDM findings.
         *
         * @param findings the value to set
         * @return this builder
         */
        public Builder findings(Long findings) {
            this.findings = findings;
            this.__explicitlySet__.add("findings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddmTaskSummary build() {
            AddmTaskSummary model =
                    new AddmTaskSummary(
                            this.taskName,
                            this.taskId,
                            this.description,
                            this.dbUser,
                            this.status,
                            this.timeCreated,
                            this.howCreated,
                            this.startSnapshotTime,
                            this.endSnapshotTime,
                            this.beginSnapshotId,
                            this.endSnapshotId,
                            this.findings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddmTaskSummary model) {
            if (model.wasPropertyExplicitlySet("taskName")) {
                this.taskName(model.getTaskName());
            }
            if (model.wasPropertyExplicitlySet("taskId")) {
                this.taskId(model.getTaskId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("dbUser")) {
                this.dbUser(model.getDbUser());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("howCreated")) {
                this.howCreated(model.getHowCreated());
            }
            if (model.wasPropertyExplicitlySet("startSnapshotTime")) {
                this.startSnapshotTime(model.getStartSnapshotTime());
            }
            if (model.wasPropertyExplicitlySet("endSnapshotTime")) {
                this.endSnapshotTime(model.getEndSnapshotTime());
            }
            if (model.wasPropertyExplicitlySet("beginSnapshotId")) {
                this.beginSnapshotId(model.getBeginSnapshotId());
            }
            if (model.wasPropertyExplicitlySet("endSnapshotId")) {
                this.endSnapshotId(model.getEndSnapshotId());
            }
            if (model.wasPropertyExplicitlySet("findings")) {
                this.findings(model.getFindings());
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

    /** The name of the ADDM task. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskName")
    private final String taskName;

    /**
     * The name of the ADDM task.
     *
     * @return the value
     */
    public String getTaskName() {
        return taskName;
    }

    /** The ID number of the ADDM task. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskId")
    private final Long taskId;

    /**
     * The ID number of the ADDM task.
     *
     * @return the value
     */
    public Long getTaskId() {
        return taskId;
    }

    /** The description of the ADDM task. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the ADDM task.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The database user who owns the ADDM task. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUser")
    private final String dbUser;

    /**
     * The database user who owns the ADDM task.
     *
     * @return the value
     */
    public String getDbUser() {
        return dbUser;
    }

    /** The status of the ADDM task. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Initial("INITIAL"),
        Executing("EXECUTING"),
        Interrupted("INTERRUPTED"),
        Completed("COMPLETED"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of the ADDM task. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the ADDM task.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The creation date of the ADDM task. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The creation date of the ADDM task.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** A description of how the task was created. */
    public enum HowCreated implements com.oracle.bmc.http.internal.BmcEnum {
        Auto("AUTO"),
        Manual("MANUAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HowCreated.class);

        private final String value;
        private static java.util.Map<String, HowCreated> map;

        static {
            map = new java.util.HashMap<>();
            for (HowCreated v : HowCreated.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HowCreated(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HowCreated create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HowCreated', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** A description of how the task was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("howCreated")
    private final HowCreated howCreated;

    /**
     * A description of how the task was created.
     *
     * @return the value
     */
    public HowCreated getHowCreated() {
        return howCreated;
    }

    /**
     * The timestamp of the beginning AWR snapshot used in the ADDM task as defined by date-time
     * RFC3339 format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startSnapshotTime")
    private final java.util.Date startSnapshotTime;

    /**
     * The timestamp of the beginning AWR snapshot used in the ADDM task as defined by date-time
     * RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getStartSnapshotTime() {
        return startSnapshotTime;
    }

    /**
     * The timestamp of the ending AWR snapshot used in the ADDM task as defined by date-time
     * RFC3339 format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endSnapshotTime")
    private final java.util.Date endSnapshotTime;

    /**
     * The timestamp of the ending AWR snapshot used in the ADDM task as defined by date-time
     * RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getEndSnapshotTime() {
        return endSnapshotTime;
    }

    /** The ID number of the beginning AWR snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("beginSnapshotId")
    private final Long beginSnapshotId;

    /**
     * The ID number of the beginning AWR snapshot.
     *
     * @return the value
     */
    public Long getBeginSnapshotId() {
        return beginSnapshotId;
    }

    /** The ID number of the ending AWR snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("endSnapshotId")
    private final Long endSnapshotId;

    /**
     * The ID number of the ending AWR snapshot.
     *
     * @return the value
     */
    public Long getEndSnapshotId() {
        return endSnapshotId;
    }

    /** The number of ADDM findings. */
    @com.fasterxml.jackson.annotation.JsonProperty("findings")
    private final Long findings;

    /**
     * The number of ADDM findings.
     *
     * @return the value
     */
    public Long getFindings() {
        return findings;
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
        sb.append("AddmTaskSummary(");
        sb.append("super=").append(super.toString());
        sb.append("taskName=").append(String.valueOf(this.taskName));
        sb.append(", taskId=").append(String.valueOf(this.taskId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dbUser=").append(String.valueOf(this.dbUser));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", howCreated=").append(String.valueOf(this.howCreated));
        sb.append(", startSnapshotTime=").append(String.valueOf(this.startSnapshotTime));
        sb.append(", endSnapshotTime=").append(String.valueOf(this.endSnapshotTime));
        sb.append(", beginSnapshotId=").append(String.valueOf(this.beginSnapshotId));
        sb.append(", endSnapshotId=").append(String.valueOf(this.endSnapshotId));
        sb.append(", findings=").append(String.valueOf(this.findings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddmTaskSummary)) {
            return false;
        }

        AddmTaskSummary other = (AddmTaskSummary) o;
        return java.util.Objects.equals(this.taskName, other.taskName)
                && java.util.Objects.equals(this.taskId, other.taskId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dbUser, other.dbUser)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.howCreated, other.howCreated)
                && java.util.Objects.equals(this.startSnapshotTime, other.startSnapshotTime)
                && java.util.Objects.equals(this.endSnapshotTime, other.endSnapshotTime)
                && java.util.Objects.equals(this.beginSnapshotId, other.beginSnapshotId)
                && java.util.Objects.equals(this.endSnapshotId, other.endSnapshotId)
                && java.util.Objects.equals(this.findings, other.findings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskName == null ? 43 : this.taskName.hashCode());
        result = (result * PRIME) + (this.taskId == null ? 43 : this.taskId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.dbUser == null ? 43 : this.dbUser.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.howCreated == null ? 43 : this.howCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.startSnapshotTime == null ? 43 : this.startSnapshotTime.hashCode());
        result =
                (result * PRIME)
                        + (this.endSnapshotTime == null ? 43 : this.endSnapshotTime.hashCode());
        result =
                (result * PRIME)
                        + (this.beginSnapshotId == null ? 43 : this.beginSnapshotId.hashCode());
        result =
                (result * PRIME)
                        + (this.endSnapshotId == null ? 43 : this.endSnapshotId.hashCode());
        result = (result * PRIME) + (this.findings == null ? 43 : this.findings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
