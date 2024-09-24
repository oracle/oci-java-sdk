/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * An environment refresh copies data from a source environment to a target environment, making a
 * copy of the source environment onto the target environment. For more information, see [Refreshing
 * an
 * Environment](https://docs.cloud.oracle.com/iaas/Content/fusion-applications/refresh-environment.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RefreshActivity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RefreshActivity
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "sourceFusionEnvironmentId",
        "timeOfRestorationPoint",
        "lifecycleState",
        "serviceAvailability",
        "timeScheduledStart",
        "timeExpectedFinish",
        "timeFinished",
        "timeAccepted",
        "timeUpdated",
        "isDataMaskingOpted",
        "refreshIssueDetailsList",
        "lifecycleDetails"
    })
    public RefreshActivity(
            String id,
            String displayName,
            String sourceFusionEnvironmentId,
            java.util.Date timeOfRestorationPoint,
            LifecycleState lifecycleState,
            ServiceAvailability serviceAvailability,
            java.util.Date timeScheduledStart,
            java.util.Date timeExpectedFinish,
            java.util.Date timeFinished,
            java.util.Date timeAccepted,
            java.util.Date timeUpdated,
            Boolean isDataMaskingOpted,
            java.util.List<RefreshIssueDetails> refreshIssueDetailsList,
            LifecycleDetails lifecycleDetails) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.sourceFusionEnvironmentId = sourceFusionEnvironmentId;
        this.timeOfRestorationPoint = timeOfRestorationPoint;
        this.lifecycleState = lifecycleState;
        this.serviceAvailability = serviceAvailability;
        this.timeScheduledStart = timeScheduledStart;
        this.timeExpectedFinish = timeExpectedFinish;
        this.timeFinished = timeFinished;
        this.timeAccepted = timeAccepted;
        this.timeUpdated = timeUpdated;
        this.isDataMaskingOpted = isDataMaskingOpted;
        this.refreshIssueDetailsList = refreshIssueDetailsList;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) of the refresh activity. Can't be changed after creation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the refresh activity. Can't be changed after creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A friendly name for the refresh activity. Can be changed later. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A friendly name for the refresh activity. Can be changed later.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the Fusion environment that is the source environment for the refresh. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceFusionEnvironmentId")
        private String sourceFusionEnvironmentId;

        /**
         * The OCID of the Fusion environment that is the source environment for the refresh.
         *
         * @param sourceFusionEnvironmentId the value to set
         * @return this builder
         */
        public Builder sourceFusionEnvironmentId(String sourceFusionEnvironmentId) {
            this.sourceFusionEnvironmentId = sourceFusionEnvironmentId;
            this.__explicitlySet__.add("sourceFusionEnvironmentId");
            return this;
        }
        /**
         * The date and time of the most recent source environment backup used for the environment
         * refresh.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfRestorationPoint")
        private java.util.Date timeOfRestorationPoint;

        /**
         * The date and time of the most recent source environment backup used for the environment
         * refresh.
         *
         * @param timeOfRestorationPoint the value to set
         * @return this builder
         */
        public Builder timeOfRestorationPoint(java.util.Date timeOfRestorationPoint) {
            this.timeOfRestorationPoint = timeOfRestorationPoint;
            this.__explicitlySet__.add("timeOfRestorationPoint");
            return this;
        }
        /** The current state of the refreshActivity. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the refreshActivity.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Service availability / impact during refresh activity execution up down */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceAvailability")
        private ServiceAvailability serviceAvailability;

        /**
         * Service availability / impact during refresh activity execution up down
         *
         * @param serviceAvailability the value to set
         * @return this builder
         */
        public Builder serviceAvailability(ServiceAvailability serviceAvailability) {
            this.serviceAvailability = serviceAvailability;
            this.__explicitlySet__.add("serviceAvailability");
            return this;
        }
        /**
         * The time the refresh activity is scheduled to start. An RFC3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledStart")
        private java.util.Date timeScheduledStart;

        /**
         * The time the refresh activity is scheduled to start. An RFC3339 formatted datetime
         * string.
         *
         * @param timeScheduledStart the value to set
         * @return this builder
         */
        public Builder timeScheduledStart(java.util.Date timeScheduledStart) {
            this.timeScheduledStart = timeScheduledStart;
            this.__explicitlySet__.add("timeScheduledStart");
            return this;
        }
        /**
         * The time the refresh activity is scheduled to end. An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpectedFinish")
        private java.util.Date timeExpectedFinish;

        /**
         * The time the refresh activity is scheduled to end. An RFC3339 formatted datetime string.
         *
         * @param timeExpectedFinish the value to set
         * @return this builder
         */
        public Builder timeExpectedFinish(java.util.Date timeExpectedFinish) {
            this.timeExpectedFinish = timeExpectedFinish;
            this.__explicitlySet__.add("timeExpectedFinish");
            return this;
        }
        /**
         * The time the refresh activity actually completed / cancelled / failed. An RFC3339
         * formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The time the refresh activity actually completed / cancelled / failed. An RFC3339
         * formatted datetime string.
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * The time the refresh activity record was created. An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The time the refresh activity record was created. An RFC3339 formatted datetime string.
         *
         * @param timeAccepted the value to set
         * @return this builder
         */
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * The time the refresh activity record was updated. An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the refresh activity record was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Represents if the customer opted for Data Masking or not during refreshActivity. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDataMaskingOpted")
        private Boolean isDataMaskingOpted;

        /**
         * Represents if the customer opted for Data Masking or not during refreshActivity.
         *
         * @param isDataMaskingOpted the value to set
         * @return this builder
         */
        public Builder isDataMaskingOpted(Boolean isDataMaskingOpted) {
            this.isDataMaskingOpted = isDataMaskingOpted;
            this.__explicitlySet__.add("isDataMaskingOpted");
            return this;
        }
        /** Details of refresh investigation information, each item represents a different issue. */
        @com.fasterxml.jackson.annotation.JsonProperty("refreshIssueDetailsList")
        private java.util.List<RefreshIssueDetails> refreshIssueDetailsList;

        /**
         * Details of refresh investigation information, each item represents a different issue.
         *
         * @param refreshIssueDetailsList the value to set
         * @return this builder
         */
        public Builder refreshIssueDetailsList(
                java.util.List<RefreshIssueDetails> refreshIssueDetailsList) {
            this.refreshIssueDetailsList = refreshIssueDetailsList;
            this.__explicitlySet__.add("refreshIssueDetailsList");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RefreshActivity build() {
            RefreshActivity model =
                    new RefreshActivity(
                            this.id,
                            this.displayName,
                            this.sourceFusionEnvironmentId,
                            this.timeOfRestorationPoint,
                            this.lifecycleState,
                            this.serviceAvailability,
                            this.timeScheduledStart,
                            this.timeExpectedFinish,
                            this.timeFinished,
                            this.timeAccepted,
                            this.timeUpdated,
                            this.isDataMaskingOpted,
                            this.refreshIssueDetailsList,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RefreshActivity model) {
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
            if (model.wasPropertyExplicitlySet("serviceAvailability")) {
                this.serviceAvailability(model.getServiceAvailability());
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
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("isDataMaskingOpted")) {
                this.isDataMaskingOpted(model.getIsDataMaskingOpted());
            }
            if (model.wasPropertyExplicitlySet("refreshIssueDetailsList")) {
                this.refreshIssueDetailsList(model.getRefreshIssueDetailsList());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** The unique identifier (OCID) of the refresh activity. Can't be changed after creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the refresh activity. Can't be changed after creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A friendly name for the refresh activity. Can be changed later. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A friendly name for the refresh activity. Can be changed later.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the Fusion environment that is the source environment for the refresh. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceFusionEnvironmentId")
    private final String sourceFusionEnvironmentId;

    /**
     * The OCID of the Fusion environment that is the source environment for the refresh.
     *
     * @return the value
     */
    public String getSourceFusionEnvironmentId() {
        return sourceFusionEnvironmentId;
    }

    /**
     * The date and time of the most recent source environment backup used for the environment
     * refresh.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfRestorationPoint")
    private final java.util.Date timeOfRestorationPoint;

    /**
     * The date and time of the most recent source environment backup used for the environment
     * refresh.
     *
     * @return the value
     */
    public java.util.Date getTimeOfRestorationPoint() {
        return timeOfRestorationPoint;
    }

    /** The current state of the refreshActivity. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        NeedsAttention("NEEDS_ATTENTION"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceled("CANCELED"),

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
    /** The current state of the refreshActivity. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the refreshActivity.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Service availability / impact during refresh activity execution up down */
    public enum ServiceAvailability implements com.oracle.bmc.http.internal.BmcEnum {
        Available("AVAILABLE"),
        Unavailable("UNAVAILABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ServiceAvailability.class);

        private final String value;
        private static java.util.Map<String, ServiceAvailability> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceAvailability v : ServiceAvailability.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServiceAvailability(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServiceAvailability create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServiceAvailability', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Service availability / impact during refresh activity execution up down */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAvailability")
    private final ServiceAvailability serviceAvailability;

    /**
     * Service availability / impact during refresh activity execution up down
     *
     * @return the value
     */
    public ServiceAvailability getServiceAvailability() {
        return serviceAvailability;
    }

    /**
     * The time the refresh activity is scheduled to start. An RFC3339 formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledStart")
    private final java.util.Date timeScheduledStart;

    /**
     * The time the refresh activity is scheduled to start. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduledStart() {
        return timeScheduledStart;
    }

    /** The time the refresh activity is scheduled to end. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpectedFinish")
    private final java.util.Date timeExpectedFinish;

    /**
     * The time the refresh activity is scheduled to end. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeExpectedFinish() {
        return timeExpectedFinish;
    }

    /**
     * The time the refresh activity actually completed / cancelled / failed. An RFC3339 formatted
     * datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The time the refresh activity actually completed / cancelled / failed. An RFC3339 formatted
     * datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** The time the refresh activity record was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The time the refresh activity record was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /** The time the refresh activity record was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the refresh activity record was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Represents if the customer opted for Data Masking or not during refreshActivity. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDataMaskingOpted")
    private final Boolean isDataMaskingOpted;

    /**
     * Represents if the customer opted for Data Masking or not during refreshActivity.
     *
     * @return the value
     */
    public Boolean getIsDataMaskingOpted() {
        return isDataMaskingOpted;
    }

    /** Details of refresh investigation information, each item represents a different issue. */
    @com.fasterxml.jackson.annotation.JsonProperty("refreshIssueDetailsList")
    private final java.util.List<RefreshIssueDetails> refreshIssueDetailsList;

    /**
     * Details of refresh investigation information, each item represents a different issue.
     *
     * @return the value
     */
    public java.util.List<RefreshIssueDetails> getRefreshIssueDetailsList() {
        return refreshIssueDetailsList;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    public enum LifecycleDetails implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Rollbackaccepted("ROLLBACKACCEPTED"),
        Rollbackinprogress("ROLLBACKINPROGRESS"),
        Rollbacksucceeded("ROLLBACKSUCCEEDED"),
        Rollbackfailed("ROLLBACKFAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleDetails.class);

        private final String value;
        private static java.util.Map<String, LifecycleDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleDetails v : LifecycleDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("RefreshActivity(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", sourceFusionEnvironmentId=")
                .append(String.valueOf(this.sourceFusionEnvironmentId));
        sb.append(", timeOfRestorationPoint=").append(String.valueOf(this.timeOfRestorationPoint));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", serviceAvailability=").append(String.valueOf(this.serviceAvailability));
        sb.append(", timeScheduledStart=").append(String.valueOf(this.timeScheduledStart));
        sb.append(", timeExpectedFinish=").append(String.valueOf(this.timeExpectedFinish));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", isDataMaskingOpted=").append(String.valueOf(this.isDataMaskingOpted));
        sb.append(", refreshIssueDetailsList=")
                .append(String.valueOf(this.refreshIssueDetailsList));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RefreshActivity)) {
            return false;
        }

        RefreshActivity other = (RefreshActivity) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.sourceFusionEnvironmentId, other.sourceFusionEnvironmentId)
                && java.util.Objects.equals(
                        this.timeOfRestorationPoint, other.timeOfRestorationPoint)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.serviceAvailability, other.serviceAvailability)
                && java.util.Objects.equals(this.timeScheduledStart, other.timeScheduledStart)
                && java.util.Objects.equals(this.timeExpectedFinish, other.timeExpectedFinish)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.isDataMaskingOpted, other.isDataMaskingOpted)
                && java.util.Objects.equals(
                        this.refreshIssueDetailsList, other.refreshIssueDetailsList)
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
                        + (this.serviceAvailability == null
                                ? 43
                                : this.serviceAvailability.hashCode());
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
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataMaskingOpted == null
                                ? 43
                                : this.isDataMaskingOpted.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshIssueDetailsList == null
                                ? 43
                                : this.refreshIssueDetailsList.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
