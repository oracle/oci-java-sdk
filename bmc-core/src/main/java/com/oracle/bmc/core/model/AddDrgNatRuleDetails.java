/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details used to add a DRG NAT rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddDrgNatRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddDrgNatRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "drgNatRulePriority",
        "originalSource",
        "translatedSource",
        "originalDestination",
        "translatedDestination"
    })
    public AddDrgNatRuleDetails(
            Long drgNatRulePriority,
            String originalSource,
            String translatedSource,
            String originalDestination,
            String translatedDestination) {
        super();
        this.drgNatRulePriority = drgNatRulePriority;
        this.originalSource = originalSource;
        this.translatedSource = translatedSource;
        this.originalDestination = originalDestination;
        this.translatedDestination = translatedDestination;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The priority associated with each DRG NAT rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("drgNatRulePriority")
        private Long drgNatRulePriority;

        /**
         * The priority associated with each DRG NAT rule.
         *
         * @param drgNatRulePriority the value to set
         * @return this builder
         */
        public Builder drgNatRulePriority(Long drgNatRulePriority) {
            this.drgNatRulePriority = drgNatRulePriority;
            this.__explicitlySet__.add("drgNatRulePriority");
            return this;
        }
        /**
         * Represents the range of IP addresses to match against when routing traffic. Original CIDR
         * range for Source NAT.
         *
         * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
         * 192.168.1.0/24}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("originalSource")
        private String originalSource;

        /**
         * Represents the range of IP addresses to match against when routing traffic. Original CIDR
         * range for Source NAT.
         *
         * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
         * 192.168.1.0/24}.
         *
         * @param originalSource the value to set
         * @return this builder
         */
        public Builder originalSource(String originalSource) {
            this.originalSource = originalSource;
            this.__explicitlySet__.add("originalSource");
            return this;
        }
        /**
         * Represents the range of IP addresses to match against when routing traffic. Translated
         * CIDR range for Source NAT.
         *
         * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
         * 192.168.1.0/24}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("translatedSource")
        private String translatedSource;

        /**
         * Represents the range of IP addresses to match against when routing traffic. Translated
         * CIDR range for Source NAT.
         *
         * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
         * 192.168.1.0/24}.
         *
         * @param translatedSource the value to set
         * @return this builder
         */
        public Builder translatedSource(String translatedSource) {
            this.translatedSource = translatedSource;
            this.__explicitlySet__.add("translatedSource");
            return this;
        }
        /**
         * Represents the range of IP addresses to match against when routing traffic. Original CIDR
         * range for Destination NAT.
         *
         * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
         * 192.168.1.0/24}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("originalDestination")
        private String originalDestination;

        /**
         * Represents the range of IP addresses to match against when routing traffic. Original CIDR
         * range for Destination NAT.
         *
         * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
         * 192.168.1.0/24}.
         *
         * @param originalDestination the value to set
         * @return this builder
         */
        public Builder originalDestination(String originalDestination) {
            this.originalDestination = originalDestination;
            this.__explicitlySet__.add("originalDestination");
            return this;
        }
        /**
         * Represents the range of IP addresses to match against when routing traffic. Translated
         * CIDR range for Destination NAT.
         *
         * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
         * 192.168.1.0/24}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("translatedDestination")
        private String translatedDestination;

        /**
         * Represents the range of IP addresses to match against when routing traffic. Translated
         * CIDR range for Destination NAT.
         *
         * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
         * 192.168.1.0/24}.
         *
         * @param translatedDestination the value to set
         * @return this builder
         */
        public Builder translatedDestination(String translatedDestination) {
            this.translatedDestination = translatedDestination;
            this.__explicitlySet__.add("translatedDestination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddDrgNatRuleDetails build() {
            AddDrgNatRuleDetails model =
                    new AddDrgNatRuleDetails(
                            this.drgNatRulePriority,
                            this.originalSource,
                            this.translatedSource,
                            this.originalDestination,
                            this.translatedDestination);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddDrgNatRuleDetails model) {
            if (model.wasPropertyExplicitlySet("drgNatRulePriority")) {
                this.drgNatRulePriority(model.getDrgNatRulePriority());
            }
            if (model.wasPropertyExplicitlySet("originalSource")) {
                this.originalSource(model.getOriginalSource());
            }
            if (model.wasPropertyExplicitlySet("translatedSource")) {
                this.translatedSource(model.getTranslatedSource());
            }
            if (model.wasPropertyExplicitlySet("originalDestination")) {
                this.originalDestination(model.getOriginalDestination());
            }
            if (model.wasPropertyExplicitlySet("translatedDestination")) {
                this.translatedDestination(model.getTranslatedDestination());
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

    /** The priority associated with each DRG NAT rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("drgNatRulePriority")
    private final Long drgNatRulePriority;

    /**
     * The priority associated with each DRG NAT rule.
     *
     * @return the value
     */
    public Long getDrgNatRulePriority() {
        return drgNatRulePriority;
    }

    /**
     * Represents the range of IP addresses to match against when routing traffic. Original CIDR
     * range for Source NAT.
     *
     * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
     * 192.168.1.0/24}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("originalSource")
    private final String originalSource;

    /**
     * Represents the range of IP addresses to match against when routing traffic. Original CIDR
     * range for Source NAT.
     *
     * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
     * 192.168.1.0/24}.
     *
     * @return the value
     */
    public String getOriginalSource() {
        return originalSource;
    }

    /**
     * Represents the range of IP addresses to match against when routing traffic. Translated CIDR
     * range for Source NAT.
     *
     * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
     * 192.168.1.0/24}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("translatedSource")
    private final String translatedSource;

    /**
     * Represents the range of IP addresses to match against when routing traffic. Translated CIDR
     * range for Source NAT.
     *
     * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
     * 192.168.1.0/24}.
     *
     * @return the value
     */
    public String getTranslatedSource() {
        return translatedSource;
    }

    /**
     * Represents the range of IP addresses to match against when routing traffic. Original CIDR
     * range for Destination NAT.
     *
     * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
     * 192.168.1.0/24}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("originalDestination")
    private final String originalDestination;

    /**
     * Represents the range of IP addresses to match against when routing traffic. Original CIDR
     * range for Destination NAT.
     *
     * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
     * 192.168.1.0/24}.
     *
     * @return the value
     */
    public String getOriginalDestination() {
        return originalDestination;
    }

    /**
     * Represents the range of IP addresses to match against when routing traffic. Translated CIDR
     * range for Destination NAT.
     *
     * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
     * 192.168.1.0/24}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("translatedDestination")
    private final String translatedDestination;

    /**
     * Represents the range of IP addresses to match against when routing traffic. Translated CIDR
     * range for Destination NAT.
     *
     * <p>Potential values: * An IPv4 address range in CIDR notation. For example: {@code
     * 192.168.1.0/24}.
     *
     * @return the value
     */
    public String getTranslatedDestination() {
        return translatedDestination;
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
        sb.append("AddDrgNatRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("drgNatRulePriority=").append(String.valueOf(this.drgNatRulePriority));
        sb.append(", originalSource=").append(String.valueOf(this.originalSource));
        sb.append(", translatedSource=").append(String.valueOf(this.translatedSource));
        sb.append(", originalDestination=").append(String.valueOf(this.originalDestination));
        sb.append(", translatedDestination=").append(String.valueOf(this.translatedDestination));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddDrgNatRuleDetails)) {
            return false;
        }

        AddDrgNatRuleDetails other = (AddDrgNatRuleDetails) o;
        return java.util.Objects.equals(this.drgNatRulePriority, other.drgNatRulePriority)
                && java.util.Objects.equals(this.originalSource, other.originalSource)
                && java.util.Objects.equals(this.translatedSource, other.translatedSource)
                && java.util.Objects.equals(this.originalDestination, other.originalDestination)
                && java.util.Objects.equals(this.translatedDestination, other.translatedDestination)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.drgNatRulePriority == null
                                ? 43
                                : this.drgNatRulePriority.hashCode());
        result =
                (result * PRIME)
                        + (this.originalSource == null ? 43 : this.originalSource.hashCode());
        result =
                (result * PRIME)
                        + (this.translatedSource == null ? 43 : this.translatedSource.hashCode());
        result =
                (result * PRIME)
                        + (this.originalDestination == null
                                ? 43
                                : this.originalDestination.hashCode());
        result =
                (result * PRIME)
                        + (this.translatedDestination == null
                                ? 43
                                : this.translatedDestination.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
