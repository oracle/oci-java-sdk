/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Database system failover information. <br>
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
        builder = FailoverDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FailoverDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ad", "dbInstanceId"})
    public FailoverDbSystemDetails(String ad, String dbInstanceId) {
        super();
        this.ad = ad;
        this.dbInstanceId = dbInstanceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The preferred AD for regions with three availability domains. This parameter is optional.
         * If not set, the AD will be chosen based on availability.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ad")
        private String ad;

        /**
         * The preferred AD for regions with three availability domains. This parameter is optional.
         * If not set, the AD will be chosen based on availability.
         *
         * @param ad the value to set
         * @return this builder
         */
        public Builder ad(String ad) {
            this.ad = ad;
            this.__explicitlySet__.add("ad");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * database instance node. This parameter is optional. If not set, an existing database
         * instance node will be chosen based on availability.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbInstanceId")
        private String dbInstanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * database instance node. This parameter is optional. If not set, an existing database
         * instance node will be chosen based on availability.
         *
         * @param dbInstanceId the value to set
         * @return this builder
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            this.__explicitlySet__.add("dbInstanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FailoverDbSystemDetails build() {
            FailoverDbSystemDetails model = new FailoverDbSystemDetails(this.ad, this.dbInstanceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FailoverDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("ad")) {
                this.ad(model.getAd());
            }
            if (model.wasPropertyExplicitlySet("dbInstanceId")) {
                this.dbInstanceId(model.getDbInstanceId());
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
     * The preferred AD for regions with three availability domains. This parameter is optional. If
     * not set, the AD will be chosen based on availability.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ad")
    private final String ad;

    /**
     * The preferred AD for regions with three availability domains. This parameter is optional. If
     * not set, the AD will be chosen based on availability.
     *
     * @return the value
     */
    public String getAd() {
        return ad;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * database instance node. This parameter is optional. If not set, an existing database instance
     * node will be chosen based on availability.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbInstanceId")
    private final String dbInstanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * database instance node. This parameter is optional. If not set, an existing database instance
     * node will be chosen based on availability.
     *
     * @return the value
     */
    public String getDbInstanceId() {
        return dbInstanceId;
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
        sb.append("FailoverDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ad=").append(String.valueOf(this.ad));
        sb.append(", dbInstanceId=").append(String.valueOf(this.dbInstanceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FailoverDbSystemDetails)) {
            return false;
        }

        FailoverDbSystemDetails other = (FailoverDbSystemDetails) o;
        return java.util.Objects.equals(this.ad, other.ad)
                && java.util.Objects.equals(this.dbInstanceId, other.dbInstanceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ad == null ? 43 : this.ad.hashCode());
        result = (result * PRIME) + (this.dbInstanceId == null ? 43 : this.dbInstanceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
