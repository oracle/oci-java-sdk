/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details of Data source <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DataSource extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "dataSourceFeedProvider",
        "compartmentId",
        "dataSourceDetails",
        "timeCreated",
        "timeUpdated",
        "status",
        "dataSourceDetectorMappingInfo",
        "regionStatusDetail",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DataSource(
            String id,
            String displayName,
            DataSourceFeedProvider dataSourceFeedProvider,
            String compartmentId,
            DataSourceDetails dataSourceDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            DataSourceStatus status,
            java.util.List<DataSourceMappingInfo> dataSourceDetectorMappingInfo,
            java.util.List<RegionStatusDetail> regionStatusDetail,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.dataSourceFeedProvider = dataSourceFeedProvider;
        this.compartmentId = compartmentId;
        this.dataSourceDetails = dataSourceDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.status = status;
        this.dataSourceDetectorMappingInfo = dataSourceDetectorMappingInfo;
        this.regionStatusDetail = regionStatusDetail;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Ocid for Data source */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Ocid for Data source
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** DisplayName of Data source. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * DisplayName of Data source.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Possible type of dataSourceFeed Provider(LoggingQuery) */
        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceFeedProvider")
        private DataSourceFeedProvider dataSourceFeedProvider;

        /**
         * Possible type of dataSourceFeed Provider(LoggingQuery)
         *
         * @param dataSourceFeedProvider the value to set
         * @return this builder
         */
        public Builder dataSourceFeedProvider(DataSourceFeedProvider dataSourceFeedProvider) {
            this.dataSourceFeedProvider = dataSourceFeedProvider;
            this.__explicitlySet__.add("dataSourceFeedProvider");
            return this;
        }
        /** CompartmentId of Data source. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * CompartmentId of Data source.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceDetails")
        private DataSourceDetails dataSourceDetails;

        public Builder dataSourceDetails(DataSourceDetails dataSourceDetails) {
            this.dataSourceDetails = dataSourceDetails;
            this.__explicitlySet__.add("dataSourceDetails");
            return this;
        }
        /** The date and time the Data source was created. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Data source was created. Format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the Data source was updated. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the Data source was updated. Format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Status of data Source */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private DataSourceStatus status;

        /**
         * Status of data Source
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(DataSourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Information about the detector recipe and rule attached */
        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceDetectorMappingInfo")
        private java.util.List<DataSourceMappingInfo> dataSourceDetectorMappingInfo;

        /**
         * Information about the detector recipe and rule attached
         *
         * @param dataSourceDetectorMappingInfo the value to set
         * @return this builder
         */
        public Builder dataSourceDetectorMappingInfo(
                java.util.List<DataSourceMappingInfo> dataSourceDetectorMappingInfo) {
            this.dataSourceDetectorMappingInfo = dataSourceDetectorMappingInfo;
            this.__explicitlySet__.add("dataSourceDetectorMappingInfo");
            return this;
        }
        /** Information about the region and status of query replication */
        @com.fasterxml.jackson.annotation.JsonProperty("regionStatusDetail")
        private java.util.List<RegionStatusDetail> regionStatusDetail;

        /**
         * Information about the region and status of query replication
         *
         * @param regionStatusDetail the value to set
         * @return this builder
         */
        public Builder regionStatusDetail(java.util.List<RegionStatusDetail> regionStatusDetail) {
            this.regionStatusDetail = regionStatusDetail;
            this.__explicitlySet__.add("regionStatusDetail");
            return this;
        }
        /** The current state of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the resource.
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
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataSource build() {
            DataSource model =
                    new DataSource(
                            this.id,
                            this.displayName,
                            this.dataSourceFeedProvider,
                            this.compartmentId,
                            this.dataSourceDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.status,
                            this.dataSourceDetectorMappingInfo,
                            this.regionStatusDetail,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataSource model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dataSourceFeedProvider")) {
                this.dataSourceFeedProvider(model.getDataSourceFeedProvider());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dataSourceDetails")) {
                this.dataSourceDetails(model.getDataSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("dataSourceDetectorMappingInfo")) {
                this.dataSourceDetectorMappingInfo(model.getDataSourceDetectorMappingInfo());
            }
            if (model.wasPropertyExplicitlySet("regionStatusDetail")) {
                this.regionStatusDetail(model.getRegionStatusDetail());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Ocid for Data source */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Ocid for Data source
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** DisplayName of Data source. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * DisplayName of Data source.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Possible type of dataSourceFeed Provider(LoggingQuery) */
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceFeedProvider")
    private final DataSourceFeedProvider dataSourceFeedProvider;

    /**
     * Possible type of dataSourceFeed Provider(LoggingQuery)
     *
     * @return the value
     */
    public DataSourceFeedProvider getDataSourceFeedProvider() {
        return dataSourceFeedProvider;
    }

    /** CompartmentId of Data source. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * CompartmentId of Data source.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceDetails")
    private final DataSourceDetails dataSourceDetails;

    public DataSourceDetails getDataSourceDetails() {
        return dataSourceDetails;
    }

    /** The date and time the Data source was created. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Data source was created. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the Data source was updated. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the Data source was updated. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Status of data Source */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DataSourceStatus status;

    /**
     * Status of data Source
     *
     * @return the value
     */
    public DataSourceStatus getStatus() {
        return status;
    }

    /** Information about the detector recipe and rule attached */
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceDetectorMappingInfo")
    private final java.util.List<DataSourceMappingInfo> dataSourceDetectorMappingInfo;

    /**
     * Information about the detector recipe and rule attached
     *
     * @return the value
     */
    public java.util.List<DataSourceMappingInfo> getDataSourceDetectorMappingInfo() {
        return dataSourceDetectorMappingInfo;
    }

    /** Information about the region and status of query replication */
    @com.fasterxml.jackson.annotation.JsonProperty("regionStatusDetail")
    private final java.util.List<RegionStatusDetail> regionStatusDetail;

    /**
     * Information about the region and status of query replication
     *
     * @return the value
     */
    public java.util.List<RegionStatusDetail> getRegionStatusDetail() {
        return regionStatusDetail;
    }

    /** The current state of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the resource.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("DataSource(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dataSourceFeedProvider=").append(String.valueOf(this.dataSourceFeedProvider));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dataSourceDetails=").append(String.valueOf(this.dataSourceDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", dataSourceDetectorMappingInfo=")
                .append(String.valueOf(this.dataSourceDetectorMappingInfo));
        sb.append(", regionStatusDetail=").append(String.valueOf(this.regionStatusDetail));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataSource)) {
            return false;
        }

        DataSource other = (DataSource) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.dataSourceFeedProvider, other.dataSourceFeedProvider)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dataSourceDetails, other.dataSourceDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.dataSourceDetectorMappingInfo, other.dataSourceDetectorMappingInfo)
                && java.util.Objects.equals(this.regionStatusDetail, other.regionStatusDetail)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
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
                        + (this.dataSourceFeedProvider == null
                                ? 43
                                : this.dataSourceFeedProvider.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataSourceDetails == null ? 43 : this.dataSourceDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.dataSourceDetectorMappingInfo == null
                                ? 43
                                : this.dataSourceDetectorMappingInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.regionStatusDetail == null
                                ? 43
                                : this.regionStatusDetail.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
