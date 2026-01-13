/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Details of what to track. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TrackingType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TrackingType extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "objects",
        "detectionModelId",
        "trackingModelId",
        "maxResults",
        "shouldReturnLandmarks"
    })
    public TrackingType(
            java.util.List<String> objects,
            String detectionModelId,
            String trackingModelId,
            Integer maxResults,
            Boolean shouldReturnLandmarks) {
        super();
        this.objects = objects;
        this.detectionModelId = detectionModelId;
        this.trackingModelId = trackingModelId;
        this.maxResults = maxResults;
        this.shouldReturnLandmarks = shouldReturnLandmarks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of the objects to be tracked. */
        @com.fasterxml.jackson.annotation.JsonProperty("objects")
        private java.util.List<String> objects;

        /**
         * List of the objects to be tracked.
         *
         * @param objects the value to set
         * @return this builder
         */
        public Builder objects(java.util.List<String> objects) {
            this.objects = objects;
            this.__explicitlySet__.add("objects");
            return this;
        }
        /** The detection model OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("detectionModelId")
        private String detectionModelId;

        /**
         * The detection model OCID.
         *
         * @param detectionModelId the value to set
         * @return this builder
         */
        public Builder detectionModelId(String detectionModelId) {
            this.detectionModelId = detectionModelId;
            this.__explicitlySet__.add("detectionModelId");
            return this;
        }
        /** The tracking model OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("trackingModelId")
        private String trackingModelId;

        /**
         * The tracking model OCID.
         *
         * @param trackingModelId the value to set
         * @return this builder
         */
        public Builder trackingModelId(String trackingModelId) {
            this.trackingModelId = trackingModelId;
            this.__explicitlySet__.add("trackingModelId");
            return this;
        }
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

        public TrackingType build() {
            TrackingType model =
                    new TrackingType(
                            this.objects,
                            this.detectionModelId,
                            this.trackingModelId,
                            this.maxResults,
                            this.shouldReturnLandmarks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TrackingType model) {
            if (model.wasPropertyExplicitlySet("objects")) {
                this.objects(model.getObjects());
            }
            if (model.wasPropertyExplicitlySet("detectionModelId")) {
                this.detectionModelId(model.getDetectionModelId());
            }
            if (model.wasPropertyExplicitlySet("trackingModelId")) {
                this.trackingModelId(model.getTrackingModelId());
            }
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

    /** List of the objects to be tracked. */
    @com.fasterxml.jackson.annotation.JsonProperty("objects")
    private final java.util.List<String> objects;

    /**
     * List of the objects to be tracked.
     *
     * @return the value
     */
    public java.util.List<String> getObjects() {
        return objects;
    }

    /** The detection model OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("detectionModelId")
    private final String detectionModelId;

    /**
     * The detection model OCID.
     *
     * @return the value
     */
    public String getDetectionModelId() {
        return detectionModelId;
    }

    /** The tracking model OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("trackingModelId")
    private final String trackingModelId;

    /**
     * The tracking model OCID.
     *
     * @return the value
     */
    public String getTrackingModelId() {
        return trackingModelId;
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
        sb.append("TrackingType(");
        sb.append("super=").append(super.toString());
        sb.append("objects=").append(String.valueOf(this.objects));
        sb.append(", detectionModelId=").append(String.valueOf(this.detectionModelId));
        sb.append(", trackingModelId=").append(String.valueOf(this.trackingModelId));
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
        if (!(o instanceof TrackingType)) {
            return false;
        }

        TrackingType other = (TrackingType) o;
        return java.util.Objects.equals(this.objects, other.objects)
                && java.util.Objects.equals(this.detectionModelId, other.detectionModelId)
                && java.util.Objects.equals(this.trackingModelId, other.trackingModelId)
                && java.util.Objects.equals(this.maxResults, other.maxResults)
                && java.util.Objects.equals(this.shouldReturnLandmarks, other.shouldReturnLandmarks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objects == null ? 43 : this.objects.hashCode());
        result =
                (result * PRIME)
                        + (this.detectionModelId == null ? 43 : this.detectionModelId.hashCode());
        result =
                (result * PRIME)
                        + (this.trackingModelId == null ? 43 : this.trackingModelId.hashCode());
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldReturnLandmarks == null
                                ? 43
                                : this.shouldReturnLandmarks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
