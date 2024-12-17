/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Video analysis results. <br>
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
        builder = AnalyzeVideoResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AnalyzeVideoResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "videoMetadata",
        "videoLabels",
        "videoObjects",
        "videoTrackedObjects",
        "videoText",
        "videoFaces",
        "ontologyClasses",
        "labelDetectionModelVersion",
        "objectDetectionModelVersion",
        "objectTrackingModelVersion",
        "textDetectionModelVersion",
        "faceDetectionModelVersion",
        "errors"
    })
    public AnalyzeVideoResult(
            VideoMetadata videoMetadata,
            java.util.List<VideoLabel> videoLabels,
            java.util.List<VideoObject> videoObjects,
            java.util.List<VideoTrackedObject> videoTrackedObjects,
            java.util.List<VideoText> videoText,
            java.util.List<VideoFace> videoFaces,
            java.util.List<OntologyClass> ontologyClasses,
            String labelDetectionModelVersion,
            String objectDetectionModelVersion,
            String objectTrackingModelVersion,
            String textDetectionModelVersion,
            String faceDetectionModelVersion,
            java.util.List<ProcessingError> errors) {
        super();
        this.videoMetadata = videoMetadata;
        this.videoLabels = videoLabels;
        this.videoObjects = videoObjects;
        this.videoTrackedObjects = videoTrackedObjects;
        this.videoText = videoText;
        this.videoFaces = videoFaces;
        this.ontologyClasses = ontologyClasses;
        this.labelDetectionModelVersion = labelDetectionModelVersion;
        this.objectDetectionModelVersion = objectDetectionModelVersion;
        this.objectTrackingModelVersion = objectTrackingModelVersion;
        this.textDetectionModelVersion = textDetectionModelVersion;
        this.faceDetectionModelVersion = faceDetectionModelVersion;
        this.errors = errors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("videoMetadata")
        private VideoMetadata videoMetadata;

        public Builder videoMetadata(VideoMetadata videoMetadata) {
            this.videoMetadata = videoMetadata;
            this.__explicitlySet__.add("videoMetadata");
            return this;
        }
        /** Detected labels in a video. */
        @com.fasterxml.jackson.annotation.JsonProperty("videoLabels")
        private java.util.List<VideoLabel> videoLabels;

        /**
         * Detected labels in a video.
         *
         * @param videoLabels the value to set
         * @return this builder
         */
        public Builder videoLabels(java.util.List<VideoLabel> videoLabels) {
            this.videoLabels = videoLabels;
            this.__explicitlySet__.add("videoLabels");
            return this;
        }
        /** Detected objects in a video. */
        @com.fasterxml.jackson.annotation.JsonProperty("videoObjects")
        private java.util.List<VideoObject> videoObjects;

        /**
         * Detected objects in a video.
         *
         * @param videoObjects the value to set
         * @return this builder
         */
        public Builder videoObjects(java.util.List<VideoObject> videoObjects) {
            this.videoObjects = videoObjects;
            this.__explicitlySet__.add("videoObjects");
            return this;
        }
        /** Tracked objects in a video. */
        @com.fasterxml.jackson.annotation.JsonProperty("videoTrackedObjects")
        private java.util.List<VideoTrackedObject> videoTrackedObjects;

        /**
         * Tracked objects in a video.
         *
         * @param videoTrackedObjects the value to set
         * @return this builder
         */
        public Builder videoTrackedObjects(java.util.List<VideoTrackedObject> videoTrackedObjects) {
            this.videoTrackedObjects = videoTrackedObjects;
            this.__explicitlySet__.add("videoTrackedObjects");
            return this;
        }
        /** Detected text in a video. */
        @com.fasterxml.jackson.annotation.JsonProperty("videoText")
        private java.util.List<VideoText> videoText;

        /**
         * Detected text in a video.
         *
         * @param videoText the value to set
         * @return this builder
         */
        public Builder videoText(java.util.List<VideoText> videoText) {
            this.videoText = videoText;
            this.__explicitlySet__.add("videoText");
            return this;
        }
        /** Detected faces in a video. */
        @com.fasterxml.jackson.annotation.JsonProperty("videoFaces")
        private java.util.List<VideoFace> videoFaces;

        /**
         * Detected faces in a video.
         *
         * @param videoFaces the value to set
         * @return this builder
         */
        public Builder videoFaces(java.util.List<VideoFace> videoFaces) {
            this.videoFaces = videoFaces;
            this.__explicitlySet__.add("videoFaces");
            return this;
        }
        /** The ontologyClasses of video labels. */
        @com.fasterxml.jackson.annotation.JsonProperty("ontologyClasses")
        private java.util.List<OntologyClass> ontologyClasses;

        /**
         * The ontologyClasses of video labels.
         *
         * @param ontologyClasses the value to set
         * @return this builder
         */
        public Builder ontologyClasses(java.util.List<OntologyClass> ontologyClasses) {
            this.ontologyClasses = ontologyClasses;
            this.__explicitlySet__.add("ontologyClasses");
            return this;
        }
        /** Label Detection model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelDetectionModelVersion")
        private String labelDetectionModelVersion;

        /**
         * Label Detection model version.
         *
         * @param labelDetectionModelVersion the value to set
         * @return this builder
         */
        public Builder labelDetectionModelVersion(String labelDetectionModelVersion) {
            this.labelDetectionModelVersion = labelDetectionModelVersion;
            this.__explicitlySet__.add("labelDetectionModelVersion");
            return this;
        }
        /** Object Detection model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectDetectionModelVersion")
        private String objectDetectionModelVersion;

        /**
         * Object Detection model version.
         *
         * @param objectDetectionModelVersion the value to set
         * @return this builder
         */
        public Builder objectDetectionModelVersion(String objectDetectionModelVersion) {
            this.objectDetectionModelVersion = objectDetectionModelVersion;
            this.__explicitlySet__.add("objectDetectionModelVersion");
            return this;
        }
        /** Object Tracking model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectTrackingModelVersion")
        private String objectTrackingModelVersion;

        /**
         * Object Tracking model version.
         *
         * @param objectTrackingModelVersion the value to set
         * @return this builder
         */
        public Builder objectTrackingModelVersion(String objectTrackingModelVersion) {
            this.objectTrackingModelVersion = objectTrackingModelVersion;
            this.__explicitlySet__.add("objectTrackingModelVersion");
            return this;
        }
        /** Text Detection model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
        private String textDetectionModelVersion;

        /**
         * Text Detection model version.
         *
         * @param textDetectionModelVersion the value to set
         * @return this builder
         */
        public Builder textDetectionModelVersion(String textDetectionModelVersion) {
            this.textDetectionModelVersion = textDetectionModelVersion;
            this.__explicitlySet__.add("textDetectionModelVersion");
            return this;
        }
        /** Face Detection model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("faceDetectionModelVersion")
        private String faceDetectionModelVersion;

        /**
         * Face Detection model version.
         *
         * @param faceDetectionModelVersion the value to set
         * @return this builder
         */
        public Builder faceDetectionModelVersion(String faceDetectionModelVersion) {
            this.faceDetectionModelVersion = faceDetectionModelVersion;
            this.__explicitlySet__.add("faceDetectionModelVersion");
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

        public AnalyzeVideoResult build() {
            AnalyzeVideoResult model =
                    new AnalyzeVideoResult(
                            this.videoMetadata,
                            this.videoLabels,
                            this.videoObjects,
                            this.videoTrackedObjects,
                            this.videoText,
                            this.videoFaces,
                            this.ontologyClasses,
                            this.labelDetectionModelVersion,
                            this.objectDetectionModelVersion,
                            this.objectTrackingModelVersion,
                            this.textDetectionModelVersion,
                            this.faceDetectionModelVersion,
                            this.errors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyzeVideoResult model) {
            if (model.wasPropertyExplicitlySet("videoMetadata")) {
                this.videoMetadata(model.getVideoMetadata());
            }
            if (model.wasPropertyExplicitlySet("videoLabels")) {
                this.videoLabels(model.getVideoLabels());
            }
            if (model.wasPropertyExplicitlySet("videoObjects")) {
                this.videoObjects(model.getVideoObjects());
            }
            if (model.wasPropertyExplicitlySet("videoTrackedObjects")) {
                this.videoTrackedObjects(model.getVideoTrackedObjects());
            }
            if (model.wasPropertyExplicitlySet("videoText")) {
                this.videoText(model.getVideoText());
            }
            if (model.wasPropertyExplicitlySet("videoFaces")) {
                this.videoFaces(model.getVideoFaces());
            }
            if (model.wasPropertyExplicitlySet("ontologyClasses")) {
                this.ontologyClasses(model.getOntologyClasses());
            }
            if (model.wasPropertyExplicitlySet("labelDetectionModelVersion")) {
                this.labelDetectionModelVersion(model.getLabelDetectionModelVersion());
            }
            if (model.wasPropertyExplicitlySet("objectDetectionModelVersion")) {
                this.objectDetectionModelVersion(model.getObjectDetectionModelVersion());
            }
            if (model.wasPropertyExplicitlySet("objectTrackingModelVersion")) {
                this.objectTrackingModelVersion(model.getObjectTrackingModelVersion());
            }
            if (model.wasPropertyExplicitlySet("textDetectionModelVersion")) {
                this.textDetectionModelVersion(model.getTextDetectionModelVersion());
            }
            if (model.wasPropertyExplicitlySet("faceDetectionModelVersion")) {
                this.faceDetectionModelVersion(model.getFaceDetectionModelVersion());
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

    @com.fasterxml.jackson.annotation.JsonProperty("videoMetadata")
    private final VideoMetadata videoMetadata;

    public VideoMetadata getVideoMetadata() {
        return videoMetadata;
    }

    /** Detected labels in a video. */
    @com.fasterxml.jackson.annotation.JsonProperty("videoLabels")
    private final java.util.List<VideoLabel> videoLabels;

    /**
     * Detected labels in a video.
     *
     * @return the value
     */
    public java.util.List<VideoLabel> getVideoLabels() {
        return videoLabels;
    }

    /** Detected objects in a video. */
    @com.fasterxml.jackson.annotation.JsonProperty("videoObjects")
    private final java.util.List<VideoObject> videoObjects;

    /**
     * Detected objects in a video.
     *
     * @return the value
     */
    public java.util.List<VideoObject> getVideoObjects() {
        return videoObjects;
    }

    /** Tracked objects in a video. */
    @com.fasterxml.jackson.annotation.JsonProperty("videoTrackedObjects")
    private final java.util.List<VideoTrackedObject> videoTrackedObjects;

    /**
     * Tracked objects in a video.
     *
     * @return the value
     */
    public java.util.List<VideoTrackedObject> getVideoTrackedObjects() {
        return videoTrackedObjects;
    }

    /** Detected text in a video. */
    @com.fasterxml.jackson.annotation.JsonProperty("videoText")
    private final java.util.List<VideoText> videoText;

    /**
     * Detected text in a video.
     *
     * @return the value
     */
    public java.util.List<VideoText> getVideoText() {
        return videoText;
    }

    /** Detected faces in a video. */
    @com.fasterxml.jackson.annotation.JsonProperty("videoFaces")
    private final java.util.List<VideoFace> videoFaces;

    /**
     * Detected faces in a video.
     *
     * @return the value
     */
    public java.util.List<VideoFace> getVideoFaces() {
        return videoFaces;
    }

    /** The ontologyClasses of video labels. */
    @com.fasterxml.jackson.annotation.JsonProperty("ontologyClasses")
    private final java.util.List<OntologyClass> ontologyClasses;

    /**
     * The ontologyClasses of video labels.
     *
     * @return the value
     */
    public java.util.List<OntologyClass> getOntologyClasses() {
        return ontologyClasses;
    }

    /** Label Detection model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelDetectionModelVersion")
    private final String labelDetectionModelVersion;

    /**
     * Label Detection model version.
     *
     * @return the value
     */
    public String getLabelDetectionModelVersion() {
        return labelDetectionModelVersion;
    }

    /** Object Detection model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectDetectionModelVersion")
    private final String objectDetectionModelVersion;

    /**
     * Object Detection model version.
     *
     * @return the value
     */
    public String getObjectDetectionModelVersion() {
        return objectDetectionModelVersion;
    }

    /** Object Tracking model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectTrackingModelVersion")
    private final String objectTrackingModelVersion;

    /**
     * Object Tracking model version.
     *
     * @return the value
     */
    public String getObjectTrackingModelVersion() {
        return objectTrackingModelVersion;
    }

    /** Text Detection model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
    private final String textDetectionModelVersion;

    /**
     * Text Detection model version.
     *
     * @return the value
     */
    public String getTextDetectionModelVersion() {
        return textDetectionModelVersion;
    }

    /** Face Detection model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("faceDetectionModelVersion")
    private final String faceDetectionModelVersion;

    /**
     * Face Detection model version.
     *
     * @return the value
     */
    public String getFaceDetectionModelVersion() {
        return faceDetectionModelVersion;
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
        sb.append("AnalyzeVideoResult(");
        sb.append("super=").append(super.toString());
        sb.append("videoMetadata=").append(String.valueOf(this.videoMetadata));
        sb.append(", videoLabels=").append(String.valueOf(this.videoLabels));
        sb.append(", videoObjects=").append(String.valueOf(this.videoObjects));
        sb.append(", videoTrackedObjects=").append(String.valueOf(this.videoTrackedObjects));
        sb.append(", videoText=").append(String.valueOf(this.videoText));
        sb.append(", videoFaces=").append(String.valueOf(this.videoFaces));
        sb.append(", ontologyClasses=").append(String.valueOf(this.ontologyClasses));
        sb.append(", labelDetectionModelVersion=")
                .append(String.valueOf(this.labelDetectionModelVersion));
        sb.append(", objectDetectionModelVersion=")
                .append(String.valueOf(this.objectDetectionModelVersion));
        sb.append(", objectTrackingModelVersion=")
                .append(String.valueOf(this.objectTrackingModelVersion));
        sb.append(", textDetectionModelVersion=")
                .append(String.valueOf(this.textDetectionModelVersion));
        sb.append(", faceDetectionModelVersion=")
                .append(String.valueOf(this.faceDetectionModelVersion));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyzeVideoResult)) {
            return false;
        }

        AnalyzeVideoResult other = (AnalyzeVideoResult) o;
        return java.util.Objects.equals(this.videoMetadata, other.videoMetadata)
                && java.util.Objects.equals(this.videoLabels, other.videoLabels)
                && java.util.Objects.equals(this.videoObjects, other.videoObjects)
                && java.util.Objects.equals(this.videoTrackedObjects, other.videoTrackedObjects)
                && java.util.Objects.equals(this.videoText, other.videoText)
                && java.util.Objects.equals(this.videoFaces, other.videoFaces)
                && java.util.Objects.equals(this.ontologyClasses, other.ontologyClasses)
                && java.util.Objects.equals(
                        this.labelDetectionModelVersion, other.labelDetectionModelVersion)
                && java.util.Objects.equals(
                        this.objectDetectionModelVersion, other.objectDetectionModelVersion)
                && java.util.Objects.equals(
                        this.objectTrackingModelVersion, other.objectTrackingModelVersion)
                && java.util.Objects.equals(
                        this.textDetectionModelVersion, other.textDetectionModelVersion)
                && java.util.Objects.equals(
                        this.faceDetectionModelVersion, other.faceDetectionModelVersion)
                && java.util.Objects.equals(this.errors, other.errors)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.videoMetadata == null ? 43 : this.videoMetadata.hashCode());
        result = (result * PRIME) + (this.videoLabels == null ? 43 : this.videoLabels.hashCode());
        result = (result * PRIME) + (this.videoObjects == null ? 43 : this.videoObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.videoTrackedObjects == null
                                ? 43
                                : this.videoTrackedObjects.hashCode());
        result = (result * PRIME) + (this.videoText == null ? 43 : this.videoText.hashCode());
        result = (result * PRIME) + (this.videoFaces == null ? 43 : this.videoFaces.hashCode());
        result =
                (result * PRIME)
                        + (this.ontologyClasses == null ? 43 : this.ontologyClasses.hashCode());
        result =
                (result * PRIME)
                        + (this.labelDetectionModelVersion == null
                                ? 43
                                : this.labelDetectionModelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.objectDetectionModelVersion == null
                                ? 43
                                : this.objectDetectionModelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.objectTrackingModelVersion == null
                                ? 43
                                : this.objectTrackingModelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.textDetectionModelVersion == null
                                ? 43
                                : this.textDetectionModelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.faceDetectionModelVersion == null
                                ? 43
                                : this.faceDetectionModelVersion.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
