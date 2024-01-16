/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * An application dependency with the recommended version that does not contain any CVE. Each
 * application dependency has a property specifying multiple node identifiers on which which this
 * current node depends. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApplicationDependencyRecommendationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApplicationDependencyRecommendationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "gav",
        "purl",
        "nodeId",
        "applicationDependencyNodeIds",
        "recommendedGav",
        "recommendedPurl"
    })
    public ApplicationDependencyRecommendationSummary(
            String gav,
            String purl,
            String nodeId,
            java.util.List<String> applicationDependencyNodeIds,
            String recommendedGav,
            String recommendedPurl) {
        super();
        this.gav = gav;
        this.purl = purl;
        this.nodeId = nodeId;
        this.applicationDependencyNodeIds = applicationDependencyNodeIds;
        this.recommendedGav = recommendedGav;
        this.recommendedPurl = recommendedPurl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique Group Artifact Version (GAV) identifier in the format _Group:Artifact:Version_,
         * e.g. org.graalvm.nativeimage:svm:21.1.0.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gav")
        private String gav;

        /**
         * Unique Group Artifact Version (GAV) identifier in the format _Group:Artifact:Version_,
         * e.g. org.graalvm.nativeimage:svm:21.1.0.
         *
         * @param gav the value to set
         * @return this builder
         */
        public Builder gav(String gav) {
            this.gav = gav;
            this.__explicitlySet__.add("gav");
            return this;
        }
        /**
         * Package URL defined in https://github.com/package-url/purl-spec, e.g.
         * pkg:maven/org.graalvm.nativeimage/svm@21.1.0
         */
        @com.fasterxml.jackson.annotation.JsonProperty("purl")
        private String purl;

        /**
         * Package URL defined in https://github.com/package-url/purl-spec, e.g.
         * pkg:maven/org.graalvm.nativeimage/svm@21.1.0
         *
         * @param purl the value to set
         * @return this builder
         */
        public Builder purl(String purl) {
            this.purl = purl;
            this.__explicitlySet__.add("purl");
            return this;
        }
        /**
         * Unique node identifier of an application dependency with an associated Recommendation,
         * e.g. nodeId1.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
        private String nodeId;

        /**
         * Unique node identifier of an application dependency with an associated Recommendation,
         * e.g. nodeId1.
         *
         * @param nodeId the value to set
         * @return this builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            this.__explicitlySet__.add("nodeId");
            return this;
        }
        /** List of (application dependencies) node identifiers from which this node depends. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationDependencyNodeIds")
        private java.util.List<String> applicationDependencyNodeIds;

        /**
         * List of (application dependencies) node identifiers from which this node depends.
         *
         * @param applicationDependencyNodeIds the value to set
         * @return this builder
         */
        public Builder applicationDependencyNodeIds(
                java.util.List<String> applicationDependencyNodeIds) {
            this.applicationDependencyNodeIds = applicationDependencyNodeIds;
            this.__explicitlySet__.add("applicationDependencyNodeIds");
            return this;
        }
        /**
         * Recommended application dependency in "group:artifact:version" (GAV) format, e.g.
         * org.graalvm.nativeimage:svm:21.2.0.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedGav")
        private String recommendedGav;

        /**
         * Recommended application dependency in "group:artifact:version" (GAV) format, e.g.
         * org.graalvm.nativeimage:svm:21.2.0.
         *
         * @param recommendedGav the value to set
         * @return this builder
         */
        public Builder recommendedGav(String recommendedGav) {
            this.recommendedGav = recommendedGav;
            this.__explicitlySet__.add("recommendedGav");
            return this;
        }
        /**
         * Recommended application dependency in PURL format, e.g.
         * pkg:maven/org.graalvm.nativeimage/svm@21.2.0
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedPurl")
        private String recommendedPurl;

        /**
         * Recommended application dependency in PURL format, e.g.
         * pkg:maven/org.graalvm.nativeimage/svm@21.2.0
         *
         * @param recommendedPurl the value to set
         * @return this builder
         */
        public Builder recommendedPurl(String recommendedPurl) {
            this.recommendedPurl = recommendedPurl;
            this.__explicitlySet__.add("recommendedPurl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationDependencyRecommendationSummary build() {
            ApplicationDependencyRecommendationSummary model =
                    new ApplicationDependencyRecommendationSummary(
                            this.gav,
                            this.purl,
                            this.nodeId,
                            this.applicationDependencyNodeIds,
                            this.recommendedGav,
                            this.recommendedPurl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationDependencyRecommendationSummary model) {
            if (model.wasPropertyExplicitlySet("gav")) {
                this.gav(model.getGav());
            }
            if (model.wasPropertyExplicitlySet("purl")) {
                this.purl(model.getPurl());
            }
            if (model.wasPropertyExplicitlySet("nodeId")) {
                this.nodeId(model.getNodeId());
            }
            if (model.wasPropertyExplicitlySet("applicationDependencyNodeIds")) {
                this.applicationDependencyNodeIds(model.getApplicationDependencyNodeIds());
            }
            if (model.wasPropertyExplicitlySet("recommendedGav")) {
                this.recommendedGav(model.getRecommendedGav());
            }
            if (model.wasPropertyExplicitlySet("recommendedPurl")) {
                this.recommendedPurl(model.getRecommendedPurl());
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
     * Unique Group Artifact Version (GAV) identifier in the format _Group:Artifact:Version_, e.g.
     * org.graalvm.nativeimage:svm:21.1.0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gav")
    private final String gav;

    /**
     * Unique Group Artifact Version (GAV) identifier in the format _Group:Artifact:Version_, e.g.
     * org.graalvm.nativeimage:svm:21.1.0.
     *
     * @return the value
     */
    public String getGav() {
        return gav;
    }

    /**
     * Package URL defined in https://github.com/package-url/purl-spec, e.g.
     * pkg:maven/org.graalvm.nativeimage/svm@21.1.0
     */
    @com.fasterxml.jackson.annotation.JsonProperty("purl")
    private final String purl;

    /**
     * Package URL defined in https://github.com/package-url/purl-spec, e.g.
     * pkg:maven/org.graalvm.nativeimage/svm@21.1.0
     *
     * @return the value
     */
    public String getPurl() {
        return purl;
    }

    /**
     * Unique node identifier of an application dependency with an associated Recommendation, e.g.
     * nodeId1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
    private final String nodeId;

    /**
     * Unique node identifier of an application dependency with an associated Recommendation, e.g.
     * nodeId1.
     *
     * @return the value
     */
    public String getNodeId() {
        return nodeId;
    }

    /** List of (application dependencies) node identifiers from which this node depends. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationDependencyNodeIds")
    private final java.util.List<String> applicationDependencyNodeIds;

    /**
     * List of (application dependencies) node identifiers from which this node depends.
     *
     * @return the value
     */
    public java.util.List<String> getApplicationDependencyNodeIds() {
        return applicationDependencyNodeIds;
    }

    /**
     * Recommended application dependency in "group:artifact:version" (GAV) format, e.g.
     * org.graalvm.nativeimage:svm:21.2.0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedGav")
    private final String recommendedGav;

    /**
     * Recommended application dependency in "group:artifact:version" (GAV) format, e.g.
     * org.graalvm.nativeimage:svm:21.2.0.
     *
     * @return the value
     */
    public String getRecommendedGav() {
        return recommendedGav;
    }

    /**
     * Recommended application dependency in PURL format, e.g.
     * pkg:maven/org.graalvm.nativeimage/svm@21.2.0
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedPurl")
    private final String recommendedPurl;

    /**
     * Recommended application dependency in PURL format, e.g.
     * pkg:maven/org.graalvm.nativeimage/svm@21.2.0
     *
     * @return the value
     */
    public String getRecommendedPurl() {
        return recommendedPurl;
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
        sb.append("ApplicationDependencyRecommendationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("gav=").append(String.valueOf(this.gav));
        sb.append(", purl=").append(String.valueOf(this.purl));
        sb.append(", nodeId=").append(String.valueOf(this.nodeId));
        sb.append(", applicationDependencyNodeIds=")
                .append(String.valueOf(this.applicationDependencyNodeIds));
        sb.append(", recommendedGav=").append(String.valueOf(this.recommendedGav));
        sb.append(", recommendedPurl=").append(String.valueOf(this.recommendedPurl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicationDependencyRecommendationSummary)) {
            return false;
        }

        ApplicationDependencyRecommendationSummary other =
                (ApplicationDependencyRecommendationSummary) o;
        return java.util.Objects.equals(this.gav, other.gav)
                && java.util.Objects.equals(this.purl, other.purl)
                && java.util.Objects.equals(this.nodeId, other.nodeId)
                && java.util.Objects.equals(
                        this.applicationDependencyNodeIds, other.applicationDependencyNodeIds)
                && java.util.Objects.equals(this.recommendedGav, other.recommendedGav)
                && java.util.Objects.equals(this.recommendedPurl, other.recommendedPurl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gav == null ? 43 : this.gav.hashCode());
        result = (result * PRIME) + (this.purl == null ? 43 : this.purl.hashCode());
        result = (result * PRIME) + (this.nodeId == null ? 43 : this.nodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationDependencyNodeIds == null
                                ? 43
                                : this.applicationDependencyNodeIds.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedGav == null ? 43 : this.recommendedGav.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedPurl == null ? 43 : this.recommendedPurl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
