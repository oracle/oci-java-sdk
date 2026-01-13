/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details of supported upgrade options for GI collection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpgradeGiCollectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "collectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpgradeGiCollectionDetails extends UpgradeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Ignore the Cluster Verification Utility (CVU) prerequisite checks. */
        @com.fasterxml.jackson.annotation.JsonProperty("isIgnorePrerequisites")
        private Boolean isIgnorePrerequisites;

        /**
         * Ignore the Cluster Verification Utility (CVU) prerequisite checks.
         *
         * @param isIgnorePrerequisites the value to set
         * @return this builder
         */
        public Builder isIgnorePrerequisites(Boolean isIgnorePrerequisites) {
            this.isIgnorePrerequisites = isIgnorePrerequisites;
            this.__explicitlySet__.add("isIgnorePrerequisites");
            return this;
        }
        /**
         * Ignore errors during post Oracle Grid Infrastructure upgrade Cluster Verification Utility
         * (CVU) check.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIgnorePostUpgradeErrors")
        private Boolean isIgnorePostUpgradeErrors;

        /**
         * Ignore errors during post Oracle Grid Infrastructure upgrade Cluster Verification Utility
         * (CVU) check.
         *
         * @param isIgnorePostUpgradeErrors the value to set
         * @return this builder
         */
        public Builder isIgnorePostUpgradeErrors(Boolean isIgnorePostUpgradeErrors) {
            this.isIgnorePostUpgradeErrors = isIgnorePostUpgradeErrors;
            this.__explicitlySet__.add("isIgnorePostUpgradeErrors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeGiCollectionDetails build() {
            UpgradeGiCollectionDetails model =
                    new UpgradeGiCollectionDetails(
                            this.isIgnorePrerequisites, this.isIgnorePostUpgradeErrors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeGiCollectionDetails model) {
            if (model.wasPropertyExplicitlySet("isIgnorePrerequisites")) {
                this.isIgnorePrerequisites(model.getIsIgnorePrerequisites());
            }
            if (model.wasPropertyExplicitlySet("isIgnorePostUpgradeErrors")) {
                this.isIgnorePostUpgradeErrors(model.getIsIgnorePostUpgradeErrors());
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

    @Deprecated
    public UpgradeGiCollectionDetails(
            Boolean isIgnorePrerequisites, Boolean isIgnorePostUpgradeErrors) {
        super();
        this.isIgnorePrerequisites = isIgnorePrerequisites;
        this.isIgnorePostUpgradeErrors = isIgnorePostUpgradeErrors;
    }

    /** Ignore the Cluster Verification Utility (CVU) prerequisite checks. */
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnorePrerequisites")
    private final Boolean isIgnorePrerequisites;

    /**
     * Ignore the Cluster Verification Utility (CVU) prerequisite checks.
     *
     * @return the value
     */
    public Boolean getIsIgnorePrerequisites() {
        return isIgnorePrerequisites;
    }

    /**
     * Ignore errors during post Oracle Grid Infrastructure upgrade Cluster Verification Utility
     * (CVU) check.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnorePostUpgradeErrors")
    private final Boolean isIgnorePostUpgradeErrors;

    /**
     * Ignore errors during post Oracle Grid Infrastructure upgrade Cluster Verification Utility
     * (CVU) check.
     *
     * @return the value
     */
    public Boolean getIsIgnorePostUpgradeErrors() {
        return isIgnorePostUpgradeErrors;
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
        sb.append("UpgradeGiCollectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isIgnorePrerequisites=").append(String.valueOf(this.isIgnorePrerequisites));
        sb.append(", isIgnorePostUpgradeErrors=")
                .append(String.valueOf(this.isIgnorePostUpgradeErrors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpgradeGiCollectionDetails)) {
            return false;
        }

        UpgradeGiCollectionDetails other = (UpgradeGiCollectionDetails) o;
        return java.util.Objects.equals(this.isIgnorePrerequisites, other.isIgnorePrerequisites)
                && java.util.Objects.equals(
                        this.isIgnorePostUpgradeErrors, other.isIgnorePostUpgradeErrors)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isIgnorePrerequisites == null
                                ? 43
                                : this.isIgnorePrerequisites.hashCode());
        result =
                (result * PRIME)
                        + (this.isIgnorePostUpgradeErrors == null
                                ? 43
                                : this.isIgnorePostUpgradeErrors.hashCode());
        return result;
    }
}
