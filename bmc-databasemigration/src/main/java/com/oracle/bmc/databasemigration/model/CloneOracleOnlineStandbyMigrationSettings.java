/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Clone settings for an online standby Oracle migration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CloneOracleOnlineStandbyMigrationSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "migrationMethod"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloneOracleOnlineStandbyMigrationSettings extends CloneOracleMigrationSettings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource being referenced.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
        private String sourceContainerDatabaseConnectionId;

        /**
         * The OCID of the resource being referenced.
         * @param sourceContainerDatabaseConnectionId the value to set
         * @return this builder
         **/
        public Builder sourceContainerDatabaseConnectionId(
                String sourceContainerDatabaseConnectionId) {
            this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
            this.__explicitlySet__.add("sourceContainerDatabaseConnectionId");
            return this;
        }
        /**
         * The OCID of the resource being referenced.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceStandbyDatabaseConnectionId")
        private String sourceStandbyDatabaseConnectionId;

        /**
         * The OCID of the resource being referenced.
         * @param sourceStandbyDatabaseConnectionId the value to set
         * @return this builder
         **/
        public Builder sourceStandbyDatabaseConnectionId(String sourceStandbyDatabaseConnectionId) {
            this.sourceStandbyDatabaseConnectionId = sourceStandbyDatabaseConnectionId;
            this.__explicitlySet__.add("sourceStandbyDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloneOracleOnlineStandbyMigrationSettings build() {
            CloneOracleOnlineStandbyMigrationSettings model =
                    new CloneOracleOnlineStandbyMigrationSettings(
                            this.sourceContainerDatabaseConnectionId,
                            this.sourceStandbyDatabaseConnectionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloneOracleOnlineStandbyMigrationSettings model) {
            if (model.wasPropertyExplicitlySet("sourceContainerDatabaseConnectionId")) {
                this.sourceContainerDatabaseConnectionId(
                        model.getSourceContainerDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("sourceStandbyDatabaseConnectionId")) {
                this.sourceStandbyDatabaseConnectionId(
                        model.getSourceStandbyDatabaseConnectionId());
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

    @Deprecated
    public CloneOracleOnlineStandbyMigrationSettings(
            String sourceContainerDatabaseConnectionId, String sourceStandbyDatabaseConnectionId) {
        super();
        this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
        this.sourceStandbyDatabaseConnectionId = sourceStandbyDatabaseConnectionId;
    }

    /**
     * The OCID of the resource being referenced.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
    private final String sourceContainerDatabaseConnectionId;

    /**
     * The OCID of the resource being referenced.
     * @return the value
     **/
    public String getSourceContainerDatabaseConnectionId() {
        return sourceContainerDatabaseConnectionId;
    }

    /**
     * The OCID of the resource being referenced.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceStandbyDatabaseConnectionId")
    private final String sourceStandbyDatabaseConnectionId;

    /**
     * The OCID of the resource being referenced.
     * @return the value
     **/
    public String getSourceStandbyDatabaseConnectionId() {
        return sourceStandbyDatabaseConnectionId;
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
        sb.append("CloneOracleOnlineStandbyMigrationSettings(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourceContainerDatabaseConnectionId=")
                .append(String.valueOf(this.sourceContainerDatabaseConnectionId));
        sb.append(", sourceStandbyDatabaseConnectionId=")
                .append(String.valueOf(this.sourceStandbyDatabaseConnectionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloneOracleOnlineStandbyMigrationSettings)) {
            return false;
        }

        CloneOracleOnlineStandbyMigrationSettings other =
                (CloneOracleOnlineStandbyMigrationSettings) o;
        return java.util.Objects.equals(
                        this.sourceContainerDatabaseConnectionId,
                        other.sourceContainerDatabaseConnectionId)
                && java.util.Objects.equals(
                        this.sourceStandbyDatabaseConnectionId,
                        other.sourceStandbyDatabaseConnectionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sourceContainerDatabaseConnectionId == null
                                ? 43
                                : this.sourceContainerDatabaseConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceStandbyDatabaseConnectionId == null
                                ? 43
                                : this.sourceStandbyDatabaseConnectionId.hashCode());
        return result;
    }
}
