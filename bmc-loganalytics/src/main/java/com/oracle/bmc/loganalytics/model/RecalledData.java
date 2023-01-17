/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the information about recalled data <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecalledData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class RecalledData extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeDataEnded",
        "timeDataStarted",
        "timeStarted",
        "status",
        "recallCount",
        "storageUsageInBytes"
    })
    public RecalledData(
            java.util.Date timeDataEnded,
            java.util.Date timeDataStarted,
            java.util.Date timeStarted,
            Status status,
            Integer recallCount,
            Long storageUsageInBytes) {
        super();
        this.timeDataEnded = timeDataEnded;
        this.timeDataStarted = timeDataStarted;
        this.timeStarted = timeStarted;
        this.status = status;
        this.recallCount = recallCount;
        this.storageUsageInBytes = storageUsageInBytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the end of the time range of the related data */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        /**
         * This is the end of the time range of the related data
         *
         * @param timeDataEnded the value to set
         * @return this builder
         */
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }
        /** This is the start of the time range of the related data */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        /**
         * This is the start of the time range of the related data
         *
         * @param timeDataStarted the value to set
         * @return this builder
         */
        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }
        /** This is the time when the first recall operation was started for this RecalledData */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * This is the time when the first recall operation was started for this RecalledData
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** This is the status of the recall */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * This is the status of the recall
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * This is the number of recall operations for this recall. Note one RecalledData can be
         * merged from the results of several recall operations if the time duration of the results
         * of the recall operations overlap.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recallCount")
        private Integer recallCount;

        /**
         * This is the number of recall operations for this recall. Note one RecalledData can be
         * merged from the results of several recall operations if the time duration of the results
         * of the recall operations overlap.
         *
         * @param recallCount the value to set
         * @return this builder
         */
        public Builder recallCount(Integer recallCount) {
            this.recallCount = recallCount;
            this.__explicitlySet__.add("recallCount");
            return this;
        }
        /** This is the size in bytes */
        @com.fasterxml.jackson.annotation.JsonProperty("storageUsageInBytes")
        private Long storageUsageInBytes;

        /**
         * This is the size in bytes
         *
         * @param storageUsageInBytes the value to set
         * @return this builder
         */
        public Builder storageUsageInBytes(Long storageUsageInBytes) {
            this.storageUsageInBytes = storageUsageInBytes;
            this.__explicitlySet__.add("storageUsageInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecalledData build() {
            RecalledData model =
                    new RecalledData(
                            this.timeDataEnded,
                            this.timeDataStarted,
                            this.timeStarted,
                            this.status,
                            this.recallCount,
                            this.storageUsageInBytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecalledData model) {
            if (model.wasPropertyExplicitlySet("timeDataEnded")) {
                this.timeDataEnded(model.getTimeDataEnded());
            }
            if (model.wasPropertyExplicitlySet("timeDataStarted")) {
                this.timeDataStarted(model.getTimeDataStarted());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("recallCount")) {
                this.recallCount(model.getRecallCount());
            }
            if (model.wasPropertyExplicitlySet("storageUsageInBytes")) {
                this.storageUsageInBytes(model.getStorageUsageInBytes());
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

    /** This is the end of the time range of the related data */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    private final java.util.Date timeDataEnded;

    /**
     * This is the end of the time range of the related data
     *
     * @return the value
     */
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
    }

    /** This is the start of the time range of the related data */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    private final java.util.Date timeDataStarted;

    /**
     * This is the start of the time range of the related data
     *
     * @return the value
     */
    public java.util.Date getTimeDataStarted() {
        return timeDataStarted;
    }

    /** This is the time when the first recall operation was started for this RecalledData */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * This is the time when the first recall operation was started for this RecalledData
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** This is the status of the recall */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Recalled("RECALLED"),
        Pending("PENDING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

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
    /** This is the status of the recall */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * This is the status of the recall
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * This is the number of recall operations for this recall. Note one RecalledData can be merged
     * from the results of several recall operations if the time duration of the results of the
     * recall operations overlap.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recallCount")
    private final Integer recallCount;

    /**
     * This is the number of recall operations for this recall. Note one RecalledData can be merged
     * from the results of several recall operations if the time duration of the results of the
     * recall operations overlap.
     *
     * @return the value
     */
    public Integer getRecallCount() {
        return recallCount;
    }

    /** This is the size in bytes */
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsageInBytes")
    private final Long storageUsageInBytes;

    /**
     * This is the size in bytes
     *
     * @return the value
     */
    public Long getStorageUsageInBytes() {
        return storageUsageInBytes;
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
        sb.append("RecalledData(");
        sb.append("super=").append(super.toString());
        sb.append("timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(", timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", recallCount=").append(String.valueOf(this.recallCount));
        sb.append(", storageUsageInBytes=").append(String.valueOf(this.storageUsageInBytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecalledData)) {
            return false;
        }

        RecalledData other = (RecalledData) o;
        return java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded)
                && java.util.Objects.equals(this.timeDataStarted, other.timeDataStarted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.recallCount, other.recallCount)
                && java.util.Objects.equals(this.storageUsageInBytes, other.storageUsageInBytes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeDataEnded == null ? 43 : this.timeDataEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataStarted == null ? 43 : this.timeDataStarted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.recallCount == null ? 43 : this.recallCount.hashCode());
        result =
                (result * PRIME)
                        + (this.storageUsageInBytes == null
                                ? 43
                                : this.storageUsageInBytes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
