/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * The information about all updatable parameters of a SQL Endpoint.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateSqlEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateSqlEndpointDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "freeformTags",
        "displayName",
        "description",
        "driverShape",
        "driverShapeConfig",
        "executorShape",
        "executorShapeConfig",
        "minExecutorCount",
        "maxExecutorCount",
        "metastoreId",
        "lakeId",
        "sparkAdvancedConfigurations"
    })
    public UpdateSqlEndpointDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            String displayName,
            String description,
            String driverShape,
            ShapeConfig driverShapeConfig,
            String executorShape,
            ShapeConfig executorShapeConfig,
            Integer minExecutorCount,
            Integer maxExecutorCount,
            String metastoreId,
            String lakeId,
            java.util.Map<String, String> sparkAdvancedConfigurations) {
        super();
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.displayName = displayName;
        this.description = description;
        this.driverShape = driverShape;
        this.driverShapeConfig = driverShapeConfig;
        this.executorShape = executorShape;
        this.executorShapeConfig = executorShapeConfig;
        this.minExecutorCount = minExecutorCount;
        this.maxExecutorCount = maxExecutorCount;
        this.metastoreId = metastoreId;
        this.lakeId = lakeId;
        this.sparkAdvancedConfigurations = sparkAdvancedConfigurations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The SQL Endpoint name, which can be changed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The SQL Endpoint name, which can be changed.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The description of CreateSQLEndpointDetails.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of CreateSQLEndpointDetails.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The shape of the SQL Endpoint driver instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
        private String driverShape;

        /**
         * The shape of the SQL Endpoint driver instance.
         * @param driverShape the value to set
         * @return this builder
         **/
        public Builder driverShape(String driverShape) {
            this.driverShape = driverShape;
            this.__explicitlySet__.add("driverShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfig")
        private ShapeConfig driverShapeConfig;

        public Builder driverShapeConfig(ShapeConfig driverShapeConfig) {
            this.driverShapeConfig = driverShapeConfig;
            this.__explicitlySet__.add("driverShapeConfig");
            return this;
        }
        /**
         * The shape of the SQL Endpoint worker instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
        private String executorShape;

        /**
         * The shape of the SQL Endpoint worker instance.
         * @param executorShape the value to set
         * @return this builder
         **/
        public Builder executorShape(String executorShape) {
            this.executorShape = executorShape;
            this.__explicitlySet__.add("executorShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executorShapeConfig")
        private ShapeConfig executorShapeConfig;

        public Builder executorShapeConfig(ShapeConfig executorShapeConfig) {
            this.executorShapeConfig = executorShapeConfig;
            this.__explicitlySet__.add("executorShapeConfig");
            return this;
        }
        /**
         * The minimum number of executors.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minExecutorCount")
        private Integer minExecutorCount;

        /**
         * The minimum number of executors.
         * @param minExecutorCount the value to set
         * @return this builder
         **/
        public Builder minExecutorCount(Integer minExecutorCount) {
            this.minExecutorCount = minExecutorCount;
            this.__explicitlySet__.add("minExecutorCount");
            return this;
        }
        /**
         * The maximum number of executors.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxExecutorCount")
        private Integer maxExecutorCount;

        /**
         * The maximum number of executors.
         * @param maxExecutorCount the value to set
         * @return this builder
         **/
        public Builder maxExecutorCount(Integer maxExecutorCount) {
            this.maxExecutorCount = maxExecutorCount;
            this.__explicitlySet__.add("maxExecutorCount");
            return this;
        }
        /**
         * Metastore OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
        private String metastoreId;

        /**
         * Metastore OCID
         * @param metastoreId the value to set
         * @return this builder
         **/
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            this.__explicitlySet__.add("metastoreId");
            return this;
        }
        /**
         * OCI lake OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lakeId")
        private String lakeId;

        /**
         * OCI lake OCID
         * @param lakeId the value to set
         * @return this builder
         **/
        public Builder lakeId(String lakeId) {
            this.lakeId = lakeId;
            this.__explicitlySet__.add("lakeId");
            return this;
        }
        /**
         * The Spark configuration passed to the running process.
         * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
         * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
         * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
         * not allowed to be overwritten will cause a 400 status to be returned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sparkAdvancedConfigurations")
        private java.util.Map<String, String> sparkAdvancedConfigurations;

        /**
         * The Spark configuration passed to the running process.
         * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
         * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
         * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
         * not allowed to be overwritten will cause a 400 status to be returned.
         *
         * @param sparkAdvancedConfigurations the value to set
         * @return this builder
         **/
        public Builder sparkAdvancedConfigurations(
                java.util.Map<String, String> sparkAdvancedConfigurations) {
            this.sparkAdvancedConfigurations = sparkAdvancedConfigurations;
            this.__explicitlySet__.add("sparkAdvancedConfigurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSqlEndpointDetails build() {
            UpdateSqlEndpointDetails model =
                    new UpdateSqlEndpointDetails(
                            this.definedTags,
                            this.freeformTags,
                            this.displayName,
                            this.description,
                            this.driverShape,
                            this.driverShapeConfig,
                            this.executorShape,
                            this.executorShapeConfig,
                            this.minExecutorCount,
                            this.maxExecutorCount,
                            this.metastoreId,
                            this.lakeId,
                            this.sparkAdvancedConfigurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSqlEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("driverShape")) {
                this.driverShape(model.getDriverShape());
            }
            if (model.wasPropertyExplicitlySet("driverShapeConfig")) {
                this.driverShapeConfig(model.getDriverShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("executorShape")) {
                this.executorShape(model.getExecutorShape());
            }
            if (model.wasPropertyExplicitlySet("executorShapeConfig")) {
                this.executorShapeConfig(model.getExecutorShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("minExecutorCount")) {
                this.minExecutorCount(model.getMinExecutorCount());
            }
            if (model.wasPropertyExplicitlySet("maxExecutorCount")) {
                this.maxExecutorCount(model.getMaxExecutorCount());
            }
            if (model.wasPropertyExplicitlySet("metastoreId")) {
                this.metastoreId(model.getMetastoreId());
            }
            if (model.wasPropertyExplicitlySet("lakeId")) {
                this.lakeId(model.getLakeId());
            }
            if (model.wasPropertyExplicitlySet("sparkAdvancedConfigurations")) {
                this.sparkAdvancedConfigurations(model.getSparkAdvancedConfigurations());
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The SQL Endpoint name, which can be changed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The SQL Endpoint name, which can be changed.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The description of CreateSQLEndpointDetails.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of CreateSQLEndpointDetails.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The shape of the SQL Endpoint driver instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    private final String driverShape;

    /**
     * The shape of the SQL Endpoint driver instance.
     * @return the value
     **/
    public String getDriverShape() {
        return driverShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfig")
    private final ShapeConfig driverShapeConfig;

    public ShapeConfig getDriverShapeConfig() {
        return driverShapeConfig;
    }

    /**
     * The shape of the SQL Endpoint worker instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
    private final String executorShape;

    /**
     * The shape of the SQL Endpoint worker instance.
     * @return the value
     **/
    public String getExecutorShape() {
        return executorShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executorShapeConfig")
    private final ShapeConfig executorShapeConfig;

    public ShapeConfig getExecutorShapeConfig() {
        return executorShapeConfig;
    }

    /**
     * The minimum number of executors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minExecutorCount")
    private final Integer minExecutorCount;

    /**
     * The minimum number of executors.
     * @return the value
     **/
    public Integer getMinExecutorCount() {
        return minExecutorCount;
    }

    /**
     * The maximum number of executors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxExecutorCount")
    private final Integer maxExecutorCount;

    /**
     * The maximum number of executors.
     * @return the value
     **/
    public Integer getMaxExecutorCount() {
        return maxExecutorCount;
    }

    /**
     * Metastore OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
    private final String metastoreId;

    /**
     * Metastore OCID
     * @return the value
     **/
    public String getMetastoreId() {
        return metastoreId;
    }

    /**
     * OCI lake OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lakeId")
    private final String lakeId;

    /**
     * OCI lake OCID
     * @return the value
     **/
    public String getLakeId() {
        return lakeId;
    }

    /**
     * The Spark configuration passed to the running process.
     * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
     * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
     * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
     * not allowed to be overwritten will cause a 400 status to be returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sparkAdvancedConfigurations")
    private final java.util.Map<String, String> sparkAdvancedConfigurations;

    /**
     * The Spark configuration passed to the running process.
     * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
     * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
     * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
     * not allowed to be overwritten will cause a 400 status to be returned.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getSparkAdvancedConfigurations() {
        return sparkAdvancedConfigurations;
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
        sb.append("UpdateSqlEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", driverShape=").append(String.valueOf(this.driverShape));
        sb.append(", driverShapeConfig=").append(String.valueOf(this.driverShapeConfig));
        sb.append(", executorShape=").append(String.valueOf(this.executorShape));
        sb.append(", executorShapeConfig=").append(String.valueOf(this.executorShapeConfig));
        sb.append(", minExecutorCount=").append(String.valueOf(this.minExecutorCount));
        sb.append(", maxExecutorCount=").append(String.valueOf(this.maxExecutorCount));
        sb.append(", metastoreId=").append(String.valueOf(this.metastoreId));
        sb.append(", lakeId=").append(String.valueOf(this.lakeId));
        sb.append(", sparkAdvancedConfigurations=")
                .append(String.valueOf(this.sparkAdvancedConfigurations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSqlEndpointDetails)) {
            return false;
        }

        UpdateSqlEndpointDetails other = (UpdateSqlEndpointDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.driverShape, other.driverShape)
                && java.util.Objects.equals(this.driverShapeConfig, other.driverShapeConfig)
                && java.util.Objects.equals(this.executorShape, other.executorShape)
                && java.util.Objects.equals(this.executorShapeConfig, other.executorShapeConfig)
                && java.util.Objects.equals(this.minExecutorCount, other.minExecutorCount)
                && java.util.Objects.equals(this.maxExecutorCount, other.maxExecutorCount)
                && java.util.Objects.equals(this.metastoreId, other.metastoreId)
                && java.util.Objects.equals(this.lakeId, other.lakeId)
                && java.util.Objects.equals(
                        this.sparkAdvancedConfigurations, other.sparkAdvancedConfigurations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.driverShape == null ? 43 : this.driverShape.hashCode());
        result =
                (result * PRIME)
                        + (this.driverShapeConfig == null ? 43 : this.driverShapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShape == null ? 43 : this.executorShape.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShapeConfig == null
                                ? 43
                                : this.executorShapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.minExecutorCount == null ? 43 : this.minExecutorCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maxExecutorCount == null ? 43 : this.maxExecutorCount.hashCode());
        result = (result * PRIME) + (this.metastoreId == null ? 43 : this.metastoreId.hashCode());
        result = (result * PRIME) + (this.lakeId == null ? 43 : this.lakeId.hashCode());
        result =
                (result * PRIME)
                        + (this.sparkAdvancedConfigurations == null
                                ? 43
                                : this.sparkAdvancedConfigurations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
