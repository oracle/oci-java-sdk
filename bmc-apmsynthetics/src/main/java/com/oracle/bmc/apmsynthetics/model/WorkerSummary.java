/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Information about On-premise VP worker. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkerSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WorkerSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "name",
        "versionDetails",
        "configurationDetails",
        "workerType",
        "status",
        "priority",
        "geoInfo",
        "monitorList",
        "timeLastSyncup",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags"
    })
    public WorkerSummary(
            String id,
            String displayName,
            String name,
            OnPremiseVpWorkerVersionDetails versionDetails,
            Object configurationDetails,
            OnPremiseVantagePointWorkerType workerType,
            OnPremiseVantagePointWorkerStatus status,
            Integer priority,
            String geoInfo,
            java.util.List<WorkerMonitorList> monitorList,
            java.util.Date timeLastSyncup,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.name = name;
        this.versionDetails = versionDetails;
        this.configurationDetails = configurationDetails;
        this.workerType = workerType;
        this.status = status;
        this.priority = priority;
        this.geoInfo = geoInfo;
        this.monitorList = monitorList;
        this.timeLastSyncup = timeLastSyncup;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * On-premise VP worker.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * On-premise VP worker.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique On-premise VP worker name that cannot be edited. The name should not contain any
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Unique On-premise VP worker name that cannot be edited. The name should not contain any
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Unique permanent name of the On-premise VP worker. This is the same as the displayName.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique permanent name of the On-premise VP worker. This is the same as the displayName.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
        private OnPremiseVpWorkerVersionDetails versionDetails;

        public Builder versionDetails(OnPremiseVpWorkerVersionDetails versionDetails) {
            this.versionDetails = versionDetails;
            this.__explicitlySet__.add("versionDetails");
            return this;
        }
        /** Configuration details of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
        private Object configurationDetails;

        /**
         * Configuration details of the On-premise VP worker.
         *
         * @param configurationDetails the value to set
         * @return this builder
         */
        public Builder configurationDetails(Object configurationDetails) {
            this.configurationDetails = configurationDetails;
            this.__explicitlySet__.add("configurationDetails");
            return this;
        }
        /** Type of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("workerType")
        private OnPremiseVantagePointWorkerType workerType;

        /**
         * Type of the On-premise VP worker.
         *
         * @param workerType the value to set
         * @return this builder
         */
        public Builder workerType(OnPremiseVantagePointWorkerType workerType) {
            this.workerType = workerType;
            this.__explicitlySet__.add("workerType");
            return this;
        }
        /** Enables or disables the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private OnPremiseVantagePointWorkerStatus status;

        /**
         * Enables or disables the On-premise VP worker.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(OnPremiseVantagePointWorkerStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Priority of the On-premise VP worker to schedule monitors. */
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * Priority of the On-premise VP worker to schedule monitors.
         *
         * @param priority the value to set
         * @return this builder
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }
        /** Geographical information of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("geoInfo")
        private String geoInfo;

        /**
         * Geographical information of the On-premise VP worker.
         *
         * @param geoInfo the value to set
         * @return this builder
         */
        public Builder geoInfo(String geoInfo) {
            this.geoInfo = geoInfo;
            this.__explicitlySet__.add("geoInfo");
            return this;
        }
        /** Monitors list assigned to the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("monitorList")
        private java.util.List<WorkerMonitorList> monitorList;

        /**
         * Monitors list assigned to the On-premise VP worker.
         *
         * @param monitorList the value to set
         * @return this builder
         */
        public Builder monitorList(java.util.List<WorkerMonitorList> monitorList) {
            this.monitorList = monitorList;
            this.__explicitlySet__.add("monitorList");
            return this;
        }
        /**
         * The time the resource was last synced, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSyncup")
        private java.util.Date timeLastSyncup;

        /**
         * The time the resource was last synced, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         *
         * @param timeLastSyncup the value to set
         * @return this builder
         */
        public Builder timeLastSyncup(java.util.Date timeLastSyncup) {
            this.timeLastSyncup = timeLastSyncup;
            this.__explicitlySet__.add("timeLastSyncup");
            return this;
        }
        /**
         * The time the resource was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
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
         * The time the resource was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-13T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the resource was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-13T22:47:12.613Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public WorkerSummary build() {
            WorkerSummary model =
                    new WorkerSummary(
                            this.id,
                            this.displayName,
                            this.name,
                            this.versionDetails,
                            this.configurationDetails,
                            this.workerType,
                            this.status,
                            this.priority,
                            this.geoInfo,
                            this.monitorList,
                            this.timeLastSyncup,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkerSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("versionDetails")) {
                this.versionDetails(model.getVersionDetails());
            }
            if (model.wasPropertyExplicitlySet("configurationDetails")) {
                this.configurationDetails(model.getConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("workerType")) {
                this.workerType(model.getWorkerType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("geoInfo")) {
                this.geoInfo(model.getGeoInfo());
            }
            if (model.wasPropertyExplicitlySet("monitorList")) {
                this.monitorList(model.getMonitorList());
            }
            if (model.wasPropertyExplicitlySet("timeLastSyncup")) {
                this.timeLastSyncup(model.getTimeLastSyncup());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * On-premise VP worker.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * On-premise VP worker.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Unique On-premise VP worker name that cannot be edited. The name should not contain any
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Unique On-premise VP worker name that cannot be edited. The name should not contain any
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Unique permanent name of the On-premise VP worker. This is the same as the displayName. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique permanent name of the On-premise VP worker. This is the same as the displayName.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
    private final OnPremiseVpWorkerVersionDetails versionDetails;

    public OnPremiseVpWorkerVersionDetails getVersionDetails() {
        return versionDetails;
    }

    /** Configuration details of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
    private final Object configurationDetails;

    /**
     * Configuration details of the On-premise VP worker.
     *
     * @return the value
     */
    public Object getConfigurationDetails() {
        return configurationDetails;
    }

    /** Type of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("workerType")
    private final OnPremiseVantagePointWorkerType workerType;

    /**
     * Type of the On-premise VP worker.
     *
     * @return the value
     */
    public OnPremiseVantagePointWorkerType getWorkerType() {
        return workerType;
    }

    /** Enables or disables the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final OnPremiseVantagePointWorkerStatus status;

    /**
     * Enables or disables the On-premise VP worker.
     *
     * @return the value
     */
    public OnPremiseVantagePointWorkerStatus getStatus() {
        return status;
    }

    /** Priority of the On-premise VP worker to schedule monitors. */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * Priority of the On-premise VP worker to schedule monitors.
     *
     * @return the value
     */
    public Integer getPriority() {
        return priority;
    }

    /** Geographical information of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("geoInfo")
    private final String geoInfo;

    /**
     * Geographical information of the On-premise VP worker.
     *
     * @return the value
     */
    public String getGeoInfo() {
        return geoInfo;
    }

    /** Monitors list assigned to the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("monitorList")
    private final java.util.List<WorkerMonitorList> monitorList;

    /**
     * Monitors list assigned to the On-premise VP worker.
     *
     * @return the value
     */
    public java.util.List<WorkerMonitorList> getMonitorList() {
        return monitorList;
    }

    /**
     * The time the resource was last synced, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSyncup")
    private final java.util.Date timeLastSyncup;

    /**
     * The time the resource was last synced, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeLastSyncup() {
        return timeLastSyncup;
    }

    /**
     * The time the resource was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the resource was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-13T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-13T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("WorkerSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", versionDetails=").append(String.valueOf(this.versionDetails));
        sb.append(", configurationDetails=").append(String.valueOf(this.configurationDetails));
        sb.append(", workerType=").append(String.valueOf(this.workerType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", geoInfo=").append(String.valueOf(this.geoInfo));
        sb.append(", monitorList=").append(String.valueOf(this.monitorList));
        sb.append(", timeLastSyncup=").append(String.valueOf(this.timeLastSyncup));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof WorkerSummary)) {
            return false;
        }

        WorkerSummary other = (WorkerSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.versionDetails, other.versionDetails)
                && java.util.Objects.equals(this.configurationDetails, other.configurationDetails)
                && java.util.Objects.equals(this.workerType, other.workerType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.geoInfo, other.geoInfo)
                && java.util.Objects.equals(this.monitorList, other.monitorList)
                && java.util.Objects.equals(this.timeLastSyncup, other.timeLastSyncup)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.versionDetails == null ? 43 : this.versionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationDetails == null
                                ? 43
                                : this.configurationDetails.hashCode());
        result = (result * PRIME) + (this.workerType == null ? 43 : this.workerType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.geoInfo == null ? 43 : this.geoInfo.hashCode());
        result = (result * PRIME) + (this.monitorList == null ? 43 : this.monitorList.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSyncup == null ? 43 : this.timeLastSyncup.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
