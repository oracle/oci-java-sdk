/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateRegionSubscriptionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateRegionSubscriptionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"regionKey"})
    public CreateRegionSubscriptionDetails(String regionKey) {
        super();
        this.regionKey = regionKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The regions's key. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm) for
         * the full list of supported 3-letter region codes.
         * <p>
         * Example: {@code PHX}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regionKey")
        private String regionKey;

        /**
         * The regions's key. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm) for
         * the full list of supported 3-letter region codes.
         * <p>
         * Example: {@code PHX}
         *
         * @param regionKey the value to set
         * @return this builder
         **/
        public Builder regionKey(String regionKey) {
            this.regionKey = regionKey;
            this.__explicitlySet__.add("regionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateRegionSubscriptionDetails build() {
            CreateRegionSubscriptionDetails model =
                    new CreateRegionSubscriptionDetails(this.regionKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRegionSubscriptionDetails model) {
            if (model.wasPropertyExplicitlySet("regionKey")) {
                this.regionKey(model.getRegionKey());
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
     * The regions's key. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm) for
     * the full list of supported 3-letter region codes.
     * <p>
     * Example: {@code PHX}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionKey")
    private final String regionKey;

    /**
     * The regions's key. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm) for
     * the full list of supported 3-letter region codes.
     * <p>
     * Example: {@code PHX}
     *
     * @return the value
     **/
    public String getRegionKey() {
        return regionKey;
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
        sb.append("CreateRegionSubscriptionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("regionKey=").append(String.valueOf(this.regionKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRegionSubscriptionDetails)) {
            return false;
        }

        CreateRegionSubscriptionDetails other = (CreateRegionSubscriptionDetails) o;
        return java.util.Objects.equals(this.regionKey, other.regionKey) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.regionKey == null ? 43 : this.regionKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
