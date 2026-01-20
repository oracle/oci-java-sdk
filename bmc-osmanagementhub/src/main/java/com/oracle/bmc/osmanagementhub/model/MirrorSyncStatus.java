/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Status summary of the mirror sync. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MirrorSyncStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MirrorSyncStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"unsynced", "queued", "syncing", "synced", "failed"})
    public MirrorSyncStatus(
            Integer unsynced, Integer queued, Integer syncing, Integer synced, Integer failed) {
        super();
        this.unsynced = unsynced;
        this.queued = queued;
        this.syncing = syncing;
        this.synced = synced;
        this.failed = failed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of software sources that have not yet been synced. */
        @com.fasterxml.jackson.annotation.JsonProperty("unsynced")
        private Integer unsynced;

        /**
         * Total number of software sources that have not yet been synced.
         *
         * @param unsynced the value to set
         * @return this builder
         */
        public Builder unsynced(Integer unsynced) {
            this.unsynced = unsynced;
            this.__explicitlySet__.add("unsynced");
            return this;
        }
        /** Total number of software sources that are queued for sync. */
        @com.fasterxml.jackson.annotation.JsonProperty("queued")
        private Integer queued;

        /**
         * Total number of software sources that are queued for sync.
         *
         * @param queued the value to set
         * @return this builder
         */
        public Builder queued(Integer queued) {
            this.queued = queued;
            this.__explicitlySet__.add("queued");
            return this;
        }
        /** Total number of software sources currently syncing. */
        @com.fasterxml.jackson.annotation.JsonProperty("syncing")
        private Integer syncing;

        /**
         * Total number of software sources currently syncing.
         *
         * @param syncing the value to set
         * @return this builder
         */
        public Builder syncing(Integer syncing) {
            this.syncing = syncing;
            this.__explicitlySet__.add("syncing");
            return this;
        }
        /** Total number of software sources that successfully synced. */
        @com.fasterxml.jackson.annotation.JsonProperty("synced")
        private Integer synced;

        /**
         * Total number of software sources that successfully synced.
         *
         * @param synced the value to set
         * @return this builder
         */
        public Builder synced(Integer synced) {
            this.synced = synced;
            this.__explicitlySet__.add("synced");
            return this;
        }
        /** Total number of software sources that failed to sync. */
        @com.fasterxml.jackson.annotation.JsonProperty("failed")
        private Integer failed;

        /**
         * Total number of software sources that failed to sync.
         *
         * @param failed the value to set
         * @return this builder
         */
        public Builder failed(Integer failed) {
            this.failed = failed;
            this.__explicitlySet__.add("failed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MirrorSyncStatus build() {
            MirrorSyncStatus model =
                    new MirrorSyncStatus(
                            this.unsynced, this.queued, this.syncing, this.synced, this.failed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MirrorSyncStatus model) {
            if (model.wasPropertyExplicitlySet("unsynced")) {
                this.unsynced(model.getUnsynced());
            }
            if (model.wasPropertyExplicitlySet("queued")) {
                this.queued(model.getQueued());
            }
            if (model.wasPropertyExplicitlySet("syncing")) {
                this.syncing(model.getSyncing());
            }
            if (model.wasPropertyExplicitlySet("synced")) {
                this.synced(model.getSynced());
            }
            if (model.wasPropertyExplicitlySet("failed")) {
                this.failed(model.getFailed());
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

    /** Total number of software sources that have not yet been synced. */
    @com.fasterxml.jackson.annotation.JsonProperty("unsynced")
    private final Integer unsynced;

    /**
     * Total number of software sources that have not yet been synced.
     *
     * @return the value
     */
    public Integer getUnsynced() {
        return unsynced;
    }

    /** Total number of software sources that are queued for sync. */
    @com.fasterxml.jackson.annotation.JsonProperty("queued")
    private final Integer queued;

    /**
     * Total number of software sources that are queued for sync.
     *
     * @return the value
     */
    public Integer getQueued() {
        return queued;
    }

    /** Total number of software sources currently syncing. */
    @com.fasterxml.jackson.annotation.JsonProperty("syncing")
    private final Integer syncing;

    /**
     * Total number of software sources currently syncing.
     *
     * @return the value
     */
    public Integer getSyncing() {
        return syncing;
    }

    /** Total number of software sources that successfully synced. */
    @com.fasterxml.jackson.annotation.JsonProperty("synced")
    private final Integer synced;

    /**
     * Total number of software sources that successfully synced.
     *
     * @return the value
     */
    public Integer getSynced() {
        return synced;
    }

    /** Total number of software sources that failed to sync. */
    @com.fasterxml.jackson.annotation.JsonProperty("failed")
    private final Integer failed;

    /**
     * Total number of software sources that failed to sync.
     *
     * @return the value
     */
    public Integer getFailed() {
        return failed;
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
        sb.append("MirrorSyncStatus(");
        sb.append("super=").append(super.toString());
        sb.append("unsynced=").append(String.valueOf(this.unsynced));
        sb.append(", queued=").append(String.valueOf(this.queued));
        sb.append(", syncing=").append(String.valueOf(this.syncing));
        sb.append(", synced=").append(String.valueOf(this.synced));
        sb.append(", failed=").append(String.valueOf(this.failed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MirrorSyncStatus)) {
            return false;
        }

        MirrorSyncStatus other = (MirrorSyncStatus) o;
        return java.util.Objects.equals(this.unsynced, other.unsynced)
                && java.util.Objects.equals(this.queued, other.queued)
                && java.util.Objects.equals(this.syncing, other.syncing)
                && java.util.Objects.equals(this.synced, other.synced)
                && java.util.Objects.equals(this.failed, other.failed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.unsynced == null ? 43 : this.unsynced.hashCode());
        result = (result * PRIME) + (this.queued == null ? 43 : this.queued.hashCode());
        result = (result * PRIME) + (this.syncing == null ? 43 : this.syncing.hashCode());
        result = (result * PRIME) + (this.synced == null ? 43 : this.synced.hashCode());
        result = (result * PRIME) + (this.failed == null ? 43 : this.failed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
