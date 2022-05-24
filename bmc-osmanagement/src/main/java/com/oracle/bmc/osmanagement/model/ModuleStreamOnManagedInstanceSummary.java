/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Summary information pertaining to a module stream on a managed instance
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModuleStreamOnManagedInstanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ModuleStreamOnManagedInstanceSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
        private String moduleName;

        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            this.__explicitlySet__.add("moduleName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("streamName")
        private String streamName;

        public Builder streamName(String streamName) {
            this.streamName = streamName;
            this.__explicitlySet__.add("streamName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("profiles")
        private java.util.List<ModuleStreamProfileOnManagedInstanceSummary> profiles;

        public Builder profiles(
                java.util.List<ModuleStreamProfileOnManagedInstanceSummary> profiles) {
            this.profiles = profiles;
            this.__explicitlySet__.add("profiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
        private String softwareSourceId;

        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            this.__explicitlySet__.add("softwareSourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModuleStreamOnManagedInstanceSummary build() {
            ModuleStreamOnManagedInstanceSummary __instance__ =
                    new ModuleStreamOnManagedInstanceSummary(
                            moduleName,
                            streamName,
                            status,
                            profiles,
                            softwareSourceId,
                            timeModified);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModuleStreamOnManagedInstanceSummary o) {
            Builder copiedBuilder =
                    moduleName(o.getModuleName())
                            .streamName(o.getStreamName())
                            .status(o.getStatus())
                            .profiles(o.getProfiles())
                            .softwareSourceId(o.getSoftwareSourceId())
                            .timeModified(o.getTimeModified());

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
     * The name of the module that contains the stream.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
    String moduleName;

    /**
     * The name of the stream.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streamName")
    String streamName;
    /**
     * The status of the stream
     * <p>
     * A stream with the "ENABLED" status can be used as a source for installing
     * profiles.  Streams with this status are also "ACTIVE".
     * <p>
     * A stream with the "DISABLED" status cannot be the source for installing
     * profiles.  To install profiles and packages from this stream, it must be
     * enabled.
     * <p>
     * A stream with the "ACTIVE" status can be used as a source for installing
     * profiles.  The packages that comprise the stream are also used when a
     * matching package is installed directly.  In general, a stream can have
     * this status if it is the default stream for the module and no stream has
     * been explicitly enabled.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Active("ACTIVE"),

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
     * The status of the stream
     * <p>
     * A stream with the "ENABLED" status can be used as a source for installing
     * profiles.  Streams with this status are also "ACTIVE".
     * <p>
     * A stream with the "DISABLED" status cannot be the source for installing
     * profiles.  To install profiles and packages from this stream, it must be
     * enabled.
     * <p>
     * A stream with the "ACTIVE" status can be used as a source for installing
     * profiles.  The packages that comprise the stream are also used when a
     * matching package is installed directly.  In general, a stream can have
     * this status if it is the default stream for the module and no stream has
     * been explicitly enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The set of profiles that the module stream contains.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profiles")
    java.util.List<ModuleStreamProfileOnManagedInstanceSummary> profiles;

    /**
     * The OCID of the software source that provides this module stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
    String softwareSourceId;

    /**
     * The date and time of the last status change for this profile, as
     * described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
     * section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    java.util.Date timeModified;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
