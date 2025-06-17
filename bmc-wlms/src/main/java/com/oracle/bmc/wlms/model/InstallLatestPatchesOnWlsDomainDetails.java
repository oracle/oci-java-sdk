/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The configuration details for the install latest patches to WebLogic domain operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstallLatestPatchesOnWlsDomainDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstallLatestPatchesOnWlsDomainDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isForceServersShutdown",
        "mustIncludeDomainsSharingMiddleware"
    })
    public InstallLatestPatchesOnWlsDomainDetails(
            Boolean isForceServersShutdown, Boolean mustIncludeDomainsSharingMiddleware) {
        super();
        this.isForceServersShutdown = isForceServersShutdown;
        this.mustIncludeDomainsSharingMiddleware = mustIncludeDomainsSharingMiddleware;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * When installing or uninstalling patches, forces shutdown of the servers if they have not
         * shutdown after a period of time. The timeout can be configured in the WebLogic domain
         * configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isForceServersShutdown")
        private Boolean isForceServersShutdown;

        /**
         * When installing or uninstalling patches, forces shutdown of the servers if they have not
         * shutdown after a period of time. The timeout can be configured in the WebLogic domain
         * configuration.
         *
         * @param isForceServersShutdown the value to set
         * @return this builder
         */
        public Builder isForceServersShutdown(Boolean isForceServersShutdown) {
            this.isForceServersShutdown = isForceServersShutdown;
            this.__explicitlySet__.add("isForceServersShutdown");
            return this;
        }
        /**
         * When installing or uninstalling patches, allows the operation to proceed on all domains
         * that share the same middleware. If not set to true, the installation or uninstallation
         * will fail if there is any other domain using the same middleware.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mustIncludeDomainsSharingMiddleware")
        private Boolean mustIncludeDomainsSharingMiddleware;

        /**
         * When installing or uninstalling patches, allows the operation to proceed on all domains
         * that share the same middleware. If not set to true, the installation or uninstallation
         * will fail if there is any other domain using the same middleware.
         *
         * @param mustIncludeDomainsSharingMiddleware the value to set
         * @return this builder
         */
        public Builder mustIncludeDomainsSharingMiddleware(
                Boolean mustIncludeDomainsSharingMiddleware) {
            this.mustIncludeDomainsSharingMiddleware = mustIncludeDomainsSharingMiddleware;
            this.__explicitlySet__.add("mustIncludeDomainsSharingMiddleware");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstallLatestPatchesOnWlsDomainDetails build() {
            InstallLatestPatchesOnWlsDomainDetails model =
                    new InstallLatestPatchesOnWlsDomainDetails(
                            this.isForceServersShutdown, this.mustIncludeDomainsSharingMiddleware);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallLatestPatchesOnWlsDomainDetails model) {
            if (model.wasPropertyExplicitlySet("isForceServersShutdown")) {
                this.isForceServersShutdown(model.getIsForceServersShutdown());
            }
            if (model.wasPropertyExplicitlySet("mustIncludeDomainsSharingMiddleware")) {
                this.mustIncludeDomainsSharingMiddleware(
                        model.getMustIncludeDomainsSharingMiddleware());
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

    /**
     * When installing or uninstalling patches, forces shutdown of the servers if they have not
     * shutdown after a period of time. The timeout can be configured in the WebLogic domain
     * configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isForceServersShutdown")
    private final Boolean isForceServersShutdown;

    /**
     * When installing or uninstalling patches, forces shutdown of the servers if they have not
     * shutdown after a period of time. The timeout can be configured in the WebLogic domain
     * configuration.
     *
     * @return the value
     */
    public Boolean getIsForceServersShutdown() {
        return isForceServersShutdown;
    }

    /**
     * When installing or uninstalling patches, allows the operation to proceed on all domains that
     * share the same middleware. If not set to true, the installation or uninstallation will fail
     * if there is any other domain using the same middleware.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mustIncludeDomainsSharingMiddleware")
    private final Boolean mustIncludeDomainsSharingMiddleware;

    /**
     * When installing or uninstalling patches, allows the operation to proceed on all domains that
     * share the same middleware. If not set to true, the installation or uninstallation will fail
     * if there is any other domain using the same middleware.
     *
     * @return the value
     */
    public Boolean getMustIncludeDomainsSharingMiddleware() {
        return mustIncludeDomainsSharingMiddleware;
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
        sb.append("InstallLatestPatchesOnWlsDomainDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isForceServersShutdown=").append(String.valueOf(this.isForceServersShutdown));
        sb.append(", mustIncludeDomainsSharingMiddleware=")
                .append(String.valueOf(this.mustIncludeDomainsSharingMiddleware));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstallLatestPatchesOnWlsDomainDetails)) {
            return false;
        }

        InstallLatestPatchesOnWlsDomainDetails other = (InstallLatestPatchesOnWlsDomainDetails) o;
        return java.util.Objects.equals(this.isForceServersShutdown, other.isForceServersShutdown)
                && java.util.Objects.equals(
                        this.mustIncludeDomainsSharingMiddleware,
                        other.mustIncludeDomainsSharingMiddleware)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isForceServersShutdown == null
                                ? 43
                                : this.isForceServersShutdown.hashCode());
        result =
                (result * PRIME)
                        + (this.mustIncludeDomainsSharingMiddleware == null
                                ? 43
                                : this.mustIncludeDomainsSharingMiddleware.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
