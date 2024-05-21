/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the TrailSequences.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TrailSequenceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TrailSequenceSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sequenceId",
        "displayName",
        "sizeInBytes",
        "timeLastUpdated"
    })
    public TrailSequenceSummary(
            String sequenceId,
            String displayName,
            Long sizeInBytes,
            java.util.Date timeLastUpdated) {
        super();
        this.sequenceId = sequenceId;
        this.displayName = displayName;
        this.sizeInBytes = sizeInBytes;
        this.timeLastUpdated = timeLastUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Sequence Id
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sequenceId")
        private String sequenceId;

        /**
         * Sequence Id
         *
         * @param sequenceId the value to set
         * @return this builder
         **/
        public Builder sequenceId(String sequenceId) {
            this.sequenceId = sequenceId;
            this.__explicitlySet__.add("sequenceId");
            return this;
        }
        /**
         * An object's Display Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The size of the backup stored in object storage (in bytes)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * The size of the backup stored in object storage (in bytes)
         *
         * @param sizeInBytes the value to set
         * @return this builder
         **/
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
        private java.util.Date timeLastUpdated;

        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeLastUpdated the value to set
         * @return this builder
         **/
        public Builder timeLastUpdated(java.util.Date timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            this.__explicitlySet__.add("timeLastUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TrailSequenceSummary build() {
            TrailSequenceSummary model =
                    new TrailSequenceSummary(
                            this.sequenceId,
                            this.displayName,
                            this.sizeInBytes,
                            this.timeLastUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TrailSequenceSummary model) {
            if (model.wasPropertyExplicitlySet("sequenceId")) {
                this.sequenceId(model.getSequenceId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("timeLastUpdated")) {
                this.timeLastUpdated(model.getTimeLastUpdated());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Sequence Id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sequenceId")
    private final String sequenceId;

    /**
     * Sequence Id
     *
     * @return the value
     **/
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * An object's Display Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The size of the backup stored in object storage (in bytes)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * The size of the backup stored in object storage (in bytes)
     *
     * @return the value
     **/
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
    private final java.util.Date timeLastUpdated;

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastUpdated() {
        return timeLastUpdated;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TrailSequenceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sequenceId=").append(String.valueOf(this.sequenceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", timeLastUpdated=").append(String.valueOf(this.timeLastUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TrailSequenceSummary)) {
            return false;
        }

        TrailSequenceSummary other = (TrailSequenceSummary) o;
        return java.util.Objects.equals(this.sequenceId, other.sequenceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.timeLastUpdated, other.timeLastUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sequenceId == null ? 43 : this.sequenceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastUpdated == null ? 43 : this.timeLastUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
