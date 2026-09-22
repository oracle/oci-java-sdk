/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Describes where and how a model is deployed <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Availability.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Availability extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "realm",
        "region",
        "servingModes",
        "timeDeprecated",
        "timeOnDemandRetired",
        "timeDedicatedRetired",
        "supportedReplacements"
    })
    public Availability(
            String realm,
            String region,
            java.util.List<ServingMode> servingModes,
            java.util.Date timeDeprecated,
            java.util.Date timeOnDemandRetired,
            java.util.Date timeDedicatedRetired,
            java.util.List<String> supportedReplacements) {
        super();
        this.realm = realm;
        this.region = region;
        this.servingModes = servingModes;
        this.timeDeprecated = timeDeprecated;
        this.timeOnDemandRetired = timeOnDemandRetired;
        this.timeDedicatedRetired = timeDedicatedRetired;
        this.supportedReplacements = supportedReplacements;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The cloud realm in which the model exists. */
        @com.fasterxml.jackson.annotation.JsonProperty("realm")
        private String realm;

        /**
         * The cloud realm in which the model exists.
         *
         * @param realm the value to set
         * @return this builder
         */
        public Builder realm(String realm) {
            this.realm = realm;
            this.__explicitlySet__.add("realm");
            return this;
        }
        /** The specific geographic region where the model is deployed. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The specific geographic region where the model is deployed.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The supported deployment modes for the model in this region (e.g., on-demand or
         * dedicated).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("servingModes")
        private java.util.List<ServingMode> servingModes;

        /**
         * The supported deployment modes for the model in this region (e.g., on-demand or
         * dedicated).
         *
         * @param servingModes the value to set
         * @return this builder
         */
        public Builder servingModes(java.util.List<ServingMode> servingModes) {
            this.servingModes = servingModes;
            this.__explicitlySet__.add("servingModes");
            return this;
        }
        /**
         * The timestamp when the model is marked as deprecated and is no longer recommended for
         * use.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDeprecated")
        private java.util.Date timeDeprecated;

        /**
         * The timestamp when the model is marked as deprecated and is no longer recommended for
         * use.
         *
         * @param timeDeprecated the value to set
         * @return this builder
         */
        public Builder timeDeprecated(java.util.Date timeDeprecated) {
            this.timeDeprecated = timeDeprecated;
            this.__explicitlySet__.add("timeDeprecated");
            return this;
        }
        /**
         * The timestamp when the model will no longer be available for on-demand (shared) usage.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOnDemandRetired")
        private java.util.Date timeOnDemandRetired;

        /**
         * The timestamp when the model will no longer be available for on-demand (shared) usage.
         *
         * @param timeOnDemandRetired the value to set
         * @return this builder
         */
        public Builder timeOnDemandRetired(java.util.Date timeOnDemandRetired) {
            this.timeOnDemandRetired = timeOnDemandRetired;
            this.__explicitlySet__.add("timeOnDemandRetired");
            return this;
        }
        /** The timestamp when dedicated deployments of the model will be fully retired. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDedicatedRetired")
        private java.util.Date timeDedicatedRetired;

        /**
         * The timestamp when dedicated deployments of the model will be fully retired.
         *
         * @param timeDedicatedRetired the value to set
         * @return this builder
         */
        public Builder timeDedicatedRetired(java.util.Date timeDedicatedRetired) {
            this.timeDedicatedRetired = timeDedicatedRetired;
            this.__explicitlySet__.add("timeDedicatedRetired");
            return this;
        }
        /**
         * A list of model identifiers that are recommended as replacements after this model is
         * retired.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedReplacements")
        private java.util.List<String> supportedReplacements;

        /**
         * A list of model identifiers that are recommended as replacements after this model is
         * retired.
         *
         * @param supportedReplacements the value to set
         * @return this builder
         */
        public Builder supportedReplacements(java.util.List<String> supportedReplacements) {
            this.supportedReplacements = supportedReplacements;
            this.__explicitlySet__.add("supportedReplacements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Availability build() {
            Availability model =
                    new Availability(
                            this.realm,
                            this.region,
                            this.servingModes,
                            this.timeDeprecated,
                            this.timeOnDemandRetired,
                            this.timeDedicatedRetired,
                            this.supportedReplacements);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Availability model) {
            if (model.wasPropertyExplicitlySet("realm")) {
                this.realm(model.getRealm());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("servingModes")) {
                this.servingModes(model.getServingModes());
            }
            if (model.wasPropertyExplicitlySet("timeDeprecated")) {
                this.timeDeprecated(model.getTimeDeprecated());
            }
            if (model.wasPropertyExplicitlySet("timeOnDemandRetired")) {
                this.timeOnDemandRetired(model.getTimeOnDemandRetired());
            }
            if (model.wasPropertyExplicitlySet("timeDedicatedRetired")) {
                this.timeDedicatedRetired(model.getTimeDedicatedRetired());
            }
            if (model.wasPropertyExplicitlySet("supportedReplacements")) {
                this.supportedReplacements(model.getSupportedReplacements());
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

    /** The cloud realm in which the model exists. */
    @com.fasterxml.jackson.annotation.JsonProperty("realm")
    private final String realm;

    /**
     * The cloud realm in which the model exists.
     *
     * @return the value
     */
    public String getRealm() {
        return realm;
    }

    /** The specific geographic region where the model is deployed. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The specific geographic region where the model is deployed.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The supported deployment modes for the model in this region (e.g., on-demand or dedicated).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servingModes")
    private final java.util.List<ServingMode> servingModes;

    /**
     * The supported deployment modes for the model in this region (e.g., on-demand or dedicated).
     *
     * @return the value
     */
    public java.util.List<ServingMode> getServingModes() {
        return servingModes;
    }

    /**
     * The timestamp when the model is marked as deprecated and is no longer recommended for use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeprecated")
    private final java.util.Date timeDeprecated;

    /**
     * The timestamp when the model is marked as deprecated and is no longer recommended for use.
     *
     * @return the value
     */
    public java.util.Date getTimeDeprecated() {
        return timeDeprecated;
    }

    /** The timestamp when the model will no longer be available for on-demand (shared) usage. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOnDemandRetired")
    private final java.util.Date timeOnDemandRetired;

    /**
     * The timestamp when the model will no longer be available for on-demand (shared) usage.
     *
     * @return the value
     */
    public java.util.Date getTimeOnDemandRetired() {
        return timeOnDemandRetired;
    }

    /** The timestamp when dedicated deployments of the model will be fully retired. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDedicatedRetired")
    private final java.util.Date timeDedicatedRetired;

    /**
     * The timestamp when dedicated deployments of the model will be fully retired.
     *
     * @return the value
     */
    public java.util.Date getTimeDedicatedRetired() {
        return timeDedicatedRetired;
    }

    /**
     * A list of model identifiers that are recommended as replacements after this model is retired.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedReplacements")
    private final java.util.List<String> supportedReplacements;

    /**
     * A list of model identifiers that are recommended as replacements after this model is retired.
     *
     * @return the value
     */
    public java.util.List<String> getSupportedReplacements() {
        return supportedReplacements;
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
        sb.append("Availability(");
        sb.append("super=").append(super.toString());
        sb.append("realm=").append(String.valueOf(this.realm));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", servingModes=").append(String.valueOf(this.servingModes));
        sb.append(", timeDeprecated=").append(String.valueOf(this.timeDeprecated));
        sb.append(", timeOnDemandRetired=").append(String.valueOf(this.timeOnDemandRetired));
        sb.append(", timeDedicatedRetired=").append(String.valueOf(this.timeDedicatedRetired));
        sb.append(", supportedReplacements=").append(String.valueOf(this.supportedReplacements));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Availability)) {
            return false;
        }

        Availability other = (Availability) o;
        return java.util.Objects.equals(this.realm, other.realm)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.servingModes, other.servingModes)
                && java.util.Objects.equals(this.timeDeprecated, other.timeDeprecated)
                && java.util.Objects.equals(this.timeOnDemandRetired, other.timeOnDemandRetired)
                && java.util.Objects.equals(this.timeDedicatedRetired, other.timeDedicatedRetired)
                && java.util.Objects.equals(this.supportedReplacements, other.supportedReplacements)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.realm == null ? 43 : this.realm.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.servingModes == null ? 43 : this.servingModes.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDeprecated == null ? 43 : this.timeDeprecated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOnDemandRetired == null
                                ? 43
                                : this.timeOnDemandRetired.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDedicatedRetired == null
                                ? 43
                                : this.timeDedicatedRetired.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedReplacements == null
                                ? 43
                                : this.supportedReplacements.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
