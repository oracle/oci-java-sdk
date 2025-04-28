/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Information about the database system associated with a backup. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"systemType", "dbVersion", "configId"})
    public DbSystemDetails(DbSystem.SystemType systemType, String dbVersion, String configId) {
        super();
        this.systemType = systemType;
        this.dbVersion = dbVersion;
        this.configId = configId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of the database system. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemType")
        private DbSystem.SystemType systemType;

        /**
         * Type of the database system.
         *
         * @param systemType the value to set
         * @return this builder
         */
        public Builder systemType(DbSystem.SystemType systemType) {
            this.systemType = systemType;
            this.__explicitlySet__.add("systemType");
            return this;
        }
        /** The major and minor versions of the database system software. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * The major and minor versions of the database system software.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /**
         * OCID of the configuration that was applied on the source dbSystem at the time when backup
         * was taken.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configId")
        private String configId;

        /**
         * OCID of the configuration that was applied on the source dbSystem at the time when backup
         * was taken.
         *
         * @param configId the value to set
         * @return this builder
         */
        public Builder configId(String configId) {
            this.configId = configId;
            this.__explicitlySet__.add("configId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemDetails build() {
            DbSystemDetails model =
                    new DbSystemDetails(this.systemType, this.dbVersion, this.configId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("systemType")) {
                this.systemType(model.getSystemType());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("configId")) {
                this.configId(model.getConfigId());
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

    /** Type of the database system. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemType")
    private final DbSystem.SystemType systemType;

    /**
     * Type of the database system.
     *
     * @return the value
     */
    public DbSystem.SystemType getSystemType() {
        return systemType;
    }

    /** The major and minor versions of the database system software. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * The major and minor versions of the database system software.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * OCID of the configuration that was applied on the source dbSystem at the time when backup was
     * taken.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configId")
    private final String configId;

    /**
     * OCID of the configuration that was applied on the source dbSystem at the time when backup was
     * taken.
     *
     * @return the value
     */
    public String getConfigId() {
        return configId;
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
        sb.append("DbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("systemType=").append(String.valueOf(this.systemType));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", configId=").append(String.valueOf(this.configId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemDetails)) {
            return false;
        }

        DbSystemDetails other = (DbSystemDetails) o;
        return java.util.Objects.equals(this.systemType, other.systemType)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.configId, other.configId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.systemType == null ? 43 : this.systemType.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.configId == null ? 43 : this.configId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
