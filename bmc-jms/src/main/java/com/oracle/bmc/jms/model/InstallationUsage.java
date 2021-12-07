/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Installation usage during a specified time period.
 * An installation is a collection of deployed instances of a specific Java Runtime that share the same install path.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstallationUsage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstallationUsage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("os")
        private String os;

        public Builder os(String os) {
            this.os = os;
            this.__explicitlySet__.add("os");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private OperatingSystem operatingSystem;

        public Builder operatingSystem(OperatingSystem operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
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

        public InstallationUsage build() {
            InstallationUsage __instance__ =
                    new InstallationUsage(
                            jreVendor,
                            jreDistribution,
                            jreVersion,
                            path,
                            os,
                            architecture,
                            operatingSystem,
                            approximateApplicationCount,
                            approximateManagedInstanceCount,
                            timeStart,
                            timeEnd,
                            timeFirstSeen,
                            timeLastSeen);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallationUsage o) {
            Builder copiedBuilder =
                    jreVendor(o.getJreVendor())
                            .jreDistribution(o.getJreDistribution())
                            .jreVersion(o.getJreVersion())
                            .path(o.getPath())
                            .os(o.getOs())
                            .architecture(o.getArchitecture())
                            .operatingSystem(o.getOperatingSystem())
                            .approximateApplicationCount(o.getApproximateApplicationCount())
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
     * The vendor of the Java Runtime that is deployed with the installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreVendor")
    String jreVendor;

    /**
     * The distribution of the Java Runtime that is deployed with the installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreDistribution")
    String jreDistribution;

    /**
     * The version of the Java Runtime that is deployed with the installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreVersion")
    String jreVersion;

    /**
     * The file system path of the Java installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * The Operating System for the installation. Deprecated, use {@code operatingSystem} instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("os")
    String os;

    /**
     * The architecture of the operating system for the installation. Deprecated, use {@code operatingSystem} instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    String architecture;

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    OperatingSystem operatingSystem;

    /**
     * The approximate count of applications running on this installation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
    Integer approximateApplicationCount;

    /**
     * The approximate count of managed instances reporting this installation
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
