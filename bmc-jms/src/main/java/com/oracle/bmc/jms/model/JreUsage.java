/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Java Runtime usage during a specified time period. A Java Runtime is identified by its vendor and version.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JreUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class JreUsage {
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

        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityStatus")
        private JreSecurityStatus securityStatus;

        public Builder securityStatus(JreSecurityStatus securityStatus) {
            this.securityStatus = securityStatus;
            this.__explicitlySet__.add("securityStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
        private java.util.Date releaseDate;

        public Builder releaseDate(java.util.Date releaseDate) {
            this.releaseDate = releaseDate;
            this.__explicitlySet__.add("releaseDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endOfSupportLifeDate")
        private java.util.Date endOfSupportLifeDate;

        public Builder endOfSupportLifeDate(java.util.Date endOfSupportLifeDate) {
            this.endOfSupportLifeDate = endOfSupportLifeDate;
            this.__explicitlySet__.add("endOfSupportLifeDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vendor")
        private String vendor;

        public Builder vendor(String vendor) {
            this.vendor = vendor;
            this.__explicitlySet__.add("vendor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("distribution")
        private String distribution;

        public Builder distribution(String distribution) {
            this.distribution = distribution;
            this.__explicitlySet__.add("distribution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystems")
        private java.util.List<OperatingSystem> operatingSystems;

        public Builder operatingSystems(java.util.List<OperatingSystem> operatingSystems) {
            this.operatingSystems = operatingSystems;
            this.__explicitlySet__.add("operatingSystems");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
        private Integer approximateInstallationCount;

        public Builder approximateInstallationCount(Integer approximateInstallationCount) {
            this.approximateInstallationCount = approximateInstallationCount;
            this.__explicitlySet__.add("approximateInstallationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
        private Integer approximateApplicationCount;

        public Builder approximateApplicationCount(Integer approximateApplicationCount) {
            this.approximateApplicationCount = approximateApplicationCount;
            this.__explicitlySet__.add("approximateApplicationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
        private Integer approximateManagedInstanceCount;

        public Builder approximateManagedInstanceCount(Integer approximateManagedInstanceCount) {
            this.approximateManagedInstanceCount = approximateManagedInstanceCount;
            this.__explicitlySet__.add("approximateManagedInstanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approximatePendingWorkRequestCount")
        private Integer approximatePendingWorkRequestCount;

        public Builder approximatePendingWorkRequestCount(
                Integer approximatePendingWorkRequestCount) {
            this.approximatePendingWorkRequestCount = approximatePendingWorkRequestCount;
            this.__explicitlySet__.add("approximatePendingWorkRequestCount");
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

        public JreUsage build() {
            JreUsage __instance__ =
                    new JreUsage(
                            id,
                            fleetId,
                            managedInstanceId,
                            securityStatus,
                            releaseDate,
                            endOfSupportLifeDate,
                            vendor,
                            distribution,
                            version,
                            operatingSystems,
                            approximateInstallationCount,
                            approximateApplicationCount,
                            approximateManagedInstanceCount,
                            approximatePendingWorkRequestCount,
                            timeStart,
                            timeEnd,
                            timeFirstSeen,
                            timeLastSeen);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JreUsage o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .fleetId(o.getFleetId())
                            .managedInstanceId(o.getManagedInstanceId())
                            .securityStatus(o.getSecurityStatus())
                            .releaseDate(o.getReleaseDate())
                            .endOfSupportLifeDate(o.getEndOfSupportLifeDate())
                            .vendor(o.getVendor())
                            .distribution(o.getDistribution())
                            .version(o.getVersion())
                            .operatingSystems(o.getOperatingSystems())
                            .approximateInstallationCount(o.getApproximateInstallationCount())
                            .approximateApplicationCount(o.getApproximateApplicationCount())
                            .approximateManagedInstanceCount(o.getApproximateManagedInstanceCount())
                            .approximatePendingWorkRequestCount(
                                    o.getApproximatePendingWorkRequestCount())
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
     * The internal identifier of the Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related fleet.  This property value is present only for /actions/listJreUsage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    String fleetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related managed instance. This property value is present only for /actions/listJreUsage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    String managedInstanceId;

    /**
     * The security status of the Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityStatus")
    JreSecurityStatus securityStatus;

    /**
     * The release date of the Java Runtime (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
    java.util.Date releaseDate;

    /**
     * The End of Support Life (EOSL) date of the Java Runtime (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endOfSupportLifeDate")
    java.util.Date endOfSupportLifeDate;

    /**
     * The vendor of the Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    String vendor;

    /**
     * The distribution of a Java Runtime is the name of the lineage of product to which it belongs, for example _Java(TM) SE Runtime Environment_.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("distribution")
    String distribution;

    /**
     * The version of the Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * The operating systems that have this Java Runtime installed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystems")
    java.util.List<OperatingSystem> operatingSystems;

    /**
     * The approximate count of installations that are installations of this Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
    Integer approximateInstallationCount;

    /**
     * The approximate count of the applications running on this Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
    Integer approximateApplicationCount;

    /**
     * The approximate count of the managed instances that report this Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
    Integer approximateManagedInstanceCount;

    /**
     * The approximate count of work requests working on this Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximatePendingWorkRequestCount")
    Integer approximatePendingWorkRequestCount;

    /**
     * Lower bound of the specified time period filter. JMS provides a view of the data that is _per day_. The query uses only the date element of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    java.util.Date timeStart;

    /**
     * Upper bound of the specified time period filter. JMS provides a view of the data that is _per day_. The query uses only the date element of the parameter.
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
