/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceFunction <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsSourceFunction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsSourceFunction
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The function argument. */
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private java.util.List<LogAnalyticsMetaFunctionArgument> arguments;

        /**
         * The function argument.
         *
         * @param arguments the value to set
         * @return this builder
         */
        public Builder arguments(java.util.List<LogAnalyticsMetaFunctionArgument> arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }
        /** A flag inidcating whether or not the source function is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag inidcating whether or not the source function is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
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
        /** The source function name */
        @com.fasterxml.jackson.annotation.JsonProperty("functionName")
        private FunctionName functionName;

        /**
         * The source function name
         *
         * @param functionName the value to set
         * @return this builder
         */
        public Builder functionName(FunctionName functionName) {
            this.functionName = functionName;
            this.__explicitlySet__.add("functionName");
            return this;
        }
        /** The source function unique identifier as a string. */
        @com.fasterxml.jackson.annotation.JsonProperty("functionReference")
        private String functionReference;

        /**
         * The source function unique identifier as a string.
         *
         * @param functionReference the value to set
         * @return this builder
         */
        public Builder functionReference(String functionReference) {
            this.functionReference = functionReference;
            this.__explicitlySet__.add("functionReference");
            return this;
        }
        /** The source unique identifier as a string. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceReference")
        private String sourceReference;

        /**
         * The source unique identifier as a string.
         *
         * @param sourceReference the value to set
         * @return this builder
         */
        public Builder sourceReference(String sourceReference) {
            this.sourceReference = sourceReference;
            this.__explicitlySet__.add("sourceReference");
            return this;
        }
        /** Features of the source function to use for enrichment. */
        @com.fasterxml.jackson.annotation.JsonProperty("features")
        private java.util.List<String> features;

        /**
         * Features of the source function to use for enrichment.
         *
         * @param features the value to set
         * @return this builder
         */
        public Builder features(java.util.List<String> features) {
            this.features = features;
            this.__explicitlySet__.add("features");
            return this;
        }
        /** The source function unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private Long functionId;

        /**
         * The source function unique identifier.
         *
         * @param functionId the value to set
         * @return this builder
         */
        public Builder functionId(Long functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }
        /** The source function order. */
        @com.fasterxml.jackson.annotation.JsonProperty("order")
        private Long order;

        /**
         * The source function order.
         *
         * @param order the value to set
         * @return this builder
         */
        public Builder order(Long order) {
            this.order = order;
            this.__explicitlySet__.add("order");
            return this;
        }
        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         */
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /** The lookup column. */
        @com.fasterxml.jackson.annotation.JsonProperty("lookupColumn")
        private String lookupColumn;

        /**
         * The lookup column.
         *
         * @param lookupColumn the value to set
         * @return this builder
         */
        public Builder lookupColumn(String lookupColumn) {
            this.lookupColumn = lookupColumn;
            this.__explicitlySet__.add("lookupColumn");
            return this;
        }
        /** The lookup column position. */
        @com.fasterxml.jackson.annotation.JsonProperty("lookupColumnPosition")
        private Long lookupColumnPosition;

        /**
         * The lookup column position.
         *
         * @param lookupColumnPosition the value to set
         * @return this builder
         */
        public Builder lookupColumnPosition(Long lookupColumnPosition) {
            this.lookupColumnPosition = lookupColumnPosition;
            this.__explicitlySet__.add("lookupColumnPosition");
            return this;
        }
        /** The lookup display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("lookupDisplayName")
        private String lookupDisplayName;

        /**
         * The lookup display name.
         *
         * @param lookupDisplayName the value to set
         * @return this builder
         */
        public Builder lookupDisplayName(String lookupDisplayName) {
            this.lookupDisplayName = lookupDisplayName;
            this.__explicitlySet__.add("lookupDisplayName");
            return this;
        }
        /** The lookup mode. */
        @com.fasterxml.jackson.annotation.JsonProperty("lookupMode")
        private Long lookupMode;

        /**
         * The lookup mode.
         *
         * @param lookupMode the value to set
         * @return this builder
         */
        public Builder lookupMode(Long lookupMode) {
            this.lookupMode = lookupMode;
            this.__explicitlySet__.add("lookupMode");
            return this;
        }
        /** The lookup table. */
        @com.fasterxml.jackson.annotation.JsonProperty("lookupTable")
        private String lookupTable;

        /**
         * The lookup table.
         *
         * @param lookupTable the value to set
         * @return this builder
         */
        public Builder lookupTable(String lookupTable) {
            this.lookupTable = lookupTable;
            this.__explicitlySet__.add("lookupTable");
            return this;
        }
        /** The source unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        /**
         * The source unique identifier.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceFunction build() {
            LogAnalyticsSourceFunction model =
                    new LogAnalyticsSourceFunction(
                            this.arguments,
                            this.isEnabled,
                            this.function,
                            this.functionName,
                            this.functionReference,
                            this.sourceReference,
                            this.features,
                            this.functionId,
                            this.order,
                            this.isSystem,
                            this.lookupColumn,
                            this.lookupColumnPosition,
                            this.lookupDisplayName,
                            this.lookupMode,
                            this.lookupTable,
                            this.sourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceFunction model) {
            if (model.wasPropertyExplicitlySet("arguments")) {
                this.arguments(model.getArguments());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("function")) {
                this.function(model.getFunction());
            }
            if (model.wasPropertyExplicitlySet("functionName")) {
                this.functionName(model.getFunctionName());
            }
            if (model.wasPropertyExplicitlySet("functionReference")) {
                this.functionReference(model.getFunctionReference());
            }
            if (model.wasPropertyExplicitlySet("sourceReference")) {
                this.sourceReference(model.getSourceReference());
            }
            if (model.wasPropertyExplicitlySet("features")) {
                this.features(model.getFeatures());
            }
            if (model.wasPropertyExplicitlySet("functionId")) {
                this.functionId(model.getFunctionId());
            }
            if (model.wasPropertyExplicitlySet("order")) {
                this.order(model.getOrder());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("lookupColumn")) {
                this.lookupColumn(model.getLookupColumn());
            }
            if (model.wasPropertyExplicitlySet("lookupColumnPosition")) {
                this.lookupColumnPosition(model.getLookupColumnPosition());
            }
            if (model.wasPropertyExplicitlySet("lookupDisplayName")) {
                this.lookupDisplayName(model.getLookupDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lookupMode")) {
                this.lookupMode(model.getLookupMode());
            }
            if (model.wasPropertyExplicitlySet("lookupTable")) {
                this.lookupTable(model.getLookupTable());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
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

    /** The function argument. */
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final java.util.List<LogAnalyticsMetaFunctionArgument> arguments;

    /**
     * The function argument.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsMetaFunctionArgument> getArguments() {
        return arguments;
    }

    /** A flag inidcating whether or not the source function is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag inidcating whether or not the source function is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("function")
    private final LogAnalyticsMetaFunction function;

    public LogAnalyticsMetaFunction getFunction() {
        return function;
    }

    /** The source function name */
    public enum FunctionName implements com.oracle.bmc.http.internal.BmcEnum {
        Geolocation("GEOLOCATION"),
        Lookup("LOOKUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The source function name */
    @com.fasterxml.jackson.annotation.JsonProperty("functionName")
    private final FunctionName functionName;

    /**
     * The source function name
     *
     * @return the value
     */
    public FunctionName getFunctionName() {
        return functionName;
    }

    /** The source function unique identifier as a string. */
    @com.fasterxml.jackson.annotation.JsonProperty("functionReference")
    private final String functionReference;

    /**
     * The source function unique identifier as a string.
     *
     * @return the value
     */
    public String getFunctionReference() {
        return functionReference;
    }

    /** The source unique identifier as a string. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceReference")
    private final String sourceReference;

    /**
     * The source unique identifier as a string.
     *
     * @return the value
     */
    public String getSourceReference() {
        return sourceReference;
    }

    /** Features of the source function to use for enrichment. */
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    private final java.util.List<String> features;

    /**
     * Features of the source function to use for enrichment.
     *
     * @return the value
     */
    public java.util.List<String> getFeatures() {
        return features;
    }

    /** The source function unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    private final Long functionId;

    /**
     * The source function unique identifier.
     *
     * @return the value
     */
    public Long getFunctionId() {
        return functionId;
    }

    /** The source function order. */
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    private final Long order;

    /**
     * The source function order.
     *
     * @return the value
     */
    public Long getOrder() {
        return order;
    }

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     *
     * @return the value
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    /** The lookup column. */
    @com.fasterxml.jackson.annotation.JsonProperty("lookupColumn")
    private final String lookupColumn;

    /**
     * The lookup column.
     *
     * @return the value
     */
    public String getLookupColumn() {
        return lookupColumn;
    }

    /** The lookup column position. */
    @com.fasterxml.jackson.annotation.JsonProperty("lookupColumnPosition")
    private final Long lookupColumnPosition;

    /**
     * The lookup column position.
     *
     * @return the value
     */
    public Long getLookupColumnPosition() {
        return lookupColumnPosition;
    }

    /** The lookup display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("lookupDisplayName")
    private final String lookupDisplayName;

    /**
     * The lookup display name.
     *
     * @return the value
     */
    public String getLookupDisplayName() {
        return lookupDisplayName;
    }

    /** The lookup mode. */
    @com.fasterxml.jackson.annotation.JsonProperty("lookupMode")
    private final Long lookupMode;

    /**
     * The lookup mode.
     *
     * @return the value
     */
    public Long getLookupMode() {
        return lookupMode;
    }

    /** The lookup table. */
    @com.fasterxml.jackson.annotation.JsonProperty("lookupTable")
    private final String lookupTable;

    /**
     * The lookup table.
     *
     * @return the value
     */
    public String getLookupTable() {
        return lookupTable;
    }

    /** The source unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    /**
     * The source unique identifier.
     *
     * @return the value
     */
    public Long getSourceId() {
        return sourceId;
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
        sb.append("LogAnalyticsSourceFunction(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
