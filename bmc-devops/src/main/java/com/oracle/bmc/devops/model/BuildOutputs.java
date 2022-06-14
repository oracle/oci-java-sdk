/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Outputs from the build.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BuildOutputs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BuildOutputs {
    @Deprecated
    @java.beans.ConstructorProperties({
        "exportedVariables",
        "deliveredArtifacts",
        "artifactOverrideParameters",
        "vulnerabilityAuditSummaryCollection"
    })
    public BuildOutputs(
            ExportedVariableCollection exportedVariables,
            DeliveredArtifactCollection deliveredArtifacts,
            DeployArtifactOverrideArgumentCollection artifactOverrideParameters,
            VulnerabilityAuditSummaryCollection vulnerabilityAuditSummaryCollection) {
        super();
        this.exportedVariables = exportedVariables;
        this.deliveredArtifacts = deliveredArtifacts;
        this.artifactOverrideParameters = artifactOverrideParameters;
        this.vulnerabilityAuditSummaryCollection = vulnerabilityAuditSummaryCollection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("exportedVariables")
        private ExportedVariableCollection exportedVariables;

        public Builder exportedVariables(ExportedVariableCollection exportedVariables) {
            this.exportedVariables = exportedVariables;
            this.__explicitlySet__.add("exportedVariables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifacts")
        private DeliveredArtifactCollection deliveredArtifacts;

        public Builder deliveredArtifacts(DeliveredArtifactCollection deliveredArtifacts) {
            this.deliveredArtifacts = deliveredArtifacts;
            this.__explicitlySet__.add("deliveredArtifacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("artifactOverrideParameters")
        private DeployArtifactOverrideArgumentCollection artifactOverrideParameters;

        public Builder artifactOverrideParameters(
                DeployArtifactOverrideArgumentCollection artifactOverrideParameters) {
            this.artifactOverrideParameters = artifactOverrideParameters;
            this.__explicitlySet__.add("artifactOverrideParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vulnerabilityAuditSummaryCollection")
        private VulnerabilityAuditSummaryCollection vulnerabilityAuditSummaryCollection;

        public Builder vulnerabilityAuditSummaryCollection(
                VulnerabilityAuditSummaryCollection vulnerabilityAuditSummaryCollection) {
            this.vulnerabilityAuditSummaryCollection = vulnerabilityAuditSummaryCollection;
            this.__explicitlySet__.add("vulnerabilityAuditSummaryCollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BuildOutputs build() {
            BuildOutputs __instance__ =
                    new BuildOutputs(
                            exportedVariables,
                            deliveredArtifacts,
                            artifactOverrideParameters,
                            vulnerabilityAuditSummaryCollection);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BuildOutputs o) {
            Builder copiedBuilder =
                    exportedVariables(o.getExportedVariables())
                            .deliveredArtifacts(o.getDeliveredArtifacts())
                            .artifactOverrideParameters(o.getArtifactOverrideParameters())
                            .vulnerabilityAuditSummaryCollection(
                                    o.getVulnerabilityAuditSummaryCollection());

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

    @com.fasterxml.jackson.annotation.JsonProperty("exportedVariables")
    private final ExportedVariableCollection exportedVariables;

    public ExportedVariableCollection getExportedVariables() {
        return exportedVariables;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifacts")
    private final DeliveredArtifactCollection deliveredArtifacts;

    public DeliveredArtifactCollection getDeliveredArtifacts() {
        return deliveredArtifacts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("artifactOverrideParameters")
    private final DeployArtifactOverrideArgumentCollection artifactOverrideParameters;

    public DeployArtifactOverrideArgumentCollection getArtifactOverrideParameters() {
        return artifactOverrideParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vulnerabilityAuditSummaryCollection")
    private final VulnerabilityAuditSummaryCollection vulnerabilityAuditSummaryCollection;

    public VulnerabilityAuditSummaryCollection getVulnerabilityAuditSummaryCollection() {
        return vulnerabilityAuditSummaryCollection;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BuildOutputs(");
        sb.append("exportedVariables=").append(String.valueOf(this.exportedVariables));
        sb.append(", deliveredArtifacts=").append(String.valueOf(this.deliveredArtifacts));
        sb.append(", artifactOverrideParameters=")
                .append(String.valueOf(this.artifactOverrideParameters));
        sb.append(", vulnerabilityAuditSummaryCollection=")
                .append(String.valueOf(this.vulnerabilityAuditSummaryCollection));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BuildOutputs)) {
            return false;
        }

        BuildOutputs other = (BuildOutputs) o;
        return java.util.Objects.equals(this.exportedVariables, other.exportedVariables)
                && java.util.Objects.equals(this.deliveredArtifacts, other.deliveredArtifacts)
                && java.util.Objects.equals(
                        this.artifactOverrideParameters, other.artifactOverrideParameters)
                && java.util.Objects.equals(
                        this.vulnerabilityAuditSummaryCollection,
                        other.vulnerabilityAuditSummaryCollection)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.exportedVariables == null ? 43 : this.exportedVariables.hashCode());
        result =
                (result * PRIME)
                        + (this.deliveredArtifacts == null
                                ? 43
                                : this.deliveredArtifacts.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactOverrideParameters == null
                                ? 43
                                : this.artifactOverrideParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.vulnerabilityAuditSummaryCollection == null
                                ? 43
                                : this.vulnerabilityAuditSummaryCollection.hashCode());
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
