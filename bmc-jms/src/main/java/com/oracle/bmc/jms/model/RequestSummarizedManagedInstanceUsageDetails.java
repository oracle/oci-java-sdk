/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Parameters for filtering managed instances.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestSummarizedManagedInstanceUsageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RequestSummarizedManagedInstanceUsageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installationPath")
        private String installationPath;

        public Builder installationPath(String installationPath) {
            this.installationPath = installationPath;
            this.__explicitlySet__.add("installationPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jreVendor")
        private String jreVendor;

        public Builder jreVendor(String jreVendor) {
            this.jreVendor = jreVendor;
            this.__explicitlySet__.add("jreVendor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jreDistribution")
        private String jreDistribution;

        public Builder jreDistribution(String jreDistribution) {
            this.jreDistribution = jreDistribution;
            this.__explicitlySet__.add("jreDistribution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jreVersion")
        private String jreVersion;

        public Builder jreVersion(String jreVersion) {
            this.jreVersion = jreVersion;
            this.__explicitlySet__.add("jreVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceType")
        private ManagedInstanceType managedInstanceType;

        public Builder managedInstanceType(ManagedInstanceType managedInstanceType) {
            this.managedInstanceType = managedInstanceType;
            this.__explicitlySet__.add("managedInstanceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private ManagedInstanceSortBy sortBy;

        public Builder sortBy(ManagedInstanceSortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<SummarizeManagedInstanceUsageFields> fields;

        public Builder fields(java.util.List<SummarizeManagedInstanceUsageFields> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestSummarizedManagedInstanceUsageDetails build() {
            RequestSummarizedManagedInstanceUsageDetails __instance__ =
                    new RequestSummarizedManagedInstanceUsageDetails(
                            timeStart,
                            timeEnd,
                            installationPath,
                            jreVendor,
                            jreDistribution,
                            jreVersion,
                            applicationId,
                            managedInstanceId,
                            managedInstanceType,
                            sortOrder,
                            sortBy,
                            fields);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestSummarizedManagedInstanceUsageDetails o) {
            Builder copiedBuilder =
                    timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .installationPath(o.getInstallationPath())
                            .jreVendor(o.getJreVendor())
                            .jreDistribution(o.getJreDistribution())
                            .jreVersion(o.getJreVersion())
                            .applicationId(o.getApplicationId())
                            .managedInstanceId(o.getManagedInstanceId())
                            .managedInstanceType(o.getManagedInstanceType())
                            .sortOrder(o.getSortOrder())
                            .sortBy(o.getSortBy())
                            .fields(o.getFields());

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
     * The start of the time period during which resources are searched (formatted according to RFC3339). Defaults to current time minus seven days.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    java.util.Date timeStart;

    /**
     * The end of the time period during which resources are searched (formatted according to RFC3339). Defaults to current time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    java.util.Date timeEnd;

    /**
     * The installation path of the related installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installationPath")
    String installationPath;

    /**
     * The vendor of the related Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreVendor")
    String jreVendor;

    /**
     * The distribution of the related Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreDistribution")
    String jreDistribution;

    /**
     * The version of the related Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreVersion")
    String jreVersion;

    /**
     * The ID of the related application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    String applicationId;

    /**
     * The ID of the managed instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    String managedInstanceId;

    /**
     * type of the managed instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceType")
    ManagedInstanceType managedInstanceType;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    SortOrder sortOrder;

    /**
     * The field to sort managed instance views. Only one sort order may be provided.
     * Default order for _timeFirstSeen_, _timeLastSeen_, approximateJreCount_, _approximateInstallationCount_
     * and _approximateApplicationCount_  is **descending**.
     * If no value is specified _timeLastSeen_ is default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    ManagedInstanceSortBy sortBy;

    /**
     * Additional fields to include into the returned model on top of the required ones.
     * This parameter can also include 'approximateJreCount', 'approximateInstallationCount' and 'approximateApplicationCount'.
     * For example 'approximateJreCount,approximateInstallationCount'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    java.util.List<SummarizeManagedInstanceUsageFields> fields;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
