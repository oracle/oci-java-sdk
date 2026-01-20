/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Indicates whether the wallet exists in the deployment container <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeploymentWalletExistsResponseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeploymentWalletExistsResponseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isOggWalletExists"})
    public DeploymentWalletExistsResponseDetails(Boolean isOggWalletExists) {
        super();
        this.isOggWalletExists = isOggWalletExists;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates if the wallet is present in the deployment container */
        @com.fasterxml.jackson.annotation.JsonProperty("isOggWalletExists")
        private Boolean isOggWalletExists;

        /**
         * Indicates if the wallet is present in the deployment container
         *
         * @param isOggWalletExists the value to set
         * @return this builder
         */
        public Builder isOggWalletExists(Boolean isOggWalletExists) {
            this.isOggWalletExists = isOggWalletExists;
            this.__explicitlySet__.add("isOggWalletExists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeploymentWalletExistsResponseDetails build() {
            DeploymentWalletExistsResponseDetails model =
                    new DeploymentWalletExistsResponseDetails(this.isOggWalletExists);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentWalletExistsResponseDetails model) {
            if (model.wasPropertyExplicitlySet("isOggWalletExists")) {
                this.isOggWalletExists(model.getIsOggWalletExists());
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

    /** Indicates if the wallet is present in the deployment container */
    @com.fasterxml.jackson.annotation.JsonProperty("isOggWalletExists")
    private final Boolean isOggWalletExists;

    /**
     * Indicates if the wallet is present in the deployment container
     *
     * @return the value
     */
    public Boolean getIsOggWalletExists() {
        return isOggWalletExists;
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
        sb.append("DeploymentWalletExistsResponseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isOggWalletExists=").append(String.valueOf(this.isOggWalletExists));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentWalletExistsResponseDetails)) {
            return false;
        }

        DeploymentWalletExistsResponseDetails other = (DeploymentWalletExistsResponseDetails) o;
        return java.util.Objects.equals(this.isOggWalletExists, other.isOggWalletExists)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isOggWalletExists == null ? 43 : this.isOggWalletExists.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
