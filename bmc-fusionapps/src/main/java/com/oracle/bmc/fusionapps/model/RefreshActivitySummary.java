/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Summary of the refresh activity.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RefreshActivitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RefreshActivitySummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "sourceFusionEnvironmentId",
        "timeOfRestorationPoint",
        "lifecycleState",
        "timeScheduledStart",
        "timeExpectedFinish",
        "timeFinished",
        "serviceAvailability",
        "timeAccepted",
        "timeUpdated",
        "lifecycleDetails"
    })
    public RefreshActivitySummary(
            String id,
            String displayName,
            String sourceFusionEnvironmentId,
            java.util.Date timeOfRestorationPoint,
            RefreshActivity.LifecycleState lifecycleState,
            java.util.Date timeScheduledStart,
            java.util.Date timeExpectedFinish,
            java.util.Date timeFinished,
            RefreshActivity.ServiceAvailability serviceAvailability,
            java.util.Date timeAccepted,
            java.util.Date timeUpdated,
            RefreshActivity.LifecycleDetails lifecycleDetails) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.sourceFusionEnvironmentId = sourceFusionEnvironmentId;
        this.timeOfRestorationPoint = timeOfRestorationPoint;
        this.lifecycleState = lifecycleState;
        this.timeScheduledStart = timeScheduledStart;
        this.timeExpectedFinish = timeExpectedFinish;
        this.timeFinished = timeFinished;
        this.serviceAvailability = serviceAvailability;
        this.timeAccepted = timeAccepted;
        this.timeUpdated = timeUpdated;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) of the refresh activity. Can't be changed after creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the refresh activity. Can't be changed after creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A friendly name for the refresh activity. Can be changed later.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A friendly name for the refresh activity. Can be changed later.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the Fusion environment that is the source environment for the refresh.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceFusionEnvironmentId")
        private String sourceFusionEnvironmentId;

        /**
         * The OCID of the Fusion environment that is the source environment for the refresh.
         * @param sourceFusionEnvironmentId the value to set
         * @return this builder
         **/
        public Builder sourceFusionEnvironmentId(String sourceFusionEnvironmentId) {
            this.sourceFusionEnvironmentId = sourceFusionEnvironmentId;
            this.__explicitlySet__.add("sourceFusionEnvironmentId");
            return this;
        }
        /**
         * The date and time of the most recent source environment backup used for the environment refresh.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfRestorationPoint")
        private java.util.Date timeOfRestorationPoint;

        /**
         * The date and time of the most recent source environment backup used for the environment refresh.
         * @param timeOfRestorationPoint the value to set
         * @return this builder
         **/
        public Builder timeOfRestorationPoint(java.util.Date timeOfRestorationPoint) {
            this.timeOfRestorationPoint = timeOfRestorationPoint;
            this.__explicitlySet__.add("timeOfRestorationPoint");
            return this;
        }
        /**
         * The current state of the refresh activity. Valid values are Scheduled, In progress , Failed, Completed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private RefreshActivity.LifecycleState lifecycleState;

        /**
         * The current state of the refresh activity. Valid values are Scheduled, In progress , Failed, Completed.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(RefreshActivity.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The time the refresh activity is scheduled to start. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledStart")
        private java.util.Date timeScheduledStart;

        /**
         * The time the refresh activity is scheduled to start. An RFC3339 formatted datetime string.
         * @param timeScheduledStart the value to set
         * @return this builder
         **/
        public Builder timeScheduledStart(java.util.Date timeScheduledStart) {
            this.timeScheduledStart = timeScheduledStart;
            this.__explicitlySet__.add("timeScheduledStart");
            return this;
        }
        /**
         * The time the refresh activity is scheduled to end. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpectedFinish")
        private java.util.Date timeExpectedFinish;

        /**
         * The time the refresh activity is scheduled to end. An RFC3339 formatted datetime string.
         * @param timeExpectedFinish the value to set
         * @return this builder
         **/
        public Builder timeExpectedFinish(java.util.Date timeExpectedFinish) {
            this.timeExpectedFinish = timeExpectedFinish;
            this.__explicitlySet__.add("timeExpectedFinish");
            return this;
        }
        /**
         * The time the refresh activity actually completed / cancelled / failed. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The time the refresh activity actually completed / cancelled / failed. An RFC3339 formatted datetime string.
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * Service availability / impact during refresh activity execution, up down
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceAvailability")
        private RefreshActivity.ServiceAvailability serviceAvailability;

        /**
         * Service availability / impact during refresh activity execution, up down
         * @param serviceAvailability the value to set
         * @return this builder
         **/
        public Builder serviceAvailability(
                RefreshActivity.ServiceAvailability serviceAvailability) {
            this.serviceAvailability = serviceAvailability;
            this.__explicitlySet__.add("serviceAvailability");
            return this;
        }
        /**
         * The time the refresh activity record was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The time the refresh activity record was created. An RFC3339 formatted datetime string.
         * @param timeAccepted the value to set
         * @return this builder
         **/
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * The time the refresh activity record was updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the refresh activity record was updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private RefreshActivity.LifecycleDetails lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(RefreshActivity.LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RefreshActivitySummary build() {
            RefreshActivitySummary model =
                    new RefreshActivitySummary(
                            this.id,
                            this.displayName,
                            this.sourceFusionEnvironmentId,
                            this.timeOfRestorationPoint,
                            this.lifecycleState,
                            this.timeScheduledStart,
                            this.timeExpectedFinish,
                            this.timeFinished,
                            this.serviceAvailability,
                            this.timeAccepted,
                            this.timeUpdated,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RefreshActivitySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sourceFusionEnvironmentId")) {
                this.sourceFusionEnvironmentId(model.getSourceFusionEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("timeOfRestorationPoint")) {
                this.timeOfRestorationPoint(model.getTimeOfRestorationPoint());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeScheduledStart")) {
                this.timeScheduledStart(model.getTimeScheduledStart());
            }
            if (model.wasPropertyExplicitlySet("timeExpectedFinish")) {
                this.timeExpectedFinish(model.getTimeExpectedFinish());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("serviceAvailability")) {
                this.serviceAvailability(model.getServiceAvailability());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
     * The unique identifier (OCID) of the refresh activity. Can't be changed after creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the refresh activity. Can't be changed after creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A friendly name for the refresh activity. Can be changed later.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A friendly name for the refresh activity. Can be changed later.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the Fusion environment that is the source environment for the refresh.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceFusionEnvironmentId")
    private final String sourceFusionEnvironmentId;

    /**
     * The OCID of the Fusion environment that is the source environment for the refresh.
     * @return the value
     **/
    public String getSourceFusionEnvironmentId() {
        return sourceFusionEnvironmentId;
    }

    /**
     * The date and time of the most recent source environment backup used for the environment refresh.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfRestorationPoint")
    private final java.util.Date timeOfRestorationPoint;

    /**
     * The date and time of the most recent source environment backup used for the environment refresh.
     * @return the value
     **/
    public java.util.Date getTimeOfRestorationPoint() {
        return timeOfRestorationPoint;
    }

    /**
     * The current state of the refresh activity. Valid values are Scheduled, In progress , Failed, Completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final RefreshActivity.LifecycleState lifecycleState;

    /**
     * The current state of the refresh activity. Valid values are Scheduled, In progress , Failed, Completed.
     * @return the value
     **/
    public RefreshActivity.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The time the refresh activity is scheduled to start. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledStart")
    private final java.util.Date timeScheduledStart;

    /**
     * The time the refresh activity is scheduled to start. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeScheduledStart() {
        return timeScheduledStart;
    }

    /**
     * The time the refresh activity is scheduled to end. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpectedFinish")
    private final java.util.Date timeExpectedFinish;

    /**
     * The time the refresh activity is scheduled to end. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeExpectedFinish() {
        return timeExpectedFinish;
    }

    /**
     * The time the refresh activity actually completed / cancelled / failed. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The time the refresh activity actually completed / cancelled / failed. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * Service availability / impact during refresh activity execution, up down
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAvailability")
    private final RefreshActivity.ServiceAvailability serviceAvailability;

    /**
     * Service availability / impact during refresh activity execution, up down
     * @return the value
     **/
    public RefreshActivity.ServiceAvailability getServiceAvailability() {
        return serviceAvailability;
    }

    /**
     * The time the refresh activity record was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The time the refresh activity record was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * The time the refresh activity record was updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the refresh activity record was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final RefreshActivity.LifecycleDetails lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public RefreshActivity.LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("RefreshActivitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", sourceFusionEnvironmentId=")
                .append(String.valueOf(this.sourceFusionEnvironmentId));
        sb.append(", timeOfRestorationPoint=").append(String.valueOf(this.timeOfRestorationPoint));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeScheduledStart=").append(String.valueOf(this.timeScheduledStart));
        sb.append(", timeExpectedFinish=").append(String.valueOf(this.timeExpectedFinish));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", serviceAvailability=").append(String.valueOf(this.serviceAvailability));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RefreshActivitySummary)) {
            return false;
        }

        RefreshActivitySummary other = (RefreshActivitySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.sourceFusionEnvironmentId, other.sourceFusionEnvironmentId)
                && java.util.Objects.equals(
                        this.timeOfRestorationPoint, other.timeOfRestorationPoint)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeScheduledStart, other.timeScheduledStart)
                && java.util.Objects.equals(this.timeExpectedFinish, other.timeExpectedFinish)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.serviceAvailability, other.serviceAvailability)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceFusionEnvironmentId == null
                                ? 43
                                : this.sourceFusionEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfRestorationPoint == null
                                ? 43
                                : this.timeOfRestorationPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduledStart == null
                                ? 43
                                : this.timeScheduledStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeExpectedFinish == null
                                ? 43
                                : this.timeExpectedFinish.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceAvailability == null
                                ? 43
                                : this.serviceAvailability.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
