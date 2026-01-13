/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Summary of patch recommendations for databases. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PatchRecommendationsDetailsSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchRecommendationsDetailsSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "patchName",
        "abstractText",
        "classificationName",
        "timeEvaluated",
        "hasFixForCve",
        "timeReleased"
    })
    public PatchRecommendationsDetailsSummary(
            String patchName,
            String abstractText,
            String classificationName,
            java.util.Date timeEvaluated,
            Boolean hasFixForCve,
            java.util.Date timeReleased) {
        super();
        this.patchName = patchName;
        this.abstractText = abstractText;
        this.classificationName = classificationName;
        this.timeEvaluated = timeEvaluated;
        this.hasFixForCve = hasFixForCve;
        this.timeReleased = timeReleased;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the patch recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchName")
        private String patchName;

        /**
         * Name of the patch recommendation.
         *
         * @param patchName the value to set
         * @return this builder
         */
        public Builder patchName(String patchName) {
            this.patchName = patchName;
            this.__explicitlySet__.add("patchName");
            return this;
        }
        /** Description of the patch recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("abstractText")
        private String abstractText;

        /**
         * Description of the patch recommendation.
         *
         * @param abstractText the value to set
         * @return this builder
         */
        public Builder abstractText(String abstractText) {
            this.abstractText = abstractText;
            this.__explicitlySet__.add("abstractText");
            return this;
        }
        /** Classification of the patch recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("classificationName")
        private String classificationName;

        /**
         * Classification of the patch recommendation.
         *
         * @param classificationName the value to set
         * @return this builder
         */
        public Builder classificationName(String classificationName) {
            this.classificationName = classificationName;
            this.__explicitlySet__.add("classificationName");
            return this;
        }
        /** Evaluation date for the patch recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEvaluated")
        private java.util.Date timeEvaluated;

        /**
         * Evaluation date for the patch recommendation.
         *
         * @param timeEvaluated the value to set
         * @return this builder
         */
        public Builder timeEvaluated(java.util.Date timeEvaluated) {
            this.timeEvaluated = timeEvaluated;
            this.__explicitlySet__.add("timeEvaluated");
            return this;
        }
        /** If the patch has a fix for a CVE. */
        @com.fasterxml.jackson.annotation.JsonProperty("hasFixForCve")
        private Boolean hasFixForCve;

        /**
         * If the patch has a fix for a CVE.
         *
         * @param hasFixForCve the value to set
         * @return this builder
         */
        public Builder hasFixForCve(Boolean hasFixForCve) {
            this.hasFixForCve = hasFixForCve;
            this.__explicitlySet__.add("hasFixForCve");
            return this;
        }
        /** Release date for the patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * Release date for the patch.
         *
         * @param timeReleased the value to set
         * @return this builder
         */
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchRecommendationsDetailsSummary build() {
            PatchRecommendationsDetailsSummary model =
                    new PatchRecommendationsDetailsSummary(
                            this.patchName,
                            this.abstractText,
                            this.classificationName,
                            this.timeEvaluated,
                            this.hasFixForCve,
                            this.timeReleased);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchRecommendationsDetailsSummary model) {
            if (model.wasPropertyExplicitlySet("patchName")) {
                this.patchName(model.getPatchName());
            }
            if (model.wasPropertyExplicitlySet("abstractText")) {
                this.abstractText(model.getAbstractText());
            }
            if (model.wasPropertyExplicitlySet("classificationName")) {
                this.classificationName(model.getClassificationName());
            }
            if (model.wasPropertyExplicitlySet("timeEvaluated")) {
                this.timeEvaluated(model.getTimeEvaluated());
            }
            if (model.wasPropertyExplicitlySet("hasFixForCve")) {
                this.hasFixForCve(model.getHasFixForCve());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
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

    /** Name of the patch recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchName")
    private final String patchName;

    /**
     * Name of the patch recommendation.
     *
     * @return the value
     */
    public String getPatchName() {
        return patchName;
    }

    /** Description of the patch recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("abstractText")
    private final String abstractText;

    /**
     * Description of the patch recommendation.
     *
     * @return the value
     */
    public String getAbstractText() {
        return abstractText;
    }

    /** Classification of the patch recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("classificationName")
    private final String classificationName;

    /**
     * Classification of the patch recommendation.
     *
     * @return the value
     */
    public String getClassificationName() {
        return classificationName;
    }

    /** Evaluation date for the patch recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEvaluated")
    private final java.util.Date timeEvaluated;

    /**
     * Evaluation date for the patch recommendation.
     *
     * @return the value
     */
    public java.util.Date getTimeEvaluated() {
        return timeEvaluated;
    }

    /** If the patch has a fix for a CVE. */
    @com.fasterxml.jackson.annotation.JsonProperty("hasFixForCve")
    private final Boolean hasFixForCve;

    /**
     * If the patch has a fix for a CVE.
     *
     * @return the value
     */
    public Boolean getHasFixForCve() {
        return hasFixForCve;
    }

    /** Release date for the patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * Release date for the patch.
     *
     * @return the value
     */
    public java.util.Date getTimeReleased() {
        return timeReleased;
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
        sb.append("PatchRecommendationsDetailsSummary(");
        sb.append("super=").append(super.toString());
        sb.append("patchName=").append(String.valueOf(this.patchName));
        sb.append(", abstractText=").append(String.valueOf(this.abstractText));
        sb.append(", classificationName=").append(String.valueOf(this.classificationName));
        sb.append(", timeEvaluated=").append(String.valueOf(this.timeEvaluated));
        sb.append(", hasFixForCve=").append(String.valueOf(this.hasFixForCve));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchRecommendationsDetailsSummary)) {
            return false;
        }

        PatchRecommendationsDetailsSummary other = (PatchRecommendationsDetailsSummary) o;
        return java.util.Objects.equals(this.patchName, other.patchName)
                && java.util.Objects.equals(this.abstractText, other.abstractText)
                && java.util.Objects.equals(this.classificationName, other.classificationName)
                && java.util.Objects.equals(this.timeEvaluated, other.timeEvaluated)
                && java.util.Objects.equals(this.hasFixForCve, other.hasFixForCve)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.patchName == null ? 43 : this.patchName.hashCode());
        result = (result * PRIME) + (this.abstractText == null ? 43 : this.abstractText.hashCode());
        result =
                (result * PRIME)
                        + (this.classificationName == null
                                ? 43
                                : this.classificationName.hashCode());
        result =
                (result * PRIME)
                        + (this.timeEvaluated == null ? 43 : this.timeEvaluated.hashCode());
        result = (result * PRIME) + (this.hasFixForCve == null ? 43 : this.hasFixForCve.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
