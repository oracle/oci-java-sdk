/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Artifact Registry source details.
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
    builder = GenericDeployArtifactSource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployArtifactSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GenericDeployArtifactSource extends DeployArtifactSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactPath")
        private String deployArtifactPath;

        public Builder deployArtifactPath(String deployArtifactPath) {
            this.deployArtifactPath = deployArtifactPath;
            this.__explicitlySet__.add("deployArtifactPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactVersion")
        private String deployArtifactVersion;

        public Builder deployArtifactVersion(String deployArtifactVersion) {
            this.deployArtifactVersion = deployArtifactVersion;
            this.__explicitlySet__.add("deployArtifactVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericDeployArtifactSource build() {
            GenericDeployArtifactSource __instance__ =
                    new GenericDeployArtifactSource(
                            repositoryId, deployArtifactPath, deployArtifactVersion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericDeployArtifactSource o) {
            Builder copiedBuilder =
                    repositoryId(o.getRepositoryId())
                            .deployArtifactPath(o.getDeployArtifactPath())
                            .deployArtifactVersion(o.getDeployArtifactVersion());

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
    public GenericDeployArtifactSource(
            String repositoryId, String deployArtifactPath, String deployArtifactVersion) {
        super();
        this.repositoryId = repositoryId;
        this.deployArtifactPath = deployArtifactPath;
        this.deployArtifactVersion = deployArtifactVersion;
    }

    /**
     * The OCID of a repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    private final String repositoryId;

    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * Specifies the artifact path in the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactPath")
    private final String deployArtifactPath;

    public String getDeployArtifactPath() {
        return deployArtifactPath;
    }

    /**
     * Users can set this as a placeholder value that refers to a pipeline parameter, for example, ${appVersion}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactVersion")
    private final String deployArtifactVersion;

    public String getDeployArtifactVersion() {
        return deployArtifactVersion;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GenericDeployArtifactSource(");
        sb.append("super=").append(super.toString());
        sb.append(", repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(", deployArtifactPath=").append(String.valueOf(this.deployArtifactPath));
        sb.append(", deployArtifactVersion=").append(String.valueOf(this.deployArtifactVersion));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericDeployArtifactSource)) {
            return false;
        }

        GenericDeployArtifactSource other = (GenericDeployArtifactSource) o;
        return java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.deployArtifactPath, other.deployArtifactPath)
                && java.util.Objects.equals(this.deployArtifactVersion, other.deployArtifactVersion)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.deployArtifactPath == null
                                ? 43
                                : this.deployArtifactPath.hashCode());
        result =
                (result * PRIME)
                        + (this.deployArtifactVersion == null
                                ? 43
                                : this.deployArtifactVersion.hashCode());
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
