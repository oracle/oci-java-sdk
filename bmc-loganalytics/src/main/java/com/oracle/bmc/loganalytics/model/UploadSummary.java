/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Summary of the Upload. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UploadSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UploadSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
    public UploadSummary(
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
        /** Unique internal identifier to refer the upload container. */
        @com.fasterxml.jackson.annotation.JsonProperty("reference")
        private String reference;

        /**
         * Unique internal identifier to refer the upload container.
         *
         * @param reference the value to set
         * @return this builder
         */
        public Builder reference(String reference) {
            this.reference = reference;
            this.__explicitlySet__.add("reference");
            return this;
        }
        /** The name of the upload container. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the upload container.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The time when this upload container is created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when this upload container is created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The latest time when this upload container is modified. An RFC3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The latest time when this upload container is modified. An RFC3339 formatted datetime
         * string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * This time represents the earliest time of the log entry in this container. An RFC3339
         * formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestLogEntry")
        private java.util.Date timeEarliestLogEntry;

        /**
         * This time represents the earliest time of the log entry in this container. An RFC3339
         * formatted datetime string.
         *
         * @param timeEarliestLogEntry the value to set
         * @return this builder
         */
        public Builder timeEarliestLogEntry(java.util.Date timeEarliestLogEntry) {
            this.timeEarliestLogEntry = timeEarliestLogEntry;
            this.__explicitlySet__.add("timeEarliestLogEntry");
            return this;
        }
        /**
         * This time represents the latest time of the log entry in this container. An RFC3339
         * formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestLogEntry")
        private java.util.Date timeLatestLogEntry;

        /**
         * This time represents the latest time of the log entry in this container. An RFC3339
         * formatted datetime string.
         *
         * @param timeLatestLogEntry the value to set
         * @return this builder
         */
        public Builder timeLatestLogEntry(java.util.Date timeLatestLogEntry) {
            this.timeLatestLogEntry = timeLatestLogEntry;
            this.__explicitlySet__.add("timeLatestLogEntry");
            return this;
        }
        /** Number of warnings associated to the upload. */
        @com.fasterxml.jackson.annotation.JsonProperty("warningsCount")
        private Integer warningsCount;

        /**
         * Number of warnings associated to the upload.
         *
         * @param warningsCount the value to set
         * @return this builder
         */
        public Builder warningsCount(Integer warningsCount) {
            this.warningsCount = warningsCount;
            this.__explicitlySet__.add("warningsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadSummary build() {
            UploadSummary model =
                    new UploadSummary(
                            this.reference,
                            this.name,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeEarliestLogEntry,
                            this.timeLatestLogEntry,
                            this.warningsCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadSummary model) {
            if (model.wasPropertyExplicitlySet("reference")) {
                this.reference(model.getReference());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeEarliestLogEntry")) {
                this.timeEarliestLogEntry(model.getTimeEarliestLogEntry());
            }
            if (model.wasPropertyExplicitlySet("timeLatestLogEntry")) {
                this.timeLatestLogEntry(model.getTimeLatestLogEntry());
            }
            if (model.wasPropertyExplicitlySet("warningsCount")) {
                this.warningsCount(model.getWarningsCount());
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

    /** Unique internal identifier to refer the upload container. */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    private final String reference;

    /**
     * Unique internal identifier to refer the upload container.
     *
     * @return the value
     */
    public String getReference() {
        return reference;
    }

    /** The name of the upload container. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the upload container.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The time when this upload container is created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when this upload container is created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The latest time when this upload container is modified. An RFC3339 formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The latest time when this upload container is modified. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * This time represents the earliest time of the log entry in this container. An RFC3339
     * formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestLogEntry")
    private final java.util.Date timeEarliestLogEntry;

    /**
     * This time represents the earliest time of the log entry in this container. An RFC3339
     * formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeEarliestLogEntry() {
        return timeEarliestLogEntry;
    }

    /**
     * This time represents the latest time of the log entry in this container. An RFC3339 formatted
     * datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestLogEntry")
    private final java.util.Date timeLatestLogEntry;

    /**
     * This time represents the latest time of the log entry in this container. An RFC3339 formatted
     * datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeLatestLogEntry() {
        return timeLatestLogEntry;
    }

    /** Number of warnings associated to the upload. */
    @com.fasterxml.jackson.annotation.JsonProperty("warningsCount")
    private final Integer warningsCount;

    /**
     * Number of warnings associated to the upload.
     *
     * @return the value
     */
    public Integer getWarningsCount() {
        return warningsCount;
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
        sb.append("UploadSummary(");
        sb.append("super=").append(super.toString());
        sb.append("reference=").append(String.valueOf(this.reference));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeEarliestLogEntry=").append(String.valueOf(this.timeEarliestLogEntry));
        sb.append(", timeLatestLogEntry=").append(String.valueOf(this.timeLatestLogEntry));
        sb.append(", warningsCount=").append(String.valueOf(this.warningsCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadSummary)) {
            return false;
        }

        UploadSummary other = (UploadSummary) o;
        return java.util.Objects.equals(this.reference, other.reference)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeEarliestLogEntry, other.timeEarliestLogEntry)
                && java.util.Objects.equals(this.timeLatestLogEntry, other.timeLatestLogEntry)
                && java.util.Objects.equals(this.warningsCount, other.warningsCount)
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
