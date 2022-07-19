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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplicationDependency.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApplicationDependency {
    @Deprecated
    @java.beans.ConstructorProperties({"gav", "nodeId", "applicationDependencyNodeIds"})
    public ApplicationDependency(
            String gav, String nodeId, java.util.List<String> applicationDependencyNodeIds) {
        super();
        this.gav = gav;
        this.nodeId = nodeId;
        this.applicationDependencyNodeIds = applicationDependencyNodeIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique Group Artifact Version (GAV) identifier (Group:Artifact:Version), e.g. org.graalvm.nativeimage:svm:21.1.0.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gav")
        private String gav;

        /**
         * Unique Group Artifact Version (GAV) identifier (Group:Artifact:Version), e.g. org.graalvm.nativeimage:svm:21.1.0.
         * @param gav the value to set
         * @return this builder
         **/
        public Builder gav(String gav) {
            this.gav = gav;
            this.__explicitlySet__.add("gav");
            return this;
        }
        /**
         * Unique identifier of an Application Dependency node, e.g. nodeId1.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
        private String nodeId;

        /**
         * Unique identifier of an Application Dependency node, e.g. nodeId1.
         * @param nodeId the value to set
         * @return this builder
         **/
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            this.__explicitlySet__.add("nodeId");
            return this;
        }
        /**
         * List of (Application Dependencies) node identifiers on which this node depends.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationDependencyNodeIds")
        private java.util.List<String> applicationDependencyNodeIds;

        /**
         * List of (Application Dependencies) node identifiers on which this node depends.
         * @param applicationDependencyNodeIds the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique Group Artifact Version (GAV) identifier (Group:Artifact:Version), e.g. org.graalvm.nativeimage:svm:21.1.0.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gav")
    private final String gav;

    /**
     * Unique Group Artifact Version (GAV) identifier (Group:Artifact:Version), e.g. org.graalvm.nativeimage:svm:21.1.0.
     * @return the value
     **/
    public String getGav() {
        return gav;
    }

    /**
     * Unique identifier of an Application Dependency node, e.g. nodeId1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
    private final String nodeId;

    /**
     * Unique identifier of an Application Dependency node, e.g. nodeId1.
     * @return the value
     **/
    public String getNodeId() {
        return nodeId;
    }

    /**
     * List of (Application Dependencies) node identifiers on which this node depends.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationDependencyNodeIds")
    private final java.util.List<String> applicationDependencyNodeIds;

    /**
     * List of (Application Dependencies) node identifiers on which this node depends.
     * @return the value
     **/
    public java.util.List<String> getApplicationDependencyNodeIds() {
        return applicationDependencyNodeIds;
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
        sb.append("ApplicationDependency(");
        sb.append("gav=").append(String.valueOf(this.gav));
        sb.append(", nodeId=").append(String.valueOf(this.nodeId));
        sb.append(", applicationDependencyNodeIds=")
                .append(String.valueOf(this.applicationDependencyNodeIds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicationDependency)) {
            return false;
        }

        ApplicationDependency other = (ApplicationDependency) o;
        return java.util.Objects.equals(this.gav, other.gav)
                && java.util.Objects.equals(this.nodeId, other.nodeId)
                && java.util.Objects.equals(
                        this.applicationDependencyNodeIds, other.applicationDependencyNodeIds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gav == null ? 43 : this.gav.hashCode());
        result = (result * PRIME) + (this.nodeId == null ? 43 : this.nodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationDependencyNodeIds == null
                                ? 43
                                : this.applicationDependencyNodeIds.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
