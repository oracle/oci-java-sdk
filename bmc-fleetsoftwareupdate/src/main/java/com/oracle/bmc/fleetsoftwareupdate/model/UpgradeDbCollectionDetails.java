/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details of supported upgrade options for DB collection. <br>
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
        builder = UpgradeDbCollectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "collectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpgradeDbCollectionDetails extends UpgradeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Enables or disables time zone upgrade. */
        @com.fasterxml.jackson.annotation.JsonProperty("isTimeZoneUpgrade")
        private Boolean isTimeZoneUpgrade;

        /**
         * Enables or disables time zone upgrade.
         *
         * @param isTimeZoneUpgrade the value to set
         * @return this builder
         */
        public Builder isTimeZoneUpgrade(Boolean isTimeZoneUpgrade) {
            this.isTimeZoneUpgrade = isTimeZoneUpgrade;
            this.__explicitlySet__.add("isTimeZoneUpgrade");
            return this;
        }
        /** Enables or disables the recompilation of invalid objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRecompileInvalidObjects")
        private Boolean isRecompileInvalidObjects;

        /**
         * Enables or disables the recompilation of invalid objects.
         *
         * @param isRecompileInvalidObjects the value to set
         * @return this builder
         */
        public Builder isRecompileInvalidObjects(Boolean isRecompileInvalidObjects) {
            this.isRecompileInvalidObjects = isRecompileInvalidObjects;
            this.__explicitlySet__.add("isRecompileInvalidObjects");
            return this;
        }
        /** Service drain timeout specified in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxDrainTimeoutInSeconds")
        private Integer maxDrainTimeoutInSeconds;

        /**
         * Service drain timeout specified in seconds.
         *
         * @param maxDrainTimeoutInSeconds the value to set
         * @return this builder
         */
        public Builder maxDrainTimeoutInSeconds(Integer maxDrainTimeoutInSeconds) {
            this.maxDrainTimeoutInSeconds = maxDrainTimeoutInSeconds;
            this.__explicitlySet__.add("maxDrainTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeDbCollectionDetails build() {
            UpgradeDbCollectionDetails model =
                    new UpgradeDbCollectionDetails(
                            this.isTimeZoneUpgrade,
                            this.isRecompileInvalidObjects,
                            this.maxDrainTimeoutInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeDbCollectionDetails model) {
            if (model.wasPropertyExplicitlySet("isTimeZoneUpgrade")) {
                this.isTimeZoneUpgrade(model.getIsTimeZoneUpgrade());
            }
            if (model.wasPropertyExplicitlySet("isRecompileInvalidObjects")) {
                this.isRecompileInvalidObjects(model.getIsRecompileInvalidObjects());
            }
            if (model.wasPropertyExplicitlySet("maxDrainTimeoutInSeconds")) {
                this.maxDrainTimeoutInSeconds(model.getMaxDrainTimeoutInSeconds());
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
    public UpgradeDbCollectionDetails(
            Boolean isTimeZoneUpgrade,
            Boolean isRecompileInvalidObjects,
            Integer maxDrainTimeoutInSeconds) {
        super();
        this.isTimeZoneUpgrade = isTimeZoneUpgrade;
        this.isRecompileInvalidObjects = isRecompileInvalidObjects;
        this.maxDrainTimeoutInSeconds = maxDrainTimeoutInSeconds;
    }

    /** Enables or disables time zone upgrade. */
    @com.fasterxml.jackson.annotation.JsonProperty("isTimeZoneUpgrade")
    private final Boolean isTimeZoneUpgrade;

    /**
     * Enables or disables time zone upgrade.
     *
     * @return the value
     */
    public Boolean getIsTimeZoneUpgrade() {
        return isTimeZoneUpgrade;
    }

    /** Enables or disables the recompilation of invalid objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRecompileInvalidObjects")
    private final Boolean isRecompileInvalidObjects;

    /**
     * Enables or disables the recompilation of invalid objects.
     *
     * @return the value
     */
    public Boolean getIsRecompileInvalidObjects() {
        return isRecompileInvalidObjects;
    }

    /** Service drain timeout specified in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxDrainTimeoutInSeconds")
    private final Integer maxDrainTimeoutInSeconds;

    /**
     * Service drain timeout specified in seconds.
     *
     * @return the value
     */
    public Integer getMaxDrainTimeoutInSeconds() {
        return maxDrainTimeoutInSeconds;
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
        sb.append("UpgradeDbCollectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isTimeZoneUpgrade=").append(String.valueOf(this.isTimeZoneUpgrade));
        sb.append(", isRecompileInvalidObjects=")
                .append(String.valueOf(this.isRecompileInvalidObjects));
        sb.append(", maxDrainTimeoutInSeconds=")
                .append(String.valueOf(this.maxDrainTimeoutInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpgradeDbCollectionDetails)) {
            return false;
        }

        UpgradeDbCollectionDetails other = (UpgradeDbCollectionDetails) o;
        return java.util.Objects.equals(this.isTimeZoneUpgrade, other.isTimeZoneUpgrade)
                && java.util.Objects.equals(
                        this.isRecompileInvalidObjects, other.isRecompileInvalidObjects)
                && java.util.Objects.equals(
                        this.maxDrainTimeoutInSeconds, other.maxDrainTimeoutInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isTimeZoneUpgrade == null ? 43 : this.isTimeZoneUpgrade.hashCode());
        result =
                (result * PRIME)
                        + (this.isRecompileInvalidObjects == null
                                ? 43
                                : this.isRecompileInvalidObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDrainTimeoutInSeconds == null
                                ? 43
                                : this.maxDrainTimeoutInSeconds.hashCode());
        return result;
    }
}
