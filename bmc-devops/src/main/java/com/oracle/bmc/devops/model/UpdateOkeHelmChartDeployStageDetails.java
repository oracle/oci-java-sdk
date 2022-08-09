/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Kubernetes cluster deployment stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOkeHelmChartDeployStageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOkeHelmChartDeployStageDetails extends UpdateDeployStageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessorCollection")
        private DeployStagePredecessorCollection deployStagePredecessorCollection;

        public Builder deployStagePredecessorCollection(
                DeployStagePredecessorCollection deployStagePredecessorCollection) {
            this.deployStagePredecessorCollection = deployStagePredecessorCollection;
            this.__explicitlySet__.add("deployStagePredecessorCollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Kubernetes cluster environment OCID for deployment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("okeClusterDeployEnvironmentId")
        private String okeClusterDeployEnvironmentId;

        /**
         * Kubernetes cluster environment OCID for deployment.
         * @param okeClusterDeployEnvironmentId the value to set
         * @return this builder
         **/
        public Builder okeClusterDeployEnvironmentId(String okeClusterDeployEnvironmentId) {
            this.okeClusterDeployEnvironmentId = okeClusterDeployEnvironmentId;
            this.__explicitlySet__.add("okeClusterDeployEnvironmentId");
            return this;
        }
        /**
         * Helm chart artifact OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helmChartDeployArtifactId")
        private String helmChartDeployArtifactId;

        /**
         * Helm chart artifact OCID.
         * @param helmChartDeployArtifactId the value to set
         * @return this builder
         **/
        public Builder helmChartDeployArtifactId(String helmChartDeployArtifactId) {
            this.helmChartDeployArtifactId = helmChartDeployArtifactId;
            this.__explicitlySet__.add("helmChartDeployArtifactId");
            return this;
        }
        /**
         * List of values.yaml file artifact OCIDs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("valuesArtifactIds")
        private java.util.List<String> valuesArtifactIds;

        /**
         * List of values.yaml file artifact OCIDs.
         * @param valuesArtifactIds the value to set
         * @return this builder
         **/
        public Builder valuesArtifactIds(java.util.List<String> valuesArtifactIds) {
            this.valuesArtifactIds = valuesArtifactIds;
            this.__explicitlySet__.add("valuesArtifactIds");
            return this;
        }
        /**
         * Name of the Helm chart release.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("releaseName")
        private String releaseName;

        /**
         * Name of the Helm chart release.
         * @param releaseName the value to set
         * @return this builder
         **/
        public Builder releaseName(String releaseName) {
            this.releaseName = releaseName;
            this.__explicitlySet__.add("releaseName");
            return this;
        }
        /**
         * Default namespace to be used for Kubernetes deployment when not specified in the manifest.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Default namespace to be used for Kubernetes deployment when not specified in the manifest.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Time to wait for execution of a helm stage. Defaults to 300 seconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        /**
         * Time to wait for execution of a helm stage. Defaults to 300 seconds.
         * @param timeoutInSeconds the value to set
         * @return this builder
         **/
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rollbackPolicy")
        private DeployStageRollbackPolicy rollbackPolicy;

        public Builder rollbackPolicy(DeployStageRollbackPolicy rollbackPolicy) {
            this.rollbackPolicy = rollbackPolicy;
            this.__explicitlySet__.add("rollbackPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOkeHelmChartDeployStageDetails build() {
            UpdateOkeHelmChartDeployStageDetails model =
                    new UpdateOkeHelmChartDeployStageDetails(
                            this.description,
                            this.displayName,
                            this.deployStagePredecessorCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.okeClusterDeployEnvironmentId,
                            this.helmChartDeployArtifactId,
                            this.valuesArtifactIds,
                            this.releaseName,
                            this.namespace,
                            this.timeoutInSeconds,
                            this.rollbackPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOkeHelmChartDeployStageDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("deployStagePredecessorCollection")) {
                this.deployStagePredecessorCollection(model.getDeployStagePredecessorCollection());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("okeClusterDeployEnvironmentId")) {
                this.okeClusterDeployEnvironmentId(model.getOkeClusterDeployEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("helmChartDeployArtifactId")) {
                this.helmChartDeployArtifactId(model.getHelmChartDeployArtifactId());
            }
            if (model.wasPropertyExplicitlySet("valuesArtifactIds")) {
                this.valuesArtifactIds(model.getValuesArtifactIds());
            }
            if (model.wasPropertyExplicitlySet("releaseName")) {
                this.releaseName(model.getReleaseName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("timeoutInSeconds")) {
                this.timeoutInSeconds(model.getTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("rollbackPolicy")) {
                this.rollbackPolicy(model.getRollbackPolicy());
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
    public UpdateOkeHelmChartDeployStageDetails(
            String description,
            String displayName,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String okeClusterDeployEnvironmentId,
            String helmChartDeployArtifactId,
            java.util.List<String> valuesArtifactIds,
            String releaseName,
            String namespace,
            Integer timeoutInSeconds,
            DeployStageRollbackPolicy rollbackPolicy) {
        super(
                description,
                displayName,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.okeClusterDeployEnvironmentId = okeClusterDeployEnvironmentId;
        this.helmChartDeployArtifactId = helmChartDeployArtifactId;
        this.valuesArtifactIds = valuesArtifactIds;
        this.releaseName = releaseName;
        this.namespace = namespace;
        this.timeoutInSeconds = timeoutInSeconds;
        this.rollbackPolicy = rollbackPolicy;
    }

    /**
     * Kubernetes cluster environment OCID for deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("okeClusterDeployEnvironmentId")
    private final String okeClusterDeployEnvironmentId;

    /**
     * Kubernetes cluster environment OCID for deployment.
     * @return the value
     **/
    public String getOkeClusterDeployEnvironmentId() {
        return okeClusterDeployEnvironmentId;
    }

    /**
     * Helm chart artifact OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helmChartDeployArtifactId")
    private final String helmChartDeployArtifactId;

    /**
     * Helm chart artifact OCID.
     * @return the value
     **/
    public String getHelmChartDeployArtifactId() {
        return helmChartDeployArtifactId;
    }

    /**
     * List of values.yaml file artifact OCIDs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valuesArtifactIds")
    private final java.util.List<String> valuesArtifactIds;

    /**
     * List of values.yaml file artifact OCIDs.
     * @return the value
     **/
    public java.util.List<String> getValuesArtifactIds() {
        return valuesArtifactIds;
    }

    /**
     * Name of the Helm chart release.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseName")
    private final String releaseName;

    /**
     * Name of the Helm chart release.
     * @return the value
     **/
    public String getReleaseName() {
        return releaseName;
    }

    /**
     * Default namespace to be used for Kubernetes deployment when not specified in the manifest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Default namespace to be used for Kubernetes deployment when not specified in the manifest.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * Time to wait for execution of a helm stage. Defaults to 300 seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    private final Integer timeoutInSeconds;

    /**
     * Time to wait for execution of a helm stage. Defaults to 300 seconds.
     * @return the value
     **/
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rollbackPolicy")
    private final DeployStageRollbackPolicy rollbackPolicy;

    public DeployStageRollbackPolicy getRollbackPolicy() {
        return rollbackPolicy;
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
        sb.append("UpdateOkeHelmChartDeployStageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", okeClusterDeployEnvironmentId=")
                .append(String.valueOf(this.okeClusterDeployEnvironmentId));
        sb.append(", helmChartDeployArtifactId=")
                .append(String.valueOf(this.helmChartDeployArtifactId));
        sb.append(", valuesArtifactIds=").append(String.valueOf(this.valuesArtifactIds));
        sb.append(", releaseName=").append(String.valueOf(this.releaseName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", rollbackPolicy=").append(String.valueOf(this.rollbackPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOkeHelmChartDeployStageDetails)) {
            return false;
        }

        UpdateOkeHelmChartDeployStageDetails other = (UpdateOkeHelmChartDeployStageDetails) o;
        return java.util.Objects.equals(
                        this.okeClusterDeployEnvironmentId, other.okeClusterDeployEnvironmentId)
                && java.util.Objects.equals(
                        this.helmChartDeployArtifactId, other.helmChartDeployArtifactId)
                && java.util.Objects.equals(this.valuesArtifactIds, other.valuesArtifactIds)
                && java.util.Objects.equals(this.releaseName, other.releaseName)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(this.rollbackPolicy, other.rollbackPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.okeClusterDeployEnvironmentId == null
                                ? 43
                                : this.okeClusterDeployEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.helmChartDeployArtifactId == null
                                ? 43
                                : this.helmChartDeployArtifactId.hashCode());
        result =
                (result * PRIME)
                        + (this.valuesArtifactIds == null ? 43 : this.valuesArtifactIds.hashCode());
        result = (result * PRIME) + (this.releaseName == null ? 43 : this.releaseName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInSeconds == null ? 43 : this.timeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.rollbackPolicy == null ? 43 : this.rollbackPolicy.hashCode());
        return result;
    }
}
