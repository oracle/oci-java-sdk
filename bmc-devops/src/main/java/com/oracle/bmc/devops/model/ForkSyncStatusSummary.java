/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Object that contains the sync status for a specific branch name. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ForkSyncStatusSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ForkSyncStatusSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"syncStatus", "repositoryId", "branchName"})
    public ForkSyncStatusSummary(SyncStatus syncStatus, String repositoryId, String branchName) {
        super();
        this.syncStatus = syncStatus;
        this.repositoryId = repositoryId;
        this.branchName = branchName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Sync status for the provided branch. */
        @com.fasterxml.jackson.annotation.JsonProperty("syncStatus")
        private SyncStatus syncStatus;

        /**
         * Sync status for the provided branch.
         *
         * @param syncStatus the value to set
         * @return this builder
         */
        public Builder syncStatus(SyncStatus syncStatus) {
            this.syncStatus = syncStatus;
            this.__explicitlySet__.add("syncStatus");
            return this;
        }
        /** The OCID of the child repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        /**
         * The OCID of the child repository.
         *
         * @param repositoryId the value to set
         * @return this builder
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }
        /** The branch in the child repository we are checking the sync status of. */
        @com.fasterxml.jackson.annotation.JsonProperty("branchName")
        private String branchName;

        /**
         * The branch in the child repository we are checking the sync status of.
         *
         * @param branchName the value to set
         * @return this builder
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            this.__explicitlySet__.add("branchName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ForkSyncStatusSummary build() {
            ForkSyncStatusSummary model =
                    new ForkSyncStatusSummary(this.syncStatus, this.repositoryId, this.branchName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ForkSyncStatusSummary model) {
            if (model.wasPropertyExplicitlySet("syncStatus")) {
                this.syncStatus(model.getSyncStatus());
            }
            if (model.wasPropertyExplicitlySet("repositoryId")) {
                this.repositoryId(model.getRepositoryId());
            }
            if (model.wasPropertyExplicitlySet("branchName")) {
                this.branchName(model.getBranchName());
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

    /** Sync status for the provided branch. */
    public enum SyncStatus implements com.oracle.bmc.http.internal.BmcEnum {
        InSync("IN_SYNC"),
        SyncInProgress("SYNC_IN_PROGRESS"),
        OutOfSync("OUT_OF_SYNC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SyncStatus.class);

        private final String value;
        private static java.util.Map<String, SyncStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (SyncStatus v : SyncStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SyncStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SyncStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SyncStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Sync status for the provided branch. */
    @com.fasterxml.jackson.annotation.JsonProperty("syncStatus")
    private final SyncStatus syncStatus;

    /**
     * Sync status for the provided branch.
     *
     * @return the value
     */
    public SyncStatus getSyncStatus() {
        return syncStatus;
    }

    /** The OCID of the child repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    private final String repositoryId;

    /**
     * The OCID of the child repository.
     *
     * @return the value
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /** The branch in the child repository we are checking the sync status of. */
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

    /**
     * The branch in the child repository we are checking the sync status of.
     *
     * @return the value
     */
    public String getBranchName() {
        return branchName;
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
        sb.append("ForkSyncStatusSummary(");
        sb.append("super=").append(super.toString());
        sb.append("syncStatus=").append(String.valueOf(this.syncStatus));
        sb.append(", repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ForkSyncStatusSummary)) {
            return false;
        }

        ForkSyncStatusSummary other = (ForkSyncStatusSummary) o;
        return java.util.Objects.equals(this.syncStatus, other.syncStatus)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.branchName, other.branchName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.syncStatus == null ? 43 : this.syncStatus.hashCode());
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
