/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * HeatWave cluster memory estimate that can be used to determine a suitable HeatWave cluster size.
 * For each MySQL user table the estimated memory footprint when the table is loaded to the HeatWave
 * cluster memory is returned. <br>
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
        builder = HeatWaveClusterMemoryEstimate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HeatWaveClusterMemoryEstimate
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dbSystemId",
        "status",
        "timeCreated",
        "timeUpdated",
        "tableSchemas"
    })
    public HeatWaveClusterMemoryEstimate(
            String dbSystemId,
            HeatWaveClusterMemoryEstimateStatus status,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<HeatWaveClusterSchemaMemoryEstimate> tableSchemas) {
        super();
        this.dbSystemId = dbSystemId;
        this.status = status;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.tableSchemas = tableSchemas;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the DB System the HeatWave cluster memory estimate is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the DB System the HeatWave cluster memory estimate is associated with.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /** Current status of the Work Request generating the HeatWave cluster memory estimate. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private HeatWaveClusterMemoryEstimateStatus status;

        /**
         * Current status of the Work Request generating the HeatWave cluster memory estimate.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(HeatWaveClusterMemoryEstimateStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The date and time that the Work Request to generate the HeatWave cluster memory estimate
         * was issued, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc333).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the Work Request to generate the HeatWave cluster memory estimate
         * was issued, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc333).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time that the HeatWave cluster memory estimate was generated, as described
         * by [RFC 3339](https://tools.ietf.org/rfc/rfc333).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time that the HeatWave cluster memory estimate was generated, as described
         * by [RFC 3339](https://tools.ietf.org/rfc/rfc333).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Collection of schemas with estimated memory footprints for MySQL user tables of each
         * schema when loaded to HeatWave cluster memory.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tableSchemas")
        private java.util.List<HeatWaveClusterSchemaMemoryEstimate> tableSchemas;

        /**
         * Collection of schemas with estimated memory footprints for MySQL user tables of each
         * schema when loaded to HeatWave cluster memory.
         *
         * @param tableSchemas the value to set
         * @return this builder
         */
        public Builder tableSchemas(
                java.util.List<HeatWaveClusterSchemaMemoryEstimate> tableSchemas) {
            this.tableSchemas = tableSchemas;
            this.__explicitlySet__.add("tableSchemas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HeatWaveClusterMemoryEstimate build() {
            HeatWaveClusterMemoryEstimate model =
                    new HeatWaveClusterMemoryEstimate(
                            this.dbSystemId,
                            this.status,
                            this.timeCreated,
                            this.timeUpdated,
                            this.tableSchemas);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HeatWaveClusterMemoryEstimate model) {
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("tableSchemas")) {
                this.tableSchemas(model.getTableSchemas());
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

    /** The OCID of the DB System the HeatWave cluster memory estimate is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the DB System the HeatWave cluster memory estimate is associated with.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /** Current status of the Work Request generating the HeatWave cluster memory estimate. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final HeatWaveClusterMemoryEstimateStatus status;

    /**
     * Current status of the Work Request generating the HeatWave cluster memory estimate.
     *
     * @return the value
     */
    public HeatWaveClusterMemoryEstimateStatus getStatus() {
        return status;
    }

    /**
     * The date and time that the Work Request to generate the HeatWave cluster memory estimate was
     * issued, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc333).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the Work Request to generate the HeatWave cluster memory estimate was
     * issued, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc333).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time that the HeatWave cluster memory estimate was generated, as described by
     * [RFC 3339](https://tools.ietf.org/rfc/rfc333).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time that the HeatWave cluster memory estimate was generated, as described by
     * [RFC 3339](https://tools.ietf.org/rfc/rfc333).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Collection of schemas with estimated memory footprints for MySQL user tables of each schema
     * when loaded to HeatWave cluster memory.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tableSchemas")
    private final java.util.List<HeatWaveClusterSchemaMemoryEstimate> tableSchemas;

    /**
     * Collection of schemas with estimated memory footprints for MySQL user tables of each schema
     * when loaded to HeatWave cluster memory.
     *
     * @return the value
     */
    public java.util.List<HeatWaveClusterSchemaMemoryEstimate> getTableSchemas() {
        return tableSchemas;
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
        sb.append("HeatWaveClusterMemoryEstimate(");
        sb.append("super=").append(super.toString());
        sb.append("dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", tableSchemas=").append(String.valueOf(this.tableSchemas));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeatWaveClusterMemoryEstimate)) {
            return false;
        }

        HeatWaveClusterMemoryEstimate other = (HeatWaveClusterMemoryEstimate) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.tableSchemas, other.tableSchemas)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.tableSchemas == null ? 43 : this.tableSchemas.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
