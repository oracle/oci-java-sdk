/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Information detailing the state of a module stream
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
    builder = UpdateModuleStreamDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateModuleStreamDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceName")
        private String softwareSourceName;

        public Builder softwareSourceName(String softwareSourceName) {
            this.softwareSourceName = softwareSourceName;
            this.__explicitlySet__.add("softwareSourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceUrl")
        private String softwareSourceUrl;

        public Builder softwareSourceUrl(String softwareSourceUrl) {
            this.softwareSourceUrl = softwareSourceUrl;
            this.__explicitlySet__.add("softwareSourceUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("profiles")
        private java.util.List<UpdateModuleStreamProfileDetails> profiles;

        public Builder profiles(java.util.List<UpdateModuleStreamProfileDetails> profiles) {
            this.profiles = profiles;
            this.__explicitlySet__.add("profiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateModuleStreamDetails build() {
            UpdateModuleStreamDetails __instance__ =
                    new UpdateModuleStreamDetails(
                            streamName,
                            status,
                            timeModified,
                            softwareSourceName,
                            softwareSourceUrl,
                            isDefault,
                            profiles);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModuleStreamDetails o) {
            Builder copiedBuilder =
                    streamName(o.getStreamName())
                            .status(o.getStatus())
                            .timeModified(o.getTimeModified())
                            .softwareSourceName(o.getSoftwareSourceName())
                            .softwareSourceUrl(o.getSoftwareSourceUrl())
                            .isDefault(o.getIsDefault())
                            .profiles(o.getProfiles());

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
     * The name of the stream of the parent module
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
    public enum Status {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Active("ACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Status: " + key);
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
     * The date and time of the last status change for this object, as
     * described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
     * section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    java.util.Date timeModified;

    /**
     * The name of the software source that publishes this stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceName")
    String softwareSourceName;

    /**
     * The URL of the software source that publishes this stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceUrl")
    String softwareSourceUrl;

    /**
     * Indicates if the module stream is the default
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    Boolean isDefault;

    /**
     * The profiles of the stream
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profiles")
    java.util.List<UpdateModuleStreamProfileDetails> profiles;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
