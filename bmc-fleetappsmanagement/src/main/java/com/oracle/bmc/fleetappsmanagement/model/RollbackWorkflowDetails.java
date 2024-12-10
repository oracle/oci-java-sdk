/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Rollback Workflow details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RollbackWorkflowDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RollbackWorkflowDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"scope", "workflow"})
    public RollbackWorkflowDetails(Scope scope, java.util.List<WorkflowGroup> workflow) {
        super();
        this.scope = scope;
        this.workflow = workflow;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * rollback Scope
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Scope scope;

        /**
         * rollback Scope
         *
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(Scope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * Rollback Workflow for the runbook.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workflow")
        private java.util.List<WorkflowGroup> workflow;

        /**
         * Rollback Workflow for the runbook.
         * @param workflow the value to set
         * @return this builder
         **/
        public Builder workflow(java.util.List<WorkflowGroup> workflow) {
            this.workflow = workflow;
            this.__explicitlySet__.add("workflow");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RollbackWorkflowDetails build() {
            RollbackWorkflowDetails model = new RollbackWorkflowDetails(this.scope, this.workflow);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RollbackWorkflowDetails model) {
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("workflow")) {
                this.workflow(model.getWorkflow());
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
     * rollback Scope
     *
     **/
    public enum Scope {
        ActionGroup("ACTION_GROUP"),
        Target("TARGET"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Scope.class);

        private final String value;
        private static java.util.Map<String, Scope> map;

        static {
            map = new java.util.HashMap<>();
            for (Scope v : Scope.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Scope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Scope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Scope', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * rollback Scope
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final Scope scope;

    /**
     * rollback Scope
     *
     * @return the value
     **/
    public Scope getScope() {
        return scope;
    }

    /**
     * Rollback Workflow for the runbook.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workflow")
    private final java.util.List<WorkflowGroup> workflow;

    /**
     * Rollback Workflow for the runbook.
     * @return the value
     **/
    public java.util.List<WorkflowGroup> getWorkflow() {
        return workflow;
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
        sb.append("RollbackWorkflowDetails(");
        sb.append("super=").append(super.toString());
        sb.append("scope=").append(String.valueOf(this.scope));
        sb.append(", workflow=").append(String.valueOf(this.workflow));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RollbackWorkflowDetails)) {
            return false;
        }

        RollbackWorkflowDetails other = (RollbackWorkflowDetails) o;
        return java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.workflow, other.workflow)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.workflow == null ? 43 : this.workflow.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
