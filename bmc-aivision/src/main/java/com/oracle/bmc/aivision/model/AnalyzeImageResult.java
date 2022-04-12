/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The image analysis results.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyzeImageResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AnalyzeImageResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("imageObjects")
        private java.util.List<ImageObject> imageObjects;

        public Builder imageObjects(java.util.List<ImageObject> imageObjects) {
            this.imageObjects = imageObjects;
            this.__explicitlySet__.add("imageObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<Label> labels;

        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ontologyClasses")
        private java.util.List<OntologyClass> ontologyClasses;

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

        @com.fasterxml.jackson.annotation.JsonProperty("imageClassificationModelVersion")
        private String imageClassificationModelVersion;

        public Builder imageClassificationModelVersion(String imageClassificationModelVersion) {
            this.imageClassificationModelVersion = imageClassificationModelVersion;
            this.__explicitlySet__.add("imageClassificationModelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectDetectionModelVersion")
        private String objectDetectionModelVersion;

        public Builder objectDetectionModelVersion(String objectDetectionModelVersion) {
            this.objectDetectionModelVersion = objectDetectionModelVersion;
            this.__explicitlySet__.add("objectDetectionModelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
        private String textDetectionModelVersion;

        public Builder textDetectionModelVersion(String textDetectionModelVersion) {
            this.textDetectionModelVersion = textDetectionModelVersion;
            this.__explicitlySet__.add("textDetectionModelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<ProcessingError> errors;

        public Builder errors(java.util.List<ProcessingError> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyzeImageResult build() {
            AnalyzeImageResult __instance__ =
                    new AnalyzeImageResult(
                            imageObjects,
                            labels,
                            ontologyClasses,
                            imageText,
                            imageClassificationModelVersion,
                            objectDetectionModelVersion,
                            textDetectionModelVersion,
                            errors);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyzeImageResult o) {
            Builder copiedBuilder =
                    imageObjects(o.getImageObjects())
                            .labels(o.getLabels())
                            .ontologyClasses(o.getOntologyClasses())
                            .imageText(o.getImageText())
                            .imageClassificationModelVersion(o.getImageClassificationModelVersion())
                            .objectDetectionModelVersion(o.getObjectDetectionModelVersion())
                            .textDetectionModelVersion(o.getTextDetectionModelVersion())
                            .errors(o.getErrors());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The detected objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageObjects")
    java.util.List<ImageObject> imageObjects;

    /**
     * The image classification labels.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    java.util.List<Label> labels;

    /**
     * The ontologyClasses of image labels.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ontologyClasses")
    java.util.List<OntologyClass> ontologyClasses;

    @com.fasterxml.jackson.annotation.JsonProperty("imageText")
    ImageText imageText;

    /**
     * The image classification model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageClassificationModelVersion")
    String imageClassificationModelVersion;

    /**
     * The object detection model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectDetectionModelVersion")
    String objectDetectionModelVersion;

    /**
     * The text detection model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("textDetectionModelVersion")
    String textDetectionModelVersion;

    /**
     * The errors encountered during image analysis.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    java.util.List<ProcessingError> errors;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
