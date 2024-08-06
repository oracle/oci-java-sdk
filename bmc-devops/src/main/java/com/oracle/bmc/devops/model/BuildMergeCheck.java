/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The status of the build pipelines. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BuildMergeCheck.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BuildMergeCheck extends MergeCheck {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The pipeline OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("pipelineId")
        private String pipelineId;

        /**
         * The pipeline OCID.
         *
         * @param pipelineId the value to set
         * @return this builder
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            this.__explicitlySet__.add("pipelineId");
            return this;
        }
        /** The build run OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("buildRunId")
        private String buildRunId;

        /**
         * The build run OCID.
         *
         * @param buildRunId the value to set
         * @return this builder
         */
        public Builder buildRunId(String buildRunId) {
            this.buildRunId = buildRunId;
            this.__explicitlySet__.add("buildRunId");
            return this;
        }
        /** The status of the build. */
        @com.fasterxml.jackson.annotation.JsonProperty("buildStatus")
        private String buildStatus;

        /**
         * The status of the build.
         *
         * @param buildStatus the value to set
         * @return this builder
         */
        public Builder buildStatus(String buildStatus) {
            this.buildStatus = buildStatus;
            this.__explicitlySet__.add("buildStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BuildMergeCheck build() {
            BuildMergeCheck model =
                    new BuildMergeCheck(this.pipelineId, this.buildRunId, this.buildStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BuildMergeCheck model) {
            if (model.wasPropertyExplicitlySet("pipelineId")) {
                this.pipelineId(model.getPipelineId());
            }
            if (model.wasPropertyExplicitlySet("buildRunId")) {
                this.buildRunId(model.getBuildRunId());
            }
            if (model.wasPropertyExplicitlySet("buildStatus")) {
                this.buildStatus(model.getBuildStatus());
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
    public BuildMergeCheck(String pipelineId, String buildRunId, String buildStatus) {
        super();
        this.pipelineId = pipelineId;
        this.buildRunId = buildRunId;
        this.buildStatus = buildStatus;
    }

    /** The pipeline OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("pipelineId")
    private final String pipelineId;

    /**
     * The pipeline OCID.
     *
     * @return the value
     */
    public String getPipelineId() {
        return pipelineId;
    }

    /** The build run OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("buildRunId")
    private final String buildRunId;

    /**
     * The build run OCID.
     *
     * @return the value
     */
    public String getBuildRunId() {
        return buildRunId;
    }

    /** The status of the build. */
    @com.fasterxml.jackson.annotation.JsonProperty("buildStatus")
    private final String buildStatus;

    /**
     * The status of the build.
     *
     * @return the value
     */
    public String getBuildStatus() {
        return buildStatus;
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
        sb.append("BuildMergeCheck(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", pipelineId=").append(String.valueOf(this.pipelineId));
        sb.append(", buildRunId=").append(String.valueOf(this.buildRunId));
        sb.append(", buildStatus=").append(String.valueOf(this.buildStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BuildMergeCheck)) {
            return false;
        }

        BuildMergeCheck other = (BuildMergeCheck) o;
        return java.util.Objects.equals(this.pipelineId, other.pipelineId)
                && java.util.Objects.equals(this.buildRunId, other.buildRunId)
                && java.util.Objects.equals(this.buildStatus, other.buildStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pipelineId == null ? 43 : this.pipelineId.hashCode());
        result = (result * PRIME) + (this.buildRunId == null ? 43 : this.buildRunId.hashCode());
        result = (result * PRIME) + (this.buildStatus == null ? 43 : this.buildStatus.hashCode());
        return result;
    }
}
