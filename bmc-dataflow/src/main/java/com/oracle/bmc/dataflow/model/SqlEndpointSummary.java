/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * A summary of the Sql Endpoint. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlEndpointSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlEndpointSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "jdbcEndpointUrl",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "stateMessage",
        "sqlEndpointVersion",
        "driverShape",
        "driverShapeConfig",
        "executorShape",
        "executorShapeConfig",
        "minExecutorCount",
        "maxExecutorCount",
        "ownerPrincipalId",
        "metastoreId",
        "lakeId",
        "warehouseBucketUri",
        "description",
        "lastAcceptedRequestToken",
        "freeformTags",
        "definedTags",
        "systemTags",
        "sparkAdvancedConfigurations",
        "networkConfiguration"
    })
    public SqlEndpointSummary(
            String id,
            String displayName,
            String compartmentId,
            String jdbcEndpointUrl,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            SqlEndpointLifecycleState lifecycleState,
            String stateMessage,
            String sqlEndpointVersion,
            String driverShape,
            ShapeConfig driverShapeConfig,
            String executorShape,
            ShapeConfig executorShapeConfig,
            Integer minExecutorCount,
            Integer maxExecutorCount,
            String ownerPrincipalId,
            String metastoreId,
            String lakeId,
            String warehouseBucketUri,
            String description,
            String lastAcceptedRequestToken,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Map<String, String> sparkAdvancedConfigurations,
            SqlEndpointNetworkConfiguration networkConfiguration) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.jdbcEndpointUrl = jdbcEndpointUrl;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.stateMessage = stateMessage;
        this.sqlEndpointVersion = sqlEndpointVersion;
        this.driverShape = driverShape;
        this.driverShapeConfig = driverShapeConfig;
        this.executorShape = executorShape;
        this.executorShapeConfig = executorShapeConfig;
        this.minExecutorCount = minExecutorCount;
        this.maxExecutorCount = maxExecutorCount;
        this.ownerPrincipalId = ownerPrincipalId;
        this.metastoreId = metastoreId;
        this.lakeId = lakeId;
        this.warehouseBucketUri = warehouseBucketUri;
        this.description = description;
        this.lastAcceptedRequestToken = lastAcceptedRequestToken;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.sparkAdvancedConfigurations = sparkAdvancedConfigurations;
        this.networkConfiguration = networkConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The provision identifier that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The provision identifier that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The SQL Endpoint name, which can be changed. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The SQL Endpoint name, which can be changed.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of a compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of a compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The JDBC URL field. For example,
         * jdbc:spark://{serviceFQDN}:443/default;SparkServerType=DFI
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jdbcEndpointUrl")
        private String jdbcEndpointUrl;

        /**
         * The JDBC URL field. For example,
         * jdbc:spark://{serviceFQDN}:443/default;SparkServerType=DFI
         *
         * @param jdbcEndpointUrl the value to set
         * @return this builder
         */
        public Builder jdbcEndpointUrl(String jdbcEndpointUrl) {
            this.jdbcEndpointUrl = jdbcEndpointUrl;
            this.__explicitlySet__.add("jdbcEndpointUrl");
            return this;
        }
        /** The time the Sql Endpoint was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the Sql Endpoint was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the Sql Endpoint was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Sql Endpoint was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the Sql Endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SqlEndpointLifecycleState lifecycleState;

        /**
         * The current state of the Sql Endpoint.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(SqlEndpointLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the reason why the resource is in it's current state. Helps bubble
         * up errors in state changes. For example, it can be used to provide actionable information
         * for a resource in the Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
        private String stateMessage;

        /**
         * A message describing the reason why the resource is in it's current state. Helps bubble
         * up errors in state changes. For example, it can be used to provide actionable information
         * for a resource in the Failed state.
         *
         * @param stateMessage the value to set
         * @return this builder
         */
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = stateMessage;
            this.__explicitlySet__.add("stateMessage");
            return this;
        }
        /** The version of SQL Endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlEndpointVersion")
        private String sqlEndpointVersion;

        /**
         * The version of SQL Endpoint.
         *
         * @param sqlEndpointVersion the value to set
         * @return this builder
         */
        public Builder sqlEndpointVersion(String sqlEndpointVersion) {
            this.sqlEndpointVersion = sqlEndpointVersion;
            this.__explicitlySet__.add("sqlEndpointVersion");
            return this;
        }
        /** The shape of the SQL Endpoint driver instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
        private String driverShape;

        /**
         * The shape of the SQL Endpoint driver instance.
         *
         * @param driverShape the value to set
         * @return this builder
         */
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
        /** The shape of the SQL Endpoint executor instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
        private String executorShape;

        /**
         * The shape of the SQL Endpoint executor instance.
         *
         * @param executorShape the value to set
         * @return this builder
         */
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
        /** The minimum number of executors. */
        @com.fasterxml.jackson.annotation.JsonProperty("minExecutorCount")
        private Integer minExecutorCount;

        /**
         * The minimum number of executors.
         *
         * @param minExecutorCount the value to set
         * @return this builder
         */
        public Builder minExecutorCount(Integer minExecutorCount) {
            this.minExecutorCount = minExecutorCount;
            this.__explicitlySet__.add("minExecutorCount");
            return this;
        }
        /** The maximum number of executors. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxExecutorCount")
        private Integer maxExecutorCount;

        /**
         * The maximum number of executors.
         *
         * @param maxExecutorCount the value to set
         * @return this builder
         */
        public Builder maxExecutorCount(Integer maxExecutorCount) {
            this.maxExecutorCount = maxExecutorCount;
            this.__explicitlySet__.add("maxExecutorCount");
            return this;
        }
        /** The OCID of the user who created the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("ownerPrincipalId")
        private String ownerPrincipalId;

        /**
         * The OCID of the user who created the resource.
         *
         * @param ownerPrincipalId the value to set
         * @return this builder
         */
        public Builder ownerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            this.__explicitlySet__.add("ownerPrincipalId");
            return this;
        }
        /** The OCID of OCI Hive Metastore. */
        @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
        private String metastoreId;

        /**
         * The OCID of OCI Hive Metastore.
         *
         * @param metastoreId the value to set
         * @return this builder
         */
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            this.__explicitlySet__.add("metastoreId");
            return this;
        }
        /** The OCID of OCI Lake. */
        @com.fasterxml.jackson.annotation.JsonProperty("lakeId")
        private String lakeId;

        /**
         * The OCID of OCI Lake.
         *
         * @param lakeId the value to set
         * @return this builder
         */
        public Builder lakeId(String lakeId) {
            this.lakeId = lakeId;
            this.__explicitlySet__.add("lakeId");
            return this;
        }
        /**
         * The warehouse bucket URI. It is a Oracle Cloud Infrastructure Object Storage bucket URI
         * as defined here
         * https://docs.oracle.com/en/cloud/paas/atp-cloud/atpud/object-storage-uris.html
         */
        @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
        private String warehouseBucketUri;

        /**
         * The warehouse bucket URI. It is a Oracle Cloud Infrastructure Object Storage bucket URI
         * as defined here
         * https://docs.oracle.com/en/cloud/paas/atp-cloud/atpud/object-storage-uris.html
         *
         * @param warehouseBucketUri the value to set
         * @return this builder
         */
        public Builder warehouseBucketUri(String warehouseBucketUri) {
            this.warehouseBucketUri = warehouseBucketUri;
            this.__explicitlySet__.add("warehouseBucketUri");
            return this;
        }
        /** The description of the SQL Endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the SQL Endpoint.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * This token is used by Splat, and indicates that the service accepts the request, and that
         * the request is currently being processed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastAcceptedRequestToken")
        private String lastAcceptedRequestToken;

        /**
         * This token is used by Splat, and indicates that the service accepts the request, and that
         * the request is currently being processed.
         *
         * @param lastAcceptedRequestToken the value to set
         * @return this builder
         */
        public Builder lastAcceptedRequestToken(String lastAcceptedRequestToken) {
            this.lastAcceptedRequestToken = lastAcceptedRequestToken;
            this.__explicitlySet__.add("lastAcceptedRequestToken");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The Spark configuration passed to the running process. See
         * https://spark.apache.org/docs/latest/configuration.html#available-properties. Example: {
         * "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" } Note: Not all
         * Spark properties are permitted to be set. Attempting to set a property that is not
         * allowed to be overwritten will cause a 400 status to be returned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sparkAdvancedConfigurations")
        private java.util.Map<String, String> sparkAdvancedConfigurations;

        /**
         * The Spark configuration passed to the running process. See
         * https://spark.apache.org/docs/latest/configuration.html#available-properties. Example: {
         * "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" } Note: Not all
         * Spark properties are permitted to be set. Attempting to set a property that is not
         * allowed to be overwritten will cause a 400 status to be returned.
         *
         * @param sparkAdvancedConfigurations the value to set
         * @return this builder
         */
        public Builder sparkAdvancedConfigurations(
                java.util.Map<String, String> sparkAdvancedConfigurations) {
            this.sparkAdvancedConfigurations = sparkAdvancedConfigurations;
            this.__explicitlySet__.add("sparkAdvancedConfigurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private SqlEndpointNetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(SqlEndpointNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlEndpointSummary build() {
            SqlEndpointSummary model =
                    new SqlEndpointSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.jdbcEndpointUrl,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.stateMessage,
                            this.sqlEndpointVersion,
                            this.driverShape,
                            this.driverShapeConfig,
                            this.executorShape,
                            this.executorShapeConfig,
                            this.minExecutorCount,
                            this.maxExecutorCount,
                            this.ownerPrincipalId,
                            this.metastoreId,
                            this.lakeId,
                            this.warehouseBucketUri,
                            this.description,
                            this.lastAcceptedRequestToken,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.sparkAdvancedConfigurations,
                            this.networkConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlEndpointSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("jdbcEndpointUrl")) {
                this.jdbcEndpointUrl(model.getJdbcEndpointUrl());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("stateMessage")) {
                this.stateMessage(model.getStateMessage());
            }
            if (model.wasPropertyExplicitlySet("sqlEndpointVersion")) {
                this.sqlEndpointVersion(model.getSqlEndpointVersion());
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
            if (model.wasPropertyExplicitlySet("ownerPrincipalId")) {
                this.ownerPrincipalId(model.getOwnerPrincipalId());
            }
            if (model.wasPropertyExplicitlySet("metastoreId")) {
                this.metastoreId(model.getMetastoreId());
            }
            if (model.wasPropertyExplicitlySet("lakeId")) {
                this.lakeId(model.getLakeId());
            }
            if (model.wasPropertyExplicitlySet("warehouseBucketUri")) {
                this.warehouseBucketUri(model.getWarehouseBucketUri());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("lastAcceptedRequestToken")) {
                this.lastAcceptedRequestToken(model.getLastAcceptedRequestToken());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("sparkAdvancedConfigurations")) {
                this.sparkAdvancedConfigurations(model.getSparkAdvancedConfigurations());
            }
            if (model.wasPropertyExplicitlySet("networkConfiguration")) {
                this.networkConfiguration(model.getNetworkConfiguration());
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

    /** The provision identifier that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The provision identifier that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The SQL Endpoint name, which can be changed. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The SQL Endpoint name, which can be changed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of a compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of a compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The JDBC URL field. For example, jdbc:spark://{serviceFQDN}:443/default;SparkServerType=DFI
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jdbcEndpointUrl")
    private final String jdbcEndpointUrl;

    /**
     * The JDBC URL field. For example, jdbc:spark://{serviceFQDN}:443/default;SparkServerType=DFI
     *
     * @return the value
     */
    public String getJdbcEndpointUrl() {
        return jdbcEndpointUrl;
    }

    /** The time the Sql Endpoint was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Sql Endpoint was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the Sql Endpoint was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Sql Endpoint was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the Sql Endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SqlEndpointLifecycleState lifecycleState;

    /**
     * The current state of the Sql Endpoint.
     *
     * @return the value
     */
    public SqlEndpointLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the reason why the resource is in it's current state. Helps bubble up
     * errors in state changes. For example, it can be used to provide actionable information for a
     * resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

    /**
     * A message describing the reason why the resource is in it's current state. Helps bubble up
     * errors in state changes. For example, it can be used to provide actionable information for a
     * resource in the Failed state.
     *
     * @return the value
     */
    public String getStateMessage() {
        return stateMessage;
    }

    /** The version of SQL Endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlEndpointVersion")
    private final String sqlEndpointVersion;

    /**
     * The version of SQL Endpoint.
     *
     * @return the value
     */
    public String getSqlEndpointVersion() {
        return sqlEndpointVersion;
    }

    /** The shape of the SQL Endpoint driver instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    private final String driverShape;

    /**
     * The shape of the SQL Endpoint driver instance.
     *
     * @return the value
     */
    public String getDriverShape() {
        return driverShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfig")
    private final ShapeConfig driverShapeConfig;

    public ShapeConfig getDriverShapeConfig() {
        return driverShapeConfig;
    }

    /** The shape of the SQL Endpoint executor instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
    private final String executorShape;

    /**
     * The shape of the SQL Endpoint executor instance.
     *
     * @return the value
     */
    public String getExecutorShape() {
        return executorShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executorShapeConfig")
    private final ShapeConfig executorShapeConfig;

    public ShapeConfig getExecutorShapeConfig() {
        return executorShapeConfig;
    }

    /** The minimum number of executors. */
    @com.fasterxml.jackson.annotation.JsonProperty("minExecutorCount")
    private final Integer minExecutorCount;

    /**
     * The minimum number of executors.
     *
     * @return the value
     */
    public Integer getMinExecutorCount() {
        return minExecutorCount;
    }

    /** The maximum number of executors. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxExecutorCount")
    private final Integer maxExecutorCount;

    /**
     * The maximum number of executors.
     *
     * @return the value
     */
    public Integer getMaxExecutorCount() {
        return maxExecutorCount;
    }

    /** The OCID of the user who created the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("ownerPrincipalId")
    private final String ownerPrincipalId;

    /**
     * The OCID of the user who created the resource.
     *
     * @return the value
     */
    public String getOwnerPrincipalId() {
        return ownerPrincipalId;
    }

    /** The OCID of OCI Hive Metastore. */
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
    private final String metastoreId;

    /**
     * The OCID of OCI Hive Metastore.
     *
     * @return the value
     */
    public String getMetastoreId() {
        return metastoreId;
    }

    /** The OCID of OCI Lake. */
    @com.fasterxml.jackson.annotation.JsonProperty("lakeId")
    private final String lakeId;

    /**
     * The OCID of OCI Lake.
     *
     * @return the value
     */
    public String getLakeId() {
        return lakeId;
    }

    /**
     * The warehouse bucket URI. It is a Oracle Cloud Infrastructure Object Storage bucket URI as
     * defined here https://docs.oracle.com/en/cloud/paas/atp-cloud/atpud/object-storage-uris.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
    private final String warehouseBucketUri;

    /**
     * The warehouse bucket URI. It is a Oracle Cloud Infrastructure Object Storage bucket URI as
     * defined here https://docs.oracle.com/en/cloud/paas/atp-cloud/atpud/object-storage-uris.html
     *
     * @return the value
     */
    public String getWarehouseBucketUri() {
        return warehouseBucketUri;
    }

    /** The description of the SQL Endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the SQL Endpoint.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * This token is used by Splat, and indicates that the service accepts the request, and that the
     * request is currently being processed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastAcceptedRequestToken")
    private final String lastAcceptedRequestToken;

    /**
     * This token is used by Splat, and indicates that the service accepts the request, and that the
     * request is currently being processed.
     *
     * @return the value
     */
    public String getLastAcceptedRequestToken() {
        return lastAcceptedRequestToken;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The Spark configuration passed to the running process. See
     * https://spark.apache.org/docs/latest/configuration.html#available-properties. Example: {
     * "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" } Note: Not all Spark
     * properties are permitted to be set. Attempting to set a property that is not allowed to be
     * overwritten will cause a 400 status to be returned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sparkAdvancedConfigurations")
    private final java.util.Map<String, String> sparkAdvancedConfigurations;

    /**
     * The Spark configuration passed to the running process. See
     * https://spark.apache.org/docs/latest/configuration.html#available-properties. Example: {
     * "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" } Note: Not all Spark
     * properties are permitted to be set. Attempting to set a property that is not allowed to be
     * overwritten will cause a 400 status to be returned.
     *
     * @return the value
     */
    public java.util.Map<String, String> getSparkAdvancedConfigurations() {
        return sparkAdvancedConfigurations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final SqlEndpointNetworkConfiguration networkConfiguration;

    public SqlEndpointNetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
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
        sb.append("SqlEndpointSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", jdbcEndpointUrl=").append(String.valueOf(this.jdbcEndpointUrl));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", sqlEndpointVersion=").append(String.valueOf(this.sqlEndpointVersion));
        sb.append(", driverShape=").append(String.valueOf(this.driverShape));
        sb.append(", driverShapeConfig=").append(String.valueOf(this.driverShapeConfig));
        sb.append(", executorShape=").append(String.valueOf(this.executorShape));
        sb.append(", executorShapeConfig=").append(String.valueOf(this.executorShapeConfig));
        sb.append(", minExecutorCount=").append(String.valueOf(this.minExecutorCount));
        sb.append(", maxExecutorCount=").append(String.valueOf(this.maxExecutorCount));
        sb.append(", ownerPrincipalId=").append(String.valueOf(this.ownerPrincipalId));
        sb.append(", metastoreId=").append(String.valueOf(this.metastoreId));
        sb.append(", lakeId=").append(String.valueOf(this.lakeId));
        sb.append(", warehouseBucketUri=").append(String.valueOf(this.warehouseBucketUri));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lastAcceptedRequestToken=")
                .append(String.valueOf(this.lastAcceptedRequestToken));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", sparkAdvancedConfigurations=")
                .append(String.valueOf(this.sparkAdvancedConfigurations));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlEndpointSummary)) {
            return false;
        }

        SqlEndpointSummary other = (SqlEndpointSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.jdbcEndpointUrl, other.jdbcEndpointUrl)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.stateMessage, other.stateMessage)
                && java.util.Objects.equals(this.sqlEndpointVersion, other.sqlEndpointVersion)
                && java.util.Objects.equals(this.driverShape, other.driverShape)
                && java.util.Objects.equals(this.driverShapeConfig, other.driverShapeConfig)
                && java.util.Objects.equals(this.executorShape, other.executorShape)
                && java.util.Objects.equals(this.executorShapeConfig, other.executorShapeConfig)
                && java.util.Objects.equals(this.minExecutorCount, other.minExecutorCount)
                && java.util.Objects.equals(this.maxExecutorCount, other.maxExecutorCount)
                && java.util.Objects.equals(this.ownerPrincipalId, other.ownerPrincipalId)
                && java.util.Objects.equals(this.metastoreId, other.metastoreId)
                && java.util.Objects.equals(this.lakeId, other.lakeId)
                && java.util.Objects.equals(this.warehouseBucketUri, other.warehouseBucketUri)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.lastAcceptedRequestToken, other.lastAcceptedRequestToken)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(
                        this.sparkAdvancedConfigurations, other.sparkAdvancedConfigurations)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.jdbcEndpointUrl == null ? 43 : this.jdbcEndpointUrl.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlEndpointVersion == null
                                ? 43
                                : this.sqlEndpointVersion.hashCode());
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
        result =
                (result * PRIME)
                        + (this.ownerPrincipalId == null ? 43 : this.ownerPrincipalId.hashCode());
        result = (result * PRIME) + (this.metastoreId == null ? 43 : this.metastoreId.hashCode());
        result = (result * PRIME) + (this.lakeId == null ? 43 : this.lakeId.hashCode());
        result =
                (result * PRIME)
                        + (this.warehouseBucketUri == null
                                ? 43
                                : this.warehouseBucketUri.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.lastAcceptedRequestToken == null
                                ? 43
                                : this.lastAcceptedRequestToken.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.sparkAdvancedConfigurations == null
                                ? 43
                                : this.sparkAdvancedConfigurations.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
