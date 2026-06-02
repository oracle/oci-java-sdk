/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The source DB system identifier (OCID) from which the cloned DB system was created.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DbSystemSourceFromDbSystem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbSystemSourceFromDbSystem extends DbSystemSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the DB system used as the source for the new DB system.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the DB system used as the source for the new DB system.
         *
         * @param dbSystemId the value to set
         * @return this builder
         **/
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemSourceFromDbSystem build() {
            DbSystemSourceFromDbSystem model = new DbSystemSourceFromDbSystem(this.dbSystemId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemSourceFromDbSystem model) {
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
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
    public DbSystemSourceFromDbSystem(String dbSystemId) {
        super();
        this.dbSystemId = dbSystemId;
    }

    /**
     * The OCID of the DB system used as the source for the new DB system.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the DB system used as the source for the new DB system.
     *
     * @return the value
     **/
    public String getDbSystemId() {
        return dbSystemId;
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
        sb.append("DbSystemSourceFromDbSystem(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemSourceFromDbSystem)) {
            return false;
        }

        DbSystemSourceFromDbSystem other = (DbSystemSourceFromDbSystem) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        return result;
    }
}
