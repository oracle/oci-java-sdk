/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Description of rover bundle version.
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
    builder = RoverBundleVersion.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RoverBundleVersion extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bundleVersion", "compartmentId", "bundleName"})
    public RoverBundleVersion(String bundleVersion, String compartmentId, String bundleName) {
        super();
        this.bundleVersion = bundleVersion;
        this.compartmentId = compartmentId;
        this.bundleName = bundleName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The version of the rover bundle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bundleVersion")
        private String bundleVersion;

        /**
         * The version of the rover bundle.
         * @param bundleVersion the value to set
         * @return this builder
         **/
        public Builder bundleVersion(String bundleVersion) {
            this.bundleVersion = bundleVersion;
            this.__explicitlySet__.add("bundleVersion");
            return this;
        }
        /**
         * The compartment OCID of roverNode/roverCluster that needs to be upgraded.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID of roverNode/roverCluster that needs to be upgraded.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The full name of the bundle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bundleName")
        private String bundleName;

        /**
         * The full name of the bundle.
         * @param bundleName the value to set
         * @return this builder
         **/
        public Builder bundleName(String bundleName) {
            this.bundleName = bundleName;
            this.__explicitlySet__.add("bundleName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoverBundleVersion build() {
            RoverBundleVersion model =
                    new RoverBundleVersion(this.bundleVersion, this.compartmentId, this.bundleName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoverBundleVersion model) {
            if (model.wasPropertyExplicitlySet("bundleVersion")) {
                this.bundleVersion(model.getBundleVersion());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("bundleName")) {
                this.bundleName(model.getBundleName());
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
     * The version of the rover bundle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bundleVersion")
    private final String bundleVersion;

    /**
     * The version of the rover bundle.
     * @return the value
     **/
    public String getBundleVersion() {
        return bundleVersion;
    }

    /**
     * The compartment OCID of roverNode/roverCluster that needs to be upgraded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID of roverNode/roverCluster that needs to be upgraded.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The full name of the bundle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bundleName")
    private final String bundleName;

    /**
     * The full name of the bundle.
     * @return the value
     **/
    public String getBundleName() {
        return bundleName;
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
        sb.append("RoverBundleVersion(");
        sb.append("super=").append(super.toString());
        sb.append("bundleVersion=").append(String.valueOf(this.bundleVersion));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", bundleName=").append(String.valueOf(this.bundleName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoverBundleVersion)) {
            return false;
        }

        RoverBundleVersion other = (RoverBundleVersion) o;
        return java.util.Objects.equals(this.bundleVersion, other.bundleVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.bundleName, other.bundleName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bundleVersion == null ? 43 : this.bundleVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.bundleName == null ? 43 : this.bundleName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
