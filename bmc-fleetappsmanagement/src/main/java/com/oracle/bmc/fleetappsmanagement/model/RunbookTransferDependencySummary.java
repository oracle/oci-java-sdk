/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Summary of the Runbook transfer dependencies. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RunbookTransferDependencySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunbookTransferDependencySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"count", "entity", "dependency"})
    public RunbookTransferDependencySummary(
            Long count, String entity, RunbookTransferDependency dependency) {
        super();
        this.count = count;
        this.entity = entity;
        this.dependency = dependency;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Count. */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Long count;

        /**
         * Count.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Long count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /** Entity name. */
        @com.fasterxml.jackson.annotation.JsonProperty("entity")
        private String entity;

        /**
         * Entity name.
         *
         * @param entity the value to set
         * @return this builder
         */
        public Builder entity(String entity) {
            this.entity = entity;
            this.__explicitlySet__.add("entity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dependency")
        private RunbookTransferDependency dependency;

        public Builder dependency(RunbookTransferDependency dependency) {
            this.dependency = dependency;
            this.__explicitlySet__.add("dependency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunbookTransferDependencySummary build() {
            RunbookTransferDependencySummary model =
                    new RunbookTransferDependencySummary(this.count, this.entity, this.dependency);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunbookTransferDependencySummary model) {
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("entity")) {
                this.entity(model.getEntity());
            }
            if (model.wasPropertyExplicitlySet("dependency")) {
                this.dependency(model.getDependency());
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

    /** Count. */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Long count;

    /**
     * Count.
     *
     * @return the value
     */
    public Long getCount() {
        return count;
    }

    /** Entity name. */
    @com.fasterxml.jackson.annotation.JsonProperty("entity")
    private final String entity;

    /**
     * Entity name.
     *
     * @return the value
     */
    public String getEntity() {
        return entity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dependency")
    private final RunbookTransferDependency dependency;

    public RunbookTransferDependency getDependency() {
        return dependency;
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
        sb.append("RunbookTransferDependencySummary(");
        sb.append("super=").append(super.toString());
        sb.append("count=").append(String.valueOf(this.count));
        sb.append(", entity=").append(String.valueOf(this.entity));
        sb.append(", dependency=").append(String.valueOf(this.dependency));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunbookTransferDependencySummary)) {
            return false;
        }

        RunbookTransferDependencySummary other = (RunbookTransferDependencySummary) o;
        return java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.entity, other.entity)
                && java.util.Objects.equals(this.dependency, other.dependency)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.entity == null ? 43 : this.entity.hashCode());
        result = (result * PRIME) + (this.dependency == null ? 43 : this.dependency.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
