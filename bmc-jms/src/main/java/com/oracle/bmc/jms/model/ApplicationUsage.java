/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Application usage during a specified time period.
 * An application is a Java application that can be executed by a Java Runtime installation.
 * An application is independent of the Java Runtime or its installation.
 *
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApplicationUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ApplicationUsage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
        private String applicationType;

        public Builder applicationType(String applicationType) {
            this.applicationType = applicationType;
            this.__explicitlySet__.add("applicationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
        private Integer approximateInstallationCount;

        public Builder approximateInstallationCount(Integer approximateInstallationCount) {
            this.approximateInstallationCount = approximateInstallationCount;
            this.__explicitlySet__.add("approximateInstallationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximateJreCount")
        private Integer approximateJreCount;

        public Builder approximateJreCount(Integer approximateJreCount) {
            this.approximateJreCount = approximateJreCount;
            this.__explicitlySet__.add("approximateJreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
        private Integer approximateManagedInstanceCount;

        public Builder approximateManagedInstanceCount(Integer approximateManagedInstanceCount) {
            this.approximateManagedInstanceCount = approximateManagedInstanceCount;
            this.__explicitlySet__.add("approximateManagedInstanceCount");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
        private java.util.Date timeFirstSeen;

        public Builder timeFirstSeen(java.util.Date timeFirstSeen) {
            this.timeFirstSeen = timeFirstSeen;
            this.__explicitlySet__.add("timeFirstSeen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
        private java.util.Date timeLastSeen;

        public Builder timeLastSeen(java.util.Date timeLastSeen) {
            this.timeLastSeen = timeLastSeen;
            this.__explicitlySet__.add("timeLastSeen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationUsage build() {
            ApplicationUsage __instance__ =
                    new ApplicationUsage(
                            applicationId,
                            displayName,
                            applicationType,
                            approximateInstallationCount,
                            approximateJreCount,
                            approximateManagedInstanceCount,
                            timeStart,
                            timeEnd,
                            timeFirstSeen,
                            timeLastSeen);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationUsage o) {
            Builder copiedBuilder =
                    applicationId(o.getApplicationId())
                            .displayName(o.getDisplayName())
                            .applicationType(o.getApplicationType())
                            .approximateInstallationCount(o.getApproximateInstallationCount())
                            .approximateJreCount(o.getApproximateJreCount())
                            .approximateManagedInstanceCount(o.getApproximateManagedInstanceCount())
                            .timeStart(o.getTimeStart())
                            .timeEnd(o.getTimeEnd())
                            .timeFirstSeen(o.getTimeFirstSeen())
                            .timeLastSeen(o.getTimeLastSeen());

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
     * An internal identifier for the application that is unique to a Fleet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    String applicationId;

    /**
     * The name of the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The type of the application, denoted by how the application was started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
    String applicationType;

    /**
     * The approximate count of installations running this application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
    Integer approximateInstallationCount;

    /**
     * The approximate count of Java Runtimes running this application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateJreCount")
    Integer approximateJreCount;

    /**
     * The approximate count of managed instances reporting this application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
    Integer approximateManagedInstanceCount;

    /**
     * Lower bound of the specified time period filter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    java.util.Date timeStart;

    /**
     * Upper bound of the specified time period filter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    java.util.Date timeEnd;

    /**
     * The date and time the resource was _first_ reported to JMS.
     * This is potentially _before_ the specified time period provided by the filters.
     * For example, a resource can be first reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
    java.util.Date timeFirstSeen;

    /**
     * The date and time the resource was _last_ reported to JMS.
     * This is potentially _after_ the specified time period provided by the filters.
     * For example, a resource can be last reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
    java.util.Date timeLastSeen;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
