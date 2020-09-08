/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Job details outlining parameters specified when job was submitted.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryWorkRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class QueryWorkRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private WorkRequestStatus status;

        public Builder status(WorkRequestStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private QueryOperationType operationType;

        public Builder operationType(QueryOperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private JobMode mode;

        public Builder mode(JobMode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeBackgroundAt")
        private java.util.Date timeBackgroundAt;

        public Builder timeBackgroundAt(java.util.Date timeBackgroundAt) {
            this.timeBackgroundAt = timeBackgroundAt;
            this.__explicitlySet__.add("timeBackgroundAt");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFilter")
        private TimeRange timeFilter;

        public Builder timeFilter(TimeRange timeFilter) {
            this.timeFilter = timeFilter;
            this.__explicitlySet__.add("timeFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
        private java.util.List<ScopeFilter> scopeFilters;

        public Builder scopeFilters(java.util.List<ScopeFilter> scopeFilters) {
            this.scopeFilters = scopeFilters;
            this.__explicitlySet__.add("scopeFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
        private SubSystemName subSystem;

        public Builder subSystem(SubSystemName subSystem) {
            this.subSystem = subSystem;
            this.__explicitlySet__.add("subSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryWorkRequest build() {
            QueryWorkRequest __instance__ =
                    new QueryWorkRequest(
                            id,
                            compartmentId,
                            timeStarted,
                            timeAccepted,
                            timeFinished,
                            timeExpires,
                            percentComplete,
                            status,
                            operationType,
                            mode,
                            timeBackgroundAt,
                            timeFilter,
                            scopeFilters,
                            subSystem,
                            displayQueryString,
                            internalQueryString);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryWorkRequest o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .timeStarted(o.getTimeStarted())
                            .timeAccepted(o.getTimeAccepted())
                            .timeFinished(o.getTimeFinished())
                            .timeExpires(o.getTimeExpires())
                            .percentComplete(o.getPercentComplete())
                            .status(o.getStatus())
                            .operationType(o.getOperationType())
                            .mode(o.getMode())
                            .timeBackgroundAt(o.getTimeBackgroundAt())
                            .timeFilter(o.getTimeFilter())
                            .scopeFilters(o.getScopeFilters())
                            .subSystem(o.getSubSystem())
                            .displayQueryString(o.getDisplayQueryString())
                            .internalQueryString(o.getInternalQueryString());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Unique OCID identifier to reference this query job work Request with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * When the job was started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * When the work request was accepted. Should match timeStarted in all cases.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    java.util.Date timeAccepted;

    /**
     * When the job finished execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;

    /**
     * When the job will expire.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    java.util.Date timeExpires;

    /**
     * Percentage progress completion of the query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    Integer percentComplete;

    /**
     * Work request status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    WorkRequestStatus status;

    /**
     * Asynchronous action name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    QueryOperationType operationType;

    /**
     * Current execution mode for the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    JobMode mode;

    /**
     * When the job was put in to the background.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBackgroundAt")
    java.util.Date timeBackgroundAt;

    @com.fasterxml.jackson.annotation.JsonProperty("timeFilter")
    TimeRange timeFilter;

    /**
     * List of filters applied when the query executed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
    java.util.List<ScopeFilter> scopeFilters;

    /**
     * Default subsystem to qualify fields with in the queryString if not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
    SubSystemName subSystem;

    /**
     * Display version of the user speciified queryString.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
    String displayQueryString;

    /**
     * Internal version of the user specified queryString.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
    String internalQueryString;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
