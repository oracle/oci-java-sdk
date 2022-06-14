/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the execution details for Kubernetes (OKE) helm chart deployment stage.
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
    builder = OkeHelmChartDeploymentStageExecutionProgress.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
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
        /**
         * Release name of the Helm chart.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("releaseName")
        private String releaseName;

        /**
         * Release name of the Helm chart.
         * @param releaseName the value to set
         * @return this builder
         **/
        public Builder releaseName(String releaseName) {
            this.releaseName = releaseName;
            this.__explicitlySet__.add("releaseName");
            return this;
        }
        /**
         * The URL of an OCIR repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chartUrl")
        private String chartUrl;

        /**
         * The URL of an OCIR repository.
         * @param chartUrl the value to set
         * @return this builder
         **/
        public Builder chartUrl(String chartUrl) {
            this.chartUrl = chartUrl;
            this.__explicitlySet__.add("chartUrl");
            return this;
        }
        /**
         * The version of the helm chart stored in OCIR repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the helm chart stored in OCIR repository.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OkeHelmChartDeploymentStageExecutionProgress build() {
            OkeHelmChartDeploymentStageExecutionProgress __instance__ =
                    new OkeHelmChartDeploymentStageExecutionProgress(
                            deployStageDisplayName,
                            deployStageId,
                            timeStarted,
                            timeFinished,
                            status,
                            deployStagePredecessors,
                            deployStageExecutionProgressDetails,
                            releaseName,
                            chartUrl,
                            version,
                            namespace);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OkeHelmChartDeploymentStageExecutionProgress o) {
            Builder copiedBuilder =
                    deployStageDisplayName(o.getDeployStageDisplayName())
                            .deployStageId(o.getDeployStageId())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished())
                            .status(o.getStatus())
                            .deployStagePredecessors(o.getDeployStagePredecessors())
                            .deployStageExecutionProgressDetails(
                                    o.getDeployStageExecutionProgressDetails())
                            .releaseName(o.getReleaseName())
                            .chartUrl(o.getChartUrl())
                            .version(o.getVersion())
                            .namespace(o.getNamespace());

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
            String namespace) {
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
    }

    /**
     * Release name of the Helm chart.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseName")
    private final String releaseName;

    /**
     * Release name of the Helm chart.
     * @return the value
     **/
    public String getReleaseName() {
        return releaseName;
    }

    /**
     * The URL of an OCIR repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chartUrl")
    private final String chartUrl;

    /**
     * The URL of an OCIR repository.
     * @return the value
     **/
    public String getChartUrl() {
        return chartUrl;
    }

    /**
     * The version of the helm chart stored in OCIR repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the helm chart stored in OCIR repository.
     * @return the value
     **/
    public String getVersion() {
        return version;
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

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OkeHelmChartDeploymentStageExecutionProgress(");
        sb.append("super=").append(super.toString());
        sb.append(", releaseName=").append(String.valueOf(this.releaseName));
        sb.append(", chartUrl=").append(String.valueOf(this.chartUrl));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.releaseName == null ? 43 : this.releaseName.hashCode());
        result = (result * PRIME) + (this.chartUrl == null ? 43 : this.chartUrl.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
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
