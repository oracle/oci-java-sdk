/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Represents the current state of a consumer group, including partition reservations and committed
 * offsets. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Group.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Group extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"streamId", "groupName", "reservations"})
    public Group(
            String streamId, String groupName, java.util.List<PartitionReservation> reservations) {
        super();
        this.streamId = streamId;
        this.groupName = groupName;
        this.reservations = reservations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The streamId for which the group exists. */
        @com.fasterxml.jackson.annotation.JsonProperty("streamId")
        private String streamId;

        /**
         * The streamId for which the group exists.
         *
         * @param streamId the value to set
         * @return this builder
         */
        public Builder streamId(String streamId) {
            this.streamId = streamId;
            this.__explicitlySet__.add("streamId");
            return this;
        }
        /** The name of the consumer group. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        /**
         * The name of the consumer group.
         *
         * @param groupName the value to set
         * @return this builder
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }
        /** An array of the partition reservations of a group. */
        @com.fasterxml.jackson.annotation.JsonProperty("reservations")
        private java.util.List<PartitionReservation> reservations;

        /**
         * An array of the partition reservations of a group.
         *
         * @param reservations the value to set
         * @return this builder
         */
        public Builder reservations(java.util.List<PartitionReservation> reservations) {
            this.reservations = reservations;
            this.__explicitlySet__.add("reservations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Group build() {
            Group model = new Group(this.streamId, this.groupName, this.reservations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Group model) {
            if (model.wasPropertyExplicitlySet("streamId")) {
                this.streamId(model.getStreamId());
            }
            if (model.wasPropertyExplicitlySet("groupName")) {
                this.groupName(model.getGroupName());
            }
            if (model.wasPropertyExplicitlySet("reservations")) {
                this.reservations(model.getReservations());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The streamId for which the group exists. */
    @com.fasterxml.jackson.annotation.JsonProperty("streamId")
    private final String streamId;

    /**
     * The streamId for which the group exists.
     *
     * @return the value
     */
    public String getStreamId() {
        return streamId;
    }

    /** The name of the consumer group. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

    /**
     * The name of the consumer group.
     *
     * @return the value
     */
    public String getGroupName() {
        return groupName;
    }

    /** An array of the partition reservations of a group. */
    @com.fasterxml.jackson.annotation.JsonProperty("reservations")
    private final java.util.List<PartitionReservation> reservations;

    /**
     * An array of the partition reservations of a group.
     *
     * @return the value
     */
    public java.util.List<PartitionReservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Group(");
        sb.append("super=").append(super.toString());
        sb.append("streamId=").append(String.valueOf(this.streamId));
        sb.append(", groupName=").append(String.valueOf(this.groupName));
        sb.append(", reservations=").append(String.valueOf(this.reservations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Group)) {
            return false;
        }

        Group other = (Group) o;
        return java.util.Objects.equals(this.streamId, other.streamId)
                && java.util.Objects.equals(this.groupName, other.groupName)
                && java.util.Objects.equals(this.reservations, other.reservations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.streamId == null ? 43 : this.streamId.hashCode());
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result = (result * PRIME) + (this.reservations == null ? 43 : this.reservations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
