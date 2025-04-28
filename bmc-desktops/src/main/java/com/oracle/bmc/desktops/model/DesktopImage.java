/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Provides information about the desktop image. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DesktopImage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DesktopImage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"imageId", "imageName", "operatingSystem"})
    public DesktopImage(String imageId, String imageName, String operatingSystem) {
        super();
        this.imageId = imageId;
        this.imageName = imageName;
        this.operatingSystem = operatingSystem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the desktop image. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The OCID of the desktop image.
         *
         * @param imageId the value to set
         * @return this builder
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /** The name of the desktop image. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageName")
        private String imageName;

        /**
         * The name of the desktop image.
         *
         * @param imageName the value to set
         * @return this builder
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            this.__explicitlySet__.add("imageName");
            return this;
        }
        /** The operating system of the desktop image, e.g. "Oracle Linux", "Windows". */
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private String operatingSystem;

        /**
         * The operating system of the desktop image, e.g. "Oracle Linux", "Windows".
         *
         * @param operatingSystem the value to set
         * @return this builder
         */
        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DesktopImage build() {
            DesktopImage model =
                    new DesktopImage(this.imageId, this.imageName, this.operatingSystem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DesktopImage model) {
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
            }
            if (model.wasPropertyExplicitlySet("imageName")) {
                this.imageName(model.getImageName());
            }
            if (model.wasPropertyExplicitlySet("operatingSystem")) {
                this.operatingSystem(model.getOperatingSystem());
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

    /** The OCID of the desktop image. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The OCID of the desktop image.
     *
     * @return the value
     */
    public String getImageId() {
        return imageId;
    }

    /** The name of the desktop image. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageName")
    private final String imageName;

    /**
     * The name of the desktop image.
     *
     * @return the value
     */
    public String getImageName() {
        return imageName;
    }

    /** The operating system of the desktop image, e.g. "Oracle Linux", "Windows". */
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final String operatingSystem;

    /**
     * The operating system of the desktop image, e.g. "Oracle Linux", "Windows".
     *
     * @return the value
     */
    public String getOperatingSystem() {
        return operatingSystem;
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
        sb.append("DesktopImage(");
        sb.append("super=").append(super.toString());
        sb.append("imageId=").append(String.valueOf(this.imageId));
        sb.append(", imageName=").append(String.valueOf(this.imageName));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DesktopImage)) {
            return false;
        }

        DesktopImage other = (DesktopImage) o;
        return java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.imageName, other.imageName)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.imageName == null ? 43 : this.imageName.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
