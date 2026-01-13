/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The update environment configuration details object for OCI Registry <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOcirModelDeploymentEnvironmentConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "environmentConfigurationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOcirModelDeploymentEnvironmentConfigurationDetails
        extends UpdateModelDeploymentEnvironmentConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The full path to the Oracle Container Repository (OCIR) registry, image, and tag in a
         * canonical format. Acceptable format: {@code <region>.ocir.io/<registry>/<image>:<tag>}
         * {@code <region>.ocir.io/<registry>/<image>:<tag>@digest}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private String image;

        /**
         * The full path to the Oracle Container Repository (OCIR) registry, image, and tag in a
         * canonical format. Acceptable format: {@code <region>.ocir.io/<registry>/<image>:<tag>}
         * {@code <region>.ocir.io/<registry>/<image>:<tag>@digest}
         *
         * @param image the value to set
         * @return this builder
         */
        public Builder image(String image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }
        /**
         * The digest of the container image. For example, {@code
         * sha256:881303a6b2738834d795a32b4a98eb0e5e3d1cad590a712d1e04f9b2fa90a030}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
        private String imageDigest;

        /**
         * The digest of the container image. For example, {@code
         * sha256:881303a6b2738834d795a32b4a98eb0e5e3d1cad590a712d1e04f9b2fa90a030}
         *
         * @param imageDigest the value to set
         * @return this builder
         */
        public Builder imageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            this.__explicitlySet__.add("imageDigest");
            return this;
        }
        /**
         * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a
         * list of strings. Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only
         * command to run in the absence of an {@code ENTRYPOINT}. The combined size of {@code CMD}
         * and {@code ENTRYPOINT} must be less than 2048 bytes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cmd")
        private java.util.List<String> cmd;

        /**
         * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a
         * list of strings. Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only
         * command to run in the absence of an {@code ENTRYPOINT}. The combined size of {@code CMD}
         * and {@code ENTRYPOINT} must be less than 2048 bytes.
         *
         * @param cmd the value to set
         * @return this builder
         */
        public Builder cmd(java.util.List<String> cmd) {
            this.cmd = cmd;
            this.__explicitlySet__.add("cmd");
            return this;
        }
        /**
         * The container image run
         * [ENTRYPOINT](https://docs.docker.com/engine/reference/builder/#entrypoint) as a list of
         * strings. Accept the {@code CMD} as extra arguments. The combined size of {@code CMD} and
         * {@code ENTRYPOINT} must be less than 2048 bytes. More information on how {@code CMD} and
         * {@code ENTRYPOINT} interact are
         * [here](https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("entrypoint")
        private java.util.List<String> entrypoint;

        /**
         * The container image run
         * [ENTRYPOINT](https://docs.docker.com/engine/reference/builder/#entrypoint) as a list of
         * strings. Accept the {@code CMD} as extra arguments. The combined size of {@code CMD} and
         * {@code ENTRYPOINT} must be less than 2048 bytes. More information on how {@code CMD} and
         * {@code ENTRYPOINT} interact are
         * [here](https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact).
         *
         * @param entrypoint the value to set
         * @return this builder
         */
        public Builder entrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            this.__explicitlySet__.add("entrypoint");
            return this;
        }
        /**
         * The port on which the web server serving the inference is running. The port can be
         * anything between {@code 1024} and {@code 65535}. The following ports cannot be used
         * {@code 24224}, {@code 8446}, {@code 8447}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serverPort")
        private Integer serverPort;

        /**
         * The port on which the web server serving the inference is running. The port can be
         * anything between {@code 1024} and {@code 65535}. The following ports cannot be used
         * {@code 24224}, {@code 8446}, {@code 8447}.
         *
         * @param serverPort the value to set
         * @return this builder
         */
        public Builder serverPort(Integer serverPort) {
            this.serverPort = serverPort;
            this.__explicitlySet__.add("serverPort");
            return this;
        }
        /**
         * The port on which the container
         * [HEALTHCHECK](https://docs.docker.com/engine/reference/builder/#healthcheck) would
         * listen. The port can be anything between {@code 1024} and {@code 65535}. The following
         * ports cannot be used {@code 24224}, {@code 8446}, {@code 8447}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckPort")
        private Integer healthCheckPort;

        /**
         * The port on which the container
         * [HEALTHCHECK](https://docs.docker.com/engine/reference/builder/#healthcheck) would
         * listen. The port can be anything between {@code 1024} and {@code 65535}. The following
         * ports cannot be used {@code 24224}, {@code 8446}, {@code 8447}.
         *
         * @param healthCheckPort the value to set
         * @return this builder
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            this.__explicitlySet__.add("healthCheckPort");
            return this;
        }
        /**
         * Environment variables to set for the web server container. The size of envVars must be
         * less than 2048 bytes. Key should be under 32 characters. Key should contain only letters,
         * digits and underscore (_) Key should start with a letter. Key should have at least 2
         * characters. Key should not end with underscore eg. {@code TEST_} Key if added cannot be
         * empty. Value can be empty. No specific size limits on individual Values. But overall
         * environment variables is limited to 2048 bytes. Key can't be reserved Model Deployment
         * environment variables.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.Map<String, String> environmentVariables;

        /**
         * Environment variables to set for the web server container. The size of envVars must be
         * less than 2048 bytes. Key should be under 32 characters. Key should contain only letters,
         * digits and underscore (_) Key should start with a letter. Key should have at least 2
         * characters. Key should not end with underscore eg. {@code TEST_} Key if added cannot be
         * empty. Value can be empty. No specific size limits on individual Values. But overall
         * environment variables is limited to 2048 bytes. Key can't be reserved Model Deployment
         * environment variables.
         *
         * @param environmentVariables the value to set
         * @return this builder
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOcirModelDeploymentEnvironmentConfigurationDetails build() {
            UpdateOcirModelDeploymentEnvironmentConfigurationDetails model =
                    new UpdateOcirModelDeploymentEnvironmentConfigurationDetails(
                            this.image,
                            this.imageDigest,
                            this.cmd,
                            this.entrypoint,
                            this.serverPort,
                            this.healthCheckPort,
                            this.environmentVariables);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOcirModelDeploymentEnvironmentConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("image")) {
                this.image(model.getImage());
            }
            if (model.wasPropertyExplicitlySet("imageDigest")) {
                this.imageDigest(model.getImageDigest());
            }
            if (model.wasPropertyExplicitlySet("cmd")) {
                this.cmd(model.getCmd());
            }
            if (model.wasPropertyExplicitlySet("entrypoint")) {
                this.entrypoint(model.getEntrypoint());
            }
            if (model.wasPropertyExplicitlySet("serverPort")) {
                this.serverPort(model.getServerPort());
            }
            if (model.wasPropertyExplicitlySet("healthCheckPort")) {
                this.healthCheckPort(model.getHealthCheckPort());
            }
            if (model.wasPropertyExplicitlySet("environmentVariables")) {
                this.environmentVariables(model.getEnvironmentVariables());
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
    public UpdateOcirModelDeploymentEnvironmentConfigurationDetails(
            String image,
            String imageDigest,
            java.util.List<String> cmd,
            java.util.List<String> entrypoint,
            Integer serverPort,
            Integer healthCheckPort,
            java.util.Map<String, String> environmentVariables) {
        super();
        this.image = image;
        this.imageDigest = imageDigest;
        this.cmd = cmd;
        this.entrypoint = entrypoint;
        this.serverPort = serverPort;
        this.healthCheckPort = healthCheckPort;
        this.environmentVariables = environmentVariables;
    }

    /**
     * The full path to the Oracle Container Repository (OCIR) registry, image, and tag in a
     * canonical format. Acceptable format: {@code <region>.ocir.io/<registry>/<image>:<tag>} {@code
     * <region>.ocir.io/<registry>/<image>:<tag>@digest}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final String image;

    /**
     * The full path to the Oracle Container Repository (OCIR) registry, image, and tag in a
     * canonical format. Acceptable format: {@code <region>.ocir.io/<registry>/<image>:<tag>} {@code
     * <region>.ocir.io/<registry>/<image>:<tag>@digest}
     *
     * @return the value
     */
    public String getImage() {
        return image;
    }

    /**
     * The digest of the container image. For example, {@code
     * sha256:881303a6b2738834d795a32b4a98eb0e5e3d1cad590a712d1e04f9b2fa90a030}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
    private final String imageDigest;

    /**
     * The digest of the container image. For example, {@code
     * sha256:881303a6b2738834d795a32b4a98eb0e5e3d1cad590a712d1e04f9b2fa90a030}
     *
     * @return the value
     */
    public String getImageDigest() {
        return imageDigest;
    }

    /**
     * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a
     * list of strings. Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only command
     * to run in the absence of an {@code ENTRYPOINT}. The combined size of {@code CMD} and {@code
     * ENTRYPOINT} must be less than 2048 bytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cmd")
    private final java.util.List<String> cmd;

    /**
     * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a
     * list of strings. Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only command
     * to run in the absence of an {@code ENTRYPOINT}. The combined size of {@code CMD} and {@code
     * ENTRYPOINT} must be less than 2048 bytes.
     *
     * @return the value
     */
    public java.util.List<String> getCmd() {
        return cmd;
    }

    /**
     * The container image run
     * [ENTRYPOINT](https://docs.docker.com/engine/reference/builder/#entrypoint) as a list of
     * strings. Accept the {@code CMD} as extra arguments. The combined size of {@code CMD} and
     * {@code ENTRYPOINT} must be less than 2048 bytes. More information on how {@code CMD} and
     * {@code ENTRYPOINT} interact are
     * [here](https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entrypoint")
    private final java.util.List<String> entrypoint;

    /**
     * The container image run
     * [ENTRYPOINT](https://docs.docker.com/engine/reference/builder/#entrypoint) as a list of
     * strings. Accept the {@code CMD} as extra arguments. The combined size of {@code CMD} and
     * {@code ENTRYPOINT} must be less than 2048 bytes. More information on how {@code CMD} and
     * {@code ENTRYPOINT} interact are
     * [here](https://docs.docker.com/engine/reference/builder/#understand-how-cmd-and-entrypoint-interact).
     *
     * @return the value
     */
    public java.util.List<String> getEntrypoint() {
        return entrypoint;
    }

    /**
     * The port on which the web server serving the inference is running. The port can be anything
     * between {@code 1024} and {@code 65535}. The following ports cannot be used {@code 24224},
     * {@code 8446}, {@code 8447}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverPort")
    private final Integer serverPort;

    /**
     * The port on which the web server serving the inference is running. The port can be anything
     * between {@code 1024} and {@code 65535}. The following ports cannot be used {@code 24224},
     * {@code 8446}, {@code 8447}.
     *
     * @return the value
     */
    public Integer getServerPort() {
        return serverPort;
    }

    /**
     * The port on which the container
     * [HEALTHCHECK](https://docs.docker.com/engine/reference/builder/#healthcheck) would listen.
     * The port can be anything between {@code 1024} and {@code 65535}. The following ports cannot
     * be used {@code 24224}, {@code 8446}, {@code 8447}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckPort")
    private final Integer healthCheckPort;

    /**
     * The port on which the container
     * [HEALTHCHECK](https://docs.docker.com/engine/reference/builder/#healthcheck) would listen.
     * The port can be anything between {@code 1024} and {@code 65535}. The following ports cannot
     * be used {@code 24224}, {@code 8446}, {@code 8447}.
     *
     * @return the value
     */
    public Integer getHealthCheckPort() {
        return healthCheckPort;
    }

    /**
     * Environment variables to set for the web server container. The size of envVars must be less
     * than 2048 bytes. Key should be under 32 characters. Key should contain only letters, digits
     * and underscore (_) Key should start with a letter. Key should have at least 2 characters. Key
     * should not end with underscore eg. {@code TEST_} Key if added cannot be empty. Value can be
     * empty. No specific size limits on individual Values. But overall environment variables is
     * limited to 2048 bytes. Key can't be reserved Model Deployment environment variables.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.Map<String, String> environmentVariables;

    /**
     * Environment variables to set for the web server container. The size of envVars must be less
     * than 2048 bytes. Key should be under 32 characters. Key should contain only letters, digits
     * and underscore (_) Key should start with a letter. Key should have at least 2 characters. Key
     * should not end with underscore eg. {@code TEST_} Key if added cannot be empty. Value can be
     * empty. No specific size limits on individual Values. But overall environment variables is
     * limited to 2048 bytes. Key can't be reserved Model Deployment environment variables.
     *
     * @return the value
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
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
        sb.append("UpdateOcirModelDeploymentEnvironmentConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", image=").append(String.valueOf(this.image));
        sb.append(", imageDigest=").append(String.valueOf(this.imageDigest));
        sb.append(", cmd=").append(String.valueOf(this.cmd));
        sb.append(", entrypoint=").append(String.valueOf(this.entrypoint));
        sb.append(", serverPort=").append(String.valueOf(this.serverPort));
        sb.append(", healthCheckPort=").append(String.valueOf(this.healthCheckPort));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOcirModelDeploymentEnvironmentConfigurationDetails)) {
            return false;
        }

        UpdateOcirModelDeploymentEnvironmentConfigurationDetails other =
                (UpdateOcirModelDeploymentEnvironmentConfigurationDetails) o;
        return java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.imageDigest, other.imageDigest)
                && java.util.Objects.equals(this.cmd, other.cmd)
                && java.util.Objects.equals(this.entrypoint, other.entrypoint)
                && java.util.Objects.equals(this.serverPort, other.serverPort)
                && java.util.Objects.equals(this.healthCheckPort, other.healthCheckPort)
                && java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.image == null ? 43 : this.image.hashCode());
        result = (result * PRIME) + (this.imageDigest == null ? 43 : this.imageDigest.hashCode());
        result = (result * PRIME) + (this.cmd == null ? 43 : this.cmd.hashCode());
        result = (result * PRIME) + (this.entrypoint == null ? 43 : this.entrypoint.hashCode());
        result = (result * PRIME) + (this.serverPort == null ? 43 : this.serverPort.hashCode());
        result =
                (result * PRIME)
                        + (this.healthCheckPort == null ? 43 : this.healthCheckPort.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentVariables == null
                                ? 43
                                : this.environmentVariables.hashCode());
        return result;
    }
}
