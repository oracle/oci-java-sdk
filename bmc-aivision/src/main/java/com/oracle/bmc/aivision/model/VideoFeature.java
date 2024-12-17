/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Details about a video feature request. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "featureType",
        defaultImpl = VideoFeature.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VideoObjectDetectionFeature.class,
            name = "OBJECT_DETECTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VideoFaceDetectionFeature.class,
            name = "FACE_DETECTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VideoTextDetectionFeature.class,
            name = "TEXT_DETECTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VideoObjectTrackingFeature.class,
            name = "OBJECT_TRACKING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VideoLabelDetectionFeature.class,
            name = "LABEL_DETECTION")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class VideoFeature extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected VideoFeature() {
        super();
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
        sb.append("VideoFeature(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VideoFeature)) {
            return false;
        }

        VideoFeature other = (VideoFeature) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The feature of video analysis. Allowed values are: - LABEL_DETECTION: Label detection
     * feature(IC). - OBJECT_DETECTION: Object detection feature(OD). - TEXT_DETECTION: Text
     * detection feature(OCR). - FACE_DETECTION: Face detection feature(fd). - OBJECT_TRACKING:
     * Object tracking feature(OT).
     */
    public enum FeatureType implements com.oracle.bmc.http.internal.BmcEnum {
        LabelDetection("LABEL_DETECTION"),
        ObjectDetection("OBJECT_DETECTION"),
        TextDetection("TEXT_DETECTION"),
        FaceDetection("FACE_DETECTION"),
        ObjectTracking("OBJECT_TRACKING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FeatureType.class);

        private final String value;
        private static java.util.Map<String, FeatureType> map;

        static {
            map = new java.util.HashMap<>();
            for (FeatureType v : FeatureType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FeatureType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FeatureType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FeatureType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
