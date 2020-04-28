/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Detail information for an OCI Compute instance that is being managed
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ManagedInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ManagedInstance {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastCheckin")
        private String lastCheckin;

        public Builder lastCheckin(String lastCheckin) {
            this.lastCheckin = lastCheckin;
            this.__explicitlySet__.add("lastCheckin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastBoot")
        private String lastBoot;

        public Builder lastBoot(String lastBoot) {
            this.lastBoot = lastBoot;
            this.__explicitlySet__.add("lastBoot");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatesAvailable")
        private Integer updatesAvailable;

        public Builder updatesAvailable(Integer updatesAvailable) {
            this.updatesAvailable = updatesAvailable;
            this.__explicitlySet__.add("updatesAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osName")
        private String osName;

        public Builder osName(String osName) {
            this.osName = osName;
            this.__explicitlySet__.add("osName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
        private String osVersion;

        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            this.__explicitlySet__.add("osVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
        private String osKernelVersion;

        public Builder osKernelVersion(String osKernelVersion) {
            this.osKernelVersion = osKernelVersion;
            this.__explicitlySet__.add("osKernelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentSoftwareSource")
        private SoftwareSourceId parentSoftwareSource;

        public Builder parentSoftwareSource(SoftwareSourceId parentSoftwareSource) {
            this.parentSoftwareSource = parentSoftwareSource;
            this.__explicitlySet__.add("parentSoftwareSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("childSoftwareSources")
        private java.util.List<SoftwareSourceId> childSoftwareSources;

        public Builder childSoftwareSources(java.util.List<SoftwareSourceId> childSoftwareSources) {
            this.childSoftwareSources = childSoftwareSources;
            this.__explicitlySet__.add("childSoftwareSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroups")
        private java.util.List<Id> managedInstanceGroups;

        public Builder managedInstanceGroups(java.util.List<Id> managedInstanceGroups) {
            this.managedInstanceGroups = managedInstanceGroups;
            this.__explicitlySet__.add("managedInstanceGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamilies osFamily;

        public Builder osFamily(OsFamilies osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
        private Boolean isRebootRequired;

        public Builder isRebootRequired(Boolean isRebootRequired) {
            this.isRebootRequired = isRebootRequired;
            this.__explicitlySet__.add("isRebootRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedInstance build() {
            ManagedInstance __instance__ =
                    new ManagedInstance(
                            displayName,
                            id,
                            description,
                            lastCheckin,
                            lastBoot,
                            updatesAvailable,
                            osName,
                            osVersion,
                            osKernelVersion,
                            compartmentId,
                            status,
                            parentSoftwareSource,
                            childSoftwareSources,
                            managedInstanceGroups,
                            osFamily,
                            isRebootRequired);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedInstance o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .id(o.getId())
                            .description(o.getDescription())
                            .lastCheckin(o.getLastCheckin())
                            .lastBoot(o.getLastBoot())
                            .updatesAvailable(o.getUpdatesAvailable())
                            .osName(o.getOsName())
                            .osVersion(o.getOsVersion())
                            .osKernelVersion(o.getOsKernelVersion())
                            .compartmentId(o.getCompartmentId())
                            .status(o.getStatus())
                            .parentSoftwareSource(o.getParentSoftwareSource())
                            .childSoftwareSources(o.getChildSoftwareSources())
                            .managedInstanceGroups(o.getManagedInstanceGroups())
                            .osFamily(o.getOsFamily())
                            .isRebootRequired(o.getIsRebootRequired());

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
     * Managed Instance identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * OCID for the managed instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Information specified by the user about the managed instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Time at which the instance last checked in
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastCheckin")
    String lastCheckin;

    /**
     * Time at which the instance last booted
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastBoot")
    String lastBoot;

    /**
     * Number of updates available to be installed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatesAvailable")
    Integer updatesAvailable;

    /**
     * Operating System Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osName")
    String osName;

    /**
     * Operating System Version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
    String osVersion;

    /**
     * Operating System Kernel Version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
    String osKernelVersion;

    /**
     * OCID for the Compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;
    /**
     * status of the managed instance.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Normal("NORMAL"),
        Unreachable("UNREACHABLE"),
        Error("ERROR"),
        Warning("WARNING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * status of the managed instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * the parent (base) Software Source attached to the Managed Instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentSoftwareSource")
    SoftwareSourceId parentSoftwareSource;

    /**
     * list of child Software Sources attached to the Managed Instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childSoftwareSources")
    java.util.List<SoftwareSourceId> childSoftwareSources;

    /**
     * The ids of the managed instance groups of which this instance is a
     * member.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroups")
    java.util.List<Id> managedInstanceGroups;

    /**
     * The Operating System type of the managed instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    OsFamilies osFamily;

    /**
     * Indicates whether a reboot is required to complete installation of updates.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
    Boolean isRebootRequired;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
