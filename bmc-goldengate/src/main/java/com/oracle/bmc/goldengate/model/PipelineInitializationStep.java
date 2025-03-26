/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The step and its progress based on the recipe type.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PipelineInitializationStep.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PipelineInitializationStep
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "status",
        "percentComplete",
        "timeStarted",
        "timeFinished",
        "messages"
    })
    public PipelineInitializationStep(
            String name,
            StepStatusType status,
            Integer percentComplete,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            java.util.List<StepMessage> messages) {
        super();
        this.name = name;
        this.status = status;
        this.percentComplete = percentComplete;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.messages = messages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An object's Display Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * An object's Display Name.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Status of the steps in a recipe. This option applies during pipeline initialization.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private StepStatusType status;

        /**
         * Status of the steps in a recipe. This option applies during pipeline initialization.
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(StepStatusType status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Shows the percentage complete of each recipe step during pipeline initialization.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        /**
         * Shows the percentage complete of each recipe step during pipeline initialization.
         *
         * @param percentComplete the value to set
         * @return this builder
         **/
        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /**
         * The date and time the request was started. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the request was started. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the request was finished. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the request was finished. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * The list of messages for each step while running.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("messages")
        private java.util.List<StepMessage> messages;

        /**
         * The list of messages for each step while running.
         *
         * @param messages the value to set
         * @return this builder
         **/
        public Builder messages(java.util.List<StepMessage> messages) {
            this.messages = messages;
            this.__explicitlySet__.add("messages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineInitializationStep build() {
            PipelineInitializationStep model =
                    new PipelineInitializationStep(
                            this.name,
                            this.status,
                            this.percentComplete,
                            this.timeStarted,
                            this.timeFinished,
                            this.messages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineInitializationStep model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("messages")) {
                this.messages(model.getMessages());
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
     * An object's Display Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * An object's Display Name.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Status of the steps in a recipe. This option applies during pipeline initialization.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final StepStatusType status;

    /**
     * Status of the steps in a recipe. This option applies during pipeline initialization.
     *
     * @return the value
     **/
    public StepStatusType getStatus() {
        return status;
    }

    /**
     * Shows the percentage complete of each recipe step during pipeline initialization.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Integer percentComplete;

    /**
     * Shows the percentage complete of each recipe step during pipeline initialization.
     *
     * @return the value
     **/
    public Integer getPercentComplete() {
        return percentComplete;
    }

    /**
     * The date and time the request was started. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the request was started. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the request was finished. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the request was finished. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * The list of messages for each step while running.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messages")
    private final java.util.List<StepMessage> messages;

    /**
     * The list of messages for each step while running.
     *
     * @return the value
     **/
    public java.util.List<StepMessage> getMessages() {
        return messages;
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
        sb.append("PipelineInitializationStep(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", messages=").append(String.valueOf(this.messages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineInitializationStep)) {
            return false;
        }

        PipelineInitializationStep other = (PipelineInitializationStep) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.messages, other.messages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.messages == null ? 43 : this.messages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
