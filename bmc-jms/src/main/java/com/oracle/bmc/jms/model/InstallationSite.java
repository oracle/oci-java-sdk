/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Installation site of a Java Runtime.
 * An installation site is a Java Runtime installed at a specific path on a managed instance.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InstallationSite.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstallationSite {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("installationKey")
        private String installationKey;

        public Builder installationKey(String installationKey) {
            this.installationKey = installationKey;
            this.__explicitlySet__.add("installationKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jre")
        private JavaRuntimeId jre;

        public Builder jre(JavaRuntimeId jre) {
            this.jre = jre;
            this.__explicitlySet__.add("jre");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
        private java.util.Date timeLastSeen;

        public Builder timeLastSeen(java.util.Date timeLastSeen) {
            this.timeLastSeen = timeLastSeen;
            this.__explicitlySet__.add("timeLastSeen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blocklist")
        private java.util.List<BlocklistEntry> blocklist;

        public Builder blocklist(java.util.List<BlocklistEntry> blocklist) {
            this.blocklist = blocklist;
            this.__explicitlySet__.add("blocklist");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceType")
        private ManagedInstanceType managedInstanceType;

        public Builder managedInstanceType(ManagedInstanceType managedInstanceType) {
            this.managedInstanceType = managedInstanceType;
            this.__explicitlySet__.add("managedInstanceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstallationSite build() {
            InstallationSite __instance__ =
                    new InstallationSite(
                            installationKey,
                            managedInstanceId,
                            jre,
                            path,
                            operatingSystem,
                            approximateApplicationCount,
                            timeLastSeen,
                            blocklist,
                            lifecycleState,
                            managedInstanceType,
                            hostname);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallationSite o) {
            Builder copiedBuilder =
                    installationKey(o.getInstallationKey())
                            .managedInstanceId(o.getManagedInstanceId())
                            .jre(o.getJre())
                            .path(o.getPath())
                            .operatingSystem(o.getOperatingSystem())
                            .approximateApplicationCount(o.getApproximateApplicationCount())
                            .timeLastSeen(o.getTimeLastSeen())
                            .blocklist(o.getBlocklist())
                            .lifecycleState(o.getLifecycleState())
                            .managedInstanceType(o.getManagedInstanceType())
                            .hostname(o.getHostname());

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
     * The unique identifier for the installation of a Java Runtime at a specific path on a specific operating system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installationKey")
    String installationKey;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related managed instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    String managedInstanceId;

    @com.fasterxml.jackson.annotation.JsonProperty("jre")
    JavaRuntimeId jre;

    /**
     * The file system path of the installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    OperatingSystem operatingSystem;

    /**
     * The approximate count of applications running on this installation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
    Integer approximateApplicationCount;

    /**
     * The date and time the resource was _last_ reported to JMS.
     * This is potentially _after_ the specified time period provided by the filters.
     * For example, a resource can be last reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
    java.util.Date timeLastSeen;

    /**
     * The list of operations that are blocklisted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blocklist")
    java.util.List<BlocklistEntry> blocklist;

    /**
     * The lifecycle state of the installation site.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The type of the source of events.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceType")
    ManagedInstanceType managedInstanceType;

    /**
     * The hostname of the managed instance (if applicable).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
