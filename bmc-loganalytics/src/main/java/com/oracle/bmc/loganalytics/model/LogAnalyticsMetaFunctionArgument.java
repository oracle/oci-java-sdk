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
public final class LogAnalyticsMetaFunctionArgument
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * The override output fields.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideOutputFields")
        private Boolean isOverrideOutputFields;

        /**
         * The override output fields.
         * @param isOverrideOutputFields the value to set
         * @return this builder
         **/
        public Builder isOverrideOutputFields(Boolean isOverrideOutputFields) {
            this.isOverrideOutputFields = isOverrideOutputFields;
            this.__explicitlySet__.add("isOverrideOutputFields");
            return this;
        }
        /**
         * The argument display name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentDisplayName")
        private String argumentDisplayName;

        /**
         * The argument display name.
         * @param argumentDisplayName the value to set
         * @return this builder
         **/
        public Builder argumentDisplayName(String argumentDisplayName) {
            this.argumentDisplayName = argumentDisplayName;
            this.__explicitlySet__.add("argumentDisplayName");
            return this;
        }
        /**
         * The argument example.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentExample")
        private String argumentExample;

        /**
         * The argument example.
         * @param argumentExample the value to set
         * @return this builder
         **/
        public Builder argumentExample(String argumentExample) {
            this.argumentExample = argumentExample;
            this.__explicitlySet__.add("argumentExample");
            return this;
        }
        /**
         * The argument service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentService")
        private String argumentService;

        /**
         * The argument service.
         * @param argumentService the value to set
         * @return this builder
         **/
        public Builder argumentService(String argumentService) {
            this.argumentService = argumentService;
            this.__explicitlySet__.add("argumentService");
            return this;
        }
        /**
         * The argument data type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentDataType")
        private String argumentDataType;

        /**
         * The argument data type.
         * @param argumentDataType the value to set
         * @return this builder
         **/
        public Builder argumentDataType(String argumentDataType) {
            this.argumentDataType = argumentDataType;
            this.__explicitlySet__.add("argumentDataType");
            return this;
        }
        /**
         * The argument description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentDescription")
        private String argumentDescription;

        /**
         * The argument description.
         * @param argumentDescription the value to set
         * @return this builder
         **/
        public Builder argumentDescription(String argumentDescription) {
            this.argumentDescription = argumentDescription;
            this.__explicitlySet__.add("argumentDescription");
            return this;
        }
        /**
         * The argument name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentName")
        private String argumentName;

        /**
         * The argument name.
         * @param argumentName the value to set
         * @return this builder
         **/
        public Builder argumentName(String argumentName) {
            this.argumentName = argumentName;
            this.__explicitlySet__.add("argumentName");
            return this;
        }
        /**
         * The argument order.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentOrder")
        private Long argumentOrder;

        /**
         * The argument order.
         * @param argumentOrder the value to set
         * @return this builder
         **/
        public Builder argumentOrder(Long argumentOrder) {
            this.argumentOrder = argumentOrder;
            this.__explicitlySet__.add("argumentOrder");
            return this;
        }
        /**
         * The argument type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentType")
        private Long argumentType;

        /**
         * The argument type.
         * @param argumentType the value to set
         * @return this builder
         **/
        public Builder argumentType(Long argumentType) {
            this.argumentType = argumentType;
            this.__explicitlySet__.add("argumentType");
            return this;
        }
        /**
         * The argument unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentId")
        private Long argumentId;

        /**
         * The argument unique identifier.
         * @param argumentId the value to set
         * @return this builder
         **/
        public Builder argumentId(Long argumentId) {
            this.argumentId = argumentId;
            this.__explicitlySet__.add("argumentId");
            return this;
        }
        /**
         * The lookup column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumn")
        private String argumentLookupColumn;

        /**
         * The lookup column.
         * @param argumentLookupColumn the value to set
         * @return this builder
         **/
        public Builder argumentLookupColumn(String argumentLookupColumn) {
            this.argumentLookupColumn = argumentLookupColumn;
            this.__explicitlySet__.add("argumentLookupColumn");
            return this;
        }
        /**
         * The lookup column position.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumnPosition")
        private Long argumentLookupColumnPosition;

        /**
         * The lookup column position.
         * @param argumentLookupColumnPosition the value to set
         * @return this builder
         **/
        public Builder argumentLookupColumnPosition(Long argumentLookupColumnPosition) {
            this.argumentLookupColumnPosition = argumentLookupColumnPosition;
            this.__explicitlySet__.add("argumentLookupColumnPosition");
            return this;
        }
        /**
         * The argument value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentValue")
        private String argumentValue;

        /**
         * The argument value.
         * @param argumentValue the value to set
         * @return this builder
         **/
        public Builder argumentValue(String argumentValue) {
            this.argumentValue = argumentValue;
            this.__explicitlySet__.add("argumentValue");
            return this;
        }
        /**
         * The argument unique identifier as a string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("argumentReference")
        private String argumentReference;

        /**
         * The argument unique identifier as a string.
         * @param argumentReference the value to set
         * @return this builder
         **/
        public Builder argumentReference(String argumentReference) {
            this.argumentReference = argumentReference;
            this.__explicitlySet__.add("argumentReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsMetaFunctionArgument build() {
            LogAnalyticsMetaFunctionArgument model =
                    new LogAnalyticsMetaFunctionArgument(
                            this.isOverrideOutputFields,
                            this.argumentDisplayName,
                            this.argumentExample,
                            this.argumentService,
                            this.argumentDataType,
                            this.argumentDescription,
                            this.argumentName,
                            this.argumentOrder,
                            this.argumentType,
                            this.argumentId,
                            this.argumentLookupColumn,
                            this.argumentLookupColumnPosition,
                            this.argumentValue,
                            this.argumentReference);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsMetaFunctionArgument model) {
            if (model.wasPropertyExplicitlySet("isOverrideOutputFields")) {
                this.isOverrideOutputFields(model.getIsOverrideOutputFields());
            }
            if (model.wasPropertyExplicitlySet("argumentDisplayName")) {
                this.argumentDisplayName(model.getArgumentDisplayName());
            }
            if (model.wasPropertyExplicitlySet("argumentExample")) {
                this.argumentExample(model.getArgumentExample());
            }
            if (model.wasPropertyExplicitlySet("argumentService")) {
                this.argumentService(model.getArgumentService());
            }
            if (model.wasPropertyExplicitlySet("argumentDataType")) {
                this.argumentDataType(model.getArgumentDataType());
            }
            if (model.wasPropertyExplicitlySet("argumentDescription")) {
                this.argumentDescription(model.getArgumentDescription());
            }
            if (model.wasPropertyExplicitlySet("argumentName")) {
                this.argumentName(model.getArgumentName());
            }
            if (model.wasPropertyExplicitlySet("argumentOrder")) {
                this.argumentOrder(model.getArgumentOrder());
            }
            if (model.wasPropertyExplicitlySet("argumentType")) {
                this.argumentType(model.getArgumentType());
            }
            if (model.wasPropertyExplicitlySet("argumentId")) {
                this.argumentId(model.getArgumentId());
            }
            if (model.wasPropertyExplicitlySet("argumentLookupColumn")) {
                this.argumentLookupColumn(model.getArgumentLookupColumn());
            }
            if (model.wasPropertyExplicitlySet("argumentLookupColumnPosition")) {
                this.argumentLookupColumnPosition(model.getArgumentLookupColumnPosition());
            }
            if (model.wasPropertyExplicitlySet("argumentValue")) {
                this.argumentValue(model.getArgumentValue());
            }
            if (model.wasPropertyExplicitlySet("argumentReference")) {
                this.argumentReference(model.getArgumentReference());
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
     * The override output fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideOutputFields")
    private final Boolean isOverrideOutputFields;

    /**
     * The override output fields.
     * @return the value
     **/
    public Boolean getIsOverrideOutputFields() {
        return isOverrideOutputFields;
    }

    /**
     * The argument display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentDisplayName")
    private final String argumentDisplayName;

    /**
     * The argument display name.
     * @return the value
     **/
    public String getArgumentDisplayName() {
        return argumentDisplayName;
    }

    /**
     * The argument example.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentExample")
    private final String argumentExample;

    /**
     * The argument example.
     * @return the value
     **/
    public String getArgumentExample() {
        return argumentExample;
    }

    /**
     * The argument service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentService")
    private final String argumentService;

    /**
     * The argument service.
     * @return the value
     **/
    public String getArgumentService() {
        return argumentService;
    }

    /**
     * The argument data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentDataType")
    private final String argumentDataType;

    /**
     * The argument data type.
     * @return the value
     **/
    public String getArgumentDataType() {
        return argumentDataType;
    }

    /**
     * The argument description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentDescription")
    private final String argumentDescription;

    /**
     * The argument description.
     * @return the value
     **/
    public String getArgumentDescription() {
        return argumentDescription;
    }

    /**
     * The argument name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentName")
    private final String argumentName;

    /**
     * The argument name.
     * @return the value
     **/
    public String getArgumentName() {
        return argumentName;
    }

    /**
     * The argument order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentOrder")
    private final Long argumentOrder;

    /**
     * The argument order.
     * @return the value
     **/
    public Long getArgumentOrder() {
        return argumentOrder;
    }

    /**
     * The argument type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentType")
    private final Long argumentType;

    /**
     * The argument type.
     * @return the value
     **/
    public Long getArgumentType() {
        return argumentType;
    }

    /**
     * The argument unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentId")
    private final Long argumentId;

    /**
     * The argument unique identifier.
     * @return the value
     **/
    public Long getArgumentId() {
        return argumentId;
    }

    /**
     * The lookup column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumn")
    private final String argumentLookupColumn;

    /**
     * The lookup column.
     * @return the value
     **/
    public String getArgumentLookupColumn() {
        return argumentLookupColumn;
    }

    /**
     * The lookup column position.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentLookupColumnPosition")
    private final Long argumentLookupColumnPosition;

    /**
     * The lookup column position.
     * @return the value
     **/
    public Long getArgumentLookupColumnPosition() {
        return argumentLookupColumnPosition;
    }

    /**
     * The argument value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentValue")
    private final String argumentValue;

    /**
     * The argument value.
     * @return the value
     **/
    public String getArgumentValue() {
        return argumentValue;
    }

    /**
     * The argument unique identifier as a string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("argumentReference")
    private final String argumentReference;

    /**
     * The argument unique identifier as a string.
     * @return the value
     **/
    public String getArgumentReference() {
        return argumentReference;
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
        sb.append("LogAnalyticsMetaFunctionArgument(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
