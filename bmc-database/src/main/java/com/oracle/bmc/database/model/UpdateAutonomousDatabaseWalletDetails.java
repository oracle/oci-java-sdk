/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to update an Autonomous Database wallet.
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
    builder = UpdateAutonomousDatabaseWalletDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateAutonomousDatabaseWalletDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shouldRotate", "gracePeriod"})
    public UpdateAutonomousDatabaseWalletDetails(Boolean shouldRotate, Integer gracePeriod) {
        super();
        this.shouldRotate = shouldRotate;
        this.gracePeriod = gracePeriod;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether to rotate the wallet or not. If {@code false}, the wallet will not be rotated. The default is {@code false}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldRotate")
        private Boolean shouldRotate;

        /**
         * Indicates whether to rotate the wallet or not. If {@code false}, the wallet will not be rotated. The default is {@code false}.
         * @param shouldRotate the value to set
         * @return this builder
         **/
        public Builder shouldRotate(Boolean shouldRotate) {
            this.shouldRotate = shouldRotate;
            this.__explicitlySet__.add("shouldRotate");
            return this;
        }
        /**
         * Grace period in hours to keep the existing wallet valid after rotation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gracePeriod")
        private Integer gracePeriod;

        /**
         * Grace period in hours to keep the existing wallet valid after rotation.
         * @param gracePeriod the value to set
         * @return this builder
         **/
        public Builder gracePeriod(Integer gracePeriod) {
            this.gracePeriod = gracePeriod;
            this.__explicitlySet__.add("gracePeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAutonomousDatabaseWalletDetails build() {
            UpdateAutonomousDatabaseWalletDetails model =
                    new UpdateAutonomousDatabaseWalletDetails(this.shouldRotate, this.gracePeriod);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAutonomousDatabaseWalletDetails model) {
            if (model.wasPropertyExplicitlySet("shouldRotate")) {
                this.shouldRotate(model.getShouldRotate());
            }
            if (model.wasPropertyExplicitlySet("gracePeriod")) {
                this.gracePeriod(model.getGracePeriod());
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
     * Indicates whether to rotate the wallet or not. If {@code false}, the wallet will not be rotated. The default is {@code false}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldRotate")
    private final Boolean shouldRotate;

    /**
     * Indicates whether to rotate the wallet or not. If {@code false}, the wallet will not be rotated. The default is {@code false}.
     * @return the value
     **/
    public Boolean getShouldRotate() {
        return shouldRotate;
    }

    /**
     * Grace period in hours to keep the existing wallet valid after rotation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gracePeriod")
    private final Integer gracePeriod;

    /**
     * Grace period in hours to keep the existing wallet valid after rotation.
     * @return the value
     **/
    public Integer getGracePeriod() {
        return gracePeriod;
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
        sb.append("UpdateAutonomousDatabaseWalletDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shouldRotate=").append(String.valueOf(this.shouldRotate));
        sb.append(", gracePeriod=").append(String.valueOf(this.gracePeriod));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousDatabaseWalletDetails)) {
            return false;
        }

        UpdateAutonomousDatabaseWalletDetails other = (UpdateAutonomousDatabaseWalletDetails) o;
        return java.util.Objects.equals(this.shouldRotate, other.shouldRotate)
                && java.util.Objects.equals(this.gracePeriod, other.gracePeriod)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shouldRotate == null ? 43 : this.shouldRotate.hashCode());
        result = (result * PRIME) + (this.gracePeriod == null ? 43 : this.gracePeriod.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
