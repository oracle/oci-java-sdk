/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Oracle Cloud Agent features supported on the image. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceAgentFeatures.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceAgentFeatures
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isMonitoringSupported", "isManagementSupported"})
    public InstanceAgentFeatures(Boolean isMonitoringSupported, Boolean isManagementSupported) {
        super();
        this.isMonitoringSupported = isMonitoringSupported;
        this.isManagementSupported = isManagementSupported;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This attribute is not used. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMonitoringSupported")
        private Boolean isMonitoringSupported;

        /**
         * This attribute is not used.
         *
         * @param isMonitoringSupported the value to set
         * @return this builder
         */
        public Builder isMonitoringSupported(Boolean isMonitoringSupported) {
            this.isMonitoringSupported = isMonitoringSupported;
            this.__explicitlySet__.add("isMonitoringSupported");
            return this;
        }
        /** This attribute is not used. */
        @com.fasterxml.jackson.annotation.JsonProperty("isManagementSupported")
        private Boolean isManagementSupported;

        /**
         * This attribute is not used.
         *
         * @param isManagementSupported the value to set
         * @return this builder
         */
        public Builder isManagementSupported(Boolean isManagementSupported) {
            this.isManagementSupported = isManagementSupported;
            this.__explicitlySet__.add("isManagementSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentFeatures build() {
            InstanceAgentFeatures model =
                    new InstanceAgentFeatures(
                            this.isMonitoringSupported, this.isManagementSupported);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentFeatures model) {
            if (model.wasPropertyExplicitlySet("isMonitoringSupported")) {
                this.isMonitoringSupported(model.getIsMonitoringSupported());
            }
            if (model.wasPropertyExplicitlySet("isManagementSupported")) {
                this.isManagementSupported(model.getIsManagementSupported());
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

    /** This attribute is not used. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMonitoringSupported")
    private final Boolean isMonitoringSupported;

    /**
     * This attribute is not used.
     *
     * @return the value
     */
    public Boolean getIsMonitoringSupported() {
        return isMonitoringSupported;
    }

    /** This attribute is not used. */
    @com.fasterxml.jackson.annotation.JsonProperty("isManagementSupported")
    private final Boolean isManagementSupported;

    /**
     * This attribute is not used.
     *
     * @return the value
     */
    public Boolean getIsManagementSupported() {
        return isManagementSupported;
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
        sb.append("InstanceAgentFeatures(");
        sb.append("super=").append(super.toString());
        sb.append("isMonitoringSupported=").append(String.valueOf(this.isMonitoringSupported));
        sb.append(", isManagementSupported=").append(String.valueOf(this.isManagementSupported));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentFeatures)) {
            return false;
        }

        InstanceAgentFeatures other = (InstanceAgentFeatures) o;
        return java.util.Objects.equals(this.isMonitoringSupported, other.isMonitoringSupported)
                && java.util.Objects.equals(this.isManagementSupported, other.isManagementSupported)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isMonitoringSupported == null
                                ? 43
                                : this.isMonitoringSupported.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagementSupported == null
                                ? 43
                                : this.isManagementSupported.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
