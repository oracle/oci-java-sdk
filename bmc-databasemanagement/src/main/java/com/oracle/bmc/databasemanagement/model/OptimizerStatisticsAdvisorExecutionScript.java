/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The Oracle system-generated script for the Optimizer Statistics Advisor execution.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OptimizerStatisticsAdvisorExecutionScript.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OptimizerStatisticsAdvisorExecutionScript
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"script"})
    public OptimizerStatisticsAdvisorExecutionScript(String script) {
        super();
        this.script = script;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Optimizer Statistics Advisor execution script.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("script")
        private String script;

        /**
         * The Optimizer Statistics Advisor execution script.
         * @param script the value to set
         * @return this builder
         **/
        public Builder script(String script) {
            this.script = script;
            this.__explicitlySet__.add("script");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OptimizerStatisticsAdvisorExecutionScript build() {
            OptimizerStatisticsAdvisorExecutionScript model =
                    new OptimizerStatisticsAdvisorExecutionScript(this.script);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OptimizerStatisticsAdvisorExecutionScript model) {
            if (model.wasPropertyExplicitlySet("script")) {
                this.script(model.getScript());
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
     * The Optimizer Statistics Advisor execution script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("script")
    private final String script;

    /**
     * The Optimizer Statistics Advisor execution script.
     * @return the value
     **/
    public String getScript() {
        return script;
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
        sb.append("OptimizerStatisticsAdvisorExecutionScript(");
        sb.append("super=").append(super.toString());
        sb.append("script=").append(String.valueOf(this.script));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OptimizerStatisticsAdvisorExecutionScript)) {
            return false;
        }

        OptimizerStatisticsAdvisorExecutionScript other =
                (OptimizerStatisticsAdvisorExecutionScript) o;
        return java.util.Objects.equals(this.script, other.script) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.script == null ? 43 : this.script.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
