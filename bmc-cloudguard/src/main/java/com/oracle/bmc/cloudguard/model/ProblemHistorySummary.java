/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Problem history definition. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProblemHistorySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProblemHistorySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "problemId",
        "actorType",
        "actorName",
        "explanation",
        "lifecycleDetail",
        "eventStatus",
        "timeCreated",
        "delta",
        "comment",
        "locks"
    })
    public ProblemHistorySummary(
            String id,
            String problemId,
            ActorType actorType,
            String actorName,
            String explanation,
            ProblemLifecycleDetail lifecycleDetail,
            EventStatus eventStatus,
            java.util.Date timeCreated,
            String delta,
            String comment,
            java.util.List<ResourceLock> locks) {
        super();
        this.id = id;
        this.problemId = problemId;
        this.actorType = actorType;
        this.actorName = actorName;
        this.explanation = explanation;
        this.lifecycleDetail = lifecycleDetail;
        this.eventStatus = eventStatus;
        this.timeCreated = timeCreated;
        this.delta = delta;
        this.comment = comment;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the history record */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for the history record
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Problem ID with which history is associated */
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * Problem ID with which history is associated
         *
         * @param problemId the value to set
         * @return this builder
         */
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /** Type of actor who performed the operation */
        @com.fasterxml.jackson.annotation.JsonProperty("actorType")
        private ActorType actorType;

        /**
         * Type of actor who performed the operation
         *
         * @param actorType the value to set
         * @return this builder
         */
        public Builder actorType(ActorType actorType) {
            this.actorType = actorType;
            this.__explicitlySet__.add("actorType");
            return this;
        }
        /** Resource name who performed the activity */
        @com.fasterxml.jackson.annotation.JsonProperty("actorName")
        private String actorName;

        /**
         * Resource name who performed the activity
         *
         * @param actorName the value to set
         * @return this builder
         */
        public Builder actorName(String actorName) {
            this.actorName = actorName;
            this.__explicitlySet__.add("actorName");
            return this;
        }
        /** Activity explanation details */
        @com.fasterxml.jackson.annotation.JsonProperty("explanation")
        private String explanation;

        /**
         * Activity explanation details
         *
         * @param explanation the value to set
         * @return this builder
         */
        public Builder explanation(String explanation) {
            this.explanation = explanation;
            this.__explicitlySet__.add("explanation");
            return this;
        }
        /** Additional details on the substate of the lifecycle state */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
        private ProblemLifecycleDetail lifecycleDetail;

        /**
         * Additional details on the substate of the lifecycle state
         *
         * @param lifecycleDetail the value to set
         * @return this builder
         */
        public Builder lifecycleDetail(ProblemLifecycleDetail lifecycleDetail) {
            this.lifecycleDetail = lifecycleDetail;
            this.__explicitlySet__.add("lifecycleDetail");
            return this;
        }
        /** Event status */
        @com.fasterxml.jackson.annotation.JsonProperty("eventStatus")
        private EventStatus eventStatus;

        /**
         * Event status
         *
         * @param eventStatus the value to set
         * @return this builder
         */
        public Builder eventStatus(EventStatus eventStatus) {
            this.eventStatus = eventStatus;
            this.__explicitlySet__.add("eventStatus");
            return this;
        }
        /** Date and time the problem was created */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the problem was created
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Impacted resource names in a comma-separated string */
        @com.fasterxml.jackson.annotation.JsonProperty("delta")
        private String delta;

        /**
         * Impacted resource names in a comma-separated string
         *
         * @param delta the value to set
         * @return this builder
         */
        public Builder delta(String delta) {
            this.delta = delta;
            this.__explicitlySet__.add("delta");
            return this;
        }
        /** User-defined comments */
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * User-defined comments
         *
         * @param comment the value to set
         * @return this builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProblemHistorySummary build() {
            ProblemHistorySummary model =
                    new ProblemHistorySummary(
                            this.id,
                            this.problemId,
                            this.actorType,
                            this.actorName,
                            this.explanation,
                            this.lifecycleDetail,
                            this.eventStatus,
                            this.timeCreated,
                            this.delta,
                            this.comment,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProblemHistorySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("problemId")) {
                this.problemId(model.getProblemId());
            }
            if (model.wasPropertyExplicitlySet("actorType")) {
                this.actorType(model.getActorType());
            }
            if (model.wasPropertyExplicitlySet("actorName")) {
                this.actorName(model.getActorName());
            }
            if (model.wasPropertyExplicitlySet("explanation")) {
                this.explanation(model.getExplanation());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetail")) {
                this.lifecycleDetail(model.getLifecycleDetail());
            }
            if (model.wasPropertyExplicitlySet("eventStatus")) {
                this.eventStatus(model.getEventStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("delta")) {
                this.delta(model.getDelta());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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

    /** Unique identifier for the history record */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for the history record
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Problem ID with which history is associated */
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * Problem ID with which history is associated
     *
     * @return the value
     */
    public String getProblemId() {
        return problemId;
    }

    /** Type of actor who performed the operation */
    @com.fasterxml.jackson.annotation.JsonProperty("actorType")
    private final ActorType actorType;

    /**
     * Type of actor who performed the operation
     *
     * @return the value
     */
    public ActorType getActorType() {
        return actorType;
    }

    /** Resource name who performed the activity */
    @com.fasterxml.jackson.annotation.JsonProperty("actorName")
    private final String actorName;

    /**
     * Resource name who performed the activity
     *
     * @return the value
     */
    public String getActorName() {
        return actorName;
    }

    /** Activity explanation details */
    @com.fasterxml.jackson.annotation.JsonProperty("explanation")
    private final String explanation;

    /**
     * Activity explanation details
     *
     * @return the value
     */
    public String getExplanation() {
        return explanation;
    }

    /** Additional details on the substate of the lifecycle state */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetail")
    private final ProblemLifecycleDetail lifecycleDetail;

    /**
     * Additional details on the substate of the lifecycle state
     *
     * @return the value
     */
    public ProblemLifecycleDetail getLifecycleDetail() {
        return lifecycleDetail;
    }

    /** Event status */
    @com.fasterxml.jackson.annotation.JsonProperty("eventStatus")
    private final EventStatus eventStatus;

    /**
     * Event status
     *
     * @return the value
     */
    public EventStatus getEventStatus() {
        return eventStatus;
    }

    /** Date and time the problem was created */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the problem was created
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Impacted resource names in a comma-separated string */
    @com.fasterxml.jackson.annotation.JsonProperty("delta")
    private final String delta;

    /**
     * Impacted resource names in a comma-separated string
     *
     * @return the value
     */
    public String getDelta() {
        return delta;
    }

    /** User-defined comments */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * User-defined comments
     *
     * @return the value
     */
    public String getComment() {
        return comment;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("ProblemHistorySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", problemId=").append(String.valueOf(this.problemId));
        sb.append(", actorType=").append(String.valueOf(this.actorType));
        sb.append(", actorName=").append(String.valueOf(this.actorName));
        sb.append(", explanation=").append(String.valueOf(this.explanation));
        sb.append(", lifecycleDetail=").append(String.valueOf(this.lifecycleDetail));
        sb.append(", eventStatus=").append(String.valueOf(this.eventStatus));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", delta=").append(String.valueOf(this.delta));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProblemHistorySummary)) {
            return false;
        }

        ProblemHistorySummary other = (ProblemHistorySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.problemId, other.problemId)
                && java.util.Objects.equals(this.actorType, other.actorType)
                && java.util.Objects.equals(this.actorName, other.actorName)
                && java.util.Objects.equals(this.explanation, other.explanation)
                && java.util.Objects.equals(this.lifecycleDetail, other.lifecycleDetail)
                && java.util.Objects.equals(this.eventStatus, other.eventStatus)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.delta, other.delta)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.problemId == null ? 43 : this.problemId.hashCode());
        result = (result * PRIME) + (this.actorType == null ? 43 : this.actorType.hashCode());
        result = (result * PRIME) + (this.actorName == null ? 43 : this.actorName.hashCode());
        result = (result * PRIME) + (this.explanation == null ? 43 : this.explanation.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetail == null ? 43 : this.lifecycleDetail.hashCode());
        result = (result * PRIME) + (this.eventStatus == null ? 43 : this.eventStatus.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.delta == null ? 43 : this.delta.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
