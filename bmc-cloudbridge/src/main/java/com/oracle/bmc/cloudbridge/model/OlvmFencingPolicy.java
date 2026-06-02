/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Represents a cluster fencing policy.
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
    builder = OlvmFencingPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmFencingPolicy extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "skipIfConnectivityBroken",
        "isSkipIfGlusterBricksUp",
        "isSkipIfGlusterQuorumNotMet",
        "skipIfSdActive"
    })
    public OlvmFencingPolicy(
            Boolean isEnabled,
            SkipIfConnectivityBroken skipIfConnectivityBroken,
            Boolean isSkipIfGlusterBricksUp,
            Boolean isSkipIfGlusterQuorumNotMet,
            SkipIfSdActive skipIfSdActive) {
        super();
        this.isEnabled = isEnabled;
        this.skipIfConnectivityBroken = skipIfConnectivityBroken;
        this.isSkipIfGlusterBricksUp = isSkipIfGlusterBricksUp;
        this.isSkipIfGlusterQuorumNotMet = isSkipIfGlusterQuorumNotMet;
        this.skipIfSdActive = skipIfSdActive;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enable or disable fencing on this cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enable or disable fencing on this cluster.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skipIfConnectivityBroken")
        private SkipIfConnectivityBroken skipIfConnectivityBroken;

        public Builder skipIfConnectivityBroken(SkipIfConnectivityBroken skipIfConnectivityBroken) {
            this.skipIfConnectivityBroken = skipIfConnectivityBroken;
            this.__explicitlySet__.add("skipIfConnectivityBroken");
            return this;
        }
        /**
         * A flag indicating if fencing should be skipped if Gluster bricks are up and running in the host being fenced.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSkipIfGlusterBricksUp")
        private Boolean isSkipIfGlusterBricksUp;

        /**
         * A flag indicating if fencing should be skipped if Gluster bricks are up and running in the host being fenced.
         * @param isSkipIfGlusterBricksUp the value to set
         * @return this builder
         **/
        public Builder isSkipIfGlusterBricksUp(Boolean isSkipIfGlusterBricksUp) {
            this.isSkipIfGlusterBricksUp = isSkipIfGlusterBricksUp;
            this.__explicitlySet__.add("isSkipIfGlusterBricksUp");
            return this;
        }
        /**
         * A flag indicating if fencing should be skipped if Gluster bricks are up and running and Gluster quorum will not be met without those bricks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSkipIfGlusterQuorumNotMet")
        private Boolean isSkipIfGlusterQuorumNotMet;

        /**
         * A flag indicating if fencing should be skipped if Gluster bricks are up and running and Gluster quorum will not be met without those bricks.
         * @param isSkipIfGlusterQuorumNotMet the value to set
         * @return this builder
         **/
        public Builder isSkipIfGlusterQuorumNotMet(Boolean isSkipIfGlusterQuorumNotMet) {
            this.isSkipIfGlusterQuorumNotMet = isSkipIfGlusterQuorumNotMet;
            this.__explicitlySet__.add("isSkipIfGlusterQuorumNotMet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skipIfSdActive")
        private SkipIfSdActive skipIfSdActive;

        public Builder skipIfSdActive(SkipIfSdActive skipIfSdActive) {
            this.skipIfSdActive = skipIfSdActive;
            this.__explicitlySet__.add("skipIfSdActive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmFencingPolicy build() {
            OlvmFencingPolicy model =
                    new OlvmFencingPolicy(
                            this.isEnabled,
                            this.skipIfConnectivityBroken,
                            this.isSkipIfGlusterBricksUp,
                            this.isSkipIfGlusterQuorumNotMet,
                            this.skipIfSdActive);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmFencingPolicy model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("skipIfConnectivityBroken")) {
                this.skipIfConnectivityBroken(model.getSkipIfConnectivityBroken());
            }
            if (model.wasPropertyExplicitlySet("isSkipIfGlusterBricksUp")) {
                this.isSkipIfGlusterBricksUp(model.getIsSkipIfGlusterBricksUp());
            }
            if (model.wasPropertyExplicitlySet("isSkipIfGlusterQuorumNotMet")) {
                this.isSkipIfGlusterQuorumNotMet(model.getIsSkipIfGlusterQuorumNotMet());
            }
            if (model.wasPropertyExplicitlySet("skipIfSdActive")) {
                this.skipIfSdActive(model.getSkipIfSdActive());
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
     * Enable or disable fencing on this cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enable or disable fencing on this cluster.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("skipIfConnectivityBroken")
    private final SkipIfConnectivityBroken skipIfConnectivityBroken;

    public SkipIfConnectivityBroken getSkipIfConnectivityBroken() {
        return skipIfConnectivityBroken;
    }

    /**
     * A flag indicating if fencing should be skipped if Gluster bricks are up and running in the host being fenced.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipIfGlusterBricksUp")
    private final Boolean isSkipIfGlusterBricksUp;

    /**
     * A flag indicating if fencing should be skipped if Gluster bricks are up and running in the host being fenced.
     * @return the value
     **/
    public Boolean getIsSkipIfGlusterBricksUp() {
        return isSkipIfGlusterBricksUp;
    }

    /**
     * A flag indicating if fencing should be skipped if Gluster bricks are up and running and Gluster quorum will not be met without those bricks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipIfGlusterQuorumNotMet")
    private final Boolean isSkipIfGlusterQuorumNotMet;

    /**
     * A flag indicating if fencing should be skipped if Gluster bricks are up and running and Gluster quorum will not be met without those bricks.
     * @return the value
     **/
    public Boolean getIsSkipIfGlusterQuorumNotMet() {
        return isSkipIfGlusterQuorumNotMet;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("skipIfSdActive")
    private final SkipIfSdActive skipIfSdActive;

    public SkipIfSdActive getSkipIfSdActive() {
        return skipIfSdActive;
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
        sb.append("OlvmFencingPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", skipIfConnectivityBroken=")
                .append(String.valueOf(this.skipIfConnectivityBroken));
        sb.append(", isSkipIfGlusterBricksUp=")
                .append(String.valueOf(this.isSkipIfGlusterBricksUp));
        sb.append(", isSkipIfGlusterQuorumNotMet=")
                .append(String.valueOf(this.isSkipIfGlusterQuorumNotMet));
        sb.append(", skipIfSdActive=").append(String.valueOf(this.skipIfSdActive));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmFencingPolicy)) {
            return false;
        }

        OlvmFencingPolicy other = (OlvmFencingPolicy) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(
                        this.skipIfConnectivityBroken, other.skipIfConnectivityBroken)
                && java.util.Objects.equals(
                        this.isSkipIfGlusterBricksUp, other.isSkipIfGlusterBricksUp)
                && java.util.Objects.equals(
                        this.isSkipIfGlusterQuorumNotMet, other.isSkipIfGlusterQuorumNotMet)
                && java.util.Objects.equals(this.skipIfSdActive, other.skipIfSdActive)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.skipIfConnectivityBroken == null
                                ? 43
                                : this.skipIfConnectivityBroken.hashCode());
        result =
                (result * PRIME)
                        + (this.isSkipIfGlusterBricksUp == null
                                ? 43
                                : this.isSkipIfGlusterBricksUp.hashCode());
        result =
                (result * PRIME)
                        + (this.isSkipIfGlusterQuorumNotMet == null
                                ? 43
                                : this.isSkipIfGlusterQuorumNotMet.hashCode());
        result =
                (result * PRIME)
                        + (this.skipIfSdActive == null ? 43 : this.skipIfSdActive.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
