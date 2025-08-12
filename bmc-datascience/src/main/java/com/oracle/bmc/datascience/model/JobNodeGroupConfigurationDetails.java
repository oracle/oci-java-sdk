/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details of Job Node Group Configuration <br>
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
        builder = JobNodeGroupConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobNodeGroupConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "replicas",
        "minimumSuccessReplicas",
        "jobInfrastructureConfigurationDetails",
        "jobConfigurationDetails",
        "jobEnvironmentConfigurationDetails"
    })
    public JobNodeGroupConfigurationDetails(
            String name,
            Integer replicas,
            Integer minimumSuccessReplicas,
            JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails,
            JobConfigurationDetails jobConfigurationDetails,
            JobEnvironmentConfigurationDetails jobEnvironmentConfigurationDetails) {
        super();
        this.name = name;
        this.replicas = replicas;
        this.minimumSuccessReplicas = minimumSuccessReplicas;
        this.jobInfrastructureConfigurationDetails = jobInfrastructureConfigurationDetails;
        this.jobConfigurationDetails = jobConfigurationDetails;
        this.jobEnvironmentConfigurationDetails = jobEnvironmentConfigurationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** node group name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * node group name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The number of nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicas")
        private Integer replicas;

        /**
         * The number of nodes.
         *
         * @param replicas the value to set
         * @return this builder
         */
        public Builder replicas(Integer replicas) {
            this.replicas = replicas;
            this.__explicitlySet__.add("replicas");
            return this;
        }
        /**
         * The minimum threshold of successful replicas for node group to be successful. All
         * replicas need to succeed if this is not specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumSuccessReplicas")
        private Integer minimumSuccessReplicas;

        /**
         * The minimum threshold of successful replicas for node group to be successful. All
         * replicas need to succeed if this is not specified.
         *
         * @param minimumSuccessReplicas the value to set
         * @return this builder
         */
        public Builder minimumSuccessReplicas(Integer minimumSuccessReplicas) {
            this.minimumSuccessReplicas = minimumSuccessReplicas;
            this.__explicitlySet__.add("minimumSuccessReplicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobInfrastructureConfigurationDetails")
        private JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails;

        public Builder jobInfrastructureConfigurationDetails(
                JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails) {
            this.jobInfrastructureConfigurationDetails = jobInfrastructureConfigurationDetails;
            this.__explicitlySet__.add("jobInfrastructureConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobConfigurationDetails")
        private JobConfigurationDetails jobConfigurationDetails;

        public Builder jobConfigurationDetails(JobConfigurationDetails jobConfigurationDetails) {
            this.jobConfigurationDetails = jobConfigurationDetails;
            this.__explicitlySet__.add("jobConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobEnvironmentConfigurationDetails")
        private JobEnvironmentConfigurationDetails jobEnvironmentConfigurationDetails;

        public Builder jobEnvironmentConfigurationDetails(
                JobEnvironmentConfigurationDetails jobEnvironmentConfigurationDetails) {
            this.jobEnvironmentConfigurationDetails = jobEnvironmentConfigurationDetails;
            this.__explicitlySet__.add("jobEnvironmentConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobNodeGroupConfigurationDetails build() {
            JobNodeGroupConfigurationDetails model =
                    new JobNodeGroupConfigurationDetails(
                            this.name,
                            this.replicas,
                            this.minimumSuccessReplicas,
                            this.jobInfrastructureConfigurationDetails,
                            this.jobConfigurationDetails,
                            this.jobEnvironmentConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobNodeGroupConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("replicas")) {
                this.replicas(model.getReplicas());
            }
            if (model.wasPropertyExplicitlySet("minimumSuccessReplicas")) {
                this.minimumSuccessReplicas(model.getMinimumSuccessReplicas());
            }
            if (model.wasPropertyExplicitlySet("jobInfrastructureConfigurationDetails")) {
                this.jobInfrastructureConfigurationDetails(
                        model.getJobInfrastructureConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("jobConfigurationDetails")) {
                this.jobConfigurationDetails(model.getJobConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("jobEnvironmentConfigurationDetails")) {
                this.jobEnvironmentConfigurationDetails(
                        model.getJobEnvironmentConfigurationDetails());
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

    /** node group name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * node group name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The number of nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    private final Integer replicas;

    /**
     * The number of nodes.
     *
     * @return the value
     */
    public Integer getReplicas() {
        return replicas;
    }

    /**
     * The minimum threshold of successful replicas for node group to be successful. All replicas
     * need to succeed if this is not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumSuccessReplicas")
    private final Integer minimumSuccessReplicas;

    /**
     * The minimum threshold of successful replicas for node group to be successful. All replicas
     * need to succeed if this is not specified.
     *
     * @return the value
     */
    public Integer getMinimumSuccessReplicas() {
        return minimumSuccessReplicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobInfrastructureConfigurationDetails")
    private final JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails;

    public JobInfrastructureConfigurationDetails getJobInfrastructureConfigurationDetails() {
        return jobInfrastructureConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobConfigurationDetails")
    private final JobConfigurationDetails jobConfigurationDetails;

    public JobConfigurationDetails getJobConfigurationDetails() {
        return jobConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobEnvironmentConfigurationDetails")
    private final JobEnvironmentConfigurationDetails jobEnvironmentConfigurationDetails;

    public JobEnvironmentConfigurationDetails getJobEnvironmentConfigurationDetails() {
        return jobEnvironmentConfigurationDetails;
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
        sb.append("JobNodeGroupConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", replicas=").append(String.valueOf(this.replicas));
        sb.append(", minimumSuccessReplicas=").append(String.valueOf(this.minimumSuccessReplicas));
        sb.append(", jobInfrastructureConfigurationDetails=")
                .append(String.valueOf(this.jobInfrastructureConfigurationDetails));
        sb.append(", jobConfigurationDetails=")
                .append(String.valueOf(this.jobConfigurationDetails));
        sb.append(", jobEnvironmentConfigurationDetails=")
                .append(String.valueOf(this.jobEnvironmentConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobNodeGroupConfigurationDetails)) {
            return false;
        }

        JobNodeGroupConfigurationDetails other = (JobNodeGroupConfigurationDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.replicas, other.replicas)
                && java.util.Objects.equals(
                        this.minimumSuccessReplicas, other.minimumSuccessReplicas)
                && java.util.Objects.equals(
                        this.jobInfrastructureConfigurationDetails,
                        other.jobInfrastructureConfigurationDetails)
                && java.util.Objects.equals(
                        this.jobConfigurationDetails, other.jobConfigurationDetails)
                && java.util.Objects.equals(
                        this.jobEnvironmentConfigurationDetails,
                        other.jobEnvironmentConfigurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.replicas == null ? 43 : this.replicas.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumSuccessReplicas == null
                                ? 43
                                : this.minimumSuccessReplicas.hashCode());
        result =
                (result * PRIME)
                        + (this.jobInfrastructureConfigurationDetails == null
                                ? 43
                                : this.jobInfrastructureConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.jobConfigurationDetails == null
                                ? 43
                                : this.jobConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.jobEnvironmentConfigurationDetails == null
                                ? 43
                                : this.jobEnvironmentConfigurationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
