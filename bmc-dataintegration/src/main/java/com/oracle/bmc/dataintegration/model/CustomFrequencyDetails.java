/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Frequency details model to set cron-based frequency
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
    builder = CustomFrequencyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CustomFrequencyDetails extends AbstractFrequencyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("frequency")
        private Frequency frequency;

        public Builder frequency(Frequency frequency) {
            this.frequency = frequency;
            this.__explicitlySet__.add("frequency");
            return this;
        }
        /**
         * This holds the complete cron expression for this schedule, for example, 10 0/5 * * * ? that fires every 5 minutes, at 10 seconds after the minute (i.e. 10:00:10 am, 10:05:10 am, etc.)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customExpression")
        private String customExpression;

        /**
         * This holds the complete cron expression for this schedule, for example, 10 0/5 * * * ? that fires every 5 minutes, at 10 seconds after the minute (i.e. 10:00:10 am, 10:05:10 am, etc.)
         * @param customExpression the value to set
         * @return this builder
         **/
        public Builder customExpression(String customExpression) {
            this.customExpression = customExpression;
            this.__explicitlySet__.add("customExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomFrequencyDetails build() {
            CustomFrequencyDetails model =
                    new CustomFrequencyDetails(this.frequency, this.customExpression);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomFrequencyDetails model) {
            if (model.wasPropertyExplicitlySet("frequency")) {
                this.frequency(model.getFrequency());
            }
            if (model.wasPropertyExplicitlySet("customExpression")) {
                this.customExpression(model.getCustomExpression());
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
    public CustomFrequencyDetails(Frequency frequency, String customExpression) {
        super(frequency);
        this.customExpression = customExpression;
    }

    /**
     * This holds the complete cron expression for this schedule, for example, 10 0/5 * * * ? that fires every 5 minutes, at 10 seconds after the minute (i.e. 10:00:10 am, 10:05:10 am, etc.)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customExpression")
    private final String customExpression;

    /**
     * This holds the complete cron expression for this schedule, for example, 10 0/5 * * * ? that fires every 5 minutes, at 10 seconds after the minute (i.e. 10:00:10 am, 10:05:10 am, etc.)
     * @return the value
     **/
    public String getCustomExpression() {
        return customExpression;
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
        sb.append("CustomFrequencyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", customExpression=").append(String.valueOf(this.customExpression));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomFrequencyDetails)) {
            return false;
        }

        CustomFrequencyDetails other = (CustomFrequencyDetails) o;
        return java.util.Objects.equals(this.customExpression, other.customExpression)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.customExpression == null ? 43 : this.customExpression.hashCode());
        return result;
    }
}
