/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * A target that is discovered by the Software discovery process. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiscoveredTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiscoveredTarget
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetId",
        "targetName",
        "product",
        "resourceId",
        "version"
    })
    public DiscoveredTarget(
            String targetId, String targetName, String product, String resourceId, String version) {
        super();
        this.targetId = targetId;
        this.targetName = targetName;
        this.product = product;
        this.resourceId = resourceId;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** ID of the Target. Can be the target name if a separate ID is not available. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * ID of the Target. Can be the target name if a separate ID is not available.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** Target Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetName")
        private String targetName;

        /**
         * Target Name.
         *
         * @param targetName the value to set
         * @return this builder
         */
        public Builder targetName(String targetName) {
            this.targetName = targetName;
            this.__explicitlySet__.add("targetName");
            return this;
        }
        /** Product that the target belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private String product;

        /**
         * Product that the target belongs to.
         *
         * @param product the value to set
         * @return this builder
         */
        public Builder product(String product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /** Unique key that identifies the resource that the target belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Unique key that identifies the resource that the target belongs to.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Current version of the target. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Current version of the target.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveredTarget build() {
            DiscoveredTarget model =
                    new DiscoveredTarget(
                            this.targetId,
                            this.targetName,
                            this.product,
                            this.resourceId,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveredTarget model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetName")) {
                this.targetName(model.getTargetName());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    /** ID of the Target. Can be the target name if a separate ID is not available. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * ID of the Target. Can be the target name if a separate ID is not available.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** Target Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    private final String targetName;

    /**
     * Target Name.
     *
     * @return the value
     */
    public String getTargetName() {
        return targetName;
    }

    /** Product that the target belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final String product;

    /**
     * Product that the target belongs to.
     *
     * @return the value
     */
    public String getProduct() {
        return product;
    }

    /** Unique key that identifies the resource that the target belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Unique key that identifies the resource that the target belongs to.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Current version of the target. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Current version of the target.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
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
        sb.append("DiscoveredTarget(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetName=").append(String.valueOf(this.targetName));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveredTarget)) {
            return false;
        }

        DiscoveredTarget other = (DiscoveredTarget) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetName, other.targetName)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetName == null ? 43 : this.targetName.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
