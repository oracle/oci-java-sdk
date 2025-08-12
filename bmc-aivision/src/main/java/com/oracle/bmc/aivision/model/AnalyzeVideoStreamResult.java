/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Video stream analysis results. <br>
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
        builder = AnalyzeVideoStreamResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AnalyzeVideoStreamResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ontologyClasses",
        "videoStreamMetadata",
        "imageData",
        "streamJobId",
        "streamSourceId",
        "timestamp",
        "videoStreamObjects",
        "objectTrackingModelVersions",
        "objectDetectionModelVersions",
        "errors"
    })
    public AnalyzeVideoStreamResult(
            OntologyClass ontologyClasses,
            VideoStreamMetadata videoStreamMetadata,
            String imageData,
            String streamJobId,
            String streamSourceId,
            String timestamp,
            java.util.List<VideoStreamObject> videoStreamObjects,
            java.util.List<ModelVersionDetails> objectTrackingModelVersions,
            java.util.List<ModelVersionDetails> objectDetectionModelVersions,
            java.util.List<ProcessingError> errors) {
        super();
        this.ontologyClasses = ontologyClasses;
        this.videoStreamMetadata = videoStreamMetadata;
        this.imageData = imageData;
        this.streamJobId = streamJobId;
        this.streamSourceId = streamSourceId;
        this.timestamp = timestamp;
        this.videoStreamObjects = videoStreamObjects;
        this.objectTrackingModelVersions = objectTrackingModelVersions;
        this.objectDetectionModelVersions = objectDetectionModelVersions;
        this.errors = errors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("ontologyClasses")
        private OntologyClass ontologyClasses;

        public Builder ontologyClasses(OntologyClass ontologyClasses) {
            this.ontologyClasses = ontologyClasses;
            this.__explicitlySet__.add("ontologyClasses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("videoStreamMetadata")
        private VideoStreamMetadata videoStreamMetadata;

        public Builder videoStreamMetadata(VideoStreamMetadata videoStreamMetadata) {
            this.videoStreamMetadata = videoStreamMetadata;
            this.__explicitlySet__.add("videoStreamMetadata");
            return this;
        }
        /** Base 64 encoded frame */
        @com.fasterxml.jackson.annotation.JsonProperty("imageData")
        private String imageData;

        /**
         * Base 64 encoded frame
         *
         * @param imageData the value to set
         * @return this builder
         */
        public Builder imageData(String imageData) {
            this.imageData = imageData;
            this.__explicitlySet__.add("imageData");
            return this;
        }
        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * streamJob.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("streamJobId")
        private String streamJobId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * streamJob.
         *
         * @param streamJobId the value to set
         * @return this builder
         */
        public Builder streamJobId(String streamJobId) {
            this.streamJobId = streamJobId;
            this.__explicitlySet__.add("streamJobId");
            return this;
        }
        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * StreamSource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("streamSourceId")
        private String streamSourceId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * StreamSource.
         *
         * @param streamSourceId the value to set
         * @return this builder
         */
        public Builder streamSourceId(String streamSourceId) {
            this.streamSourceId = streamSourceId;
            this.__explicitlySet__.add("streamSourceId");
            return this;
        }
        /** time stamp of frame in utc. */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private String timestamp;

        /**
         * time stamp of frame in utc.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /** Tracked objects in a video stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("videoStreamObjects")
        private java.util.List<VideoStreamObject> videoStreamObjects;

        /**
         * Tracked objects in a video stream.
         *
         * @param videoStreamObjects the value to set
         * @return this builder
         */
        public Builder videoStreamObjects(java.util.List<VideoStreamObject> videoStreamObjects) {
            this.videoStreamObjects = videoStreamObjects;
            this.__explicitlySet__.add("videoStreamObjects");
            return this;
        }
        /** List of Object Tracking model versions. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectTrackingModelVersions")
        private java.util.List<ModelVersionDetails> objectTrackingModelVersions;

        /**
         * List of Object Tracking model versions.
         *
         * @param objectTrackingModelVersions the value to set
         * @return this builder
         */
        public Builder objectTrackingModelVersions(
                java.util.List<ModelVersionDetails> objectTrackingModelVersions) {
            this.objectTrackingModelVersions = objectTrackingModelVersions;
            this.__explicitlySet__.add("objectTrackingModelVersions");
            return this;
        }
        /** List of Object Detection model versions. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectDetectionModelVersions")
        private java.util.List<ModelVersionDetails> objectDetectionModelVersions;

        /**
         * List of Object Detection model versions.
         *
         * @param objectDetectionModelVersions the value to set
         * @return this builder
         */
        public Builder objectDetectionModelVersions(
                java.util.List<ModelVersionDetails> objectDetectionModelVersions) {
            this.objectDetectionModelVersions = objectDetectionModelVersions;
            this.__explicitlySet__.add("objectDetectionModelVersions");
            return this;
        }
        /** Array of possible errors. */
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<ProcessingError> errors;

        /**
         * Array of possible errors.
         *
         * @param errors the value to set
         * @return this builder
         */
        public Builder errors(java.util.List<ProcessingError> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyzeVideoStreamResult build() {
            AnalyzeVideoStreamResult model =
                    new AnalyzeVideoStreamResult(
                            this.ontologyClasses,
                            this.videoStreamMetadata,
                            this.imageData,
                            this.streamJobId,
                            this.streamSourceId,
                            this.timestamp,
                            this.videoStreamObjects,
                            this.objectTrackingModelVersions,
                            this.objectDetectionModelVersions,
                            this.errors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyzeVideoStreamResult model) {
            if (model.wasPropertyExplicitlySet("ontologyClasses")) {
                this.ontologyClasses(model.getOntologyClasses());
            }
            if (model.wasPropertyExplicitlySet("videoStreamMetadata")) {
                this.videoStreamMetadata(model.getVideoStreamMetadata());
            }
            if (model.wasPropertyExplicitlySet("imageData")) {
                this.imageData(model.getImageData());
            }
            if (model.wasPropertyExplicitlySet("streamJobId")) {
                this.streamJobId(model.getStreamJobId());
            }
            if (model.wasPropertyExplicitlySet("streamSourceId")) {
                this.streamSourceId(model.getStreamSourceId());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("videoStreamObjects")) {
                this.videoStreamObjects(model.getVideoStreamObjects());
            }
            if (model.wasPropertyExplicitlySet("objectTrackingModelVersions")) {
                this.objectTrackingModelVersions(model.getObjectTrackingModelVersions());
            }
            if (model.wasPropertyExplicitlySet("objectDetectionModelVersions")) {
                this.objectDetectionModelVersions(model.getObjectDetectionModelVersions());
            }
            if (model.wasPropertyExplicitlySet("errors")) {
                this.errors(model.getErrors());
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

    @com.fasterxml.jackson.annotation.JsonProperty("ontologyClasses")
    private final OntologyClass ontologyClasses;

    public OntologyClass getOntologyClasses() {
        return ontologyClasses;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("videoStreamMetadata")
    private final VideoStreamMetadata videoStreamMetadata;

    public VideoStreamMetadata getVideoStreamMetadata() {
        return videoStreamMetadata;
    }

    /** Base 64 encoded frame */
    @com.fasterxml.jackson.annotation.JsonProperty("imageData")
    private final String imageData;

    /**
     * Base 64 encoded frame
     *
     * @return the value
     */
    public String getImageData() {
        return imageData;
    }

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of streamJob.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("streamJobId")
    private final String streamJobId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of streamJob.
     *
     * @return the value
     */
    public String getStreamJobId() {
        return streamJobId;
    }

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * StreamSource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("streamSourceId")
    private final String streamSourceId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * StreamSource.
     *
     * @return the value
     */
    public String getStreamSourceId() {
        return streamSourceId;
    }

    /** time stamp of frame in utc. */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final String timestamp;

    /**
     * time stamp of frame in utc.
     *
     * @return the value
     */
    public String getTimestamp() {
        return timestamp;
    }

    /** Tracked objects in a video stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("videoStreamObjects")
    private final java.util.List<VideoStreamObject> videoStreamObjects;

    /**
     * Tracked objects in a video stream.
     *
     * @return the value
     */
    public java.util.List<VideoStreamObject> getVideoStreamObjects() {
        return videoStreamObjects;
    }

    /** List of Object Tracking model versions. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectTrackingModelVersions")
    private final java.util.List<ModelVersionDetails> objectTrackingModelVersions;

    /**
     * List of Object Tracking model versions.
     *
     * @return the value
     */
    public java.util.List<ModelVersionDetails> getObjectTrackingModelVersions() {
        return objectTrackingModelVersions;
    }

    /** List of Object Detection model versions. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectDetectionModelVersions")
    private final java.util.List<ModelVersionDetails> objectDetectionModelVersions;

    /**
     * List of Object Detection model versions.
     *
     * @return the value
     */
    public java.util.List<ModelVersionDetails> getObjectDetectionModelVersions() {
        return objectDetectionModelVersions;
    }

    /** Array of possible errors. */
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<ProcessingError> errors;

    /**
     * Array of possible errors.
     *
     * @return the value
     */
    public java.util.List<ProcessingError> getErrors() {
        return errors;
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
        sb.append("AnalyzeVideoStreamResult(");
        sb.append("super=").append(super.toString());
        sb.append("ontologyClasses=").append(String.valueOf(this.ontologyClasses));
        sb.append(", videoStreamMetadata=").append(String.valueOf(this.videoStreamMetadata));
        sb.append(", imageData=").append(String.valueOf(this.imageData));
        sb.append(", streamJobId=").append(String.valueOf(this.streamJobId));
        sb.append(", streamSourceId=").append(String.valueOf(this.streamSourceId));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", videoStreamObjects=").append(String.valueOf(this.videoStreamObjects));
        sb.append(", objectTrackingModelVersions=")
                .append(String.valueOf(this.objectTrackingModelVersions));
        sb.append(", objectDetectionModelVersions=")
                .append(String.valueOf(this.objectDetectionModelVersions));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyzeVideoStreamResult)) {
            return false;
        }

        AnalyzeVideoStreamResult other = (AnalyzeVideoStreamResult) o;
        return java.util.Objects.equals(this.ontologyClasses, other.ontologyClasses)
                && java.util.Objects.equals(this.videoStreamMetadata, other.videoStreamMetadata)
                && java.util.Objects.equals(this.imageData, other.imageData)
                && java.util.Objects.equals(this.streamJobId, other.streamJobId)
                && java.util.Objects.equals(this.streamSourceId, other.streamSourceId)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.videoStreamObjects, other.videoStreamObjects)
                && java.util.Objects.equals(
                        this.objectTrackingModelVersions, other.objectTrackingModelVersions)
                && java.util.Objects.equals(
                        this.objectDetectionModelVersions, other.objectDetectionModelVersions)
                && java.util.Objects.equals(this.errors, other.errors)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ontologyClasses == null ? 43 : this.ontologyClasses.hashCode());
        result =
                (result * PRIME)
                        + (this.videoStreamMetadata == null
                                ? 43
                                : this.videoStreamMetadata.hashCode());
        result = (result * PRIME) + (this.imageData == null ? 43 : this.imageData.hashCode());
        result = (result * PRIME) + (this.streamJobId == null ? 43 : this.streamJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.streamSourceId == null ? 43 : this.streamSourceId.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.videoStreamObjects == null
                                ? 43
                                : this.videoStreamObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.objectTrackingModelVersions == null
                                ? 43
                                : this.objectTrackingModelVersions.hashCode());
        result =
                (result * PRIME)
                        + (this.objectDetectionModelVersions == null
                                ? 43
                                : this.objectDetectionModelVersions.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
