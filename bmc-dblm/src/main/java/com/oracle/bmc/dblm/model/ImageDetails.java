/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Image details containing the subscribed image, its status, version, owner and time of creation.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImageDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "imageId",
        "subscribedImage",
        "currentVersion",
        "imageStatus",
        "imageVersion",
        "imageOwner",
        "createdBy",
        "timeImageCreation",
        "upToDateImageVersion"
    })
    public ImageDetails(
            String imageId,
            String subscribedImage,
            String currentVersion,
            ImageStatus imageStatus,
            String imageVersion,
            String imageOwner,
            String createdBy,
            java.util.Date timeImageCreation,
            String upToDateImageVersion) {
        super();
        this.imageId = imageId;
        this.subscribedImage = subscribedImage;
        this.currentVersion = currentVersion;
        this.imageStatus = imageStatus;
        this.imageVersion = imageVersion;
        this.imageOwner = imageOwner;
        this.createdBy = createdBy;
        this.timeImageCreation = timeImageCreation;
        this.upToDateImageVersion = upToDateImageVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Image identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * Image identifier.
         *
         * @param imageId the value to set
         * @return this builder
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /** Subscribed image. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscribedImage")
        private String subscribedImage;

        /**
         * Subscribed image.
         *
         * @param subscribedImage the value to set
         * @return this builder
         */
        public Builder subscribedImage(String subscribedImage) {
            this.subscribedImage = subscribedImage;
            this.__explicitlySet__.add("subscribedImage");
            return this;
        }
        /** Name of the image version marked as current of the image. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
        private String currentVersion;

        /**
         * Name of the image version marked as current of the image.
         *
         * @param currentVersion the value to set
         * @return this builder
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            this.__explicitlySet__.add("currentVersion");
            return this;
        }
        /** Image status. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageStatus")
        private ImageStatus imageStatus;

        /**
         * Image status.
         *
         * @param imageStatus the value to set
         * @return this builder
         */
        public Builder imageStatus(ImageStatus imageStatus) {
            this.imageStatus = imageStatus;
            this.__explicitlySet__.add("imageStatus");
            return this;
        }
        /** Release version of the image. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageVersion")
        private String imageVersion;

        /**
         * Release version of the image.
         *
         * @param imageVersion the value to set
         * @return this builder
         */
        public Builder imageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            this.__explicitlySet__.add("imageVersion");
            return this;
        }
        /** Owner of the image. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageOwner")
        private String imageOwner;

        /**
         * Owner of the image.
         *
         * @param imageOwner the value to set
         * @return this builder
         */
        public Builder imageOwner(String imageOwner) {
            this.imageOwner = imageOwner;
            this.__explicitlySet__.add("imageOwner");
            return this;
        }
        /** Name of the person who created the image. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * Name of the person who created the image.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** Date when the image was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeImageCreation")
        private java.util.Date timeImageCreation;

        /**
         * Date when the image was created.
         *
         * @param timeImageCreation the value to set
         * @return this builder
         */
        public Builder timeImageCreation(java.util.Date timeImageCreation) {
            this.timeImageCreation = timeImageCreation;
            this.__explicitlySet__.add("timeImageCreation");
            return this;
        }
        /** An image version name, that is up to date and has no recommendations. */
        @com.fasterxml.jackson.annotation.JsonProperty("upToDateImageVersion")
        private String upToDateImageVersion;

        /**
         * An image version name, that is up to date and has no recommendations.
         *
         * @param upToDateImageVersion the value to set
         * @return this builder
         */
        public Builder upToDateImageVersion(String upToDateImageVersion) {
            this.upToDateImageVersion = upToDateImageVersion;
            this.__explicitlySet__.add("upToDateImageVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageDetails build() {
            ImageDetails model =
                    new ImageDetails(
                            this.imageId,
                            this.subscribedImage,
                            this.currentVersion,
                            this.imageStatus,
                            this.imageVersion,
                            this.imageOwner,
                            this.createdBy,
                            this.timeImageCreation,
                            this.upToDateImageVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageDetails model) {
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
            }
            if (model.wasPropertyExplicitlySet("subscribedImage")) {
                this.subscribedImage(model.getSubscribedImage());
            }
            if (model.wasPropertyExplicitlySet("currentVersion")) {
                this.currentVersion(model.getCurrentVersion());
            }
            if (model.wasPropertyExplicitlySet("imageStatus")) {
                this.imageStatus(model.getImageStatus());
            }
            if (model.wasPropertyExplicitlySet("imageVersion")) {
                this.imageVersion(model.getImageVersion());
            }
            if (model.wasPropertyExplicitlySet("imageOwner")) {
                this.imageOwner(model.getImageOwner());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeImageCreation")) {
                this.timeImageCreation(model.getTimeImageCreation());
            }
            if (model.wasPropertyExplicitlySet("upToDateImageVersion")) {
                this.upToDateImageVersion(model.getUpToDateImageVersion());
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

    /** Image identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * Image identifier.
     *
     * @return the value
     */
    public String getImageId() {
        return imageId;
    }

    /** Subscribed image. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscribedImage")
    private final String subscribedImage;

    /**
     * Subscribed image.
     *
     * @return the value
     */
    public String getSubscribedImage() {
        return subscribedImage;
    }

    /** Name of the image version marked as current of the image. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
    private final String currentVersion;

    /**
     * Name of the image version marked as current of the image.
     *
     * @return the value
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /** Image status. */
    public enum ImageStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Green("GREEN"),
        Yellow("YELLOW"),
        Red("RED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ImageStatus.class);

        private final String value;
        private static java.util.Map<String, ImageStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ImageStatus v : ImageStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ImageStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ImageStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ImageStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Image status. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageStatus")
    private final ImageStatus imageStatus;

    /**
     * Image status.
     *
     * @return the value
     */
    public ImageStatus getImageStatus() {
        return imageStatus;
    }

    /** Release version of the image. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageVersion")
    private final String imageVersion;

    /**
     * Release version of the image.
     *
     * @return the value
     */
    public String getImageVersion() {
        return imageVersion;
    }

    /** Owner of the image. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageOwner")
    private final String imageOwner;

    /**
     * Owner of the image.
     *
     * @return the value
     */
    public String getImageOwner() {
        return imageOwner;
    }

    /** Name of the person who created the image. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * Name of the person who created the image.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** Date when the image was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeImageCreation")
    private final java.util.Date timeImageCreation;

    /**
     * Date when the image was created.
     *
     * @return the value
     */
    public java.util.Date getTimeImageCreation() {
        return timeImageCreation;
    }

    /** An image version name, that is up to date and has no recommendations. */
    @com.fasterxml.jackson.annotation.JsonProperty("upToDateImageVersion")
    private final String upToDateImageVersion;

    /**
     * An image version name, that is up to date and has no recommendations.
     *
     * @return the value
     */
    public String getUpToDateImageVersion() {
        return upToDateImageVersion;
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
        sb.append("ImageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("imageId=").append(String.valueOf(this.imageId));
        sb.append(", subscribedImage=").append(String.valueOf(this.subscribedImage));
        sb.append(", currentVersion=").append(String.valueOf(this.currentVersion));
        sb.append(", imageStatus=").append(String.valueOf(this.imageStatus));
        sb.append(", imageVersion=").append(String.valueOf(this.imageVersion));
        sb.append(", imageOwner=").append(String.valueOf(this.imageOwner));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeImageCreation=").append(String.valueOf(this.timeImageCreation));
        sb.append(", upToDateImageVersion=").append(String.valueOf(this.upToDateImageVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageDetails)) {
            return false;
        }

        ImageDetails other = (ImageDetails) o;
        return java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.subscribedImage, other.subscribedImage)
                && java.util.Objects.equals(this.currentVersion, other.currentVersion)
                && java.util.Objects.equals(this.imageStatus, other.imageStatus)
                && java.util.Objects.equals(this.imageVersion, other.imageVersion)
                && java.util.Objects.equals(this.imageOwner, other.imageOwner)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeImageCreation, other.timeImageCreation)
                && java.util.Objects.equals(this.upToDateImageVersion, other.upToDateImageVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscribedImage == null ? 43 : this.subscribedImage.hashCode());
        result =
                (result * PRIME)
                        + (this.currentVersion == null ? 43 : this.currentVersion.hashCode());
        result = (result * PRIME) + (this.imageStatus == null ? 43 : this.imageStatus.hashCode());
        result = (result * PRIME) + (this.imageVersion == null ? 43 : this.imageVersion.hashCode());
        result = (result * PRIME) + (this.imageOwner == null ? 43 : this.imageOwner.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.timeImageCreation == null ? 43 : this.timeImageCreation.hashCode());
        result =
                (result * PRIME)
                        + (this.upToDateImageVersion == null
                                ? 43
                                : this.upToDateImageVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
