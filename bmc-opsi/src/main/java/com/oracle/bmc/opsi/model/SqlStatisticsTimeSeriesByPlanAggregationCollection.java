/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL performance statistics by plan over the selected time window. <br>
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
        builder = SqlStatisticsTimeSeriesByPlanAggregationCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlStatisticsTimeSeriesByPlanAggregationCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlIdentifier",
        "id",
        "databaseId",
        "timeIntervalStart",
        "timeIntervalEnd",
        "itemDurationInMs",
        "endTimestamps",
        "items"
    })
    public SqlStatisticsTimeSeriesByPlanAggregationCollection(
            String sqlIdentifier,
            String id,
            String databaseId,
            java.util.Date timeIntervalStart,
            java.util.Date timeIntervalEnd,
            Long itemDurationInMs,
            java.util.List<java.util.Date> endTimestamps,
            java.util.List<SqlStatisticsTimeSeriesByPlanAggregation> items) {
        super();
        this.sqlIdentifier = sqlIdentifier;
        this.id = id;
        this.databaseId = databaseId;
        this.timeIntervalStart = timeIntervalStart;
        this.timeIntervalEnd = timeIntervalEnd;
        this.itemDurationInMs = itemDurationInMs;
        this.endTimestamps = endTimestamps;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique SQL_ID for a SQL Statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        /**
         * Unique SQL_ID for a SQL Statement.
         *
         * @param sqlIdentifier the value to set
         * @return this builder
         */
        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the database insight resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the database insight resource.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the database.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /** The start timestamp that was passed into the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
        private java.util.Date timeIntervalStart;

        /**
         * The start timestamp that was passed into the request.
         *
         * @param timeIntervalStart the value to set
         * @return this builder
         */
        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            this.__explicitlySet__.add("timeIntervalStart");
            return this;
        }
        /** The end timestamp that was passed into the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
        private java.util.Date timeIntervalEnd;

        /**
         * The end timestamp that was passed into the request.
         *
         * @param timeIntervalEnd the value to set
         * @return this builder
         */
        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            this.__explicitlySet__.add("timeIntervalEnd");
            return this;
        }
        /** Time duration in milliseconds between data points (one hour or one day). */
        @com.fasterxml.jackson.annotation.JsonProperty("itemDurationInMs")
        private Long itemDurationInMs;

        /**
         * Time duration in milliseconds between data points (one hour or one day).
         *
         * @param itemDurationInMs the value to set
         * @return this builder
         */
        public Builder itemDurationInMs(Long itemDurationInMs) {
            this.itemDurationInMs = itemDurationInMs;
            this.__explicitlySet__.add("itemDurationInMs");
            return this;
        }
        /** Array comprising of all the sampling period end timestamps in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTimestamps")
        private java.util.List<java.util.Date> endTimestamps;

        /**
         * Array comprising of all the sampling period end timestamps in RFC 3339 format.
         *
         * @param endTimestamps the value to set
         * @return this builder
         */
        public Builder endTimestamps(java.util.List<java.util.Date> endTimestamps) {
            this.endTimestamps = endTimestamps;
            this.__explicitlySet__.add("endTimestamps");
            return this;
        }
        /** array of SQL performance statistics by plans */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<SqlStatisticsTimeSeriesByPlanAggregation> items;

        /**
         * array of SQL performance statistics by plans
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<SqlStatisticsTimeSeriesByPlanAggregation> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlStatisticsTimeSeriesByPlanAggregationCollection build() {
            SqlStatisticsTimeSeriesByPlanAggregationCollection model =
                    new SqlStatisticsTimeSeriesByPlanAggregationCollection(
                            this.sqlIdentifier,
                            this.id,
                            this.databaseId,
                            this.timeIntervalStart,
                            this.timeIntervalEnd,
                            this.itemDurationInMs,
                            this.endTimestamps,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlStatisticsTimeSeriesByPlanAggregationCollection model) {
            if (model.wasPropertyExplicitlySet("sqlIdentifier")) {
                this.sqlIdentifier(model.getSqlIdentifier());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("timeIntervalStart")) {
                this.timeIntervalStart(model.getTimeIntervalStart());
            }
            if (model.wasPropertyExplicitlySet("timeIntervalEnd")) {
                this.timeIntervalEnd(model.getTimeIntervalEnd());
            }
            if (model.wasPropertyExplicitlySet("itemDurationInMs")) {
                this.itemDurationInMs(model.getItemDurationInMs());
            }
            if (model.wasPropertyExplicitlySet("endTimestamps")) {
                this.endTimestamps(model.getEndTimestamps());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    /** Unique SQL_ID for a SQL Statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    private final String sqlIdentifier;

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     * @return the value
     */
    public String getSqlIdentifier() {
        return sqlIdentifier;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the database insight resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the database insight resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the database.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /** The start timestamp that was passed into the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
    private final java.util.Date timeIntervalStart;

    /**
     * The start timestamp that was passed into the request.
     *
     * @return the value
     */
    public java.util.Date getTimeIntervalStart() {
        return timeIntervalStart;
    }

    /** The end timestamp that was passed into the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
    private final java.util.Date timeIntervalEnd;

    /**
     * The end timestamp that was passed into the request.
     *
     * @return the value
     */
    public java.util.Date getTimeIntervalEnd() {
        return timeIntervalEnd;
    }

    /** Time duration in milliseconds between data points (one hour or one day). */
    @com.fasterxml.jackson.annotation.JsonProperty("itemDurationInMs")
    private final Long itemDurationInMs;

    /**
     * Time duration in milliseconds between data points (one hour or one day).
     *
     * @return the value
     */
    public Long getItemDurationInMs() {
        return itemDurationInMs;
    }

    /** Array comprising of all the sampling period end timestamps in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamps")
    private final java.util.List<java.util.Date> endTimestamps;

    /**
     * Array comprising of all the sampling period end timestamps in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.List<java.util.Date> getEndTimestamps() {
        return endTimestamps;
    }

    /** array of SQL performance statistics by plans */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<SqlStatisticsTimeSeriesByPlanAggregation> items;

    /**
     * array of SQL performance statistics by plans
     *
     * @return the value
     */
    public java.util.List<SqlStatisticsTimeSeriesByPlanAggregation> getItems() {
        return items;
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
        sb.append("SqlStatisticsTimeSeriesByPlanAggregationCollection(");
        sb.append("super=").append(super.toString());
        sb.append("sqlIdentifier=").append(String.valueOf(this.sqlIdentifier));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(", timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(", itemDurationInMs=").append(String.valueOf(this.itemDurationInMs));
        sb.append(", endTimestamps=").append(String.valueOf(this.endTimestamps));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlStatisticsTimeSeriesByPlanAggregationCollection)) {
            return false;
        }

        SqlStatisticsTimeSeriesByPlanAggregationCollection other =
                (SqlStatisticsTimeSeriesByPlanAggregationCollection) o;
        return java.util.Objects.equals(this.sqlIdentifier, other.sqlIdentifier)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.itemDurationInMs, other.itemDurationInMs)
                && java.util.Objects.equals(this.endTimestamps, other.endTimestamps)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sqlIdentifier == null ? 43 : this.sqlIdentifier.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalStart == null ? 43 : this.timeIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalEnd == null ? 43 : this.timeIntervalEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.itemDurationInMs == null ? 43 : this.itemDurationInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.endTimestamps == null ? 43 : this.endTimestamps.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
