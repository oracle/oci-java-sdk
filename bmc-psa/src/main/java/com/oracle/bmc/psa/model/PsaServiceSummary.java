/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psa.model;

/**
 * An OCI service summary, that will be used as a catalog for Private Service Access. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PsaServiceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PsaServiceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "displayName", "description", "fqdns", "isV6Enabled"})
    public PsaServiceSummary(
            String id,
            String displayName,
            String description,
            java.util.List<String> fqdns,
            Boolean isV6Enabled) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.fqdns = fqdns;
        this.isV6Enabled = isV6Enabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique OCI service identifier.
         *
         * <p>Example: {@code object-storage-api}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique OCI service identifier.
         *
         * <p>Example: {@code object-storage-api}
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A description of the OCI service. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the OCI service.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The public facing service FQDNs, which are going to be used to access the service.
         *
         * <p>Example: {@code xyz.oraclecloud.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fqdns")
        private java.util.List<String> fqdns;

        /**
         * The public facing service FQDNs, which are going to be used to access the service.
         *
         * <p>Example: {@code xyz.oraclecloud.com}
         *
         * @param fqdns the value to set
         * @return this builder
         */
        public Builder fqdns(java.util.List<String> fqdns) {
            this.fqdns = fqdns;
            this.__explicitlySet__.add("fqdns");
            return this;
        }
        /** This optional field will indicate that whether service is IPv6 enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isV6Enabled")
        private Boolean isV6Enabled;

        /**
         * This optional field will indicate that whether service is IPv6 enabled.
         *
         * @param isV6Enabled the value to set
         * @return this builder
         */
        public Builder isV6Enabled(Boolean isV6Enabled) {
            this.isV6Enabled = isV6Enabled;
            this.__explicitlySet__.add("isV6Enabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PsaServiceSummary build() {
            PsaServiceSummary model =
                    new PsaServiceSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.fqdns,
                            this.isV6Enabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PsaServiceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("fqdns")) {
                this.fqdns(model.getFqdns());
            }
            if (model.wasPropertyExplicitlySet("isV6Enabled")) {
                this.isV6Enabled(model.getIsV6Enabled());
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
     * A unique OCI service identifier.
     *
     * <p>Example: {@code object-storage-api}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique OCI service identifier.
     *
     * <p>Example: {@code object-storage-api}
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A description of the OCI service. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the OCI service.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The public facing service FQDNs, which are going to be used to access the service.
     *
     * <p>Example: {@code xyz.oraclecloud.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fqdns")
    private final java.util.List<String> fqdns;

    /**
     * The public facing service FQDNs, which are going to be used to access the service.
     *
     * <p>Example: {@code xyz.oraclecloud.com}
     *
     * @return the value
     */
    public java.util.List<String> getFqdns() {
        return fqdns;
    }

    /** This optional field will indicate that whether service is IPv6 enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isV6Enabled")
    private final Boolean isV6Enabled;

    /**
     * This optional field will indicate that whether service is IPv6 enabled.
     *
     * @return the value
     */
    public Boolean getIsV6Enabled() {
        return isV6Enabled;
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
        sb.append("PsaServiceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", fqdns=").append(String.valueOf(this.fqdns));
        sb.append(", isV6Enabled=").append(String.valueOf(this.isV6Enabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PsaServiceSummary)) {
            return false;
        }

        PsaServiceSummary other = (PsaServiceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.fqdns, other.fqdns)
                && java.util.Objects.equals(this.isV6Enabled, other.isV6Enabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.fqdns == null ? 43 : this.fqdns.hashCode());
        result = (result * PRIME) + (this.isV6Enabled == null ? 43 : this.isV6Enabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
