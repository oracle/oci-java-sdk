/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Represents the current state of a consumer group, including partition reservations and committed offsets.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Group.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Group {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("streamId")
        private String streamId;

        public Builder streamId(String streamId) {
            this.streamId = streamId;
            this.__explicitlySet__.add("streamId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reservations")
        private java.util.List<PartitionReservation> reservations;

        public Builder reservations(java.util.List<PartitionReservation> reservations) {
            this.reservations = reservations;
            this.__explicitlySet__.add("reservations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Group build() {
            Group __instance__ = new Group(streamId, groupName, reservations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Group o) {
            Builder copiedBuilder =
                    streamId(o.getStreamId())
                            .groupName(o.getGroupName())
                            .reservations(o.getReservations());

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
     * The streamId for which the group exists.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streamId")
    String streamId;

    /**
     * The name of the consumer group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    String groupName;

    /**
     * An array of the partition reservations of a group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reservations")
    java.util.List<PartitionReservation> reservations;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
