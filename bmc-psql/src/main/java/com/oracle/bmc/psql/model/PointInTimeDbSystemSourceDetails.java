/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Details of database system point-in-time recovery. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PointInTimeDbSystemSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PointInTimeDbSystemSourceDetails extends SourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * source database system which will be used to perform point-in-time recovery.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * source database system which will be used to perform point-in-time recovery.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The target point-in-time of the source database system that will be restored, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Point-in-time recovery can only performed in granularity of seconds. Example: {@code
         * 2016-08-25T21:10:29Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeToRestore")
        private java.util.Date timeToRestore;

        /**
         * The target point-in-time of the source database system that will be restored, expressed
         * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Point-in-time recovery can only performed in granularity of seconds. Example: {@code
         * 2016-08-25T21:10:29Z}
         *
         * @param timeToRestore the value to set
         * @return this builder
         */
        public Builder timeToRestore(java.util.Date timeToRestore) {
            this.timeToRestore = timeToRestore;
            this.__explicitlySet__.add("timeToRestore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PointInTimeDbSystemSourceDetails build() {
            PointInTimeDbSystemSourceDetails model =
                    new PointInTimeDbSystemSourceDetails(this.dbSystemId, this.timeToRestore);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PointInTimeDbSystemSourceDetails model) {
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("timeToRestore")) {
                this.timeToRestore(model.getTimeToRestore());
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

    @Deprecated
    public PointInTimeDbSystemSourceDetails(String dbSystemId, java.util.Date timeToRestore) {
        super();
        this.dbSystemId = dbSystemId;
        this.timeToRestore = timeToRestore;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * source database system which will be used to perform point-in-time recovery.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * source database system which will be used to perform point-in-time recovery.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The target point-in-time of the source database system that will be restored, expressed in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Point-in-time recovery can only performed in granularity of seconds. Example: {@code
     * 2016-08-25T21:10:29Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeToRestore")
    private final java.util.Date timeToRestore;

    /**
     * The target point-in-time of the source database system that will be restored, expressed in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Point-in-time recovery can only performed in granularity of seconds. Example: {@code
     * 2016-08-25T21:10:29Z}
     *
     * @return the value
     */
    public java.util.Date getTimeToRestore() {
        return timeToRestore;
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
        sb.append("PointInTimeDbSystemSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", timeToRestore=").append(String.valueOf(this.timeToRestore));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PointInTimeDbSystemSourceDetails)) {
            return false;
        }

        PointInTimeDbSystemSourceDetails other = (PointInTimeDbSystemSourceDetails) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.timeToRestore, other.timeToRestore)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeToRestore == null ? 43 : this.timeToRestore.hashCode());
        return result;
    }
}
