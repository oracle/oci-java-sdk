/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Upload is a container that can be used to put all the relevant and related on-demand upload based log files together.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Upload.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Upload {
    @Deprecated
    @java.beans.ConstructorProperties({
        "reference",
        "name",
        "timeCreated",
        "timeUpdated",
        "timeEarliestLogEntry",
        "timeLatestLogEntry",
        "warningsCount"
    })
    public Upload(
            String reference,
            String name,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeEarliestLogEntry,
            java.util.Date timeLatestLogEntry,
            Integer warningsCount) {
        super();
        this.reference = reference;
        this.name = name;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeEarliestLogEntry = timeEarliestLogEntry;
        this.timeLatestLogEntry = timeLatestLogEntry;
        this.warningsCount = warningsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("reference")
        private String reference;

        public Builder reference(String reference) {
            this.reference = reference;
            this.__explicitlySet__.add("reference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestLogEntry")
        private java.util.Date timeEarliestLogEntry;

        public Builder timeEarliestLogEntry(java.util.Date timeEarliestLogEntry) {
            this.timeEarliestLogEntry = timeEarliestLogEntry;
            this.__explicitlySet__.add("timeEarliestLogEntry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestLogEntry")
        private java.util.Date timeLatestLogEntry;

        public Builder timeLatestLogEntry(java.util.Date timeLatestLogEntry) {
            this.timeLatestLogEntry = timeLatestLogEntry;
            this.__explicitlySet__.add("timeLatestLogEntry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warningsCount")
        private Integer warningsCount;

        public Builder warningsCount(Integer warningsCount) {
            this.warningsCount = warningsCount;
            this.__explicitlySet__.add("warningsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Upload build() {
            Upload __instance__ =
                    new Upload(
                            reference,
                            name,
                            timeCreated,
                            timeUpdated,
                            timeEarliestLogEntry,
                            timeLatestLogEntry,
                            warningsCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Upload o) {
            Builder copiedBuilder =
                    reference(o.getReference())
                            .name(o.getName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .timeEarliestLogEntry(o.getTimeEarliestLogEntry())
                            .timeLatestLogEntry(o.getTimeLatestLogEntry())
                            .warningsCount(o.getWarningsCount());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique internal identifier to refer the upload container.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    private final String reference;

    public String getReference() {
        return reference;
    }

    /**
     * The name of the upload container.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The time when this upload container is created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The latest time when this upload container is modified. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * This time represents the earliest time of the log entry in this container. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestLogEntry")
    private final java.util.Date timeEarliestLogEntry;

    public java.util.Date getTimeEarliestLogEntry() {
        return timeEarliestLogEntry;
    }

    /**
     * This time represents the latest time of the log entry in this container. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestLogEntry")
    private final java.util.Date timeLatestLogEntry;

    public java.util.Date getTimeLatestLogEntry() {
        return timeLatestLogEntry;
    }

    /**
     * Number of warnings associated to the upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningsCount")
    private final Integer warningsCount;

    public Integer getWarningsCount() {
        return warningsCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Upload(");
        sb.append("reference=").append(String.valueOf(this.reference));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeEarliestLogEntry=").append(String.valueOf(this.timeEarliestLogEntry));
        sb.append(", timeLatestLogEntry=").append(String.valueOf(this.timeLatestLogEntry));
        sb.append(", warningsCount=").append(String.valueOf(this.warningsCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Upload)) {
            return false;
        }

        Upload other = (Upload) o;
        return java.util.Objects.equals(this.reference, other.reference)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeEarliestLogEntry, other.timeEarliestLogEntry)
                && java.util.Objects.equals(this.timeLatestLogEntry, other.timeLatestLogEntry)
                && java.util.Objects.equals(this.warningsCount, other.warningsCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reference == null ? 43 : this.reference.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeEarliestLogEntry == null
                                ? 43
                                : this.timeEarliestLogEntry.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLatestLogEntry == null
                                ? 43
                                : this.timeLatestLogEntry.hashCode());
        result =
                (result * PRIME)
                        + (this.warningsCount == null ? 43 : this.warningsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
