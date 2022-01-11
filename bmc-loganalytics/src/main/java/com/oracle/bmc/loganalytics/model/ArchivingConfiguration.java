/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the configuration for data archiving in object storage
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ArchivingConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ArchivingConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("activeStorageDuration")
        private String activeStorageDuration;

        public Builder activeStorageDuration(String activeStorageDuration) {
            this.activeStorageDuration = activeStorageDuration;
            this.__explicitlySet__.add("activeStorageDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("archivalStorageDuration")
        private String archivalStorageDuration;

        public Builder archivalStorageDuration(String archivalStorageDuration) {
            this.archivalStorageDuration = archivalStorageDuration;
            this.__explicitlySet__.add("archivalStorageDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ArchivingConfiguration build() {
            ArchivingConfiguration __instance__ =
                    new ArchivingConfiguration(activeStorageDuration, archivalStorageDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ArchivingConfiguration o) {
            Builder copiedBuilder =
                    activeStorageDuration(o.getActiveStorageDuration())
                            .archivalStorageDuration(o.getArchivalStorageDuration());

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
     * This is the duration data in active storage before data is archived, as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations.
     * The largest supported unit is D, e.g. P365D (not P1Y) or P14D (not P2W).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeStorageDuration")
    String activeStorageDuration;

    /**
     * This is the duration before archived data is deleted from object storage, as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations
     * The largest supported unit is D, e.g. P365D (not P1Y) or P14D (not P2W).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archivalStorageDuration")
    String archivalStorageDuration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
