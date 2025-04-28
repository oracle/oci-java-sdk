/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the execution details for Kubernetes (OKE) helm chart deployment stage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OkeHelmChartDeploymentStageExecutionProgress.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "deployStageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OkeHelmChartDeploymentStageExecutionProgress
        extends DeployStageExecutionProgress {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("deployStageDisplayName")
        private String deployStageDisplayName;

        public Builder deployStageDisplayName(String deployStageDisplayName) {
            this.deployStageDisplayName = deployStageDisplayName;
            this.__explicitlySet__.add("deployStageDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStageId")
        private String deployStageId;

        public Builder deployStageId(String deployStageId) {
            this.deployStageId = deployStageId;
            this.__explicitlySet__.add("deployStageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessors")
        private DeployStagePredecessorCollection deployStagePredecessors;

        public Builder deployStagePredecessors(
                DeployStagePredecessorCollection deployStagePredecessors) {
            this.deployStagePredecessors = deployStagePredecessors;
            this.__explicitlySet__.add("deployStagePredecessors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStageExecutionProgressDetails")
        private java.util.List<DeployStageExecutionProgressDetails>
                deployStageExecutionProgressDetails;

        public Builder deployStageExecutionProgressDetails(
                java.util.List<DeployStageExecutionProgressDetails>
                        deployStageExecutionProgressDetails) {
            this.deployStageExecutionProgressDetails = deployStageExecutionProgressDetails;
            this.__explicitlySet__.add("deployStageExecutionProgressDetails");
            return this;
        }
        /** Release name of the Helm chart. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseName")
        private String releaseName;

        /**
         * Release name of the Helm chart.
         *
         * @param releaseName the value to set
         * @return this builder
         */
        public Builder releaseName(String releaseName) {
            this.releaseName = releaseName;
            this.__explicitlySet__.add("releaseName");
            return this;
        }
        /** The URL of an OCIR repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("chartUrl")
        private String chartUrl;

        /**
         * The URL of an OCIR repository.
         *
         * @param chartUrl the value to set
         * @return this builder
         */
        public Builder chartUrl(String chartUrl) {
            this.chartUrl = chartUrl;
            this.__explicitlySet__.add("chartUrl");
            return this;
        }
        /** The version of the helm chart stored in OCIR repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the helm chart stored in OCIR repository.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Default namespace to be used for Kubernetes deployment when not specified in the
         * manifest.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Default namespace to be used for Kubernetes deployment when not specified in the
         * manifest.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Helm Diff output Example: Helm diff was successful data: - greeting: Version 1.0 +
         * greeting: Version 1.1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("helmDiff")
        private String helmDiff;

        /**
         * Helm Diff output Example: Helm diff was successful data: - greeting: Version 1.0 +
         * greeting: Version 1.1
         *
         * @param helmDiff the value to set
         * @return this builder
         */
        public Builder helmDiff(String helmDiff) {
            this.helmDiff = helmDiff;
            this.__explicitlySet__.add("helmDiff");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OkeHelmChartDeploymentStageExecutionProgress build() {
            OkeHelmChartDeploymentStageExecutionProgress model =
                    new OkeHelmChartDeploymentStageExecutionProgress(
                            this.deployStageDisplayName,
                            this.deployStageId,
                            this.timeStarted,
                            this.timeFinished,
                            this.status,
                            this.deployStagePredecessors,
                            this.deployStageExecutionProgressDetails,
                            this.releaseName,
                            this.chartUrl,
                            this.version,
                            this.namespace,
                            this.helmDiff);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OkeHelmChartDeploymentStageExecutionProgress model) {
            if (model.wasPropertyExplicitlySet("deployStageDisplayName")) {
                this.deployStageDisplayName(model.getDeployStageDisplayName());
            }
            if (model.wasPropertyExplicitlySet("deployStageId")) {
                this.deployStageId(model.getDeployStageId());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("deployStagePredecessors")) {
                this.deployStagePredecessors(model.getDeployStagePredecessors());
            }
            if (model.wasPropertyExplicitlySet("deployStageExecutionProgressDetails")) {
                this.deployStageExecutionProgressDetails(
                        model.getDeployStageExecutionProgressDetails());
            }
            if (model.wasPropertyExplicitlySet("releaseName")) {
                this.releaseName(model.getReleaseName());
            }
            if (model.wasPropertyExplicitlySet("chartUrl")) {
                this.chartUrl(model.getChartUrl());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("helmDiff")) {
                this.helmDiff(model.getHelmDiff());
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

    @Deprecated
    public OkeHelmChartDeploymentStageExecutionProgress(
            String deployStageDisplayName,
            String deployStageId,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Status status,
            DeployStagePredecessorCollection deployStagePredecessors,
            java.util.List<DeployStageExecutionProgressDetails> deployStageExecutionProgressDetails,
            String releaseName,
            String chartUrl,
            String version,
            String namespace,
            String helmDiff) {
        super(
                deployStageDisplayName,
                deployStageId,
                timeStarted,
                timeFinished,
                status,
                deployStagePredecessors,
                deployStageExecutionProgressDetails);
        this.releaseName = releaseName;
        this.chartUrl = chartUrl;
        this.version = version;
        this.namespace = namespace;
        this.helmDiff = helmDiff;
    }

    /** Release name of the Helm chart. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseName")
    private final String releaseName;

    /**
     * Release name of the Helm chart.
     *
     * @return the value
     */
    public String getReleaseName() {
        return releaseName;
    }

    /** The URL of an OCIR repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("chartUrl")
    private final String chartUrl;

    /**
     * The URL of an OCIR repository.
     *
     * @return the value
     */
    public String getChartUrl() {
        return chartUrl;
    }

    /** The version of the helm chart stored in OCIR repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the helm chart stored in OCIR repository.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /**
     * Default namespace to be used for Kubernetes deployment when not specified in the manifest.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Default namespace to be used for Kubernetes deployment when not specified in the manifest.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Helm Diff output Example: Helm diff was successful data: - greeting: Version 1.0 + greeting:
     * Version 1.1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("helmDiff")
    private final String helmDiff;

    /**
     * Helm Diff output Example: Helm diff was successful data: - greeting: Version 1.0 + greeting:
     * Version 1.1
     *
     * @return the value
     */
    public String getHelmDiff() {
        return helmDiff;
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
        sb.append("OkeHelmChartDeploymentStageExecutionProgress(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", releaseName=").append(String.valueOf(this.releaseName));
        sb.append(", chartUrl=").append(String.valueOf(this.chartUrl));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", helmDiff=").append(String.valueOf(this.helmDiff));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OkeHelmChartDeploymentStageExecutionProgress)) {
            return false;
        }

        OkeHelmChartDeploymentStageExecutionProgress other =
                (OkeHelmChartDeploymentStageExecutionProgress) o;
        return java.util.Objects.equals(this.releaseName, other.releaseName)
                && java.util.Objects.equals(this.chartUrl, other.chartUrl)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.helmDiff, other.helmDiff)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.releaseName == null ? 43 : this.releaseName.hashCode());
        result = (result * PRIME) + (this.chartUrl == null ? 43 : this.chartUrl.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.helmDiff == null ? 43 : this.helmDiff.hashCode());
        return result;
    }
}
