/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The IORM configuration settings for the database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbIormConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbIormConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dbName", "share", "flashCacheLimit"})
    public DbIormConfig(String dbName, Integer share, String flashCacheLimit) {
        super();
        this.dbName = dbName;
        this.share = share;
        this.flashCacheLimit = flashCacheLimit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The database name. For the default {@code DbPlan}, the {@code dbName} is {@code default}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * The database name. For the default {@code DbPlan}, the {@code dbName} is {@code default}.
         *
         * @param dbName the value to set
         * @return this builder
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }
        /** The relative priority of this database. */
        @com.fasterxml.jackson.annotation.JsonProperty("share")
        private Integer share;

        /**
         * The relative priority of this database.
         *
         * @param share the value to set
         * @return this builder
         */
        public Builder share(Integer share) {
            this.share = share;
            this.__explicitlySet__.add("share");
            return this;
        }
        /**
         * The flash cache limit for this database. This value is internally configured based on the
         * share value assigned to the database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("flashCacheLimit")
        private String flashCacheLimit;

        /**
         * The flash cache limit for this database. This value is internally configured based on the
         * share value assigned to the database.
         *
         * @param flashCacheLimit the value to set
         * @return this builder
         */
        public Builder flashCacheLimit(String flashCacheLimit) {
            this.flashCacheLimit = flashCacheLimit;
            this.__explicitlySet__.add("flashCacheLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbIormConfig build() {
            DbIormConfig model = new DbIormConfig(this.dbName, this.share, this.flashCacheLimit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbIormConfig model) {
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("share")) {
                this.share(model.getShare());
            }
            if (model.wasPropertyExplicitlySet("flashCacheLimit")) {
                this.flashCacheLimit(model.getFlashCacheLimit());
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

    /** The database name. For the default {@code DbPlan}, the {@code dbName} is {@code default}. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The database name. For the default {@code DbPlan}, the {@code dbName} is {@code default}.
     *
     * @return the value
     */
    public String getDbName() {
        return dbName;
    }

    /** The relative priority of this database. */
    @com.fasterxml.jackson.annotation.JsonProperty("share")
    private final Integer share;

    /**
     * The relative priority of this database.
     *
     * @return the value
     */
    public Integer getShare() {
        return share;
    }

    /**
     * The flash cache limit for this database. This value is internally configured based on the
     * share value assigned to the database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flashCacheLimit")
    private final String flashCacheLimit;

    /**
     * The flash cache limit for this database. This value is internally configured based on the
     * share value assigned to the database.
     *
     * @return the value
     */
    public String getFlashCacheLimit() {
        return flashCacheLimit;
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
        sb.append("DbIormConfig(");
        sb.append("super=").append(super.toString());
        sb.append("dbName=").append(String.valueOf(this.dbName));
        sb.append(", share=").append(String.valueOf(this.share));
        sb.append(", flashCacheLimit=").append(String.valueOf(this.flashCacheLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbIormConfig)) {
            return false;
        }

        DbIormConfig other = (DbIormConfig) o;
        return java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.share, other.share)
                && java.util.Objects.equals(this.flashCacheLimit, other.flashCacheLimit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.share == null ? 43 : this.share.hashCode());
        result =
                (result * PRIME)
                        + (this.flashCacheLimit == null ? 43 : this.flashCacheLimit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
