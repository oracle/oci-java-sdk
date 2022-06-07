/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsMetaFunctionArgument
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
    builder = LogAnalyticsMetaFunctionArgument.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsMetaFunctionArgument {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isOverrideOutputFields",
        "argumentDisplayName",
        "argumentExample",
        "argumentService",
        "argumentDataType",
        "argumentDescription",
        "argumentName",
        "argumentOrder",
        "argumentType",
        "argumentId",
        "argumentLookupColumn",
        "argumentLookupColumnPosition",
        "argumentValue",
        "argumentReference"
    })
    public LogAnalyticsMetaFunctionArgument(
            Boolean isOverrideOutputFields,
            String argumentDisplayName,
            String argumentExample,
            String argumentService,
            String argumentDataType,
            String argumentDescription,
            String argumentName,
            Long argumentOrder,
            Long argumentType,
            Long argumentId,
            String argumentLookupColumn,
            Long argumentLookupColumnPosition,
            String argumentValue,
            String argumentReference) {
        super();
        this.isOverrideOutputFields = isOverrideOutputFields;
        this.argumentDisplayName = argumentDisplayName;
        this.argumentExample = argumentExample;
        this.argumentService = argumentService;
        this.argumentDataType = argumentDataType;
        this.argumentDescription = argumentDescription;
        this.argumentName = argumentName;
        this.argumentOrder = argumentOrder;
        this.argumentType = argumentType;
        this.argumentId = argumentId;
        this.argumentLookupColumn = argumentLookupColumn;
        this.argumentLookupColumnPosition = argumentLookupColumnPosition;
        this.argumentValue = argumentValue;
        this.argumentReference = argumentReference;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideOutputFields")
        private Boolean isOverrideOutputFields;

        public Builder isOverrideOutputFields(Boolean isOverrideOutputFields) {
            this.isOverrideOutputFields = isOverrideOutputFields;
            this.__explicitlySet__.add("isOverrideOutputFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentDisplayName")
        private String argumentDisplayName;

        public Builder argumentDisplayName(String argumentDisplayName) {
            this.argumentDisplayName = argumentDisplayName;
            this.__explicitlySet__.add("argumentDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentExample")
        private String argumentExample;

        public Builder argumentExample(String argumentExample) {
            this.argumentExample = argumentExample;
            this.__explicitlySet__.add("argumentExample");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentService")
        private String argumentService;

        public Builder argumentService(String argumentService) {
            this.argumentService = argumentService;
            this.__explicitlySet__.add("argumentService");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentDataType")
        private String argumentDataType;

        public Builder argumentDataType(String argumentDataType) {
            this.argumentDataType = argumentDataType;
            this.__explicitlySet__.add("argumentDataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentDescription")
        private String argumentDescription;

        public Builder argumentDescription(String argumentDescription) {
            this.argumentDescription = argumentDescription;
            this.__explicitlySet__.add("argumentDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentName")
        private String argumentName;

        public Builder argumentName(String argumentName) {
            this.argumentName = argumentName;
            this.__explicitlySet__.add("argumentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentOrder")
        private Long argumentOrder;

        public Builder argumentOrder(Long argumentOrder) {
            this.argumentOrder = argumentOrder;
            this.__explicitlySet__.add("argumentOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentType")
        private Long argumentType;

        public Builder argumentType(Long argumentType) {
            this.argumentType = argumentType;
            this.__explicitlySet__.add("argumentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentId")
        private Long argumentId;

        public Builder argumentId(Long argumentId) {
            this.argumentId = argumentId;
            this.__explicitlySet__.add("argumentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumn")
        private String argumentLookupColumn;

        public Builder argumentLookupColumn(String argumentLookupColumn) {
            this.argumentLookupColumn = argumentLookupColumn;
            this.__explicitlySet__.add("argumentLookupColumn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumnPosition")
        private Long argumentLookupColumnPosition;

        public Builder argumentLookupColumnPosition(Long argumentLookupColumnPosition) {
            this.argumentLookupColumnPosition = argumentLookupColumnPosition;
            this.__explicitlySet__.add("argumentLookupColumnPosition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentValue")
        private String argumentValue;

        public Builder argumentValue(String argumentValue) {
            this.argumentValue = argumentValue;
            this.__explicitlySet__.add("argumentValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("argumentReference")
        private String argumentReference;

        public Builder argumentReference(String argumentReference) {
            this.argumentReference = argumentReference;
            this.__explicitlySet__.add("argumentReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsMetaFunctionArgument build() {
            LogAnalyticsMetaFunctionArgument __instance__ =
                    new LogAnalyticsMetaFunctionArgument(
                            isOverrideOutputFields,
                            argumentDisplayName,
                            argumentExample,
                            argumentService,
                            argumentDataType,
                            argumentDescription,
                            argumentName,
                            argumentOrder,
                            argumentType,
                            argumentId,
                            argumentLookupColumn,
                            argumentLookupColumnPosition,
                            argumentValue,
                            argumentReference);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsMetaFunctionArgument o) {
            Builder copiedBuilder =
                    isOverrideOutputFields(o.getIsOverrideOutputFields())
                            .argumentDisplayName(o.getArgumentDisplayName())
                            .argumentExample(o.getArgumentExample())
                            .argumentService(o.getArgumentService())
                            .argumentDataType(o.getArgumentDataType())
                            .argumentDescription(o.getArgumentDescription())
                            .argumentName(o.getArgumentName())
                            .argumentOrder(o.getArgumentOrder())
                            .argumentType(o.getArgumentType())
                            .argumentId(o.getArgumentId())
                            .argumentLookupColumn(o.getArgumentLookupColumn())
                            .argumentLookupColumnPosition(o.getArgumentLookupColumnPosition())
                            .argumentValue(o.getArgumentValue())
                            .argumentReference(o.getArgumentReference());

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
     * The override output fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideOutputFields")
    private final Boolean isOverrideOutputFields;

    public Boolean getIsOverrideOutputFields() {
        return isOverrideOutputFields;
    }

    /**
     * The argument display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentDisplayName")
    private final String argumentDisplayName;

    public String getArgumentDisplayName() {
        return argumentDisplayName;
    }

    /**
     * The argument example.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentExample")
    private final String argumentExample;

    public String getArgumentExample() {
        return argumentExample;
    }

    /**
     * The argument service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentService")
    private final String argumentService;

    public String getArgumentService() {
        return argumentService;
    }

    /**
     * The argument data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentDataType")
    private final String argumentDataType;

    public String getArgumentDataType() {
        return argumentDataType;
    }

    /**
     * The argument description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentDescription")
    private final String argumentDescription;

    public String getArgumentDescription() {
        return argumentDescription;
    }

    /**
     * The argument name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentName")
    private final String argumentName;

    public String getArgumentName() {
        return argumentName;
    }

    /**
     * The argument order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentOrder")
    private final Long argumentOrder;

    public Long getArgumentOrder() {
        return argumentOrder;
    }

    /**
     * The argument type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentType")
    private final Long argumentType;

    public Long getArgumentType() {
        return argumentType;
    }

    /**
     * The argument unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentId")
    private final Long argumentId;

    public Long getArgumentId() {
        return argumentId;
    }

    /**
     * The lookup column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumn")
    private final String argumentLookupColumn;

    public String getArgumentLookupColumn() {
        return argumentLookupColumn;
    }

    /**
     * The lookup column position.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumnPosition")
    private final Long argumentLookupColumnPosition;

    public Long getArgumentLookupColumnPosition() {
        return argumentLookupColumnPosition;
    }

    /**
     * The argument value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentValue")
    private final String argumentValue;

    public String getArgumentValue() {
        return argumentValue;
    }

    /**
     * The argument unique identifier as a string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentReference")
    private final String argumentReference;

    public String getArgumentReference() {
        return argumentReference;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsMetaFunctionArgument(");
        sb.append("isOverrideOutputFields=").append(String.valueOf(this.isOverrideOutputFields));
        sb.append(", argumentDisplayName=").append(String.valueOf(this.argumentDisplayName));
        sb.append(", argumentExample=").append(String.valueOf(this.argumentExample));
        sb.append(", argumentService=").append(String.valueOf(this.argumentService));
        sb.append(", argumentDataType=").append(String.valueOf(this.argumentDataType));
        sb.append(", argumentDescription=").append(String.valueOf(this.argumentDescription));
        sb.append(", argumentName=").append(String.valueOf(this.argumentName));
        sb.append(", argumentOrder=").append(String.valueOf(this.argumentOrder));
        sb.append(", argumentType=").append(String.valueOf(this.argumentType));
        sb.append(", argumentId=").append(String.valueOf(this.argumentId));
        sb.append(", argumentLookupColumn=").append(String.valueOf(this.argumentLookupColumn));
        sb.append(", argumentLookupColumnPosition=")
                .append(String.valueOf(this.argumentLookupColumnPosition));
        sb.append(", argumentValue=").append(String.valueOf(this.argumentValue));
        sb.append(", argumentReference=").append(String.valueOf(this.argumentReference));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsMetaFunctionArgument)) {
            return false;
        }

        LogAnalyticsMetaFunctionArgument other = (LogAnalyticsMetaFunctionArgument) o;
        return java.util.Objects.equals(this.isOverrideOutputFields, other.isOverrideOutputFields)
                && java.util.Objects.equals(this.argumentDisplayName, other.argumentDisplayName)
                && java.util.Objects.equals(this.argumentExample, other.argumentExample)
                && java.util.Objects.equals(this.argumentService, other.argumentService)
                && java.util.Objects.equals(this.argumentDataType, other.argumentDataType)
                && java.util.Objects.equals(this.argumentDescription, other.argumentDescription)
                && java.util.Objects.equals(this.argumentName, other.argumentName)
                && java.util.Objects.equals(this.argumentOrder, other.argumentOrder)
                && java.util.Objects.equals(this.argumentType, other.argumentType)
                && java.util.Objects.equals(this.argumentId, other.argumentId)
                && java.util.Objects.equals(this.argumentLookupColumn, other.argumentLookupColumn)
                && java.util.Objects.equals(
                        this.argumentLookupColumnPosition, other.argumentLookupColumnPosition)
                && java.util.Objects.equals(this.argumentValue, other.argumentValue)
                && java.util.Objects.equals(this.argumentReference, other.argumentReference)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isOverrideOutputFields == null
                                ? 43
                                : this.isOverrideOutputFields.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentDisplayName == null
                                ? 43
                                : this.argumentDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentExample == null ? 43 : this.argumentExample.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentService == null ? 43 : this.argumentService.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentDataType == null ? 43 : this.argumentDataType.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentDescription == null
                                ? 43
                                : this.argumentDescription.hashCode());
        result = (result * PRIME) + (this.argumentName == null ? 43 : this.argumentName.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentOrder == null ? 43 : this.argumentOrder.hashCode());
        result = (result * PRIME) + (this.argumentType == null ? 43 : this.argumentType.hashCode());
        result = (result * PRIME) + (this.argumentId == null ? 43 : this.argumentId.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentLookupColumn == null
                                ? 43
                                : this.argumentLookupColumn.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentLookupColumnPosition == null
                                ? 43
                                : this.argumentLookupColumnPosition.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentValue == null ? 43 : this.argumentValue.hashCode());
        result =
                (result * PRIME)
                        + (this.argumentReference == null ? 43 : this.argumentReference.hashCode());
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
