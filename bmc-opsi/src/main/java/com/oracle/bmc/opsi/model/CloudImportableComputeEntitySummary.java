/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * A compute host entity that can be imported into Operations Insights.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CloudImportableComputeEntitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloudImportableComputeEntitySummary extends ImportableComputeEntitySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("computeId")
        private String computeId;

        public Builder computeId(String computeId) {
            this.computeId = computeId;
            this.__explicitlySet__.add("computeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeDisplayName")
        private String computeDisplayName;

        public Builder computeDisplayName(String computeDisplayName) {
            this.computeDisplayName = computeDisplayName;
            this.__explicitlySet__.add("computeDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The host name. The host name is unique amongst the hosts managed by the same management agent.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The host name. The host name is unique amongst the hosts managed by the same management agent.
         * @param hostName the value to set
         * @return this builder
         **/
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * Platform type.
         * Supported platformType(s) for MACS-managed external host insight: [LINUX, SOLARIS, WINDOWS].
         * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
         * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX, WINDOWS, AIX, HP-UX].
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformType platformType;

        /**
         * Platform type.
         * Supported platformType(s) for MACS-managed external host insight: [LINUX, SOLARIS, WINDOWS].
         * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
         * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX, WINDOWS, AIX, HP-UX].
         *
         * @param platformType the value to set
         * @return this builder
         **/
        public Builder platformType(PlatformType platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudImportableComputeEntitySummary build() {
            CloudImportableComputeEntitySummary model =
                    new CloudImportableComputeEntitySummary(
                            this.computeId,
                            this.computeDisplayName,
                            this.compartmentId,
                            this.hostName,
                            this.platformType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudImportableComputeEntitySummary model) {
            if (model.wasPropertyExplicitlySet("computeId")) {
                this.computeId(model.getComputeId());
            }
            if (model.wasPropertyExplicitlySet("computeDisplayName")) {
                this.computeDisplayName(model.getComputeDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("platformType")) {
                this.platformType(model.getPlatformType());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CloudImportableComputeEntitySummary(
            String computeId,
            String computeDisplayName,
            String compartmentId,
            String hostName,
            PlatformType platformType) {
        super(computeId, computeDisplayName, compartmentId);
        this.hostName = hostName;
        this.platformType = platformType;
    }

    /**
     * The host name. The host name is unique amongst the hosts managed by the same management agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The host name. The host name is unique amongst the hosts managed by the same management agent.
     * @return the value
     **/
    public String getHostName() {
        return hostName;
    }

    /**
     * Platform type.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX, SOLARIS, WINDOWS].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX, WINDOWS, AIX, HP-UX].
     *
     **/
    public enum PlatformType {
        Linux("LINUX"),
        Solaris("SOLARIS"),
        Sunos("SUNOS"),
        Zlinux("ZLINUX"),
        Windows("WINDOWS"),
        Aix("AIX"),
        HpUx("HP_UX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlatformType.class);

        private final String value;
        private static java.util.Map<String, PlatformType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformType v : PlatformType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlatformType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlatformType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Platform type.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX, SOLARIS, WINDOWS].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX, WINDOWS, AIX, HP-UX].
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    private final PlatformType platformType;

    /**
     * Platform type.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX, SOLARIS, WINDOWS].
     * Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX, WINDOWS, AIX, HP-UX].
     *
     * @return the value
     **/
    public PlatformType getPlatformType() {
        return platformType;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CloudImportableComputeEntitySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", platformType=").append(String.valueOf(this.platformType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudImportableComputeEntitySummary)) {
            return false;
        }

        CloudImportableComputeEntitySummary other = (CloudImportableComputeEntitySummary) o;
        return java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        return result;
    }
}
