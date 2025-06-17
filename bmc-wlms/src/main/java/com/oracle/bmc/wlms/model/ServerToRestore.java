/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The object containing server to restore and the backups to be used to restore. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ServerToRestore.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ServerToRestore
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serverId", "backups"})
    public ServerToRestore(String serverId, java.util.List<BackupToRestore> backups) {
        super();
        this.serverId = serverId;
        this.backups = backups;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier of the server for which backup needs to be restored.
         *
         * <p>*Note:** Not an
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serverId")
        private String serverId;

        /**
         * The unique identifier of the server for which backup needs to be restored.
         *
         * <p>*Note:** Not an
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param serverId the value to set
         * @return this builder
         */
        public Builder serverId(String serverId) {
            this.serverId = serverId;
            this.__explicitlySet__.add("serverId");
            return this;
        }
        /**
         * The list of backup unique identifiers to be used to restore.
         *
         * <p>*Note:** Not
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backups")
        private java.util.List<BackupToRestore> backups;

        /**
         * The list of backup unique identifiers to be used to restore.
         *
         * <p>*Note:** Not
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param backups the value to set
         * @return this builder
         */
        public Builder backups(java.util.List<BackupToRestore> backups) {
            this.backups = backups;
            this.__explicitlySet__.add("backups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServerToRestore build() {
            ServerToRestore model = new ServerToRestore(this.serverId, this.backups);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServerToRestore model) {
            if (model.wasPropertyExplicitlySet("serverId")) {
                this.serverId(model.getServerId());
            }
            if (model.wasPropertyExplicitlySet("backups")) {
                this.backups(model.getBackups());
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

    /**
     * The unique identifier of the server for which backup needs to be restored.
     *
     * <p>*Note:** Not an
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverId")
    private final String serverId;

    /**
     * The unique identifier of the server for which backup needs to be restored.
     *
     * <p>*Note:** Not an
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * The list of backup unique identifiers to be used to restore.
     *
     * <p>*Note:** Not
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backups")
    private final java.util.List<BackupToRestore> backups;

    /**
     * The list of backup unique identifiers to be used to restore.
     *
     * <p>*Note:** Not
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public java.util.List<BackupToRestore> getBackups() {
        return backups;
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
        sb.append("ServerToRestore(");
        sb.append("super=").append(super.toString());
        sb.append("serverId=").append(String.valueOf(this.serverId));
        sb.append(", backups=").append(String.valueOf(this.backups));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServerToRestore)) {
            return false;
        }

        ServerToRestore other = (ServerToRestore) o;
        return java.util.Objects.equals(this.serverId, other.serverId)
                && java.util.Objects.equals(this.backups, other.backups)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.serverId == null ? 43 : this.serverId.hashCode());
        result = (result * PRIME) + (this.backups == null ? 43 : this.backups.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
