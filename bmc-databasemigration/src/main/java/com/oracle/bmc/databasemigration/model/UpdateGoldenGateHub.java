/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details about Oracle GoldenGate Microservices.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateGoldenGateHub.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateGoldenGateHub extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "restAdminCredentials",
        "sourceDbAdminCredentials",
        "sourceContainerDbAdminCredentials",
        "targetDbAdminCredentials",
        "url",
        "sourceMicroservicesDeploymentName",
        "targetMicroservicesDeploymentName",
        "computeId"
    })
    public UpdateGoldenGateHub(
            UpdateAdminCredentials restAdminCredentials,
            UpdateAdminCredentials sourceDbAdminCredentials,
            UpdateAdminCredentials sourceContainerDbAdminCredentials,
            UpdateAdminCredentials targetDbAdminCredentials,
            String url,
            String sourceMicroservicesDeploymentName,
            String targetMicroservicesDeploymentName,
            String computeId) {
        super();
        this.restAdminCredentials = restAdminCredentials;
        this.sourceDbAdminCredentials = sourceDbAdminCredentials;
        this.sourceContainerDbAdminCredentials = sourceContainerDbAdminCredentials;
        this.targetDbAdminCredentials = targetDbAdminCredentials;
        this.url = url;
        this.sourceMicroservicesDeploymentName = sourceMicroservicesDeploymentName;
        this.targetMicroservicesDeploymentName = targetMicroservicesDeploymentName;
        this.computeId = computeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("restAdminCredentials")
        private UpdateAdminCredentials restAdminCredentials;

        public Builder restAdminCredentials(UpdateAdminCredentials restAdminCredentials) {
            this.restAdminCredentials = restAdminCredentials;
            this.__explicitlySet__.add("restAdminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDbAdminCredentials")
        private UpdateAdminCredentials sourceDbAdminCredentials;

        public Builder sourceDbAdminCredentials(UpdateAdminCredentials sourceDbAdminCredentials) {
            this.sourceDbAdminCredentials = sourceDbAdminCredentials;
            this.__explicitlySet__.add("sourceDbAdminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDbAdminCredentials")
        private UpdateAdminCredentials sourceContainerDbAdminCredentials;

        public Builder sourceContainerDbAdminCredentials(
                UpdateAdminCredentials sourceContainerDbAdminCredentials) {
            this.sourceContainerDbAdminCredentials = sourceContainerDbAdminCredentials;
            this.__explicitlySet__.add("sourceContainerDbAdminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDbAdminCredentials")
        private UpdateAdminCredentials targetDbAdminCredentials;

        public Builder targetDbAdminCredentials(UpdateAdminCredentials targetDbAdminCredentials) {
            this.targetDbAdminCredentials = targetDbAdminCredentials;
            this.__explicitlySet__.add("targetDbAdminCredentials");
            return this;
        }
        /**
         * Oracle GoldenGate hub's REST endpoint.
         * Refer to https://docs.oracle.com/en/middleware/goldengate/core/19.1/securing/network.html#GUID-A709DA55-111D-455E-8942-C9BDD1E38CAA
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Oracle GoldenGate hub's REST endpoint.
         * Refer to https://docs.oracle.com/en/middleware/goldengate/core/19.1/securing/network.html#GUID-A709DA55-111D-455E-8942-C9BDD1E38CAA
         *
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * Name of GoldenGate deployment to operate on source database
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceMicroservicesDeploymentName")
        private String sourceMicroservicesDeploymentName;

        /**
         * Name of GoldenGate deployment to operate on source database
         *
         * @param sourceMicroservicesDeploymentName the value to set
         * @return this builder
         **/
        public Builder sourceMicroservicesDeploymentName(String sourceMicroservicesDeploymentName) {
            this.sourceMicroservicesDeploymentName = sourceMicroservicesDeploymentName;
            this.__explicitlySet__.add("sourceMicroservicesDeploymentName");
            return this;
        }
        /**
         * Name of GoldenGate deployment to operate on target database
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetMicroservicesDeploymentName")
        private String targetMicroservicesDeploymentName;

        /**
         * Name of GoldenGate deployment to operate on target database
         *
         * @param targetMicroservicesDeploymentName the value to set
         * @return this builder
         **/
        public Builder targetMicroservicesDeploymentName(String targetMicroservicesDeploymentName) {
            this.targetMicroservicesDeploymentName = targetMicroservicesDeploymentName;
            this.__explicitlySet__.add("targetMicroservicesDeploymentName");
            return this;
        }
        /**
         * OCID of GoldenGate compute instance. An empty value will remove the stored computeId.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeId")
        private String computeId;

        /**
         * OCID of GoldenGate compute instance. An empty value will remove the stored computeId.
         *
         * @param computeId the value to set
         * @return this builder
         **/
        public Builder computeId(String computeId) {
            this.computeId = computeId;
            this.__explicitlySet__.add("computeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateGoldenGateHub build() {
            UpdateGoldenGateHub model =
                    new UpdateGoldenGateHub(
                            this.restAdminCredentials,
                            this.sourceDbAdminCredentials,
                            this.sourceContainerDbAdminCredentials,
                            this.targetDbAdminCredentials,
                            this.url,
                            this.sourceMicroservicesDeploymentName,
                            this.targetMicroservicesDeploymentName,
                            this.computeId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateGoldenGateHub model) {
            if (model.wasPropertyExplicitlySet("restAdminCredentials")) {
                this.restAdminCredentials(model.getRestAdminCredentials());
            }
            if (model.wasPropertyExplicitlySet("sourceDbAdminCredentials")) {
                this.sourceDbAdminCredentials(model.getSourceDbAdminCredentials());
            }
            if (model.wasPropertyExplicitlySet("sourceContainerDbAdminCredentials")) {
                this.sourceContainerDbAdminCredentials(
                        model.getSourceContainerDbAdminCredentials());
            }
            if (model.wasPropertyExplicitlySet("targetDbAdminCredentials")) {
                this.targetDbAdminCredentials(model.getTargetDbAdminCredentials());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("sourceMicroservicesDeploymentName")) {
                this.sourceMicroservicesDeploymentName(
                        model.getSourceMicroservicesDeploymentName());
            }
            if (model.wasPropertyExplicitlySet("targetMicroservicesDeploymentName")) {
                this.targetMicroservicesDeploymentName(
                        model.getTargetMicroservicesDeploymentName());
            }
            if (model.wasPropertyExplicitlySet("computeId")) {
                this.computeId(model.getComputeId());
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

    @com.fasterxml.jackson.annotation.JsonProperty("restAdminCredentials")
    private final UpdateAdminCredentials restAdminCredentials;

    public UpdateAdminCredentials getRestAdminCredentials() {
        return restAdminCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDbAdminCredentials")
    private final UpdateAdminCredentials sourceDbAdminCredentials;

    public UpdateAdminCredentials getSourceDbAdminCredentials() {
        return sourceDbAdminCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDbAdminCredentials")
    private final UpdateAdminCredentials sourceContainerDbAdminCredentials;

    public UpdateAdminCredentials getSourceContainerDbAdminCredentials() {
        return sourceContainerDbAdminCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetDbAdminCredentials")
    private final UpdateAdminCredentials targetDbAdminCredentials;

    public UpdateAdminCredentials getTargetDbAdminCredentials() {
        return targetDbAdminCredentials;
    }

    /**
     * Oracle GoldenGate hub's REST endpoint.
     * Refer to https://docs.oracle.com/en/middleware/goldengate/core/19.1/securing/network.html#GUID-A709DA55-111D-455E-8942-C9BDD1E38CAA
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Oracle GoldenGate hub's REST endpoint.
     * Refer to https://docs.oracle.com/en/middleware/goldengate/core/19.1/securing/network.html#GUID-A709DA55-111D-455E-8942-C9BDD1E38CAA
     *
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * Name of GoldenGate deployment to operate on source database
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMicroservicesDeploymentName")
    private final String sourceMicroservicesDeploymentName;

    /**
     * Name of GoldenGate deployment to operate on source database
     *
     * @return the value
     **/
    public String getSourceMicroservicesDeploymentName() {
        return sourceMicroservicesDeploymentName;
    }

    /**
     * Name of GoldenGate deployment to operate on target database
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetMicroservicesDeploymentName")
    private final String targetMicroservicesDeploymentName;

    /**
     * Name of GoldenGate deployment to operate on target database
     *
     * @return the value
     **/
    public String getTargetMicroservicesDeploymentName() {
        return targetMicroservicesDeploymentName;
    }

    /**
     * OCID of GoldenGate compute instance. An empty value will remove the stored computeId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeId")
    private final String computeId;

    /**
     * OCID of GoldenGate compute instance. An empty value will remove the stored computeId.
     *
     * @return the value
     **/
    public String getComputeId() {
        return computeId;
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
        sb.append("UpdateGoldenGateHub(");
        sb.append("super=").append(super.toString());
        sb.append("restAdminCredentials=").append(String.valueOf(this.restAdminCredentials));
        sb.append(", sourceDbAdminCredentials=")
                .append(String.valueOf(this.sourceDbAdminCredentials));
        sb.append(", sourceContainerDbAdminCredentials=")
                .append(String.valueOf(this.sourceContainerDbAdminCredentials));
        sb.append(", targetDbAdminCredentials=")
                .append(String.valueOf(this.targetDbAdminCredentials));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", sourceMicroservicesDeploymentName=")
                .append(String.valueOf(this.sourceMicroservicesDeploymentName));
        sb.append(", targetMicroservicesDeploymentName=")
                .append(String.valueOf(this.targetMicroservicesDeploymentName));
        sb.append(", computeId=").append(String.valueOf(this.computeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateGoldenGateHub)) {
            return false;
        }

        UpdateGoldenGateHub other = (UpdateGoldenGateHub) o;
        return java.util.Objects.equals(this.restAdminCredentials, other.restAdminCredentials)
                && java.util.Objects.equals(
                        this.sourceDbAdminCredentials, other.sourceDbAdminCredentials)
                && java.util.Objects.equals(
                        this.sourceContainerDbAdminCredentials,
                        other.sourceContainerDbAdminCredentials)
                && java.util.Objects.equals(
                        this.targetDbAdminCredentials, other.targetDbAdminCredentials)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(
                        this.sourceMicroservicesDeploymentName,
                        other.sourceMicroservicesDeploymentName)
                && java.util.Objects.equals(
                        this.targetMicroservicesDeploymentName,
                        other.targetMicroservicesDeploymentName)
                && java.util.Objects.equals(this.computeId, other.computeId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.restAdminCredentials == null
                                ? 43
                                : this.restAdminCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDbAdminCredentials == null
                                ? 43
                                : this.sourceDbAdminCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceContainerDbAdminCredentials == null
                                ? 43
                                : this.sourceContainerDbAdminCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDbAdminCredentials == null
                                ? 43
                                : this.targetDbAdminCredentials.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceMicroservicesDeploymentName == null
                                ? 43
                                : this.sourceMicroservicesDeploymentName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetMicroservicesDeploymentName == null
                                ? 43
                                : this.targetMicroservicesDeploymentName.hashCode());
        result = (result * PRIME) + (this.computeId == null ? 43 : this.computeId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
