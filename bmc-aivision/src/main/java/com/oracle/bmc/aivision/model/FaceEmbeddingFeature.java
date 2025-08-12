/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The face embedding parameters <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FaceEmbeddingFeature.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "featureType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FaceEmbeddingFeature extends ImageFeature {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The maximum number of results to return. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxResults")
        private Integer maxResults;

        /**
         * The maximum number of results to return.
         *
         * @param maxResults the value to set
         * @return this builder
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            this.__explicitlySet__.add("maxResults");
            return this;
        }
        /** Whether or not return face landmarks. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldReturnLandmarks")
        private Boolean shouldReturnLandmarks;

        /**
         * Whether or not return face landmarks.
         *
         * @param shouldReturnLandmarks the value to set
         * @return this builder
         */
        public Builder shouldReturnLandmarks(Boolean shouldReturnLandmarks) {
            this.shouldReturnLandmarks = shouldReturnLandmarks;
            this.__explicitlySet__.add("shouldReturnLandmarks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FaceEmbeddingFeature build() {
            FaceEmbeddingFeature model =
                    new FaceEmbeddingFeature(this.maxResults, this.shouldReturnLandmarks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FaceEmbeddingFeature model) {
            if (model.wasPropertyExplicitlySet("maxResults")) {
                this.maxResults(model.getMaxResults());
            }
            if (model.wasPropertyExplicitlySet("shouldReturnLandmarks")) {
                this.shouldReturnLandmarks(model.getShouldReturnLandmarks());
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
    public FaceEmbeddingFeature(Integer maxResults, Boolean shouldReturnLandmarks) {
        super();
        this.maxResults = maxResults;
        this.shouldReturnLandmarks = shouldReturnLandmarks;
    }

    /** The maximum number of results to return. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxResults")
    private final Integer maxResults;

    /**
     * The maximum number of results to return.
     *
     * @return the value
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /** Whether or not return face landmarks. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldReturnLandmarks")
    private final Boolean shouldReturnLandmarks;

    /**
     * Whether or not return face landmarks.
     *
     * @return the value
     */
    public Boolean getShouldReturnLandmarks() {
        return shouldReturnLandmarks;
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
        sb.append("FaceEmbeddingFeature(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", maxResults=").append(String.valueOf(this.maxResults));
        sb.append(", shouldReturnLandmarks=").append(String.valueOf(this.shouldReturnLandmarks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FaceEmbeddingFeature)) {
            return false;
        }

        FaceEmbeddingFeature other = (FaceEmbeddingFeature) o;
        return java.util.Objects.equals(this.maxResults, other.maxResults)
                && java.util.Objects.equals(this.shouldReturnLandmarks, other.shouldReturnLandmarks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldReturnLandmarks == null
                                ? 43
                                : this.shouldReturnLandmarks.hashCode());
        return result;
    }
}
