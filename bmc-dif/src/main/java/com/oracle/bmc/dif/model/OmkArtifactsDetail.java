/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Detail to deploy artifacts for OMK service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OmkArtifactsDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OmkArtifactsDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "secrets",
        "manifestObjectStoragePath",
        "componentValueOverrides"
    })
    public OmkArtifactsDetail(
            String instanceId,
            java.util.List<SecretDetail> secrets,
            String manifestObjectStoragePath,
            java.util.List<ComponentValueOverride> componentValueOverrides) {
        super();
        this.instanceId = instanceId;
        this.secrets = secrets;
        this.manifestObjectStoragePath = manifestObjectStoragePath;
        this.componentValueOverrides = componentValueOverrides;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Instance id of the existing OMK instance for artifact deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Instance id of the existing OMK instance for artifact deployment.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * List of kubernetes secrets to create or update in the namespace-name of target
         * cluster-namespace. Each entry source secret values from OCI vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secrets")
        private java.util.List<SecretDetail> secrets;

        /**
         * List of kubernetes secrets to create or update in the namespace-name of target
         * cluster-namespace. Each entry source secret values from OCI vault.
         *
         * @param secrets the value to set
         * @return this builder
         */
        public Builder secrets(java.util.List<SecretDetail> secrets) {
            this.secrets = secrets;
            this.__explicitlySet__.add("secrets");
            return this;
        }
        /** Object storage path for the deployment manifest. */
        @com.fasterxml.jackson.annotation.JsonProperty("manifestObjectStoragePath")
        private String manifestObjectStoragePath;

        /**
         * Object storage path for the deployment manifest.
         *
         * @param manifestObjectStoragePath the value to set
         * @return this builder
         */
        public Builder manifestObjectStoragePath(String manifestObjectStoragePath) {
            this.manifestObjectStoragePath = manifestObjectStoragePath;
            this.__explicitlySet__.add("manifestObjectStoragePath");
            return this;
        }
        /**
         * Component overrides for stack specific parameters applied during artifact template
         * rendering.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("componentValueOverrides")
        private java.util.List<ComponentValueOverride> componentValueOverrides;

        /**
         * Component overrides for stack specific parameters applied during artifact template
         * rendering.
         *
         * @param componentValueOverrides the value to set
         * @return this builder
         */
        public Builder componentValueOverrides(
                java.util.List<ComponentValueOverride> componentValueOverrides) {
            this.componentValueOverrides = componentValueOverrides;
            this.__explicitlySet__.add("componentValueOverrides");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OmkArtifactsDetail build() {
            OmkArtifactsDetail model =
                    new OmkArtifactsDetail(
                            this.instanceId,
                            this.secrets,
                            this.manifestObjectStoragePath,
                            this.componentValueOverrides);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OmkArtifactsDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("secrets")) {
                this.secrets(model.getSecrets());
            }
            if (model.wasPropertyExplicitlySet("manifestObjectStoragePath")) {
                this.manifestObjectStoragePath(model.getManifestObjectStoragePath());
            }
            if (model.wasPropertyExplicitlySet("componentValueOverrides")) {
                this.componentValueOverrides(model.getComponentValueOverrides());
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

    /** Instance id of the existing OMK instance for artifact deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Instance id of the existing OMK instance for artifact deployment.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * List of kubernetes secrets to create or update in the namespace-name of target
     * cluster-namespace. Each entry source secret values from OCI vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secrets")
    private final java.util.List<SecretDetail> secrets;

    /**
     * List of kubernetes secrets to create or update in the namespace-name of target
     * cluster-namespace. Each entry source secret values from OCI vault.
     *
     * @return the value
     */
    public java.util.List<SecretDetail> getSecrets() {
        return secrets;
    }

    /** Object storage path for the deployment manifest. */
    @com.fasterxml.jackson.annotation.JsonProperty("manifestObjectStoragePath")
    private final String manifestObjectStoragePath;

    /**
     * Object storage path for the deployment manifest.
     *
     * @return the value
     */
    public String getManifestObjectStoragePath() {
        return manifestObjectStoragePath;
    }

    /**
     * Component overrides for stack specific parameters applied during artifact template rendering.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("componentValueOverrides")
    private final java.util.List<ComponentValueOverride> componentValueOverrides;

    /**
     * Component overrides for stack specific parameters applied during artifact template rendering.
     *
     * @return the value
     */
    public java.util.List<ComponentValueOverride> getComponentValueOverrides() {
        return componentValueOverrides;
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
        sb.append("OmkArtifactsDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", secrets=").append(String.valueOf(this.secrets));
        sb.append(", manifestObjectStoragePath=")
                .append(String.valueOf(this.manifestObjectStoragePath));
        sb.append(", componentValueOverrides=")
                .append(String.valueOf(this.componentValueOverrides));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OmkArtifactsDetail)) {
            return false;
        }

        OmkArtifactsDetail other = (OmkArtifactsDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.secrets, other.secrets)
                && java.util.Objects.equals(
                        this.manifestObjectStoragePath, other.manifestObjectStoragePath)
                && java.util.Objects.equals(
                        this.componentValueOverrides, other.componentValueOverrides)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.secrets == null ? 43 : this.secrets.hashCode());
        result =
                (result * PRIME)
                        + (this.manifestObjectStoragePath == null
                                ? 43
                                : this.manifestObjectStoragePath.hashCode());
        result =
                (result * PRIME)
                        + (this.componentValueOverrides == null
                                ? 43
                                : this.componentValueOverrides.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
