/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary information about a data source event.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataSourceEventSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataSourceEventSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "region",
        "eventDate",
        "dataSourceId",
        "timeCreated",
        "status",
        "comments",
        "eventInfo"
    })
    public DataSourceEventSummary(
            String region,
            java.util.Date eventDate,
            String dataSourceId,
            java.util.Date timeCreated,
            DataSourceEventInfoStatus status,
            String comments,
            DataSourceEventInfo eventInfo) {
        super();
        this.region = region;
        this.eventDate = eventDate;
        this.dataSourceId = dataSourceId;
        this.timeCreated = timeCreated;
        this.status = status;
        this.comments = comments;
        this.eventInfo = eventInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Data source event region
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Data source event region
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * Data source event date and time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("eventDate")
        private java.util.Date eventDate;

        /**
         * Data source event date and time
         * @param eventDate the value to set
         * @return this builder
         **/
        public Builder eventDate(java.util.Date eventDate) {
            this.eventDate = eventDate;
            this.__explicitlySet__.add("eventDate");
            return this;
        }
        /**
         * Unique identifier of data source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceId")
        private String dataSourceId;

        /**
         * Unique identifier of data source.
         * @param dataSourceId the value to set
         * @return this builder
         **/
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            this.__explicitlySet__.add("dataSourceId");
            return this;
        }
        /**
         * Data source event creation date and time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Data source event creation date and time
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Current data source event info status
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private DataSourceEventInfoStatus status;

        /**
         * Current data source event info status
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(DataSourceEventInfoStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Data source event comments
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("comments")
        private String comments;

        /**
         * Data source event comments
         * @param comments the value to set
         * @return this builder
         **/
        public Builder comments(String comments) {
            this.comments = comments;
            this.__explicitlySet__.add("comments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventInfo")
        private DataSourceEventInfo eventInfo;

        public Builder eventInfo(DataSourceEventInfo eventInfo) {
            this.eventInfo = eventInfo;
            this.__explicitlySet__.add("eventInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataSourceEventSummary build() {
            DataSourceEventSummary model =
                    new DataSourceEventSummary(
                            this.region,
                            this.eventDate,
                            this.dataSourceId,
                            this.timeCreated,
                            this.status,
                            this.comments,
                            this.eventInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataSourceEventSummary model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("eventDate")) {
                this.eventDate(model.getEventDate());
            }
            if (model.wasPropertyExplicitlySet("dataSourceId")) {
                this.dataSourceId(model.getDataSourceId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("comments")) {
                this.comments(model.getComments());
            }
            if (model.wasPropertyExplicitlySet("eventInfo")) {
                this.eventInfo(model.getEventInfo());
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
     * Data source event region
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Data source event region
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * Data source event date and time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventDate")
    private final java.util.Date eventDate;

    /**
     * Data source event date and time
     * @return the value
     **/
    public java.util.Date getEventDate() {
        return eventDate;
    }

    /**
     * Unique identifier of data source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceId")
    private final String dataSourceId;

    /**
     * Unique identifier of data source.
     * @return the value
     **/
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * Data source event creation date and time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Data source event creation date and time
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Current data source event info status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DataSourceEventInfoStatus status;

    /**
     * Current data source event info status
     * @return the value
     **/
    public DataSourceEventInfoStatus getStatus() {
        return status;
    }

    /**
     * Data source event comments
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comments")
    private final String comments;

    /**
     * Data source event comments
     * @return the value
     **/
    public String getComments() {
        return comments;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("eventInfo")
    private final DataSourceEventInfo eventInfo;

    public DataSourceEventInfo getEventInfo() {
        return eventInfo;
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
        sb.append("DataSourceEventSummary(");
        sb.append("super=").append(super.toString());
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", eventDate=").append(String.valueOf(this.eventDate));
        sb.append(", dataSourceId=").append(String.valueOf(this.dataSourceId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", comments=").append(String.valueOf(this.comments));
        sb.append(", eventInfo=").append(String.valueOf(this.eventInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataSourceEventSummary)) {
            return false;
        }

        DataSourceEventSummary other = (DataSourceEventSummary) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.eventDate, other.eventDate)
                && java.util.Objects.equals(this.dataSourceId, other.dataSourceId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.comments, other.comments)
                && java.util.Objects.equals(this.eventInfo, other.eventInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.eventDate == null ? 43 : this.eventDate.hashCode());
        result = (result * PRIME) + (this.dataSourceId == null ? 43 : this.dataSourceId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.comments == null ? 43 : this.comments.hashCode());
        result = (result * PRIME) + (this.eventInfo == null ? 43 : this.eventInfo.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
