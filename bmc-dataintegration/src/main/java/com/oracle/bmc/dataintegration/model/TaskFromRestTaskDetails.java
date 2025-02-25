/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the Generic REST task. The endpoint and cancelEndpoint  properties are deprecated, use the properties executeRestCallConfig, cancelRestCallConfig and pollRestCallConfig for execute, cancel and polling of the calls.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TaskFromRestTaskDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TaskFromRestTaskDetails extends Task {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
        private java.util.List<InputPort> inputPorts;

        public Builder inputPorts(java.util.List<InputPort> inputPorts) {
            this.inputPorts = inputPorts;
            this.__explicitlySet__.add("inputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
        private java.util.List<OutputPort> outputPorts;

        public Builder outputPorts(java.util.List<OutputPort> outputPorts) {
            this.outputPorts = outputPorts;
            this.__explicitlySet__.add("outputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
        private ConfigValues opConfigValues;

        public Builder opConfigValues(ConfigValues opConfigValues) {
            this.opConfigValues = opConfigValues;
            this.__explicitlySet__.add("opConfigValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
        private ConfigProvider configProviderDelegate;

        public Builder configProviderDelegate(ConfigProvider configProviderDelegate) {
            this.configProviderDelegate = configProviderDelegate;
            this.__explicitlySet__.add("configProviderDelegate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isConcurrentAllowed")
        private Boolean isConcurrentAllowed;

        public Builder isConcurrentAllowed(Boolean isConcurrentAllowed) {
            this.isConcurrentAllowed = isConcurrentAllowed;
            this.__explicitlySet__.add("isConcurrentAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
        private java.util.Map<String, String> keyMap;

        public Builder keyMap(java.util.Map<String, String> keyMap) {
            this.keyMap = keyMap;
            this.__explicitlySet__.add("keyMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authDetails")
        private AuthDetails authDetails;

        public Builder authDetails(AuthDetails authDetails) {
            this.authDetails = authDetails;
            this.__explicitlySet__.add("authDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authConfig")
        private AuthConfig authConfig;

        public Builder authConfig(AuthConfig authConfig) {
            this.authConfig = authConfig;
            this.__explicitlySet__.add("authConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private Expression endpoint;

        public Builder endpoint(Expression endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }
        /**
         * The REST method to use. This property is deprecated, use ExecuteRestCallConfig's methodType property instead.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("methodType")
        private MethodType methodType;

        /**
         * The REST method to use. This property is deprecated, use ExecuteRestCallConfig's methodType property instead.
         * @param methodType the value to set
         * @return this builder
         **/
        public Builder methodType(MethodType methodType) {
            this.methodType = methodType;
            this.__explicitlySet__.add("methodType");
            return this;
        }
        /**
         * The headers for the REST call. This property is deprecated, use ExecuteRestCallConfig's headers property instead.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private Object headers;

        /**
         * The headers for the REST call. This property is deprecated, use ExecuteRestCallConfig's headers property instead.
         * @param headers the value to set
         * @return this builder
         **/
        public Builder headers(Object headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }
        /**
         * JSON data for payload body. This property is deprecated, use ExecuteRestCallConfig's payload config param instead.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jsonData")
        private String jsonData;

        /**
         * JSON data for payload body. This property is deprecated, use ExecuteRestCallConfig's payload config param instead.
         * @param jsonData the value to set
         * @return this builder
         **/
        public Builder jsonData(String jsonData) {
            this.jsonData = jsonData;
            this.__explicitlySet__.add("jsonData");
            return this;
        }
        /**
         * The REST invocation pattern to use. ASYNC_OCI_WORKREQUEST is being deprecated as well as cancelEndpoint/MethodType.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("apiCallMode")
        private ApiCallMode apiCallMode;

        /**
         * The REST invocation pattern to use. ASYNC_OCI_WORKREQUEST is being deprecated as well as cancelEndpoint/MethodType.
         * @param apiCallMode the value to set
         * @return this builder
         **/
        public Builder apiCallMode(ApiCallMode apiCallMode) {
            this.apiCallMode = apiCallMode;
            this.__explicitlySet__.add("apiCallMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cancelEndpoint")
        private Expression cancelEndpoint;

        public Builder cancelEndpoint(Expression cancelEndpoint) {
            this.cancelEndpoint = cancelEndpoint;
            this.__explicitlySet__.add("cancelEndpoint");
            return this;
        }
        /**
         * The REST method to use for canceling the original request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cancelMethodType")
        private CancelMethodType cancelMethodType;

        /**
         * The REST method to use for canceling the original request.
         * @param cancelMethodType the value to set
         * @return this builder
         **/
        public Builder cancelMethodType(CancelMethodType cancelMethodType) {
            this.cancelMethodType = cancelMethodType;
            this.__explicitlySet__.add("cancelMethodType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executeRestCallConfig")
        private ExecuteRestCallConfig executeRestCallConfig;

        public Builder executeRestCallConfig(ExecuteRestCallConfig executeRestCallConfig) {
            this.executeRestCallConfig = executeRestCallConfig;
            this.__explicitlySet__.add("executeRestCallConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cancelRestCallConfig")
        private CancelRestCallConfig cancelRestCallConfig;

        public Builder cancelRestCallConfig(CancelRestCallConfig cancelRestCallConfig) {
            this.cancelRestCallConfig = cancelRestCallConfig;
            this.__explicitlySet__.add("cancelRestCallConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pollRestCallConfig")
        private PollRestCallConfig pollRestCallConfig;

        public Builder pollRestCallConfig(PollRestCallConfig pollRestCallConfig) {
            this.pollRestCallConfig = pollRestCallConfig;
            this.__explicitlySet__.add("pollRestCallConfig");
            return this;
        }
        /**
         * List of typed expressions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("typedExpressions")
        private java.util.List<TypedExpression> typedExpressions;

        /**
         * List of typed expressions.
         * @param typedExpressions the value to set
         * @return this builder
         **/
        public Builder typedExpressions(java.util.List<TypedExpression> typedExpressions) {
            this.typedExpressions = typedExpressions;
            this.__explicitlySet__.add("typedExpressions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaskFromRestTaskDetails build() {
            TaskFromRestTaskDetails model =
                    new TaskFromRestTaskDetails(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.objectStatus,
                            this.identifier,
                            this.inputPorts,
                            this.outputPorts,
                            this.parameters,
                            this.opConfigValues,
                            this.configProviderDelegate,
                            this.isConcurrentAllowed,
                            this.metadata,
                            this.keyMap,
                            this.registryMetadata,
                            this.authDetails,
                            this.authConfig,
                            this.endpoint,
                            this.methodType,
                            this.headers,
                            this.jsonData,
                            this.apiCallMode,
                            this.cancelEndpoint,
                            this.cancelMethodType,
                            this.executeRestCallConfig,
                            this.cancelRestCallConfig,
                            this.pollRestCallConfig,
                            this.typedExpressions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskFromRestTaskDetails model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("inputPorts")) {
                this.inputPorts(model.getInputPorts());
            }
            if (model.wasPropertyExplicitlySet("outputPorts")) {
                this.outputPorts(model.getOutputPorts());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("opConfigValues")) {
                this.opConfigValues(model.getOpConfigValues());
            }
            if (model.wasPropertyExplicitlySet("configProviderDelegate")) {
                this.configProviderDelegate(model.getConfigProviderDelegate());
            }
            if (model.wasPropertyExplicitlySet("isConcurrentAllowed")) {
                this.isConcurrentAllowed(model.getIsConcurrentAllowed());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("keyMap")) {
                this.keyMap(model.getKeyMap());
            }
            if (model.wasPropertyExplicitlySet("registryMetadata")) {
                this.registryMetadata(model.getRegistryMetadata());
            }
            if (model.wasPropertyExplicitlySet("authDetails")) {
                this.authDetails(model.getAuthDetails());
            }
            if (model.wasPropertyExplicitlySet("authConfig")) {
                this.authConfig(model.getAuthConfig());
            }
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
            }
            if (model.wasPropertyExplicitlySet("methodType")) {
                this.methodType(model.getMethodType());
            }
            if (model.wasPropertyExplicitlySet("headers")) {
                this.headers(model.getHeaders());
            }
            if (model.wasPropertyExplicitlySet("jsonData")) {
                this.jsonData(model.getJsonData());
            }
            if (model.wasPropertyExplicitlySet("apiCallMode")) {
                this.apiCallMode(model.getApiCallMode());
            }
            if (model.wasPropertyExplicitlySet("cancelEndpoint")) {
                this.cancelEndpoint(model.getCancelEndpoint());
            }
            if (model.wasPropertyExplicitlySet("cancelMethodType")) {
                this.cancelMethodType(model.getCancelMethodType());
            }
            if (model.wasPropertyExplicitlySet("executeRestCallConfig")) {
                this.executeRestCallConfig(model.getExecuteRestCallConfig());
            }
            if (model.wasPropertyExplicitlySet("cancelRestCallConfig")) {
                this.cancelRestCallConfig(model.getCancelRestCallConfig());
            }
            if (model.wasPropertyExplicitlySet("pollRestCallConfig")) {
                this.pollRestCallConfig(model.getPollRestCallConfig());
            }
            if (model.wasPropertyExplicitlySet("typedExpressions")) {
                this.typedExpressions(model.getTypedExpressions());
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

    @Deprecated
    public TaskFromRestTaskDetails(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            java.util.List<InputPort> inputPorts,
            java.util.List<OutputPort> outputPorts,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            ConfigProvider configProviderDelegate,
            Boolean isConcurrentAllowed,
            ObjectMetadata metadata,
            java.util.Map<String, String> keyMap,
            RegistryMetadata registryMetadata,
            AuthDetails authDetails,
            AuthConfig authConfig,
            Expression endpoint,
            MethodType methodType,
            Object headers,
            String jsonData,
            ApiCallMode apiCallMode,
            Expression cancelEndpoint,
            CancelMethodType cancelMethodType,
            ExecuteRestCallConfig executeRestCallConfig,
            CancelRestCallConfig cancelRestCallConfig,
            PollRestCallConfig pollRestCallConfig,
            java.util.List<TypedExpression> typedExpressions) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectVersion,
                objectStatus,
                identifier,
                inputPorts,
                outputPorts,
                parameters,
                opConfigValues,
                configProviderDelegate,
                isConcurrentAllowed,
                metadata,
                keyMap,
                registryMetadata);
        this.authDetails = authDetails;
        this.authConfig = authConfig;
        this.endpoint = endpoint;
        this.methodType = methodType;
        this.headers = headers;
        this.jsonData = jsonData;
        this.apiCallMode = apiCallMode;
        this.cancelEndpoint = cancelEndpoint;
        this.cancelMethodType = cancelMethodType;
        this.executeRestCallConfig = executeRestCallConfig;
        this.cancelRestCallConfig = cancelRestCallConfig;
        this.pollRestCallConfig = pollRestCallConfig;
        this.typedExpressions = typedExpressions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("authDetails")
    private final AuthDetails authDetails;

    public AuthDetails getAuthDetails() {
        return authDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("authConfig")
    private final AuthConfig authConfig;

    public AuthConfig getAuthConfig() {
        return authConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final Expression endpoint;

    public Expression getEndpoint() {
        return endpoint;
    }

    /**
     * The REST method to use. This property is deprecated, use ExecuteRestCallConfig's methodType property instead.
     **/
    public enum MethodType {
        Get("GET"),
        Post("POST"),
        Patch("PATCH"),
        Delete("DELETE"),
        Put("PUT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MethodType.class);

        private final String value;
        private static java.util.Map<String, MethodType> map;

        static {
            map = new java.util.HashMap<>();
            for (MethodType v : MethodType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MethodType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MethodType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MethodType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The REST method to use. This property is deprecated, use ExecuteRestCallConfig's methodType property instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("methodType")
    private final MethodType methodType;

    /**
     * The REST method to use. This property is deprecated, use ExecuteRestCallConfig's methodType property instead.
     * @return the value
     **/
    public MethodType getMethodType() {
        return methodType;
    }

    /**
     * The headers for the REST call. This property is deprecated, use ExecuteRestCallConfig's headers property instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final Object headers;

    /**
     * The headers for the REST call. This property is deprecated, use ExecuteRestCallConfig's headers property instead.
     * @return the value
     **/
    public Object getHeaders() {
        return headers;
    }

    /**
     * JSON data for payload body. This property is deprecated, use ExecuteRestCallConfig's payload config param instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jsonData")
    private final String jsonData;

    /**
     * JSON data for payload body. This property is deprecated, use ExecuteRestCallConfig's payload config param instead.
     * @return the value
     **/
    public String getJsonData() {
        return jsonData;
    }

    /**
     * The REST invocation pattern to use. ASYNC_OCI_WORKREQUEST is being deprecated as well as cancelEndpoint/MethodType.
     **/
    public enum ApiCallMode {
        Synchronous("SYNCHRONOUS"),
        AsyncOciWorkrequest("ASYNC_OCI_WORKREQUEST"),
        AsyncGeneric("ASYNC_GENERIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ApiCallMode.class);

        private final String value;
        private static java.util.Map<String, ApiCallMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ApiCallMode v : ApiCallMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ApiCallMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ApiCallMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ApiCallMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The REST invocation pattern to use. ASYNC_OCI_WORKREQUEST is being deprecated as well as cancelEndpoint/MethodType.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apiCallMode")
    private final ApiCallMode apiCallMode;

    /**
     * The REST invocation pattern to use. ASYNC_OCI_WORKREQUEST is being deprecated as well as cancelEndpoint/MethodType.
     * @return the value
     **/
    public ApiCallMode getApiCallMode() {
        return apiCallMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cancelEndpoint")
    private final Expression cancelEndpoint;

    public Expression getCancelEndpoint() {
        return cancelEndpoint;
    }

    /**
     * The REST method to use for canceling the original request.
     **/
    public enum CancelMethodType {
        Get("GET"),
        Post("POST"),
        Patch("PATCH"),
        Delete("DELETE"),
        Put("PUT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CancelMethodType.class);

        private final String value;
        private static java.util.Map<String, CancelMethodType> map;

        static {
            map = new java.util.HashMap<>();
            for (CancelMethodType v : CancelMethodType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CancelMethodType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CancelMethodType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CancelMethodType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The REST method to use for canceling the original request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cancelMethodType")
    private final CancelMethodType cancelMethodType;

    /**
     * The REST method to use for canceling the original request.
     * @return the value
     **/
    public CancelMethodType getCancelMethodType() {
        return cancelMethodType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executeRestCallConfig")
    private final ExecuteRestCallConfig executeRestCallConfig;

    public ExecuteRestCallConfig getExecuteRestCallConfig() {
        return executeRestCallConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cancelRestCallConfig")
    private final CancelRestCallConfig cancelRestCallConfig;

    public CancelRestCallConfig getCancelRestCallConfig() {
        return cancelRestCallConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pollRestCallConfig")
    private final PollRestCallConfig pollRestCallConfig;

    public PollRestCallConfig getPollRestCallConfig() {
        return pollRestCallConfig;
    }

    /**
     * List of typed expressions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typedExpressions")
    private final java.util.List<TypedExpression> typedExpressions;

    /**
     * List of typed expressions.
     * @return the value
     **/
    public java.util.List<TypedExpression> getTypedExpressions() {
        return typedExpressions;
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
        sb.append("TaskFromRestTaskDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", authDetails=").append(String.valueOf(this.authDetails));
        sb.append(", authConfig=").append(String.valueOf(this.authConfig));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", methodType=").append(String.valueOf(this.methodType));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append(", jsonData=").append(String.valueOf(this.jsonData));
        sb.append(", apiCallMode=").append(String.valueOf(this.apiCallMode));
        sb.append(", cancelEndpoint=").append(String.valueOf(this.cancelEndpoint));
        sb.append(", cancelMethodType=").append(String.valueOf(this.cancelMethodType));
        sb.append(", executeRestCallConfig=").append(String.valueOf(this.executeRestCallConfig));
        sb.append(", cancelRestCallConfig=").append(String.valueOf(this.cancelRestCallConfig));
        sb.append(", pollRestCallConfig=").append(String.valueOf(this.pollRestCallConfig));
        sb.append(", typedExpressions=").append(String.valueOf(this.typedExpressions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskFromRestTaskDetails)) {
            return false;
        }

        TaskFromRestTaskDetails other = (TaskFromRestTaskDetails) o;
        return java.util.Objects.equals(this.authDetails, other.authDetails)
                && java.util.Objects.equals(this.authConfig, other.authConfig)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && java.util.Objects.equals(this.methodType, other.methodType)
                && java.util.Objects.equals(this.headers, other.headers)
                && java.util.Objects.equals(this.jsonData, other.jsonData)
                && java.util.Objects.equals(this.apiCallMode, other.apiCallMode)
                && java.util.Objects.equals(this.cancelEndpoint, other.cancelEndpoint)
                && java.util.Objects.equals(this.cancelMethodType, other.cancelMethodType)
                && java.util.Objects.equals(this.executeRestCallConfig, other.executeRestCallConfig)
                && java.util.Objects.equals(this.cancelRestCallConfig, other.cancelRestCallConfig)
                && java.util.Objects.equals(this.pollRestCallConfig, other.pollRestCallConfig)
                && java.util.Objects.equals(this.typedExpressions, other.typedExpressions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.authDetails == null ? 43 : this.authDetails.hashCode());
        result = (result * PRIME) + (this.authConfig == null ? 43 : this.authConfig.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result = (result * PRIME) + (this.methodType == null ? 43 : this.methodType.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result = (result * PRIME) + (this.jsonData == null ? 43 : this.jsonData.hashCode());
        result = (result * PRIME) + (this.apiCallMode == null ? 43 : this.apiCallMode.hashCode());
        result =
                (result * PRIME)
                        + (this.cancelEndpoint == null ? 43 : this.cancelEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.cancelMethodType == null ? 43 : this.cancelMethodType.hashCode());
        result =
                (result * PRIME)
                        + (this.executeRestCallConfig == null
                                ? 43
                                : this.executeRestCallConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.cancelRestCallConfig == null
                                ? 43
                                : this.cancelRestCallConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.pollRestCallConfig == null
                                ? 43
                                : this.pollRestCallConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.typedExpressions == null ? 43 : this.typedExpressions.hashCode());
        return result;
    }
}
