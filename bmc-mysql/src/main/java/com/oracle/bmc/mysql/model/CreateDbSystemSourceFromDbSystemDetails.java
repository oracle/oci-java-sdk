/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The source DB System identifier (OCID) and region from which the new DB system will be cloned by
 * copying its data. Optionally, channel properties can be provided to create a replication channel
 * between the newly created DB system and the source DB system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDbSystemSourceFromDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDbSystemSourceFromDbSystemDetails extends CreateDbSystemSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the DB system to be used as the source for the new DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the DB system to be used as the source for the new DB System.
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
         * The region identifier of the source region where the DB system exists, only if it is in a
         * different region. If the source DB system is in the same region, then no region must be
         * specified. For more information, please see [Regions and Availability
         * Domains](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region identifier of the source region where the DB system exists, only if it is in a
         * different region. If the source DB system is in the same region, then no region must be
         * specified. For more information, please see [Regions and Availability
         * Domains](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("channel")
        private CreateDbSystemSourceFromDbSystemChannelDetails channel;

        public Builder channel(CreateDbSystemSourceFromDbSystemChannelDetails channel) {
            this.channel = channel;
            this.__explicitlySet__.add("channel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDbSystemSourceFromDbSystemDetails build() {
            CreateDbSystemSourceFromDbSystemDetails model =
                    new CreateDbSystemSourceFromDbSystemDetails(
                            this.dbSystemId, this.region, this.channel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDbSystemSourceFromDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("channel")) {
                this.channel(model.getChannel());
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
    public CreateDbSystemSourceFromDbSystemDetails(
            String dbSystemId,
            String region,
            CreateDbSystemSourceFromDbSystemChannelDetails channel) {
        super();
        this.dbSystemId = dbSystemId;
        this.region = region;
        this.channel = channel;
    }

    /** The OCID of the DB system to be used as the source for the new DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the DB system to be used as the source for the new DB System.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The region identifier of the source region where the DB system exists, only if it is in a
     * different region. If the source DB system is in the same region, then no region must be
     * specified. For more information, please see [Regions and Availability
     * Domains](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region identifier of the source region where the DB system exists, only if it is in a
     * different region. If the source DB system is in the same region, then no region must be
     * specified. For more information, please see [Regions and Availability
     * Domains](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("channel")
    private final CreateDbSystemSourceFromDbSystemChannelDetails channel;

    public CreateDbSystemSourceFromDbSystemChannelDetails getChannel() {
        return channel;
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
        sb.append("CreateDbSystemSourceFromDbSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", channel=").append(String.valueOf(this.channel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDbSystemSourceFromDbSystemDetails)) {
            return false;
        }

        CreateDbSystemSourceFromDbSystemDetails other = (CreateDbSystemSourceFromDbSystemDetails) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.channel, other.channel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.channel == null ? 43 : this.channel.hashCode());
        return result;
    }
}
