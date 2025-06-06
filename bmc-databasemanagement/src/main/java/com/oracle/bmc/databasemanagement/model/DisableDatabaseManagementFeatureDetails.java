/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to disable Database Management features for an Oracle cloud database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DisableDatabaseManagementFeatureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DisableDatabaseManagementFeatureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"feature", "canDisableAllPdbs"})
    public DisableDatabaseManagementFeatureDetails(
            DbManagementFeature feature, Boolean canDisableAllPdbs) {
        super();
        this.feature = feature;
        this.canDisableAllPdbs = canDisableAllPdbs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the Database Management feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("feature")
        private DbManagementFeature feature;

        /**
         * The name of the Database Management feature.
         *
         * @param feature the value to set
         * @return this builder
         */
        public Builder feature(DbManagementFeature feature) {
            this.feature = feature;
            this.__explicitlySet__.add("feature");
            return this;
        }
        /**
         * Indicates whether Diagnostics & Management should be disabled for the pluggable databases
         * before disabling it for the container database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canDisableAllPdbs")
        private Boolean canDisableAllPdbs;

        /**
         * Indicates whether Diagnostics & Management should be disabled for the pluggable databases
         * before disabling it for the container database.
         *
         * @param canDisableAllPdbs the value to set
         * @return this builder
         */
        public Builder canDisableAllPdbs(Boolean canDisableAllPdbs) {
            this.canDisableAllPdbs = canDisableAllPdbs;
            this.__explicitlySet__.add("canDisableAllPdbs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DisableDatabaseManagementFeatureDetails build() {
            DisableDatabaseManagementFeatureDetails model =
                    new DisableDatabaseManagementFeatureDetails(
                            this.feature, this.canDisableAllPdbs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DisableDatabaseManagementFeatureDetails model) {
            if (model.wasPropertyExplicitlySet("feature")) {
                this.feature(model.getFeature());
            }
            if (model.wasPropertyExplicitlySet("canDisableAllPdbs")) {
                this.canDisableAllPdbs(model.getCanDisableAllPdbs());
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

    /** The name of the Database Management feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("feature")
    private final DbManagementFeature feature;

    /**
     * The name of the Database Management feature.
     *
     * @return the value
     */
    public DbManagementFeature getFeature() {
        return feature;
    }

    /**
     * Indicates whether Diagnostics & Management should be disabled for the pluggable databases
     * before disabling it for the container database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canDisableAllPdbs")
    private final Boolean canDisableAllPdbs;

    /**
     * Indicates whether Diagnostics & Management should be disabled for the pluggable databases
     * before disabling it for the container database.
     *
     * @return the value
     */
    public Boolean getCanDisableAllPdbs() {
        return canDisableAllPdbs;
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
        sb.append("DisableDatabaseManagementFeatureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("feature=").append(String.valueOf(this.feature));
        sb.append(", canDisableAllPdbs=").append(String.valueOf(this.canDisableAllPdbs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DisableDatabaseManagementFeatureDetails)) {
            return false;
        }

        DisableDatabaseManagementFeatureDetails other = (DisableDatabaseManagementFeatureDetails) o;
        return java.util.Objects.equals(this.feature, other.feature)
                && java.util.Objects.equals(this.canDisableAllPdbs, other.canDisableAllPdbs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.feature == null ? 43 : this.feature.hashCode());
        result =
                (result * PRIME)
                        + (this.canDisableAllPdbs == null ? 43 : this.canDisableAllPdbs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
