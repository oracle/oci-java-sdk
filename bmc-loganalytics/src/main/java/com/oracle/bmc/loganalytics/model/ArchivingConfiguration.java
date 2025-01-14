/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the configuration for data archiving in object storage <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ArchivingConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ArchivingConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"activeStorageDuration", "archivalStorageDuration"})
    public ArchivingConfiguration(String activeStorageDuration, String archivalStorageDuration) {
        super();
        this.activeStorageDuration = activeStorageDuration;
        this.archivalStorageDuration = archivalStorageDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This is the duration data in active storage before data is archived, as described in
         * https://en.wikipedia.org/wiki/ISO_8601#Durations. The largest supported unit is D, e.g.
         * P365D (not P1Y) or P14D (not P2W).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("activeStorageDuration")
        private String activeStorageDuration;

        /**
         * This is the duration data in active storage before data is archived, as described in
         * https://en.wikipedia.org/wiki/ISO_8601#Durations. The largest supported unit is D, e.g.
         * P365D (not P1Y) or P14D (not P2W).
         *
         * @param activeStorageDuration the value to set
         * @return this builder
         */
        public Builder activeStorageDuration(String activeStorageDuration) {
            this.activeStorageDuration = activeStorageDuration;
            this.__explicitlySet__.add("activeStorageDuration");
            return this;
        }
        /**
         * This is the duration before archived data is deleted from object storage, as described in
         * https://en.wikipedia.org/wiki/ISO_8601#Durations The largest supported unit is D, e.g.
         * P365D (not P1Y) or P14D (not P2W).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("archivalStorageDuration")
        private String archivalStorageDuration;

        /**
         * This is the duration before archived data is deleted from object storage, as described in
         * https://en.wikipedia.org/wiki/ISO_8601#Durations The largest supported unit is D, e.g.
         * P365D (not P1Y) or P14D (not P2W).
         *
         * @param archivalStorageDuration the value to set
         * @return this builder
         */
        public Builder archivalStorageDuration(String archivalStorageDuration) {
            this.archivalStorageDuration = archivalStorageDuration;
            this.__explicitlySet__.add("archivalStorageDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ArchivingConfiguration build() {
            ArchivingConfiguration model =
                    new ArchivingConfiguration(
                            this.activeStorageDuration, this.archivalStorageDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ArchivingConfiguration model) {
            if (model.wasPropertyExplicitlySet("activeStorageDuration")) {
                this.activeStorageDuration(model.getActiveStorageDuration());
            }
            if (model.wasPropertyExplicitlySet("archivalStorageDuration")) {
                this.archivalStorageDuration(model.getArchivalStorageDuration());
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
     * This is the duration data in active storage before data is archived, as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations. The largest supported unit is D, e.g. P365D
     * (not P1Y) or P14D (not P2W).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activeStorageDuration")
    private final String activeStorageDuration;

    /**
     * This is the duration data in active storage before data is archived, as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations. The largest supported unit is D, e.g. P365D
     * (not P1Y) or P14D (not P2W).
     *
     * @return the value
     */
    public String getActiveStorageDuration() {
        return activeStorageDuration;
    }

    /**
     * This is the duration before archived data is deleted from object storage, as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations The largest supported unit is D, e.g. P365D
     * (not P1Y) or P14D (not P2W).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("archivalStorageDuration")
    private final String archivalStorageDuration;

    /**
     * This is the duration before archived data is deleted from object storage, as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations The largest supported unit is D, e.g. P365D
     * (not P1Y) or P14D (not P2W).
     *
     * @return the value
     */
    public String getArchivalStorageDuration() {
        return archivalStorageDuration;
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
        sb.append("ArchivingConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("activeStorageDuration=").append(String.valueOf(this.activeStorageDuration));
        sb.append(", archivalStorageDuration=")
                .append(String.valueOf(this.archivalStorageDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArchivingConfiguration)) {
            return false;
        }

        ArchivingConfiguration other = (ArchivingConfiguration) o;
        return java.util.Objects.equals(this.activeStorageDuration, other.activeStorageDuration)
                && java.util.Objects.equals(
                        this.archivalStorageDuration, other.archivalStorageDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.activeStorageDuration == null
                                ? 43
                                : this.activeStorageDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.archivalStorageDuration == null
                                ? 43
                                : this.archivalStorageDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
