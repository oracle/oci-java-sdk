/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Specifications for the new replica <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateReplicaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateReplicaDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "region", "maxReadUnits", "maxWriteUnits"})
    public CreateReplicaDetails(
            String compartmentId, String region, Integer maxReadUnits, Integer maxWriteUnits) {
        super();
        this.compartmentId = compartmentId;
        this.region = region;
        this.maxReadUnits = maxReadUnits;
        this.maxWriteUnits = maxWriteUnits;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the table's compartment. Required if the tableNameOrId path parameter is a
         * table name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and
         * compartmentId is supplied, the latter must match the identified table's compartmentId.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the table's compartment. Required if the tableNameOrId path parameter is a
         * table name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and
         * compartmentId is supplied, the latter must match the identified table's compartmentId.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Name of the remote region in standard OCI format, i.e. us-ashburn-1 */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Name of the remote region in standard OCI format, i.e. us-ashburn-1
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * Maximum sustained read throughput limit for the new replica table. If not specified, the
         * local table's read limit is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxReadUnits")
        private Integer maxReadUnits;

        /**
         * Maximum sustained read throughput limit for the new replica table. If not specified, the
         * local table's read limit is used.
         *
         * @param maxReadUnits the value to set
         * @return this builder
         */
        public Builder maxReadUnits(Integer maxReadUnits) {
            this.maxReadUnits = maxReadUnits;
            this.__explicitlySet__.add("maxReadUnits");
            return this;
        }
        /**
         * Maximum sustained write throughput limit for the new replica table. If not specified, the
         * local table's write limit is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxWriteUnits")
        private Integer maxWriteUnits;

        /**
         * Maximum sustained write throughput limit for the new replica table. If not specified, the
         * local table's write limit is used.
         *
         * @param maxWriteUnits the value to set
         * @return this builder
         */
        public Builder maxWriteUnits(Integer maxWriteUnits) {
            this.maxWriteUnits = maxWriteUnits;
            this.__explicitlySet__.add("maxWriteUnits");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateReplicaDetails build() {
            CreateReplicaDetails model =
                    new CreateReplicaDetails(
                            this.compartmentId, this.region, this.maxReadUnits, this.maxWriteUnits);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateReplicaDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("maxReadUnits")) {
                this.maxReadUnits(model.getMaxReadUnits());
            }
            if (model.wasPropertyExplicitlySet("maxWriteUnits")) {
                this.maxWriteUnits(model.getMaxWriteUnits());
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
     * The OCID of the table's compartment. Required if the tableNameOrId path parameter is a table
     * name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and compartmentId is
     * supplied, the latter must match the identified table's compartmentId.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the table's compartment. Required if the tableNameOrId path parameter is a table
     * name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and compartmentId is
     * supplied, the latter must match the identified table's compartmentId.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Name of the remote region in standard OCI format, i.e. us-ashburn-1 */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Name of the remote region in standard OCI format, i.e. us-ashburn-1
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * Maximum sustained read throughput limit for the new replica table. If not specified, the
     * local table's read limit is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxReadUnits")
    private final Integer maxReadUnits;

    /**
     * Maximum sustained read throughput limit for the new replica table. If not specified, the
     * local table's read limit is used.
     *
     * @return the value
     */
    public Integer getMaxReadUnits() {
        return maxReadUnits;
    }

    /**
     * Maximum sustained write throughput limit for the new replica table. If not specified, the
     * local table's write limit is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxWriteUnits")
    private final Integer maxWriteUnits;

    /**
     * Maximum sustained write throughput limit for the new replica table. If not specified, the
     * local table's write limit is used.
     *
     * @return the value
     */
    public Integer getMaxWriteUnits() {
        return maxWriteUnits;
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
        sb.append("CreateReplicaDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", maxReadUnits=").append(String.valueOf(this.maxReadUnits));
        sb.append(", maxWriteUnits=").append(String.valueOf(this.maxWriteUnits));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateReplicaDetails)) {
            return false;
        }

        CreateReplicaDetails other = (CreateReplicaDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.maxReadUnits, other.maxReadUnits)
                && java.util.Objects.equals(this.maxWriteUnits, other.maxWriteUnits)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.maxReadUnits == null ? 43 : this.maxReadUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.maxWriteUnits == null ? 43 : this.maxWriteUnits.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
