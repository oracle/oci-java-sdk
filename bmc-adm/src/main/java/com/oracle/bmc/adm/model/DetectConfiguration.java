/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * A configuration to define the constraints when detecting vulnerable dependencies. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DetectConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DetectConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "exclusions",
        "upgradePolicy",
        "maxPermissibleCvssV2Score",
        "maxPermissibleCvssV3Score",
        "maxPermissibleSeverity"
    })
    public DetectConfiguration(
            java.util.List<String> exclusions,
            UpgradePolicy upgradePolicy,
            Float maxPermissibleCvssV2Score,
            Float maxPermissibleCvssV3Score,
            ConfigSeverity maxPermissibleSeverity) {
        super();
        this.exclusions = exclusions;
        this.upgradePolicy = upgradePolicy;
        this.maxPermissibleCvssV2Score = maxPermissibleCvssV2Score;
        this.maxPermissibleCvssV3Score = maxPermissibleCvssV3Score;
        this.maxPermissibleSeverity = maxPermissibleSeverity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of dependencies to be ignored by the recommendation algorithm. The dependency
         * pattern is matched against the 'group:artifact:version' or the purl of a dependency. An
         * asterisk (*) at the end in the dependency pattern acts as a wildcard and matches zero or
         * more characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
        private java.util.List<String> exclusions;

        /**
         * The list of dependencies to be ignored by the recommendation algorithm. The dependency
         * pattern is matched against the 'group:artifact:version' or the purl of a dependency. An
         * asterisk (*) at the end in the dependency pattern acts as a wildcard and matches zero or
         * more characters.
         *
         * @param exclusions the value to set
         * @return this builder
         */
        public Builder exclusions(java.util.List<String> exclusions) {
            this.exclusions = exclusions;
            this.__explicitlySet__.add("exclusions");
            return this;
        }
        /**
         * The upgrade policy for recommendations. The {@code Nearest} upgrade policy upgrades a
         * dependency to the oldest version that meets both of the following criteria: it is newer
         * than the current version and it is not affected by a vulnerability.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("upgradePolicy")
        private UpgradePolicy upgradePolicy;

        /**
         * The upgrade policy for recommendations. The {@code Nearest} upgrade policy upgrades a
         * dependency to the oldest version that meets both of the following criteria: it is newer
         * than the current version and it is not affected by a vulnerability.
         *
         * @param upgradePolicy the value to set
         * @return this builder
         */
        public Builder upgradePolicy(UpgradePolicy upgradePolicy) {
            this.upgradePolicy = upgradePolicy;
            this.__explicitlySet__.add("upgradePolicy");
            return this;
        }
        /**
         * The maximum Common Vulnerability Scoring System Version 2 (CVSS V2) score. An artifact
         * with a CVSS V2 score below this value is not considered for patching.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxPermissibleCvssV2Score")
        private Float maxPermissibleCvssV2Score;

        /**
         * The maximum Common Vulnerability Scoring System Version 2 (CVSS V2) score. An artifact
         * with a CVSS V2 score below this value is not considered for patching.
         *
         * @param maxPermissibleCvssV2Score the value to set
         * @return this builder
         */
        public Builder maxPermissibleCvssV2Score(Float maxPermissibleCvssV2Score) {
            this.maxPermissibleCvssV2Score = maxPermissibleCvssV2Score;
            this.__explicitlySet__.add("maxPermissibleCvssV2Score");
            return this;
        }
        /**
         * The maximum Common Vulnerability Scoring System Version 3 (CVSS V3) score. An artifact
         * with a CVSS V3 score below this value is not considered for patching.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxPermissibleCvssV3Score")
        private Float maxPermissibleCvssV3Score;

        /**
         * The maximum Common Vulnerability Scoring System Version 3 (CVSS V3) score. An artifact
         * with a CVSS V3 score below this value is not considered for patching.
         *
         * @param maxPermissibleCvssV3Score the value to set
         * @return this builder
         */
        public Builder maxPermissibleCvssV3Score(Float maxPermissibleCvssV3Score) {
            this.maxPermissibleCvssV3Score = maxPermissibleCvssV3Score;
            this.__explicitlySet__.add("maxPermissibleCvssV3Score");
            return this;
        }
        /**
         * The maximum ADM Severity. An artifact with an ADM Severity below this value is not
         * considered for patching.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxPermissibleSeverity")
        private ConfigSeverity maxPermissibleSeverity;

        /**
         * The maximum ADM Severity. An artifact with an ADM Severity below this value is not
         * considered for patching.
         *
         * @param maxPermissibleSeverity the value to set
         * @return this builder
         */
        public Builder maxPermissibleSeverity(ConfigSeverity maxPermissibleSeverity) {
            this.maxPermissibleSeverity = maxPermissibleSeverity;
            this.__explicitlySet__.add("maxPermissibleSeverity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectConfiguration build() {
            DetectConfiguration model =
                    new DetectConfiguration(
                            this.exclusions,
                            this.upgradePolicy,
                            this.maxPermissibleCvssV2Score,
                            this.maxPermissibleCvssV3Score,
                            this.maxPermissibleSeverity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectConfiguration model) {
            if (model.wasPropertyExplicitlySet("exclusions")) {
                this.exclusions(model.getExclusions());
            }
            if (model.wasPropertyExplicitlySet("upgradePolicy")) {
                this.upgradePolicy(model.getUpgradePolicy());
            }
            if (model.wasPropertyExplicitlySet("maxPermissibleCvssV2Score")) {
                this.maxPermissibleCvssV2Score(model.getMaxPermissibleCvssV2Score());
            }
            if (model.wasPropertyExplicitlySet("maxPermissibleCvssV3Score")) {
                this.maxPermissibleCvssV3Score(model.getMaxPermissibleCvssV3Score());
            }
            if (model.wasPropertyExplicitlySet("maxPermissibleSeverity")) {
                this.maxPermissibleSeverity(model.getMaxPermissibleSeverity());
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
     * The list of dependencies to be ignored by the recommendation algorithm. The dependency
     * pattern is matched against the 'group:artifact:version' or the purl of a dependency. An
     * asterisk (*) at the end in the dependency pattern acts as a wildcard and matches zero or more
     * characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    private final java.util.List<String> exclusions;

    /**
     * The list of dependencies to be ignored by the recommendation algorithm. The dependency
     * pattern is matched against the 'group:artifact:version' or the purl of a dependency. An
     * asterisk (*) at the end in the dependency pattern acts as a wildcard and matches zero or more
     * characters.
     *
     * @return the value
     */
    public java.util.List<String> getExclusions() {
        return exclusions;
    }

    /**
     * The upgrade policy for recommendations. The {@code Nearest} upgrade policy upgrades a
     * dependency to the oldest version that meets both of the following criteria: it is newer than
     * the current version and it is not affected by a vulnerability.
     */
    public enum UpgradePolicy implements com.oracle.bmc.http.internal.BmcEnum {
        Nearest("NEAREST"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpgradePolicy.class);

        private final String value;
        private static java.util.Map<String, UpgradePolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (UpgradePolicy v : UpgradePolicy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpgradePolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpgradePolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpgradePolicy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The upgrade policy for recommendations. The {@code Nearest} upgrade policy upgrades a
     * dependency to the oldest version that meets both of the following criteria: it is newer than
     * the current version and it is not affected by a vulnerability.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upgradePolicy")
    private final UpgradePolicy upgradePolicy;

    /**
     * The upgrade policy for recommendations. The {@code Nearest} upgrade policy upgrades a
     * dependency to the oldest version that meets both of the following criteria: it is newer than
     * the current version and it is not affected by a vulnerability.
     *
     * @return the value
     */
    public UpgradePolicy getUpgradePolicy() {
        return upgradePolicy;
    }

    /**
     * The maximum Common Vulnerability Scoring System Version 2 (CVSS V2) score. An artifact with a
     * CVSS V2 score below this value is not considered for patching.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxPermissibleCvssV2Score")
    private final Float maxPermissibleCvssV2Score;

    /**
     * The maximum Common Vulnerability Scoring System Version 2 (CVSS V2) score. An artifact with a
     * CVSS V2 score below this value is not considered for patching.
     *
     * @return the value
     */
    public Float getMaxPermissibleCvssV2Score() {
        return maxPermissibleCvssV2Score;
    }

    /**
     * The maximum Common Vulnerability Scoring System Version 3 (CVSS V3) score. An artifact with a
     * CVSS V3 score below this value is not considered for patching.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxPermissibleCvssV3Score")
    private final Float maxPermissibleCvssV3Score;

    /**
     * The maximum Common Vulnerability Scoring System Version 3 (CVSS V3) score. An artifact with a
     * CVSS V3 score below this value is not considered for patching.
     *
     * @return the value
     */
    public Float getMaxPermissibleCvssV3Score() {
        return maxPermissibleCvssV3Score;
    }

    /**
     * The maximum ADM Severity. An artifact with an ADM Severity below this value is not considered
     * for patching.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxPermissibleSeverity")
    private final ConfigSeverity maxPermissibleSeverity;

    /**
     * The maximum ADM Severity. An artifact with an ADM Severity below this value is not considered
     * for patching.
     *
     * @return the value
     */
    public ConfigSeverity getMaxPermissibleSeverity() {
        return maxPermissibleSeverity;
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
        sb.append("DetectConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("exclusions=").append(String.valueOf(this.exclusions));
        sb.append(", upgradePolicy=").append(String.valueOf(this.upgradePolicy));
        sb.append(", maxPermissibleCvssV2Score=")
                .append(String.valueOf(this.maxPermissibleCvssV2Score));
        sb.append(", maxPermissibleCvssV3Score=")
                .append(String.valueOf(this.maxPermissibleCvssV3Score));
        sb.append(", maxPermissibleSeverity=").append(String.valueOf(this.maxPermissibleSeverity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectConfiguration)) {
            return false;
        }

        DetectConfiguration other = (DetectConfiguration) o;
        return java.util.Objects.equals(this.exclusions, other.exclusions)
                && java.util.Objects.equals(this.upgradePolicy, other.upgradePolicy)
                && java.util.Objects.equals(
                        this.maxPermissibleCvssV2Score, other.maxPermissibleCvssV2Score)
                && java.util.Objects.equals(
                        this.maxPermissibleCvssV3Score, other.maxPermissibleCvssV3Score)
                && java.util.Objects.equals(
                        this.maxPermissibleSeverity, other.maxPermissibleSeverity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.exclusions == null ? 43 : this.exclusions.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradePolicy == null ? 43 : this.upgradePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.maxPermissibleCvssV2Score == null
                                ? 43
                                : this.maxPermissibleCvssV2Score.hashCode());
        result =
                (result * PRIME)
                        + (this.maxPermissibleCvssV3Score == null
                                ? 43
                                : this.maxPermissibleCvssV3Score.hashCode());
        result =
                (result * PRIME)
                        + (this.maxPermissibleSeverity == null
                                ? 43
                                : this.maxPermissibleSeverity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
