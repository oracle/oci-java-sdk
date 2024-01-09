/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information about new Logging event detail of DataSource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LoggingEventInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "dataSourceFeedProvider")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LoggingEventInfo extends DataSourceEventInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("observedValue")
        private String observedValue;

        public Builder observedValue(String observedValue) {
            this.observedValue = observedValue;
            this.__explicitlySet__.add("observedValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("triggerValue")
        private String triggerValue;

        public Builder triggerValue(String triggerValue) {
            this.triggerValue = triggerValue;
            this.__explicitlySet__.add("triggerValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private String operator;

        public Builder operator(String operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logResult")
        private String logResult;

        public Builder logResult(String logResult) {
            this.logResult = logResult;
            this.__explicitlySet__.add("logResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoggingEventInfo build() {
            LoggingEventInfo model =
                    new LoggingEventInfo(
                            this.observedValue, this.triggerValue, this.operator, this.logResult);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggingEventInfo model) {
            if (model.wasPropertyExplicitlySet("observedValue")) {
                this.observedValue(model.getObservedValue());
            }
            if (model.wasPropertyExplicitlySet("triggerValue")) {
                this.triggerValue(model.getTriggerValue());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
            }
            if (model.wasPropertyExplicitlySet("logResult")) {
                this.logResult(model.getLogResult());
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

    @Deprecated
    public LoggingEventInfo(
            String observedValue, String triggerValue, String operator, String logResult) {
        super();
        this.observedValue = observedValue;
        this.triggerValue = triggerValue;
        this.operator = operator;
        this.logResult = logResult;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("observedValue")
    private final String observedValue;

    public String getObservedValue() {
        return observedValue;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("triggerValue")
    private final String triggerValue;

    public String getTriggerValue() {
        return triggerValue;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final String operator;

    public String getOperator() {
        return operator;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logResult")
    private final String logResult;

    public String getLogResult() {
        return logResult;
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
        sb.append("LoggingEventInfo(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", observedValue=").append(String.valueOf(this.observedValue));
        sb.append(", triggerValue=").append(String.valueOf(this.triggerValue));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", logResult=").append(String.valueOf(this.logResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggingEventInfo)) {
            return false;
        }

        LoggingEventInfo other = (LoggingEventInfo) o;
        return java.util.Objects.equals(this.observedValue, other.observedValue)
                && java.util.Objects.equals(this.triggerValue, other.triggerValue)
                && java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(this.logResult, other.logResult)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.observedValue == null ? 43 : this.observedValue.hashCode());
        result = (result * PRIME) + (this.triggerValue == null ? 43 : this.triggerValue.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.logResult == null ? 43 : this.logResult.hashCode());
        return result;
    }
}
