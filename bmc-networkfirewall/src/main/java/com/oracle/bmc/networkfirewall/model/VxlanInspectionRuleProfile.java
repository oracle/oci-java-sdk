/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Vxlan Inspect profile used in Vxlan Tunnel Inspection Rules.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VxlanInspectionRuleProfile.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VxlanInspectionRuleProfile
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mustReturnTrafficToSource"})
    public VxlanInspectionRuleProfile(Boolean mustReturnTrafficToSource) {
        super();
        this.mustReturnTrafficToSource = mustReturnTrafficToSource;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Return scanned VXLAN tunnel traffic to source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mustReturnTrafficToSource")
        private Boolean mustReturnTrafficToSource;

        /**
         * Return scanned VXLAN tunnel traffic to source.
         * @param mustReturnTrafficToSource the value to set
         * @return this builder
         **/
        public Builder mustReturnTrafficToSource(Boolean mustReturnTrafficToSource) {
            this.mustReturnTrafficToSource = mustReturnTrafficToSource;
            this.__explicitlySet__.add("mustReturnTrafficToSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VxlanInspectionRuleProfile build() {
            VxlanInspectionRuleProfile model =
                    new VxlanInspectionRuleProfile(this.mustReturnTrafficToSource);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VxlanInspectionRuleProfile model) {
            if (model.wasPropertyExplicitlySet("mustReturnTrafficToSource")) {
                this.mustReturnTrafficToSource(model.getMustReturnTrafficToSource());
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
     * Return scanned VXLAN tunnel traffic to source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mustReturnTrafficToSource")
    private final Boolean mustReturnTrafficToSource;

    /**
     * Return scanned VXLAN tunnel traffic to source.
     * @return the value
     **/
    public Boolean getMustReturnTrafficToSource() {
        return mustReturnTrafficToSource;
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
        sb.append("VxlanInspectionRuleProfile(");
        sb.append("super=").append(super.toString());
        sb.append("mustReturnTrafficToSource=")
                .append(String.valueOf(this.mustReturnTrafficToSource));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VxlanInspectionRuleProfile)) {
            return false;
        }

        VxlanInspectionRuleProfile other = (VxlanInspectionRuleProfile) o;
        return java.util.Objects.equals(
                        this.mustReturnTrafficToSource, other.mustReturnTrafficToSource)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mustReturnTrafficToSource == null
                                ? 43
                                : this.mustReturnTrafficToSource.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
