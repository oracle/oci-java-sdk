/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Information required by Object Storage to process a request to copy an object to another bucket.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestRoverBundleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequestRoverBundleDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "destinationCompartmentId",
        "destinationBucketName",
        "bundleVersion"
    })
    public RequestRoverBundleDetails(
            String destinationCompartmentId, String destinationBucketName, String bundleVersion) {
        super();
        this.destinationCompartmentId = destinationCompartmentId;
        this.destinationBucketName = destinationBucketName;
        this.bundleVersion = bundleVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The compartment OCID of destination compartment that the bundle will be copied to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationCompartmentId")
        private String destinationCompartmentId;

        /**
         * The compartment OCID of destination compartment that the bundle will be copied to.
         * @param destinationCompartmentId the value to set
         * @return this builder
         **/
        public Builder destinationCompartmentId(String destinationCompartmentId) {
            this.destinationCompartmentId = destinationCompartmentId;
            this.__explicitlySet__.add("destinationCompartmentId");
            return this;
        }
        /**
         * The destination bucket name the bundle will be copied to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBucketName")
        private String destinationBucketName;

        /**
         * The destination bucket name the bundle will be copied to.
         * @param destinationBucketName the value to set
         * @return this builder
         **/
        public Builder destinationBucketName(String destinationBucketName) {
            this.destinationBucketName = destinationBucketName;
            this.__explicitlySet__.add("destinationBucketName");
            return this;
        }
        /**
         * The bundle version that customer wants to upgrade to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bundleVersion")
        private String bundleVersion;

        /**
         * The bundle version that customer wants to upgrade to.
         * @param bundleVersion the value to set
         * @return this builder
         **/
        public Builder bundleVersion(String bundleVersion) {
            this.bundleVersion = bundleVersion;
            this.__explicitlySet__.add("bundleVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestRoverBundleDetails build() {
            RequestRoverBundleDetails model =
                    new RequestRoverBundleDetails(
                            this.destinationCompartmentId,
                            this.destinationBucketName,
                            this.bundleVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestRoverBundleDetails model) {
            if (model.wasPropertyExplicitlySet("destinationCompartmentId")) {
                this.destinationCompartmentId(model.getDestinationCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("destinationBucketName")) {
                this.destinationBucketName(model.getDestinationBucketName());
            }
            if (model.wasPropertyExplicitlySet("bundleVersion")) {
                this.bundleVersion(model.getBundleVersion());
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
     * The compartment OCID of destination compartment that the bundle will be copied to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationCompartmentId")
    private final String destinationCompartmentId;

    /**
     * The compartment OCID of destination compartment that the bundle will be copied to.
     * @return the value
     **/
    public String getDestinationCompartmentId() {
        return destinationCompartmentId;
    }

    /**
     * The destination bucket name the bundle will be copied to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBucketName")
    private final String destinationBucketName;

    /**
     * The destination bucket name the bundle will be copied to.
     * @return the value
     **/
    public String getDestinationBucketName() {
        return destinationBucketName;
    }

    /**
     * The bundle version that customer wants to upgrade to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bundleVersion")
    private final String bundleVersion;

    /**
     * The bundle version that customer wants to upgrade to.
     * @return the value
     **/
    public String getBundleVersion() {
        return bundleVersion;
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
        sb.append("RequestRoverBundleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("destinationCompartmentId=")
                .append(String.valueOf(this.destinationCompartmentId));
        sb.append(", destinationBucketName=").append(String.valueOf(this.destinationBucketName));
        sb.append(", bundleVersion=").append(String.valueOf(this.bundleVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestRoverBundleDetails)) {
            return false;
        }

        RequestRoverBundleDetails other = (RequestRoverBundleDetails) o;
        return java.util.Objects.equals(
                        this.destinationCompartmentId, other.destinationCompartmentId)
                && java.util.Objects.equals(this.destinationBucketName, other.destinationBucketName)
                && java.util.Objects.equals(this.bundleVersion, other.bundleVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.destinationCompartmentId == null
                                ? 43
                                : this.destinationCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBucketName == null
                                ? 43
                                : this.destinationBucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.bundleVersion == null ? 43 : this.bundleVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
