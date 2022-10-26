/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The information required to disable log source auto-association. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DisableAutoAssociationDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DisableAutoAssociationDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"deleteExistingAssociations"})
    public DisableAutoAssociationDetail(Boolean deleteExistingAssociations) {
        super();
        this.deleteExistingAssociations = deleteExistingAssociations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A flag indicating whether or not to delete all the existing associations of the log
         * source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deleteExistingAssociations")
        private Boolean deleteExistingAssociations;

        /**
         * A flag indicating whether or not to delete all the existing associations of the log
         * source.
         *
         * @param deleteExistingAssociations the value to set
         * @return this builder
         */
        public Builder deleteExistingAssociations(Boolean deleteExistingAssociations) {
            this.deleteExistingAssociations = deleteExistingAssociations;
            this.__explicitlySet__.add("deleteExistingAssociations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DisableAutoAssociationDetail build() {
            DisableAutoAssociationDetail model =
                    new DisableAutoAssociationDetail(this.deleteExistingAssociations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DisableAutoAssociationDetail model) {
            if (model.wasPropertyExplicitlySet("deleteExistingAssociations")) {
                this.deleteExistingAssociations(model.getDeleteExistingAssociations());
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
     * A flag indicating whether or not to delete all the existing associations of the log source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deleteExistingAssociations")
    private final Boolean deleteExistingAssociations;

    /**
     * A flag indicating whether or not to delete all the existing associations of the log source.
     *
     * @return the value
     */
    public Boolean getDeleteExistingAssociations() {
        return deleteExistingAssociations;
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
        sb.append("DisableAutoAssociationDetail(");
        sb.append("super=").append(super.toString());
        sb.append("deleteExistingAssociations=")
                .append(String.valueOf(this.deleteExistingAssociations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DisableAutoAssociationDetail)) {
            return false;
        }

        DisableAutoAssociationDetail other = (DisableAutoAssociationDetail) o;
        return java.util.Objects.equals(
                        this.deleteExistingAssociations, other.deleteExistingAssociations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deleteExistingAssociations == null
                                ? 43
                                : this.deleteExistingAssociations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
