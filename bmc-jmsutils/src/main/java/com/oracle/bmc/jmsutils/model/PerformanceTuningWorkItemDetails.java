/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils.model;

/**
 * The performance tuning work item details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250521")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PerformanceTuningWorkItemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PerformanceTuningWorkItemDetails extends WorkItemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workItemType")
        private WorkItemType workItemType;

        public Builder workItemType(WorkItemType workItemType) {
            this.workItemType = workItemType;
            this.__explicitlySet__.add("workItemType");
            return this;
        }
        /** Object storage path to the artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactObjectStoragePath")
        private String artifactObjectStoragePath;

        /**
         * Object storage path to the artifact.
         *
         * @param artifactObjectStoragePath the value to set
         * @return this builder
         */
        public Builder artifactObjectStoragePath(String artifactObjectStoragePath) {
            this.artifactObjectStoragePath = artifactObjectStoragePath;
            this.__explicitlySet__.add("artifactObjectStoragePath");
            return this;
        }
        /** Name of the analysis project. */
        @com.fasterxml.jackson.annotation.JsonProperty("analysisProjectName")
        private String analysisProjectName;

        /**
         * Name of the analysis project.
         *
         * @param analysisProjectName the value to set
         * @return this builder
         */
        public Builder analysisProjectName(String analysisProjectName) {
            this.analysisProjectName = analysisProjectName;
            this.__explicitlySet__.add("analysisProjectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PerformanceTuningWorkItemDetails build() {
            PerformanceTuningWorkItemDetails model =
                    new PerformanceTuningWorkItemDetails(
                            this.workItemType,
                            this.artifactObjectStoragePath,
                            this.analysisProjectName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PerformanceTuningWorkItemDetails model) {
            if (model.wasPropertyExplicitlySet("workItemType")) {
                this.workItemType(model.getWorkItemType());
            }
            if (model.wasPropertyExplicitlySet("artifactObjectStoragePath")) {
                this.artifactObjectStoragePath(model.getArtifactObjectStoragePath());
            }
            if (model.wasPropertyExplicitlySet("analysisProjectName")) {
                this.analysisProjectName(model.getAnalysisProjectName());
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
    public PerformanceTuningWorkItemDetails(
            WorkItemType workItemType,
            String artifactObjectStoragePath,
            String analysisProjectName) {
        super(workItemType);
        this.artifactObjectStoragePath = artifactObjectStoragePath;
        this.analysisProjectName = analysisProjectName;
    }

    /** Object storage path to the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactObjectStoragePath")
    private final String artifactObjectStoragePath;

    /**
     * Object storage path to the artifact.
     *
     * @return the value
     */
    public String getArtifactObjectStoragePath() {
        return artifactObjectStoragePath;
    }

    /** Name of the analysis project. */
    @com.fasterxml.jackson.annotation.JsonProperty("analysisProjectName")
    private final String analysisProjectName;

    /**
     * Name of the analysis project.
     *
     * @return the value
     */
    public String getAnalysisProjectName() {
        return analysisProjectName;
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
        sb.append("PerformanceTuningWorkItemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", artifactObjectStoragePath=")
                .append(String.valueOf(this.artifactObjectStoragePath));
        sb.append(", analysisProjectName=").append(String.valueOf(this.analysisProjectName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PerformanceTuningWorkItemDetails)) {
            return false;
        }

        PerformanceTuningWorkItemDetails other = (PerformanceTuningWorkItemDetails) o;
        return java.util.Objects.equals(
                        this.artifactObjectStoragePath, other.artifactObjectStoragePath)
                && java.util.Objects.equals(this.analysisProjectName, other.analysisProjectName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.artifactObjectStoragePath == null
                                ? 43
                                : this.artifactObjectStoragePath.hashCode());
        result =
                (result * PRIME)
                        + (this.analysisProjectName == null
                                ? 43
                                : this.analysisProjectName.hashCode());
        return result;
    }
}
