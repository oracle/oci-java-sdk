/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information about problem entities details of DataSource for a CloudGuard Problem.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProblemEntitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProblemEntitySummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "regions",
        "timeFirstDetected",
        "problemId",
        "timeLastDetected",
        "resultUrl",
        "entityDetails"
    })
    public ProblemEntitySummary(
            java.util.List<String> regions,
            java.util.Date timeFirstDetected,
            String problemId,
            java.util.Date timeLastDetected,
            String resultUrl,
            java.util.List<EntityDetails> entityDetails) {
        super();
        this.regions = regions;
        this.timeFirstDetected = timeFirstDetected;
        this.problemId = problemId;
        this.timeLastDetected = timeLastDetected;
        this.resultUrl = resultUrl;
        this.entityDetails = entityDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Data source problem entities region
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        /**
         * Data source problem entities region
         * @param regions the value to set
         * @return this builder
         **/
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /**
         * Data source problem entities first detected time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
        private java.util.Date timeFirstDetected;

        /**
         * Data source problem entities first detected time
         * @param timeFirstDetected the value to set
         * @return this builder
         **/
        public Builder timeFirstDetected(java.util.Date timeFirstDetected) {
            this.timeFirstDetected = timeFirstDetected;
            this.__explicitlySet__.add("timeFirstDetected");
            return this;
        }
        /**
         * Attached problem id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * Attached problem id
         * @param problemId the value to set
         * @return this builder
         **/
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /**
         * Data source problem entities last detected time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
        private java.util.Date timeLastDetected;

        /**
         * Data source problem entities last detected time
         * @param timeLastDetected the value to set
         * @return this builder
         **/
        public Builder timeLastDetected(java.util.Date timeLastDetected) {
            this.timeLastDetected = timeLastDetected;
            this.__explicitlySet__.add("timeLastDetected");
            return this;
        }
        /**
         * Log result query url for a data source query
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resultUrl")
        private String resultUrl;

        /**
         * Log result query url for a data source query
         * @param resultUrl the value to set
         * @return this builder
         **/
        public Builder resultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            this.__explicitlySet__.add("resultUrl");
            return this;
        }
        /**
         * List of event related to a DataSource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityDetails")
        private java.util.List<EntityDetails> entityDetails;

        /**
         * List of event related to a DataSource
         * @param entityDetails the value to set
         * @return this builder
         **/
        public Builder entityDetails(java.util.List<EntityDetails> entityDetails) {
            this.entityDetails = entityDetails;
            this.__explicitlySet__.add("entityDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProblemEntitySummary build() {
            ProblemEntitySummary model =
                    new ProblemEntitySummary(
                            this.regions,
                            this.timeFirstDetected,
                            this.problemId,
                            this.timeLastDetected,
                            this.resultUrl,
                            this.entityDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProblemEntitySummary model) {
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
            }
            if (model.wasPropertyExplicitlySet("timeFirstDetected")) {
                this.timeFirstDetected(model.getTimeFirstDetected());
            }
            if (model.wasPropertyExplicitlySet("problemId")) {
                this.problemId(model.getProblemId());
            }
            if (model.wasPropertyExplicitlySet("timeLastDetected")) {
                this.timeLastDetected(model.getTimeLastDetected());
            }
            if (model.wasPropertyExplicitlySet("resultUrl")) {
                this.resultUrl(model.getResultUrl());
            }
            if (model.wasPropertyExplicitlySet("entityDetails")) {
                this.entityDetails(model.getEntityDetails());
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

    /**
     * Data source problem entities region
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    /**
     * Data source problem entities region
     * @return the value
     **/
    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * Data source problem entities first detected time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstDetected")
    private final java.util.Date timeFirstDetected;

    /**
     * Data source problem entities first detected time
     * @return the value
     **/
    public java.util.Date getTimeFirstDetected() {
        return timeFirstDetected;
    }

    /**
     * Attached problem id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * Attached problem id
     * @return the value
     **/
    public String getProblemId() {
        return problemId;
    }

    /**
     * Data source problem entities last detected time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastDetected")
    private final java.util.Date timeLastDetected;

    /**
     * Data source problem entities last detected time
     * @return the value
     **/
    public java.util.Date getTimeLastDetected() {
        return timeLastDetected;
    }

    /**
     * Log result query url for a data source query
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resultUrl")
    private final String resultUrl;

    /**
     * Log result query url for a data source query
     * @return the value
     **/
    public String getResultUrl() {
        return resultUrl;
    }

    /**
     * List of event related to a DataSource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityDetails")
    private final java.util.List<EntityDetails> entityDetails;

    /**
     * List of event related to a DataSource
     * @return the value
     **/
    public java.util.List<EntityDetails> getEntityDetails() {
        return entityDetails;
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
        sb.append("ProblemEntitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("regions=").append(String.valueOf(this.regions));
        sb.append(", timeFirstDetected=").append(String.valueOf(this.timeFirstDetected));
        sb.append(", problemId=").append(String.valueOf(this.problemId));
        sb.append(", timeLastDetected=").append(String.valueOf(this.timeLastDetected));
        sb.append(", resultUrl=").append(String.valueOf(this.resultUrl));
        sb.append(", entityDetails=").append(String.valueOf(this.entityDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProblemEntitySummary)) {
            return false;
        }

        ProblemEntitySummary other = (ProblemEntitySummary) o;
        return java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.timeFirstDetected, other.timeFirstDetected)
                && java.util.Objects.equals(this.problemId, other.problemId)
                && java.util.Objects.equals(this.timeLastDetected, other.timeLastDetected)
                && java.util.Objects.equals(this.resultUrl, other.resultUrl)
                && java.util.Objects.equals(this.entityDetails, other.entityDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstDetected == null ? 43 : this.timeFirstDetected.hashCode());
        result = (result * PRIME) + (this.problemId == null ? 43 : this.problemId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastDetected == null ? 43 : this.timeLastDetected.hashCode());
        result = (result * PRIME) + (this.resultUrl == null ? 43 : this.resultUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.entityDetails == null ? 43 : this.entityDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
