/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * A statement object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Statement.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Statement extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "code",
        "lifecycleState",
        "output",
        "progress",
        "runId",
        "timeCreated",
        "timeCompleted"
    })
    public Statement(
            Long id,
            String code,
            StatementLifecycleState lifecycleState,
            StatementOutput output,
            Double progress,
            String runId,
            java.util.Date timeCreated,
            java.util.Date timeCompleted) {
        super();
        this.id = id;
        this.code = code;
        this.lifecycleState = lifecycleState;
        this.output = output;
        this.progress = progress;
        this.runId = runId;
        this.timeCreated = timeCreated;
        this.timeCompleted = timeCompleted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The statement ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;

        /**
         * The statement ID.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(Long id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The statement code to execute. Example: {@code println(sc.version)} */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * The statement code to execute. Example: {@code println(sc.version)}
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /** The current state of this statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private StatementLifecycleState lifecycleState;

        /**
         * The current state of this statement.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(StatementLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("output")
        private StatementOutput output;

        public Builder output(StatementOutput output) {
            this.output = output;
            this.__explicitlySet__.add("output");
            return this;
        }
        /** The execution progress. */
        @com.fasterxml.jackson.annotation.JsonProperty("progress")
        private Double progress;

        /**
         * The execution progress.
         *
         * @param progress the value to set
         * @return this builder
         */
        public Builder progress(Double progress) {
            this.progress = progress;
            this.__explicitlySet__.add("progress");
            return this;
        }
        /** The ID of a run. */
        @com.fasterxml.jackson.annotation.JsonProperty("runId")
        private String runId;

        /**
         * The ID of a run.
         *
         * @param runId the value to set
         * @return this builder
         */
        public Builder runId(String runId) {
            this.runId = runId;
            this.__explicitlySet__.add("runId");
            return this;
        }
        /**
         * The date and time the resource was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2018-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2018-04-03T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time a statement execution was completed, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2022-05-31T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        /**
         * The date and time a statement execution was completed, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2022-05-31T21:10:29.600Z}
         *
         * @param timeCompleted the value to set
         * @return this builder
         */
        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Statement build() {
            Statement model =
                    new Statement(
                            this.id,
                            this.code,
                            this.lifecycleState,
                            this.output,
                            this.progress,
                            this.runId,
                            this.timeCreated,
                            this.timeCompleted);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Statement model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("output")) {
                this.output(model.getOutput());
            }
            if (model.wasPropertyExplicitlySet("progress")) {
                this.progress(model.getProgress());
            }
            if (model.wasPropertyExplicitlySet("runId")) {
                this.runId(model.getRunId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeCompleted")) {
                this.timeCompleted(model.getTimeCompleted());
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

    /** The statement ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Long id;

    /**
     * The statement ID.
     *
     * @return the value
     */
    public Long getId() {
        return id;
    }

    /** The statement code to execute. Example: {@code println(sc.version)} */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * The statement code to execute. Example: {@code println(sc.version)}
     *
     * @return the value
     */
    public String getCode() {
        return code;
    }

    /** The current state of this statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final StatementLifecycleState lifecycleState;

    /**
     * The current state of this statement.
     *
     * @return the value
     */
    public StatementLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("output")
    private final StatementOutput output;

    public StatementOutput getOutput() {
        return output;
    }

    /** The execution progress. */
    @com.fasterxml.jackson.annotation.JsonProperty("progress")
    private final Double progress;

    /**
     * The execution progress.
     *
     * @return the value
     */
    public Double getProgress() {
        return progress;
    }

    /** The ID of a run. */
    @com.fasterxml.jackson.annotation.JsonProperty("runId")
    private final String runId;

    /**
     * The ID of a run.
     *
     * @return the value
     */
    public String getRunId() {
        return runId;
    }

    /**
     * The date and time the resource was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2018-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time a statement execution was completed, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2022-05-31T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    /**
     * The date and time a statement execution was completed, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2022-05-31T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
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
        sb.append("Statement(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", output=").append(String.valueOf(this.output));
        sb.append(", progress=").append(String.valueOf(this.progress));
        sb.append(", runId=").append(String.valueOf(this.runId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Statement)) {
            return false;
        }

        Statement other = (Statement) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.output, other.output)
                && java.util.Objects.equals(this.progress, other.progress)
                && java.util.Objects.equals(this.runId, other.runId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.output == null ? 43 : this.output.hashCode());
        result = (result * PRIME) + (this.progress == null ? 43 : this.progress.hashCode());
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
