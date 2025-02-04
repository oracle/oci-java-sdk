/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The model deployment workload configuration. <br>
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
        builder = ModelDeployWorkloadConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "workloadType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModelDeployWorkloadConfigurationDetails extends WorkloadConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a
         * list of strings. Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only
         * command to run in the absence of an {@code ENTRYPOINT}. The combined size of {@code CMD}
         * and {@code ENTRYPOINT} must be less than 2048 bytes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cmd")
        private String cmd;

        /**
         * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a
         * list of strings. Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only
         * command to run in the absence of an {@code ENTRYPOINT}. The combined size of {@code CMD}
         * and {@code ENTRYPOINT} must be less than 2048 bytes.
         *
         * @param cmd the value to set
         * @return this builder
         */
        public Builder cmd(String cmd) {
            this.cmd = cmd;
            this.__explicitlySet__.add("cmd");
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
        /** The additional configurations */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalConfigurations")
        private java.util.Map<String, String> additionalConfigurations;

        /**
         * The additional configurations
         *
         * @param additionalConfigurations the value to set
         * @return this builder
         */
        public Builder additionalConfigurations(
                java.util.Map<String, String> additionalConfigurations) {
            this.additionalConfigurations = additionalConfigurations;
            this.__explicitlySet__.add("additionalConfigurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelDeployWorkloadConfigurationDetails build() {
            ModelDeployWorkloadConfigurationDetails model =
                    new ModelDeployWorkloadConfigurationDetails(
                            this.cmd,
                            this.serverPort,
                            this.healthCheckPort,
                            this.additionalConfigurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelDeployWorkloadConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("cmd")) {
                this.cmd(model.getCmd());
            }
            if (model.wasPropertyExplicitlySet("serverPort")) {
                this.serverPort(model.getServerPort());
            }
            if (model.wasPropertyExplicitlySet("healthCheckPort")) {
                this.healthCheckPort(model.getHealthCheckPort());
            }
            if (model.wasPropertyExplicitlySet("additionalConfigurations")) {
                this.additionalConfigurations(model.getAdditionalConfigurations());
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
    public ModelDeployWorkloadConfigurationDetails(
            String cmd,
            Integer serverPort,
            Integer healthCheckPort,
            java.util.Map<String, String> additionalConfigurations) {
        super();
        this.cmd = cmd;
        this.serverPort = serverPort;
        this.healthCheckPort = healthCheckPort;
        this.additionalConfigurations = additionalConfigurations;
    }

    /**
     * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a
     * list of strings. Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only command
     * to run in the absence of an {@code ENTRYPOINT}. The combined size of {@code CMD} and {@code
     * ENTRYPOINT} must be less than 2048 bytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cmd")
    private final String cmd;

    /**
     * The container image run [CMD](https://docs.docker.com/engine/reference/builder/#cmd) as a
     * list of strings. Use {@code CMD} as arguments to the {@code ENTRYPOINT} or the only command
     * to run in the absence of an {@code ENTRYPOINT}. The combined size of {@code CMD} and {@code
     * ENTRYPOINT} must be less than 2048 bytes.
     *
     * @return the value
     */
    public String getCmd() {
        return cmd;
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

    /** The additional configurations */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalConfigurations")
    private final java.util.Map<String, String> additionalConfigurations;

    /**
     * The additional configurations
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalConfigurations() {
        return additionalConfigurations;
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
        sb.append("ModelDeployWorkloadConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", cmd=").append(String.valueOf(this.cmd));
        sb.append(", serverPort=").append(String.valueOf(this.serverPort));
        sb.append(", healthCheckPort=").append(String.valueOf(this.healthCheckPort));
        sb.append(", additionalConfigurations=")
                .append(String.valueOf(this.additionalConfigurations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelDeployWorkloadConfigurationDetails)) {
            return false;
        }

        ModelDeployWorkloadConfigurationDetails other = (ModelDeployWorkloadConfigurationDetails) o;
        return java.util.Objects.equals(this.cmd, other.cmd)
                && java.util.Objects.equals(this.serverPort, other.serverPort)
                && java.util.Objects.equals(this.healthCheckPort, other.healthCheckPort)
                && java.util.Objects.equals(
                        this.additionalConfigurations, other.additionalConfigurations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.cmd == null ? 43 : this.cmd.hashCode());
        result = (result * PRIME) + (this.serverPort == null ? 43 : this.serverPort.hashCode());
        result =
                (result * PRIME)
                        + (this.healthCheckPort == null ? 43 : this.healthCheckPort.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalConfigurations == null
                                ? 43
                                : this.additionalConfigurations.hashCode());
        return result;
    }
}
