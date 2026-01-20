/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Video stream object tracking feature <br>
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
        builder = VideoStreamObjectTrackingFeature.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "featureType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VideoStreamObjectTrackingFeature extends VideoStreamFeature {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of details of what to track. */
        @com.fasterxml.jackson.annotation.JsonProperty("trackingTypes")
        private java.util.List<TrackingType> trackingTypes;

        /**
         * List of details of what to track.
         *
         * @param trackingTypes the value to set
         * @return this builder
         */
        public Builder trackingTypes(java.util.List<TrackingType> trackingTypes) {
            this.trackingTypes = trackingTypes;
            this.__explicitlySet__.add("trackingTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VideoStreamObjectTrackingFeature build() {
            VideoStreamObjectTrackingFeature model =
                    new VideoStreamObjectTrackingFeature(this.trackingTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VideoStreamObjectTrackingFeature model) {
            if (model.wasPropertyExplicitlySet("trackingTypes")) {
                this.trackingTypes(model.getTrackingTypes());
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
    public VideoStreamObjectTrackingFeature(java.util.List<TrackingType> trackingTypes) {
        super();
        this.trackingTypes = trackingTypes;
    }

    /** List of details of what to track. */
    @com.fasterxml.jackson.annotation.JsonProperty("trackingTypes")
    private final java.util.List<TrackingType> trackingTypes;

    /**
     * List of details of what to track.
     *
     * @return the value
     */
    public java.util.List<TrackingType> getTrackingTypes() {
        return trackingTypes;
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
        sb.append("VideoStreamObjectTrackingFeature(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", trackingTypes=").append(String.valueOf(this.trackingTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoStreamObjectTrackingFeature)) {
            return false;
        }

        VideoStreamObjectTrackingFeature other = (VideoStreamObjectTrackingFeature) o;
        return java.util.Objects.equals(this.trackingTypes, other.trackingTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.trackingTypes == null ? 43 : this.trackingTypes.hashCode());
        return result;
    }
}
