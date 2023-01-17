/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Binary object needed for vSphere upgrade
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VsphereUpgradeObject.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VsphereUpgradeObject extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"downloadLink", "linkDescription"})
    public VsphereUpgradeObject(String downloadLink, String linkDescription) {
        super();
        this.downloadLink = downloadLink;
        this.linkDescription = linkDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Binary object download link.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("downloadLink")
        private String downloadLink;

        /**
         * Binary object download link.
         * @param downloadLink the value to set
         * @return this builder
         **/
        public Builder downloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            this.__explicitlySet__.add("downloadLink");
            return this;
        }
        /**
         * Binary object description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("linkDescription")
        private String linkDescription;

        /**
         * Binary object description.
         * @param linkDescription the value to set
         * @return this builder
         **/
        public Builder linkDescription(String linkDescription) {
            this.linkDescription = linkDescription;
            this.__explicitlySet__.add("linkDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VsphereUpgradeObject build() {
            VsphereUpgradeObject model =
                    new VsphereUpgradeObject(this.downloadLink, this.linkDescription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VsphereUpgradeObject model) {
            if (model.wasPropertyExplicitlySet("downloadLink")) {
                this.downloadLink(model.getDownloadLink());
            }
            if (model.wasPropertyExplicitlySet("linkDescription")) {
                this.linkDescription(model.getLinkDescription());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Binary object download link.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("downloadLink")
    private final String downloadLink;

    /**
     * Binary object download link.
     * @return the value
     **/
    public String getDownloadLink() {
        return downloadLink;
    }

    /**
     * Binary object description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("linkDescription")
    private final String linkDescription;

    /**
     * Binary object description.
     * @return the value
     **/
    public String getLinkDescription() {
        return linkDescription;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VsphereUpgradeObject(");
        sb.append("super=").append(super.toString());
        sb.append("downloadLink=").append(String.valueOf(this.downloadLink));
        sb.append(", linkDescription=").append(String.valueOf(this.linkDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VsphereUpgradeObject)) {
            return false;
        }

        VsphereUpgradeObject other = (VsphereUpgradeObject) o;
        return java.util.Objects.equals(this.downloadLink, other.downloadLink)
                && java.util.Objects.equals(this.linkDescription, other.linkDescription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.downloadLink == null ? 43 : this.downloadLink.hashCode());
        result =
                (result * PRIME)
                        + (this.linkDescription == null ? 43 : this.linkDescription.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
