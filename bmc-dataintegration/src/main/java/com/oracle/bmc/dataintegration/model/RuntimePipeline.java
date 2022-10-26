/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Runtime pipeline model which holds the runtime metadata of the task executed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RuntimePipeline.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class RuntimePipeline
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pipeline", "runtimeOperators", "parentRuntimeOperatorKey"})
    public RuntimePipeline(
            Pipeline pipeline,
            java.util.List<RuntimeOperator> runtimeOperators,
            String parentRuntimeOperatorKey) {
        super();
        this.pipeline = pipeline;
        this.runtimeOperators = runtimeOperators;
        this.parentRuntimeOperatorKey = parentRuntimeOperatorKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("pipeline")
        private Pipeline pipeline;

        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
            this.__explicitlySet__.add("pipeline");
            return this;
        }
        /** A list of RuntimeOperators attached to the RuntimePipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("runtimeOperators")
        private java.util.List<RuntimeOperator> runtimeOperators;

        /**
         * A list of RuntimeOperators attached to the RuntimePipeline.
         *
         * @param runtimeOperators the value to set
         * @return this builder
         */
        public Builder runtimeOperators(java.util.List<RuntimeOperator> runtimeOperators) {
            this.runtimeOperators = runtimeOperators;
            this.__explicitlySet__.add("runtimeOperators");
            return this;
        }
        /** The parent RuntimePipeline's RuntimeOperator key. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentRuntimeOperatorKey")
        private String parentRuntimeOperatorKey;

        /**
         * The parent RuntimePipeline's RuntimeOperator key.
         *
         * @param parentRuntimeOperatorKey the value to set
         * @return this builder
         */
        public Builder parentRuntimeOperatorKey(String parentRuntimeOperatorKey) {
            this.parentRuntimeOperatorKey = parentRuntimeOperatorKey;
            this.__explicitlySet__.add("parentRuntimeOperatorKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuntimePipeline build() {
            RuntimePipeline model =
                    new RuntimePipeline(
                            this.pipeline, this.runtimeOperators, this.parentRuntimeOperatorKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuntimePipeline model) {
            if (model.wasPropertyExplicitlySet("pipeline")) {
                this.pipeline(model.getPipeline());
            }
            if (model.wasPropertyExplicitlySet("runtimeOperators")) {
                this.runtimeOperators(model.getRuntimeOperators());
            }
            if (model.wasPropertyExplicitlySet("parentRuntimeOperatorKey")) {
                this.parentRuntimeOperatorKey(model.getParentRuntimeOperatorKey());
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

    @com.fasterxml.jackson.annotation.JsonProperty("pipeline")
    private final Pipeline pipeline;

    public Pipeline getPipeline() {
        return pipeline;
    }

    /** A list of RuntimeOperators attached to the RuntimePipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeOperators")
    private final java.util.List<RuntimeOperator> runtimeOperators;

    /**
     * A list of RuntimeOperators attached to the RuntimePipeline.
     *
     * @return the value
     */
    public java.util.List<RuntimeOperator> getRuntimeOperators() {
        return runtimeOperators;
    }

    /** The parent RuntimePipeline's RuntimeOperator key. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentRuntimeOperatorKey")
    private final String parentRuntimeOperatorKey;

    /**
     * The parent RuntimePipeline's RuntimeOperator key.
     *
     * @return the value
     */
    public String getParentRuntimeOperatorKey() {
        return parentRuntimeOperatorKey;
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
        sb.append("RuntimePipeline(");
        sb.append("super=").append(super.toString());
        sb.append("pipeline=").append(String.valueOf(this.pipeline));
        sb.append(", runtimeOperators=").append(String.valueOf(this.runtimeOperators));
        sb.append(", parentRuntimeOperatorKey=")
                .append(String.valueOf(this.parentRuntimeOperatorKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuntimePipeline)) {
            return false;
        }

        RuntimePipeline other = (RuntimePipeline) o;
        return java.util.Objects.equals(this.pipeline, other.pipeline)
                && java.util.Objects.equals(this.runtimeOperators, other.runtimeOperators)
                && java.util.Objects.equals(
                        this.parentRuntimeOperatorKey, other.parentRuntimeOperatorKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pipeline == null ? 43 : this.pipeline.hashCode());
        result =
                (result * PRIME)
                        + (this.runtimeOperators == null ? 43 : this.runtimeOperators.hashCode());
        result =
                (result * PRIME)
                        + (this.parentRuntimeOperatorKey == null
                                ? 43
                                : this.parentRuntimeOperatorKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
