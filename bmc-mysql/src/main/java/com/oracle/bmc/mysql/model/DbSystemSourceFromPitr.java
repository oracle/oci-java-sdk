/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * DB System OCID to perform a point in time recovery to the current point in time.
 * <p>
 * DB System OCID and recovery point to perform a point in time recovery to the
 * specified recovery point.
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
    builder = DbSystemSourceFromPitr.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbSystemSourceFromPitr extends DbSystemSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the DB System from which a backup shall be selected to be
         * restored when creating the new DB System. Use this together with
         * recovery point to perform a point in time recovery operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the DB System from which a backup shall be selected to be
         * restored when creating the new DB System. Use this together with
         * recovery point to perform a point in time recovery operation.
         *
         * @param dbSystemId the value to set
         * @return this builder
         **/
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The date and time, as per RFC 3339, of the change up to which the
         * new DB System shall be restored to, using a backup and logs from the
         * original DB System. In case no point in time is specified, then this
         * new DB System shall be restored up to the latest change recorded for
         * the original DB System.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryPoint")
        private java.util.Date recoveryPoint;

        /**
         * The date and time, as per RFC 3339, of the change up to which the
         * new DB System shall be restored to, using a backup and logs from the
         * original DB System. In case no point in time is specified, then this
         * new DB System shall be restored up to the latest change recorded for
         * the original DB System.
         *
         * @param recoveryPoint the value to set
         * @return this builder
         **/
        public Builder recoveryPoint(java.util.Date recoveryPoint) {
            this.recoveryPoint = recoveryPoint;
            this.__explicitlySet__.add("recoveryPoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemSourceFromPitr build() {
            DbSystemSourceFromPitr __instance__ =
                    new DbSystemSourceFromPitr(dbSystemId, recoveryPoint);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemSourceFromPitr o) {
            Builder copiedBuilder =
                    dbSystemId(o.getDbSystemId()).recoveryPoint(o.getRecoveryPoint());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
    public DbSystemSourceFromPitr(String dbSystemId, java.util.Date recoveryPoint) {
        super();
        this.dbSystemId = dbSystemId;
        this.recoveryPoint = recoveryPoint;
    }

    /**
     * The OCID of the DB System from which a backup shall be selected to be
     * restored when creating the new DB System. Use this together with
     * recovery point to perform a point in time recovery operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the DB System from which a backup shall be selected to be
     * restored when creating the new DB System. Use this together with
     * recovery point to perform a point in time recovery operation.
     *
     * @return the value
     **/
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The date and time, as per RFC 3339, of the change up to which the
     * new DB System shall be restored to, using a backup and logs from the
     * original DB System. In case no point in time is specified, then this
     * new DB System shall be restored up to the latest change recorded for
     * the original DB System.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryPoint")
    private final java.util.Date recoveryPoint;

    /**
     * The date and time, as per RFC 3339, of the change up to which the
     * new DB System shall be restored to, using a backup and logs from the
     * original DB System. In case no point in time is specified, then this
     * new DB System shall be restored up to the latest change recorded for
     * the original DB System.
     *
     * @return the value
     **/
    public java.util.Date getRecoveryPoint() {
        return recoveryPoint;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbSystemSourceFromPitr(");
        sb.append("super=").append(super.toString());
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", recoveryPoint=").append(String.valueOf(this.recoveryPoint));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemSourceFromPitr)) {
            return false;
        }

        DbSystemSourceFromPitr other = (DbSystemSourceFromPitr) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.recoveryPoint, other.recoveryPoint)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryPoint == null ? 43 : this.recoveryPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
