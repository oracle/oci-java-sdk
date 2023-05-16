/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Job details outlining parameters specified when job was submitted. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryWorkRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueryWorkRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "timeStarted",
        "timeAccepted",
        "timeFinished",
        "timeExpires",
        "percentComplete",
        "status",
        "operationType",
        "mode",
        "timeBackgroundAt",
        "timeFilter",
        "scopeFilters",
        "subSystem",
        "displayQueryString",
        "internalQueryString"
    })
    public QueryWorkRequest(
            String id,
            String compartmentId,
            java.util.Date timeStarted,
            java.util.Date timeAccepted,
            java.util.Date timeFinished,
            java.util.Date timeExpires,
            Integer percentComplete,
            WorkRequestStatus status,
            QueryOperationType operationType,
            JobMode mode,
            java.util.Date timeBackgroundAt,
            TimeRange timeFilter,
            java.util.List<ScopeFilter> scopeFilters,
            SubSystemName subSystem,
            String displayQueryString,
            String internalQueryString) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.timeStarted = timeStarted;
        this.timeAccepted = timeAccepted;
        this.timeFinished = timeFinished;
        this.timeExpires = timeExpires;
        this.percentComplete = percentComplete;
        this.status = status;
        this.operationType = operationType;
        this.mode = mode;
        this.timeBackgroundAt = timeBackgroundAt;
        this.timeFilter = timeFilter;
        this.scopeFilters = scopeFilters;
        this.subSystem = subSystem;
        this.displayQueryString = displayQueryString;
        this.internalQueryString = internalQueryString;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique OCID identifier to reference this query job work Request with. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique OCID identifier to reference this query job work Request with.
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
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** When the job was started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * When the job was started.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** When the work request was accepted. Should match timeStarted in all cases. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * When the work request was accepted. Should match timeStarted in all cases.
         *
         * @param timeAccepted the value to set
         * @return this builder
         */
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /** When the job finished execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * When the job finished execution.
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** When the job will expire. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * When the job will expire.
         *
         * @param timeExpires the value to set
         * @return this builder
         */
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }
        /** Percentage progress completion of the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        /**
         * Percentage progress completion of the query.
         *
         * @param percentComplete the value to set
         * @return this builder
         */
        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /** Work request status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private WorkRequestStatus status;

        /**
         * Work request status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(WorkRequestStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Asynchronous action name. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private QueryOperationType operationType;

        /**
         * Asynchronous action name.
         *
         * @param operationType the value to set
         * @return this builder
         */
        public Builder operationType(QueryOperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /** Current execution mode for the job. */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private JobMode mode;

        /**
         * Current execution mode for the job.
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(JobMode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /** When the job was put in to the background. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBackgroundAt")
        private java.util.Date timeBackgroundAt;

        /**
         * When the job was put in to the background.
         *
         * @param timeBackgroundAt the value to set
         * @return this builder
         */
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
        /** List of filters applied when the query executed. */
        @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
        private java.util.List<ScopeFilter> scopeFilters;

        /**
         * List of filters applied when the query executed.
         *
         * @param scopeFilters the value to set
         * @return this builder
         */
        public Builder scopeFilters(java.util.List<ScopeFilter> scopeFilters) {
            this.scopeFilters = scopeFilters;
            this.__explicitlySet__.add("scopeFilters");
            return this;
        }
        /** Default subsystem to qualify fields with in the queryString if not specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
        private SubSystemName subSystem;

        /**
         * Default subsystem to qualify fields with in the queryString if not specified.
         *
         * @param subSystem the value to set
         * @return this builder
         */
        public Builder subSystem(SubSystemName subSystem) {
            this.subSystem = subSystem;
            this.__explicitlySet__.add("subSystem");
            return this;
        }
        /** Display version of the user speciified queryString. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        /**
         * Display version of the user speciified queryString.
         *
         * @param displayQueryString the value to set
         * @return this builder
         */
        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }
        /** Internal version of the user specified queryString. */
        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        /**
         * Internal version of the user specified queryString.
         *
         * @param internalQueryString the value to set
         * @return this builder
         */
        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryWorkRequest build() {
            QueryWorkRequest model =
                    new QueryWorkRequest(
                            this.id,
                            this.compartmentId,
                            this.timeStarted,
                            this.timeAccepted,
                            this.timeFinished,
                            this.timeExpires,
                            this.percentComplete,
                            this.status,
                            this.operationType,
                            this.mode,
                            this.timeBackgroundAt,
                            this.timeFilter,
                            this.scopeFilters,
                            this.subSystem,
                            this.displayQueryString,
                            this.internalQueryString);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryWorkRequest model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("timeBackgroundAt")) {
                this.timeBackgroundAt(model.getTimeBackgroundAt());
            }
            if (model.wasPropertyExplicitlySet("timeFilter")) {
                this.timeFilter(model.getTimeFilter());
            }
            if (model.wasPropertyExplicitlySet("scopeFilters")) {
                this.scopeFilters(model.getScopeFilters());
            }
            if (model.wasPropertyExplicitlySet("subSystem")) {
                this.subSystem(model.getSubSystem());
            }
            if (model.wasPropertyExplicitlySet("displayQueryString")) {
                this.displayQueryString(model.getDisplayQueryString());
            }
            if (model.wasPropertyExplicitlySet("internalQueryString")) {
                this.internalQueryString(model.getInternalQueryString());
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

    /** Unique OCID identifier to reference this query job work Request with. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique OCID identifier to reference this query job work Request with.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** When the job was started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * When the job was started.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** When the work request was accepted. Should match timeStarted in all cases. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * When the work request was accepted. Should match timeStarted in all cases.
     *
     * @return the value
     */
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /** When the job finished execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * When the job finished execution.
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** When the job will expire. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * When the job will expire.
     *
     * @return the value
     */
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /** Percentage progress completion of the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Integer percentComplete;

    /**
     * Percentage progress completion of the query.
     *
     * @return the value
     */
    public Integer getPercentComplete() {
        return percentComplete;
    }

    /** Work request status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final WorkRequestStatus status;

    /**
     * Work request status.
     *
     * @return the value
     */
    public WorkRequestStatus getStatus() {
        return status;
    }

    /** Asynchronous action name. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final QueryOperationType operationType;

    /**
     * Asynchronous action name.
     *
     * @return the value
     */
    public QueryOperationType getOperationType() {
        return operationType;
    }

    /** Current execution mode for the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final JobMode mode;

    /**
     * Current execution mode for the job.
     *
     * @return the value
     */
    public JobMode getMode() {
        return mode;
    }

    /** When the job was put in to the background. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBackgroundAt")
    private final java.util.Date timeBackgroundAt;

    /**
     * When the job was put in to the background.
     *
     * @return the value
     */
    public java.util.Date getTimeBackgroundAt() {
        return timeBackgroundAt;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("timeFilter")
    private final TimeRange timeFilter;

    public TimeRange getTimeFilter() {
        return timeFilter;
    }

    /** List of filters applied when the query executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("scopeFilters")
    private final java.util.List<ScopeFilter> scopeFilters;

    /**
     * List of filters applied when the query executed.
     *
     * @return the value
     */
    public java.util.List<ScopeFilter> getScopeFilters() {
        return scopeFilters;
    }

    /** Default subsystem to qualify fields with in the queryString if not specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
    private final SubSystemName subSystem;

    /**
     * Default subsystem to qualify fields with in the queryString if not specified.
     *
     * @return the value
     */
    public SubSystemName getSubSystem() {
        return subSystem;
    }

    /** Display version of the user speciified queryString. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
    private final String displayQueryString;

    /**
     * Display version of the user speciified queryString.
     *
     * @return the value
     */
    public String getDisplayQueryString() {
        return displayQueryString;
    }

    /** Internal version of the user specified queryString. */
    @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
    private final String internalQueryString;

    /**
     * Internal version of the user specified queryString.
     *
     * @return the value
     */
    public String getInternalQueryString() {
        return internalQueryString;
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
        sb.append("QueryWorkRequest(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", timeBackgroundAt=").append(String.valueOf(this.timeBackgroundAt));
        sb.append(", timeFilter=").append(String.valueOf(this.timeFilter));
        sb.append(", scopeFilters=").append(String.valueOf(this.scopeFilters));
        sb.append(", subSystem=").append(String.valueOf(this.subSystem));
        sb.append(", displayQueryString=").append(String.valueOf(this.displayQueryString));
        sb.append(", internalQueryString=").append(String.valueOf(this.internalQueryString));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryWorkRequest)) {
            return false;
        }

        QueryWorkRequest other = (QueryWorkRequest) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.timeBackgroundAt, other.timeBackgroundAt)
                && java.util.Objects.equals(this.timeFilter, other.timeFilter)
                && java.util.Objects.equals(this.scopeFilters, other.scopeFilters)
                && java.util.Objects.equals(this.subSystem, other.subSystem)
                && java.util.Objects.equals(this.displayQueryString, other.displayQueryString)
                && java.util.Objects.equals(this.internalQueryString, other.internalQueryString)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBackgroundAt == null ? 43 : this.timeBackgroundAt.hashCode());
        result = (result * PRIME) + (this.timeFilter == null ? 43 : this.timeFilter.hashCode());
        result = (result * PRIME) + (this.scopeFilters == null ? 43 : this.scopeFilters.hashCode());
        result = (result * PRIME) + (this.subSystem == null ? 43 : this.subSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.displayQueryString == null
                                ? 43
                                : this.displayQueryString.hashCode());
        result =
                (result * PRIME)
                        + (this.internalQueryString == null
                                ? 43
                                : this.internalQueryString.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
