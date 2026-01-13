/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Tracked object in a video. <br>
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
        builder = VideoTrackedObject.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VideoTrackedObject
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "objectId", "properties", "segments"})
    public VideoTrackedObject(
            String name,
            Integer objectId,
            VideoTrackedObjectProperties properties,
            java.util.List<VideoTrackedObjectSegment> segments) {
        super();
        this.name = name;
        this.objectId = objectId;
        this.properties = properties;
        this.segments = segments;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the object category label. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the object category label.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Unique identifier for the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectId")
        private Integer objectId;

        /**
         * Unique identifier for the object.
         *
         * @param objectId the value to set
         * @return this builder
         */
        public Builder objectId(Integer objectId) {
            this.objectId = objectId;
            this.__explicitlySet__.add("objectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private VideoTrackedObjectProperties properties;

        public Builder properties(VideoTrackedObjectProperties properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /** Segments for the tracked object. */
        @com.fasterxml.jackson.annotation.JsonProperty("segments")
        private java.util.List<VideoTrackedObjectSegment> segments;

        /**
         * Segments for the tracked object.
         *
         * @param segments the value to set
         * @return this builder
         */
        public Builder segments(java.util.List<VideoTrackedObjectSegment> segments) {
            this.segments = segments;
            this.__explicitlySet__.add("segments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VideoTrackedObject build() {
            VideoTrackedObject model =
                    new VideoTrackedObject(
                            this.name, this.objectId, this.properties, this.segments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VideoTrackedObject model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("objectId")) {
                this.objectId(model.getObjectId());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("segments")) {
                this.segments(model.getSegments());
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

    /** Name of the object category label. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the object category label.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Unique identifier for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectId")
    private final Integer objectId;

    /**
     * Unique identifier for the object.
     *
     * @return the value
     */
    public Integer getObjectId() {
        return objectId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final VideoTrackedObjectProperties properties;

    public VideoTrackedObjectProperties getProperties() {
        return properties;
    }

    /** Segments for the tracked object. */
    @com.fasterxml.jackson.annotation.JsonProperty("segments")
    private final java.util.List<VideoTrackedObjectSegment> segments;

    /**
     * Segments for the tracked object.
     *
     * @return the value
     */
    public java.util.List<VideoTrackedObjectSegment> getSegments() {
        return segments;
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
        sb.append("VideoTrackedObject(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", objectId=").append(String.valueOf(this.objectId));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", segments=").append(String.valueOf(this.segments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoTrackedObject)) {
            return false;
        }

        VideoTrackedObject other = (VideoTrackedObject) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.objectId, other.objectId)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.segments, other.segments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.objectId == null ? 43 : this.objectId.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.segments == null ? 43 : this.segments.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
