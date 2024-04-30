/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The information about an individual HeatWave node. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HeatWaveNode.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HeatWaveNode extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "status", "timeCreated"})
    public HeatWaveNode(String id, HeatWaveNodeStatus status, java.util.Date timeCreated) {
        super();
        this.id = id;
        this.status = status;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID associated with the HeatWave node. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ID associated with the HeatWave node.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The status of the HeatWave node. Indicates whether the status of the node is UP, DOWN, or
         * UNKNOWN at the current time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private HeatWaveNodeStatus status;

        /**
         * The status of the HeatWave node. Indicates whether the status of the node is UP, DOWN, or
         * UNKNOWN at the current time.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(HeatWaveNodeStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The date and time the HeatWave node was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the HeatWave node was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HeatWaveNode build() {
            HeatWaveNode model = new HeatWaveNode(this.id, this.status, this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HeatWaveNode model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /** The ID associated with the HeatWave node. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID associated with the HeatWave node.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The status of the HeatWave node. Indicates whether the status of the node is UP, DOWN, or
     * UNKNOWN at the current time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final HeatWaveNodeStatus status;

    /**
     * The status of the HeatWave node. Indicates whether the status of the node is UP, DOWN, or
     * UNKNOWN at the current time.
     *
     * @return the value
     */
    public HeatWaveNodeStatus getStatus() {
        return status;
    }

    /** The date and time the HeatWave node was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the HeatWave node was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("HeatWaveNode(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeatWaveNode)) {
            return false;
        }

        HeatWaveNode other = (HeatWaveNode) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
