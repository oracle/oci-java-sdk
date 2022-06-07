/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceFunction
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsSourceFunction.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsSourceFunction {
    @Deprecated
    @java.beans.ConstructorProperties({
        "arguments",
        "isEnabled",
        "function",
        "functionName",
        "functionReference",
        "sourceReference",
        "features",
        "functionId",
        "order",
        "isSystem",
        "lookupColumn",
        "lookupColumnPosition",
        "lookupDisplayName",
        "lookupMode",
        "lookupTable",
        "sourceId"
    })
    public LogAnalyticsSourceFunction(
            java.util.List<LogAnalyticsMetaFunctionArgument> arguments,
            Boolean isEnabled,
            LogAnalyticsMetaFunction function,
            FunctionName functionName,
            String functionReference,
            String sourceReference,
            java.util.List<String> features,
            Long functionId,
            Long order,
            Boolean isSystem,
            String lookupColumn,
            Long lookupColumnPosition,
            String lookupDisplayName,
            Long lookupMode,
            String lookupTable,
            Long sourceId) {
        super();
        this.arguments = arguments;
        this.isEnabled = isEnabled;
        this.function = function;
        this.functionName = functionName;
        this.functionReference = functionReference;
        this.sourceReference = sourceReference;
        this.features = features;
        this.functionId = functionId;
        this.order = order;
        this.isSystem = isSystem;
        this.lookupColumn = lookupColumn;
        this.lookupColumnPosition = lookupColumnPosition;
        this.lookupDisplayName = lookupDisplayName;
        this.lookupMode = lookupMode;
        this.lookupTable = lookupTable;
        this.sourceId = sourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<LogAnalyticsMetaFunctionArgument> arguments;

        public Builder arguments(java.util.List<LogAnalyticsMetaFunctionArgument> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("function")
        private LogAnalyticsMetaFunction function;

        public Builder function(LogAnalyticsMetaFunction function) {
            this.function = function;
            this.__explicitlySet__.add("function");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("functionName")
        private FunctionName functionName;

        public Builder functionName(FunctionName functionName) {
            this.functionName = functionName;
            this.__explicitlySet__.add("functionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("functionReference")
        private String functionReference;

        public Builder functionReference(String functionReference) {
            this.functionReference = functionReference;
            this.__explicitlySet__.add("functionReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceReference")
        private String sourceReference;

        public Builder sourceReference(String sourceReference) {
            this.sourceReference = sourceReference;
            this.__explicitlySet__.add("sourceReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("features")
        private java.util.List<String> features;

        public Builder features(java.util.List<String> features) {
            this.features = features;
            this.__explicitlySet__.add("features");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private Long functionId;

        public Builder functionId(Long functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("order")
        private Long order;

        public Builder order(Long order) {
            this.order = order;
            this.__explicitlySet__.add("order");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupColumn")
        private String lookupColumn;

        public Builder lookupColumn(String lookupColumn) {
            this.lookupColumn = lookupColumn;
            this.__explicitlySet__.add("lookupColumn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupColumnPosition")
        private Long lookupColumnPosition;

        public Builder lookupColumnPosition(Long lookupColumnPosition) {
            this.lookupColumnPosition = lookupColumnPosition;
            this.__explicitlySet__.add("lookupColumnPosition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupDisplayName")
        private String lookupDisplayName;

        public Builder lookupDisplayName(String lookupDisplayName) {
            this.lookupDisplayName = lookupDisplayName;
            this.__explicitlySet__.add("lookupDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupMode")
        private Long lookupMode;

        public Builder lookupMode(Long lookupMode) {
            this.lookupMode = lookupMode;
            this.__explicitlySet__.add("lookupMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupTable")
        private String lookupTable;

        public Builder lookupTable(String lookupTable) {
            this.lookupTable = lookupTable;
            this.__explicitlySet__.add("lookupTable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceFunction build() {
            LogAnalyticsSourceFunction __instance__ =
                    new LogAnalyticsSourceFunction(
                            arguments,
                            isEnabled,
                            function,
                            functionName,
                            functionReference,
                            sourceReference,
                            features,
                            functionId,
                            order,
                            isSystem,
                            lookupColumn,
                            lookupColumnPosition,
                            lookupDisplayName,
                            lookupMode,
                            lookupTable,
                            sourceId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceFunction o) {
            Builder copiedBuilder =
                    arguments(o.getArguments())
                            .isEnabled(o.getIsEnabled())
                            .function(o.getFunction())
                            .functionName(o.getFunctionName())
                            .functionReference(o.getFunctionReference())
                            .sourceReference(o.getSourceReference())
                            .features(o.getFeatures())
                            .functionId(o.getFunctionId())
                            .order(o.getOrder())
                            .isSystem(o.getIsSystem())
                            .lookupColumn(o.getLookupColumn())
                            .lookupColumnPosition(o.getLookupColumnPosition())
                            .lookupDisplayName(o.getLookupDisplayName())
                            .lookupMode(o.getLookupMode())
                            .lookupTable(o.getLookupTable())
                            .sourceId(o.getSourceId());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The function argument.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<LogAnalyticsMetaFunctionArgument> arguments;

    public java.util.List<LogAnalyticsMetaFunctionArgument> getArguments() {
        return arguments;
    }

    /**
     * A flag inidcating whether or not the source function is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("function")
    private final LogAnalyticsMetaFunction function;

    public LogAnalyticsMetaFunction getFunction() {
        return function;
    }

    /**
     * The source function name
     **/
    public enum FunctionName {
        Geolocation("GEOLOCATION"),
        Lookup("LOOKUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FunctionName.class);

        private final String value;
        private static java.util.Map<String, FunctionName> map;

        static {
            map = new java.util.HashMap<>();
            for (FunctionName v : FunctionName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FunctionName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FunctionName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FunctionName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The source function name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionName")
    private final FunctionName functionName;

    public FunctionName getFunctionName() {
        return functionName;
    }

    /**
     * The source function unique identifier as a string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionReference")
    private final String functionReference;

    public String getFunctionReference() {
        return functionReference;
    }

    /**
     * The source unique identifier as a string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceReference")
    private final String sourceReference;

    public String getSourceReference() {
        return sourceReference;
    }

    /**
     * Features of the source function to use for enrichment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    private final java.util.List<String> features;

    public java.util.List<String> getFeatures() {
        return features;
    }

    /**
     * The source function unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    private final Long functionId;

    public Long getFunctionId() {
        return functionId;
    }

    /**
     * The source function order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    private final Long order;

    public Long getOrder() {
        return order;
    }

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * The lookup column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupColumn")
    private final String lookupColumn;

    public String getLookupColumn() {
        return lookupColumn;
    }

    /**
     * The lookup column position.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupColumnPosition")
    private final Long lookupColumnPosition;

    public Long getLookupColumnPosition() {
        return lookupColumnPosition;
    }

    /**
     * The lookup display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupDisplayName")
    private final String lookupDisplayName;

    public String getLookupDisplayName() {
        return lookupDisplayName;
    }

    /**
     * The lookup  mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupMode")
    private final Long lookupMode;

    public Long getLookupMode() {
        return lookupMode;
    }

    /**
     * The lookup table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupTable")
    private final String lookupTable;

    public String getLookupTable() {
        return lookupTable;
    }

    /**
     * The source unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    public Long getSourceId() {
        return sourceId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsSourceFunction(");
        sb.append("arguments=").append(String.valueOf(this.arguments));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", function=").append(String.valueOf(this.function));
        sb.append(", functionName=").append(String.valueOf(this.functionName));
        sb.append(", functionReference=").append(String.valueOf(this.functionReference));
        sb.append(", sourceReference=").append(String.valueOf(this.sourceReference));
        sb.append(", features=").append(String.valueOf(this.features));
        sb.append(", functionId=").append(String.valueOf(this.functionId));
        sb.append(", order=").append(String.valueOf(this.order));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", lookupColumn=").append(String.valueOf(this.lookupColumn));
        sb.append(", lookupColumnPosition=").append(String.valueOf(this.lookupColumnPosition));
        sb.append(", lookupDisplayName=").append(String.valueOf(this.lookupDisplayName));
        sb.append(", lookupMode=").append(String.valueOf(this.lookupMode));
        sb.append(", lookupTable=").append(String.valueOf(this.lookupTable));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsSourceFunction)) {
            return false;
        }

        LogAnalyticsSourceFunction other = (LogAnalyticsSourceFunction) o;
        return java.util.Objects.equals(this.arguments, other.arguments)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.function, other.function)
                && java.util.Objects.equals(this.functionName, other.functionName)
                && java.util.Objects.equals(this.functionReference, other.functionReference)
                && java.util.Objects.equals(this.sourceReference, other.sourceReference)
                && java.util.Objects.equals(this.features, other.features)
                && java.util.Objects.equals(this.functionId, other.functionId)
                && java.util.Objects.equals(this.order, other.order)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.lookupColumn, other.lookupColumn)
                && java.util.Objects.equals(this.lookupColumnPosition, other.lookupColumnPosition)
                && java.util.Objects.equals(this.lookupDisplayName, other.lookupDisplayName)
                && java.util.Objects.equals(this.lookupMode, other.lookupMode)
                && java.util.Objects.equals(this.lookupTable, other.lookupTable)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.arguments == null ? 43 : this.arguments.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.function == null ? 43 : this.function.hashCode());
        result = (result * PRIME) + (this.functionName == null ? 43 : this.functionName.hashCode());
        result =
                (result * PRIME)
                        + (this.functionReference == null ? 43 : this.functionReference.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceReference == null ? 43 : this.sourceReference.hashCode());
        result = (result * PRIME) + (this.features == null ? 43 : this.features.hashCode());
        result = (result * PRIME) + (this.functionId == null ? 43 : this.functionId.hashCode());
        result = (result * PRIME) + (this.order == null ? 43 : this.order.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.lookupColumn == null ? 43 : this.lookupColumn.hashCode());
        result =
                (result * PRIME)
                        + (this.lookupColumnPosition == null
                                ? 43
                                : this.lookupColumnPosition.hashCode());
        result =
                (result * PRIME)
                        + (this.lookupDisplayName == null ? 43 : this.lookupDisplayName.hashCode());
        result = (result * PRIME) + (this.lookupMode == null ? 43 : this.lookupMode.hashCode());
        result = (result * PRIME) + (this.lookupTable == null ? 43 : this.lookupTable.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
