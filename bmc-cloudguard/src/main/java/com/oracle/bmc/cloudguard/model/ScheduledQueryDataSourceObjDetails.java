/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information about new schedule Query of type DataSource. <br>
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
        builder = ScheduledQueryDataSourceObjDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "dataSourceFeedProvider")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduledQueryDataSourceObjDetails extends DataSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The continuous query expression that is run periodically. */
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The continuous query expression that is run periodically.
         *
         * @param query the value to set
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }
        /** Description text for the query */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description text for the query
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Interval in minutes which query is run periodically. */
        @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
        private Integer intervalInSeconds;

        /**
         * Interval in minutes which query is run periodically.
         *
         * @param intervalInSeconds the value to set
         * @return this builder
         */
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            this.__explicitlySet__.add("intervalInSeconds");
            return this;
        }
        /** Target information in which scheduled query will be run */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryScopeDetails")
        private java.util.List<ScheduledQueryScopeDetail> scheduledQueryScopeDetails;

        /**
         * Target information in which scheduled query will be run
         *
         * @param scheduledQueryScopeDetails the value to set
         * @return this builder
         */
        public Builder scheduledQueryScopeDetails(
                java.util.List<ScheduledQueryScopeDetail> scheduledQueryScopeDetails) {
            this.scheduledQueryScopeDetails = scheduledQueryScopeDetails;
            this.__explicitlySet__.add("scheduledQueryScopeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledQueryDataSourceObjDetails build() {
            ScheduledQueryDataSourceObjDetails model =
                    new ScheduledQueryDataSourceObjDetails(
                            this.query,
                            this.description,
                            this.intervalInSeconds,
                            this.scheduledQueryScopeDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledQueryDataSourceObjDetails model) {
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("intervalInSeconds")) {
                this.intervalInSeconds(model.getIntervalInSeconds());
            }
            if (model.wasPropertyExplicitlySet("scheduledQueryScopeDetails")) {
                this.scheduledQueryScopeDetails(model.getScheduledQueryScopeDetails());
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

    @Deprecated
    public ScheduledQueryDataSourceObjDetails(
            String query,
            String description,
            Integer intervalInSeconds,
            java.util.List<ScheduledQueryScopeDetail> scheduledQueryScopeDetails) {
        super();
        this.query = query;
        this.description = description;
        this.intervalInSeconds = intervalInSeconds;
        this.scheduledQueryScopeDetails = scheduledQueryScopeDetails;
    }

    /** The continuous query expression that is run periodically. */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The continuous query expression that is run periodically.
     *
     * @return the value
     */
    public String getQuery() {
        return query;
    }

    /** Description text for the query */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description text for the query
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Interval in minutes which query is run periodically. */
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
    private final Integer intervalInSeconds;

    /**
     * Interval in minutes which query is run periodically.
     *
     * @return the value
     */
    public Integer getIntervalInSeconds() {
        return intervalInSeconds;
    }

    /** Target information in which scheduled query will be run */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledQueryScopeDetails")
    private final java.util.List<ScheduledQueryScopeDetail> scheduledQueryScopeDetails;

    /**
     * Target information in which scheduled query will be run
     *
     * @return the value
     */
    public java.util.List<ScheduledQueryScopeDetail> getScheduledQueryScopeDetails() {
        return scheduledQueryScopeDetails;
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
        sb.append("ScheduledQueryDataSourceObjDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", intervalInSeconds=").append(String.valueOf(this.intervalInSeconds));
        sb.append(", scheduledQueryScopeDetails=")
                .append(String.valueOf(this.scheduledQueryScopeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledQueryDataSourceObjDetails)) {
            return false;
        }

        ScheduledQueryDataSourceObjDetails other = (ScheduledQueryDataSourceObjDetails) o;
        return java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.intervalInSeconds, other.intervalInSeconds)
                && java.util.Objects.equals(
                        this.scheduledQueryScopeDetails, other.scheduledQueryScopeDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalInSeconds == null ? 43 : this.intervalInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledQueryScopeDetails == null
                                ? 43
                                : this.scheduledQueryScopeDetails.hashCode());
        return result;
    }
}
