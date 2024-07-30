/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * The Database service Database Software Image resource is required as goal version for the Exadata
 * Fleet Update Maintenance Cycle when IMAGE_ID type is selected. Specify a Database Software Image
 * of type DATABASE_IMAGE for a DB Collection. Specify a Database Software Image of type GRID_IMAGE
 * for a GI Collection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImageIdFsuTargetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImageIdFsuTargetDetails extends FsuGoalVersionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("homePolicy")
        private HomePolicy homePolicy;

        public Builder homePolicy(HomePolicy homePolicy) {
            this.homePolicy = homePolicy;
            this.__explicitlySet__.add("homePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newHomePrefix")
        private String newHomePrefix;

        public Builder newHomePrefix(String newHomePrefix) {
            this.newHomePrefix = newHomePrefix;
            this.__explicitlySet__.add("newHomePrefix");
            return this;
        }
        /** Target database software image OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareImageId")
        private String softwareImageId;

        /**
         * Target database software image OCID.
         *
         * @param softwareImageId the value to set
         * @return this builder
         */
        public Builder softwareImageId(String softwareImageId) {
            this.softwareImageId = softwareImageId;
            this.__explicitlySet__.add("softwareImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageIdFsuTargetDetails build() {
            ImageIdFsuTargetDetails model =
                    new ImageIdFsuTargetDetails(
                            this.homePolicy, this.newHomePrefix, this.softwareImageId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageIdFsuTargetDetails model) {
            if (model.wasPropertyExplicitlySet("homePolicy")) {
                this.homePolicy(model.getHomePolicy());
            }
            if (model.wasPropertyExplicitlySet("newHomePrefix")) {
                this.newHomePrefix(model.getNewHomePrefix());
            }
            if (model.wasPropertyExplicitlySet("softwareImageId")) {
                this.softwareImageId(model.getSoftwareImageId());
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
    public ImageIdFsuTargetDetails(
            HomePolicy homePolicy, String newHomePrefix, String softwareImageId) {
        super(homePolicy, newHomePrefix);
        this.softwareImageId = softwareImageId;
    }

    /** Target database software image OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareImageId")
    private final String softwareImageId;

    /**
     * Target database software image OCID.
     *
     * @return the value
     */
    public String getSoftwareImageId() {
        return softwareImageId;
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
        sb.append("ImageIdFsuTargetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", softwareImageId=").append(String.valueOf(this.softwareImageId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageIdFsuTargetDetails)) {
            return false;
        }

        ImageIdFsuTargetDetails other = (ImageIdFsuTargetDetails) o;
        return java.util.Objects.equals(this.softwareImageId, other.softwareImageId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.softwareImageId == null ? 43 : this.softwareImageId.hashCode());
        return result;
    }
}
