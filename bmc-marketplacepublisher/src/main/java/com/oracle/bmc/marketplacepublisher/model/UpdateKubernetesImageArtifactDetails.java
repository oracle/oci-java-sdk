/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Details to update the kubernetes image artifact.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateKubernetesImageArtifactDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "artifactType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateKubernetesImageArtifactDetails extends UpdateArtifactDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("helmChart")
        private UpdateHelmChartImageDetails helmChart;

        public Builder helmChart(UpdateHelmChartImageDetails helmChart) {
            this.helmChart = helmChart;
            this.__explicitlySet__.add("helmChart");
            return this;
        }
        /**
         * List of container image artifact unique identifiers included in the helm chart.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerImageArtifactIds")
        private java.util.List<String> containerImageArtifactIds;

        /**
         * List of container image artifact unique identifiers included in the helm chart.
         * @param containerImageArtifactIds the value to set
         * @return this builder
         **/
        public Builder containerImageArtifactIds(java.util.List<String> containerImageArtifactIds) {
            this.containerImageArtifactIds = containerImageArtifactIds;
            this.__explicitlySet__.add("containerImageArtifactIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateKubernetesImageArtifactDetails build() {
            UpdateKubernetesImageArtifactDetails model =
                    new UpdateKubernetesImageArtifactDetails(
                            this.compartmentId,
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.helmChart,
                            this.containerImageArtifactIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateKubernetesImageArtifactDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("helmChart")) {
                this.helmChart(model.getHelmChart());
            }
            if (model.wasPropertyExplicitlySet("containerImageArtifactIds")) {
                this.containerImageArtifactIds(model.getContainerImageArtifactIds());
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
    public UpdateKubernetesImageArtifactDetails(
            String compartmentId,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            UpdateHelmChartImageDetails helmChart,
            java.util.List<String> containerImageArtifactIds) {
        super(compartmentId, displayName, freeformTags, definedTags);
        this.helmChart = helmChart;
        this.containerImageArtifactIds = containerImageArtifactIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("helmChart")
    private final UpdateHelmChartImageDetails helmChart;

    public UpdateHelmChartImageDetails getHelmChart() {
        return helmChart;
    }

    /**
     * List of container image artifact unique identifiers included in the helm chart.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerImageArtifactIds")
    private final java.util.List<String> containerImageArtifactIds;

    /**
     * List of container image artifact unique identifiers included in the helm chart.
     * @return the value
     **/
    public java.util.List<String> getContainerImageArtifactIds() {
        return containerImageArtifactIds;
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
        sb.append("UpdateKubernetesImageArtifactDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", helmChart=").append(String.valueOf(this.helmChart));
        sb.append(", containerImageArtifactIds=")
                .append(String.valueOf(this.containerImageArtifactIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateKubernetesImageArtifactDetails)) {
            return false;
        }

        UpdateKubernetesImageArtifactDetails other = (UpdateKubernetesImageArtifactDetails) o;
        return java.util.Objects.equals(this.helmChart, other.helmChart)
                && java.util.Objects.equals(
                        this.containerImageArtifactIds, other.containerImageArtifactIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.helmChart == null ? 43 : this.helmChart.hashCode());
        result =
                (result * PRIME)
                        + (this.containerImageArtifactIds == null
                                ? 43
                                : this.containerImageArtifactIds.hashCode());
        return result;
    }
}
