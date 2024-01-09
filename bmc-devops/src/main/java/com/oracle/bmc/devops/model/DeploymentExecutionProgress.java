/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The execution progress details of a deployment. <br>
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
        builder = DeploymentExecutionProgress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeploymentExecutionProgress
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeStarted",
        "timeFinished",
        "deployStageExecutionProgress"
    })
    public DeploymentExecutionProgress(
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            java.util.Map<String, DeployStageExecutionProgress> deployStageExecutionProgress) {
        super();
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.deployStageExecutionProgress = deployStageExecutionProgress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Time the deployment is started. Format defined by
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Time the deployment is started. Format defined by
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * Time the deployment is finished. Format defined by
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * Time the deployment is finished. Format defined by
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** Map of stage OCIDs to deploy stage execution progress model. */
        @com.fasterxml.jackson.annotation.JsonProperty("deployStageExecutionProgress")
        private java.util.Map<String, DeployStageExecutionProgress> deployStageExecutionProgress;

        /**
         * Map of stage OCIDs to deploy stage execution progress model.
         *
         * @param deployStageExecutionProgress the value to set
         * @return this builder
         */
        public Builder deployStageExecutionProgress(
                java.util.Map<String, DeployStageExecutionProgress> deployStageExecutionProgress) {
            this.deployStageExecutionProgress = deployStageExecutionProgress;
            this.__explicitlySet__.add("deployStageExecutionProgress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeploymentExecutionProgress build() {
            DeploymentExecutionProgress model =
                    new DeploymentExecutionProgress(
                            this.timeStarted, this.timeFinished, this.deployStageExecutionProgress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentExecutionProgress model) {
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("deployStageExecutionProgress")) {
                this.deployStageExecutionProgress(model.getDeployStageExecutionProgress());
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

    /**
     * Time the deployment is started. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Time the deployment is started. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Time the deployment is finished. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * Time the deployment is finished. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** Map of stage OCIDs to deploy stage execution progress model. */
    @com.fasterxml.jackson.annotation.JsonProperty("deployStageExecutionProgress")
    private final java.util.Map<String, DeployStageExecutionProgress> deployStageExecutionProgress;

    /**
     * Map of stage OCIDs to deploy stage execution progress model.
     *
     * @return the value
     */
    public java.util.Map<String, DeployStageExecutionProgress> getDeployStageExecutionProgress() {
        return deployStageExecutionProgress;
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
        sb.append("DeploymentExecutionProgress(");
        sb.append("super=").append(super.toString());
        sb.append("timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", deployStageExecutionProgress=")
                .append(String.valueOf(this.deployStageExecutionProgress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentExecutionProgress)) {
            return false;
        }

        DeploymentExecutionProgress other = (DeploymentExecutionProgress) o;
        return java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(
                        this.deployStageExecutionProgress, other.deployStageExecutionProgress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.deployStageExecutionProgress == null
                                ? 43
                                : this.deployStageExecutionProgress.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
