/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling.model;

/**
 * An autoscaling execution schedule that uses a cron expression. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CronExecutionSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CronExecutionSchedule extends ExecutionSchedule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private Timezone timezone;

        public Builder timezone(Timezone timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }
        /**
         * A cron expression that represents the time at which to execute the autoscaling policy.
         *
         * <p>Cron expressions have this format: {@code <second> <minute> <hour> <day of month>
         * <month> <day of week> <year>}
         *
         * <p>You can use special characters that are supported with the Quartz cron implementation.
         *
         * <p>You must specify {@code 0} as the value for seconds.
         *
         * <p>Example: {@code 0 15 10 ? * *}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        /**
         * A cron expression that represents the time at which to execute the autoscaling policy.
         *
         * <p>Cron expressions have this format: {@code <second> <minute> <hour> <day of month>
         * <month> <day of week> <year>}
         *
         * <p>You can use special characters that are supported with the Quartz cron implementation.
         *
         * <p>You must specify {@code 0} as the value for seconds.
         *
         * <p>Example: {@code 0 15 10 ? * *}
         *
         * @param expression the value to set
         * @return this builder
         */
        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CronExecutionSchedule build() {
            CronExecutionSchedule model = new CronExecutionSchedule(this.timezone, this.expression);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CronExecutionSchedule model) {
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
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
    public CronExecutionSchedule(Timezone timezone, String expression) {
        super(timezone);
        this.expression = expression;
    }

    /**
     * A cron expression that represents the time at which to execute the autoscaling policy.
     *
     * <p>Cron expressions have this format: {@code <second> <minute> <hour> <day of month> <month>
     * <day of week> <year>}
     *
     * <p>You can use special characters that are supported with the Quartz cron implementation.
     *
     * <p>You must specify {@code 0} as the value for seconds.
     *
     * <p>Example: {@code 0 15 10 ? * *}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final String expression;

    /**
     * A cron expression that represents the time at which to execute the autoscaling policy.
     *
     * <p>Cron expressions have this format: {@code <second> <minute> <hour> <day of month> <month>
     * <day of week> <year>}
     *
     * <p>You can use special characters that are supported with the Quartz cron implementation.
     *
     * <p>You must specify {@code 0} as the value for seconds.
     *
     * <p>Example: {@code 0 15 10 ? * *}
     *
     * @return the value
     */
    public String getExpression() {
        return expression;
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
        sb.append("CronExecutionSchedule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CronExecutionSchedule)) {
            return false;
        }

        CronExecutionSchedule other = (CronExecutionSchedule) o;
        return java.util.Objects.equals(this.expression, other.expression) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        return result;
    }
}
