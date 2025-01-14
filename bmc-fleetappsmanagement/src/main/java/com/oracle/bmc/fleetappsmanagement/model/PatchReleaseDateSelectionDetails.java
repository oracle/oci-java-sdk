/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Days since patch release date details. If you set the policy rule by selecting this option and
 * entering the number of days since release, Fleet Application Management calculates the number of
 * days passed after the release date and reports the product as noncompliant if the days exceed the
 * number provided in Days since release <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PatchReleaseDateSelectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "selectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchReleaseDateSelectionDetails extends PatchSelectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Days passed since patch release. */
        @com.fasterxml.jackson.annotation.JsonProperty("daysSinceRelease")
        private Integer daysSinceRelease;

        /**
         * Days passed since patch release.
         *
         * @param daysSinceRelease the value to set
         * @return this builder
         */
        public Builder daysSinceRelease(Integer daysSinceRelease) {
            this.daysSinceRelease = daysSinceRelease;
            this.__explicitlySet__.add("daysSinceRelease");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchReleaseDateSelectionDetails build() {
            PatchReleaseDateSelectionDetails model =
                    new PatchReleaseDateSelectionDetails(this.daysSinceRelease);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchReleaseDateSelectionDetails model) {
            if (model.wasPropertyExplicitlySet("daysSinceRelease")) {
                this.daysSinceRelease(model.getDaysSinceRelease());
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
    public PatchReleaseDateSelectionDetails(Integer daysSinceRelease) {
        super();
        this.daysSinceRelease = daysSinceRelease;
    }

    /** Days passed since patch release. */
    @com.fasterxml.jackson.annotation.JsonProperty("daysSinceRelease")
    private final Integer daysSinceRelease;

    /**
     * Days passed since patch release.
     *
     * @return the value
     */
    public Integer getDaysSinceRelease() {
        return daysSinceRelease;
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
        sb.append("PatchReleaseDateSelectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", daysSinceRelease=").append(String.valueOf(this.daysSinceRelease));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchReleaseDateSelectionDetails)) {
            return false;
        }

        PatchReleaseDateSelectionDetails other = (PatchReleaseDateSelectionDetails) o;
        return java.util.Objects.equals(this.daysSinceRelease, other.daysSinceRelease)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.daysSinceRelease == null ? 43 : this.daysSinceRelease.hashCode());
        return result;
    }
}
