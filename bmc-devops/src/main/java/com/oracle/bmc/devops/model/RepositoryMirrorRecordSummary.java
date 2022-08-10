/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Object containing information about a mirror record.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RepositoryMirrorRecordSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RepositoryMirrorRecordSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "mirrorStatus",
        "workRequestId",
        "timeEnqueued",
        "timeStarted",
        "timeCompleted",
        "freeformTags",
        "definedTags"
    })
    public RepositoryMirrorRecordSummary(
            MirrorStatus mirrorStatus,
            String workRequestId,
            java.util.Date timeEnqueued,
            java.util.Date timeStarted,
            java.util.Date timeCompleted,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.mirrorStatus = mirrorStatus;
        this.workRequestId = workRequestId;
        this.timeEnqueued = timeEnqueued;
        this.timeStarted = timeStarted;
        this.timeCompleted = timeCompleted;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Mirror status of current mirror entry.
         * QUEUED - Mirroring Queued
         * RUNNING - Mirroring is Running
         * PASSED - Mirroring Passed
         * FAILED - Mirroring Failed
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mirrorStatus")
        private MirrorStatus mirrorStatus;

        /**
         * Mirror status of current mirror entry.
         * QUEUED - Mirroring Queued
         * RUNNING - Mirroring is Running
         * PASSED - Mirroring Passed
         * FAILED - Mirroring Failed
         *
         * @param mirrorStatus the value to set
         * @return this builder
         **/
        public Builder mirrorStatus(MirrorStatus mirrorStatus) {
            this.mirrorStatus = mirrorStatus;
            this.__explicitlySet__.add("mirrorStatus");
            return this;
        }
        /**
         * Workrequest ID to track current mirror operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * Workrequest ID to track current mirror operation.
         * @param workRequestId the value to set
         * @return this builder
         **/
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }
        /**
         * The time to enqueue a mirror operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnqueued")
        private java.util.Date timeEnqueued;

        /**
         * The time to enqueue a mirror operation.
         * @param timeEnqueued the value to set
         * @return this builder
         **/
        public Builder timeEnqueued(java.util.Date timeEnqueued) {
            this.timeEnqueued = timeEnqueued;
            this.__explicitlySet__.add("timeEnqueued");
            return this;
        }
        /**
         * The time to start a mirror operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time to start a mirror operation.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The time to complete a mirror operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        /**
         * The time to complete a mirror operation.
         * @param timeCompleted the value to set
         * @return this builder
         **/
        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RepositoryMirrorRecordSummary build() {
            RepositoryMirrorRecordSummary model =
                    new RepositoryMirrorRecordSummary(
                            this.mirrorStatus,
                            this.workRequestId,
                            this.timeEnqueued,
                            this.timeStarted,
                            this.timeCompleted,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepositoryMirrorRecordSummary model) {
            if (model.wasPropertyExplicitlySet("mirrorStatus")) {
                this.mirrorStatus(model.getMirrorStatus());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("timeEnqueued")) {
                this.timeEnqueued(model.getTimeEnqueued());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeCompleted")) {
                this.timeCompleted(model.getTimeCompleted());
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
     * Mirror status of current mirror entry.
     * QUEUED - Mirroring Queued
     * RUNNING - Mirroring is Running
     * PASSED - Mirroring Passed
     * FAILED - Mirroring Failed
     *
     **/
    public enum MirrorStatus {
        None("NONE"),
        Queued("QUEUED"),
        Running("RUNNING"),
        Passed("PASSED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MirrorStatus.class);

        private final String value;
        private static java.util.Map<String, MirrorStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (MirrorStatus v : MirrorStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MirrorStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MirrorStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MirrorStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Mirror status of current mirror entry.
     * QUEUED - Mirroring Queued
     * RUNNING - Mirroring is Running
     * PASSED - Mirroring Passed
     * FAILED - Mirroring Failed
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mirrorStatus")
    private final MirrorStatus mirrorStatus;

    /**
     * Mirror status of current mirror entry.
     * QUEUED - Mirroring Queued
     * RUNNING - Mirroring is Running
     * PASSED - Mirroring Passed
     * FAILED - Mirroring Failed
     *
     * @return the value
     **/
    public MirrorStatus getMirrorStatus() {
        return mirrorStatus;
    }

    /**
     * Workrequest ID to track current mirror operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * Workrequest ID to track current mirror operation.
     * @return the value
     **/
    public String getWorkRequestId() {
        return workRequestId;
    }

    /**
     * The time to enqueue a mirror operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnqueued")
    private final java.util.Date timeEnqueued;

    /**
     * The time to enqueue a mirror operation.
     * @return the value
     **/
    public java.util.Date getTimeEnqueued() {
        return timeEnqueued;
    }

    /**
     * The time to start a mirror operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time to start a mirror operation.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The time to complete a mirror operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    /**
     * The time to complete a mirror operation.
     * @return the value
     **/
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("RepositoryMirrorRecordSummary(");
        sb.append("super=").append(super.toString());
        sb.append("mirrorStatus=").append(String.valueOf(this.mirrorStatus));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", timeEnqueued=").append(String.valueOf(this.timeEnqueued));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
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
        if (!(o instanceof RepositoryMirrorRecordSummary)) {
            return false;
        }

        RepositoryMirrorRecordSummary other = (RepositoryMirrorRecordSummary) o;
        return java.util.Objects.equals(this.mirrorStatus, other.mirrorStatus)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.timeEnqueued, other.timeEnqueued)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mirrorStatus == null ? 43 : this.mirrorStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result = (result * PRIME) + (this.timeEnqueued == null ? 43 : this.timeEnqueued.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
