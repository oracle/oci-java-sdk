/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Cron schedule for a scheduled task. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CronSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CronSchedule extends Schedule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("misfirePolicy")
        private MisfirePolicy misfirePolicy;

        public Builder misfirePolicy(MisfirePolicy misfirePolicy) {
            this.misfirePolicy = misfirePolicy;
            this.__explicitlySet__.add("misfirePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfFirstExecution")
        private java.util.Date timeOfFirstExecution;

        public Builder timeOfFirstExecution(java.util.Date timeOfFirstExecution) {
            this.timeOfFirstExecution = timeOfFirstExecution;
            this.__explicitlySet__.add("timeOfFirstExecution");
            return this;
        }
        /** Value in cron format. */
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        /**
         * Value in cron format.
         *
         * @param expression the value to set
         * @return this builder
         */
        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }
        /** Time zone, by default UTC. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * Time zone, by default UTC.
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CronSchedule build() {
            CronSchedule model =
                    new CronSchedule(
                            this.misfirePolicy,
                            this.timeOfFirstExecution,
                            this.expression,
                            this.timeZone);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CronSchedule model) {
            if (model.wasPropertyExplicitlySet("misfirePolicy")) {
                this.misfirePolicy(model.getMisfirePolicy());
            }
            if (model.wasPropertyExplicitlySet("timeOfFirstExecution")) {
                this.timeOfFirstExecution(model.getTimeOfFirstExecution());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
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
    public CronSchedule(
            MisfirePolicy misfirePolicy,
            java.util.Date timeOfFirstExecution,
            String expression,
            String timeZone) {
        super(misfirePolicy, timeOfFirstExecution);
        this.expression = expression;
        this.timeZone = timeZone;
    }

    /** Value in cron format. */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final String expression;

    /**
     * Value in cron format.
     *
     * @return the value
     */
    public String getExpression() {
        return expression;
    }

    /** Time zone, by default UTC. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * Time zone, by default UTC.
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
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
        sb.append("CronSchedule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CronSchedule)) {
            return false;
        }

        CronSchedule other = (CronSchedule) o;
        return java.util.Objects.equals(this.expression, other.expression)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        return result;
    }
}
