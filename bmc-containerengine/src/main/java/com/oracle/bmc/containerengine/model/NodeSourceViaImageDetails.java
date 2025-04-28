/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Details of the image running on the node. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NodeSourceViaImageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NodeSourceViaImageDetails extends NodeSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the image used to boot the node. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The OCID of the image used to boot the node.
         *
         * @param imageId the value to set
         * @return this builder
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /**
         * The size of the boot volume in GBs. Minimum value is 50 GB. See
         * [here](https://docs.oracle.com/iaas/en-us/iaas/Content/Block/Concepts/bootvolumes.htm)
         * for max custom boot volume sizing and OS-specific requirements.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeSizeInGBs")
        private Long bootVolumeSizeInGBs;

        /**
         * The size of the boot volume in GBs. Minimum value is 50 GB. See
         * [here](https://docs.oracle.com/iaas/en-us/iaas/Content/Block/Concepts/bootvolumes.htm)
         * for max custom boot volume sizing and OS-specific requirements.
         *
         * @param bootVolumeSizeInGBs the value to set
         * @return this builder
         */
        public Builder bootVolumeSizeInGBs(Long bootVolumeSizeInGBs) {
            this.bootVolumeSizeInGBs = bootVolumeSizeInGBs;
            this.__explicitlySet__.add("bootVolumeSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodeSourceViaImageDetails build() {
            NodeSourceViaImageDetails model =
                    new NodeSourceViaImageDetails(this.imageId, this.bootVolumeSizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeSourceViaImageDetails model) {
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
            }
            if (model.wasPropertyExplicitlySet("bootVolumeSizeInGBs")) {
                this.bootVolumeSizeInGBs(model.getBootVolumeSizeInGBs());
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
    public NodeSourceViaImageDetails(String imageId, Long bootVolumeSizeInGBs) {
        super();
        this.imageId = imageId;
        this.bootVolumeSizeInGBs = bootVolumeSizeInGBs;
    }

    /** The OCID of the image used to boot the node. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The OCID of the image used to boot the node.
     *
     * @return the value
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * The size of the boot volume in GBs. Minimum value is 50 GB. See
     * [here](https://docs.oracle.com/iaas/en-us/iaas/Content/Block/Concepts/bootvolumes.htm) for
     * max custom boot volume sizing and OS-specific requirements.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeSizeInGBs")
    private final Long bootVolumeSizeInGBs;

    /**
     * The size of the boot volume in GBs. Minimum value is 50 GB. See
     * [here](https://docs.oracle.com/iaas/en-us/iaas/Content/Block/Concepts/bootvolumes.htm) for
     * max custom boot volume sizing and OS-specific requirements.
     *
     * @return the value
     */
    public Long getBootVolumeSizeInGBs() {
        return bootVolumeSizeInGBs;
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
        sb.append("NodeSourceViaImageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", bootVolumeSizeInGBs=").append(String.valueOf(this.bootVolumeSizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeSourceViaImageDetails)) {
            return false;
        }

        NodeSourceViaImageDetails other = (NodeSourceViaImageDetails) o;
        return java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.bootVolumeSizeInGBs, other.bootVolumeSizeInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result =
                (result * PRIME)
                        + (this.bootVolumeSizeInGBs == null
                                ? 43
                                : this.bootVolumeSizeInGBs.hashCode());
        return result;
    }
}
