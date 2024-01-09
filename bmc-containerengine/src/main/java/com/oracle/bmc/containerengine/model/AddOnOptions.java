/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define options for supported add-ons. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AddOnOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddOnOptions extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isKubernetesDashboardEnabled", "isTillerEnabled"})
    public AddOnOptions(Boolean isKubernetesDashboardEnabled, Boolean isTillerEnabled) {
        super();
        this.isKubernetesDashboardEnabled = isKubernetesDashboardEnabled;
        this.isTillerEnabled = isTillerEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether or not to enable the Kubernetes Dashboard add-on. */
        @com.fasterxml.jackson.annotation.JsonProperty("isKubernetesDashboardEnabled")
        private Boolean isKubernetesDashboardEnabled;

        /**
         * Whether or not to enable the Kubernetes Dashboard add-on.
         *
         * @param isKubernetesDashboardEnabled the value to set
         * @return this builder
         */
        public Builder isKubernetesDashboardEnabled(Boolean isKubernetesDashboardEnabled) {
            this.isKubernetesDashboardEnabled = isKubernetesDashboardEnabled;
            this.__explicitlySet__.add("isKubernetesDashboardEnabled");
            return this;
        }
        /** Whether or not to enable the Tiller add-on. */
        @com.fasterxml.jackson.annotation.JsonProperty("isTillerEnabled")
        private Boolean isTillerEnabled;

        /**
         * Whether or not to enable the Tiller add-on.
         *
         * @param isTillerEnabled the value to set
         * @return this builder
         */
        public Builder isTillerEnabled(Boolean isTillerEnabled) {
            this.isTillerEnabled = isTillerEnabled;
            this.__explicitlySet__.add("isTillerEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddOnOptions build() {
            AddOnOptions model =
                    new AddOnOptions(this.isKubernetesDashboardEnabled, this.isTillerEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddOnOptions model) {
            if (model.wasPropertyExplicitlySet("isKubernetesDashboardEnabled")) {
                this.isKubernetesDashboardEnabled(model.getIsKubernetesDashboardEnabled());
            }
            if (model.wasPropertyExplicitlySet("isTillerEnabled")) {
                this.isTillerEnabled(model.getIsTillerEnabled());
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

    /** Whether or not to enable the Kubernetes Dashboard add-on. */
    @com.fasterxml.jackson.annotation.JsonProperty("isKubernetesDashboardEnabled")
    private final Boolean isKubernetesDashboardEnabled;

    /**
     * Whether or not to enable the Kubernetes Dashboard add-on.
     *
     * @return the value
     */
    public Boolean getIsKubernetesDashboardEnabled() {
        return isKubernetesDashboardEnabled;
    }

    /** Whether or not to enable the Tiller add-on. */
    @com.fasterxml.jackson.annotation.JsonProperty("isTillerEnabled")
    private final Boolean isTillerEnabled;

    /**
     * Whether or not to enable the Tiller add-on.
     *
     * @return the value
     */
    public Boolean getIsTillerEnabled() {
        return isTillerEnabled;
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
        sb.append("AddOnOptions(");
        sb.append("super=").append(super.toString());
        sb.append("isKubernetesDashboardEnabled=")
                .append(String.valueOf(this.isKubernetesDashboardEnabled));
        sb.append(", isTillerEnabled=").append(String.valueOf(this.isTillerEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddOnOptions)) {
            return false;
        }

        AddOnOptions other = (AddOnOptions) o;
        return java.util.Objects.equals(
                        this.isKubernetesDashboardEnabled, other.isKubernetesDashboardEnabled)
                && java.util.Objects.equals(this.isTillerEnabled, other.isTillerEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isKubernetesDashboardEnabled == null
                                ? 43
                                : this.isKubernetesDashboardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isTillerEnabled == null ? 43 : this.isTillerEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
