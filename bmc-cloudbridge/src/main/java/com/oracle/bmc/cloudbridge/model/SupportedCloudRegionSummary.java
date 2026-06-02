/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Summary of the supported cloud region.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SupportedCloudRegionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SupportedCloudRegionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"assetSourceType", "name", "lifecycleState"})
    public SupportedCloudRegionSummary(
            AssetSourceType assetSourceType,
            String name,
            SupportedCloudRegionLifecycleState lifecycleState) {
        super();
        this.assetSourceType = assetSourceType;
        this.name = name;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The asset source type associated with the supported cloud region.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assetSourceType")
        private AssetSourceType assetSourceType;

        /**
         * The asset source type associated with the supported cloud region.
         * @param assetSourceType the value to set
         * @return this builder
         **/
        public Builder assetSourceType(AssetSourceType assetSourceType) {
            this.assetSourceType = assetSourceType;
            this.__explicitlySet__.add("assetSourceType");
            return this;
        }
        /**
         * The supported cloud region name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The supported cloud region name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The current state of the supported cloud region.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SupportedCloudRegionLifecycleState lifecycleState;

        /**
         * The current state of the supported cloud region.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(SupportedCloudRegionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SupportedCloudRegionSummary build() {
            SupportedCloudRegionSummary model =
                    new SupportedCloudRegionSummary(
                            this.assetSourceType, this.name, this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SupportedCloudRegionSummary model) {
            if (model.wasPropertyExplicitlySet("assetSourceType")) {
                this.assetSourceType(model.getAssetSourceType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * The asset source type associated with the supported cloud region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assetSourceType")
    private final AssetSourceType assetSourceType;

    /**
     * The asset source type associated with the supported cloud region.
     * @return the value
     **/
    public AssetSourceType getAssetSourceType() {
        return assetSourceType;
    }

    /**
     * The supported cloud region name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The supported cloud region name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The current state of the supported cloud region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SupportedCloudRegionLifecycleState lifecycleState;

    /**
     * The current state of the supported cloud region.
     * @return the value
     **/
    public SupportedCloudRegionLifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("SupportedCloudRegionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("assetSourceType=").append(String.valueOf(this.assetSourceType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SupportedCloudRegionSummary)) {
            return false;
        }

        SupportedCloudRegionSummary other = (SupportedCloudRegionSummary) o;
        return java.util.Objects.equals(this.assetSourceType, other.assetSourceType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.assetSourceType == null ? 43 : this.assetSourceType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
