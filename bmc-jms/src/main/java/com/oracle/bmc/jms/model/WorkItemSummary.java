/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The LCM work request for a JVM installation site.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkItemSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class WorkItemSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installationSite")
        private InstallationSite installationSite;

        public Builder installationSite(InstallationSite installationSite) {
            this.installationSite = installationSite;
            this.__explicitlySet__.add("installationSite");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private WorkItemStatus status;

        public Builder status(WorkItemStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryCount")
        private Integer retryCount;

        public Builder retryCount(Integer retryCount) {
            this.retryCount = retryCount;
            this.__explicitlySet__.add("retryCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
        private java.util.Date timeLastUpdated;

        public Builder timeLastUpdated(java.util.Date timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            this.__explicitlySet__.add("timeLastUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkItemSummary build() {
            WorkItemSummary __instance__ =
                    new WorkItemSummary(
                            id,
                            workRequestId,
                            installationSite,
                            status,
                            retryCount,
                            timeLastUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkItemSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .workRequestId(o.getWorkRequestId())
                            .installationSite(o.getInstallationSite())
                            .status(o.getStatus())
                            .retryCount(o.getRetryCount())
                            .timeLastUpdated(o.getTimeLastUpdated());

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
     * The unique ID of ths work item.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the work request created this work item.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    String workRequestId;

    @com.fasterxml.jackson.annotation.JsonProperty("installationSite")
    InstallationSite installationSite;

    /**
     * The status of the work item.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    WorkItemStatus status;

    /**
     * Number of times this work item is retried.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryCount")
    Integer retryCount;

    /**
     * The date and time the work item was last updated. (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
    java.util.Date timeLastUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
