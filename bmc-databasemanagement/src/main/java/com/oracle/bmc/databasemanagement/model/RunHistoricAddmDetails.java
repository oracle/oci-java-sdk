/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the ADDM task, which include the beginning and ending AWR snapshot IDs. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RunHistoricAddmDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunHistoricAddmDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"startSnapshotId", "endSnapshotId"})
    public RunHistoricAddmDetails(Long startSnapshotId, Long endSnapshotId) {
        super();
        this.startSnapshotId = startSnapshotId;
        this.endSnapshotId = endSnapshotId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID number of the beginning AWR snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("startSnapshotId")
        private Long startSnapshotId;

        /**
         * The ID number of the beginning AWR snapshot.
         *
         * @param startSnapshotId the value to set
         * @return this builder
         */
        public Builder startSnapshotId(Long startSnapshotId) {
            this.startSnapshotId = startSnapshotId;
            this.__explicitlySet__.add("startSnapshotId");
            return this;
        }
        /** The ID of the ending AWR snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("endSnapshotId")
        private Long endSnapshotId;

        /**
         * The ID of the ending AWR snapshot.
         *
         * @param endSnapshotId the value to set
         * @return this builder
         */
        public Builder endSnapshotId(Long endSnapshotId) {
            this.endSnapshotId = endSnapshotId;
            this.__explicitlySet__.add("endSnapshotId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunHistoricAddmDetails build() {
            RunHistoricAddmDetails model =
                    new RunHistoricAddmDetails(this.startSnapshotId, this.endSnapshotId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunHistoricAddmDetails model) {
            if (model.wasPropertyExplicitlySet("startSnapshotId")) {
                this.startSnapshotId(model.getStartSnapshotId());
            }
            if (model.wasPropertyExplicitlySet("endSnapshotId")) {
                this.endSnapshotId(model.getEndSnapshotId());
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

    /** The ID number of the beginning AWR snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("startSnapshotId")
    private final Long startSnapshotId;

    /**
     * The ID number of the beginning AWR snapshot.
     *
     * @return the value
     */
    public Long getStartSnapshotId() {
        return startSnapshotId;
    }

    /** The ID of the ending AWR snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("endSnapshotId")
    private final Long endSnapshotId;

    /**
     * The ID of the ending AWR snapshot.
     *
     * @return the value
     */
    public Long getEndSnapshotId() {
        return endSnapshotId;
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
        sb.append("RunHistoricAddmDetails(");
        sb.append("super=").append(super.toString());
        sb.append("startSnapshotId=").append(String.valueOf(this.startSnapshotId));
        sb.append(", endSnapshotId=").append(String.valueOf(this.endSnapshotId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunHistoricAddmDetails)) {
            return false;
        }

        RunHistoricAddmDetails other = (RunHistoricAddmDetails) o;
        return java.util.Objects.equals(this.startSnapshotId, other.startSnapshotId)
                && java.util.Objects.equals(this.endSnapshotId, other.endSnapshotId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.startSnapshotId == null ? 43 : this.startSnapshotId.hashCode());
        result =
                (result * PRIME)
                        + (this.endSnapshotId == null ? 43 : this.endSnapshotId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
