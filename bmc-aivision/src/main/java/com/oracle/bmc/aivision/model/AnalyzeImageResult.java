/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The image analysis results. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AnalyzeImageResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AnalyzeImageResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "imageObjects",
        "labels",
        "ontologyClasses",
        "imageText",
        "imageClassificationModelVersion",
        "objectDetectionModelVersion",
        "textDetectionModelVersion",
        "errors"
    })
    public AnalyzeImageResult(
            java.util.List<ImageObject> imageObjects,
            java.util.List<Label> labels,
            java.util.List<OntologyClass> ontologyClasses,
            ImageText imageText,
            String imageClassificationModelVersion,
            String objectDetectionModelVersion,
            String textDetectionModelVersion,
            java.util.List<ProcessingError> errors) {
        super();
        this.imageObjects = imageObjects;
        this.labels = labels;
        this.ontologyClasses = ontologyClasses;
        this.imageText = imageText;
        this.imageClassificationModelVersion = imageClassificationModelVersion;
        this.objectDetectionModelVersion = objectDetectionModelVersion;
        this.textDetectionModelVersion = textDetectionModelVersion;
        this.errors = errors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The detected objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageObjects")
        private java.util.List<ImageObject> imageObjects;

        /**
         * The detected objects.
         *
         * @param imageObjects the value to set
         * @return this builder
         */
        public Builder imageObjects(java.util.List<ImageObject> imageObjects) {
            this.imageObjects = imageObjects;
            this.__explicitlySet__.add("imageObjects");
            return this;
        }
        /** The image classification labels. */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<Label> labels;

        /**
         * The image classification labels.
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /** The ontologyClasses of image labels. */
        @com.fasterxml.jackson.annotation.JsonProperty("ontologyClasses")
        private java.util.List<OntologyClass> ontologyClasses;

        /**
         * The ontologyClasses of image labels.
         *
         * @param ontologyClasses the value to set
         * @return this builder
         */
        public Builder ontologyClasses(java.util.List<OntologyClass> ontologyClasses) {
            this.ontologyClasses = ontologyClasses;
            this.__explicitlySet__.add("ontologyClasses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageText")
        private ImageText imageText;

        public Builder imageText(ImageText imageText) {
            this.imageText = imageText;
            this.__explicitlySet__.add("imageText");
            return this;
        }
        /** The image classification model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageClassificationModelVersion")
        private String imageClassificationModelVersion;

        /**
         * The image classification model version.
         *
         * @param imageClassificationModelVersion the value to set
         * @return this builder
         */
        public Builder imageClassificationModelVersion(String imageClassificationModelVersion) {
            this.imageClassificationModelVersion = imageClassificationModelVersion;
            this.__explicitlySet__.add("imageClassificationModelVersion");
            return this;
        }
        /** The object detection model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectDetectionModelVersion")
        private String objectDetectionModelVersion;

        /**
         * The object detection model version.
         *
         * @param objectDetectionModelVersion the value to set
         * @return this builder
         */
        public Builder objectDetectionModelVersion(String objectDetectionModelVersion) {
            this.objectDetectionModelVersion = objectDetectionModelVersion;
            this.__explicitlySet__.add("objectDetectionModelVersion");
            return this;
        }
        /** The text detection model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
        private String textDetectionModelVersion;

        /**
         * The text detection model version.
         *
         * @param textDetectionModelVersion the value to set
         * @return this builder
         */
        public Builder textDetectionModelVersion(String textDetectionModelVersion) {
            this.textDetectionModelVersion = textDetectionModelVersion;
            this.__explicitlySet__.add("textDetectionModelVersion");
            return this;
        }
        /** The errors encountered during image analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<ProcessingError> errors;

        /**
         * The errors encountered during image analysis.
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

        public AnalyzeImageResult build() {
            AnalyzeImageResult model =
                    new AnalyzeImageResult(
                            this.imageObjects,
                            this.labels,
                            this.ontologyClasses,
                            this.imageText,
                            this.imageClassificationModelVersion,
                            this.objectDetectionModelVersion,
                            this.textDetectionModelVersion,
                            this.errors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyzeImageResult model) {
            if (model.wasPropertyExplicitlySet("imageObjects")) {
                this.imageObjects(model.getImageObjects());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
            }
            if (model.wasPropertyExplicitlySet("ontologyClasses")) {
                this.ontologyClasses(model.getOntologyClasses());
            }
            if (model.wasPropertyExplicitlySet("imageText")) {
                this.imageText(model.getImageText());
            }
            if (model.wasPropertyExplicitlySet("imageClassificationModelVersion")) {
                this.imageClassificationModelVersion(model.getImageClassificationModelVersion());
            }
            if (model.wasPropertyExplicitlySet("objectDetectionModelVersion")) {
                this.objectDetectionModelVersion(model.getObjectDetectionModelVersion());
            }
            if (model.wasPropertyExplicitlySet("textDetectionModelVersion")) {
                this.textDetectionModelVersion(model.getTextDetectionModelVersion());
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

    /** The detected objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageObjects")
    private final java.util.List<ImageObject> imageObjects;

    /**
     * The detected objects.
     *
     * @return the value
     */
    public java.util.List<ImageObject> getImageObjects() {
        return imageObjects;
    }

    /** The image classification labels. */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<Label> labels;

    /**
     * The image classification labels.
     *
     * @return the value
     */
    public java.util.List<Label> getLabels() {
        return labels;
    }

    /** The ontologyClasses of image labels. */
    @com.fasterxml.jackson.annotation.JsonProperty("ontologyClasses")
    private final java.util.List<OntologyClass> ontologyClasses;

    /**
     * The ontologyClasses of image labels.
     *
     * @return the value
     */
    public java.util.List<OntologyClass> getOntologyClasses() {
        return ontologyClasses;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("imageText")
    private final ImageText imageText;

    public ImageText getImageText() {
        return imageText;
    }

    /** The image classification model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageClassificationModelVersion")
    private final String imageClassificationModelVersion;

    /**
     * The image classification model version.
     *
     * @return the value
     */
    public String getImageClassificationModelVersion() {
        return imageClassificationModelVersion;
    }

    /** The object detection model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectDetectionModelVersion")
    private final String objectDetectionModelVersion;

    /**
     * The object detection model version.
     *
     * @return the value
     */
    public String getObjectDetectionModelVersion() {
        return objectDetectionModelVersion;
    }

    /** The text detection model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
    private final String textDetectionModelVersion;

    /**
     * The text detection model version.
     *
     * @return the value
     */
    public String getTextDetectionModelVersion() {
        return textDetectionModelVersion;
    }

    /** The errors encountered during image analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<ProcessingError> errors;

    /**
     * The errors encountered during image analysis.
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
        sb.append("AnalyzeImageResult(");
        sb.append("super=").append(super.toString());
        sb.append("imageObjects=").append(String.valueOf(this.imageObjects));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", ontologyClasses=").append(String.valueOf(this.ontologyClasses));
        sb.append(", imageText=").append(String.valueOf(this.imageText));
        sb.append(", imageClassificationModelVersion=")
                .append(String.valueOf(this.imageClassificationModelVersion));
        sb.append(", objectDetectionModelVersion=")
                .append(String.valueOf(this.objectDetectionModelVersion));
        sb.append(", textDetectionModelVersion=")
                .append(String.valueOf(this.textDetectionModelVersion));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyzeImageResult)) {
            return false;
        }

        AnalyzeImageResult other = (AnalyzeImageResult) o;
        return java.util.Objects.equals(this.imageObjects, other.imageObjects)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.ontologyClasses, other.ontologyClasses)
                && java.util.Objects.equals(this.imageText, other.imageText)
                && java.util.Objects.equals(
                        this.imageClassificationModelVersion, other.imageClassificationModelVersion)
                && java.util.Objects.equals(
                        this.objectDetectionModelVersion, other.objectDetectionModelVersion)
                && java.util.Objects.equals(
                        this.textDetectionModelVersion, other.textDetectionModelVersion)
                && java.util.Objects.equals(this.errors, other.errors)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.imageObjects == null ? 43 : this.imageObjects.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result =
                (result * PRIME)
                        + (this.ontologyClasses == null ? 43 : this.ontologyClasses.hashCode());
        result = (result * PRIME) + (this.imageText == null ? 43 : this.imageText.hashCode());
        result =
                (result * PRIME)
                        + (this.imageClassificationModelVersion == null
                                ? 43
                                : this.imageClassificationModelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.objectDetectionModelVersion == null
                                ? 43
                                : this.objectDetectionModelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.textDetectionModelVersion == null
                                ? 43
                                : this.textDetectionModelVersion.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
