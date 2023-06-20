/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * The create run details. The following properties are optional and override the default values
 * set in the associated application:
 *   - applicationId
 *   - archiveUri
 *   - applicationLogConfig
 *   - arguments
 *   - configuration
 *   - definedTags
 *   - displayName
 *   - driverShape
 *   - execute
 *   - executorShape
 *   - freeformTags
 *   - logsBucketUri
 *   - metastoreId
 *   - numExecutors
 *   - parameters
 *   - sparkVersion
 *   - warehouseBucketUri
 * It is expected that either the applicationId or the execute parameter is specified; but not both.
 * If both or none are set, a Bad Request (HTTP 400) status will be sent as the response.
 * If an appicationId is not specified, then a value for the execute parameter is expected.
 * Using data parsed from the value, a new application will be created and assicated with the new run.
 * See information on the execute parameter for details on the format of this parameter.
 * <p>
 * The optional parameter spark version can only be specified when using the execute parameter.  If it
 * is not specified when using the execute parameter, the latest version will be used as default.
 * If the execute parameter is not used, the spark version will be taken from the associated application.
 * <p>
 * If displayName is not specified, it will be derived from the displayName of associated application or
 * set by API using fileUri's application file name.
 * Once a run is created, its properties (except for definedTags and freeformTags) cannot be changed.
 * If the parent application's properties (including definedTags and freeformTags) are updated,
 * the corresponding properties of the run will not update.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateRunDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateRunDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "applicationLogConfig",
        "applicationId",
        "archiveUri",
        "arguments",
        "compartmentId",
        "configuration",
        "definedTags",
        "displayName",
        "driverShape",
        "driverShapeConfig",
        "execute",
        "executorShape",
        "executorShapeConfig",
        "freeformTags",
        "logsBucketUri",
        "metastoreId",
        "numExecutors",
        "parameters",
        "poolId",
        "sparkVersion",
        "type",
        "warehouseBucketUri",
        "maxDurationInMinutes",
        "idleTimeoutInMinutes"
    })
    public CreateRunDetails(
            ApplicationLogConfig applicationLogConfig,
            String applicationId,
            String archiveUri,
            java.util.List<String> arguments,
            String compartmentId,
            java.util.Map<String, String> configuration,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String driverShape,
            ShapeConfig driverShapeConfig,
            String execute,
            String executorShape,
            ShapeConfig executorShapeConfig,
            java.util.Map<String, String> freeformTags,
            String logsBucketUri,
            String metastoreId,
            Integer numExecutors,
            java.util.List<ApplicationParameter> parameters,
            String poolId,
            String sparkVersion,
            ApplicationType type,
            String warehouseBucketUri,
            Long maxDurationInMinutes,
            Long idleTimeoutInMinutes) {
        super();
        this.applicationLogConfig = applicationLogConfig;
        this.applicationId = applicationId;
        this.archiveUri = archiveUri;
        this.arguments = arguments;
        this.compartmentId = compartmentId;
        this.configuration = configuration;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.driverShape = driverShape;
        this.driverShapeConfig = driverShapeConfig;
        this.execute = execute;
        this.executorShape = executorShape;
        this.executorShapeConfig = executorShapeConfig;
        this.freeformTags = freeformTags;
        this.logsBucketUri = logsBucketUri;
        this.metastoreId = metastoreId;
        this.numExecutors = numExecutors;
        this.parameters = parameters;
        this.poolId = poolId;
        this.sparkVersion = sparkVersion;
        this.type = type;
        this.warehouseBucketUri = warehouseBucketUri;
        this.maxDurationInMinutes = maxDurationInMinutes;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("applicationLogConfig")
        private ApplicationLogConfig applicationLogConfig;

        public Builder applicationLogConfig(ApplicationLogConfig applicationLogConfig) {
            this.applicationLogConfig = applicationLogConfig;
            this.__explicitlySet__.add("applicationLogConfig");
            return this;
        }
        /**
         * The OCID of the associated application. If this value is set, then no value for the execute parameter is required. If this value is not set, then a value for the execute parameter is required, and a new application is created and associated with the new run.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        /**
         * The OCID of the associated application. If this value is set, then no value for the execute parameter is required. If this value is not set, then a value for the execute parameter is required, and a new application is created and associated with the new run.
         *
         * @param applicationId the value to set
         * @return this builder
         **/
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }
        /**
         * A comma separated list of one or more archive files as Oracle Cloud Infrastructure URIs. For example, {@code oci://path/to/a.zip,oci://path/to/b.zip}. An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution of a Python, Java, or Scala application.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archiveUri")
        private String archiveUri;

        /**
         * A comma separated list of one or more archive files as Oracle Cloud Infrastructure URIs. For example, {@code oci://path/to/a.zip,oci://path/to/b.zip}. An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution of a Python, Java, or Scala application.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         * @param archiveUri the value to set
         * @return this builder
         **/
        public Builder archiveUri(String archiveUri) {
            this.archiveUri = archiveUri;
            this.__explicitlySet__.add("archiveUri");
            return this;
        }
        /**
         * The arguments passed to the running application as command line arguments.  An argument is
         * either a plain text or a placeholder. Placeholders are replaced using values from the parameters
         * map.  Each placeholder specified must be represented in the parameters map else the request
         * (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as
         * {@code Service Api Spec}, where {@code name} is the name of the parameter.
         * Example:  {@code [ "--input", "${input_file}", "--name", "John Doe" ]}
         * If "input_file" has a value of "mydata.xml", then the value above will be translated to
         * {@code --input mydata.xml --name "John Doe"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<String> arguments;

        /**
         * The arguments passed to the running application as command line arguments.  An argument is
         * either a plain text or a placeholder. Placeholders are replaced using values from the parameters
         * map.  Each placeholder specified must be represented in the parameters map else the request
         * (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as
         * {@code Service Api Spec}, where {@code name} is the name of the parameter.
         * Example:  {@code [ "--input", "${input_file}", "--name", "John Doe" ]}
         * If "input_file" has a value of "mydata.xml", then the value above will be translated to
         * {@code --input mydata.xml --name "John Doe"}
         *
         * @param arguments the value to set
         * @return this builder
         **/
        public Builder arguments(java.util.List<String> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }
        /**
         * The OCID of a compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of a compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private java.util.Map<String, String> configuration;

        /**
         * The Spark configuration passed to the running process.
         * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
         * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
         * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
         * not allowed to be overwritten will cause a 400 status to be returned.
         *
         * @param configuration the value to set
         * @return this builder
         **/
        public Builder configuration(java.util.Map<String, String> configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }
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
         * A user-friendly name that does not have to be unique. Avoid entering confidential information. If this value is not specified, it will be derived from the associated application's displayName or set by API using fileUri's application file name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name that does not have to be unique. Avoid entering confidential information. If this value is not specified, it will be derived from the associated application's displayName or set by API using fileUri's application file name.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The VM shape for the driver. Sets the driver cores and memory.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
        private String driverShape;

        /**
         * The VM shape for the driver. Sets the driver cores and memory.
         *
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
         * The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit.
         * Supported options include {@code --class}{@code , }{@code --file}{@code , }{@code --jars}{@code , }{@code --conf}{@code , }{@code --py-files}{@code , and main application file with arguments.
         * Example: }{@code --jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10}
         * Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit,
         * Data Flow service will use derived information from execute input only.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("execute")
        private String execute;

        /**
         * The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit.
         * Supported options include {@code --class}{@code , }{@code --file}{@code , }{@code --jars}{@code , }{@code --conf}{@code , }{@code --py-files}{@code , and main application file with arguments.
         * Example: }{@code --jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10}
         * Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit,
         * Data Flow service will use derived information from execute input only.
         *
         * @param execute the value to set
         * @return this builder
         **/
        public Builder execute(String execute) {
            this.execute = execute;
            this.__explicitlySet__.add("execute");
            return this;
        }
        /**
         * The VM shape for the executors. Sets the executor cores and memory.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
        private String executorShape;

        /**
         * The VM shape for the executors. Sets the executor cores and memory.
         *
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
         * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logsBucketUri")
        private String logsBucketUri;

        /**
         * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         * @param logsBucketUri the value to set
         * @return this builder
         **/
        public Builder logsBucketUri(String logsBucketUri) {
            this.logsBucketUri = logsBucketUri;
            this.__explicitlySet__.add("logsBucketUri");
            return this;
        }
        /**
         * The OCID of OCI Hive Metastore.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
        private String metastoreId;

        /**
         * The OCID of OCI Hive Metastore.
         *
         * @param metastoreId the value to set
         * @return this builder
         **/
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            this.__explicitlySet__.add("metastoreId");
            return this;
        }
        /**
         * The number of executor VMs requested.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numExecutors")
        private Integer numExecutors;

        /**
         * The number of executor VMs requested.
         *
         * @param numExecutors the value to set
         * @return this builder
         **/
        public Builder numExecutors(Integer numExecutors) {
            this.numExecutors = numExecutors;
            this.__explicitlySet__.add("numExecutors");
            return this;
        }
        /**
         * An array of name/value pairs used to fill placeholders found in properties like
         * {@code Application.arguments}.  The name must be a string of one or more word characters
         * (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind.
         * Example:  [ { name: "iterations", value: "10"}, { name: "input_file", value: "mydata.xml" }, { name: "variable_x", value: "${x}"} ]
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<ApplicationParameter> parameters;

        /**
         * An array of name/value pairs used to fill placeholders found in properties like
         * {@code Application.arguments}.  The name must be a string of one or more word characters
         * (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind.
         * Example:  [ { name: "iterations", value: "10"}, { name: "input_file", value: "mydata.xml" }, { name: "variable_x", value: "${x}"} ]
         *
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.List<ApplicationParameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /**
         * The OCID of a pool. Unique Id to indentify a dataflow pool resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("poolId")
        private String poolId;

        /**
         * The OCID of a pool. Unique Id to indentify a dataflow pool resource.
         *
         * @param poolId the value to set
         * @return this builder
         **/
        public Builder poolId(String poolId) {
            this.poolId = poolId;
            this.__explicitlySet__.add("poolId");
            return this;
        }
        /**
         * The Spark version utilized to run the application. This value may be set if applicationId is not since the Spark version will be taken from the associated application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
        private String sparkVersion;

        /**
         * The Spark version utilized to run the application. This value may be set if applicationId is not since the Spark version will be taken from the associated application.
         *
         * @param sparkVersion the value to set
         * @return this builder
         **/
        public Builder sparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            this.__explicitlySet__.add("sparkVersion");
            return this;
        }
        /**
         * The Spark application processing type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private ApplicationType type;

        /**
         * The Spark application processing type.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(ApplicationType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
         * for BATCH SQL runs.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
        private String warehouseBucketUri;

        /**
         * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
         * for BATCH SQL runs.
         * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
         *
         * @param warehouseBucketUri the value to set
         * @return this builder
         **/
        public Builder warehouseBucketUri(String warehouseBucketUri) {
            this.warehouseBucketUri = warehouseBucketUri;
            this.__explicitlySet__.add("warehouseBucketUri");
            return this;
        }
        /**
         * The maximum duration in minutes for which an Application should run. Data Flow Run would be terminated
         * once it reaches this duration from the time it transitions to {@code IN_PROGRESS} state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxDurationInMinutes")
        private Long maxDurationInMinutes;

        /**
         * The maximum duration in minutes for which an Application should run. Data Flow Run would be terminated
         * once it reaches this duration from the time it transitions to {@code IN_PROGRESS} state.
         *
         * @param maxDurationInMinutes the value to set
         * @return this builder
         **/
        public Builder maxDurationInMinutes(Long maxDurationInMinutes) {
            this.maxDurationInMinutes = maxDurationInMinutes;
            this.__explicitlySet__.add("maxDurationInMinutes");
            return this;
        }
        /**
         * The timeout value in minutes used to manage Runs. A Run would be stopped after inactivity for this amount of time period.
         * Note: This parameter is currently only applicable for Runs of type {@code SESSION}. Default value is 2880 minutes (2 days)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutInMinutes")
        private Long idleTimeoutInMinutes;

        /**
         * The timeout value in minutes used to manage Runs. A Run would be stopped after inactivity for this amount of time period.
         * Note: This parameter is currently only applicable for Runs of type {@code SESSION}. Default value is 2880 minutes (2 days)
         *
         * @param idleTimeoutInMinutes the value to set
         * @return this builder
         **/
        public Builder idleTimeoutInMinutes(Long idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            this.__explicitlySet__.add("idleTimeoutInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateRunDetails build() {
            CreateRunDetails model =
                    new CreateRunDetails(
                            this.applicationLogConfig,
                            this.applicationId,
                            this.archiveUri,
                            this.arguments,
                            this.compartmentId,
                            this.configuration,
                            this.definedTags,
                            this.displayName,
                            this.driverShape,
                            this.driverShapeConfig,
                            this.execute,
                            this.executorShape,
                            this.executorShapeConfig,
                            this.freeformTags,
                            this.logsBucketUri,
                            this.metastoreId,
                            this.numExecutors,
                            this.parameters,
                            this.poolId,
                            this.sparkVersion,
                            this.type,
                            this.warehouseBucketUri,
                            this.maxDurationInMinutes,
                            this.idleTimeoutInMinutes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRunDetails model) {
            if (model.wasPropertyExplicitlySet("applicationLogConfig")) {
                this.applicationLogConfig(model.getApplicationLogConfig());
            }
            if (model.wasPropertyExplicitlySet("applicationId")) {
                this.applicationId(model.getApplicationId());
            }
            if (model.wasPropertyExplicitlySet("archiveUri")) {
                this.archiveUri(model.getArchiveUri());
            }
            if (model.wasPropertyExplicitlySet("arguments")) {
                this.arguments(model.getArguments());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("driverShape")) {
                this.driverShape(model.getDriverShape());
            }
            if (model.wasPropertyExplicitlySet("driverShapeConfig")) {
                this.driverShapeConfig(model.getDriverShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("execute")) {
                this.execute(model.getExecute());
            }
            if (model.wasPropertyExplicitlySet("executorShape")) {
                this.executorShape(model.getExecutorShape());
            }
            if (model.wasPropertyExplicitlySet("executorShapeConfig")) {
                this.executorShapeConfig(model.getExecutorShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("logsBucketUri")) {
                this.logsBucketUri(model.getLogsBucketUri());
            }
            if (model.wasPropertyExplicitlySet("metastoreId")) {
                this.metastoreId(model.getMetastoreId());
            }
            if (model.wasPropertyExplicitlySet("numExecutors")) {
                this.numExecutors(model.getNumExecutors());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("poolId")) {
                this.poolId(model.getPoolId());
            }
            if (model.wasPropertyExplicitlySet("sparkVersion")) {
                this.sparkVersion(model.getSparkVersion());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("warehouseBucketUri")) {
                this.warehouseBucketUri(model.getWarehouseBucketUri());
            }
            if (model.wasPropertyExplicitlySet("maxDurationInMinutes")) {
                this.maxDurationInMinutes(model.getMaxDurationInMinutes());
            }
            if (model.wasPropertyExplicitlySet("idleTimeoutInMinutes")) {
                this.idleTimeoutInMinutes(model.getIdleTimeoutInMinutes());
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

    @com.fasterxml.jackson.annotation.JsonProperty("applicationLogConfig")
    private final ApplicationLogConfig applicationLogConfig;

    public ApplicationLogConfig getApplicationLogConfig() {
        return applicationLogConfig;
    }

    /**
     * The OCID of the associated application. If this value is set, then no value for the execute parameter is required. If this value is not set, then a value for the execute parameter is required, and a new application is created and associated with the new run.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    private final String applicationId;

    /**
     * The OCID of the associated application. If this value is set, then no value for the execute parameter is required. If this value is not set, then a value for the execute parameter is required, and a new application is created and associated with the new run.
     *
     * @return the value
     **/
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * A comma separated list of one or more archive files as Oracle Cloud Infrastructure URIs. For example, {@code oci://path/to/a.zip,oci://path/to/b.zip}. An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution of a Python, Java, or Scala application.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archiveUri")
    private final String archiveUri;

    /**
     * A comma separated list of one or more archive files as Oracle Cloud Infrastructure URIs. For example, {@code oci://path/to/a.zip,oci://path/to/b.zip}. An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution of a Python, Java, or Scala application.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     * @return the value
     **/
    public String getArchiveUri() {
        return archiveUri;
    }

    /**
     * The arguments passed to the running application as command line arguments.  An argument is
     * either a plain text or a placeholder. Placeholders are replaced using values from the parameters
     * map.  Each placeholder specified must be represented in the parameters map else the request
     * (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as
     * {@code Service Api Spec}, where {@code name} is the name of the parameter.
     * Example:  {@code [ "--input", "${input_file}", "--name", "John Doe" ]}
     * If "input_file" has a value of "mydata.xml", then the value above will be translated to
     * {@code --input mydata.xml --name "John Doe"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<String> arguments;

    /**
     * The arguments passed to the running application as command line arguments.  An argument is
     * either a plain text or a placeholder. Placeholders are replaced using values from the parameters
     * map.  Each placeholder specified must be represented in the parameters map else the request
     * (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as
     * {@code Service Api Spec}, where {@code name} is the name of the parameter.
     * Example:  {@code [ "--input", "${input_file}", "--name", "John Doe" ]}
     * If "input_file" has a value of "mydata.xml", then the value above will be translated to
     * {@code --input mydata.xml --name "John Doe"}
     *
     * @return the value
     **/
    public java.util.List<String> getArguments() {
        return arguments;
    }

    /**
     * The OCID of a compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of a compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The Spark configuration passed to the running process.
     * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
     * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
     * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
     * not allowed to be overwritten will cause a 400 status to be returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final java.util.Map<String, String> configuration;

    /**
     * The Spark configuration passed to the running process.
     * See https://spark.apache.org/docs/latest/configuration.html#available-properties.
     * Example: { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
     * Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is
     * not allowed to be overwritten will cause a 400 status to be returned.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getConfiguration() {
        return configuration;
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
     * A user-friendly name that does not have to be unique. Avoid entering confidential information. If this value is not specified, it will be derived from the associated application's displayName or set by API using fileUri's application file name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name that does not have to be unique. Avoid entering confidential information. If this value is not specified, it will be derived from the associated application's displayName or set by API using fileUri's application file name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The VM shape for the driver. Sets the driver cores and memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    private final String driverShape;

    /**
     * The VM shape for the driver. Sets the driver cores and memory.
     *
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
     * The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit.
     * Supported options include {@code --class}{@code , }{@code --file}{@code , }{@code --jars}{@code , }{@code --conf}{@code , }{@code --py-files}{@code , and main application file with arguments.
     * Example: }{@code --jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10}
     * Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit,
     * Data Flow service will use derived information from execute input only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("execute")
    private final String execute;

    /**
     * The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit.
     * Supported options include {@code --class}{@code , }{@code --file}{@code , }{@code --jars}{@code , }{@code --conf}{@code , }{@code --py-files}{@code , and main application file with arguments.
     * Example: }{@code --jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10}
     * Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit,
     * Data Flow service will use derived information from execute input only.
     *
     * @return the value
     **/
    public String getExecute() {
        return execute;
    }

    /**
     * The VM shape for the executors. Sets the executor cores and memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
    private final String executorShape;

    /**
     * The VM shape for the executors. Sets the executor cores and memory.
     *
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
     * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logsBucketUri")
    private final String logsBucketUri;

    /**
     * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     * @return the value
     **/
    public String getLogsBucketUri() {
        return logsBucketUri;
    }

    /**
     * The OCID of OCI Hive Metastore.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
    private final String metastoreId;

    /**
     * The OCID of OCI Hive Metastore.
     *
     * @return the value
     **/
    public String getMetastoreId() {
        return metastoreId;
    }

    /**
     * The number of executor VMs requested.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numExecutors")
    private final Integer numExecutors;

    /**
     * The number of executor VMs requested.
     *
     * @return the value
     **/
    public Integer getNumExecutors() {
        return numExecutors;
    }

    /**
     * An array of name/value pairs used to fill placeholders found in properties like
     * {@code Application.arguments}.  The name must be a string of one or more word characters
     * (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind.
     * Example:  [ { name: "iterations", value: "10"}, { name: "input_file", value: "mydata.xml" }, { name: "variable_x", value: "${x}"} ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<ApplicationParameter> parameters;

    /**
     * An array of name/value pairs used to fill placeholders found in properties like
     * {@code Application.arguments}.  The name must be a string of one or more word characters
     * (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind.
     * Example:  [ { name: "iterations", value: "10"}, { name: "input_file", value: "mydata.xml" }, { name: "variable_x", value: "${x}"} ]
     *
     * @return the value
     **/
    public java.util.List<ApplicationParameter> getParameters() {
        return parameters;
    }

    /**
     * The OCID of a pool. Unique Id to indentify a dataflow pool resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("poolId")
    private final String poolId;

    /**
     * The OCID of a pool. Unique Id to indentify a dataflow pool resource.
     *
     * @return the value
     **/
    public String getPoolId() {
        return poolId;
    }

    /**
     * The Spark version utilized to run the application. This value may be set if applicationId is not since the Spark version will be taken from the associated application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
    private final String sparkVersion;

    /**
     * The Spark version utilized to run the application. This value may be set if applicationId is not since the Spark version will be taken from the associated application.
     *
     * @return the value
     **/
    public String getSparkVersion() {
        return sparkVersion;
    }

    /**
     * The Spark application processing type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final ApplicationType type;

    /**
     * The Spark application processing type.
     *
     * @return the value
     **/
    public ApplicationType getType() {
        return type;
    }

    /**
     * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
     * for BATCH SQL runs.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
    private final String warehouseBucketUri;

    /**
     * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
     * for BATCH SQL runs.
     * See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     *
     * @return the value
     **/
    public String getWarehouseBucketUri() {
        return warehouseBucketUri;
    }

    /**
     * The maximum duration in minutes for which an Application should run. Data Flow Run would be terminated
     * once it reaches this duration from the time it transitions to {@code IN_PROGRESS} state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDurationInMinutes")
    private final Long maxDurationInMinutes;

    /**
     * The maximum duration in minutes for which an Application should run. Data Flow Run would be terminated
     * once it reaches this duration from the time it transitions to {@code IN_PROGRESS} state.
     *
     * @return the value
     **/
    public Long getMaxDurationInMinutes() {
        return maxDurationInMinutes;
    }

    /**
     * The timeout value in minutes used to manage Runs. A Run would be stopped after inactivity for this amount of time period.
     * Note: This parameter is currently only applicable for Runs of type {@code SESSION}. Default value is 2880 minutes (2 days)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutInMinutes")
    private final Long idleTimeoutInMinutes;

    /**
     * The timeout value in minutes used to manage Runs. A Run would be stopped after inactivity for this amount of time period.
     * Note: This parameter is currently only applicable for Runs of type {@code SESSION}. Default value is 2880 minutes (2 days)
     *
     * @return the value
     **/
    public Long getIdleTimeoutInMinutes() {
        return idleTimeoutInMinutes;
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
        sb.append("CreateRunDetails(");
        sb.append("super=").append(super.toString());
        sb.append("applicationLogConfig=").append(String.valueOf(this.applicationLogConfig));
        sb.append(", applicationId=").append(String.valueOf(this.applicationId));
        sb.append(", archiveUri=").append(String.valueOf(this.archiveUri));
        sb.append(", arguments=").append(String.valueOf(this.arguments));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", driverShape=").append(String.valueOf(this.driverShape));
        sb.append(", driverShapeConfig=").append(String.valueOf(this.driverShapeConfig));
        sb.append(", execute=").append(String.valueOf(this.execute));
        sb.append(", executorShape=").append(String.valueOf(this.executorShape));
        sb.append(", executorShapeConfig=").append(String.valueOf(this.executorShapeConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", logsBucketUri=").append(String.valueOf(this.logsBucketUri));
        sb.append(", metastoreId=").append(String.valueOf(this.metastoreId));
        sb.append(", numExecutors=").append(String.valueOf(this.numExecutors));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", poolId=").append(String.valueOf(this.poolId));
        sb.append(", sparkVersion=").append(String.valueOf(this.sparkVersion));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", warehouseBucketUri=").append(String.valueOf(this.warehouseBucketUri));
        sb.append(", maxDurationInMinutes=").append(String.valueOf(this.maxDurationInMinutes));
        sb.append(", idleTimeoutInMinutes=").append(String.valueOf(this.idleTimeoutInMinutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRunDetails)) {
            return false;
        }

        CreateRunDetails other = (CreateRunDetails) o;
        return java.util.Objects.equals(this.applicationLogConfig, other.applicationLogConfig)
                && java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(this.archiveUri, other.archiveUri)
                && java.util.Objects.equals(this.arguments, other.arguments)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.driverShape, other.driverShape)
                && java.util.Objects.equals(this.driverShapeConfig, other.driverShapeConfig)
                && java.util.Objects.equals(this.execute, other.execute)
                && java.util.Objects.equals(this.executorShape, other.executorShape)
                && java.util.Objects.equals(this.executorShapeConfig, other.executorShapeConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.logsBucketUri, other.logsBucketUri)
                && java.util.Objects.equals(this.metastoreId, other.metastoreId)
                && java.util.Objects.equals(this.numExecutors, other.numExecutors)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.poolId, other.poolId)
                && java.util.Objects.equals(this.sparkVersion, other.sparkVersion)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.warehouseBucketUri, other.warehouseBucketUri)
                && java.util.Objects.equals(this.maxDurationInMinutes, other.maxDurationInMinutes)
                && java.util.Objects.equals(this.idleTimeoutInMinutes, other.idleTimeoutInMinutes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.applicationLogConfig == null
                                ? 43
                                : this.applicationLogConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result = (result * PRIME) + (this.archiveUri == null ? 43 : this.archiveUri.hashCode());
        result = (result * PRIME) + (this.arguments == null ? 43 : this.arguments.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.driverShape == null ? 43 : this.driverShape.hashCode());
        result =
                (result * PRIME)
                        + (this.driverShapeConfig == null ? 43 : this.driverShapeConfig.hashCode());
        result = (result * PRIME) + (this.execute == null ? 43 : this.execute.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShape == null ? 43 : this.executorShape.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShapeConfig == null
                                ? 43
                                : this.executorShapeConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.logsBucketUri == null ? 43 : this.logsBucketUri.hashCode());
        result = (result * PRIME) + (this.metastoreId == null ? 43 : this.metastoreId.hashCode());
        result = (result * PRIME) + (this.numExecutors == null ? 43 : this.numExecutors.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.poolId == null ? 43 : this.poolId.hashCode());
        result = (result * PRIME) + (this.sparkVersion == null ? 43 : this.sparkVersion.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.warehouseBucketUri == null
                                ? 43
                                : this.warehouseBucketUri.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDurationInMinutes == null
                                ? 43
                                : this.maxDurationInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.idleTimeoutInMinutes == null
                                ? 43
                                : this.idleTimeoutInMinutes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
