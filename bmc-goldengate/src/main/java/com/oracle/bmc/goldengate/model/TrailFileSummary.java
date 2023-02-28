/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the TrailFiles. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TrailFileSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TrailFileSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "trailFileId",
        "displayName",
        "sizeInBytes",
        "timeLastUpdated",
        "numberOfSequences",
        "minSequenceNumber",
        "maxSequenceNumber",
        "producer",
        "consumers"
    })
    public TrailFileSummary(
            String trailFileId,
            String displayName,
            java.math.BigDecimal sizeInBytes,
            java.util.Date timeLastUpdated,
            Integer numberOfSequences,
            String minSequenceNumber,
            String maxSequenceNumber,
            String producer,
            java.util.List<String> consumers) {
        super();
        this.trailFileId = trailFileId;
        this.displayName = displayName;
        this.sizeInBytes = sizeInBytes;
        this.timeLastUpdated = timeLastUpdated;
        this.numberOfSequences = numberOfSequences;
        this.minSequenceNumber = minSequenceNumber;
        this.maxSequenceNumber = maxSequenceNumber;
        this.producer = producer;
        this.consumers = consumers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The TrailFile Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("trailFileId")
        private String trailFileId;

        /**
         * The TrailFile Id.
         *
         * @param trailFileId the value to set
         * @return this builder
         */
        public Builder trailFileId(String trailFileId) {
            this.trailFileId = trailFileId;
            this.__explicitlySet__.add("trailFileId");
            return this;
        }
        /** An object's Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The size of the backup stored in object storage (in bytes) */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private java.math.BigDecimal sizeInBytes;

        /**
         * The size of the backup stored in object storage (in bytes)
         *
         * @param sizeInBytes the value to set
         * @return this builder
         */
        public Builder sizeInBytes(java.math.BigDecimal sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
        private java.util.Date timeLastUpdated;

        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeLastUpdated the value to set
         * @return this builder
         */
        public Builder timeLastUpdated(java.util.Date timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            this.__explicitlySet__.add("timeLastUpdated");
            return this;
        }
        /** Number of sequences for a specific trail file */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfSequences")
        private Integer numberOfSequences;

        /**
         * Number of sequences for a specific trail file
         *
         * @param numberOfSequences the value to set
         * @return this builder
         */
        public Builder numberOfSequences(Integer numberOfSequences) {
            this.numberOfSequences = numberOfSequences;
            this.__explicitlySet__.add("numberOfSequences");
            return this;
        }
        /** Minimum sequence number */
        @com.fasterxml.jackson.annotation.JsonProperty("minSequenceNumber")
        private String minSequenceNumber;

        /**
         * Minimum sequence number
         *
         * @param minSequenceNumber the value to set
         * @return this builder
         */
        public Builder minSequenceNumber(String minSequenceNumber) {
            this.minSequenceNumber = minSequenceNumber;
            this.__explicitlySet__.add("minSequenceNumber");
            return this;
        }
        /** Maximum sequence number */
        @com.fasterxml.jackson.annotation.JsonProperty("maxSequenceNumber")
        private String maxSequenceNumber;

        /**
         * Maximum sequence number
         *
         * @param maxSequenceNumber the value to set
         * @return this builder
         */
        public Builder maxSequenceNumber(String maxSequenceNumber) {
            this.maxSequenceNumber = maxSequenceNumber;
            this.__explicitlySet__.add("maxSequenceNumber");
            return this;
        }
        /** Producer Process Name if any. */
        @com.fasterxml.jackson.annotation.JsonProperty("producer")
        private String producer;

        /**
         * Producer Process Name if any.
         *
         * @param producer the value to set
         * @return this builder
         */
        public Builder producer(String producer) {
            this.producer = producer;
            this.__explicitlySet__.add("producer");
            return this;
        }
        /** array of consumer process names */
        @com.fasterxml.jackson.annotation.JsonProperty("consumers")
        private java.util.List<String> consumers;

        /**
         * array of consumer process names
         *
         * @param consumers the value to set
         * @return this builder
         */
        public Builder consumers(java.util.List<String> consumers) {
            this.consumers = consumers;
            this.__explicitlySet__.add("consumers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TrailFileSummary build() {
            TrailFileSummary model =
                    new TrailFileSummary(
                            this.trailFileId,
                            this.displayName,
                            this.sizeInBytes,
                            this.timeLastUpdated,
                            this.numberOfSequences,
                            this.minSequenceNumber,
                            this.maxSequenceNumber,
                            this.producer,
                            this.consumers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TrailFileSummary model) {
            if (model.wasPropertyExplicitlySet("trailFileId")) {
                this.trailFileId(model.getTrailFileId());
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
            if (model.wasPropertyExplicitlySet("numberOfSequences")) {
                this.numberOfSequences(model.getNumberOfSequences());
            }
            if (model.wasPropertyExplicitlySet("minSequenceNumber")) {
                this.minSequenceNumber(model.getMinSequenceNumber());
            }
            if (model.wasPropertyExplicitlySet("maxSequenceNumber")) {
                this.maxSequenceNumber(model.getMaxSequenceNumber());
            }
            if (model.wasPropertyExplicitlySet("producer")) {
                this.producer(model.getProducer());
            }
            if (model.wasPropertyExplicitlySet("consumers")) {
                this.consumers(model.getConsumers());
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

    /** The TrailFile Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("trailFileId")
    private final String trailFileId;

    /**
     * The TrailFile Id.
     *
     * @return the value
     */
    public String getTrailFileId() {
        return trailFileId;
    }

    /** An object's Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The size of the backup stored in object storage (in bytes) */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final java.math.BigDecimal sizeInBytes;

    /**
     * The size of the backup stored in object storage (in bytes)
     *
     * @return the value
     */
    public java.math.BigDecimal getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
    private final java.util.Date timeLastUpdated;

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeLastUpdated() {
        return timeLastUpdated;
    }

    /** Number of sequences for a specific trail file */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfSequences")
    private final Integer numberOfSequences;

    /**
     * Number of sequences for a specific trail file
     *
     * @return the value
     */
    public Integer getNumberOfSequences() {
        return numberOfSequences;
    }

    /** Minimum sequence number */
    @com.fasterxml.jackson.annotation.JsonProperty("minSequenceNumber")
    private final String minSequenceNumber;

    /**
     * Minimum sequence number
     *
     * @return the value
     */
    public String getMinSequenceNumber() {
        return minSequenceNumber;
    }

    /** Maximum sequence number */
    @com.fasterxml.jackson.annotation.JsonProperty("maxSequenceNumber")
    private final String maxSequenceNumber;

    /**
     * Maximum sequence number
     *
     * @return the value
     */
    public String getMaxSequenceNumber() {
        return maxSequenceNumber;
    }

    /** Producer Process Name if any. */
    @com.fasterxml.jackson.annotation.JsonProperty("producer")
    private final String producer;

    /**
     * Producer Process Name if any.
     *
     * @return the value
     */
    public String getProducer() {
        return producer;
    }

    /** array of consumer process names */
    @com.fasterxml.jackson.annotation.JsonProperty("consumers")
    private final java.util.List<String> consumers;

    /**
     * array of consumer process names
     *
     * @return the value
     */
    public java.util.List<String> getConsumers() {
        return consumers;
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
        sb.append("TrailFileSummary(");
        sb.append("super=").append(super.toString());
        sb.append("trailFileId=").append(String.valueOf(this.trailFileId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", timeLastUpdated=").append(String.valueOf(this.timeLastUpdated));
        sb.append(", numberOfSequences=").append(String.valueOf(this.numberOfSequences));
        sb.append(", minSequenceNumber=").append(String.valueOf(this.minSequenceNumber));
        sb.append(", maxSequenceNumber=").append(String.valueOf(this.maxSequenceNumber));
        sb.append(", producer=").append(String.valueOf(this.producer));
        sb.append(", consumers=").append(String.valueOf(this.consumers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TrailFileSummary)) {
            return false;
        }

        TrailFileSummary other = (TrailFileSummary) o;
        return java.util.Objects.equals(this.trailFileId, other.trailFileId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.timeLastUpdated, other.timeLastUpdated)
                && java.util.Objects.equals(this.numberOfSequences, other.numberOfSequences)
                && java.util.Objects.equals(this.minSequenceNumber, other.minSequenceNumber)
                && java.util.Objects.equals(this.maxSequenceNumber, other.maxSequenceNumber)
                && java.util.Objects.equals(this.producer, other.producer)
                && java.util.Objects.equals(this.consumers, other.consumers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.trailFileId == null ? 43 : this.trailFileId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastUpdated == null ? 43 : this.timeLastUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfSequences == null ? 43 : this.numberOfSequences.hashCode());
        result =
                (result * PRIME)
                        + (this.minSequenceNumber == null ? 43 : this.minSequenceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.maxSequenceNumber == null ? 43 : this.maxSequenceNumber.hashCode());
        result = (result * PRIME) + (this.producer == null ? 43 : this.producer.hashCode());
        result = (result * PRIME) + (this.consumers == null ? 43 : this.consumers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
