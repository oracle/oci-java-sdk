/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Request for updating an existing application in context to the network firewall policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateApplicationGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateApplicationGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"apps"})
    public UpdateApplicationGroupDetails(java.util.List<String> apps) {
        super();
        this.apps = apps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Collection of application names. */
        @com.fasterxml.jackson.annotation.JsonProperty("apps")
        private java.util.List<String> apps;

        /**
         * Collection of application names.
         *
         * @param apps the value to set
         * @return this builder
         */
        public Builder apps(java.util.List<String> apps) {
            this.apps = apps;
            this.__explicitlySet__.add("apps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateApplicationGroupDetails build() {
            UpdateApplicationGroupDetails model = new UpdateApplicationGroupDetails(this.apps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateApplicationGroupDetails model) {
            if (model.wasPropertyExplicitlySet("apps")) {
                this.apps(model.getApps());
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

    /** Collection of application names. */
    @com.fasterxml.jackson.annotation.JsonProperty("apps")
    private final java.util.List<String> apps;

    /**
     * Collection of application names.
     *
     * @return the value
     */
    public java.util.List<String> getApps() {
        return apps;
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
        sb.append("UpdateApplicationGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("apps=").append(String.valueOf(this.apps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateApplicationGroupDetails)) {
            return false;
        }

        UpdateApplicationGroupDetails other = (UpdateApplicationGroupDetails) o;
        return java.util.Objects.equals(this.apps, other.apps) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.apps == null ? 43 : this.apps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
