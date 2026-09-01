/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth.model;

/**
 * A recommendation report <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RecommendationReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecommendationReport
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "summary",
        "totalIssues",
        "criticalIssues",
        "warningIssues",
        "infoIssues",
        "recommendations",
        "metadata",
        "timeGenerated"
    })
    public RecommendationReport(
            String summary,
            Integer totalIssues,
            Integer criticalIssues,
            Integer warningIssues,
            Integer infoIssues,
            java.util.List<Recommendation> recommendations,
            Metadata metadata,
            java.util.Date timeGenerated) {
        super();
        this.summary = summary;
        this.totalIssues = totalIssues;
        this.criticalIssues = criticalIssues;
        this.warningIssues = warningIssues;
        this.infoIssues = infoIssues;
        this.recommendations = recommendations;
        this.metadata = metadata;
        this.timeGenerated = timeGenerated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** summary */
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * summary
         *
         * @param summary the value to set
         * @return this builder
         */
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /** total issue count */
        @com.fasterxml.jackson.annotation.JsonProperty("totalIssues")
        private Integer totalIssues;

        /**
         * total issue count
         *
         * @param totalIssues the value to set
         * @return this builder
         */
        public Builder totalIssues(Integer totalIssues) {
            this.totalIssues = totalIssues;
            this.__explicitlySet__.add("totalIssues");
            return this;
        }
        /** critical issue count */
        @com.fasterxml.jackson.annotation.JsonProperty("criticalIssues")
        private Integer criticalIssues;

        /**
         * critical issue count
         *
         * @param criticalIssues the value to set
         * @return this builder
         */
        public Builder criticalIssues(Integer criticalIssues) {
            this.criticalIssues = criticalIssues;
            this.__explicitlySet__.add("criticalIssues");
            return this;
        }
        /** warning issue count */
        @com.fasterxml.jackson.annotation.JsonProperty("warningIssues")
        private Integer warningIssues;

        /**
         * warning issue count
         *
         * @param warningIssues the value to set
         * @return this builder
         */
        public Builder warningIssues(Integer warningIssues) {
            this.warningIssues = warningIssues;
            this.__explicitlySet__.add("warningIssues");
            return this;
        }
        /** info issue count */
        @com.fasterxml.jackson.annotation.JsonProperty("infoIssues")
        private Integer infoIssues;

        /**
         * info issue count
         *
         * @param infoIssues the value to set
         * @return this builder
         */
        public Builder infoIssues(Integer infoIssues) {
            this.infoIssues = infoIssues;
            this.__explicitlySet__.add("infoIssues");
            return this;
        }
        /** recommendations */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendations")
        private java.util.List<Recommendation> recommendations;

        /**
         * recommendations
         *
         * @param recommendations the value to set
         * @return this builder
         */
        public Builder recommendations(java.util.List<Recommendation> recommendations) {
            this.recommendations = recommendations;
            this.__explicitlySet__.add("recommendations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private Metadata metadata;

        public Builder metadata(Metadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /** time generated */
        @com.fasterxml.jackson.annotation.JsonProperty("timeGenerated")
        private java.util.Date timeGenerated;

        /**
         * time generated
         *
         * @param timeGenerated the value to set
         * @return this builder
         */
        public Builder timeGenerated(java.util.Date timeGenerated) {
            this.timeGenerated = timeGenerated;
            this.__explicitlySet__.add("timeGenerated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecommendationReport build() {
            RecommendationReport model =
                    new RecommendationReport(
                            this.summary,
                            this.totalIssues,
                            this.criticalIssues,
                            this.warningIssues,
                            this.infoIssues,
                            this.recommendations,
                            this.metadata,
                            this.timeGenerated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecommendationReport model) {
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("totalIssues")) {
                this.totalIssues(model.getTotalIssues());
            }
            if (model.wasPropertyExplicitlySet("criticalIssues")) {
                this.criticalIssues(model.getCriticalIssues());
            }
            if (model.wasPropertyExplicitlySet("warningIssues")) {
                this.warningIssues(model.getWarningIssues());
            }
            if (model.wasPropertyExplicitlySet("infoIssues")) {
                this.infoIssues(model.getInfoIssues());
            }
            if (model.wasPropertyExplicitlySet("recommendations")) {
                this.recommendations(model.getRecommendations());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("timeGenerated")) {
                this.timeGenerated(model.getTimeGenerated());
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

    /** summary */
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * summary
     *
     * @return the value
     */
    public String getSummary() {
        return summary;
    }

    /** total issue count */
    @com.fasterxml.jackson.annotation.JsonProperty("totalIssues")
    private final Integer totalIssues;

    /**
     * total issue count
     *
     * @return the value
     */
    public Integer getTotalIssues() {
        return totalIssues;
    }

    /** critical issue count */
    @com.fasterxml.jackson.annotation.JsonProperty("criticalIssues")
    private final Integer criticalIssues;

    /**
     * critical issue count
     *
     * @return the value
     */
    public Integer getCriticalIssues() {
        return criticalIssues;
    }

    /** warning issue count */
    @com.fasterxml.jackson.annotation.JsonProperty("warningIssues")
    private final Integer warningIssues;

    /**
     * warning issue count
     *
     * @return the value
     */
    public Integer getWarningIssues() {
        return warningIssues;
    }

    /** info issue count */
    @com.fasterxml.jackson.annotation.JsonProperty("infoIssues")
    private final Integer infoIssues;

    /**
     * info issue count
     *
     * @return the value
     */
    public Integer getInfoIssues() {
        return infoIssues;
    }

    /** recommendations */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendations")
    private final java.util.List<Recommendation> recommendations;

    /**
     * recommendations
     *
     * @return the value
     */
    public java.util.List<Recommendation> getRecommendations() {
        return recommendations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final Metadata metadata;

    public Metadata getMetadata() {
        return metadata;
    }

    /** time generated */
    @com.fasterxml.jackson.annotation.JsonProperty("timeGenerated")
    private final java.util.Date timeGenerated;

    /**
     * time generated
     *
     * @return the value
     */
    public java.util.Date getTimeGenerated() {
        return timeGenerated;
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
        sb.append("RecommendationReport(");
        sb.append("super=").append(super.toString());
        sb.append("summary=").append(String.valueOf(this.summary));
        sb.append(", totalIssues=").append(String.valueOf(this.totalIssues));
        sb.append(", criticalIssues=").append(String.valueOf(this.criticalIssues));
        sb.append(", warningIssues=").append(String.valueOf(this.warningIssues));
        sb.append(", infoIssues=").append(String.valueOf(this.infoIssues));
        sb.append(", recommendations=").append(String.valueOf(this.recommendations));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", timeGenerated=").append(String.valueOf(this.timeGenerated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendationReport)) {
            return false;
        }

        RecommendationReport other = (RecommendationReport) o;
        return java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.totalIssues, other.totalIssues)
                && java.util.Objects.equals(this.criticalIssues, other.criticalIssues)
                && java.util.Objects.equals(this.warningIssues, other.warningIssues)
                && java.util.Objects.equals(this.infoIssues, other.infoIssues)
                && java.util.Objects.equals(this.recommendations, other.recommendations)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.timeGenerated, other.timeGenerated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.totalIssues == null ? 43 : this.totalIssues.hashCode());
        result =
                (result * PRIME)
                        + (this.criticalIssues == null ? 43 : this.criticalIssues.hashCode());
        result =
                (result * PRIME)
                        + (this.warningIssues == null ? 43 : this.warningIssues.hashCode());
        result = (result * PRIME) + (this.infoIssues == null ? 43 : this.infoIssues.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendations == null ? 43 : this.recommendations.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.timeGenerated == null ? 43 : this.timeGenerated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
