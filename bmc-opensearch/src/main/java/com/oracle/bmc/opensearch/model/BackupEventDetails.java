/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Details about a cluster backup event. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BackupEventDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackupEventDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterId",
        "backupState",
        "snapshotName",
        "timeStarted",
        "timeEnded",
        "backupSize"
    })
    public BackupEventDetails(
            String clusterId,
            BackupState backupState,
            String snapshotName,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Double backupSize) {
        super();
        this.clusterId = clusterId;
        this.backupState = backupState;
        this.snapshotName = snapshotName;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.backupSize = backupSize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the OpenSearch cluster for the cluster backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * The OCID of the OpenSearch cluster for the cluster backup.
         *
         * @param clusterId the value to set
         * @return this builder
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /** The result of the cluster backup operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupState")
        private BackupState backupState;

        /**
         * The result of the cluster backup operation.
         *
         * @param backupState the value to set
         * @return this builder
         */
        public Builder backupState(BackupState backupState) {
            this.backupState = backupState;
            this.__explicitlySet__.add("backupState");
            return this;
        }
        /** The name of the cluster backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotName")
        private String snapshotName;

        /**
         * The name of the cluster backup.
         *
         * @param snapshotName the value to set
         * @return this builder
         */
        public Builder snapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            this.__explicitlySet__.add("snapshotName");
            return this;
        }
        /**
         * The date and time the cluster backup event started. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the cluster backup event started. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the cluster backup event started. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time the cluster backup event started. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** The cluster backup size in GB. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSize")
        private Double backupSize;

        /**
         * The cluster backup size in GB.
         *
         * @param backupSize the value to set
         * @return this builder
         */
        public Builder backupSize(Double backupSize) {
            this.backupSize = backupSize;
            this.__explicitlySet__.add("backupSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupEventDetails build() {
            BackupEventDetails model =
                    new BackupEventDetails(
                            this.clusterId,
                            this.backupState,
                            this.snapshotName,
                            this.timeStarted,
                            this.timeEnded,
                            this.backupSize);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupEventDetails model) {
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            if (model.wasPropertyExplicitlySet("backupState")) {
                this.backupState(model.getBackupState());
            }
            if (model.wasPropertyExplicitlySet("snapshotName")) {
                this.snapshotName(model.getSnapshotName());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("backupSize")) {
                this.backupSize(model.getBackupSize());
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

    /** The OCID of the OpenSearch cluster for the cluster backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * The OCID of the OpenSearch cluster for the cluster backup.
     *
     * @return the value
     */
    public String getClusterId() {
        return clusterId;
    }

    /** The result of the cluster backup operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupState")
    private final BackupState backupState;

    /**
     * The result of the cluster backup operation.
     *
     * @return the value
     */
    public BackupState getBackupState() {
        return backupState;
    }

    /** The name of the cluster backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotName")
    private final String snapshotName;

    /**
     * The name of the cluster backup.
     *
     * @return the value
     */
    public String getSnapshotName() {
        return snapshotName;
    }

    /**
     * The date and time the cluster backup event started. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the cluster backup event started. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the cluster backup event started. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time the cluster backup event started. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** The cluster backup size in GB. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSize")
    private final Double backupSize;

    /**
     * The cluster backup size in GB.
     *
     * @return the value
     */
    public Double getBackupSize() {
        return backupSize;
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
        sb.append("BackupEventDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", backupState=").append(String.valueOf(this.backupState));
        sb.append(", snapshotName=").append(String.valueOf(this.snapshotName));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", backupSize=").append(String.valueOf(this.backupSize));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupEventDetails)) {
            return false;
        }

        BackupEventDetails other = (BackupEventDetails) o;
        return java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.backupState, other.backupState)
                && java.util.Objects.equals(this.snapshotName, other.snapshotName)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.backupSize, other.backupSize)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.backupState == null ? 43 : this.backupState.hashCode());
        result = (result * PRIME) + (this.snapshotName == null ? 43 : this.snapshotName.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.backupSize == null ? 43 : this.backupSize.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
