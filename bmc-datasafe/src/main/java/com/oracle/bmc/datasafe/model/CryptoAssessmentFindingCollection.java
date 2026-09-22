/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * List of crypto deviation findings for the specified crypto assessment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CryptoAssessmentFindingCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CryptoAssessmentFindingCollection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetId",
        "assessmentType",
        "databaseVersion",
        "summary",
        "items"
    })
    public CryptoAssessmentFindingCollection(
            String targetId,
            CryptoAssessment.Type assessmentType,
            String databaseVersion,
            CryptoAssessmentFindingSummaryMetrics summary,
            java.util.List<CryptoAssessmentFindingSummary> items) {
        super();
        this.targetId = targetId;
        this.assessmentType = assessmentType;
        this.databaseVersion = databaseVersion;
        this.summary = summary;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the target database for the specified crypto assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database for the specified crypto assessment.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * Assessment type recorded in the findings table.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentType")
        private CryptoAssessment.Type assessmentType;

        /**
         * Assessment type recorded in the findings table.
         * @param assessmentType the value to set
         * @return this builder
         **/
        public Builder assessmentType(CryptoAssessment.Type assessmentType) {
            this.assessmentType = assessmentType;
            this.__explicitlySet__.add("assessmentType");
            return this;
        }
        /**
         * Database version for the target database associated with the specified crypto assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * Database version for the target database associated with the specified crypto assessment.
         * @param databaseVersion the value to set
         * @return this builder
         **/
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private CryptoAssessmentFindingSummaryMetrics summary;

        public Builder summary(CryptoAssessmentFindingSummaryMetrics summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /**
         * Array of crypto deviation findings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<CryptoAssessmentFindingSummary> items;

        /**
         * Array of crypto deviation findings.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<CryptoAssessmentFindingSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentFindingCollection build() {
            CryptoAssessmentFindingCollection model =
                    new CryptoAssessmentFindingCollection(
                            this.targetId,
                            this.assessmentType,
                            this.databaseVersion,
                            this.summary,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentFindingCollection model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("assessmentType")) {
                this.assessmentType(model.getAssessmentType());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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
     * The OCID of the target database for the specified crypto assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database for the specified crypto assessment.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * Assessment type recorded in the findings table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentType")
    private final CryptoAssessment.Type assessmentType;

    /**
     * Assessment type recorded in the findings table.
     * @return the value
     **/
    public CryptoAssessment.Type getAssessmentType() {
        return assessmentType;
    }

    /**
     * Database version for the target database associated with the specified crypto assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * Database version for the target database associated with the specified crypto assessment.
     * @return the value
     **/
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final CryptoAssessmentFindingSummaryMetrics summary;

    public CryptoAssessmentFindingSummaryMetrics getSummary() {
        return summary;
    }

    /**
     * Array of crypto deviation findings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<CryptoAssessmentFindingSummary> items;

    /**
     * Array of crypto deviation findings.
     * @return the value
     **/
    public java.util.List<CryptoAssessmentFindingSummary> getItems() {
        return items;
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
        sb.append("CryptoAssessmentFindingCollection(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", assessmentType=").append(String.valueOf(this.assessmentType));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentFindingCollection)) {
            return false;
        }

        CryptoAssessmentFindingCollection other = (CryptoAssessmentFindingCollection) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.assessmentType, other.assessmentType)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.assessmentType == null ? 43 : this.assessmentType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
