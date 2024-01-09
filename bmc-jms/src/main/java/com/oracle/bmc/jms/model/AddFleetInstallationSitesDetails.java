/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The list of Java installation sites to add. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddFleetInstallationSitesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddFleetInstallationSitesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"installationSites", "postInstallationActions"})
    public AddFleetInstallationSitesDetails(
            java.util.List<NewInstallationSite> installationSites,
            java.util.List<PostInstallationActions> postInstallationActions) {
        super();
        this.installationSites = installationSites;
        this.postInstallationActions = postInstallationActions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of installation sites to add. */
        @com.fasterxml.jackson.annotation.JsonProperty("installationSites")
        private java.util.List<NewInstallationSite> installationSites;

        /**
         * The list of installation sites to add.
         *
         * @param installationSites the value to set
         * @return this builder
         */
        public Builder installationSites(java.util.List<NewInstallationSite> installationSites) {
            this.installationSites = installationSites;
            this.__explicitlySet__.add("installationSites");
            return this;
        }
        /** Optional list of post java installation actions */
        @com.fasterxml.jackson.annotation.JsonProperty("postInstallationActions")
        private java.util.List<PostInstallationActions> postInstallationActions;

        /**
         * Optional list of post java installation actions
         *
         * @param postInstallationActions the value to set
         * @return this builder
         */
        public Builder postInstallationActions(
                java.util.List<PostInstallationActions> postInstallationActions) {
            this.postInstallationActions = postInstallationActions;
            this.__explicitlySet__.add("postInstallationActions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddFleetInstallationSitesDetails build() {
            AddFleetInstallationSitesDetails model =
                    new AddFleetInstallationSitesDetails(
                            this.installationSites, this.postInstallationActions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddFleetInstallationSitesDetails model) {
            if (model.wasPropertyExplicitlySet("installationSites")) {
                this.installationSites(model.getInstallationSites());
            }
            if (model.wasPropertyExplicitlySet("postInstallationActions")) {
                this.postInstallationActions(model.getPostInstallationActions());
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

    /** The list of installation sites to add. */
    @com.fasterxml.jackson.annotation.JsonProperty("installationSites")
    private final java.util.List<NewInstallationSite> installationSites;

    /**
     * The list of installation sites to add.
     *
     * @return the value
     */
    public java.util.List<NewInstallationSite> getInstallationSites() {
        return installationSites;
    }

    /** Optional list of post java installation actions */
    @com.fasterxml.jackson.annotation.JsonProperty("postInstallationActions")
    private final java.util.List<PostInstallationActions> postInstallationActions;

    /**
     * Optional list of post java installation actions
     *
     * @return the value
     */
    public java.util.List<PostInstallationActions> getPostInstallationActions() {
        return postInstallationActions;
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
        sb.append("AddFleetInstallationSitesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("installationSites=").append(String.valueOf(this.installationSites));
        sb.append(", postInstallationActions=")
                .append(String.valueOf(this.postInstallationActions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddFleetInstallationSitesDetails)) {
            return false;
        }

        AddFleetInstallationSitesDetails other = (AddFleetInstallationSitesDetails) o;
        return java.util.Objects.equals(this.installationSites, other.installationSites)
                && java.util.Objects.equals(
                        this.postInstallationActions, other.postInstallationActions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.installationSites == null ? 43 : this.installationSites.hashCode());
        result =
                (result * PRIME)
                        + (this.postInstallationActions == null
                                ? 43
                                : this.postInstallationActions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
