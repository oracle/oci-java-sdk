/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of the generic artifacts delivered through the Deliver Artifacts stage.
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
    builder = GenericDeliveredArtifact.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "artifactType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GenericDeliveredArtifact extends DeliveredArtifact {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactId")
        private String deployArtifactId;

        public Builder deployArtifactId(String deployArtifactId) {
            this.deployArtifactId = deployArtifactId;
            this.__explicitlySet__.add("deployArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputArtifactName")
        private String outputArtifactName;

        public Builder outputArtifactName(String outputArtifactName) {
            this.outputArtifactName = outputArtifactName;
            this.__explicitlySet__.add("outputArtifactName");
            return this;
        }
        /**
         * The OCID of the artifact registry repository used by the DeliverArtifactStage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("artifactRepositoryId")
        private String artifactRepositoryId;

        /**
         * The OCID of the artifact registry repository used by the DeliverArtifactStage
         * @param artifactRepositoryId the value to set
         * @return this builder
         **/
        public Builder artifactRepositoryId(String artifactRepositoryId) {
            this.artifactRepositoryId = artifactRepositoryId;
            this.__explicitlySet__.add("artifactRepositoryId");
            return this;
        }
        /**
         * The OCID of the artifact pushed by the Deliver Artifacts stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifactId")
        private String deliveredArtifactId;

        /**
         * The OCID of the artifact pushed by the Deliver Artifacts stage.
         * @param deliveredArtifactId the value to set
         * @return this builder
         **/
        public Builder deliveredArtifactId(String deliveredArtifactId) {
            this.deliveredArtifactId = deliveredArtifactId;
            this.__explicitlySet__.add("deliveredArtifactId");
            return this;
        }
        /**
         * Path of the repository where artifact was pushed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Path of the repository where artifact was pushed
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * Version of the artifact pushed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Version of the artifact pushed
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericDeliveredArtifact build() {
            GenericDeliveredArtifact model =
                    new GenericDeliveredArtifact(
                            this.deployArtifactId,
                            this.outputArtifactName,
                            this.artifactRepositoryId,
                            this.deliveredArtifactId,
                            this.path,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericDeliveredArtifact model) {
            if (model.wasPropertyExplicitlySet("deployArtifactId")) {
                this.deployArtifactId(model.getDeployArtifactId());
            }
            if (model.wasPropertyExplicitlySet("outputArtifactName")) {
                this.outputArtifactName(model.getOutputArtifactName());
            }
            if (model.wasPropertyExplicitlySet("artifactRepositoryId")) {
                this.artifactRepositoryId(model.getArtifactRepositoryId());
            }
            if (model.wasPropertyExplicitlySet("deliveredArtifactId")) {
                this.deliveredArtifactId(model.getDeliveredArtifactId());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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
    public GenericDeliveredArtifact(
            String deployArtifactId,
            String outputArtifactName,
            String artifactRepositoryId,
            String deliveredArtifactId,
            String path,
            String version) {
        super(deployArtifactId, outputArtifactName);
        this.artifactRepositoryId = artifactRepositoryId;
        this.deliveredArtifactId = deliveredArtifactId;
        this.path = path;
        this.version = version;
    }

    /**
     * The OCID of the artifact registry repository used by the DeliverArtifactStage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("artifactRepositoryId")
    private final String artifactRepositoryId;

    /**
     * The OCID of the artifact registry repository used by the DeliverArtifactStage
     * @return the value
     **/
    public String getArtifactRepositoryId() {
        return artifactRepositoryId;
    }

    /**
     * The OCID of the artifact pushed by the Deliver Artifacts stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifactId")
    private final String deliveredArtifactId;

    /**
     * The OCID of the artifact pushed by the Deliver Artifacts stage.
     * @return the value
     **/
    public String getDeliveredArtifactId() {
        return deliveredArtifactId;
    }

    /**
     * Path of the repository where artifact was pushed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Path of the repository where artifact was pushed
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     * Version of the artifact pushed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Version of the artifact pushed
     * @return the value
     **/
    public String getVersion() {
        return version;
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
        sb.append("GenericDeliveredArtifact(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", artifactRepositoryId=").append(String.valueOf(this.artifactRepositoryId));
        sb.append(", deliveredArtifactId=").append(String.valueOf(this.deliveredArtifactId));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericDeliveredArtifact)) {
            return false;
        }

        GenericDeliveredArtifact other = (GenericDeliveredArtifact) o;
        return java.util.Objects.equals(this.artifactRepositoryId, other.artifactRepositoryId)
                && java.util.Objects.equals(this.deliveredArtifactId, other.deliveredArtifactId)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.artifactRepositoryId == null
                                ? 43
                                : this.artifactRepositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.deliveredArtifactId == null
                                ? 43
                                : this.deliveredArtifactId.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        return result;
    }
}
