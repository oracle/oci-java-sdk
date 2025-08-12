/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The detected face. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Face.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Face extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "confidence",
        "boundingPolygon",
        "qualityScore",
        "landmarks",
        "embeddings"
    })
    public Face(
            Float confidence,
            BoundingPolygon boundingPolygon,
            Float qualityScore,
            java.util.List<Landmark> landmarks,
            java.util.List<Float> embeddings) {
        super();
        this.confidence = confidence;
        this.boundingPolygon = boundingPolygon;
        this.qualityScore = qualityScore;
        this.landmarks = landmarks;
        this.embeddings = embeddings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The confidence score, between 0 and 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        /**
         * The confidence score, between 0 and 1.
         *
         * @param confidence the value to set
         * @return this builder
         */
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
        private BoundingPolygon boundingPolygon;

        public Builder boundingPolygon(BoundingPolygon boundingPolygon) {
            this.boundingPolygon = boundingPolygon;
            this.__explicitlySet__.add("boundingPolygon");
            return this;
        }
        /** The quality score of the face detected, between 0 and 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("qualityScore")
        private Float qualityScore;

        /**
         * The quality score of the face detected, between 0 and 1.
         *
         * @param qualityScore the value to set
         * @return this builder
         */
        public Builder qualityScore(Float qualityScore) {
            this.qualityScore = qualityScore;
            this.__explicitlySet__.add("qualityScore");
            return this;
        }
        /** A point of interest within a face. */
        @com.fasterxml.jackson.annotation.JsonProperty("landmarks")
        private java.util.List<Landmark> landmarks;

        /**
         * A point of interest within a face.
         *
         * @param landmarks the value to set
         * @return this builder
         */
        public Builder landmarks(java.util.List<Landmark> landmarks) {
            this.landmarks = landmarks;
            this.__explicitlySet__.add("landmarks");
            return this;
        }
        /** The facial feature vectors of detected faces */
        @com.fasterxml.jackson.annotation.JsonProperty("embeddings")
        private java.util.List<Float> embeddings;

        /**
         * The facial feature vectors of detected faces
         *
         * @param embeddings the value to set
         * @return this builder
         */
        public Builder embeddings(java.util.List<Float> embeddings) {
            this.embeddings = embeddings;
            this.__explicitlySet__.add("embeddings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Face build() {
            Face model =
                    new Face(
                            this.confidence,
                            this.boundingPolygon,
                            this.qualityScore,
                            this.landmarks,
                            this.embeddings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Face model) {
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
            }
            if (model.wasPropertyExplicitlySet("boundingPolygon")) {
                this.boundingPolygon(model.getBoundingPolygon());
            }
            if (model.wasPropertyExplicitlySet("qualityScore")) {
                this.qualityScore(model.getQualityScore());
            }
            if (model.wasPropertyExplicitlySet("landmarks")) {
                this.landmarks(model.getLandmarks());
            }
            if (model.wasPropertyExplicitlySet("embeddings")) {
                this.embeddings(model.getEmbeddings());
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

    /** The confidence score, between 0 and 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Float confidence;

    /**
     * The confidence score, between 0 and 1.
     *
     * @return the value
     */
    public Float getConfidence() {
        return confidence;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
    private final BoundingPolygon boundingPolygon;

    public BoundingPolygon getBoundingPolygon() {
        return boundingPolygon;
    }

    /** The quality score of the face detected, between 0 and 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("qualityScore")
    private final Float qualityScore;

    /**
     * The quality score of the face detected, between 0 and 1.
     *
     * @return the value
     */
    public Float getQualityScore() {
        return qualityScore;
    }

    /** A point of interest within a face. */
    @com.fasterxml.jackson.annotation.JsonProperty("landmarks")
    private final java.util.List<Landmark> landmarks;

    /**
     * A point of interest within a face.
     *
     * @return the value
     */
    public java.util.List<Landmark> getLandmarks() {
        return landmarks;
    }

    /** The facial feature vectors of detected faces */
    @com.fasterxml.jackson.annotation.JsonProperty("embeddings")
    private final java.util.List<Float> embeddings;

    /**
     * The facial feature vectors of detected faces
     *
     * @return the value
     */
    public java.util.List<Float> getEmbeddings() {
        return embeddings;
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
        sb.append("Face(");
        sb.append("super=").append(super.toString());
        sb.append("confidence=").append(String.valueOf(this.confidence));
        sb.append(", boundingPolygon=").append(String.valueOf(this.boundingPolygon));
        sb.append(", qualityScore=").append(String.valueOf(this.qualityScore));
        sb.append(", landmarks=").append(String.valueOf(this.landmarks));
        sb.append(", embeddings=").append(String.valueOf(this.embeddings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Face)) {
            return false;
        }

        Face other = (Face) o;
        return java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.boundingPolygon, other.boundingPolygon)
                && java.util.Objects.equals(this.qualityScore, other.qualityScore)
                && java.util.Objects.equals(this.landmarks, other.landmarks)
                && java.util.Objects.equals(this.embeddings, other.embeddings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result =
                (result * PRIME)
                        + (this.boundingPolygon == null ? 43 : this.boundingPolygon.hashCode());
        result = (result * PRIME) + (this.qualityScore == null ? 43 : this.qualityScore.hashCode());
        result = (result * PRIME) + (this.landmarks == null ? 43 : this.landmarks.hashCode());
        result = (result * PRIME) + (this.embeddings == null ? 43 : this.embeddings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
