/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional parameters for Data Pump Export and Import. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataPumpParameters.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataPumpParameters
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isCluster",
        "estimate",
        "tableExistsAction",
        "excludeParameters",
        "importParallelismDegree",
        "exportParallelismDegree"
    })
    public DataPumpParameters(
            Boolean isCluster,
            DataPumpEstimate estimate,
            DataPumpTableExistsAction tableExistsAction,
            java.util.List<DataPumpExcludeParameters> excludeParameters,
            Integer importParallelismDegree,
            Integer exportParallelismDegree) {
        super();
        this.isCluster = isCluster;
        this.estimate = estimate;
        this.tableExistsAction = tableExistsAction;
        this.excludeParameters = excludeParameters;
        this.importParallelismDegree = importParallelismDegree;
        this.exportParallelismDegree = exportParallelismDegree;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Set to false to force Data Pump worker process to run on one instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
        private Boolean isCluster;

        /**
         * Set to false to force Data Pump worker process to run on one instance.
         *
         * @param isCluster the value to set
         * @return this builder
         */
        public Builder isCluster(Boolean isCluster) {
            this.isCluster = isCluster;
            this.__explicitlySet__.add("isCluster");
            return this;
        }
        /** Estimate size of dumps that will be generated. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimate")
        private DataPumpEstimate estimate;

        /**
         * Estimate size of dumps that will be generated.
         *
         * @param estimate the value to set
         * @return this builder
         */
        public Builder estimate(DataPumpEstimate estimate) {
            this.estimate = estimate;
            this.__explicitlySet__.add("estimate");
            return this;
        }
        /**
         * IMPORT: Specifies the action to be performed when data is loaded into a preexisting
         * table.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tableExistsAction")
        private DataPumpTableExistsAction tableExistsAction;

        /**
         * IMPORT: Specifies the action to be performed when data is loaded into a preexisting
         * table.
         *
         * @param tableExistsAction the value to set
         * @return this builder
         */
        public Builder tableExistsAction(DataPumpTableExistsAction tableExistsAction) {
            this.tableExistsAction = tableExistsAction;
            this.__explicitlySet__.add("tableExistsAction");
            return this;
        }
        /** Exclude paratemers for Export and Import. */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeParameters")
        private java.util.List<DataPumpExcludeParameters> excludeParameters;

        /**
         * Exclude paratemers for Export and Import.
         *
         * @param excludeParameters the value to set
         * @return this builder
         */
        public Builder excludeParameters(
                java.util.List<DataPumpExcludeParameters> excludeParameters) {
            this.excludeParameters = excludeParameters;
            this.__explicitlySet__.add("excludeParameters");
            return this;
        }
        /**
         * Maximum number of worker processes that can be used for a Data Pump Import job. For an
         * Autonomous Database, ODMS will automatically query its CPU core count and set this
         * property.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("importParallelismDegree")
        private Integer importParallelismDegree;

        /**
         * Maximum number of worker processes that can be used for a Data Pump Import job. For an
         * Autonomous Database, ODMS will automatically query its CPU core count and set this
         * property.
         *
         * @param importParallelismDegree the value to set
         * @return this builder
         */
        public Builder importParallelismDegree(Integer importParallelismDegree) {
            this.importParallelismDegree = importParallelismDegree;
            this.__explicitlySet__.add("importParallelismDegree");
            return this;
        }
        /** Maximum number of worker processes that can be used for a Data Pump Export job. */
        @com.fasterxml.jackson.annotation.JsonProperty("exportParallelismDegree")
        private Integer exportParallelismDegree;

        /**
         * Maximum number of worker processes that can be used for a Data Pump Export job.
         *
         * @param exportParallelismDegree the value to set
         * @return this builder
         */
        public Builder exportParallelismDegree(Integer exportParallelismDegree) {
            this.exportParallelismDegree = exportParallelismDegree;
            this.__explicitlySet__.add("exportParallelismDegree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataPumpParameters build() {
            DataPumpParameters model =
                    new DataPumpParameters(
                            this.isCluster,
                            this.estimate,
                            this.tableExistsAction,
                            this.excludeParameters,
                            this.importParallelismDegree,
                            this.exportParallelismDegree);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataPumpParameters model) {
            if (model.wasPropertyExplicitlySet("isCluster")) {
                this.isCluster(model.getIsCluster());
            }
            if (model.wasPropertyExplicitlySet("estimate")) {
                this.estimate(model.getEstimate());
            }
            if (model.wasPropertyExplicitlySet("tableExistsAction")) {
                this.tableExistsAction(model.getTableExistsAction());
            }
            if (model.wasPropertyExplicitlySet("excludeParameters")) {
                this.excludeParameters(model.getExcludeParameters());
            }
            if (model.wasPropertyExplicitlySet("importParallelismDegree")) {
                this.importParallelismDegree(model.getImportParallelismDegree());
            }
            if (model.wasPropertyExplicitlySet("exportParallelismDegree")) {
                this.exportParallelismDegree(model.getExportParallelismDegree());
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

    /** Set to false to force Data Pump worker process to run on one instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
    private final Boolean isCluster;

    /**
     * Set to false to force Data Pump worker process to run on one instance.
     *
     * @return the value
     */
    public Boolean getIsCluster() {
        return isCluster;
    }

    /** Estimate size of dumps that will be generated. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimate")
    private final DataPumpEstimate estimate;

    /**
     * Estimate size of dumps that will be generated.
     *
     * @return the value
     */
    public DataPumpEstimate getEstimate() {
        return estimate;
    }

    /**
     * IMPORT: Specifies the action to be performed when data is loaded into a preexisting table.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tableExistsAction")
    private final DataPumpTableExistsAction tableExistsAction;

    /**
     * IMPORT: Specifies the action to be performed when data is loaded into a preexisting table.
     *
     * @return the value
     */
    public DataPumpTableExistsAction getTableExistsAction() {
        return tableExistsAction;
    }

    /** Exclude paratemers for Export and Import. */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeParameters")
    private final java.util.List<DataPumpExcludeParameters> excludeParameters;

    /**
     * Exclude paratemers for Export and Import.
     *
     * @return the value
     */
    public java.util.List<DataPumpExcludeParameters> getExcludeParameters() {
        return excludeParameters;
    }

    /**
     * Maximum number of worker processes that can be used for a Data Pump Import job. For an
     * Autonomous Database, ODMS will automatically query its CPU core count and set this property.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("importParallelismDegree")
    private final Integer importParallelismDegree;

    /**
     * Maximum number of worker processes that can be used for a Data Pump Import job. For an
     * Autonomous Database, ODMS will automatically query its CPU core count and set this property.
     *
     * @return the value
     */
    public Integer getImportParallelismDegree() {
        return importParallelismDegree;
    }

    /** Maximum number of worker processes that can be used for a Data Pump Export job. */
    @com.fasterxml.jackson.annotation.JsonProperty("exportParallelismDegree")
    private final Integer exportParallelismDegree;

    /**
     * Maximum number of worker processes that can be used for a Data Pump Export job.
     *
     * @return the value
     */
    public Integer getExportParallelismDegree() {
        return exportParallelismDegree;
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
        sb.append("DataPumpParameters(");
        sb.append("super=").append(super.toString());
        sb.append("isCluster=").append(String.valueOf(this.isCluster));
        sb.append(", estimate=").append(String.valueOf(this.estimate));
        sb.append(", tableExistsAction=").append(String.valueOf(this.tableExistsAction));
        sb.append(", excludeParameters=").append(String.valueOf(this.excludeParameters));
        sb.append(", importParallelismDegree=")
                .append(String.valueOf(this.importParallelismDegree));
        sb.append(", exportParallelismDegree=")
                .append(String.valueOf(this.exportParallelismDegree));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataPumpParameters)) {
            return false;
        }

        DataPumpParameters other = (DataPumpParameters) o;
        return java.util.Objects.equals(this.isCluster, other.isCluster)
                && java.util.Objects.equals(this.estimate, other.estimate)
                && java.util.Objects.equals(this.tableExistsAction, other.tableExistsAction)
                && java.util.Objects.equals(this.excludeParameters, other.excludeParameters)
                && java.util.Objects.equals(
                        this.importParallelismDegree, other.importParallelismDegree)
                && java.util.Objects.equals(
                        this.exportParallelismDegree, other.exportParallelismDegree)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isCluster == null ? 43 : this.isCluster.hashCode());
        result = (result * PRIME) + (this.estimate == null ? 43 : this.estimate.hashCode());
        result =
                (result * PRIME)
                        + (this.tableExistsAction == null ? 43 : this.tableExistsAction.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeParameters == null ? 43 : this.excludeParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.importParallelismDegree == null
                                ? 43
                                : this.importParallelismDegree.hashCode());
        result =
                (result * PRIME)
                        + (this.exportParallelismDegree == null
                                ? 43
                                : this.exportParallelismDegree.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
