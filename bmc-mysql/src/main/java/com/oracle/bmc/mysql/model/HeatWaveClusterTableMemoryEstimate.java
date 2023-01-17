/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Estimated memory footprint for a MySQL user table
 * when loaded to the HeatWave cluster memory.
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
    builder = HeatWaveClusterTableMemoryEstimate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HeatWaveClusterTableMemoryEstimate
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tableName",
        "toLoadColumnCount",
        "varlenColumnCount",
        "estimatedRowCount",
        "analyticalFootprintInMbs",
        "errorComment"
    })
    public HeatWaveClusterTableMemoryEstimate(
            String tableName,
            Integer toLoadColumnCount,
            Integer varlenColumnCount,
            Long estimatedRowCount,
            Long analyticalFootprintInMbs,
            String errorComment) {
        super();
        this.tableName = tableName;
        this.toLoadColumnCount = toLoadColumnCount;
        this.varlenColumnCount = varlenColumnCount;
        this.estimatedRowCount = estimatedRowCount;
        this.analyticalFootprintInMbs = analyticalFootprintInMbs;
        this.errorComment = errorComment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The table name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        /**
         * The table name.
         * @param tableName the value to set
         * @return this builder
         **/
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }
        /**
         * The number of columns to be loaded to HeatWave cluster memory.
         * These columns contribute to the analytical memory footprint.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("toLoadColumnCount")
        private Integer toLoadColumnCount;

        /**
         * The number of columns to be loaded to HeatWave cluster memory.
         * These columns contribute to the analytical memory footprint.
         *
         * @param toLoadColumnCount the value to set
         * @return this builder
         **/
        public Builder toLoadColumnCount(Integer toLoadColumnCount) {
            this.toLoadColumnCount = toLoadColumnCount;
            this.__explicitlySet__.add("toLoadColumnCount");
            return this;
        }
        /**
         * The number of variable-length columns to be loaded to HeatWave cluster memory.
         * These columns contribute to the analytical memory footprint.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("varlenColumnCount")
        private Integer varlenColumnCount;

        /**
         * The number of variable-length columns to be loaded to HeatWave cluster memory.
         * These columns contribute to the analytical memory footprint.
         *
         * @param varlenColumnCount the value to set
         * @return this builder
         **/
        public Builder varlenColumnCount(Integer varlenColumnCount) {
            this.varlenColumnCount = varlenColumnCount;
            this.__explicitlySet__.add("varlenColumnCount");
            return this;
        }
        /**
         * The estimated number of rows in the table. This number was used to
         * derive the analytical memory footprint.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCount")
        private Long estimatedRowCount;

        /**
         * The estimated number of rows in the table. This number was used to
         * derive the analytical memory footprint.
         *
         * @param estimatedRowCount the value to set
         * @return this builder
         **/
        public Builder estimatedRowCount(Long estimatedRowCount) {
            this.estimatedRowCount = estimatedRowCount;
            this.__explicitlySet__.add("estimatedRowCount");
            return this;
        }
        /**
         * The estimated memory footprint of the table in MBs when loaded to
         * HeatWave cluster memory (null if the table cannot be loaded to the
         * HeatWave cluster).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("analyticalFootprintInMbs")
        private Long analyticalFootprintInMbs;

        /**
         * The estimated memory footprint of the table in MBs when loaded to
         * HeatWave cluster memory (null if the table cannot be loaded to the
         * HeatWave cluster).
         *
         * @param analyticalFootprintInMbs the value to set
         * @return this builder
         **/
        public Builder analyticalFootprintInMbs(Long analyticalFootprintInMbs) {
            this.analyticalFootprintInMbs = analyticalFootprintInMbs;
            this.__explicitlySet__.add("analyticalFootprintInMbs");
            return this;
        }
        /**
         * Error comment (empty string if no errors occured).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorComment")
        private String errorComment;

        /**
         * Error comment (empty string if no errors occured).
         *
         * @param errorComment the value to set
         * @return this builder
         **/
        public Builder errorComment(String errorComment) {
            this.errorComment = errorComment;
            this.__explicitlySet__.add("errorComment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HeatWaveClusterTableMemoryEstimate build() {
            HeatWaveClusterTableMemoryEstimate model =
                    new HeatWaveClusterTableMemoryEstimate(
                            this.tableName,
                            this.toLoadColumnCount,
                            this.varlenColumnCount,
                            this.estimatedRowCount,
                            this.analyticalFootprintInMbs,
                            this.errorComment);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HeatWaveClusterTableMemoryEstimate model) {
            if (model.wasPropertyExplicitlySet("tableName")) {
                this.tableName(model.getTableName());
            }
            if (model.wasPropertyExplicitlySet("toLoadColumnCount")) {
                this.toLoadColumnCount(model.getToLoadColumnCount());
            }
            if (model.wasPropertyExplicitlySet("varlenColumnCount")) {
                this.varlenColumnCount(model.getVarlenColumnCount());
            }
            if (model.wasPropertyExplicitlySet("estimatedRowCount")) {
                this.estimatedRowCount(model.getEstimatedRowCount());
            }
            if (model.wasPropertyExplicitlySet("analyticalFootprintInMbs")) {
                this.analyticalFootprintInMbs(model.getAnalyticalFootprintInMbs());
            }
            if (model.wasPropertyExplicitlySet("errorComment")) {
                this.errorComment(model.getErrorComment());
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

    /**
     * The table name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

    /**
     * The table name.
     * @return the value
     **/
    public String getTableName() {
        return tableName;
    }

    /**
     * The number of columns to be loaded to HeatWave cluster memory.
     * These columns contribute to the analytical memory footprint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toLoadColumnCount")
    private final Integer toLoadColumnCount;

    /**
     * The number of columns to be loaded to HeatWave cluster memory.
     * These columns contribute to the analytical memory footprint.
     *
     * @return the value
     **/
    public Integer getToLoadColumnCount() {
        return toLoadColumnCount;
    }

    /**
     * The number of variable-length columns to be loaded to HeatWave cluster memory.
     * These columns contribute to the analytical memory footprint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("varlenColumnCount")
    private final Integer varlenColumnCount;

    /**
     * The number of variable-length columns to be loaded to HeatWave cluster memory.
     * These columns contribute to the analytical memory footprint.
     *
     * @return the value
     **/
    public Integer getVarlenColumnCount() {
        return varlenColumnCount;
    }

    /**
     * The estimated number of rows in the table. This number was used to
     * derive the analytical memory footprint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCount")
    private final Long estimatedRowCount;

    /**
     * The estimated number of rows in the table. This number was used to
     * derive the analytical memory footprint.
     *
     * @return the value
     **/
    public Long getEstimatedRowCount() {
        return estimatedRowCount;
    }

    /**
     * The estimated memory footprint of the table in MBs when loaded to
     * HeatWave cluster memory (null if the table cannot be loaded to the
     * HeatWave cluster).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("analyticalFootprintInMbs")
    private final Long analyticalFootprintInMbs;

    /**
     * The estimated memory footprint of the table in MBs when loaded to
     * HeatWave cluster memory (null if the table cannot be loaded to the
     * HeatWave cluster).
     *
     * @return the value
     **/
    public Long getAnalyticalFootprintInMbs() {
        return analyticalFootprintInMbs;
    }

    /**
     * Error comment (empty string if no errors occured).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorComment")
    private final String errorComment;

    /**
     * Error comment (empty string if no errors occured).
     *
     * @return the value
     **/
    public String getErrorComment() {
        return errorComment;
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
        sb.append("HeatWaveClusterTableMemoryEstimate(");
        sb.append("super=").append(super.toString());
        sb.append("tableName=").append(String.valueOf(this.tableName));
        sb.append(", toLoadColumnCount=").append(String.valueOf(this.toLoadColumnCount));
        sb.append(", varlenColumnCount=").append(String.valueOf(this.varlenColumnCount));
        sb.append(", estimatedRowCount=").append(String.valueOf(this.estimatedRowCount));
        sb.append(", analyticalFootprintInMbs=")
                .append(String.valueOf(this.analyticalFootprintInMbs));
        sb.append(", errorComment=").append(String.valueOf(this.errorComment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeatWaveClusterTableMemoryEstimate)) {
            return false;
        }

        HeatWaveClusterTableMemoryEstimate other = (HeatWaveClusterTableMemoryEstimate) o;
        return java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.toLoadColumnCount, other.toLoadColumnCount)
                && java.util.Objects.equals(this.varlenColumnCount, other.varlenColumnCount)
                && java.util.Objects.equals(this.estimatedRowCount, other.estimatedRowCount)
                && java.util.Objects.equals(
                        this.analyticalFootprintInMbs, other.analyticalFootprintInMbs)
                && java.util.Objects.equals(this.errorComment, other.errorComment)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result =
                (result * PRIME)
                        + (this.toLoadColumnCount == null ? 43 : this.toLoadColumnCount.hashCode());
        result =
                (result * PRIME)
                        + (this.varlenColumnCount == null ? 43 : this.varlenColumnCount.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedRowCount == null ? 43 : this.estimatedRowCount.hashCode());
        result =
                (result * PRIME)
                        + (this.analyticalFootprintInMbs == null
                                ? 43
                                : this.analyticalFootprintInMbs.hashCode());
        result = (result * PRIME) + (this.errorComment == null ? 43 : this.errorComment.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
