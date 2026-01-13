/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a work request resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AddonVersions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddonVersions extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "versionNumber",
        "description",
        "kubernetesVersionFilters",
        "configurations"
    })
    public AddonVersions(
            Status status,
            String versionNumber,
            String description,
            KubernetesVersionsFilters kubernetesVersionFilters,
            java.util.List<AddonVersionConfiguration> configurations) {
        super();
        this.status = status;
        this.versionNumber = versionNumber;
        this.description = description;
        this.kubernetesVersionFilters = kubernetesVersionFilters;
        this.configurations = configurations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Current state of the addon, only active will be visible to customer, visibility of
         * versions in other status will be filtered based on limits property.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Current state of the addon, only active will be visible to customer, visibility of
         * versions in other status will be filtered based on limits property.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Version number, need be comparable within an addon. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private String versionNumber;

        /**
         * Version number, need be comparable within an addon.
         *
         * @param versionNumber the value to set
         * @return this builder
         */
        public Builder versionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }
        /** Information about the addon version. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Information about the addon version.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The range of kubernetes versions an addon can be configured. */
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersionFilters")
        private KubernetesVersionsFilters kubernetesVersionFilters;

        /**
         * The range of kubernetes versions an addon can be configured.
         *
         * @param kubernetesVersionFilters the value to set
         * @return this builder
         */
        public Builder kubernetesVersionFilters(
                KubernetesVersionsFilters kubernetesVersionFilters) {
            this.kubernetesVersionFilters = kubernetesVersionFilters;
            this.__explicitlySet__.add("kubernetesVersionFilters");
            return this;
        }
        /** Addon version configuration details. */
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<AddonVersionConfiguration> configurations;

        /**
         * Addon version configuration details.
         *
         * @param configurations the value to set
         * @return this builder
         */
        public Builder configurations(java.util.List<AddonVersionConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddonVersions build() {
            AddonVersions model =
                    new AddonVersions(
                            this.status,
                            this.versionNumber,
                            this.description,
                            this.kubernetesVersionFilters,
                            this.configurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddonVersions model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("versionNumber")) {
                this.versionNumber(model.getVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("kubernetesVersionFilters")) {
                this.kubernetesVersionFilters(model.getKubernetesVersionFilters());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
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
     * Current state of the addon, only active will be visible to customer, visibility of versions
     * in other status will be filtered based on limits property.
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Deprecated("DEPRECATED"),
        Preview("PREVIEW"),
        Recalled("RECALLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Current state of the addon, only active will be visible to customer, visibility of versions
     * in other status will be filtered based on limits property.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Current state of the addon, only active will be visible to customer, visibility of versions
     * in other status will be filtered based on limits property.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Version number, need be comparable within an addon. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    private final String versionNumber;

    /**
     * Version number, need be comparable within an addon.
     *
     * @return the value
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /** Information about the addon version. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Information about the addon version.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The range of kubernetes versions an addon can be configured. */
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersionFilters")
    private final KubernetesVersionsFilters kubernetesVersionFilters;

    /**
     * The range of kubernetes versions an addon can be configured.
     *
     * @return the value
     */
    public KubernetesVersionsFilters getKubernetesVersionFilters() {
        return kubernetesVersionFilters;
    }

    /** Addon version configuration details. */
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<AddonVersionConfiguration> configurations;

    /**
     * Addon version configuration details.
     *
     * @return the value
     */
    public java.util.List<AddonVersionConfiguration> getConfigurations() {
        return configurations;
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
        sb.append("AddonVersions(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", kubernetesVersionFilters=")
                .append(String.valueOf(this.kubernetesVersionFilters));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddonVersions)) {
            return false;
        }

        AddonVersions other = (AddonVersions) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.kubernetesVersionFilters, other.kubernetesVersionFilters)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.kubernetesVersionFilters == null
                                ? 43
                                : this.kubernetesVersionFilters.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
