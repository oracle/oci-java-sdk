/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The properties of the backup destination associated with the Autonomous Container Database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BackupDestinationProperties.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BackupDestinationProperties
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "backupDestinationAttachHistory",
        "spaceUtilizedInGBs",
        "timeAtWhichStorageDetailsAreUpdated"
    })
    public BackupDestinationProperties(
            java.util.List<java.util.Date> backupDestinationAttachHistory,
            Integer spaceUtilizedInGBs,
            java.util.Date timeAtWhichStorageDetailsAreUpdated) {
        super();
        this.backupDestinationAttachHistory = backupDestinationAttachHistory;
        this.spaceUtilizedInGBs = spaceUtilizedInGBs;
        this.timeAtWhichStorageDetailsAreUpdated = timeAtWhichStorageDetailsAreUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The timestamps at which this backup destination is used as the preferred destination to host the Autonomous Container Database backups.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationAttachHistory")
        private java.util.List<java.util.Date> backupDestinationAttachHistory;

        /**
         * The timestamps at which this backup destination is used as the preferred destination to host the Autonomous Container Database backups.
         * @param backupDestinationAttachHistory the value to set
         * @return this builder
         **/
        public Builder backupDestinationAttachHistory(
                java.util.List<java.util.Date> backupDestinationAttachHistory) {
            this.backupDestinationAttachHistory = backupDestinationAttachHistory;
            this.__explicitlySet__.add("backupDestinationAttachHistory");
            return this;
        }
        /**
         * The total space utilized (in GBs) by this Autonomous Container Database on this backup destination, rounded to the nearest integer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spaceUtilizedInGBs")
        private Integer spaceUtilizedInGBs;

        /**
         * The total space utilized (in GBs) by this Autonomous Container Database on this backup destination, rounded to the nearest integer.
         * @param spaceUtilizedInGBs the value to set
         * @return this builder
         **/
        public Builder spaceUtilizedInGBs(Integer spaceUtilizedInGBs) {
            this.spaceUtilizedInGBs = spaceUtilizedInGBs;
            this.__explicitlySet__.add("spaceUtilizedInGBs");
            return this;
        }
        /**
         * The latest timestamp when the backup destination details, such as 'spaceUtilized,' are updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAtWhichStorageDetailsAreUpdated")
        private java.util.Date timeAtWhichStorageDetailsAreUpdated;

        /**
         * The latest timestamp when the backup destination details, such as 'spaceUtilized,' are updated.
         * @param timeAtWhichStorageDetailsAreUpdated the value to set
         * @return this builder
         **/
        public Builder timeAtWhichStorageDetailsAreUpdated(
                java.util.Date timeAtWhichStorageDetailsAreUpdated) {
            this.timeAtWhichStorageDetailsAreUpdated = timeAtWhichStorageDetailsAreUpdated;
            this.__explicitlySet__.add("timeAtWhichStorageDetailsAreUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupDestinationProperties build() {
            BackupDestinationProperties model =
                    new BackupDestinationProperties(
                            this.backupDestinationAttachHistory,
                            this.spaceUtilizedInGBs,
                            this.timeAtWhichStorageDetailsAreUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupDestinationProperties model) {
            if (model.wasPropertyExplicitlySet("backupDestinationAttachHistory")) {
                this.backupDestinationAttachHistory(model.getBackupDestinationAttachHistory());
            }
            if (model.wasPropertyExplicitlySet("spaceUtilizedInGBs")) {
                this.spaceUtilizedInGBs(model.getSpaceUtilizedInGBs());
            }
            if (model.wasPropertyExplicitlySet("timeAtWhichStorageDetailsAreUpdated")) {
                this.timeAtWhichStorageDetailsAreUpdated(
                        model.getTimeAtWhichStorageDetailsAreUpdated());
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
     * The timestamps at which this backup destination is used as the preferred destination to host the Autonomous Container Database backups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationAttachHistory")
    private final java.util.List<java.util.Date> backupDestinationAttachHistory;

    /**
     * The timestamps at which this backup destination is used as the preferred destination to host the Autonomous Container Database backups.
     * @return the value
     **/
    public java.util.List<java.util.Date> getBackupDestinationAttachHistory() {
        return backupDestinationAttachHistory;
    }

    /**
     * The total space utilized (in GBs) by this Autonomous Container Database on this backup destination, rounded to the nearest integer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spaceUtilizedInGBs")
    private final Integer spaceUtilizedInGBs;

    /**
     * The total space utilized (in GBs) by this Autonomous Container Database on this backup destination, rounded to the nearest integer.
     * @return the value
     **/
    public Integer getSpaceUtilizedInGBs() {
        return spaceUtilizedInGBs;
    }

    /**
     * The latest timestamp when the backup destination details, such as 'spaceUtilized,' are updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAtWhichStorageDetailsAreUpdated")
    private final java.util.Date timeAtWhichStorageDetailsAreUpdated;

    /**
     * The latest timestamp when the backup destination details, such as 'spaceUtilized,' are updated.
     * @return the value
     **/
    public java.util.Date getTimeAtWhichStorageDetailsAreUpdated() {
        return timeAtWhichStorageDetailsAreUpdated;
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
        sb.append("BackupDestinationProperties(");
        sb.append("super=").append(super.toString());
        sb.append("backupDestinationAttachHistory=")
                .append(String.valueOf(this.backupDestinationAttachHistory));
        sb.append(", spaceUtilizedInGBs=").append(String.valueOf(this.spaceUtilizedInGBs));
        sb.append(", timeAtWhichStorageDetailsAreUpdated=")
                .append(String.valueOf(this.timeAtWhichStorageDetailsAreUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupDestinationProperties)) {
            return false;
        }

        BackupDestinationProperties other = (BackupDestinationProperties) o;
        return java.util.Objects.equals(
                        this.backupDestinationAttachHistory, other.backupDestinationAttachHistory)
                && java.util.Objects.equals(this.spaceUtilizedInGBs, other.spaceUtilizedInGBs)
                && java.util.Objects.equals(
                        this.timeAtWhichStorageDetailsAreUpdated,
                        other.timeAtWhichStorageDetailsAreUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.backupDestinationAttachHistory == null
                                ? 43
                                : this.backupDestinationAttachHistory.hashCode());
        result =
                (result * PRIME)
                        + (this.spaceUtilizedInGBs == null
                                ? 43
                                : this.spaceUtilizedInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAtWhichStorageDetailsAreUpdated == null
                                ? 43
                                : this.timeAtWhichStorageDetailsAreUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
