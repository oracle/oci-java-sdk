/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Information about the data collected as a ZIP file when the event occurred.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EventContent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class EventContent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("contentAvailability")
        private ContentAvailability contentAvailability;

        public Builder contentAvailability(ContentAvailability contentAvailability) {
            this.contentAvailability = contentAvailability;
            this.__explicitlySet__.add("contentAvailability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instancePath")
        private String instancePath;

        public Builder instancePath(String instancePath) {
            this.instancePath = instancePath;
            this.__explicitlySet__.add("instancePath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Integer size;

        public Builder size(Integer size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EventContent build() {
            EventContent __instance__ = new EventContent(contentAvailability, instancePath, size);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EventContent o) {
            Builder copiedBuilder =
                    contentAvailability(o.getContentAvailability())
                            .instancePath(o.getInstancePath())
                            .size(o.getSize());

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
     * Status of the event content
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentAvailability")
    ContentAvailability contentAvailability;

    /**
     * Path to the event content on the instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instancePath")
    String instancePath;

    /**
     * size in bytes of the event content (size of the zip file uploaded)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    Integer size;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
