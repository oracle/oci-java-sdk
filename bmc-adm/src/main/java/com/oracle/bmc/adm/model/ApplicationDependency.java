/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * An Application Dependency resource creates a Vulnerability Audit.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplicationDependency.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ApplicationDependency {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("gav")
        private String gav;

        public Builder gav(String gav) {
            this.gav = gav;
            this.__explicitlySet__.add("gav");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
        private String nodeId;

        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            this.__explicitlySet__.add("nodeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationDependencyNodeIds")
        private java.util.List<String> applicationDependencyNodeIds;

        public Builder applicationDependencyNodeIds(
                java.util.List<String> applicationDependencyNodeIds) {
            this.applicationDependencyNodeIds = applicationDependencyNodeIds;
            this.__explicitlySet__.add("applicationDependencyNodeIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationDependency build() {
            ApplicationDependency __instance__ =
                    new ApplicationDependency(gav, nodeId, applicationDependencyNodeIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationDependency o) {
            Builder copiedBuilder =
                    gav(o.getGav())
                            .nodeId(o.getNodeId())
                            .applicationDependencyNodeIds(o.getApplicationDependencyNodeIds());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Unique Group Artifact Version (GAV) identifier (Group:Artifact:Version).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gav")
    String gav;

    /**
     * Unique identifier of an Application Dependency node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
    String nodeId;

    /**
     * List of (Application Dependencies) node identifiers on which this node depends.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationDependencyNodeIds")
    java.util.List<String> applicationDependencyNodeIds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
